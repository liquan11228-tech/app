package androidx.appcompat.widget;

import a.b.k.r;
import a.b.o.i.m;
import a.b.p.c0;
import a.b.p.d0;
import a.g.j.f;
import a.g.j.g;
import a.g.j.h;
import a.g.j.k;
import a.g.j.s;
import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;

@SuppressLint({"UnknownNullness"})
/* loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements c0, f, g {
    public static final int[] G = {a.b.a.actionBarSize, R.attr.windowContentOverlay};
    public OverScroller A;
    public ViewPropertyAnimator B;
    public final AnimatorListenerAdapter C;
    public final Runnable D;
    public final Runnable E;
    public final h F;

    /* renamed from: b */
    public int f947b;

    /* renamed from: c */
    public int f948c;

    /* renamed from: d */
    public ContentFrameLayout f949d;

    /* renamed from: e */
    public ActionBarContainer f950e;
    public d0 f;
    public Drawable g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public int m;
    public int n;
    public final Rect o;
    public final Rect p;
    public final Rect q;
    public final Rect r;
    public final Rect s;
    public final Rect t;
    public final Rect u;
    public s v;
    public s w;
    public s x;
    public s y;
    public d z;

    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.B = null;
            actionBarOverlayLayout.l = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.B = null;
            actionBarOverlayLayout.l = false;
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionBarOverlayLayout.this.q();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.B = actionBarOverlayLayout.f950e.animate().translationY(0.0f).setListener(ActionBarOverlayLayout.this.C);
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionBarOverlayLayout.this.q();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.B = actionBarOverlayLayout.f950e.animate().translationY(-ActionBarOverlayLayout.this.f950e.getHeight()).setListener(ActionBarOverlayLayout.this.C);
        }
    }

    public interface d {
    }

    public static class e extends ViewGroup.MarginLayoutParams {
        public e(int i, int i2) {
            super(i, i2);
        }

        public e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f948c = 0;
        this.o = new Rect();
        this.p = new Rect();
        this.q = new Rect();
        this.r = new Rect();
        this.s = new Rect();
        this.t = new Rect();
        this.u = new Rect();
        s sVar = s.f714b;
        this.v = sVar;
        this.w = sVar;
        this.x = sVar;
        this.y = sVar;
        this.C = new a();
        this.D = new b();
        this.E = new c();
        r(context);
        this.F = new h();
    }

    @Override // a.b.p.c0
    public boolean a() {
        s();
        return this.f.a();
    }

    @Override // a.b.p.c0
    public void b(Menu menu, m.a aVar) {
        s();
        this.f.b(menu, aVar);
    }

    @Override // a.b.p.c0
    public boolean c() {
        s();
        return this.f.c();
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e;
    }

    @Override // a.b.p.c0
    public void d() {
        s();
        this.f.d();
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int translationY;
        super.draw(canvas);
        if (this.g == null || this.h) {
            return;
        }
        if (this.f950e.getVisibility() == 0) {
            translationY = (int) (this.f950e.getTranslationY() + this.f950e.getBottom() + 0.5f);
        } else {
            translationY = 0;
        }
        this.g.setBounds(0, translationY, getWidth(), this.g.getIntrinsicHeight() + translationY);
        this.g.draw(canvas);
    }

    @Override // a.b.p.c0
    public boolean e() {
        s();
        return this.f.e();
    }

    @Override // a.b.p.c0
    public boolean f() {
        s();
        return this.f.f();
    }

    @Override // android.view.View
    public boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // a.b.p.c0
    public boolean g() {
        s();
        return this.f.g();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new e(-1, -1);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new e(layoutParams);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f950e;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        h hVar = this.F;
        return hVar.f691b | hVar.f690a;
    }

    public CharSequence getTitle() {
        s();
        return this.f.getTitle();
    }

    @Override // a.b.p.c0
    public void h(int i) {
        s();
        if (i == 2) {
            this.f.l();
        } else if (i == 5) {
            this.f.r();
        } else {
            if (i != 109) {
                return;
            }
            setOverlayMode(true);
        }
    }

    @Override // a.g.j.f
    public void i(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    @Override // a.b.p.c0
    public void j() {
        s();
        this.f.h();
    }

    @Override // a.g.j.g
    public void k(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (i5 == 0) {
            onNestedScroll(view, i, i2, i3, i4);
        }
    }

    @Override // a.g.j.f
    public void l(View view, int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            onNestedScroll(view, i, i2, i3, i4);
        }
    }

    @Override // a.g.j.f
    public void m(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // a.g.j.f
    public void n(View view, int i, int i2, int[] iArr, int i3) {
        if (i3 == 0) {
            onNestedPreScroll(view, i, i2, iArr);
        }
    }

    @Override // a.g.j.f
    public boolean o(View view, View view2, int i, int i2) {
        return i2 == 0 && onStartNestedScroll(view, view2, i);
    }

    @Override // android.view.View
    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        s();
        if (windowInsets == null) {
            throw null;
        }
        s sVar = new s(windowInsets);
        boolean zP = p(this.f950e, new Rect(sVar.b(), sVar.d(), sVar.c(), sVar.a()), true, true, false, true);
        k.b(this, sVar, this.o);
        Rect rect = this.o;
        s sVarG = sVar.f715a.g(rect.left, rect.top, rect.right, rect.bottom);
        this.v = sVarG;
        boolean z = true;
        if (!this.w.equals(sVarG)) {
            this.w = this.v;
            zP = true;
        }
        if (this.p.equals(this.o)) {
            z = zP;
        } else {
            this.p.set(this.o);
        }
        if (z) {
            requestLayout();
        }
        return sVar.f715a.a().f715a.c().f715a.b().g();
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        r(getContext());
        k.s(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        q();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin + paddingLeft;
                int i7 = ((ViewGroup.MarginLayoutParams) eVar).topMargin + paddingTop;
                childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int measuredHeight;
        s sVarA;
        s();
        measureChildWithMargins(this.f950e, i, 0, i2, 0);
        e eVar = (e) this.f950e.getLayoutParams();
        int iMax = Math.max(0, this.f950e.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) eVar).leftMargin + ((ViewGroup.MarginLayoutParams) eVar).rightMargin);
        int iMax2 = Math.max(0, this.f950e.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar).topMargin + ((ViewGroup.MarginLayoutParams) eVar).bottomMargin);
        int iCombineMeasuredStates = View.combineMeasuredStates(0, this.f950e.getMeasuredState());
        boolean z = (k.j(this) & 256) != 0;
        if (z) {
            measuredHeight = this.f947b;
            if (this.j && this.f950e.getTabContainer() != null) {
                measuredHeight += this.f947b;
            }
        } else {
            measuredHeight = this.f950e.getVisibility() != 8 ? this.f950e.getMeasuredHeight() : 0;
        }
        this.q.set(this.o);
        s sVar = this.v;
        this.x = sVar;
        if (this.i || z) {
            a.g.e.b bVarA = a.g.e.b.a(this.x.b(), this.x.d() + measuredHeight, this.x.c(), this.x.a() + 0);
            s sVar2 = this.x;
            s.c bVar = Build.VERSION.SDK_INT >= 29 ? new s.b(sVar2) : new s.a(sVar2);
            bVar.c(bVarA);
            sVarA = bVar.a();
        } else {
            Rect rect = this.q;
            rect.top += measuredHeight;
            rect.bottom += 0;
            sVarA = sVar.f715a.g(0, measuredHeight, 0, 0);
        }
        this.x = sVarA;
        p(this.f949d, this.q, true, true, true, true);
        if (!this.y.equals(this.x)) {
            s sVar3 = this.x;
            this.y = sVar3;
            ContentFrameLayout contentFrameLayout = this.f949d;
            WindowInsets windowInsetsG = sVar3.g();
            if (windowInsetsG != null && !contentFrameLayout.dispatchApplyWindowInsets(windowInsetsG).equals(windowInsetsG)) {
                new s(windowInsetsG);
            }
        }
        measureChildWithMargins(this.f949d, i, 0, i2, 0);
        e eVar2 = (e) this.f949d.getLayoutParams();
        int iMax3 = Math.max(iMax, this.f949d.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) eVar2).leftMargin + ((ViewGroup.MarginLayoutParams) eVar2).rightMargin);
        int iMax4 = Math.max(iMax2, this.f949d.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar2).topMargin + ((ViewGroup.MarginLayoutParams) eVar2).bottomMargin);
        int iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.f949d.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + iMax3, getSuggestedMinimumWidth()), i, iCombineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + iMax4, getSuggestedMinimumHeight()), i2, iCombineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (!this.k || !z) {
            return false;
        }
        this.A.fling(0, 0, 0, (int) f2, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.A.getFinalY() > this.f950e.getHeight()) {
            q();
            this.E.run();
        } else {
            q();
            this.D.run();
        }
        this.l = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        int i5 = this.m + i2;
        this.m = i5;
        setActionBarHideOffset(i5);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i) {
        r rVar;
        a.b.o.g gVar;
        this.F.f690a = i;
        this.m = getActionBarHideOffset();
        q();
        d dVar = this.z;
        if (dVar == null || (gVar = (rVar = (r) dVar).u) == null) {
            return;
        }
        gVar.a();
        rVar.u = null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.f950e.getVisibility() != 0) {
            return false;
        }
        return this.k;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        if (this.k && !this.l) {
            if (this.m <= this.f950e.getHeight()) {
                q();
                postDelayed(this.D, 600L);
            } else {
                q();
                postDelayed(this.E, 600L);
            }
        }
        d dVar = this.z;
        if (dVar != null && ((r) dVar) == null) {
            throw null;
        }
    }

    @Override // android.view.View
    public void onWindowSystemUiVisibilityChanged(int i) {
        super.onWindowSystemUiVisibilityChanged(i);
        s();
        int i2 = this.n ^ i;
        this.n = i;
        boolean z = (i & 4) == 0;
        boolean z2 = (i & 256) != 0;
        d dVar = this.z;
        if (dVar != null) {
            ((r) dVar).p = !z2;
            if (z || !z2) {
                r rVar = (r) this.z;
                if (rVar.r) {
                    rVar.r = false;
                    rVar.n(true);
                }
            } else {
                r rVar2 = (r) dVar;
                if (!rVar2.r) {
                    rVar2.r = true;
                    rVar2.n(true);
                }
            }
        }
        if ((i2 & 256) == 0 || this.z == null) {
            return;
        }
        k.s(this);
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.f948c = i;
        d dVar = this.z;
        if (dVar != null) {
            ((r) dVar).o = i;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean p(android.view.View r3, android.graphics.Rect r4, boolean r5, boolean r6, boolean r7, boolean r8) {
        /*
            r2 = this;
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            androidx.appcompat.widget.ActionBarOverlayLayout$e r3 = (androidx.appcompat.widget.ActionBarOverlayLayout.e) r3
            r0 = 1
            if (r5 == 0) goto L13
            int r5 = r3.leftMargin
            int r1 = r4.left
            if (r5 == r1) goto L13
            r3.leftMargin = r1
            r5 = r0
            goto L14
        L13:
            r5 = 0
        L14:
            if (r6 == 0) goto L1f
            int r6 = r3.topMargin
            int r1 = r4.top
            if (r6 == r1) goto L1f
            r3.topMargin = r1
            r5 = r0
        L1f:
            if (r8 == 0) goto L2a
            int r6 = r3.rightMargin
            int r8 = r4.right
            if (r6 == r8) goto L2a
            r3.rightMargin = r8
            r5 = r0
        L2a:
            if (r7 == 0) goto L35
            int r6 = r3.bottomMargin
            int r4 = r4.bottom
            if (r6 == r4) goto L35
            r3.bottomMargin = r4
            goto L36
        L35:
            r0 = r5
        L36:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarOverlayLayout.p(android.view.View, android.graphics.Rect, boolean, boolean, boolean, boolean):boolean");
    }

    public void q() {
        removeCallbacks(this.D);
        removeCallbacks(this.E);
        ViewPropertyAnimator viewPropertyAnimator = this.B;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public final void r(Context context) {
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(G);
        this.f947b = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(1);
        this.g = drawable;
        setWillNotDraw(drawable == null);
        typedArrayObtainStyledAttributes.recycle();
        this.h = context.getApplicationInfo().targetSdkVersion < 19;
        this.A = new OverScroller(context);
    }

    public void s() {
        d0 wrapper;
        if (this.f949d == null) {
            this.f949d = (ContentFrameLayout) findViewById(a.b.f.action_bar_activity_content);
            this.f950e = (ActionBarContainer) findViewById(a.b.f.action_bar_container);
            KeyEvent.Callback callbackFindViewById = findViewById(a.b.f.action_bar);
            if (callbackFindViewById instanceof d0) {
                wrapper = (d0) callbackFindViewById;
            } else {
                if (!(callbackFindViewById instanceof Toolbar)) {
                    StringBuilder sbE = b.a.a.a.a.e("Can't make a decor toolbar out of ");
                    sbE.append(callbackFindViewById.getClass().getSimpleName());
                    throw new IllegalStateException(sbE.toString());
                }
                wrapper = ((Toolbar) callbackFindViewById).getWrapper();
            }
            this.f = wrapper;
        }
    }

    public void setActionBarHideOffset(int i) {
        q();
        this.f950e.setTranslationY(-Math.max(0, Math.min(i, this.f950e.getHeight())));
    }

    public void setActionBarVisibilityCallback(d dVar) {
        this.z = dVar;
        if (getWindowToken() != null) {
            ((r) this.z).o = this.f948c;
            int i = this.n;
            if (i != 0) {
                onWindowSystemUiVisibilityChanged(i);
                k.s(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z) {
        this.j = z;
    }

    public void setHideOnContentScrollEnabled(boolean z) {
        if (z != this.k) {
            this.k = z;
            if (z) {
                return;
            }
            q();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i) {
        s();
        this.f.setIcon(i);
    }

    public void setIcon(Drawable drawable) {
        s();
        this.f.setIcon(drawable);
    }

    public void setLogo(int i) {
        s();
        this.f.n(i);
    }

    public void setOverlayMode(boolean z) {
        this.i = z;
        this.h = z && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    public void setShowingForActionMode(boolean z) {
    }

    public void setUiOptions(int i) {
    }

    @Override // a.b.p.c0
    public void setWindowCallback(Window.Callback callback) {
        s();
        this.f.setWindowCallback(callback);
    }

    @Override // a.b.p.c0
    public void setWindowTitle(CharSequence charSequence) {
        s();
        this.f.setWindowTitle(charSequence);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
