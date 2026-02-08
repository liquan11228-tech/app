package androidx.appcompat.widget;

import a.b.j;
import a.b.k.a;
import a.b.o.i.i;
import a.b.o.i.m;
import a.b.o.i.r;
import a.b.p.b1;
import a.b.p.d0;
import a.b.p.l;
import a.b.p.n;
import a.b.p.p0;
import a.b.p.x0;
import a.b.p.z;
import a.b.p.z0;
import a.g.j.k;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class Toolbar extends ViewGroup {
    public ColorStateList A;
    public ColorStateList B;
    public boolean C;
    public boolean D;
    public final ArrayList<View> E;
    public final ArrayList<View> F;
    public final int[] G;
    public f H;
    public final ActionMenuView.e I;
    public z0 J;
    public a.b.p.c K;
    public d L;
    public boolean M;
    public final Runnable N;

    /* renamed from: b */
    public ActionMenuView f989b;

    /* renamed from: c */
    public TextView f990c;

    /* renamed from: d */
    public TextView f991d;

    /* renamed from: e */
    public ImageButton f992e;
    public ImageView f;
    public Drawable g;
    public CharSequence h;
    public ImageButton i;
    public View j;
    public Context k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;
    public int r;
    public int s;
    public int t;
    public p0 u;
    public int v;
    public int w;
    public int x;
    public CharSequence y;
    public CharSequence z;

    public class a implements ActionMenuView.e {
        public a() {
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Toolbar.this.u();
        }
    }

    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            d dVar = Toolbar.this.L;
            i iVar = dVar == null ? null : dVar.f997c;
            if (iVar != null) {
                iVar.collapseActionView();
            }
        }
    }

    public class d implements m {

        /* renamed from: b */
        public a.b.o.i.g f996b;

        /* renamed from: c */
        public i f997c;

        public d() {
        }

        @Override // a.b.o.i.m
        public void b(a.b.o.i.g gVar, boolean z) {
        }

        @Override // a.b.o.i.m
        public boolean c(a.b.o.i.g gVar, i iVar) {
            Toolbar.this.c();
            ViewParent parent = Toolbar.this.i.getParent();
            Toolbar toolbar = Toolbar.this;
            if (parent != toolbar) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(toolbar.i);
                }
                Toolbar toolbar2 = Toolbar.this;
                toolbar2.addView(toolbar2.i);
            }
            Toolbar.this.j = iVar.getActionView();
            this.f997c = iVar;
            ViewParent parent2 = Toolbar.this.j.getParent();
            Toolbar toolbar3 = Toolbar.this;
            if (parent2 != toolbar3) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(toolbar3.j);
                }
                e eVarGenerateDefaultLayoutParams = Toolbar.this.generateDefaultLayoutParams();
                Toolbar toolbar4 = Toolbar.this;
                eVarGenerateDefaultLayoutParams.f2a = 8388611 | (toolbar4.o & 112);
                eVarGenerateDefaultLayoutParams.f999b = 2;
                toolbar4.j.setLayoutParams(eVarGenerateDefaultLayoutParams);
                Toolbar toolbar5 = Toolbar.this;
                toolbar5.addView(toolbar5.j);
            }
            Toolbar toolbar6 = Toolbar.this;
            int childCount = toolbar6.getChildCount();
            while (true) {
                childCount--;
                if (childCount < 0) {
                    break;
                }
                View childAt = toolbar6.getChildAt(childCount);
                if (((e) childAt.getLayoutParams()).f999b != 2 && childAt != toolbar6.f989b) {
                    toolbar6.removeViewAt(childCount);
                    toolbar6.F.add(childAt);
                }
            }
            Toolbar.this.requestLayout();
            iVar.C = true;
            iVar.n.q(false);
            KeyEvent.Callback callback = Toolbar.this.j;
            if (callback instanceof a.b.o.b) {
                ((a.b.o.b) callback).a();
            }
            return true;
        }

        @Override // a.b.o.i.m
        public void d(m.a aVar) {
        }

        @Override // a.b.o.i.m
        public boolean f(r rVar) {
            return false;
        }

        @Override // a.b.o.i.m
        public boolean g() {
            return false;
        }

        @Override // a.b.o.i.m
        public void h(boolean z) {
            if (this.f997c != null) {
                a.b.o.i.g gVar = this.f996b;
                boolean z2 = false;
                if (gVar != null) {
                    int size = gVar.size();
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            break;
                        }
                        if (this.f996b.getItem(i) == this.f997c) {
                            z2 = true;
                            break;
                        }
                        i++;
                    }
                }
                if (z2) {
                    return;
                }
                k(this.f996b, this.f997c);
            }
        }

        @Override // a.b.o.i.m
        public void j(Context context, a.b.o.i.g gVar) {
            i iVar;
            a.b.o.i.g gVar2 = this.f996b;
            if (gVar2 != null && (iVar = this.f997c) != null) {
                gVar2.d(iVar);
            }
            this.f996b = gVar;
        }

        @Override // a.b.o.i.m
        public boolean k(a.b.o.i.g gVar, i iVar) {
            KeyEvent.Callback callback = Toolbar.this.j;
            if (callback instanceof a.b.o.b) {
                ((a.b.o.b) callback).d();
            }
            Toolbar toolbar = Toolbar.this;
            toolbar.removeView(toolbar.j);
            Toolbar toolbar2 = Toolbar.this;
            toolbar2.removeView(toolbar2.i);
            Toolbar toolbar3 = Toolbar.this;
            toolbar3.j = null;
            int size = toolbar3.F.size();
            while (true) {
                size--;
                if (size < 0) {
                    toolbar3.F.clear();
                    this.f997c = null;
                    Toolbar.this.requestLayout();
                    iVar.C = false;
                    iVar.n.q(false);
                    return true;
                }
                toolbar3.addView(toolbar3.F.get(size));
            }
        }
    }

    public static class e extends a.C0000a {

        /* renamed from: b */
        public int f999b;

        public e(int i, int i2) {
            super(i, i2);
            this.f999b = 0;
            this.f2a = 8388627;
        }

        public e(a.C0000a c0000a) {
            super(c0000a);
            this.f999b = 0;
        }

        public e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f999b = 0;
        }

        public e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f999b = 0;
        }

        public e(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f999b = 0;
            ((ViewGroup.MarginLayoutParams) this).leftMargin = marginLayoutParams.leftMargin;
            ((ViewGroup.MarginLayoutParams) this).topMargin = marginLayoutParams.topMargin;
            ((ViewGroup.MarginLayoutParams) this).rightMargin = marginLayoutParams.rightMargin;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = marginLayoutParams.bottomMargin;
        }

        public e(e eVar) {
            super((a.C0000a) eVar);
            this.f999b = 0;
            this.f999b = eVar.f999b;
        }
    }

    public interface f {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public static class g extends a.i.a.a {
        public static final Parcelable.Creator<g> CREATOR = new a();

        /* renamed from: d */
        public int f1000d;

        /* renamed from: e */
        public boolean f1001e;

        public class a implements Parcelable.ClassLoaderCreator<g> {
            @Override // android.os.Parcelable.Creator
            public Object createFromParcel(Parcel parcel) {
                return new g(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public Object[] newArray(int i) {
                return new g[i];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public g createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new g(parcel, classLoader);
            }
        }

        public g(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f1000d = parcel.readInt();
            this.f1001e = parcel.readInt() != 0;
        }

        public g(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // a.i.a.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f762b, i);
            parcel.writeInt(this.f1000d);
            parcel.writeInt(this.f1001e ? 1 : 0);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Toolbar(Context context, AttributeSet attributeSet) {
        int i = a.b.a.toolbarStyle;
        super(context, attributeSet, i);
        this.x = 8388627;
        this.E = new ArrayList<>();
        this.F = new ArrayList<>();
        this.G = new int[2];
        this.I = new a();
        this.N = new b();
        x0 x0VarO = x0.o(getContext(), attributeSet, j.Toolbar, i, 0);
        k.t(this, context, j.Toolbar, attributeSet, x0VarO.f336b, i, 0);
        this.m = x0VarO.j(j.Toolbar_titleTextAppearance, 0);
        this.n = x0VarO.j(j.Toolbar_subtitleTextAppearance, 0);
        this.x = x0VarO.f336b.getInteger(j.Toolbar_android_gravity, this.x);
        this.o = x0VarO.f336b.getInteger(j.Toolbar_buttonGravity, 48);
        int iC = x0VarO.c(j.Toolbar_titleMargin, 0);
        iC = x0VarO.m(j.Toolbar_titleMargins) ? x0VarO.c(j.Toolbar_titleMargins, iC) : iC;
        this.t = iC;
        this.s = iC;
        this.r = iC;
        this.q = iC;
        int iC2 = x0VarO.c(j.Toolbar_titleMarginStart, -1);
        if (iC2 >= 0) {
            this.q = iC2;
        }
        int iC3 = x0VarO.c(j.Toolbar_titleMarginEnd, -1);
        if (iC3 >= 0) {
            this.r = iC3;
        }
        int iC4 = x0VarO.c(j.Toolbar_titleMarginTop, -1);
        if (iC4 >= 0) {
            this.s = iC4;
        }
        int iC5 = x0VarO.c(j.Toolbar_titleMarginBottom, -1);
        if (iC5 >= 0) {
            this.t = iC5;
        }
        this.p = x0VarO.d(j.Toolbar_maxButtonHeight, -1);
        int iC6 = x0VarO.c(j.Toolbar_contentInsetStart, Integer.MIN_VALUE);
        int iC7 = x0VarO.c(j.Toolbar_contentInsetEnd, Integer.MIN_VALUE);
        int iD = x0VarO.d(j.Toolbar_contentInsetLeft, 0);
        int iD2 = x0VarO.d(j.Toolbar_contentInsetRight, 0);
        d();
        p0 p0Var = this.u;
        p0Var.h = false;
        if (iD != Integer.MIN_VALUE) {
            p0Var.f285e = iD;
            p0Var.f281a = iD;
        }
        if (iD2 != Integer.MIN_VALUE) {
            p0Var.f = iD2;
            p0Var.f282b = iD2;
        }
        if (iC6 != Integer.MIN_VALUE || iC7 != Integer.MIN_VALUE) {
            this.u.a(iC6, iC7);
        }
        this.v = x0VarO.c(j.Toolbar_contentInsetStartWithNavigation, Integer.MIN_VALUE);
        this.w = x0VarO.c(j.Toolbar_contentInsetEndWithActions, Integer.MIN_VALUE);
        this.g = x0VarO.e(j.Toolbar_collapseIcon);
        this.h = x0VarO.l(j.Toolbar_collapseContentDescription);
        CharSequence charSequenceL = x0VarO.l(j.Toolbar_title);
        if (!TextUtils.isEmpty(charSequenceL)) {
            setTitle(charSequenceL);
        }
        CharSequence charSequenceL2 = x0VarO.l(j.Toolbar_subtitle);
        if (!TextUtils.isEmpty(charSequenceL2)) {
            setSubtitle(charSequenceL2);
        }
        this.k = getContext();
        setPopupTheme(x0VarO.j(j.Toolbar_popupTheme, 0));
        Drawable drawableE = x0VarO.e(j.Toolbar_navigationIcon);
        if (drawableE != null) {
            setNavigationIcon(drawableE);
        }
        CharSequence charSequenceL3 = x0VarO.l(j.Toolbar_navigationContentDescription);
        if (!TextUtils.isEmpty(charSequenceL3)) {
            setNavigationContentDescription(charSequenceL3);
        }
        Drawable drawableE2 = x0VarO.e(j.Toolbar_logo);
        if (drawableE2 != null) {
            setLogo(drawableE2);
        }
        CharSequence charSequenceL4 = x0VarO.l(j.Toolbar_logoDescription);
        if (!TextUtils.isEmpty(charSequenceL4)) {
            setLogoDescription(charSequenceL4);
        }
        if (x0VarO.m(j.Toolbar_titleTextColor)) {
            setTitleTextColor(x0VarO.b(j.Toolbar_titleTextColor));
        }
        if (x0VarO.m(j.Toolbar_subtitleTextColor)) {
            setSubtitleTextColor(x0VarO.b(j.Toolbar_subtitleTextColor));
        }
        if (x0VarO.m(j.Toolbar_menu)) {
            getMenuInflater().inflate(x0VarO.j(j.Toolbar_menu, 0), getMenu());
        }
        x0VarO.f336b.recycle();
    }

    private MenuInflater getMenuInflater() {
        return new a.b.o.f(getContext());
    }

    public final void a(List<View> list, int i) {
        boolean z = k.f(this) == 1;
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i, getLayoutDirection());
        list.clear();
        if (!z) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                e eVar = (e) childAt.getLayoutParams();
                if (eVar.f999b == 0 && t(childAt) && j(eVar.f2a) == absoluteGravity) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i3 = childCount - 1; i3 >= 0; i3--) {
            View childAt2 = getChildAt(i3);
            e eVar2 = (e) childAt2.getLayoutParams();
            if (eVar2.f999b == 0 && t(childAt2) && j(eVar2.f2a) == absoluteGravity) {
                list.add(childAt2);
            }
        }
    }

    public final void b(View view, boolean z) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        e eVarGenerateDefaultLayoutParams = layoutParams == null ? generateDefaultLayoutParams() : !checkLayoutParams(layoutParams) ? generateLayoutParams(layoutParams) : (e) layoutParams;
        eVarGenerateDefaultLayoutParams.f999b = 1;
        if (!z || this.j == null) {
            addView(view, eVarGenerateDefaultLayoutParams);
        } else {
            view.setLayoutParams(eVarGenerateDefaultLayoutParams);
            this.F.add(view);
        }
    }

    public void c() {
        if (this.i == null) {
            l lVar = new l(getContext(), null, a.b.a.toolbarNavigationButtonStyle);
            this.i = lVar;
            lVar.setImageDrawable(this.g);
            this.i.setContentDescription(this.h);
            e eVarGenerateDefaultLayoutParams = generateDefaultLayoutParams();
            eVarGenerateDefaultLayoutParams.f2a = 8388611 | (this.o & 112);
            eVarGenerateDefaultLayoutParams.f999b = 2;
            this.i.setLayoutParams(eVarGenerateDefaultLayoutParams);
            this.i.setOnClickListener(new c());
        }
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof e);
    }

    public final void d() {
        if (this.u == null) {
            this.u = new p0();
        }
    }

    public final void e() {
        f();
        ActionMenuView actionMenuView = this.f989b;
        if (actionMenuView.q == null) {
            a.b.o.i.g gVar = (a.b.o.i.g) actionMenuView.getMenu();
            if (this.L == null) {
                this.L = new d();
            }
            this.f989b.setExpandedActionViewsExclusive(true);
            gVar.b(this.L, this.k);
        }
    }

    public final void f() {
        if (this.f989b == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext(), null);
            this.f989b = actionMenuView;
            actionMenuView.setPopupTheme(this.l);
            this.f989b.setOnMenuItemClickListener(this.I);
            ActionMenuView actionMenuView2 = this.f989b;
            actionMenuView2.v = null;
            actionMenuView2.w = null;
            e eVarGenerateDefaultLayoutParams = generateDefaultLayoutParams();
            eVarGenerateDefaultLayoutParams.f2a = 8388613 | (this.o & 112);
            this.f989b.setLayoutParams(eVarGenerateDefaultLayoutParams);
            b(this.f989b, false);
        }
    }

    public final void g() {
        if (this.f992e == null) {
            this.f992e = new l(getContext(), null, a.b.a.toolbarNavigationButtonStyle);
            e eVarGenerateDefaultLayoutParams = generateDefaultLayoutParams();
            eVarGenerateDefaultLayoutParams.f2a = 8388611 | (this.o & 112);
            this.f992e.setLayoutParams(eVarGenerateDefaultLayoutParams);
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    public CharSequence getCollapseContentDescription() {
        ImageButton imageButton = this.i;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        ImageButton imageButton = this.i;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        p0 p0Var = this.u;
        if (p0Var != null) {
            return p0Var.g ? p0Var.f281a : p0Var.f282b;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i = this.w;
        return i != Integer.MIN_VALUE ? i : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        p0 p0Var = this.u;
        if (p0Var != null) {
            return p0Var.f281a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        p0 p0Var = this.u;
        if (p0Var != null) {
            return p0Var.f282b;
        }
        return 0;
    }

    public int getContentInsetStart() {
        p0 p0Var = this.u;
        if (p0Var != null) {
            return p0Var.g ? p0Var.f282b : p0Var.f281a;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i = this.v;
        return i != Integer.MIN_VALUE ? i : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        a.b.o.i.g gVar;
        ActionMenuView actionMenuView = this.f989b;
        return actionMenuView != null && (gVar = actionMenuView.q) != null && gVar.hasVisibleItems() ? Math.max(getContentInsetEnd(), Math.max(this.w, 0)) : getContentInsetEnd();
    }

    public int getCurrentContentInsetLeft() {
        return k.f(this) == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return k.f(this) == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.v, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        ImageView imageView = this.f;
        if (imageView != null) {
            return imageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        ImageView imageView = this.f;
        if (imageView != null) {
            return imageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        e();
        return this.f989b.getMenu();
    }

    public CharSequence getNavigationContentDescription() {
        ImageButton imageButton = this.f992e;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        ImageButton imageButton = this.f992e;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public a.b.p.c getOuterActionMenuPresenter() {
        return this.K;
    }

    public Drawable getOverflowIcon() {
        e();
        return this.f989b.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.k;
    }

    public int getPopupTheme() {
        return this.l;
    }

    public CharSequence getSubtitle() {
        return this.z;
    }

    public final TextView getSubtitleTextView() {
        return this.f991d;
    }

    public CharSequence getTitle() {
        return this.y;
    }

    public int getTitleMarginBottom() {
        return this.t;
    }

    public int getTitleMarginEnd() {
        return this.r;
    }

    public int getTitleMarginStart() {
        return this.q;
    }

    public int getTitleMarginTop() {
        return this.s;
    }

    public final TextView getTitleTextView() {
        return this.f990c;
    }

    public d0 getWrapper() {
        if (this.J == null) {
            this.J = new z0(this, true);
        }
        return this.J;
    }

    @Override // android.view.ViewGroup
    /* renamed from: h */
    public e generateDefaultLayoutParams() {
        return new e(-2, -2);
    }

    @Override // android.view.ViewGroup
    /* renamed from: i */
    public e generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e ? new e((e) layoutParams) : layoutParams instanceof a.C0000a ? new e((a.C0000a) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new e((ViewGroup.MarginLayoutParams) layoutParams) : new e(layoutParams);
    }

    public final int j(int i) {
        int iF = k.f(this);
        int absoluteGravity = Gravity.getAbsoluteGravity(i, iF) & 7;
        return (absoluteGravity == 1 || absoluteGravity == 3 || absoluteGravity == 5) ? absoluteGravity : iF == 1 ? 5 : 3;
    }

    public final int k(View view, int i) {
        e eVar = (e) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i2 = i > 0 ? (measuredHeight - i) / 2 : 0;
        int i3 = eVar.f2a & 112;
        if (i3 != 16 && i3 != 48 && i3 != 80) {
            i3 = this.x & 112;
        }
        if (i3 == 48) {
            return getPaddingTop() - i2;
        }
        if (i3 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) eVar).bottomMargin) - i2;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int iMax = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i4 = ((ViewGroup.MarginLayoutParams) eVar).topMargin;
        if (iMax < i4) {
            iMax = i4;
        } else {
            int i5 = (((height - paddingBottom) - measuredHeight) - iMax) - paddingTop;
            int i6 = ((ViewGroup.MarginLayoutParams) eVar).bottomMargin;
            if (i5 < i6) {
                iMax = Math.max(0, iMax - (i6 - i5));
            }
        }
        return paddingTop + iMax;
    }

    public final int l(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginStart() + marginLayoutParams.getMarginEnd();
    }

    public final int m(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public final boolean n(View view) {
        return view.getParent() == this || this.F.contains(view);
    }

    public boolean o() {
        ActionMenuView actionMenuView = this.f989b;
        if (actionMenuView != null) {
            a.b.p.c cVar = actionMenuView.u;
            if (cVar != null && cVar.m()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.N);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.D = false;
        }
        if (!this.D) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.D = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.D = false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:152:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0295 A[LOOP:0: B:241:0x0293->B:242:0x0295, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:245:0x02b7 A[LOOP:1: B:244:0x02b5->B:245:0x02b7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:248:0x02dc A[LOOP:2: B:247:0x02da->B:248:0x02dc, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:252:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0331 A[LOOP:3: B:256:0x032f->B:257:0x0331, LOOP_END] */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onLayout(boolean r21, int r22, int r23, int r24, int r25) {
        /*
            Method dump skipped, instructions count: 838
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        char c2;
        char c3;
        int iL;
        int iMax;
        int iCombineMeasuredStates;
        int iL2;
        int iM;
        int iCombineMeasuredStates2;
        int iMax2;
        int[] iArr = this.G;
        boolean z = true;
        if (b1.a(this)) {
            c3 = 1;
            c2 = 0;
        } else {
            c2 = 1;
            c3 = 0;
        }
        if (t(this.f992e)) {
            s(this.f992e, i, 0, i2, 0, this.p);
            iL = l(this.f992e) + this.f992e.getMeasuredWidth();
            iMax = Math.max(0, m(this.f992e) + this.f992e.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(0, this.f992e.getMeasuredState());
        } else {
            iL = 0;
            iMax = 0;
            iCombineMeasuredStates = 0;
        }
        if (t(this.i)) {
            s(this.i, i, 0, i2, 0, this.p);
            iL = l(this.i) + this.i.getMeasuredWidth();
            iMax = Math.max(iMax, m(this.i) + this.i.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.i.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int iMax3 = Math.max(currentContentInsetStart, iL) + 0;
        iArr[c3] = Math.max(0, currentContentInsetStart - iL);
        if (t(this.f989b)) {
            s(this.f989b, i, iMax3, i2, 0, this.p);
            iL2 = l(this.f989b) + this.f989b.getMeasuredWidth();
            iMax = Math.max(iMax, m(this.f989b) + this.f989b.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f989b.getMeasuredState());
        } else {
            iL2 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int iMax4 = Math.max(currentContentInsetEnd, iL2) + iMax3;
        iArr[c2] = Math.max(0, currentContentInsetEnd - iL2);
        if (t(this.j)) {
            iMax4 += r(this.j, i, iMax4, i2, 0, iArr);
            iMax = Math.max(iMax, m(this.j) + this.j.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.j.getMeasuredState());
        }
        if (t(this.f)) {
            iMax4 += r(this.f, i, iMax4, i2, 0, iArr);
            iMax = Math.max(iMax, m(this.f) + this.f.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (((e) childAt.getLayoutParams()).f999b == 0 && t(childAt)) {
                iMax4 += r(childAt, i, iMax4, i2, 0, iArr);
                iMax = Math.max(iMax, m(childAt) + childAt.getMeasuredHeight());
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState());
            }
        }
        int i4 = this.s + this.t;
        int i5 = this.q + this.r;
        if (t(this.f990c)) {
            r(this.f990c, i, iMax4 + i5, i2, i4, iArr);
            int iL3 = l(this.f990c) + this.f990c.getMeasuredWidth();
            iM = m(this.f990c) + this.f990c.getMeasuredHeight();
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.f990c.getMeasuredState());
            iMax2 = iL3;
        } else {
            iM = 0;
            iCombineMeasuredStates2 = iCombineMeasuredStates;
            iMax2 = 0;
        }
        if (t(this.f991d)) {
            iMax2 = Math.max(iMax2, r(this.f991d, i, iMax4 + i5, i2, iM + i4, iArr));
            iM = m(this.f991d) + this.f991d.getMeasuredHeight() + iM;
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, this.f991d.getMeasuredState());
        }
        int iMax5 = Math.max(iMax, iM);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop() + iMax5;
        int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight + iMax4 + iMax2, getSuggestedMinimumWidth()), i, (-16777216) & iCombineMeasuredStates2);
        int iResolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i2, iCombineMeasuredStates2 << 16);
        if (!this.M) {
            z = false;
            break;
        }
        int childCount2 = getChildCount();
        for (int i6 = 0; i6 < childCount2; i6++) {
            View childAt2 = getChildAt(i6);
            if (t(childAt2) && childAt2.getMeasuredWidth() > 0 && childAt2.getMeasuredHeight() > 0) {
                z = false;
                break;
            }
        }
        setMeasuredDimension(iResolveSizeAndState, z ? 0 : iResolveSizeAndState2);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem menuItemFindItem;
        if (!(parcelable instanceof g)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        g gVar = (g) parcelable;
        super.onRestoreInstanceState(gVar.f762b);
        ActionMenuView actionMenuView = this.f989b;
        a.b.o.i.g gVar2 = actionMenuView != null ? actionMenuView.q : null;
        int i = gVar.f1000d;
        if (i != 0 && this.L != null && gVar2 != null && (menuItemFindItem = gVar2.findItem(i)) != null) {
            menuItemFindItem.expandActionView();
        }
        if (gVar.f1001e) {
            removeCallbacks(this.N);
            post(this.N);
        }
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i) {
        int i2;
        super.onRtlPropertiesChanged(i);
        d();
        p0 p0Var = this.u;
        boolean z = i == 1;
        if (z == p0Var.g) {
            return;
        }
        p0Var.g = z;
        if (p0Var.h) {
            if (z) {
                int i3 = p0Var.f284d;
                if (i3 == Integer.MIN_VALUE) {
                    i3 = p0Var.f285e;
                }
                p0Var.f281a = i3;
                i2 = p0Var.f283c;
                if (i2 == Integer.MIN_VALUE) {
                }
            } else {
                int i4 = p0Var.f283c;
                if (i4 == Integer.MIN_VALUE) {
                    i4 = p0Var.f285e;
                }
                p0Var.f281a = i4;
                i2 = p0Var.f284d;
                if (i2 == Integer.MIN_VALUE) {
                }
            }
            p0Var.f282b = i2;
        }
        p0Var.f281a = p0Var.f285e;
        i2 = p0Var.f;
        p0Var.f282b = i2;
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        i iVar;
        g gVar = new g(super.onSaveInstanceState());
        d dVar = this.L;
        if (dVar != null && (iVar = dVar.f997c) != null) {
            gVar.f1000d = iVar.f156a;
        }
        gVar.f1001e = o();
        return gVar;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.C = false;
        }
        if (!this.C) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.C = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.C = false;
        }
        return true;
    }

    public final int p(View view, int i, int[] iArr, int i2) {
        e eVar = (e) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin - iArr[0];
        int iMax = Math.max(0, i3) + i;
        iArr[0] = Math.max(0, -i3);
        int iK = k(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax, iK, iMax + measuredWidth, view.getMeasuredHeight() + iK);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) eVar).rightMargin + iMax;
    }

    public final int q(View view, int i, int[] iArr, int i2) {
        e eVar = (e) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) eVar).rightMargin - iArr[1];
        int iMax = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        int iK = k(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax - measuredWidth, iK, iMax, view.getMeasuredHeight() + iK);
        return iMax - (measuredWidth + ((ViewGroup.MarginLayoutParams) eVar).leftMargin);
    }

    public final int r(View view, int i, int i2, int i3, int i4, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i5 = marginLayoutParams.leftMargin - iArr[0];
        int i6 = marginLayoutParams.rightMargin - iArr[1];
        int iMax = Math.max(0, i6) + Math.max(0, i5);
        iArr[0] = Math.max(0, -i5);
        iArr[1] = Math.max(0, -i6);
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + iMax + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height));
        return view.getMeasuredWidth() + iMax;
    }

    public final void s(View view, int i, int i2, int i3, int i4, int i5) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i5 >= 0) {
            if (mode != 0) {
                i5 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i5);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i5, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    public void setCollapseContentDescription(int i) {
        setCollapseContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            c();
        }
        ImageButton imageButton = this.i;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(int i) {
        setCollapseIcon(a.b.l.a.a.b(getContext(), i));
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            c();
            this.i.setImageDrawable(drawable);
        } else {
            ImageButton imageButton = this.i;
            if (imageButton != null) {
                imageButton.setImageDrawable(this.g);
            }
        }
    }

    public void setCollapsible(boolean z) {
        this.M = z;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.w) {
            this.w = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.v) {
            this.v = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i) {
        setLogo(a.b.l.a.a.b(getContext(), i));
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            if (this.f == null) {
                this.f = new n(getContext(), null, 0);
            }
            if (!n(this.f)) {
                b(this.f, true);
            }
        } else {
            ImageView imageView = this.f;
            if (imageView != null && n(imageView)) {
                removeView(this.f);
                this.F.remove(this.f);
            }
        }
        ImageView imageView2 = this.f;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(int i) {
        setLogoDescription(getContext().getText(i));
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.f == null) {
            this.f = new n(getContext(), null, 0);
        }
        ImageView imageView = this.f;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(int i) {
        setNavigationContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            g();
        }
        ImageButton imageButton = this.f992e;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setNavigationIcon(int i) {
        setNavigationIcon(a.b.l.a.a.b(getContext(), i));
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            g();
            if (!n(this.f992e)) {
                b(this.f992e, true);
            }
        } else {
            ImageButton imageButton = this.f992e;
            if (imageButton != null && n(imageButton)) {
                removeView(this.f992e);
                this.F.remove(this.f992e);
            }
        }
        ImageButton imageButton2 = this.f992e;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        g();
        this.f992e.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(f fVar) {
        this.H = fVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        e();
        this.f989b.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i) {
        if (this.l != i) {
            this.l = i;
            if (i == 0) {
                this.k = getContext();
            } else {
                this.k = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setSubtitle(int i) {
        setSubtitle(getContext().getText(i));
    }

    public void setSubtitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.f991d;
            if (textView != null && n(textView)) {
                removeView(this.f991d);
                this.F.remove(this.f991d);
            }
        } else {
            if (this.f991d == null) {
                Context context = getContext();
                z zVar = new z(context, null);
                this.f991d = zVar;
                zVar.setSingleLine();
                this.f991d.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.n;
                if (i != 0) {
                    this.f991d.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.B;
                if (colorStateList != null) {
                    this.f991d.setTextColor(colorStateList);
                }
            }
            if (!n(this.f991d)) {
                b(this.f991d, true);
            }
        }
        TextView textView2 = this.f991d;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.z = charSequence;
    }

    public void setSubtitleTextColor(int i) {
        setSubtitleTextColor(ColorStateList.valueOf(i));
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.B = colorStateList;
        TextView textView = this.f991d;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setTitle(int i) {
        setTitle(getContext().getText(i));
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.f990c;
            if (textView != null && n(textView)) {
                removeView(this.f990c);
                this.F.remove(this.f990c);
            }
        } else {
            if (this.f990c == null) {
                Context context = getContext();
                z zVar = new z(context, null);
                this.f990c = zVar;
                zVar.setSingleLine();
                this.f990c.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.m;
                if (i != 0) {
                    this.f990c.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.A;
                if (colorStateList != null) {
                    this.f990c.setTextColor(colorStateList);
                }
            }
            if (!n(this.f990c)) {
                b(this.f990c, true);
            }
        }
        TextView textView2 = this.f990c;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.y = charSequence;
    }

    public void setTitleMarginBottom(int i) {
        this.t = i;
        requestLayout();
    }

    public void setTitleMarginEnd(int i) {
        this.r = i;
        requestLayout();
    }

    public void setTitleMarginStart(int i) {
        this.q = i;
        requestLayout();
    }

    public void setTitleMarginTop(int i) {
        this.s = i;
        requestLayout();
    }

    public void setTitleTextColor(int i) {
        setTitleTextColor(ColorStateList.valueOf(i));
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.A = colorStateList;
        TextView textView = this.f990c;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public final boolean t(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    public boolean u() {
        ActionMenuView actionMenuView = this.f989b;
        if (actionMenuView != null) {
            a.b.p.c cVar = actionMenuView.u;
            if (cVar != null && cVar.n()) {
                return true;
            }
        }
        return false;
    }
}
