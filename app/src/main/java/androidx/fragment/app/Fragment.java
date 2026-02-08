package androidx.fragment.app;

import a.b.k.h;
import a.j.a.d;
import a.j.a.e0;
import a.j.a.i;
import a.j.a.j;
import a.j.a.o;
import a.k.d;
import a.k.e;
import a.k.g;
import a.k.h;
import a.k.l;
import a.k.s;
import a.k.t;
import android.animation.Animator;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import java.lang.reflect.InvocationTargetException;
import java.util.UUID;

/* loaded from: classes.dex */
public class Fragment implements ComponentCallbacks, View.OnCreateContextMenuListener, g, t, a.m.c {
    public static final Object V = new Object();
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean E;
    public ViewGroup F;
    public View G;
    public View H;
    public boolean I;
    public b K;
    public boolean L;
    public boolean M;
    public float N;
    public LayoutInflater O;
    public boolean P;
    public h R;
    public e0 S;
    public a.m.b U;

    /* renamed from: c */
    public Bundle f1043c;

    /* renamed from: d */
    public SparseArray<Parcelable> f1044d;

    /* renamed from: e */
    public Boolean f1045e;
    public Bundle g;
    public Fragment h;
    public int j;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public int r;
    public j s;
    public a.j.a.h t;
    public Fragment v;
    public int w;
    public int x;
    public String y;
    public boolean z;

    /* renamed from: b */
    public int f1042b = 0;
    public String f = UUID.randomUUID().toString();
    public String i = null;
    public Boolean k = null;
    public j u = new j();
    public boolean D = true;
    public boolean J = true;
    public d.b Q = d.b.RESUMED;
    public l<g> T = new l<>();

    /* renamed from: androidx.fragment.app.Fragment$2 */
    public class AnonymousClass2 implements e {
        public AnonymousClass2() {
        }

        @Override // a.k.e
        public void g(g gVar, d.a aVar) {
            View view;
            if (aVar != d.a.ON_STOP || (view = Fragment.this.G) == null) {
                return;
            }
            view.cancelPendingInputEvents();
        }
    }

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Fragment.this.b();
        }
    }

    public static class b {

        /* renamed from: a */
        public View f1048a;

        /* renamed from: b */
        public Animator f1049b;

        /* renamed from: c */
        public int f1050c;

        /* renamed from: d */
        public int f1051d;

        /* renamed from: e */
        public int f1052e;
        public int f;
        public Object g = null;
        public Object h;
        public Object i;
        public Object j;
        public Object k;
        public Object l;
        public Boolean m;
        public Boolean n;
        public a.g.c.h o;
        public a.g.c.h p;
        public boolean q;
        public d r;
        public boolean s;

        public b() {
            Object obj = Fragment.V;
            this.h = obj;
            this.i = null;
            this.j = obj;
            this.k = null;
            this.l = obj;
            this.o = null;
            this.p = null;
        }
    }

    public static class c extends RuntimeException {
        public c(String str, Exception exc) {
            super(str, exc);
        }
    }

    public interface d {
    }

    public Fragment() {
        r();
    }

    @Deprecated
    public static Fragment s(Context context, String str, Bundle bundle) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        try {
            Fragment fragmentNewInstance = a.j.a.g.d(context.getClassLoader(), str).getConstructor(new Class[0]).newInstance(new Object[0]);
            if (bundle != null) {
                bundle.setClassLoader(fragmentNewInstance.getClass().getClassLoader());
                fragmentNewInstance.E(bundle);
            }
            return fragmentNewInstance;
        } catch (IllegalAccessException e2) {
            throw new c(b.a.a.a.a.c("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e2);
        } catch (InstantiationException e3) {
            throw new c(b.a.a.a.a.c("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e3);
        } catch (NoSuchMethodException e4) {
            throw new c(b.a.a.a.a.c("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e4);
        } catch (InvocationTargetException e5) {
            throw new c(b.a.a.a.a.c("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e5);
        }
    }

    public boolean A(Menu menu) {
        if (this.z) {
            return false;
        }
        return false | this.u.I(menu);
    }

    public final View B() {
        View view = this.G;
        if (view != null) {
            return view;
        }
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    public void C(View view) {
        f().f1048a = view;
    }

    public void D(Animator animator) {
        f().f1049b = animator;
    }

    public void E(Bundle bundle) {
        j jVar = this.s;
        if (jVar != null) {
            if (jVar == null ? false : jVar.T()) {
                throw new IllegalStateException("Fragment already added and state has been saved");
            }
        }
        this.g = bundle;
    }

    public void F(boolean z) {
        f().s = z;
    }

    public void G(int i) {
        if (this.K == null && i == 0) {
            return;
        }
        f().f1051d = i;
    }

    public void H(d dVar) {
        f();
        d dVar2 = this.K.r;
        if (dVar == dVar2) {
            return;
        }
        if (dVar != null && dVar2 != null) {
            throw new IllegalStateException("Trying to set a replacement startPostponedEnterTransition on " + this);
        }
        b bVar = this.K;
        if (bVar.q) {
            bVar.r = dVar;
        }
        if (dVar != null) {
            ((j.h) dVar).f800c++;
        }
    }

    public void I() {
        j jVar = this.s;
        if (jVar == null || jVar.p == null) {
            f().q = false;
        } else if (Looper.myLooper() != this.s.p.f781d.getLooper()) {
            this.s.p.f781d.postAtFrontOfQueue(new a());
        } else {
            b();
        }
    }

    @Override // a.k.g
    public a.k.d a() {
        return this.R;
    }

    public void b() {
        b bVar = this.K;
        Object obj = null;
        boolean z = false;
        if (bVar != null) {
            bVar.q = false;
            Object obj2 = bVar.r;
            bVar.r = null;
            obj = obj2;
        }
        if (obj != null) {
            j.h hVar = (j.h) obj;
            int i = hVar.f800c - 1;
            hVar.f800c = i;
            if (i != 0) {
                return;
            }
            j jVar = hVar.f799b.r;
            synchronized (jVar) {
                if (jVar.D != null && !jVar.D.isEmpty()) {
                    z = true;
                }
                if (z) {
                    jVar.p.f781d.removeCallbacks(jVar.F);
                    jVar.p.f781d.post(jVar.F);
                    jVar.l0();
                }
            }
        }
    }

    @Override // a.m.c
    public final a.m.a d() {
        return this.U.f896b;
    }

    @Override // a.k.t
    public s e() {
        j jVar = this.s;
        if (jVar == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        o oVar = jVar.E;
        s sVar = oVar.f818d.get(this.f);
        if (sVar != null) {
            return sVar;
        }
        s sVar2 = new s();
        oVar.f818d.put(this.f, sVar2);
        return sVar2;
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    public final b f() {
        if (this.K == null) {
            this.K = new b();
        }
        return this.K;
    }

    public Fragment g(String str) {
        return str.equals(this.f) ? this : this.u.P(str);
    }

    public View h() {
        b bVar = this.K;
        if (bVar == null) {
            return null;
        }
        return bVar.f1048a;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public Animator i() {
        b bVar = this.K;
        if (bVar == null) {
            return null;
        }
        return bVar.f1049b;
    }

    public final i j() {
        if (this.t != null) {
            return this.u;
        }
        throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    public Object k() {
        b bVar = this.K;
        if (bVar == null) {
            return null;
        }
        return bVar.g;
    }

    public Object l() {
        b bVar = this.K;
        if (bVar == null) {
            return null;
        }
        return bVar.i;
    }

    public int m() {
        b bVar = this.K;
        if (bVar == null) {
            return 0;
        }
        return bVar.f1051d;
    }

    public int n() {
        b bVar = this.K;
        if (bVar == null) {
            return 0;
        }
        return bVar.f1052e;
    }

    public int o() {
        b bVar = this.K;
        if (bVar == null) {
            return 0;
        }
        return bVar.f;
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.E = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        a.j.a.h hVar = this.t;
        a.j.a.d dVar = hVar == null ? null : (a.j.a.d) hVar.f779b;
        if (dVar != null) {
            dVar.onCreateContextMenu(contextMenu, view, contextMenuInfo);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        this.E = true;
    }

    public Object p() {
        b bVar = this.K;
        if (bVar == null) {
            return null;
        }
        return bVar.k;
    }

    public int q() {
        b bVar = this.K;
        if (bVar == null) {
            return 0;
        }
        return bVar.f1050c;
    }

    public final void r() {
        this.R = new h(this);
        this.U = new a.m.b(this);
        this.R.a(new e() { // from class: androidx.fragment.app.Fragment.2
            public AnonymousClass2() {
            }

            @Override // a.k.e
            public void g(g gVar, d.a aVar) {
                View view;
                if (aVar != d.a.ON_STOP || (view = Fragment.this.G) == null) {
                    return;
                }
                view.cancelPendingInputEvents();
            }
        });
    }

    public boolean t() {
        b bVar = this.K;
        if (bVar == null) {
            return false;
        }
        return bVar.s;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        h.i.i(this, sb);
        sb.append(" (");
        sb.append(this.f);
        sb.append(")");
        if (this.w != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.w));
        }
        if (this.y != null) {
            sb.append(" ");
            sb.append(this.y);
        }
        sb.append('}');
        return sb.toString();
    }

    public final boolean u() {
        return this.r > 0;
    }

    public void v(AttributeSet attributeSet, Bundle bundle) {
        this.E = true;
        a.j.a.h hVar = this.t;
        if ((hVar == null ? null : hVar.f779b) != null) {
            this.E = false;
            this.E = true;
        }
    }

    public boolean w(Menu menu, MenuInflater menuInflater) {
        if (this.z) {
            return false;
        }
        return false | this.u.m(menu, menuInflater);
    }

    public void x(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.u.a0();
        this.q = true;
        e0 e0Var = new e0();
        this.S = e0Var;
        this.G = null;
        if (e0Var.f776b != null) {
            throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
        }
        this.S = null;
    }

    public LayoutInflater y(Bundle bundle) {
        a.j.a.h hVar = this.t;
        if (hVar == null) {
            throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
        }
        d.a aVar = (d.a) hVar;
        LayoutInflater layoutInflaterCloneInContext = a.j.a.d.this.getLayoutInflater().cloneInContext(a.j.a.d.this);
        j jVar = this.u;
        if (jVar == null) {
            throw null;
        }
        layoutInflaterCloneInContext.setFactory2(jVar);
        this.O = layoutInflaterCloneInContext;
        return layoutInflaterCloneInContext;
    }

    public void z() {
        this.E = true;
        this.u.o();
    }
}
