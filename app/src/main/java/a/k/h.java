package a.k;

import a.c.a.b.b;
import a.k.d;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class h extends d {

    /* renamed from: c, reason: collision with root package name */
    public final WeakReference<g> f877c;

    /* renamed from: a, reason: collision with root package name */
    public a.c.a.b.a<f, a> f875a = new a.c.a.b.a<>();

    /* renamed from: d, reason: collision with root package name */
    public int f878d = 0;

    /* renamed from: e, reason: collision with root package name */
    public boolean f879e = false;
    public boolean f = false;
    public ArrayList<d.b> g = new ArrayList<>();

    /* renamed from: b, reason: collision with root package name */
    public d.b f876b = d.b.INITIALIZED;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public d.b f880a;

        /* renamed from: b, reason: collision with root package name */
        public e f881b;

        public a(f fVar, d.b bVar) {
            this.f881b = j.d(fVar);
            this.f880a = bVar;
        }

        public void a(g gVar, d.a aVar) {
            d.b bVarC = h.c(aVar);
            this.f880a = h.e(this.f880a, bVarC);
            this.f881b.g(gVar, aVar);
            this.f880a = bVarC;
        }
    }

    public h(g gVar) {
        this.f877c = new WeakReference<>(gVar);
    }

    public static d.b c(d.a aVar) {
        int iOrdinal = aVar.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                if (iOrdinal == 2) {
                    return d.b.RESUMED;
                }
                if (iOrdinal != 3) {
                    if (iOrdinal != 4) {
                        if (iOrdinal == 5) {
                            return d.b.DESTROYED;
                        }
                        throw new IllegalArgumentException("Unexpected event value " + aVar);
                    }
                }
            }
            return d.b.STARTED;
        }
        return d.b.CREATED;
    }

    public static d.b e(d.b bVar, d.b bVar2) {
        return (bVar2 == null || bVar2.compareTo(bVar) >= 0) ? bVar : bVar2;
    }

    public static d.a i(d.b bVar) {
        int iOrdinal = bVar.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1) {
            return d.a.ON_CREATE;
        }
        if (iOrdinal == 2) {
            return d.a.ON_START;
        }
        if (iOrdinal == 3) {
            return d.a.ON_RESUME;
        }
        if (iOrdinal == 4) {
            throw new IllegalArgumentException();
        }
        throw new IllegalArgumentException("Unexpected state value " + bVar);
    }

    @Override // a.k.d
    public void a(f fVar) {
        g gVar;
        d.b bVar = this.f876b;
        d.b bVar2 = d.b.DESTROYED;
        if (bVar != bVar2) {
            bVar2 = d.b.INITIALIZED;
        }
        a aVar = new a(fVar, bVar2);
        if (this.f875a.e(fVar, aVar) == null && (gVar = this.f877c.get()) != null) {
            boolean z = this.f878d != 0 || this.f879e;
            d.b bVarB = b(fVar);
            this.f878d++;
            while (aVar.f880a.compareTo(bVarB) < 0 && this.f875a.f.containsKey(fVar)) {
                this.g.add(aVar.f880a);
                aVar.a(gVar, i(aVar.f880a));
                g();
                bVarB = b(fVar);
            }
            if (!z) {
                h();
            }
            this.f878d--;
        }
    }

    public final d.b b(f fVar) {
        a.c.a.b.a<f, a> aVar = this.f875a;
        d.b bVar = null;
        b.c<f, a> cVar = aVar.f.containsKey(fVar) ? aVar.f.get(fVar).f374e : null;
        d.b bVar2 = cVar != null ? cVar.getValue().f880a : null;
        if (!this.g.isEmpty()) {
            bVar = this.g.get(r0.size() - 1);
        }
        return e(e(this.f876b, bVar2), bVar);
    }

    public void d(d.a aVar) {
        f(c(aVar));
    }

    public final void f(d.b bVar) {
        if (this.f876b == bVar) {
            return;
        }
        this.f876b = bVar;
        if (this.f879e || this.f878d != 0) {
            this.f = true;
            return;
        }
        this.f879e = true;
        h();
        this.f879e = false;
    }

    public final void g() {
        this.g.remove(r0.size() - 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h() {
        /*
            Method dump skipped, instructions count: 317
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a.k.h.h():void");
    }
}
