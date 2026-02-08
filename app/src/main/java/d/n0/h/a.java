package d.n0.h;

import a.b.k.h;
import d.a0;
import d.b0;
import d.e0;
import d.f0;
import d.g0;
import d.i0;
import d.o;
import d.q;
import d.y;
import e.m;
import java.util.List;

/* loaded from: classes.dex */
public final class a implements a0 {

    /* renamed from: a, reason: collision with root package name */
    public final q f1494a;

    public a(q qVar) {
        c.j.b.d.d(qVar, "cookieJar");
        this.f1494a = qVar;
    }

    @Override // d.a0
    public g0 a(a0.a aVar) throws NumberFormatException {
        boolean z;
        i0 i0Var;
        c.j.b.d.d(aVar, "chain");
        e0 e0VarA = aVar.a();
        if (e0VarA == null) {
            throw null;
        }
        e0.a aVar2 = new e0.a(e0VarA);
        f0 f0Var = e0VarA.f1354e;
        if (f0Var != null) {
            b0 b0VarB = f0Var.b();
            if (b0VarB != null) {
                aVar2.b("Content-Type", b0VarB.f1329a);
            }
            long jA = f0Var.a();
            if (jA != -1) {
                aVar2.b("Content-Length", String.valueOf(jA));
                aVar2.d("Transfer-Encoding");
            } else {
                aVar2.b("Transfer-Encoding", "chunked");
                aVar2.d("Content-Length");
            }
        }
        int i = 0;
        if (e0VarA.b("Host") == null) {
            aVar2.b("Host", d.n0.c.C(e0VarA.f1351b, false));
        }
        if (e0VarA.b("Connection") == null) {
            aVar2.b("Connection", "Keep-Alive");
        }
        if (e0VarA.b("Accept-Encoding") == null && e0VarA.b("Range") == null) {
            aVar2.b("Accept-Encoding", "gzip");
            z = true;
        } else {
            z = false;
        }
        List<o> listA = this.f1494a.a(e0VarA.f1351b);
        if (!listA.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            for (Object obj : listA) {
                int i2 = i + 1;
                if (i < 0) {
                    h.i.X();
                    throw null;
                }
                o oVar = (o) obj;
                if (i > 0) {
                    sb.append("; ");
                }
                sb.append(oVar.f1710a);
                sb.append('=');
                sb.append(oVar.f1711b);
                i = i2;
            }
            String string = sb.toString();
            c.j.b.d.c(string, "StringBuilder().apply(builderAction).toString()");
            aVar2.b("Cookie", string);
        }
        if (e0VarA.b("User-Agent") == null) {
            aVar2.b("User-Agent", "okhttp/4.9.0");
        }
        g0 g0VarB = aVar.b(aVar2.a());
        e.e(this.f1494a, e0VarA.f1351b, g0VarB.g);
        g0.a aVar3 = new g0.a(g0VarB);
        aVar3.g(e0VarA);
        if (z && c.m.e.e("gzip", g0.y(g0VarB, "Content-Encoding", null, 2), true) && e.b(g0VarB) && (i0Var = g0VarB.h) != null) {
            m mVar = new m(i0Var.B());
            y.a aVarC = g0VarB.g.c();
            aVarC.c("Content-Encoding");
            aVarC.c("Content-Length");
            aVar3.d(aVarC.b());
            aVar3.g = new h(g0.y(g0VarB, "Content-Type", null, 2), -1L, h.i.h(mVar));
        }
        return aVar3.a();
    }
}
