package a.b.o.i;

import a.b.o.i.m;
import a.b.p.l0;
import a.b.p.m0;
import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.os.SystemClock;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class d extends k implements m, View.OnKeyListener, PopupWindow.OnDismissListener {
    public static final int C = a.b.g.abc_cascading_menu_item_layout;
    public PopupWindow.OnDismissListener A;
    public boolean B;

    /* renamed from: c, reason: collision with root package name */
    public final Context f125c;

    /* renamed from: d, reason: collision with root package name */
    public final int f126d;

    /* renamed from: e, reason: collision with root package name */
    public final int f127e;
    public final int f;
    public final boolean g;
    public final Handler h;
    public View p;
    public View q;
    public int r;
    public boolean s;
    public boolean t;
    public int u;
    public int v;
    public boolean x;
    public m.a y;
    public ViewTreeObserver z;
    public final List<g> i = new ArrayList();
    public final List<C0003d> j = new ArrayList();
    public final ViewTreeObserver.OnGlobalLayoutListener k = new a();
    public final View.OnAttachStateChangeListener l = new b();
    public final l0 m = new c();
    public int n = 0;
    public int o = 0;
    public boolean w = false;

    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            if (!d.this.a() || d.this.j.size() <= 0 || d.this.j.get(0).f135a.B) {
                return;
            }
            View view = d.this.q;
            if (view == null || !view.isShown()) {
                d.this.dismiss();
                return;
            }
            Iterator<C0003d> it = d.this.j.iterator();
            while (it.hasNext()) {
                it.next().f135a.i();
            }
        }
    }

    public class b implements View.OnAttachStateChangeListener {
        public b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = d.this.z;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    d.this.z = view.getViewTreeObserver();
                }
                d dVar = d.this;
                dVar.z.removeGlobalOnLayoutListener(dVar.k);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public class c implements l0 {

        public class a implements Runnable {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ C0003d f131b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ MenuItem f132c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ g f133d;

            public a(C0003d c0003d, MenuItem menuItem, g gVar) {
                this.f131b = c0003d;
                this.f132c = menuItem;
                this.f133d = gVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                C0003d c0003d = this.f131b;
                if (c0003d != null) {
                    d.this.B = true;
                    c0003d.f136b.c(false);
                    d.this.B = false;
                }
                if (this.f132c.isEnabled() && this.f132c.hasSubMenu()) {
                    this.f133d.r(this.f132c, 4);
                }
            }
        }

        public c() {
        }

        @Override // a.b.p.l0
        public void g(g gVar, MenuItem menuItem) {
            d.this.h.removeCallbacksAndMessages(null);
            int size = d.this.j.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    i = -1;
                    break;
                } else if (gVar == d.this.j.get(i).f136b) {
                    break;
                } else {
                    i++;
                }
            }
            if (i == -1) {
                return;
            }
            int i2 = i + 1;
            d.this.h.postAtTime(new a(i2 < d.this.j.size() ? d.this.j.get(i2) : null, menuItem, gVar), gVar, SystemClock.uptimeMillis() + 200);
        }

        @Override // a.b.p.l0
        public void k(g gVar, MenuItem menuItem) {
            d.this.h.removeCallbacksAndMessages(gVar);
        }
    }

    /* renamed from: a.b.o.i.d$d, reason: collision with other inner class name */
    public static class C0003d {

        /* renamed from: a, reason: collision with root package name */
        public final m0 f135a;

        /* renamed from: b, reason: collision with root package name */
        public final g f136b;

        /* renamed from: c, reason: collision with root package name */
        public final int f137c;

        public C0003d(m0 m0Var, g gVar, int i) {
            this.f135a = m0Var;
            this.f136b = gVar;
            this.f137c = i;
        }
    }

    public d(Context context, View view, int i, int i2, boolean z) {
        this.f125c = context;
        this.p = view;
        this.f127e = i;
        this.f = i2;
        this.g = z;
        this.r = a.g.j.k.f(view) != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.f126d = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(a.b.d.abc_config_prefDialogWidth));
        this.h = new Handler();
    }

    @Override // a.b.o.i.p
    public boolean a() {
        return this.j.size() > 0 && this.j.get(0).f135a.a();
    }

    @Override // a.b.o.i.m
    public void b(g gVar, boolean z) {
        int size = this.j.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (gVar == this.j.get(i).f136b) {
                break;
            } else {
                i++;
            }
        }
        if (i < 0) {
            return;
        }
        int i2 = i + 1;
        if (i2 < this.j.size()) {
            this.j.get(i2).f136b.c(false);
        }
        C0003d c0003dRemove = this.j.remove(i);
        c0003dRemove.f136b.u(this);
        if (this.B) {
            c0003dRemove.f135a.C.setExitTransition(null);
            c0003dRemove.f135a.C.setAnimationStyle(0);
        }
        c0003dRemove.f135a.dismiss();
        int size2 = this.j.size();
        this.r = size2 > 0 ? this.j.get(size2 - 1).f137c : a.g.j.k.f(this.p) == 1 ? 0 : 1;
        if (size2 != 0) {
            if (z) {
                this.j.get(0).f136b.c(false);
                return;
            }
            return;
        }
        dismiss();
        m.a aVar = this.y;
        if (aVar != null) {
            aVar.b(gVar, true);
        }
        ViewTreeObserver viewTreeObserver = this.z;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.z.removeGlobalOnLayoutListener(this.k);
            }
            this.z = null;
        }
        this.q.removeOnAttachStateChangeListener(this.l);
        this.A.onDismiss();
    }

    @Override // a.b.o.i.m
    public void d(m.a aVar) {
        this.y = aVar;
    }

    @Override // a.b.o.i.p
    public void dismiss() {
        int size = this.j.size();
        if (size > 0) {
            C0003d[] c0003dArr = (C0003d[]) this.j.toArray(new C0003d[size]);
            for (int i = size - 1; i >= 0; i--) {
                C0003d c0003d = c0003dArr[i];
                if (c0003d.f135a.a()) {
                    c0003d.f135a.dismiss();
                }
            }
        }
    }

    @Override // a.b.o.i.p
    public ListView e() {
        if (this.j.isEmpty()) {
            return null;
        }
        return this.j.get(r0.size() - 1).f135a.f260d;
    }

    @Override // a.b.o.i.m
    public boolean f(r rVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        for (C0003d c0003d : this.j) {
            if (rVar == c0003d.f136b) {
                c0003d.f135a.f260d.requestFocus();
                return true;
            }
        }
        if (!rVar.hasVisibleItems()) {
            return false;
        }
        rVar.b(this, this.f125c);
        if (a()) {
            w(rVar);
        } else {
            this.i.add(rVar);
        }
        m.a aVar = this.y;
        if (aVar != null) {
            aVar.c(rVar);
        }
        return true;
    }

    @Override // a.b.o.i.m
    public boolean g() {
        return false;
    }

    @Override // a.b.o.i.m
    public void h(boolean z) {
        Iterator<C0003d> it = this.j.iterator();
        while (it.hasNext()) {
            ListAdapter adapter = it.next().f135a.f260d.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((f) adapter).notifyDataSetChanged();
        }
    }

    @Override // a.b.o.i.p
    public void i() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (a()) {
            return;
        }
        Iterator<g> it = this.i.iterator();
        while (it.hasNext()) {
            w(it.next());
        }
        this.i.clear();
        View view = this.p;
        this.q = view;
        if (view != null) {
            boolean z = this.z == null;
            ViewTreeObserver viewTreeObserver = this.q.getViewTreeObserver();
            this.z = viewTreeObserver;
            if (z) {
                viewTreeObserver.addOnGlobalLayoutListener(this.k);
            }
            this.q.addOnAttachStateChangeListener(this.l);
        }
    }

    @Override // a.b.o.i.k
    public void l(g gVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        gVar.b(this, this.f125c);
        if (a()) {
            w(gVar);
        } else {
            this.i.add(gVar);
        }
    }

    @Override // a.b.o.i.k
    public boolean m() {
        return false;
    }

    @Override // a.b.o.i.k
    public void o(View view) {
        if (this.p != view) {
            this.p = view;
            this.o = Gravity.getAbsoluteGravity(this.n, a.g.j.k.f(view));
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        C0003d c0003d;
        int size = this.j.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                c0003d = null;
                break;
            }
            c0003d = this.j.get(i);
            if (!c0003d.f135a.a()) {
                break;
            } else {
                i++;
            }
        }
        if (c0003d != null) {
            c0003d.f136b.c(false);
        }
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // a.b.o.i.k
    public void p(boolean z) {
        this.w = z;
    }

    @Override // a.b.o.i.k
    public void q(int i) {
        if (this.n != i) {
            this.n = i;
            this.o = Gravity.getAbsoluteGravity(i, a.g.j.k.f(this.p));
        }
    }

    @Override // a.b.o.i.k
    public void r(int i) {
        this.s = true;
        this.u = i;
    }

    @Override // a.b.o.i.k
    public void s(PopupWindow.OnDismissListener onDismissListener) {
        this.A = onDismissListener;
    }

    @Override // a.b.o.i.k
    public void t(boolean z) {
        this.x = z;
    }

    @Override // a.b.o.i.k
    public void u(int i) {
        this.t = true;
        this.v = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x016f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void w(a.b.o.i.g r17) throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 460
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a.b.o.i.d.w(a.b.o.i.g):void");
    }
}
