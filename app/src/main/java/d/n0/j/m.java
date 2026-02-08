package d.n0.j;

import d.c0;
import d.d0;
import d.e0;
import d.g0;
import d.n0.j.o;
import d.y;
import d.z;
import e.x;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class m implements d.n0.h.d {
    public static final List<String> g = d.n0.c.n("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");
    public static final List<String> h = d.n0.c.n("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");

    /* renamed from: a, reason: collision with root package name */
    public volatile o f1583a;

    /* renamed from: b, reason: collision with root package name */
    public final d0 f1584b;

    /* renamed from: c, reason: collision with root package name */
    public volatile boolean f1585c;

    /* renamed from: d, reason: collision with root package name */
    public final d.n0.g.j f1586d;

    /* renamed from: e, reason: collision with root package name */
    public final d.n0.h.g f1587e;
    public final f f;

    public m(c0 c0Var, d.n0.g.j jVar, d.n0.h.g gVar, f fVar) {
        d0 d0Var = d0.H2_PRIOR_KNOWLEDGE;
        c.j.b.d.d(c0Var, "client");
        c.j.b.d.d(jVar, "connection");
        c.j.b.d.d(gVar, "chain");
        c.j.b.d.d(fVar, "http2Connection");
        this.f1586d = jVar;
        this.f1587e = gVar;
        this.f = fVar;
        this.f1584b = c0Var.u.contains(d0Var) ? d0Var : d0.HTTP_2;
    }

    @Override // d.n0.h.d
    public void a() throws SocketTimeoutException {
        o oVar = this.f1583a;
        c.j.b.d.b(oVar);
        ((o.a) oVar.g()).close();
    }

    @Override // d.n0.h.d
    public void b(e0 e0Var) throws IOException {
        int i;
        o oVar;
        boolean z;
        c.j.b.d.d(e0Var, "request");
        if (this.f1583a != null) {
            return;
        }
        boolean z2 = e0Var.f1354e != null;
        c.j.b.d.d(e0Var, "request");
        y yVar = e0Var.f1353d;
        ArrayList arrayList = new ArrayList(yVar.size() + 4);
        arrayList.add(new c(c.f, e0Var.f1352c));
        e.h hVar = c.g;
        z zVar = e0Var.f1351b;
        c.j.b.d.d(zVar, "url");
        String strB = zVar.b();
        String strD = zVar.d();
        if (strD != null) {
            strB = strB + '?' + strD;
        }
        arrayList.add(new c(hVar, strB));
        String strB2 = e0Var.b("Host");
        if (strB2 != null) {
            arrayList.add(new c(c.i, strB2));
        }
        arrayList.add(new c(c.h, e0Var.f1351b.f1739b));
        int size = yVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            String strB3 = yVar.b(i2);
            Locale locale = Locale.US;
            c.j.b.d.c(locale, "Locale.US");
            if (strB3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            String lowerCase = strB3.toLowerCase(locale);
            c.j.b.d.c(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
            if (!g.contains(lowerCase) || (c.j.b.d.a(lowerCase, "te") && c.j.b.d.a(yVar.d(i2), "trailers"))) {
                arrayList.add(new c(lowerCase, yVar.d(i2)));
            }
        }
        f fVar = this.f;
        if (fVar == null) {
            throw null;
        }
        c.j.b.d.d(arrayList, "requestHeaders");
        boolean z3 = !z2;
        synchronized (fVar.A) {
            synchronized (fVar) {
                if (fVar.g > 1073741823) {
                    fVar.C(b.REFUSED_STREAM);
                }
                if (fVar.h) {
                    throw new a();
                }
                i = fVar.g;
                fVar.g += 2;
                oVar = new o(i, fVar, z3, false, null);
                z = !z2 || fVar.x >= fVar.y || oVar.f1598c >= oVar.f1599d;
                if (oVar.i()) {
                    fVar.f1561d.put(Integer.valueOf(i), oVar);
                }
            }
            fVar.A.C(z3, i, arrayList);
        }
        if (z) {
            fVar.A.flush();
        }
        this.f1583a = oVar;
        if (this.f1585c) {
            o oVar2 = this.f1583a;
            c.j.b.d.b(oVar2);
            oVar2.e(b.CANCEL);
            throw new IOException("Canceled");
        }
        o oVar3 = this.f1583a;
        c.j.b.d.b(oVar3);
        oVar3.i.g(this.f1587e.h, TimeUnit.MILLISECONDS);
        o oVar4 = this.f1583a;
        c.j.b.d.b(oVar4);
        oVar4.j.g(this.f1587e.i, TimeUnit.MILLISECONDS);
    }

    @Override // d.n0.h.d
    public void c() {
        this.f.A.flush();
    }

    @Override // d.n0.h.d
    public void cancel() {
        this.f1585c = true;
        o oVar = this.f1583a;
        if (oVar != null) {
            oVar.e(b.CANCEL);
        }
    }

    @Override // d.n0.h.d
    public x d(e0 e0Var, long j) {
        c.j.b.d.d(e0Var, "request");
        o oVar = this.f1583a;
        c.j.b.d.b(oVar);
        return oVar.g();
    }

    @Override // d.n0.h.d
    public long e(g0 g0Var) {
        c.j.b.d.d(g0Var, "response");
        if (d.n0.h.e.b(g0Var)) {
            return d.n0.c.m(g0Var);
        }
        return 0L;
    }

    @Override // d.n0.h.d
    public e.z f(g0 g0Var) {
        c.j.b.d.d(g0Var, "response");
        o oVar = this.f1583a;
        c.j.b.d.b(oVar);
        return oVar.g;
    }

    @Override // d.n0.h.d
    public g0.a g(boolean z) throws NumberFormatException, IOException {
        y yVar;
        o oVar = this.f1583a;
        c.j.b.d.b(oVar);
        synchronized (oVar) {
            oVar.i.i();
            while (oVar.f1600e.isEmpty() && oVar.k == null) {
                try {
                    oVar.l();
                } catch (Throwable th) {
                    oVar.i.m();
                    throw th;
                }
            }
            oVar.i.m();
            if (!(!oVar.f1600e.isEmpty())) {
                IOException iOException = oVar.l;
                if (iOException != null) {
                    throw iOException;
                }
                b bVar = oVar.k;
                c.j.b.d.b(bVar);
                throw new u(bVar);
            }
            y yVarRemoveFirst = oVar.f1600e.removeFirst();
            c.j.b.d.c(yVarRemoveFirst, "headersQueue.removeFirst()");
            yVar = yVarRemoveFirst;
        }
        d0 d0Var = this.f1584b;
        c.j.b.d.d(yVar, "headerBlock");
        c.j.b.d.d(d0Var, "protocol");
        ArrayList arrayList = new ArrayList(20);
        int size = yVar.size();
        d.n0.h.j jVarA = null;
        for (int i = 0; i < size; i++) {
            String strB = yVar.b(i);
            String strD = yVar.d(i);
            if (c.j.b.d.a(strB, ":status")) {
                jVarA = d.n0.h.j.a("HTTP/1.1 " + strD);
            } else if (!h.contains(strB)) {
                c.j.b.d.d(strB, "name");
                c.j.b.d.d(strD, "value");
                arrayList.add(strB);
                arrayList.add(c.m.e.C(strD).toString());
            }
        }
        if (jVarA == null) {
            throw new ProtocolException("Expected ':status' header not present");
        }
        g0.a aVar = new g0.a();
        aVar.f(d0Var);
        aVar.f1367c = jVarA.f1511b;
        aVar.e(jVarA.f1512c);
        Object[] array = arrayList.toArray(new String[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        aVar.d(new y((String[]) array, null));
        if (z && aVar.f1367c == 100) {
            return null;
        }
        return aVar;
    }

    @Override // d.n0.h.d
    public d.n0.g.j h() {
        return this.f1586d;
    }
}
