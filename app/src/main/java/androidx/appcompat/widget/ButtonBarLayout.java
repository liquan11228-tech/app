package androidx.appcompat.widget;

import a.b.f;
import a.b.j;
import a.g.j.k;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;

/* loaded from: classes.dex */
public class ButtonBarLayout extends LinearLayout {

    /* renamed from: b, reason: collision with root package name */
    public boolean f959b;

    /* renamed from: c, reason: collision with root package name */
    public int f960c;

    /* renamed from: d, reason: collision with root package name */
    public int f961d;

    public ButtonBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f960c = -1;
        this.f961d = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.ButtonBarLayout);
        k.t(this, context, j.ButtonBarLayout, attributeSet, typedArrayObtainStyledAttributes, 0, 0);
        this.f959b = typedArrayObtainStyledAttributes.getBoolean(j.ButtonBarLayout_allowStacking, true);
        typedArrayObtainStyledAttributes.recycle();
    }

    private void setStacked(boolean z) {
        setOrientation(z ? 1 : 0);
        setGravity(z ? 5 : 80);
        View viewFindViewById = findViewById(f.spacer);
        if (viewFindViewById != null) {
            viewFindViewById.setVisibility(z ? 8 : 4);
        }
        for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
            bringChildToFront(getChildAt(childCount));
        }
    }

    public final int a(int i) {
        int childCount = getChildCount();
        while (i < childCount) {
            if (getChildAt(i).getVisibility() == 0) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public final boolean b() {
        return getOrientation() == 1;
    }

    @Override // android.view.View
    public int getMinimumHeight() {
        return Math.max(this.f961d, super.getMinimumHeight());
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int iMakeMeasureSpec;
        boolean z;
        int size = View.MeasureSpec.getSize(i);
        int paddingBottom = 0;
        if (this.f959b) {
            if (size > this.f960c && b()) {
                setStacked(false);
            }
            this.f960c = size;
        }
        if (b() || View.MeasureSpec.getMode(i) != 1073741824) {
            iMakeMeasureSpec = i;
            z = false;
        } else {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
            z = true;
        }
        super.onMeasure(iMakeMeasureSpec, i2);
        if (this.f959b && !b()) {
            if ((getMeasuredWidthAndState() & (-16777216)) == 16777216) {
                setStacked(true);
                z = true;
            }
        }
        if (z) {
            super.onMeasure(i, i2);
        }
        int iA = a(0);
        if (iA >= 0) {
            View childAt = getChildAt(iA);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight() + getPaddingTop() + layoutParams.topMargin + layoutParams.bottomMargin + 0;
            if (b()) {
                int iA2 = a(iA + 1);
                paddingBottom = iA2 >= 0 ? getChildAt(iA2).getPaddingTop() + ((int) (getResources().getDisplayMetrics().density * 16.0f)) + measuredHeight : measuredHeight;
            } else {
                paddingBottom = getPaddingBottom() + measuredHeight;
            }
        }
        if (k.g(this) != paddingBottom) {
            setMinimumHeight(paddingBottom);
        }
    }

    public void setAllowStacking(boolean z) {
        if (this.f959b != z) {
            this.f959b = z;
            if (!z && getOrientation() == 1) {
                setStacked(false);
            }
            requestLayout();
        }
    }
}
