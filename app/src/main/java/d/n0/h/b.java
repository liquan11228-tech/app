package d.n0.h;

import a.b.k.h;
import d.a0;
import d.d0;
import d.e0;
import d.f0;
import d.g0;
import d.i0;
import d.n0.g.c;
import d.u;
import d.x;
import d.y;
import e.s;
import java.io.IOException;
import java.net.ProtocolException;

/* loaded from: classes.dex */
public final class b implements a0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f1495a;

    public b(boolean z) {
        this.f1495a = z;
    }

    @Override // d.a0
    public g0 a(a0.a aVar) throws Throwable {
        g0.a aVarD;
        int i;
        g0 g0Var;
        boolean z;
        c.j.b.d.d(aVar, "chain");
        g gVar = (g) aVar;
        d.n0.g.c cVar = gVar.f1505e;
        c.j.b.d.b(cVar);
        e0 e0Var = gVar.f;
        f0 f0Var = e0Var.f1354e;
        long jCurrentTimeMillis = System.currentTimeMillis();
        c.j.b.d.d(e0Var, "request");
        try {
            u uVar = cVar.f1447d;
            d.n0.g.e eVar = cVar.f1446c;
            if (uVar == null) {
                throw null;
            }
            c.j.b.d.d(eVar, "call");
            cVar.f.b(e0Var);
            u uVar2 = cVar.f1447d;
            d.n0.g.e eVar2 = cVar.f1446c;
            if (uVar2 == null) {
                throw null;
            }
            c.j.b.d.d(eVar2, "call");
            c.j.b.d.d(e0Var, "request");
            boolean z2 = true;
            if (!f.a(e0Var.f1352c) || f0Var == null) {
                cVar.f1446c.g(cVar, true, false, null);
                aVarD = null;
            } else {
                if (c.m.e.e("100-continue", e0Var.b("Expect"), true)) {
                    try {
                        cVar.f.c();
                        aVarD = cVar.d(true);
                        cVar.e();
                        z = false;
                    } catch (IOException e2) {
                        cVar.f1447d.b(cVar.f1446c, e2);
                        cVar.f(e2);
                        throw e2;
                    }
                } else {
                    z = true;
                    aVarD = null;
                }
                if (aVarD == null) {
                    e.f fVarG = h.i.g(cVar.b(e0Var, false));
                    f0Var.c(fVarG);
                    ((s) fVarG).close();
                } else {
                    cVar.f1446c.g(cVar, true, false, null);
                    if (!cVar.f1445b.j()) {
                        cVar.f.h().l();
                    }
                }
                z2 = z;
            }
            try {
                cVar.f.a();
                if (aVarD == null) {
                    aVarD = cVar.d(false);
                    c.j.b.d.b(aVarD);
                    if (z2) {
                        cVar.e();
                        z2 = false;
                    }
                }
                aVarD.g(e0Var);
                aVarD.f1369e = cVar.f1445b.f1476d;
                aVarD.k = jCurrentTimeMillis;
                aVarD.l = System.currentTimeMillis();
                g0 g0VarA = aVarD.a();
                int i2 = g0VarA.f1364e;
                if (i2 == 100) {
                    g0.a aVarD2 = cVar.d(false);
                    c.j.b.d.b(aVarD2);
                    if (z2) {
                        cVar.e();
                    }
                    aVarD2.g(e0Var);
                    aVarD2.f1369e = cVar.f1445b.f1476d;
                    aVarD2.k = jCurrentTimeMillis;
                    aVarD2.l = System.currentTimeMillis();
                    g0VarA = aVarD2.a();
                    i2 = g0VarA.f1364e;
                }
                c.j.b.d.d(g0VarA, "response");
                u uVar3 = cVar.f1447d;
                d.n0.g.e eVar3 = cVar.f1446c;
                if (uVar3 == null) {
                    throw null;
                }
                c.j.b.d.d(eVar3, "call");
                c.j.b.d.d(g0VarA, "response");
                if (this.f1495a && i2 == 101) {
                    c.j.b.d.d(g0VarA, "response");
                    e0 e0Var2 = g0VarA.f1361b;
                    d0 d0Var = g0VarA.f1362c;
                    int i3 = g0VarA.f1364e;
                    String str = g0VarA.f1363d;
                    x xVar = g0VarA.f;
                    y.a aVarC = g0VarA.g.c();
                    g0 g0Var2 = g0VarA.i;
                    g0 g0Var3 = g0VarA.j;
                    g0 g0Var4 = g0VarA.k;
                    long j = g0VarA.l;
                    i = i2;
                    long j2 = g0VarA.m;
                    d.n0.g.c cVar2 = g0VarA.n;
                    i0 i0Var = d.n0.c.f1413c;
                    if (!(i3 >= 0)) {
                        throw new IllegalStateException(b.a.a.a.a.a("code < 0: ", i3).toString());
                    }
                    if (e0Var2 == null) {
                        throw new IllegalStateException("request == null".toString());
                    }
                    if (d0Var == null) {
                        throw new IllegalStateException("protocol == null".toString());
                    }
                    if (str == null) {
                        throw new IllegalStateException("message == null".toString());
                    }
                    g0Var = new g0(e0Var2, d0Var, str, i3, xVar, aVarC.b(), i0Var, g0Var2, g0Var3, g0Var4, j, j2, cVar2);
                } else {
                    i = i2;
                    c.j.b.d.d(g0VarA, "response");
                    e0 e0Var3 = g0VarA.f1361b;
                    d0 d0Var2 = g0VarA.f1362c;
                    int i4 = g0VarA.f1364e;
                    String str2 = g0VarA.f1363d;
                    x xVar2 = g0VarA.f;
                    y.a aVarC2 = g0VarA.g.c();
                    g0 g0Var5 = g0VarA.i;
                    g0 g0Var6 = g0VarA.j;
                    g0 g0Var7 = g0VarA.k;
                    long j3 = g0VarA.l;
                    long j4 = g0VarA.m;
                    d.n0.g.c cVar3 = g0VarA.n;
                    c.j.b.d.d(g0VarA, "response");
                    try {
                        String strY = g0.y(g0VarA, "Content-Type", null, 2);
                        long jE = cVar.f.e(g0VarA);
                        h hVar = new h(strY, jE, h.i.h(new c.b(cVar, cVar.f.f(g0VarA), jE)));
                        if (!(i4 >= 0)) {
                            throw new IllegalStateException(b.a.a.a.a.a("code < 0: ", i4).toString());
                        }
                        if (e0Var3 == null) {
                            throw new IllegalStateException("request == null".toString());
                        }
                        if (d0Var2 == null) {
                            throw new IllegalStateException("protocol == null".toString());
                        }
                        if (str2 == null) {
                            throw new IllegalStateException("message == null".toString());
                        }
                        g0Var = new g0(e0Var3, d0Var2, str2, i4, xVar2, aVarC2.b(), hVar, g0Var5, g0Var6, g0Var7, j3, j4, cVar3);
                    } catch (IOException e3) {
                        cVar.f1447d.c(cVar.f1446c, e3);
                        cVar.f(e3);
                        throw e3;
                    }
                }
                if (c.m.e.e("close", g0Var.f1361b.b("Connection"), true) || c.m.e.e("close", g0.y(g0Var, "Connection", null, 2), true)) {
                    cVar.f.h().l();
                }
                int i5 = i;
                if (i5 == 204 || i5 == 205) {
                    i0 i0Var2 = g0Var.h;
                    if ((i0Var2 != null ? i0Var2.z() : -1L) > 0) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("HTTP ");
                        sb.append(i5);
                        sb.append(" had non-zero Content-Length: ");
                        i0 i0Var3 = g0Var.h;
                        sb.append(i0Var3 != null ? Long.valueOf(i0Var3.z()) : null);
                        throw new ProtocolException(sb.toString());
                    }
                }
                return g0Var;
            } catch (IOException e4) {
                cVar.f1447d.b(cVar.f1446c, e4);
                cVar.f(e4);
                throw e4;
            }
        } catch (IOException e5) {
            cVar.f1447d.b(cVar.f1446c, e5);
            cVar.f(e5);
            throw e5;
        }
    }
}
