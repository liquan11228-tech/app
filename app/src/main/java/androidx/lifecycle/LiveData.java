package androidx.lifecycle;

import a.c.a.b.b;
import a.k.d;
import a.k.g;
import a.k.h;
import a.k.m;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class LiveData<T> {
    public static final Object i = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final Object f1056a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public b<m<? super T>, LiveData<T>.a> f1057b = new b<>();

    /* renamed from: c, reason: collision with root package name */
    public int f1058c = 0;

    /* renamed from: d, reason: collision with root package name */
    public volatile Object f1059d = i;

    /* renamed from: e, reason: collision with root package name */
    public volatile Object f1060e = i;
    public int f = -1;
    public boolean g;
    public boolean h;

    public class LifecycleBoundObserver extends LiveData<T>.a implements Object {

        /* renamed from: e, reason: collision with root package name */
        public final g f1061e;
        public final /* synthetic */ LiveData f;

        public void g(g gVar, d.a aVar) {
            if (((h) this.f1061e.a()).f876b == d.b.DESTROYED) {
                this.f.f(this.f1062a);
            } else {
                h(i());
            }
        }

        @Override // androidx.lifecycle.LiveData.a
        public boolean i() {
            return ((h) this.f1061e.a()).f876b.compareTo(d.b.STARTED) >= 0;
        }
    }

    public abstract class a {

        /* renamed from: a, reason: collision with root package name */
        public final m<? super T> f1062a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f1063b;

        /* renamed from: c, reason: collision with root package name */
        public int f1064c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ LiveData f1065d;

        public void h(boolean z) {
            if (z == this.f1063b) {
                return;
            }
            this.f1063b = z;
            boolean z2 = this.f1065d.f1058c == 0;
            this.f1065d.f1058c += this.f1063b ? 1 : -1;
            if (z2 && this.f1063b) {
                this.f1065d.d();
            }
            LiveData liveData = this.f1065d;
            if (liveData.f1058c == 0 && !this.f1063b) {
                liveData.e();
            }
            if (this.f1063b) {
                this.f1065d.c(this);
            }
        }

        public abstract boolean i();
    }

    public static void a(String str) {
        if (a.c.a.a.a.b().f362a.a()) {
            return;
        }
        throw new IllegalStateException("Cannot invoke " + str + " on a background thread");
    }

    public final void b(LiveData<T>.a aVar) {
        if (aVar.f1063b) {
            if (!aVar.i()) {
                aVar.h(false);
                return;
            }
            int i2 = aVar.f1064c;
            int i3 = this.f;
            if (i2 >= i3) {
                return;
            }
            aVar.f1064c = i3;
            aVar.f1062a.a((Object) this.f1059d);
        }
    }

    public void c(LiveData<T>.a aVar) {
        if (this.g) {
            this.h = true;
            return;
        }
        this.g = true;
        do {
            this.h = false;
            if (aVar != null) {
                b(aVar);
                aVar = null;
            } else {
                b<m<? super T>, LiveData<T>.a>.d dVarB = this.f1057b.b();
                while (dVarB.hasNext()) {
                    b((a) ((Map.Entry) dVarB.next()).getValue());
                    if (this.h) {
                        break;
                    }
                }
            }
        } while (this.h);
        this.g = false;
    }

    public void d() {
    }

    public void e() {
    }

    public void f(m<? super T> mVar) {
        a("removeObserver");
        LiveData<T>.a aVarD = this.f1057b.d(mVar);
        if (aVarD == null) {
            return;
        }
        LifecycleBoundObserver lifecycleBoundObserver = (LifecycleBoundObserver) aVarD;
        ((h) lifecycleBoundObserver.f1061e.a()).f875a.d(lifecycleBoundObserver);
        aVarD.h(false);
    }
}
