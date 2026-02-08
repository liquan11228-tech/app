package d.n0.e;

import c.j.b.c;
import c.m.e;
import d.a0;
import d.d;
import d.d0;
import d.e0;
import d.f;
import d.g0;
import d.i0;
import d.x;
import d.y;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class a implements a0 {

    /* renamed from: b, reason: collision with root package name */
    public static final C0033a f1418b = new C0033a(null);

    /* renamed from: a, reason: collision with root package name */
    public final d f1419a = null;

    /* renamed from: d.n0.e.a$a, reason: collision with other inner class name */
    public static final class C0033a {
        public C0033a(c cVar) {
        }

        public static final g0 a(C0033a c0033a, g0 g0Var) {
            if ((g0Var != null ? g0Var.h : null) == null) {
                return g0Var;
            }
            if (g0Var == null) {
                throw null;
            }
            c.j.b.d.d(g0Var, "response");
            e0 e0Var = g0Var.f1361b;
            d0 d0Var = g0Var.f1362c;
            int i = g0Var.f1364e;
            String str = g0Var.f1363d;
            x xVar = g0Var.f;
            y.a aVarC = g0Var.g.c();
            g0 g0Var2 = g0Var.i;
            g0 g0Var3 = g0Var.j;
            g0 g0Var4 = g0Var.k;
            long j = g0Var.l;
            long j2 = g0Var.m;
            d.n0.g.c cVar = g0Var.n;
            if (!(i >= 0)) {
                throw new IllegalStateException(b.a.a.a.a.a("code < 0: ", i).toString());
            }
            if (e0Var == null) {
                throw new IllegalStateException("request == null".toString());
            }
            if (d0Var == null) {
                throw new IllegalStateException("protocol == null".toString());
            }
            if (str != null) {
                return new g0(e0Var, d0Var, str, i, xVar, aVarC.b(), null, g0Var2, g0Var3, g0Var4, j, j2, cVar);
            }
            throw new IllegalStateException("message == null".toString());
        }

        public final boolean b(String str) {
            return e.e("Content-Length", str, true) || e.e("Content-Encoding", str, true) || e.e("Content-Type", str, true);
        }

        public final boolean c(String str) {
            return (e.e("Connection", str, true) || e.e("Keep-Alive", str, true) || e.e("Proxy-Authenticate", str, true) || e.e("Proxy-Authorization", str, true) || e.e("TE", str, true) || e.e("Trailers", str, true) || e.e("Transfer-Encoding", str, true) || e.e("Upgrade", str, true)) ? false : true;
        }
    }

    @Override // d.a0
    public g0 a(a0.a aVar) {
        y yVar;
        c.j.b.d.d(aVar, "chain");
        f fVarCall = aVar.call();
        System.currentTimeMillis();
        e0 e0VarA = aVar.a();
        c.j.b.d.d(e0VarA, "request");
        b bVar = new b(e0VarA, null);
        if (bVar.f1420a != null && e0VarA.a().j) {
            bVar = new b(null, null);
        }
        e0 e0Var = bVar.f1420a;
        g0 g0Var = bVar.f1421b;
        if (e0Var == null && g0Var == null) {
            g0.a aVar2 = new g0.a();
            aVar2.g(aVar.a());
            aVar2.f(d0.HTTP_1_1);
            aVar2.f1367c = 504;
            aVar2.e("Unsatisfiable Request (only-if-cached)");
            aVar2.g = d.n0.c.f1413c;
            aVar2.k = -1L;
            aVar2.l = System.currentTimeMillis();
            g0 g0VarA = aVar2.a();
            c.j.b.d.d(fVarCall, "call");
            c.j.b.d.d(g0VarA, "response");
            return g0VarA;
        }
        if (e0Var == null) {
            c.j.b.d.b(g0Var);
            g0.a aVar3 = new g0.a(g0Var);
            aVar3.b(C0033a.a(f1418b, g0Var));
            g0 g0VarA2 = aVar3.a();
            c.j.b.d.d(fVarCall, "call");
            c.j.b.d.d(g0VarA2, "response");
            return g0VarA2;
        }
        if (g0Var != null) {
            c.j.b.d.d(fVarCall, "call");
            c.j.b.d.d(g0Var, "cachedResponse");
        }
        g0 g0VarB = aVar.b(e0Var);
        if (g0Var != null) {
            if (g0VarB != null && g0VarB.f1364e == 304) {
                g0.a aVar4 = new g0.a(g0Var);
                C0033a c0033a = f1418b;
                y yVar2 = g0Var.g;
                y yVar3 = g0VarB.g;
                ArrayList arrayList = new ArrayList(20);
                int size = yVar2.size();
                int i = 0;
                while (i < size) {
                    String strB = yVar2.b(i);
                    String strD = yVar2.d(i);
                    if (e.e("Warning", strB, true)) {
                        yVar = yVar2;
                        if (e.z(strD, "1", false, 2)) {
                        }
                        i++;
                        yVar2 = yVar;
                    } else {
                        yVar = yVar2;
                    }
                    if (c0033a.b(strB) || !c0033a.c(strB) || yVar3.a(strB) == null) {
                        c.j.b.d.d(strB, "name");
                        c.j.b.d.d(strD, "value");
                        arrayList.add(strB);
                        arrayList.add(e.C(strD).toString());
                    }
                    i++;
                    yVar2 = yVar;
                }
                int size2 = yVar3.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    String strB2 = yVar3.b(i2);
                    if (!c0033a.b(strB2) && c0033a.c(strB2)) {
                        String strD2 = yVar3.d(i2);
                        c.j.b.d.d(strB2, "name");
                        c.j.b.d.d(strD2, "value");
                        arrayList.add(strB2);
                        arrayList.add(e.C(strD2).toString());
                    }
                }
                Object[] array = arrayList.toArray(new String[0]);
                if (array == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
                aVar4.d(new y((String[]) array, null));
                aVar4.k = g0VarB.l;
                aVar4.l = g0VarB.m;
                aVar4.b(C0033a.a(f1418b, g0Var));
                g0 g0VarA3 = C0033a.a(f1418b, g0VarB);
                aVar4.c("networkResponse", g0VarA3);
                aVar4.h = g0VarA3;
                aVar4.a();
                i0 i0Var = g0VarB.h;
                c.j.b.d.b(i0Var);
                i0Var.close();
                c.j.b.d.b(null);
                throw null;
            }
            i0 i0Var2 = g0Var.h;
            if (i0Var2 != null) {
                d.n0.c.e(i0Var2);
            }
        }
        c.j.b.d.b(g0VarB);
        g0.a aVar5 = new g0.a(g0VarB);
        aVar5.b(C0033a.a(f1418b, g0Var));
        g0 g0VarA4 = C0033a.a(f1418b, g0VarB);
        aVar5.c("networkResponse", g0VarA4);
        aVar5.h = g0VarA4;
        return aVar5.a();
    }
}
