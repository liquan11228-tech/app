package androidx.appcompat.widget;

import a.b.f;
import a.b.g;
import a.b.j;
import a.b.p.b1;
import a.b.p.c;
import a.g.j.k;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import android.widget.TextView;

/* loaded from: classes.dex */
public class ActionBarContextView extends a.b.p.a {
    public CharSequence j;
    public CharSequence k;
    public View l;
    public View m;
    public LinearLayout n;
    public TextView o;
    public TextView p;
    public int q;
    public int r;
    public boolean s;
    public int t;

    public class a implements View.OnClickListener {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ a.b.o.a f946b;

        public a(ActionBarContextView actionBarContextView, a.b.o.a aVar) {
            this.f946b = aVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f946b.c();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        int resourceId;
        int i = a.b.a.actionModeStyle;
        super(context, attributeSet, i);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.ActionMode, i, 0);
        int i2 = j.ActionMode_background;
        k.v(this, (!typedArrayObtainStyledAttributes.hasValue(i2) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(i2, 0)) == 0) ? typedArrayObtainStyledAttributes.getDrawable(i2) : a.b.l.a.a.b(context, resourceId));
        this.q = typedArrayObtainStyledAttributes.getResourceId(j.ActionMode_titleTextStyle, 0);
        this.r = typedArrayObtainStyledAttributes.getResourceId(j.ActionMode_subtitleTextStyle, 0);
        this.f = typedArrayObtainStyledAttributes.getLayoutDimension(j.ActionMode_height, 0);
        this.t = typedArrayObtainStyledAttributes.getResourceId(j.ActionMode_closeItemLayout, g.abc_action_mode_close_item_material);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void f(a.b.o.a r7) {
        /*
            r6 = this;
            android.view.View r0 = r6.l
            r1 = 0
            if (r0 != 0) goto L16
            android.content.Context r0 = r6.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            int r2 = r6.t
            android.view.View r0 = r0.inflate(r2, r6, r1)
            r6.l = r0
            goto L1e
        L16:
            android.view.ViewParent r0 = r0.getParent()
            if (r0 != 0) goto L21
            android.view.View r0 = r6.l
        L1e:
            r6.addView(r0)
        L21:
            android.view.View r0 = r6.l
            int r2 = a.b.f.action_mode_close_button
            android.view.View r0 = r0.findViewById(r2)
            androidx.appcompat.widget.ActionBarContextView$a r2 = new androidx.appcompat.widget.ActionBarContextView$a
            r2.<init>(r6, r7)
            r0.setOnClickListener(r2)
            android.view.Menu r7 = r7.e()
            a.b.o.i.g r7 = (a.b.o.i.g) r7
            a.b.p.c r0 = r6.f189e
            if (r0 == 0) goto L3e
            r0.e()
        L3e:
            a.b.p.c r0 = new a.b.p.c
            android.content.Context r2 = r6.getContext()
            r0.<init>(r2)
            r6.f189e = r0
            r2 = 1
            r0.m = r2
            r0.n = r2
            android.view.ViewGroup$LayoutParams r0 = new android.view.ViewGroup$LayoutParams
            r3 = -2
            r4 = -1
            r0.<init>(r3, r4)
            a.b.p.c r3 = r6.f189e
            android.content.Context r4 = r6.f187c
            r7.b(r3, r4)
            a.b.p.c r7 = r6.f189e
            a.b.o.i.n r3 = r7.i
            if (r3 != 0) goto L76
            android.view.LayoutInflater r4 = r7.f121e
            int r5 = r7.g
            android.view.View r1 = r4.inflate(r5, r6, r1)
            a.b.o.i.n r1 = (a.b.o.i.n) r1
            r7.i = r1
            a.b.o.i.g r4 = r7.f120d
            r1.c(r4)
            r7.h(r2)
        L76:
            a.b.o.i.n r1 = r7.i
            if (r3 == r1) goto L80
            r2 = r1
            androidx.appcompat.widget.ActionMenuView r2 = (androidx.appcompat.widget.ActionMenuView) r2
            r2.setPresenter(r7)
        L80:
            androidx.appcompat.widget.ActionMenuView r1 = (androidx.appcompat.widget.ActionMenuView) r1
            r6.f188d = r1
            r7 = 0
            a.g.j.k.v(r1, r7)
            androidx.appcompat.widget.ActionMenuView r7 = r6.f188d
            r6.addView(r7, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarContextView.f(a.b.o.a):void");
    }

    public final void g() {
        if (this.n == null) {
            LayoutInflater.from(getContext()).inflate(g.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.n = linearLayout;
            this.o = (TextView) linearLayout.findViewById(f.action_bar_title);
            this.p = (TextView) this.n.findViewById(f.action_bar_subtitle);
            if (this.q != 0) {
                this.o.setTextAppearance(getContext(), this.q);
            }
            if (this.r != 0) {
                this.p.setTextAppearance(getContext(), this.r);
            }
        }
        this.o.setText(this.j);
        this.p.setText(this.k);
        boolean z = !TextUtils.isEmpty(this.j);
        boolean z2 = !TextUtils.isEmpty(this.k);
        int i = 0;
        this.p.setVisibility(z2 ? 0 : 8);
        LinearLayout linearLayout2 = this.n;
        if (!z && !z2) {
            i = 8;
        }
        linearLayout2.setVisibility(i);
        if (this.n.getParent() == null) {
            addView(this.n);
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override // a.b.p.a
    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    @Override // a.b.p.a
    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    public CharSequence getSubtitle() {
        return this.k;
    }

    public CharSequence getTitle() {
        return this.j;
    }

    public void h() {
        removeAllViews();
        this.m = null;
        this.f188d = null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c cVar = this.f189e;
        if (cVar != null) {
            cVar.i();
            this.f189e.l();
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() != 32) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            return;
        }
        accessibilityEvent.setSource(this);
        accessibilityEvent.setClassName(ActionBarContextView.class.getName());
        accessibilityEvent.setPackageName(getContext().getPackageName());
        accessibilityEvent.setContentDescription(this.j);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean zA = b1.a(this);
        int paddingRight = zA ? (i3 - i) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
        View view = this.l;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.l.getLayoutParams();
            int i5 = zA ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i6 = zA ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int i7 = zA ? paddingRight - i5 : paddingRight + i5;
            int iD = i7 + d(this.l, i7, paddingTop, paddingTop2, zA);
            paddingRight = zA ? iD - i6 : iD + i6;
        }
        int iD2 = paddingRight;
        LinearLayout linearLayout = this.n;
        if (linearLayout != null && this.m == null && linearLayout.getVisibility() != 8) {
            iD2 += d(this.n, iD2, paddingTop, paddingTop2, zA);
        }
        int i8 = iD2;
        View view2 = this.m;
        if (view2 != null) {
            d(view2, i8, paddingTop, paddingTop2, zA);
        }
        int paddingLeft = zA ? getPaddingLeft() : (i3 - i) - getPaddingRight();
        ActionMenuView actionMenuView = this.f188d;
        if (actionMenuView != null) {
            d(actionMenuView, paddingLeft, paddingTop, paddingTop2, !zA);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            throw new IllegalStateException(ActionBarContextView.class.getSimpleName() + " can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
        }
        if (View.MeasureSpec.getMode(i2) == 0) {
            throw new IllegalStateException(ActionBarContextView.class.getSimpleName() + " can only be used with android:layout_height=\"wrap_content\"");
        }
        int size = View.MeasureSpec.getSize(i);
        int size2 = this.f;
        if (size2 <= 0) {
            size2 = View.MeasureSpec.getSize(i2);
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int iMin = size2 - paddingBottom;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMin, Integer.MIN_VALUE);
        View view = this.l;
        if (view != null) {
            int iC = c(view, paddingLeft, iMakeMeasureSpec, 0);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.l.getLayoutParams();
            paddingLeft = iC - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        ActionMenuView actionMenuView = this.f188d;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = c(this.f188d, paddingLeft, iMakeMeasureSpec, 0);
        }
        LinearLayout linearLayout = this.n;
        if (linearLayout != null && this.m == null) {
            if (this.s) {
                this.n.measure(View.MeasureSpec.makeMeasureSpec(0, 0), iMakeMeasureSpec);
                int measuredWidth = this.n.getMeasuredWidth();
                boolean z = measuredWidth <= paddingLeft;
                if (z) {
                    paddingLeft -= measuredWidth;
                }
                this.n.setVisibility(z ? 0 : 8);
            } else {
                paddingLeft = c(linearLayout, paddingLeft, iMakeMeasureSpec, 0);
            }
        }
        View view2 = this.m;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            int i3 = layoutParams.width != -2 ? 1073741824 : Integer.MIN_VALUE;
            int i4 = layoutParams.width;
            if (i4 >= 0) {
                paddingLeft = Math.min(i4, paddingLeft);
            }
            int i5 = layoutParams.height == -2 ? Integer.MIN_VALUE : 1073741824;
            int i6 = layoutParams.height;
            if (i6 >= 0) {
                iMin = Math.min(i6, iMin);
            }
            this.m.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i3), View.MeasureSpec.makeMeasureSpec(iMin, i5));
        }
        if (this.f <= 0) {
            int childCount = getChildCount();
            size2 = 0;
            for (int i7 = 0; i7 < childCount; i7++) {
                int measuredHeight = getChildAt(i7).getMeasuredHeight() + paddingBottom;
                if (measuredHeight > size2) {
                    size2 = measuredHeight;
                }
            }
        }
        setMeasuredDimension(size, size2);
    }

    @Override // a.b.p.a
    public void setContentHeight(int i) {
        this.f = i;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.m;
        if (view2 != null) {
            removeView(view2);
        }
        this.m = view;
        if (view != null && (linearLayout = this.n) != null) {
            removeView(linearLayout);
            this.n = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.k = charSequence;
        g();
    }

    public void setTitle(CharSequence charSequence) {
        this.j = charSequence;
        g();
    }

    public void setTitleOptional(boolean z) {
        if (z != this.s) {
            requestLayout();
        }
        this.s = z;
    }

    @Override // a.b.p.a, android.view.View
    public /* bridge */ /* synthetic */ void setVisibility(int i) {
        super.setVisibility(i);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
