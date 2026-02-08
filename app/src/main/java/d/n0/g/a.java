package d.n0.g;

import d.a0;
import d.c0;
import d.g0;
import java.io.IOException;

/* loaded from: classes.dex */
public final class a implements a0 {

    /* renamed from: a, reason: collision with root package name */
    public static final a f1439a = new a();

    @Override // d.a0
    public g0 a(a0.a aVar) throws IOException {
        c.j.b.d.d(aVar, "chain");
        d.n0.h.g gVar = (d.n0.h.g) aVar;
        e eVar = gVar.f1502b;
        if (eVar == null) {
            throw null;
        }
        c.j.b.d.d(gVar, "chain");
        synchronized (eVar) {
            if (!eVar.m) {
                throw new IllegalStateException("released".toString());
            }
            if (!(!eVar.l)) {
                throw new IllegalStateException("Check failed.".toString());
            }
            if (!(!eVar.k)) {
                throw new IllegalStateException("Check failed.".toString());
            }
        }
        d dVar = eVar.g;
        c.j.b.d.b(dVar);
        c0 c0Var = eVar.q;
        c.j.b.d.d(c0Var, "client");
        c.j.b.d.d(gVar, "chain");
        try {
            c cVar = new c(eVar, eVar.f1461c, dVar, dVar.a(gVar.g, gVar.h, gVar.i, c0Var.C, c0Var.g, !c.j.b.d.a(gVar.f.f1352c, "GET")).k(c0Var, gVar));
            eVar.j = cVar;
            eVar.o = cVar;
            synchronized (eVar) {
                eVar.k = true;
                eVar.l = true;
            }
            if (eVar.n) {
                throw new IOException("Canceled");
            }
            return d.n0.h.g.c(gVar, 0, cVar, null, 0, 0, 0, 61).b(gVar.f);
        } catch (m e2) {
            dVar.c(e2.f1485b);
            throw e2;
        } catch (IOException e3) {
            dVar.c(e3);
            throw new m(e3);
        }
    }
}
