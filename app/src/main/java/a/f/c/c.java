package a.f.c;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Arrays;
import java.util.HashMap;

/* loaded from: classes.dex */
public abstract class c extends View {

    /* renamed from: b, reason: collision with root package name */
    public int[] f531b;

    /* renamed from: c, reason: collision with root package name */
    public int f532c;

    /* renamed from: d, reason: collision with root package name */
    public Context f533d;

    /* renamed from: e, reason: collision with root package name */
    public a.f.b.i.g f534e;
    public boolean f;
    public String g;
    public HashMap<Integer, String> h;

    public c(Context context) throws IllegalAccessException, Resources.NotFoundException, IllegalArgumentException {
        super(context);
        this.f531b = new int[32];
        this.f = false;
        this.h = new HashMap<>();
        this.f533d = context;
        e(null);
    }

    public final void a(String str) throws IllegalAccessException, Resources.NotFoundException, IllegalArgumentException {
        if (str == null || str.length() == 0 || this.f533d == null) {
            return;
        }
        String strTrim = str.trim();
        if (getParent() instanceof ConstraintLayout) {
        }
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        int identifier = 0;
        if (isInEditMode() && constraintLayout != null) {
            Object objC = constraintLayout.c(0, strTrim);
            if (objC instanceof Integer) {
                identifier = ((Integer) objC).intValue();
            }
        }
        if (identifier == 0 && constraintLayout != null) {
            identifier = d(constraintLayout, strTrim);
        }
        if (identifier == 0) {
            try {
                identifier = j.class.getField(strTrim).getInt(null);
            } catch (Exception unused) {
            }
        }
        if (identifier == 0) {
            identifier = this.f533d.getResources().getIdentifier(strTrim, "id", this.f533d.getPackageName());
        }
        if (identifier != 0) {
            this.h.put(Integer.valueOf(identifier), strTrim);
            b(identifier);
        }
    }

    public final void b(int i) {
        if (i == getId()) {
            return;
        }
        int i2 = this.f532c + 1;
        int[] iArr = this.f531b;
        if (i2 > iArr.length) {
            this.f531b = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.f531b;
        int i3 = this.f532c;
        iArr2[i3] = i;
        this.f532c = i3 + 1;
    }

    public void c() {
        ViewParent parent = getParent();
        if (parent == null || !(parent instanceof ConstraintLayout)) {
            return;
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) parent;
        int visibility = getVisibility();
        float elevation = getElevation();
        for (int i = 0; i < this.f532c; i++) {
            View viewD = constraintLayout.d(this.f531b[i]);
            if (viewD != null) {
                viewD.setVisibility(visibility);
                if (elevation > 0.0f) {
                    viewD.setTranslationZ(viewD.getTranslationZ() + elevation);
                }
            }
        }
    }

    public final int d(ConstraintLayout constraintLayout, String str) throws Resources.NotFoundException {
        Resources resources;
        if (str == null || constraintLayout == null || (resources = this.f533d.getResources()) == null) {
            return 0;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            if (childAt.getId() != -1) {
                String resourceEntryName = null;
                try {
                    resourceEntryName = resources.getResourceEntryName(childAt.getId());
                } catch (Resources.NotFoundException unused) {
                }
                if (str.equals(resourceEntryName)) {
                    return childAt.getId();
                }
            }
        }
        return 0;
    }

    public void e(AttributeSet attributeSet) throws IllegalAccessException, Resources.NotFoundException, IllegalArgumentException {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, k.ConstraintLayout_Layout);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == k.ConstraintLayout_Layout_constraint_referenced_ids) {
                    String string = typedArrayObtainStyledAttributes.getString(index);
                    this.g = string;
                    setIds(string);
                }
            }
        }
    }

    public void f() {
    }

    public void g() {
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f531b, this.f532c);
    }

    public void h() {
    }

    public void i() {
        if (this.f534e == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.a) {
            ((ConstraintLayout.a) layoutParams).m0 = (a.f.b.i.d) this.f534e;
        }
    }

    @Override // android.view.View
    public void onAttachedToWindow() throws IllegalAccessException, Resources.NotFoundException, IllegalArgumentException {
        super.onAttachedToWindow();
        String str = this.g;
        if (str != null) {
            setIds(str);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        if (this.f) {
            super.onMeasure(i, i2);
        } else {
            setMeasuredDimension(0, 0);
        }
    }

    public void setIds(String str) throws IllegalAccessException, Resources.NotFoundException, IllegalArgumentException {
        this.g = str;
        if (str == null) {
            return;
        }
        int i = 0;
        this.f532c = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i);
            if (iIndexOf == -1) {
                a(str.substring(i));
                return;
            } else {
                a(str.substring(i, iIndexOf));
                i = iIndexOf + 1;
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.g = null;
        this.f532c = 0;
        for (int i : iArr) {
            b(i);
        }
    }
}
