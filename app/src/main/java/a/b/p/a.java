package a.b.p;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.ActionMenuView;

/* loaded from: classes.dex */
public abstract class a extends ViewGroup {

    /* renamed from: b, reason: collision with root package name */
    public final C0004a f186b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f187c;

    /* renamed from: d, reason: collision with root package name */
    public ActionMenuView f188d;

    /* renamed from: e, reason: collision with root package name */
    public c f189e;
    public int f;
    public a.g.j.o g;
    public boolean h;
    public boolean i;

    /* renamed from: a.b.p.a$a, reason: collision with other inner class name */
    public class C0004a implements a.g.j.p {

        /* renamed from: a, reason: collision with root package name */
        public boolean f190a = false;

        /* renamed from: b, reason: collision with root package name */
        public int f191b;

        public C0004a() {
        }

        @Override // a.g.j.p
        public void a(View view) {
            if (this.f190a) {
                return;
            }
            a aVar = a.this;
            aVar.g = null;
            a.super.setVisibility(this.f191b);
        }

        @Override // a.g.j.p
        public void b(View view) {
            a.super.setVisibility(0);
            this.f190a = false;
        }

        @Override // a.g.j.p
        public void c(View view) {
            this.f190a = true;
        }
    }

    public a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public a(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f186b = new C0004a();
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(a.b.a.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.f187c = context;
        } else {
            this.f187c = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }

    public int c(View view, int i, int i2, int i3) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), i2);
        return Math.max(0, (i - view.getMeasuredWidth()) - i3);
    }

    public int d(View view, int i, int i2, int i3, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i4 = ((i3 - measuredHeight) / 2) + i2;
        if (z) {
            view.layout(i - measuredWidth, i4, i, measuredHeight + i4);
        } else {
            view.layout(i, i4, i + measuredWidth, measuredHeight + i4);
        }
        return z ? -measuredWidth : measuredWidth;
    }

    public a.g.j.o e(int i, long j) {
        a.g.j.o oVar = this.g;
        if (oVar != null) {
            oVar.b();
        }
        if (i != 0) {
            a.g.j.o oVarA = a.g.j.k.a(this);
            oVarA.a(0.0f);
            oVarA.c(j);
            C0004a c0004a = this.f186b;
            a.this.g = oVarA;
            c0004a.f191b = i;
            View view = oVarA.f706a.get();
            if (view != null) {
                oVarA.e(view, c0004a);
            }
            return oVarA;
        }
        if (getVisibility() != 0) {
            setAlpha(0.0f);
        }
        a.g.j.o oVarA2 = a.g.j.k.a(this);
        oVarA2.a(1.0f);
        oVarA2.c(j);
        C0004a c0004a2 = this.f186b;
        a.this.g = oVarA2;
        c0004a2.f191b = i;
        View view2 = oVarA2.f706a.get();
        if (view2 != null) {
            oVarA2.e(view2, c0004a2);
        }
        return oVarA2;
    }

    public int getAnimatedVisibility() {
        return this.g != null ? this.f186b.f191b : getVisibility();
    }

    public int getContentHeight() {
        return this.f;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, a.b.j.ActionBar, a.b.a.actionBarStyle, 0);
        setContentHeight(typedArrayObtainStyledAttributes.getLayoutDimension(a.b.j.ActionBar_height, 0));
        typedArrayObtainStyledAttributes.recycle();
        c cVar = this.f189e;
        if (cVar != null) {
            Configuration configuration2 = cVar.f119c.getResources().getConfiguration();
            int i = configuration2.screenWidthDp;
            int i2 = configuration2.screenHeightDp;
            cVar.q = (configuration2.smallestScreenWidthDp > 600 || i > 600 || (i > 960 && i2 > 720) || (i > 720 && i2 > 960)) ? 5 : (i >= 500 || (i > 640 && i2 > 480) || (i > 480 && i2 > 640)) ? 4 : i >= 360 ? 3 : 2;
            a.b.o.i.g gVar = cVar.f120d;
            if (gVar != null) {
                gVar.q(true);
            }
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.i = false;
        }
        if (!this.i) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.i = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.i = false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.h = false;
        }
        if (!this.h) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.h = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.h = false;
        }
        return true;
    }

    public abstract void setContentHeight(int i);

    @Override // android.view.View
    public void setVisibility(int i) {
        if (i != getVisibility()) {
            a.g.j.o oVar = this.g;
            if (oVar != null) {
                oVar.b();
            }
            super.setVisibility(i);
        }
    }
}
