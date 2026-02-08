package a.b.k;

import a.b.k.a;
import a.b.o.a;
import a.b.o.i.g;
import a.b.p.d0;
import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class r extends a.b.k.a implements ActionBarOverlayLayout.d {
    public static final Interpolator A = new AccelerateInterpolator();
    public static final Interpolator B = new DecelerateInterpolator();

    /* renamed from: a, reason: collision with root package name */
    public Context f62a;

    /* renamed from: b, reason: collision with root package name */
    public Context f63b;

    /* renamed from: c, reason: collision with root package name */
    public ActionBarOverlayLayout f64c;

    /* renamed from: d, reason: collision with root package name */
    public ActionBarContainer f65d;

    /* renamed from: e, reason: collision with root package name */
    public d0 f66e;
    public ActionBarContextView f;
    public View g;
    public boolean h;
    public d i;
    public a.b.o.a j;
    public a.InterfaceC0002a k;
    public boolean l;
    public ArrayList<a.b> m;
    public boolean n;
    public int o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;
    public a.b.o.g u;
    public boolean v;
    public boolean w;
    public final a.g.j.p x;
    public final a.g.j.p y;
    public final a.g.j.r z;

    public class a extends a.g.j.q {
        public a() {
        }

        @Override // a.g.j.p
        public void a(View view) {
            View view2;
            r rVar = r.this;
            if (rVar.p && (view2 = rVar.g) != null) {
                view2.setTranslationY(0.0f);
                r.this.f65d.setTranslationY(0.0f);
            }
            r.this.f65d.setVisibility(8);
            r.this.f65d.setTransitioning(false);
            r rVar2 = r.this;
            rVar2.u = null;
            a.InterfaceC0002a interfaceC0002a = rVar2.k;
            if (interfaceC0002a != null) {
                interfaceC0002a.b(rVar2.j);
                rVar2.j = null;
                rVar2.k = null;
            }
            ActionBarOverlayLayout actionBarOverlayLayout = r.this.f64c;
            if (actionBarOverlayLayout != null) {
                a.g.j.k.s(actionBarOverlayLayout);
            }
        }
    }

    public class b extends a.g.j.q {
        public b() {
        }

        @Override // a.g.j.p
        public void a(View view) {
            r rVar = r.this;
            rVar.u = null;
            rVar.f65d.requestLayout();
        }
    }

    public class c implements a.g.j.r {
        public c() {
        }
    }

    public class d extends a.b.o.a implements g.a {

        /* renamed from: d, reason: collision with root package name */
        public final Context f70d;

        /* renamed from: e, reason: collision with root package name */
        public final a.b.o.i.g f71e;
        public a.InterfaceC0002a f;
        public WeakReference<View> g;

        public d(Context context, a.InterfaceC0002a interfaceC0002a) {
            this.f70d = context;
            this.f = interfaceC0002a;
            a.b.o.i.g gVar = new a.b.o.i.g(context);
            gVar.l = 1;
            this.f71e = gVar;
            gVar.f152e = this;
        }

        @Override // a.b.o.i.g.a
        public void a(a.b.o.i.g gVar) {
            if (this.f == null) {
                return;
            }
            i();
            a.b.p.c cVar = r.this.f.f189e;
            if (cVar != null) {
                cVar.n();
            }
        }

        @Override // a.b.o.i.g.a
        public boolean b(a.b.o.i.g gVar, MenuItem menuItem) {
            a.InterfaceC0002a interfaceC0002a = this.f;
            if (interfaceC0002a != null) {
                return interfaceC0002a.c(this, menuItem);
            }
            return false;
        }

        @Override // a.b.o.a
        public void c() {
            r rVar = r.this;
            if (rVar.i != this) {
                return;
            }
            if ((rVar.q || rVar.r) ? false : true) {
                this.f.b(this);
            } else {
                r rVar2 = r.this;
                rVar2.j = this;
                rVar2.k = this.f;
            }
            this.f = null;
            r.this.k(false);
            ActionBarContextView actionBarContextView = r.this.f;
            if (actionBarContextView.l == null) {
                actionBarContextView.h();
            }
            r.this.f66e.p().sendAccessibilityEvent(32);
            r rVar3 = r.this;
            rVar3.f64c.setHideOnContentScrollEnabled(rVar3.w);
            r.this.i = null;
        }

        @Override // a.b.o.a
        public View d() {
            WeakReference<View> weakReference = this.g;
            if (weakReference != null) {
                return weakReference.get();
            }
            return null;
        }

        @Override // a.b.o.a
        public Menu e() {
            return this.f71e;
        }

        @Override // a.b.o.a
        public MenuInflater f() {
            return new a.b.o.f(this.f70d);
        }

        @Override // a.b.o.a
        public CharSequence g() {
            return r.this.f.getSubtitle();
        }

        @Override // a.b.o.a
        public CharSequence h() {
            return r.this.f.getTitle();
        }

        @Override // a.b.o.a
        public void i() {
            if (r.this.i != this) {
                return;
            }
            this.f71e.z();
            try {
                this.f.a(this, this.f71e);
            } finally {
                this.f71e.y();
            }
        }

        @Override // a.b.o.a
        public boolean j() {
            return r.this.f.s;
        }

        @Override // a.b.o.a
        public void k(View view) {
            r.this.f.setCustomView(view);
            this.g = new WeakReference<>(view);
        }

        @Override // a.b.o.a
        public void l(int i) throws Resources.NotFoundException {
            r.this.f.setSubtitle(r.this.f62a.getResources().getString(i));
        }

        @Override // a.b.o.a
        public void m(CharSequence charSequence) {
            r.this.f.setSubtitle(charSequence);
        }

        @Override // a.b.o.a
        public void n(int i) throws Resources.NotFoundException {
            r.this.f.setTitle(r.this.f62a.getResources().getString(i));
        }

        @Override // a.b.o.a
        public void o(CharSequence charSequence) {
            r.this.f.setTitle(charSequence);
        }

        @Override // a.b.o.a
        public void p(boolean z) {
            this.f77c = z;
            r.this.f.setTitleOptional(z);
        }
    }

    public r(Activity activity, boolean z) {
        new ArrayList();
        this.m = new ArrayList<>();
        this.o = 0;
        this.p = true;
        this.t = true;
        this.x = new a();
        this.y = new b();
        this.z = new c();
        View decorView = activity.getWindow().getDecorView();
        l(decorView);
        if (z) {
            return;
        }
        this.g = decorView.findViewById(R.id.content);
    }

    public r(Dialog dialog) {
        new ArrayList();
        this.m = new ArrayList<>();
        this.o = 0;
        this.p = true;
        this.t = true;
        this.x = new a();
        this.y = new b();
        this.z = new c();
        l(dialog.getWindow().getDecorView());
    }

    @Override // a.b.k.a
    public boolean a() {
        d0 d0Var = this.f66e;
        if (d0Var == null || !d0Var.m()) {
            return false;
        }
        this.f66e.collapseActionView();
        return true;
    }

    @Override // a.b.k.a
    public void b(boolean z) {
        if (z == this.l) {
            return;
        }
        this.l = z;
        int size = this.m.size();
        for (int i = 0; i < size; i++) {
            this.m.get(i).a(z);
        }
    }

    @Override // a.b.k.a
    public int c() {
        return this.f66e.j();
    }

    @Override // a.b.k.a
    public Context d() {
        if (this.f63b == null) {
            TypedValue typedValue = new TypedValue();
            this.f62a.getTheme().resolveAttribute(a.b.a.actionBarWidgetTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.f63b = new ContextThemeWrapper(this.f62a, i);
            } else {
                this.f63b = this.f62a;
            }
        }
        return this.f63b;
    }

    @Override // a.b.k.a
    public void e(Configuration configuration) {
        m(this.f62a.getResources().getBoolean(a.b.b.abc_action_bar_embed_tabs));
    }

    @Override // a.b.k.a
    public boolean f(int i, KeyEvent keyEvent) {
        a.b.o.i.g gVar;
        d dVar = this.i;
        if (dVar == null || (gVar = dVar.f71e) == null) {
            return false;
        }
        gVar.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return gVar.performShortcut(i, keyEvent, 0);
    }

    @Override // a.b.k.a
    public void g(boolean z) {
        if (this.h) {
            return;
        }
        int i = z ? 4 : 0;
        int iJ = this.f66e.j();
        this.h = true;
        this.f66e.u((i & 4) | (iJ & (-5)));
    }

    @Override // a.b.k.a
    public void h(boolean z) {
        a.b.o.g gVar;
        this.v = z;
        if (z || (gVar = this.u) == null) {
            return;
        }
        gVar.a();
    }

    @Override // a.b.k.a
    public void i(CharSequence charSequence) {
        this.f66e.setWindowTitle(charSequence);
    }

    @Override // a.b.k.a
    public a.b.o.a j(a.InterfaceC0002a interfaceC0002a) {
        d dVar = this.i;
        if (dVar != null) {
            dVar.c();
        }
        this.f64c.setHideOnContentScrollEnabled(false);
        this.f.h();
        d dVar2 = new d(this.f.getContext(), interfaceC0002a);
        dVar2.f71e.z();
        try {
            if (!dVar2.f.d(dVar2, dVar2.f71e)) {
                return null;
            }
            this.i = dVar2;
            dVar2.i();
            this.f.f(dVar2);
            k(true);
            this.f.sendAccessibilityEvent(32);
            return dVar2;
        } finally {
            dVar2.f71e.y();
        }
    }

    public void k(boolean z) {
        a.g.j.o oVarI;
        a.g.j.o oVarE;
        if (z) {
            if (!this.s) {
                this.s = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.f64c;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                n(false);
            }
        } else if (this.s) {
            this.s = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f64c;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            n(false);
        }
        if (!a.g.j.k.m(this.f65d)) {
            if (z) {
                this.f66e.k(4);
                this.f.setVisibility(0);
                return;
            } else {
                this.f66e.k(0);
                this.f.setVisibility(8);
                return;
            }
        }
        if (z) {
            oVarE = this.f66e.i(4, 100L);
            oVarI = this.f.e(0, 200L);
        } else {
            oVarI = this.f66e.i(0, 200L);
            oVarE = this.f.e(8, 100L);
        }
        a.b.o.g gVar = new a.b.o.g();
        gVar.f104a.add(oVarE);
        View view = oVarE.f706a.get();
        long duration = view != null ? view.animate().getDuration() : 0L;
        View view2 = oVarI.f706a.get();
        if (view2 != null) {
            view2.animate().setStartDelay(duration);
        }
        gVar.f104a.add(oVarI);
        gVar.b();
    }

    public final void l(View view) {
        d0 wrapper;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(a.b.f.decor_content_parent);
        this.f64c = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        KeyEvent.Callback callbackFindViewById = view.findViewById(a.b.f.action_bar);
        if (callbackFindViewById instanceof d0) {
            wrapper = (d0) callbackFindViewById;
        } else {
            if (!(callbackFindViewById instanceof Toolbar)) {
                StringBuilder sbE = b.a.a.a.a.e("Can't make a decor toolbar out of ");
                sbE.append(callbackFindViewById != null ? callbackFindViewById.getClass().getSimpleName() : "null");
                throw new IllegalStateException(sbE.toString());
            }
            wrapper = ((Toolbar) callbackFindViewById).getWrapper();
        }
        this.f66e = wrapper;
        this.f = (ActionBarContextView) view.findViewById(a.b.f.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(a.b.f.action_bar_container);
        this.f65d = actionBarContainer;
        d0 d0Var = this.f66e;
        if (d0Var == null || this.f == null || actionBarContainer == null) {
            throw new IllegalStateException(r.class.getSimpleName() + " can only be used with a compatible window decor layout");
        }
        this.f62a = d0Var.t();
        boolean z = (this.f66e.j() & 4) != 0;
        if (z) {
            this.h = true;
        }
        Context context = this.f62a;
        this.f66e.q((context.getApplicationInfo().targetSdkVersion < 14) || z);
        m(context.getResources().getBoolean(a.b.b.abc_action_bar_embed_tabs));
        TypedArray typedArrayObtainStyledAttributes = this.f62a.obtainStyledAttributes(null, a.b.j.ActionBar, a.b.a.actionBarStyle, 0);
        if (typedArrayObtainStyledAttributes.getBoolean(a.b.j.ActionBar_hideOnContentScroll, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f64c;
            if (!actionBarOverlayLayout2.i) {
                throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
            }
            this.w = true;
            actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(a.b.j.ActionBar_elevation, 0);
        if (dimensionPixelSize != 0) {
            a.g.j.k.w(this.f65d, dimensionPixelSize);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void m(boolean z) {
        this.n = z;
        if (z) {
            this.f65d.setTabContainer(null);
            this.f66e.o(null);
        } else {
            this.f66e.o(null);
            this.f65d.setTabContainer(null);
        }
        boolean z2 = this.f66e.v() == 2;
        this.f66e.s(!this.n && z2);
        this.f64c.setHasNonEmbeddedTabs(!this.n && z2);
    }

    public final void n(boolean z) {
        View view;
        View view2;
        View view3;
        if (!(this.s || !this.r)) {
            if (this.t) {
                this.t = false;
                a.b.o.g gVar = this.u;
                if (gVar != null) {
                    gVar.a();
                }
                if (this.o != 0 || (!this.v && !z)) {
                    this.x.a(null);
                    return;
                }
                this.f65d.setAlpha(1.0f);
                this.f65d.setTransitioning(true);
                a.b.o.g gVar2 = new a.b.o.g();
                float f = -this.f65d.getHeight();
                if (z) {
                    this.f65d.getLocationInWindow(new int[]{0, 0});
                    f -= r9[1];
                }
                a.g.j.o oVarA = a.g.j.k.a(this.f65d);
                oVarA.g(f);
                oVarA.f(this.z);
                if (!gVar2.f108e) {
                    gVar2.f104a.add(oVarA);
                }
                if (this.p && (view = this.g) != null) {
                    a.g.j.o oVarA2 = a.g.j.k.a(view);
                    oVarA2.g(f);
                    if (!gVar2.f108e) {
                        gVar2.f104a.add(oVarA2);
                    }
                }
                Interpolator interpolator = A;
                if (!gVar2.f108e) {
                    gVar2.f106c = interpolator;
                }
                if (!gVar2.f108e) {
                    gVar2.f105b = 250L;
                }
                a.g.j.p pVar = this.x;
                if (!gVar2.f108e) {
                    gVar2.f107d = pVar;
                }
                this.u = gVar2;
                gVar2.b();
                return;
            }
            return;
        }
        if (this.t) {
            return;
        }
        this.t = true;
        a.b.o.g gVar3 = this.u;
        if (gVar3 != null) {
            gVar3.a();
        }
        this.f65d.setVisibility(0);
        if (this.o == 0 && (this.v || z)) {
            this.f65d.setTranslationY(0.0f);
            float f2 = -this.f65d.getHeight();
            if (z) {
                this.f65d.getLocationInWindow(new int[]{0, 0});
                f2 -= r9[1];
            }
            this.f65d.setTranslationY(f2);
            a.b.o.g gVar4 = new a.b.o.g();
            a.g.j.o oVarA3 = a.g.j.k.a(this.f65d);
            oVarA3.g(0.0f);
            oVarA3.f(this.z);
            if (!gVar4.f108e) {
                gVar4.f104a.add(oVarA3);
            }
            if (this.p && (view3 = this.g) != null) {
                view3.setTranslationY(f2);
                a.g.j.o oVarA4 = a.g.j.k.a(this.g);
                oVarA4.g(0.0f);
                if (!gVar4.f108e) {
                    gVar4.f104a.add(oVarA4);
                }
            }
            Interpolator interpolator2 = B;
            if (!gVar4.f108e) {
                gVar4.f106c = interpolator2;
            }
            if (!gVar4.f108e) {
                gVar4.f105b = 250L;
            }
            a.g.j.p pVar2 = this.y;
            if (!gVar4.f108e) {
                gVar4.f107d = pVar2;
            }
            this.u = gVar4;
            gVar4.b();
        } else {
            this.f65d.setAlpha(1.0f);
            this.f65d.setTranslationY(0.0f);
            if (this.p && (view2 = this.g) != null) {
                view2.setTranslationY(0.0f);
            }
            this.y.a(null);
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f64c;
        if (actionBarOverlayLayout != null) {
            a.g.j.k.s(actionBarOverlayLayout);
        }
    }
}
