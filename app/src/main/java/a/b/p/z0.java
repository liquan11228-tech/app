package a.b.p;

import a.b.o.i.m;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.Toolbar.d;

/* loaded from: classes.dex */
public class z0 implements d0 {

    /* renamed from: a, reason: collision with root package name */
    public Toolbar f353a;

    /* renamed from: b, reason: collision with root package name */
    public int f354b;

    /* renamed from: c, reason: collision with root package name */
    public View f355c;

    /* renamed from: d, reason: collision with root package name */
    public View f356d;

    /* renamed from: e, reason: collision with root package name */
    public Drawable f357e;
    public Drawable f;
    public Drawable g;
    public boolean h;
    public CharSequence i;
    public CharSequence j;
    public CharSequence k;
    public Window.Callback l;
    public boolean m;
    public c n;
    public int o;
    public int p;
    public Drawable q;

    public class a extends a.g.j.q {

        /* renamed from: a, reason: collision with root package name */
        public boolean f358a = false;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f359b;

        public a(int i) {
            this.f359b = i;
        }

        @Override // a.g.j.p
        public void a(View view) {
            if (this.f358a) {
                return;
            }
            z0.this.f353a.setVisibility(this.f359b);
        }

        @Override // a.g.j.q, a.g.j.p
        public void b(View view) {
            z0.this.f353a.setVisibility(0);
        }

        @Override // a.g.j.q, a.g.j.p
        public void c(View view) {
            this.f358a = true;
        }
    }

    public z0(Toolbar toolbar, boolean z) {
        int i;
        Drawable drawable;
        int i2 = a.b.h.abc_action_bar_up_description;
        this.o = 0;
        this.p = 0;
        this.f353a = toolbar;
        this.i = toolbar.getTitle();
        this.j = toolbar.getSubtitle();
        this.h = this.i != null;
        this.g = toolbar.getNavigationIcon();
        x0 x0VarO = x0.o(toolbar.getContext(), null, a.b.j.ActionBar, a.b.a.actionBarStyle, 0);
        this.q = x0VarO.e(a.b.j.ActionBar_homeAsUpIndicator);
        if (z) {
            CharSequence charSequenceL = x0VarO.l(a.b.j.ActionBar_title);
            if (!TextUtils.isEmpty(charSequenceL)) {
                this.h = true;
                this.i = charSequenceL;
                if ((this.f354b & 8) != 0) {
                    this.f353a.setTitle(charSequenceL);
                }
            }
            CharSequence charSequenceL2 = x0VarO.l(a.b.j.ActionBar_subtitle);
            if (!TextUtils.isEmpty(charSequenceL2)) {
                this.j = charSequenceL2;
                if ((this.f354b & 8) != 0) {
                    this.f353a.setSubtitle(charSequenceL2);
                }
            }
            Drawable drawableE = x0VarO.e(a.b.j.ActionBar_logo);
            if (drawableE != null) {
                this.f = drawableE;
                y();
            }
            Drawable drawableE2 = x0VarO.e(a.b.j.ActionBar_icon);
            if (drawableE2 != null) {
                this.f357e = drawableE2;
                y();
            }
            if (this.g == null && (drawable = this.q) != null) {
                this.g = drawable;
                x();
            }
            u(x0VarO.h(a.b.j.ActionBar_displayOptions, 0));
            int iJ = x0VarO.j(a.b.j.ActionBar_customNavigationLayout, 0);
            if (iJ != 0) {
                View viewInflate = LayoutInflater.from(this.f353a.getContext()).inflate(iJ, (ViewGroup) this.f353a, false);
                View view = this.f356d;
                if (view != null && (this.f354b & 16) != 0) {
                    this.f353a.removeView(view);
                }
                this.f356d = viewInflate;
                if (viewInflate != null && (this.f354b & 16) != 0) {
                    this.f353a.addView(viewInflate);
                }
                u(this.f354b | 16);
            }
            int i3 = x0VarO.i(a.b.j.ActionBar_height, 0);
            if (i3 > 0) {
                ViewGroup.LayoutParams layoutParams = this.f353a.getLayoutParams();
                layoutParams.height = i3;
                this.f353a.setLayoutParams(layoutParams);
            }
            int iC = x0VarO.c(a.b.j.ActionBar_contentInsetStart, -1);
            int iC2 = x0VarO.c(a.b.j.ActionBar_contentInsetEnd, -1);
            if (iC >= 0 || iC2 >= 0) {
                Toolbar toolbar2 = this.f353a;
                int iMax = Math.max(iC, 0);
                int iMax2 = Math.max(iC2, 0);
                toolbar2.d();
                toolbar2.u.a(iMax, iMax2);
            }
            int iJ2 = x0VarO.j(a.b.j.ActionBar_titleTextStyle, 0);
            if (iJ2 != 0) {
                Toolbar toolbar3 = this.f353a;
                Context context = toolbar3.getContext();
                toolbar3.m = iJ2;
                TextView textView = toolbar3.f990c;
                if (textView != null) {
                    textView.setTextAppearance(context, iJ2);
                }
            }
            int iJ3 = x0VarO.j(a.b.j.ActionBar_subtitleTextStyle, 0);
            if (iJ3 != 0) {
                Toolbar toolbar4 = this.f353a;
                Context context2 = toolbar4.getContext();
                toolbar4.n = iJ3;
                TextView textView2 = toolbar4.f991d;
                if (textView2 != null) {
                    textView2.setTextAppearance(context2, iJ3);
                }
            }
            int iJ4 = x0VarO.j(a.b.j.ActionBar_popupTheme, 0);
            if (iJ4 != 0) {
                this.f353a.setPopupTheme(iJ4);
            }
        } else {
            if (this.f353a.getNavigationIcon() != null) {
                i = 15;
                this.q = this.f353a.getNavigationIcon();
            } else {
                i = 11;
            }
            this.f354b = i;
        }
        x0VarO.f336b.recycle();
        if (i2 != this.p) {
            this.p = i2;
            if (TextUtils.isEmpty(this.f353a.getNavigationContentDescription())) {
                int i4 = this.p;
                this.k = i4 != 0 ? t().getString(i4) : null;
                w();
            }
        }
        this.k = this.f353a.getNavigationContentDescription();
        this.f353a.setNavigationOnClickListener(new y0(this));
    }

    @Override // a.b.p.d0
    public boolean a() {
        return this.f353a.u();
    }

    @Override // a.b.p.d0
    public void b(Menu menu, m.a aVar) {
        a.b.o.i.i iVar;
        if (this.n == null) {
            c cVar = new c(this.f353a.getContext());
            this.n = cVar;
            if (cVar == null) {
                throw null;
            }
        }
        c cVar2 = this.n;
        cVar2.f = aVar;
        Toolbar toolbar = this.f353a;
        a.b.o.i.g gVar = (a.b.o.i.g) menu;
        if (gVar == null && toolbar.f989b == null) {
            return;
        }
        toolbar.f();
        a.b.o.i.g gVar2 = toolbar.f989b.q;
        if (gVar2 == gVar) {
            return;
        }
        if (gVar2 != null) {
            gVar2.u(toolbar.K);
            gVar2.u(toolbar.L);
        }
        if (toolbar.L == null) {
            toolbar.L = toolbar.new d();
        }
        cVar2.r = true;
        if (gVar != null) {
            gVar.b(cVar2, toolbar.k);
            gVar.b(toolbar.L, toolbar.k);
        } else {
            cVar2.j(toolbar.k, null);
            Toolbar.d dVar = toolbar.L;
            a.b.o.i.g gVar3 = dVar.f996b;
            if (gVar3 != null && (iVar = dVar.f997c) != null) {
                gVar3.d(iVar);
            }
            dVar.f996b = null;
            cVar2.h(true);
            toolbar.L.h(true);
        }
        toolbar.f989b.setPopupTheme(toolbar.l);
        toolbar.f989b.setPresenter(cVar2);
        toolbar.K = cVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    @Override // a.b.p.d0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean c() {
        /*
            r4 = this;
            androidx.appcompat.widget.Toolbar r0 = r4.f353a
            androidx.appcompat.widget.ActionMenuView r0 = r0.f989b
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L22
            a.b.p.c r0 = r0.u
            if (r0 == 0) goto L1e
            a.b.p.c$c r3 = r0.w
            if (r3 != 0) goto L19
            boolean r0 = r0.m()
            if (r0 == 0) goto L17
            goto L19
        L17:
            r0 = r2
            goto L1a
        L19:
            r0 = r1
        L1a:
            if (r0 == 0) goto L1e
            r0 = r1
            goto L1f
        L1e:
            r0 = r2
        L1f:
            if (r0 == 0) goto L22
            goto L23
        L22:
            r1 = r2
        L23:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: a.b.p.z0.c():boolean");
    }

    @Override // a.b.p.d0
    public void collapseActionView() {
        Toolbar.d dVar = this.f353a.L;
        a.b.o.i.i iVar = dVar == null ? null : dVar.f997c;
        if (iVar != null) {
            iVar.collapseActionView();
        }
    }

    @Override // a.b.p.d0
    public void d() {
        this.m = true;
    }

    @Override // a.b.p.d0
    public boolean e() {
        return this.f353a.o();
    }

    @Override // a.b.p.d0
    public boolean f() {
        ActionMenuView actionMenuView;
        Toolbar toolbar = this.f353a;
        return toolbar.getVisibility() == 0 && (actionMenuView = toolbar.f989b) != null && actionMenuView.t;
    }

    @Override // a.b.p.d0
    public boolean g() {
        ActionMenuView actionMenuView = this.f353a.f989b;
        if (actionMenuView != null) {
            c cVar = actionMenuView.u;
            if (cVar != null && cVar.i()) {
                return true;
            }
        }
        return false;
    }

    @Override // a.b.p.d0
    public CharSequence getTitle() {
        return this.f353a.getTitle();
    }

    @Override // a.b.p.d0
    public void h() {
        c cVar;
        ActionMenuView actionMenuView = this.f353a.f989b;
        if (actionMenuView == null || (cVar = actionMenuView.u) == null) {
            return;
        }
        cVar.e();
    }

    @Override // a.b.p.d0
    public a.g.j.o i(int i, long j) {
        a.g.j.o oVarA = a.g.j.k.a(this.f353a);
        oVarA.a(i == 0 ? 1.0f : 0.0f);
        oVarA.c(j);
        a aVar = new a(i);
        View view = oVarA.f706a.get();
        if (view != null) {
            oVarA.e(view, aVar);
        }
        return oVarA;
    }

    @Override // a.b.p.d0
    public int j() {
        return this.f354b;
    }

    @Override // a.b.p.d0
    public void k(int i) {
        this.f353a.setVisibility(i);
    }

    @Override // a.b.p.d0
    public void l() {
    }

    @Override // a.b.p.d0
    public boolean m() {
        Toolbar.d dVar = this.f353a.L;
        return (dVar == null || dVar.f997c == null) ? false : true;
    }

    @Override // a.b.p.d0
    public void n(int i) {
        this.f = i != 0 ? a.b.l.a.a.b(t(), i) : null;
        y();
    }

    @Override // a.b.p.d0
    public void o(q0 q0Var) {
        View view = this.f355c;
        if (view != null) {
            ViewParent parent = view.getParent();
            Toolbar toolbar = this.f353a;
            if (parent == toolbar) {
                toolbar.removeView(this.f355c);
            }
        }
        this.f355c = null;
    }

    @Override // a.b.p.d0
    public ViewGroup p() {
        return this.f353a;
    }

    @Override // a.b.p.d0
    public void q(boolean z) {
    }

    @Override // a.b.p.d0
    public void r() {
    }

    @Override // a.b.p.d0
    public void s(boolean z) {
        this.f353a.setCollapsible(z);
    }

    @Override // a.b.p.d0
    public void setIcon(int i) {
        this.f357e = i != 0 ? a.b.l.a.a.b(t(), i) : null;
        y();
    }

    @Override // a.b.p.d0
    public void setIcon(Drawable drawable) {
        this.f357e = drawable;
        y();
    }

    @Override // a.b.p.d0
    public void setWindowCallback(Window.Callback callback) {
        this.l = callback;
    }

    @Override // a.b.p.d0
    public void setWindowTitle(CharSequence charSequence) {
        if (this.h) {
            return;
        }
        this.i = charSequence;
        if ((this.f354b & 8) != 0) {
            this.f353a.setTitle(charSequence);
        }
    }

    @Override // a.b.p.d0
    public Context t() {
        return this.f353a.getContext();
    }

    @Override // a.b.p.d0
    public void u(int i) {
        View view;
        CharSequence charSequence;
        Toolbar toolbar;
        int i2 = this.f354b ^ i;
        this.f354b = i;
        if (i2 != 0) {
            if ((i2 & 4) != 0) {
                if ((i & 4) != 0) {
                    w();
                }
                x();
            }
            if ((i2 & 3) != 0) {
                y();
            }
            if ((i2 & 8) != 0) {
                if ((i & 8) != 0) {
                    this.f353a.setTitle(this.i);
                    toolbar = this.f353a;
                    charSequence = this.j;
                } else {
                    charSequence = null;
                    this.f353a.setTitle((CharSequence) null);
                    toolbar = this.f353a;
                }
                toolbar.setSubtitle(charSequence);
            }
            if ((i2 & 16) == 0 || (view = this.f356d) == null) {
                return;
            }
            if ((i & 16) != 0) {
                this.f353a.addView(view);
            } else {
                this.f353a.removeView(view);
            }
        }
    }

    @Override // a.b.p.d0
    public int v() {
        return this.o;
    }

    public final void w() {
        if ((this.f354b & 4) != 0) {
            if (TextUtils.isEmpty(this.k)) {
                this.f353a.setNavigationContentDescription(this.p);
            } else {
                this.f353a.setNavigationContentDescription(this.k);
            }
        }
    }

    public final void x() {
        Toolbar toolbar;
        Drawable drawable;
        if ((this.f354b & 4) != 0) {
            toolbar = this.f353a;
            drawable = this.g;
            if (drawable == null) {
                drawable = this.q;
            }
        } else {
            toolbar = this.f353a;
            drawable = null;
        }
        toolbar.setNavigationIcon(drawable);
    }

    public final void y() {
        Drawable drawable;
        int i = this.f354b;
        if ((i & 2) == 0) {
            drawable = null;
        } else if ((i & 1) == 0 || (drawable = this.f) == null) {
            drawable = this.f357e;
        }
        this.f353a.setLogo(drawable);
    }
}
