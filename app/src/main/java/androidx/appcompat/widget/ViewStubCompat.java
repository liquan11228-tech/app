package androidx.appcompat.widget;

import a.b.j;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class ViewStubCompat extends View {

    /* renamed from: b, reason: collision with root package name */
    public int f1002b;

    /* renamed from: c, reason: collision with root package name */
    public int f1003c;

    /* renamed from: d, reason: collision with root package name */
    public WeakReference<View> f1004d;

    /* renamed from: e, reason: collision with root package name */
    public LayoutInflater f1005e;
    public a f;

    public interface a {
        void a(ViewStubCompat viewStubCompat, View view);
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f1002b = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.ViewStubCompat, 0, 0);
        this.f1003c = typedArrayObtainStyledAttributes.getResourceId(j.ViewStubCompat_android_inflatedId, -1);
        this.f1002b = typedArrayObtainStyledAttributes.getResourceId(j.ViewStubCompat_android_layout, 0);
        setId(typedArrayObtainStyledAttributes.getResourceId(j.ViewStubCompat_android_id, -1));
        typedArrayObtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }

    public View a() {
        ViewParent parent = getParent();
        if (!(parent instanceof ViewGroup)) {
            throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
        }
        if (this.f1002b == 0) {
            throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        LayoutInflater layoutInflaterFrom = this.f1005e;
        if (layoutInflaterFrom == null) {
            layoutInflaterFrom = LayoutInflater.from(getContext());
        }
        View viewInflate = layoutInflaterFrom.inflate(this.f1002b, viewGroup, false);
        int i = this.f1003c;
        if (i != -1) {
            viewInflate.setId(i);
        }
        int iIndexOfChild = viewGroup.indexOfChild(this);
        viewGroup.removeViewInLayout(this);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            viewGroup.addView(viewInflate, iIndexOfChild, layoutParams);
        } else {
            viewGroup.addView(viewInflate, iIndexOfChild);
        }
        this.f1004d = new WeakReference<>(viewInflate);
        a aVar = this.f;
        if (aVar != null) {
            aVar.a(this, viewInflate);
        }
        return viewInflate;
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.View
    @SuppressLint({"MissingSuperCall"})
    public void draw(Canvas canvas) {
    }

    public int getInflatedId() {
        return this.f1003c;
    }

    public LayoutInflater getLayoutInflater() {
        return this.f1005e;
    }

    public int getLayoutResource() {
        return this.f1002b;
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setInflatedId(int i) {
        this.f1003c = i;
    }

    public void setLayoutInflater(LayoutInflater layoutInflater) {
        this.f1005e = layoutInflater;
    }

    public void setLayoutResource(int i) {
        this.f1002b = i;
    }

    public void setOnInflateListener(a aVar) {
        this.f = aVar;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        WeakReference<View> weakReference = this.f1004d;
        if (weakReference != null) {
            View view = weakReference.get();
            if (view == null) {
                throw new IllegalStateException("setVisibility called on un-referenced view");
            }
            view.setVisibility(i);
            return;
        }
        super.setVisibility(i);
        if (i == 0 || i == 4) {
            a();
        }
    }
}
