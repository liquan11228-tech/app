package d.n0.h;

import d.a0;
import d.e0;
import d.g0;
import java.util.List;

/* loaded from: classes.dex */
public final class g implements a0.a {

    /* renamed from: a, reason: collision with root package name */
    public int f1501a;

    /* renamed from: b, reason: collision with root package name */
    public final d.n0.g.e f1502b;

    /* renamed from: c, reason: collision with root package name */
    public final List<a0> f1503c;

    /* renamed from: d, reason: collision with root package name */
    public final int f1504d;

    /* renamed from: e, reason: collision with root package name */
    public final d.n0.g.c f1505e;
    public final e0 f;
    public final int g;
    public final int h;
    public final int i;

    /* JADX WARN: Multi-variable type inference failed */
    public g(d.n0.g.e eVar, List<? extends a0> list, int i, d.n0.g.c cVar, e0 e0Var, int i2, int i3, int i4) {
        c.j.b.d.d(eVar, "call");
        c.j.b.d.d(list, "interceptors");
        c.j.b.d.d(e0Var, "request");
        this.f1502b = eVar;
        this.f1503c = list;
        this.f1504d = i;
        this.f1505e = cVar;
        this.f = e0Var;
        this.g = i2;
        this.h = i3;
        this.i = i4;
    }

    public static g c(g gVar, int i, d.n0.g.c cVar, e0 e0Var, int i2, int i3, int i4, int i5) {
        int i6 = (i5 & 1) != 0 ? gVar.f1504d : i;
        d.n0.g.c cVar2 = (i5 & 2) != 0 ? gVar.f1505e : cVar;
        e0 e0Var2 = (i5 & 4) != 0 ? gVar.f : e0Var;
        int i7 = (i5 & 8) != 0 ? gVar.g : i2;
        int i8 = (i5 & 16) != 0 ? gVar.h : i3;
        int i9 = (i5 & 32) != 0 ? gVar.i : i4;
        c.j.b.d.d(e0Var2, "request");
        return new g(gVar.f1502b, gVar.f1503c, i6, cVar2, e0Var2, i7, i8, i9);
    }

    @Override // d.a0.a
    public e0 a() {
        return this.f;
    }

    @Override // d.a0.a
    public g0 b(e0 e0Var) {
        c.j.b.d.d(e0Var, "request");
        if (!(this.f1504d < this.f1503c.size())) {
            throw new IllegalStateException("Check failed.".toString());
        }
        this.f1501a++;
        d.n0.g.c cVar = this.f1505e;
        if (cVar != null) {
            if (!cVar.f1448e.b(e0Var.f1351b)) {
                StringBuilder sbE = b.a.a.a.a.e("network interceptor ");
                sbE.append(this.f1503c.get(this.f1504d - 1));
                sbE.append(" must retain the same host and port");
                throw new IllegalStateException(sbE.toString().toString());
            }
            if (!(this.f1501a == 1)) {
                StringBuilder sbE2 = b.a.a.a.a.e("network interceptor ");
                sbE2.append(this.f1503c.get(this.f1504d - 1));
                sbE2.append(" must call proceed() exactly once");
                throw new IllegalStateException(sbE2.toString().toString());
            }
        }
        g gVarC = c(this, this.f1504d + 1, null, e0Var, 0, 0, 0, 58);
        a0 a0Var = this.f1503c.get(this.f1504d);
        g0 g0VarA = a0Var.a(gVarC);
        if (g0VarA == null) {
            throw new NullPointerException("interceptor " + a0Var + " returned null");
        }
        if (this.f1505e != null) {
            if (!(this.f1504d + 1 >= this.f1503c.size() || gVarC.f1501a == 1)) {
                throw new IllegalStateException(("network interceptor " + a0Var + " must call proceed() exactly once").toString());
            }
        }
        if (g0VarA.h != null) {
            return g0VarA;
        }
        throw new IllegalStateException(("interceptor " + a0Var + " returned a response with no body").toString());
    }

    @Override // d.a0.a
    public d.f call() {
        return this.f1502b;
    }
}
