package d.n0.i;

import d.c0;
import d.e0;
import d.g0;
import d.n0.g.j;
import d.q;
import d.y;
import e.a0;
import e.g;
import e.l;
import e.x;
import e.z;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Socket;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class b implements d.n0.h.d {

    /* renamed from: a, reason: collision with root package name */
    public int f1515a;

    /* renamed from: b, reason: collision with root package name */
    public final d.n0.i.a f1516b;

    /* renamed from: c, reason: collision with root package name */
    public y f1517c;

    /* renamed from: d, reason: collision with root package name */
    public final c0 f1518d;

    /* renamed from: e, reason: collision with root package name */
    public final j f1519e;
    public final g f;
    public final e.f g;

    public abstract class a implements z {

        /* renamed from: b, reason: collision with root package name */
        public final l f1520b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f1521c;

        public a() {
            this.f1520b = new l(b.this.f.b());
        }

        @Override // e.z
        public a0 b() {
            return this.f1520b;
        }

        @Override // e.z
        public long l(e.e eVar, long j) throws IOException {
            c.j.b.d.d(eVar, "sink");
            try {
                return b.this.f.l(eVar, j);
            } catch (IOException e2) {
                b.this.f1519e.l();
                y();
                throw e2;
            }
        }

        public final void y() {
            b bVar = b.this;
            int i = bVar.f1515a;
            if (i == 6) {
                return;
            }
            if (i == 5) {
                b.i(bVar, this.f1520b);
                b.this.f1515a = 6;
            } else {
                StringBuilder sbE = b.a.a.a.a.e("state: ");
                sbE.append(b.this.f1515a);
                throw new IllegalStateException(sbE.toString());
            }
        }
    }

    /* renamed from: d.n0.i.b$b, reason: collision with other inner class name */
    public final class C0035b implements x {

        /* renamed from: b, reason: collision with root package name */
        public final l f1523b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f1524c;

        public C0035b() {
            this.f1523b = new l(b.this.g.b());
        }

        @Override // e.x
        public a0 b() {
            return this.f1523b;
        }

        @Override // e.x, java.io.Closeable, java.lang.AutoCloseable
        public synchronized void close() {
            if (this.f1524c) {
                return;
            }
            this.f1524c = true;
            b.this.g.n("0\r\n\r\n");
            b.i(b.this, this.f1523b);
            b.this.f1515a = 3;
        }

        @Override // e.x
        public void e(e.e eVar, long j) {
            c.j.b.d.d(eVar, "source");
            if (!(!this.f1524c)) {
                throw new IllegalStateException("closed".toString());
            }
            if (j == 0) {
                return;
            }
            b.this.g.j(j);
            b.this.g.n("\r\n");
            b.this.g.e(eVar, j);
            b.this.g.n("\r\n");
        }

        @Override // e.x, java.io.Flushable
        public synchronized void flush() {
            if (this.f1524c) {
                return;
            }
            b.this.g.flush();
        }
    }

    public final class c extends a {

        /* renamed from: e, reason: collision with root package name */
        public long f1526e;
        public boolean f;
        public final d.z g;
        public final /* synthetic */ b h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(b bVar, d.z zVar) {
            super();
            c.j.b.d.d(zVar, "url");
            this.h = bVar;
            this.g = zVar;
            this.f1526e = -1L;
            this.f = true;
        }

        @Override // e.z, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f1521c) {
                return;
            }
            if (this.f && !d.n0.c.j(this, 100, TimeUnit.MILLISECONDS)) {
                this.h.f1519e.l();
                y();
            }
            this.f1521c = true;
        }

        @Override // d.n0.i.b.a, e.z
        public long l(e.e eVar, long j) throws IOException, NumberFormatException {
            c.j.b.d.d(eVar, "sink");
            boolean z = true;
            if (!(j >= 0)) {
                throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
            }
            if (!(!this.f1521c)) {
                throw new IllegalStateException("closed".toString());
            }
            if (!this.f) {
                return -1L;
            }
            long j2 = this.f1526e;
            if (j2 == 0 || j2 == -1) {
                if (this.f1526e != -1) {
                    this.h.f.h();
                }
                try {
                    this.f1526e = this.h.f.v();
                    String strH = this.h.f.h();
                    if (strH == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
                    }
                    String string = c.m.e.C(strH).toString();
                    if (this.f1526e >= 0) {
                        if (string.length() <= 0) {
                            z = false;
                        }
                        if (!z || c.m.e.z(string, ";", false, 2)) {
                            if (this.f1526e == 0) {
                                this.f = false;
                                b bVar = this.h;
                                bVar.f1517c = bVar.f1516b.a();
                                c0 c0Var = this.h.f1518d;
                                c.j.b.d.b(c0Var);
                                q qVar = c0Var.k;
                                d.z zVar = this.g;
                                y yVar = this.h.f1517c;
                                c.j.b.d.b(yVar);
                                d.n0.h.e.e(qVar, zVar, yVar);
                                y();
                            }
                            if (!this.f) {
                                return -1L;
                            }
                        }
                    }
                    throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.f1526e + string + '\"');
                } catch (NumberFormatException e2) {
                    throw new ProtocolException(e2.getMessage());
                }
            }
            long jL = super.l(eVar, Math.min(j, this.f1526e));
            if (jL != -1) {
                this.f1526e -= jL;
                return jL;
            }
            this.h.f1519e.l();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            y();
            throw protocolException;
        }
    }

    public final class d extends a {

        /* renamed from: e, reason: collision with root package name */
        public long f1527e;

        public d(long j) {
            super();
            this.f1527e = j;
            if (j == 0) {
                y();
            }
        }

        @Override // e.z, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f1521c) {
                return;
            }
            if (this.f1527e != 0 && !d.n0.c.j(this, 100, TimeUnit.MILLISECONDS)) {
                b.this.f1519e.l();
                y();
            }
            this.f1521c = true;
        }

        @Override // d.n0.i.b.a, e.z
        public long l(e.e eVar, long j) throws IOException {
            c.j.b.d.d(eVar, "sink");
            if (!(j >= 0)) {
                throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
            }
            if (!(!this.f1521c)) {
                throw new IllegalStateException("closed".toString());
            }
            long j2 = this.f1527e;
            if (j2 == 0) {
                return -1L;
            }
            long jL = super.l(eVar, Math.min(j2, j));
            if (jL == -1) {
                b.this.f1519e.l();
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                y();
                throw protocolException;
            }
            long j3 = this.f1527e - jL;
            this.f1527e = j3;
            if (j3 == 0) {
                y();
            }
            return jL;
        }
    }

    public final class e implements x {

        /* renamed from: b, reason: collision with root package name */
        public final l f1528b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f1529c;

        public e() {
            this.f1528b = new l(b.this.g.b());
        }

        @Override // e.x
        public a0 b() {
            return this.f1528b;
        }

        @Override // e.x, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f1529c) {
                return;
            }
            this.f1529c = true;
            b.i(b.this, this.f1528b);
            b.this.f1515a = 3;
        }

        @Override // e.x
        public void e(e.e eVar, long j) {
            c.j.b.d.d(eVar, "source");
            if (!(!this.f1529c)) {
                throw new IllegalStateException("closed".toString());
            }
            d.n0.c.d(eVar.f1761c, 0L, j);
            b.this.g.e(eVar, j);
        }

        @Override // e.x, java.io.Flushable
        public void flush() {
            if (this.f1529c) {
                return;
            }
            b.this.g.flush();
        }
    }

    public final class f extends a {

        /* renamed from: e, reason: collision with root package name */
        public boolean f1531e;

        public f(b bVar) {
            super();
        }

        @Override // e.z, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f1521c) {
                return;
            }
            if (!this.f1531e) {
                y();
            }
            this.f1521c = true;
        }

        @Override // d.n0.i.b.a, e.z
        public long l(e.e eVar, long j) throws IOException {
            c.j.b.d.d(eVar, "sink");
            if (!(j >= 0)) {
                throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
            }
            if (!(!this.f1521c)) {
                throw new IllegalStateException("closed".toString());
            }
            if (this.f1531e) {
                return -1L;
            }
            long jL = super.l(eVar, j);
            if (jL != -1) {
                return jL;
            }
            this.f1531e = true;
            y();
            return -1L;
        }
    }

    public b(c0 c0Var, j jVar, g gVar, e.f fVar) {
        c.j.b.d.d(jVar, "connection");
        c.j.b.d.d(gVar, "source");
        c.j.b.d.d(fVar, "sink");
        this.f1518d = c0Var;
        this.f1519e = jVar;
        this.f = gVar;
        this.g = fVar;
        this.f1516b = new d.n0.i.a(gVar);
    }

    public static final void i(b bVar, l lVar) {
        if (bVar == null) {
            throw null;
        }
        a0 a0Var = lVar.f1775e;
        a0 a0Var2 = a0.f1749d;
        c.j.b.d.d(a0Var2, "delegate");
        lVar.f1775e = a0Var2;
        a0Var.a();
        a0Var.b();
    }

    @Override // d.n0.h.d
    public void a() {
        this.g.flush();
    }

    @Override // d.n0.h.d
    public void b(e0 e0Var) {
        c.j.b.d.d(e0Var, "request");
        Proxy.Type type = this.f1519e.q.f1387b.type();
        c.j.b.d.c(type, "connection.route().proxy.type()");
        c.j.b.d.d(e0Var, "request");
        c.j.b.d.d(type, "proxyType");
        StringBuilder sb = new StringBuilder();
        sb.append(e0Var.f1352c);
        sb.append(' ');
        if (!e0Var.f1351b.f1738a && type == Proxy.Type.HTTP) {
            sb.append(e0Var.f1351b);
        } else {
            d.z zVar = e0Var.f1351b;
            c.j.b.d.d(zVar, "url");
            String strB = zVar.b();
            String strD = zVar.d();
            if (strD != null) {
                strB = strB + '?' + strD;
            }
            sb.append(strB);
        }
        sb.append(" HTTP/1.1");
        String string = sb.toString();
        c.j.b.d.c(string, "StringBuilder().apply(builderAction).toString()");
        k(e0Var.f1353d, string);
    }

    @Override // d.n0.h.d
    public void c() {
        this.g.flush();
    }

    @Override // d.n0.h.d
    public void cancel() throws IOException {
        Socket socket = this.f1519e.f1474b;
        if (socket != null) {
            d.n0.c.f(socket);
        }
    }

    @Override // d.n0.h.d
    public x d(e0 e0Var, long j) {
        c.j.b.d.d(e0Var, "request");
        if (c.m.e.e("chunked", e0Var.b("Transfer-Encoding"), true)) {
            if (this.f1515a == 1) {
                this.f1515a = 2;
                return new C0035b();
            }
            StringBuilder sbE = b.a.a.a.a.e("state: ");
            sbE.append(this.f1515a);
            throw new IllegalStateException(sbE.toString().toString());
        }
        if (j == -1) {
            throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        }
        if (this.f1515a == 1) {
            this.f1515a = 2;
            return new e();
        }
        StringBuilder sbE2 = b.a.a.a.a.e("state: ");
        sbE2.append(this.f1515a);
        throw new IllegalStateException(sbE2.toString().toString());
    }

    @Override // d.n0.h.d
    public long e(g0 g0Var) {
        c.j.b.d.d(g0Var, "response");
        if (!d.n0.h.e.b(g0Var)) {
            return 0L;
        }
        if (c.m.e.e("chunked", g0.y(g0Var, "Transfer-Encoding", null, 2), true)) {
            return -1L;
        }
        return d.n0.c.m(g0Var);
    }

    @Override // d.n0.h.d
    public z f(g0 g0Var) {
        c.j.b.d.d(g0Var, "response");
        if (!d.n0.h.e.b(g0Var)) {
            return j(0L);
        }
        if (c.m.e.e("chunked", g0.y(g0Var, "Transfer-Encoding", null, 2), true)) {
            d.z zVar = g0Var.f1361b.f1351b;
            if (this.f1515a == 4) {
                this.f1515a = 5;
                return new c(this, zVar);
            }
            StringBuilder sbE = b.a.a.a.a.e("state: ");
            sbE.append(this.f1515a);
            throw new IllegalStateException(sbE.toString().toString());
        }
        long jM = d.n0.c.m(g0Var);
        if (jM != -1) {
            return j(jM);
        }
        if (this.f1515a == 4) {
            this.f1515a = 5;
            this.f1519e.l();
            return new f(this);
        }
        StringBuilder sbE2 = b.a.a.a.a.e("state: ");
        sbE2.append(this.f1515a);
        throw new IllegalStateException(sbE2.toString().toString());
    }

    @Override // d.n0.h.d
    public g0.a g(boolean z) {
        int i = this.f1515a;
        boolean z2 = true;
        if (i != 1 && i != 3) {
            z2 = false;
        }
        if (!z2) {
            StringBuilder sbE = b.a.a.a.a.e("state: ");
            sbE.append(this.f1515a);
            throw new IllegalStateException(sbE.toString().toString());
        }
        try {
            d.n0.h.j jVarA = d.n0.h.j.a(this.f1516b.b());
            g0.a aVar = new g0.a();
            aVar.f(jVarA.f1510a);
            aVar.f1367c = jVarA.f1511b;
            aVar.e(jVarA.f1512c);
            aVar.d(this.f1516b.a());
            if (z && jVarA.f1511b == 100) {
                return null;
            }
            if (jVarA.f1511b == 100) {
                this.f1515a = 3;
                return aVar;
            }
            this.f1515a = 4;
            return aVar;
        } catch (EOFException e2) {
            throw new IOException(b.a.a.a.a.b("unexpected end of stream on ", this.f1519e.q.f1386a.f1321a.f()), e2);
        }
    }

    @Override // d.n0.h.d
    public j h() {
        return this.f1519e;
    }

    public final z j(long j) {
        if (this.f1515a == 4) {
            this.f1515a = 5;
            return new d(j);
        }
        StringBuilder sbE = b.a.a.a.a.e("state: ");
        sbE.append(this.f1515a);
        throw new IllegalStateException(sbE.toString().toString());
    }

    public final void k(y yVar, String str) {
        c.j.b.d.d(yVar, "headers");
        c.j.b.d.d(str, "requestLine");
        if (!(this.f1515a == 0)) {
            StringBuilder sbE = b.a.a.a.a.e("state: ");
            sbE.append(this.f1515a);
            throw new IllegalStateException(sbE.toString().toString());
        }
        this.g.n(str).n("\r\n");
        int size = yVar.size();
        for (int i = 0; i < size; i++) {
            this.g.n(yVar.b(i)).n(": ").n(yVar.d(i)).n("\r\n");
        }
        this.g.n("\r\n");
        this.f1515a = 1;
    }
}
