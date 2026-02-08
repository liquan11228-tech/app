package androidx.core.widget;

import a.b.k.h;
import a.g.j.e;
import a.g.j.f;
import a.g.j.g;
import a.g.j.h;
import a.g.j.k;
import a.g.j.t.b;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import android.widget.ScrollView;
import androidx.appcompat.app.AlertController;

/* loaded from: classes.dex */
public class NestedScrollView extends FrameLayout implements g {
    public static final a B = new a();
    public static final int[] C = {R.attr.fillViewport};
    public b A;

    /* renamed from: b, reason: collision with root package name */
    public long f1037b;

    /* renamed from: c, reason: collision with root package name */
    public final Rect f1038c;

    /* renamed from: d, reason: collision with root package name */
    public OverScroller f1039d;

    /* renamed from: e, reason: collision with root package name */
    public EdgeEffect f1040e;
    public EdgeEffect f;
    public int g;
    public boolean h;
    public boolean i;
    public View j;
    public boolean k;
    public VelocityTracker l;
    public boolean m;
    public boolean n;
    public int o;
    public int p;
    public int q;
    public int r;
    public final int[] s;
    public final int[] t;
    public int u;
    public int v;
    public c w;
    public final h x;
    public final e y;
    public float z;

    public static class a extends a.g.j.a {
        @Override // a.g.j.a
        public void a(View view, AccessibilityEvent accessibilityEvent) {
            this.f676a.onInitializeAccessibilityEvent(view, accessibilityEvent);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            accessibilityEvent.setClassName(ScrollView.class.getName());
            accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
            accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
            accessibilityEvent.setMaxScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setMaxScrollY(nestedScrollView.getScrollRange());
        }

        @Override // a.g.j.a
        public void b(View view, a.g.j.t.b bVar) {
            int scrollRange;
            this.f676a.onInitializeAccessibilityNodeInfo(view, bVar.f729a);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            bVar.f729a.setClassName(ScrollView.class.getName());
            if (!nestedScrollView.isEnabled() || (scrollRange = nestedScrollView.getScrollRange()) <= 0) {
                return;
            }
            bVar.f729a.setScrollable(true);
            if (nestedScrollView.getScrollY() > 0) {
                bVar.a(b.a.f733e);
                bVar.a(b.a.f);
            }
            if (nestedScrollView.getScrollY() < scrollRange) {
                bVar.a(b.a.f732d);
                bVar.a(b.a.g);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:25:0x0075 A[RETURN] */
        @Override // a.g.j.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean c(android.view.View r4, int r5, android.os.Bundle r6) {
            /*
                r3 = this;
                boolean r6 = super.c(r4, r5, r6)
                r0 = 1
                if (r6 == 0) goto L8
                return r0
            L8:
                androidx.core.widget.NestedScrollView r4 = (androidx.core.widget.NestedScrollView) r4
                boolean r6 = r4.isEnabled()
                r1 = 0
                if (r6 != 0) goto L12
                return r1
            L12:
                r6 = 4096(0x1000, float:5.74E-42)
                r2 = 250(0xfa, float:3.5E-43)
                if (r5 == r6) goto L53
                r6 = 8192(0x2000, float:1.148E-41)
                if (r5 == r6) goto L27
                r6 = 16908344(0x1020038, float:2.3877386E-38)
                if (r5 == r6) goto L27
                r6 = 16908346(0x102003a, float:2.3877392E-38)
                if (r5 == r6) goto L53
                return r1
            L27:
                int r5 = r4.getHeight()
                int r6 = r4.getPaddingBottom()
                int r5 = r5 - r6
                int r6 = r4.getPaddingTop()
                int r5 = r5 - r6
                int r6 = r4.getScrollY()
                int r6 = r6 - r5
                int r5 = java.lang.Math.max(r6, r1)
                int r6 = r4.getScrollY()
                if (r5 == r6) goto L52
            L44:
                int r6 = r4.getScrollX()
                int r1 = r1 - r6
                int r6 = r4.getScrollY()
                int r5 = r5 - r6
                r4.A(r1, r5, r2, r0)
                return r0
            L52:
                return r1
            L53:
                int r5 = r4.getHeight()
                int r6 = r4.getPaddingBottom()
                int r5 = r5 - r6
                int r6 = r4.getPaddingTop()
                int r5 = r5 - r6
                int r6 = r4.getScrollY()
                int r6 = r6 + r5
                int r5 = r4.getScrollRange()
                int r5 = java.lang.Math.min(r6, r5)
                int r6 = r4.getScrollY()
                if (r5 == r6) goto L75
                goto L44
            L75:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.a.c(android.view.View, int, android.os.Bundle):boolean");
        }
    }

    public interface b {
    }

    public static class c extends View.BaseSavedState {
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        public int f1041b;

        public class a implements Parcelable.Creator<c> {
            @Override // android.os.Parcelable.Creator
            public c createFromParcel(Parcel parcel) {
                return new c(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public c[] newArray(int i) {
                return new c[i];
            }
        }

        public c(Parcel parcel) {
            super(parcel);
            this.f1041b = parcel.readInt();
        }

        public c(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            StringBuilder sbE = b.a.a.a.a.e("HorizontalScrollView.SavedState{");
            sbE.append(Integer.toHexString(System.identityHashCode(this)));
            sbE.append(" scrollPosition=");
            sbE.append(this.f1041b);
            sbE.append("}");
            return sbE.toString();
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f1041b);
        }
    }

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f1038c = new Rect();
        this.h = true;
        this.i = false;
        this.j = null;
        this.k = false;
        this.n = true;
        this.r = -1;
        this.s = new int[2];
        this.t = new int[2];
        this.f1039d = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.o = viewConfiguration.getScaledTouchSlop();
        this.p = viewConfiguration.getScaledMinimumFlingVelocity();
        this.q = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C, 0, 0);
        setFillViewport(typedArrayObtainStyledAttributes.getBoolean(0, false));
        typedArrayObtainStyledAttributes.recycle();
        this.x = new h();
        this.y = new e(this);
        setNestedScrollingEnabled(true);
        k.u(this, B);
    }

    public static int c(int i, int i2, int i3) {
        if (i2 >= i3 || i < 0) {
            return 0;
        }
        return i2 + i > i3 ? i3 - i2 : i;
    }

    private float getVerticalScrollFactorCompat() {
        if (this.z == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
            this.z = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.z;
    }

    public static boolean r(View view, View view2) {
        if (view == view2) {
            return true;
        }
        Object parent = view.getParent();
        return (parent instanceof ViewGroup) && r((View) parent, view2);
    }

    public final void A(int i, int i2, int i3, boolean z) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.f1037b > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            this.f1039d.startScroll(getScrollX(), scrollY, 0, Math.max(0, Math.min(i2 + scrollY, Math.max(0, height - height2))) - scrollY, i3);
            x(z);
        } else {
            if (!this.f1039d.isFinished()) {
                a();
            }
            scrollBy(i, i2);
        }
        this.f1037b = AnimationUtils.currentAnimationTimeMillis();
    }

    public boolean B(int i, int i2) {
        boolean zOnStartNestedScroll;
        e eVar = this.y;
        if (!(eVar.b(i2) != null)) {
            if (!eVar.f688d) {
                return false;
            }
            View view = eVar.f687c;
            for (ViewParent parent = eVar.f687c.getParent(); parent != null; parent = parent.getParent()) {
                View view2 = eVar.f687c;
                boolean z = parent instanceof f;
                if (z) {
                    zOnStartNestedScroll = ((f) parent).o(view, view2, i, i2);
                } else if (i2 == 0) {
                    try {
                        zOnStartNestedScroll = parent.onStartNestedScroll(view, view2, i);
                    } catch (AbstractMethodError unused) {
                        String str = "ViewParent " + parent + " does not implement interface method onStartNestedScroll";
                    }
                } else {
                    zOnStartNestedScroll = false;
                }
                if (zOnStartNestedScroll) {
                    if (i2 == 0) {
                        eVar.f685a = parent;
                    } else if (i2 == 1) {
                        eVar.f686b = parent;
                    }
                    View view3 = eVar.f687c;
                    if (z) {
                        ((f) parent).i(view, view3, i, i2);
                    } else if (i2 == 0) {
                        try {
                            parent.onNestedScrollAccepted(view, view3, i);
                        } catch (AbstractMethodError unused2) {
                            String str2 = "ViewParent " + parent + " does not implement interface method onNestedScrollAccepted";
                        }
                    }
                } else {
                    if (parent instanceof View) {
                        view = parent;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public void C(int i) {
        e eVar = this.y;
        ViewParent viewParentB = eVar.b(i);
        if (viewParentB != null) {
            View view = eVar.f687c;
            if (viewParentB instanceof f) {
                ((f) viewParentB).m(view, i);
            } else if (i == 0) {
                try {
                    viewParentB.onStopNestedScroll(view);
                } catch (AbstractMethodError unused) {
                    String str = "ViewParent " + viewParentB + " does not implement interface method onStopNestedScroll";
                }
            }
            if (i == 0) {
                eVar.f685a = null;
            } else {
                if (i != 1) {
                    return;
                }
                eVar.f686b = null;
            }
        }
    }

    public final void a() {
        this.f1039d.abortAnimation();
        C(1);
    }

    @Override // android.view.ViewGroup
    public void addView(View view) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, i);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, i, layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, layoutParams);
    }

    public boolean b(int i) {
        View viewFindFocus = findFocus();
        if (viewFindFocus == this) {
            viewFindFocus = null;
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, i);
        int maxScrollAmount = getMaxScrollAmount();
        if (viewFindNextFocus == null || !s(viewFindNextFocus, maxScrollAmount, getHeight())) {
            if (i == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getHeight() + getScrollY()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            f(maxScrollAmount);
        } else {
            viewFindNextFocus.getDrawingRect(this.f1038c);
            offsetDescendantRectToMyCoords(viewFindNextFocus, this.f1038c);
            f(d(this.f1038c));
            viewFindNextFocus.requestFocus(i);
        }
        if (viewFindFocus != null && viewFindFocus.isFocused() && (!s(viewFindFocus, 0, getHeight()))) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    @Override // android.view.View
    public int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View
    public int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View
    public int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    @Override // android.view.View
    public void computeScroll() {
        EdgeEffect edgeEffect;
        if (this.f1039d.isFinished()) {
            return;
        }
        this.f1039d.computeScrollOffset();
        int currY = this.f1039d.getCurrY();
        int i = currY - this.v;
        this.v = currY;
        int[] iArr = this.t;
        boolean z = false;
        iArr[1] = 0;
        e(0, i, iArr, null, 1);
        int i2 = i - this.t[1];
        int scrollRange = getScrollRange();
        if (i2 != 0) {
            int scrollY = getScrollY();
            v(0, i2, getScrollX(), scrollY, 0, scrollRange, 0, 0);
            int scrollY2 = getScrollY() - scrollY;
            int i3 = i2 - scrollY2;
            int[] iArr2 = this.t;
            iArr2[1] = 0;
            this.y.a(0, scrollY2, 0, i3, this.s, 1, iArr2);
            i2 = i3 - this.t[1];
        }
        if (i2 != 0) {
            int overScrollMode = getOverScrollMode();
            if (overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0)) {
                z = true;
            }
            if (z) {
                g();
                if (i2 < 0) {
                    if (this.f1040e.isFinished()) {
                        edgeEffect = this.f1040e;
                        edgeEffect.onAbsorb((int) this.f1039d.getCurrVelocity());
                    }
                } else if (this.f.isFinished()) {
                    edgeEffect = this.f;
                    edgeEffect.onAbsorb((int) this.f1039d.getCurrVelocity());
                }
            }
            a();
        }
        if (this.f1039d.isFinished()) {
            C(1);
        } else {
            k.p(this);
        }
    }

    @Override // android.view.View
    public int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View
    public int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int iMax = Math.max(0, bottom - height);
        return scrollY < 0 ? bottom - scrollY : scrollY > iMax ? bottom + (scrollY - iMax) : bottom;
    }

    public int d(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i2 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i - verticalFadingEdgeLength : i;
        if (rect.bottom > i2 && rect.top > scrollY) {
            return Math.min((rect.height() > height ? rect.top - scrollY : rect.bottom - i2) + 0, (childAt.getBottom() + layoutParams.bottomMargin) - i);
        }
        if (rect.top >= scrollY || rect.bottom >= i2) {
            return 0;
        }
        return Math.max(rect.height() > height ? 0 - (i2 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || h(keyEvent);
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        ViewParent viewParentB;
        e eVar = this.y;
        if (!eVar.f688d || (viewParentB = eVar.b(0)) == null) {
            return false;
        }
        return h.i.J(viewParentB, eVar.f687c, f, f2, z);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f, float f2) {
        ViewParent viewParentB;
        e eVar = this.y;
        if (!eVar.f688d || (viewParentB = eVar.b(0)) == null) {
            return false;
        }
        return h.i.K(viewParentB, eVar.f687c, f, f2);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return e(i, i2, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.y.a(i, i2, i3, i4, iArr, 0, null);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int paddingLeft;
        super.draw(canvas);
        if (this.f1040e != null) {
            int scrollY = getScrollY();
            int paddingLeft2 = 0;
            if (!this.f1040e.isFinished()) {
                int iSave = canvas.save();
                int width = getWidth();
                int height = getHeight();
                int iMin = Math.min(0, scrollY);
                if (getClipToPadding()) {
                    width -= getPaddingRight() + getPaddingLeft();
                    paddingLeft = getPaddingLeft() + 0;
                } else {
                    paddingLeft = 0;
                }
                if (getClipToPadding()) {
                    height -= getPaddingBottom() + getPaddingTop();
                    iMin += getPaddingTop();
                }
                canvas.translate(paddingLeft, iMin);
                this.f1040e.setSize(width, height);
                if (this.f1040e.draw(canvas)) {
                    k.p(this);
                }
                canvas.restoreToCount(iSave);
            }
            if (this.f.isFinished()) {
                return;
            }
            int iSave2 = canvas.save();
            int width2 = getWidth();
            int height2 = getHeight();
            int iMax = Math.max(getScrollRange(), scrollY) + height2;
            if (getClipToPadding()) {
                width2 -= getPaddingRight() + getPaddingLeft();
                paddingLeft2 = 0 + getPaddingLeft();
            }
            if (getClipToPadding()) {
                height2 -= getPaddingBottom() + getPaddingTop();
                iMax -= getPaddingBottom();
            }
            canvas.translate(paddingLeft2 - width2, iMax);
            canvas.rotate(180.0f, width2, 0.0f);
            this.f.setSize(width2, height2);
            if (this.f.draw(canvas)) {
                k.p(this);
            }
            canvas.restoreToCount(iSave2);
        }
    }

    public boolean e(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        ViewParent viewParentB;
        int i4;
        int i5;
        int[] iArr3;
        e eVar = this.y;
        if (!eVar.f688d || (viewParentB = eVar.b(i3)) == null) {
            return false;
        }
        if (i == 0 && i2 == 0) {
            if (iArr2 == null) {
                return false;
            }
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
        if (iArr2 != null) {
            eVar.f687c.getLocationInWindow(iArr2);
            i4 = iArr2[0];
            i5 = iArr2[1];
        } else {
            i4 = 0;
            i5 = 0;
        }
        if (iArr == null) {
            if (eVar.f689e == null) {
                eVar.f689e = new int[2];
            }
            iArr3 = eVar.f689e;
        } else {
            iArr3 = iArr;
        }
        iArr3[0] = 0;
        iArr3[1] = 0;
        h.i.L(viewParentB, eVar.f687c, i, i2, iArr3, i3);
        if (iArr2 != null) {
            eVar.f687c.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i4;
            iArr2[1] = iArr2[1] - i5;
        }
        return (iArr3[0] == 0 && iArr3[1] == 0) ? false : true;
    }

    public final void f(int i) {
        if (i != 0) {
            if (this.n) {
                A(0, i, 250, false);
            } else {
                scrollBy(0, i);
            }
        }
    }

    public final void g() {
        if (getOverScrollMode() == 2) {
            this.f1040e = null;
            this.f = null;
        } else if (this.f1040e == null) {
            Context context = getContext();
            this.f1040e = new EdgeEffect(context);
            this.f = new EdgeEffect(context);
        }
    }

    @Override // android.view.View
    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + layoutParams.bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (getHeight() * 0.5f);
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        a.g.j.h hVar = this.x;
        return hVar.f691b | hVar.f690a;
    }

    public int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    @Override // android.view.View
    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean h(android.view.KeyEvent r7) {
        /*
            Method dump skipped, instructions count: 251
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.h(android.view.KeyEvent):boolean");
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return q(0);
    }

    @Override // a.g.j.f
    public void i(View view, View view2, int i, int i2) {
        a.g.j.h hVar = this.x;
        if (i2 == 1) {
            hVar.f691b = i;
        } else {
            hVar.f690a = i;
        }
        B(2, i2);
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return this.y.f688d;
    }

    public void j(int i) {
        if (getChildCount() > 0) {
            this.f1039d.fling(getScrollX(), getScrollY(), 0, i, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            x(true);
        }
    }

    @Override // a.g.j.g
    public void k(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        t(i4, i5, iArr);
    }

    @Override // a.g.j.f
    public void l(View view, int i, int i2, int i3, int i4, int i5) {
        t(i4, i5, null);
    }

    @Override // a.g.j.f
    public void m(View view, int i) {
        a.g.j.h hVar = this.x;
        if (i == 1) {
            hVar.f691b = 0;
        } else {
            hVar.f690a = 0;
        }
        C(i);
    }

    @Override // android.view.ViewGroup
    public void measureChild(View view, int i, int i2) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        view.measure(FrameLayout.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft(), layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    public void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(FrameLayout.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    @Override // a.g.j.f
    public void n(View view, int i, int i2, int[] iArr, int i3) {
        e(i, i2, iArr, null, i3);
    }

    @Override // a.g.j.f
    public boolean o(View view, View view2, int i, int i2) {
        return (i & 2) != 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.i = false;
    }

    @Override // android.view.View
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 2) != 0 && motionEvent.getAction() == 8 && !this.k) {
            float axisValue = motionEvent.getAxisValue(9);
            if (axisValue != 0.0f) {
                int verticalScrollFactorCompat = (int) (axisValue * getVerticalScrollFactorCompat());
                int scrollRange = getScrollRange();
                int scrollY = getScrollY();
                int i = scrollY - verticalScrollFactorCompat;
                if (i < 0) {
                    scrollRange = 0;
                } else if (i <= scrollRange) {
                    scrollRange = i;
                }
                if (scrollRange != scrollY) {
                    super.scrollTo(getScrollX(), scrollRange);
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c3  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r12) {
        /*
            Method dump skipped, instructions count: 251
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int measuredHeight = 0;
        this.h = false;
        View view = this.j;
        if (view != null && r(view, this)) {
            z(this.j);
        }
        this.j = null;
        if (!this.i) {
            if (this.w != null) {
                scrollTo(getScrollX(), this.w.f1041b);
                this.w = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                measuredHeight = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            }
            int paddingTop = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int iC = c(scrollY, paddingTop, measuredHeight);
            if (iC != scrollY) {
                scrollTo(getScrollX(), iC);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.i = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.m && View.MeasureSpec.getMode(i2) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(FrameLayout.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (z) {
            return false;
        }
        dispatchNestedFling(0.0f, f2, true);
        j((int) f2);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f, float f2) {
        return dispatchNestedPreFling(f, f2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        e(i, i2, iArr, null, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        t(i4, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i) {
        this.x.f690a = i;
        B(2, 0);
    }

    @Override // android.view.View
    public void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        super.scrollTo(i, i2);
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (i == 2) {
            i = 130;
        } else if (i == 1) {
            i = 33;
        }
        FocusFinder focusFinder = FocusFinder.getInstance();
        View viewFindNextFocus = rect == null ? focusFinder.findNextFocus(this, null, i) : focusFinder.findNextFocusFromRect(this, rect, i);
        if (viewFindNextFocus == null || (true ^ s(viewFindNextFocus, 0, getHeight()))) {
            return false;
        }
        return viewFindNextFocus.requestFocus(i, rect);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof c)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        c cVar = (c) parcelable;
        super.onRestoreInstanceState(cVar.getSuperState());
        this.w = cVar;
        requestLayout();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        c cVar = new c(super.onSaveInstanceState());
        cVar.f1041b = getScrollY();
        return cVar;
    }

    @Override // android.view.View
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        b bVar = this.A;
        if (bVar != null) {
            a.b.k.b bVar2 = (a.b.k.b) bVar;
            AlertController.c(this, bVar2.f3a, bVar2.f4b);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        View viewFindFocus = findFocus();
        if (viewFindFocus == null || this == viewFindFocus || !s(viewFindFocus, 0, i4)) {
            return;
        }
        viewFindFocus.getDrawingRect(this.f1038c);
        offsetDescendantRectToMyCoords(viewFindFocus, this.f1038c);
        f(d(this.f1038c));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i) {
        return (i & 2) != 0;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        this.x.f690a = 0;
        C(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:93:0x0210 A[PHI: r0
  0x0210: PHI (r0v19 android.widget.EdgeEffect) = (r0v17 android.widget.EdgeEffect), (r0v64 android.widget.EdgeEffect) binds: [B:92:0x020e, B:30:0x008e] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r23) {
        /*
            Method dump skipped, instructions count: 602
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public boolean p(int i) {
        int childCount;
        boolean z = i == 130;
        int height = getHeight();
        Rect rect = this.f1038c;
        rect.top = 0;
        rect.bottom = height;
        if (z && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            this.f1038c.bottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
            Rect rect2 = this.f1038c;
            rect2.top = rect2.bottom - height;
        }
        Rect rect3 = this.f1038c;
        return y(i, rect3.top, rect3.bottom);
    }

    public boolean q(int i) {
        return this.y.b(i) != null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (this.h) {
            this.j = view2;
        } else {
            z(view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int iD = d(rect);
        boolean z2 = iD != 0;
        if (z2) {
            if (z) {
                scrollBy(0, iD);
            } else {
                A(0, iD, 250, false);
            }
        }
        return z2;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        if (z) {
            w();
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        this.h = true;
        super.requestLayout();
    }

    public final boolean s(View view, int i, int i2) {
        view.getDrawingRect(this.f1038c);
        offsetDescendantRectToMyCoords(view, this.f1038c);
        return this.f1038c.bottom + i >= getScrollY() && this.f1038c.top - i <= getScrollY() + i2;
    }

    @Override // android.view.View
    public void scrollTo(int i, int i2) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int iC = c(i, width, width2);
            int iC2 = c(i2, height, height2);
            if (iC == getScrollX() && iC2 == getScrollY()) {
                return;
            }
            super.scrollTo(iC, iC2);
        }
    }

    public void setFillViewport(boolean z) {
        if (z != this.m) {
            this.m = z;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        e eVar = this.y;
        if (eVar.f688d) {
            k.A(eVar.f687c);
        }
        eVar.f688d = z;
    }

    public void setOnScrollChangeListener(b bVar) {
        this.A = bVar;
    }

    public void setSmoothScrollingEnabled(boolean z) {
        this.n = z;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i) {
        return B(i, 0);
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        C(0);
    }

    public final void t(int i, int i2, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.y.a(0, scrollY2, 0, i - scrollY2, null, i2, iArr);
    }

    public final void u(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.r) {
            int i = actionIndex == 0 ? 1 : 0;
            this.g = (int) motionEvent.getY(i);
            this.r = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.l;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public boolean v(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        boolean z;
        boolean z2;
        int overScrollMode = getOverScrollMode();
        boolean z3 = computeHorizontalScrollRange() > computeHorizontalScrollExtent();
        boolean z4 = computeVerticalScrollRange() > computeVerticalScrollExtent();
        boolean z5 = overScrollMode == 0 || (overScrollMode == 1 && z3);
        boolean z6 = overScrollMode == 0 || (overScrollMode == 1 && z4);
        int i9 = i3 + i;
        int i10 = !z5 ? 0 : i7;
        int i11 = i4 + i2;
        int i12 = !z6 ? 0 : i8;
        int i13 = -i10;
        int i14 = i10 + i5;
        int i15 = -i12;
        int i16 = i12 + i6;
        if (i9 > i14) {
            i9 = i14;
            z = true;
        } else if (i9 < i13) {
            z = true;
            i9 = i13;
        } else {
            z = false;
        }
        if (i11 > i16) {
            i11 = i16;
            z2 = true;
        } else if (i11 < i15) {
            z2 = true;
            i11 = i15;
        } else {
            z2 = false;
        }
        if (z2 && !q(1)) {
            this.f1039d.springBack(i9, i11, 0, 0, 0, getScrollRange());
        }
        onOverScrolled(i9, i11, z, z2);
        return z || z2;
    }

    public final void w() {
        VelocityTracker velocityTracker = this.l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.l = null;
        }
    }

    public final void x(boolean z) {
        if (z) {
            B(2, 1);
        } else {
            C(1);
        }
        this.v = getScrollY();
        k.p(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean y(int r18, int r19, int r20) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r20
            int r4 = r17.getHeight()
            int r5 = r17.getScrollY()
            int r4 = r4 + r5
            r8 = 33
            if (r1 != r8) goto L17
            r8 = 1
            goto L18
        L17:
            r8 = 0
        L18:
            r9 = 2
            java.util.ArrayList r9 = r0.getFocusables(r9)
            int r10 = r9.size()
            r11 = 0
            r12 = 0
            r13 = 0
        L24:
            if (r12 >= r10) goto L6c
            java.lang.Object r14 = r9.get(r12)
            android.view.View r14 = (android.view.View) r14
            int r15 = r14.getTop()
            int r6 = r14.getBottom()
            if (r2 >= r6) goto L69
            if (r15 >= r3) goto L69
            if (r2 >= r15) goto L3f
            if (r6 >= r3) goto L3f
            r16 = 1
            goto L41
        L3f:
            r16 = 0
        L41:
            if (r11 != 0) goto L47
            r11 = r14
            r13 = r16
            goto L69
        L47:
            if (r8 == 0) goto L4f
            int r7 = r11.getTop()
            if (r15 < r7) goto L57
        L4f:
            if (r8 != 0) goto L59
            int r7 = r11.getBottom()
            if (r6 <= r7) goto L59
        L57:
            r6 = 1
            goto L5a
        L59:
            r6 = 0
        L5a:
            if (r13 == 0) goto L61
            if (r16 == 0) goto L69
            if (r6 == 0) goto L69
            goto L68
        L61:
            if (r16 == 0) goto L66
            r11 = r14
            r13 = 1
            goto L69
        L66:
            if (r6 == 0) goto L69
        L68:
            r11 = r14
        L69:
            int r12 = r12 + 1
            goto L24
        L6c:
            if (r11 != 0) goto L6f
            r11 = r0
        L6f:
            if (r2 < r5) goto L75
            if (r3 > r4) goto L75
            r6 = 0
            goto L7f
        L75:
            if (r8 == 0) goto L79
            int r2 = r2 - r5
            goto L7b
        L79:
            int r2 = r3 - r4
        L7b:
            r0.f(r2)
            r6 = 1
        L7f:
            android.view.View r2 = r17.findFocus()
            if (r11 == r2) goto L88
            r11.requestFocus(r1)
        L88:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.y(int, int, int):boolean");
    }

    public final void z(View view) {
        view.getDrawingRect(this.f1038c);
        offsetDescendantRectToMyCoords(view, this.f1038c);
        int iD = d(this.f1038c);
        if (iD != 0) {
            scrollBy(0, iD);
        }
    }
}
