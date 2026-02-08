package d;

import d.y;
import java.io.Closeable;

/* loaded from: classes.dex */
public final class g0 implements Closeable {

    /* renamed from: b, reason: collision with root package name */
    public final e0 f1361b;

    /* renamed from: c, reason: collision with root package name */
    public final d0 f1362c;

    /* renamed from: d, reason: collision with root package name */
    public final String f1363d;

    /* renamed from: e, reason: collision with root package name */
    public final int f1364e;
    public final x f;
    public final y g;
    public final i0 h;
    public final g0 i;
    public final g0 j;
    public final g0 k;
    public final long l;
    public final long m;
    public final d.n0.g.c n;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public e0 f1365a;

        /* renamed from: b, reason: collision with root package name */
        public d0 f1366b;

        /* renamed from: c, reason: collision with root package name */
        public int f1367c;

        /* renamed from: d, reason: collision with root package name */
        public String f1368d;

        /* renamed from: e, reason: collision with root package name */
        public x f1369e;
        public y.a f;
        public i0 g;
        public g0 h;
        public g0 i;
        public g0 j;
        public long k;
        public long l;
        public d.n0.g.c m;

        public a() {
            this.f1367c = -1;
            this.f = new y.a();
        }

        public a(g0 g0Var) {
            c.j.b.d.d(g0Var, "response");
            this.f1367c = -1;
            this.f1365a = g0Var.f1361b;
            this.f1366b = g0Var.f1362c;
            this.f1367c = g0Var.f1364e;
            this.f1368d = g0Var.f1363d;
            this.f1369e = g0Var.f;
            this.f = g0Var.g.c();
            this.g = g0Var.h;
            this.h = g0Var.i;
            this.i = g0Var.j;
            this.j = g0Var.k;
            this.k = g0Var.l;
            this.l = g0Var.m;
            this.m = g0Var.n;
        }

        public g0 a() {
            if (!(this.f1367c >= 0)) {
                StringBuilder sbE = b.a.a.a.a.e("code < 0: ");
                sbE.append(this.f1367c);
                throw new IllegalStateException(sbE.toString().toString());
            }
            e0 e0Var = this.f1365a;
            if (e0Var == null) {
                throw new IllegalStateException("request == null".toString());
            }
            d0 d0Var = this.f1366b;
            if (d0Var == null) {
                throw new IllegalStateException("protocol == null".toString());
            }
            String str = this.f1368d;
            if (str != null) {
                return new g0(e0Var, d0Var, str, this.f1367c, this.f1369e, this.f.b(), this.g, this.h, this.i, this.j, this.k, this.l, this.m);
            }
            throw new IllegalStateException("message == null".toString());
        }

        public a b(g0 g0Var) {
            c("cacheResponse", g0Var);
            this.i = g0Var;
            return this;
        }

        public final void c(String str, g0 g0Var) {
            if (g0Var != null) {
                if (!(g0Var.h == null)) {
                    throw new IllegalArgumentException(b.a.a.a.a.b(str, ".body != null").toString());
                }
                if (!(g0Var.i == null)) {
                    throw new IllegalArgumentException(b.a.a.a.a.b(str, ".networkResponse != null").toString());
                }
                if (!(g0Var.j == null)) {
                    throw new IllegalArgumentException(b.a.a.a.a.b(str, ".cacheResponse != null").toString());
                }
                if (!(g0Var.k == null)) {
                    throw new IllegalArgumentException(b.a.a.a.a.b(str, ".priorResponse != null").toString());
                }
            }
        }

        public a d(y yVar) {
            c.j.b.d.d(yVar, "headers");
            this.f = yVar.c();
            return this;
        }

        public a e(String str) {
            c.j.b.d.d(str, "message");
            this.f1368d = str;
            return this;
        }

        public a f(d0 d0Var) {
            c.j.b.d.d(d0Var, "protocol");
            this.f1366b = d0Var;
            return this;
        }

        public a g(e0 e0Var) {
            c.j.b.d.d(e0Var, "request");
            this.f1365a = e0Var;
            return this;
        }
    }

    public g0(e0 e0Var, d0 d0Var, String str, int i, x xVar, y yVar, i0 i0Var, g0 g0Var, g0 g0Var2, g0 g0Var3, long j, long j2, d.n0.g.c cVar) {
        c.j.b.d.d(e0Var, "request");
        c.j.b.d.d(d0Var, "protocol");
        c.j.b.d.d(str, "message");
        c.j.b.d.d(yVar, "headers");
        this.f1361b = e0Var;
        this.f1362c = d0Var;
        this.f1363d = str;
        this.f1364e = i;
        this.f = xVar;
        this.g = yVar;
        this.h = i0Var;
        this.i = g0Var;
        this.j = g0Var2;
        this.k = g0Var3;
        this.l = j;
        this.m = j2;
        this.n = cVar;
    }

    public static String y(g0 g0Var, String str, String str2, int i) {
        int i2 = i & 2;
        if (g0Var == null) {
            throw null;
        }
        c.j.b.d.d(str, "name");
        String strA = g0Var.g.a(str);
        if (strA != null) {
            return strA;
        }
        return null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        i0 i0Var = this.h;
        if (i0Var == null) {
            throw new IllegalStateException("response is not eligible for a body and must not be closed".toString());
        }
        i0Var.close();
    }

    public String toString() {
        StringBuilder sbE = b.a.a.a.a.e("Response{protocol=");
        sbE.append(this.f1362c);
        sbE.append(", code=");
        sbE.append(this.f1364e);
        sbE.append(", message=");
        sbE.append(this.f1363d);
        sbE.append(", url=");
        sbE.append(this.f1361b.f1351b);
        sbE.append('}');
        return sbE.toString();
    }
}
