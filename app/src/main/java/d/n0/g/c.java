package d.n0.g;

import d.e0;
import d.f0;
import d.g0;
import d.n0.n.d;
import d.u;
import e.x;
import e.z;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Socket;
import java.net.SocketException;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a */
    public boolean f1444a;

    /* renamed from: b */
    public final j f1445b;

    /* renamed from: c */
    public final e f1446c;

    /* renamed from: d */
    public final u f1447d;

    /* renamed from: e */
    public final d f1448e;
    public final d.n0.h.d f;

    public final class a extends e.j {

        /* renamed from: c */
        public boolean f1449c;

        /* renamed from: d */
        public long f1450d;

        /* renamed from: e */
        public boolean f1451e;
        public final long f;
        public final /* synthetic */ c g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(c cVar, x xVar, long j) {
            super(xVar);
            c.j.b.d.d(xVar, "delegate");
            this.g = cVar;
            this.f = j;
        }

        @Override // e.x, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.f1451e) {
                return;
            }
            this.f1451e = true;
            long j = this.f;
            if (j != -1 && this.f1450d != j) {
                throw new ProtocolException("unexpected end of stream");
            }
            try {
                this.f1773b.close();
                y(null);
            } catch (IOException e2) {
                throw y(e2);
            }
        }

        @Override // e.j, e.x
        public void e(e.e eVar, long j) throws IOException {
            c.j.b.d.d(eVar, "source");
            if (!(!this.f1451e)) {
                throw new IllegalStateException("closed".toString());
            }
            long j2 = this.f;
            if (j2 == -1 || this.f1450d + j <= j2) {
                try {
                    super.e(eVar, j);
                    this.f1450d += j;
                    return;
                } catch (IOException e2) {
                    throw y(e2);
                }
            }
            StringBuilder sbE = b.a.a.a.a.e("expected ");
            sbE.append(this.f);
            sbE.append(" bytes but received ");
            sbE.append(this.f1450d + j);
            throw new ProtocolException(sbE.toString());
        }

        @Override // e.x, java.io.Flushable
        public void flush() throws IOException {
            try {
                this.f1773b.flush();
            } catch (IOException e2) {
                throw y(e2);
            }
        }

        public final <E extends IOException> E y(E e2) {
            if (this.f1449c) {
                return e2;
            }
            this.f1449c = true;
            return (E) this.g.a(this.f1450d, false, true, e2);
        }
    }

    public final class b extends e.k {

        /* renamed from: c */
        public long f1452c;

        /* renamed from: d */
        public boolean f1453d;

        /* renamed from: e */
        public boolean f1454e;
        public boolean f;
        public final long g;
        public final /* synthetic */ c h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(c cVar, z zVar, long j) {
            super(zVar);
            c.j.b.d.d(zVar, "delegate");
            this.h = cVar;
            this.g = j;
            this.f1453d = true;
            if (j == 0) {
                y(null);
            }
        }

        @Override // e.z, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.f) {
                return;
            }
            this.f = true;
            try {
                this.f1774b.close();
                y(null);
            } catch (IOException e2) {
                throw y(e2);
            }
        }

        @Override // e.z
        public long l(e.e eVar, long j) throws IOException {
            c.j.b.d.d(eVar, "sink");
            if (!(!this.f)) {
                throw new IllegalStateException("closed".toString());
            }
            try {
                long jL = this.f1774b.l(eVar, j);
                if (this.f1453d) {
                    this.f1453d = false;
                    u uVar = this.h.f1447d;
                    e eVar2 = this.h.f1446c;
                    if (uVar == null) {
                        throw null;
                    }
                    c.j.b.d.d(eVar2, "call");
                }
                if (jL == -1) {
                    y(null);
                    return -1L;
                }
                long j2 = this.f1452c + jL;
                if (this.g != -1 && j2 > this.g) {
                    throw new ProtocolException("expected " + this.g + " bytes but received " + j2);
                }
                this.f1452c = j2;
                if (j2 == this.g) {
                    y(null);
                }
                return jL;
            } catch (IOException e2) {
                throw y(e2);
            }
        }

        public final <E extends IOException> E y(E e2) {
            if (this.f1454e) {
                return e2;
            }
            this.f1454e = true;
            if (e2 == null && this.f1453d) {
                this.f1453d = false;
                c cVar = this.h;
                u uVar = cVar.f1447d;
                e eVar = cVar.f1446c;
                if (uVar == null) {
                    throw null;
                }
                c.j.b.d.d(eVar, "call");
            }
            return (E) this.h.a(this.f1452c, true, false, e2);
        }
    }

    public c(e eVar, u uVar, d dVar, d.n0.h.d dVar2) {
        c.j.b.d.d(eVar, "call");
        c.j.b.d.d(uVar, "eventListener");
        c.j.b.d.d(dVar, "finder");
        c.j.b.d.d(dVar2, "codec");
        this.f1446c = eVar;
        this.f1447d = uVar;
        this.f1448e = dVar;
        this.f = dVar2;
        this.f1445b = dVar2.h();
    }

    public final <E extends IOException> E a(long j, boolean z, boolean z2, E e2) {
        if (e2 != null) {
            f(e2);
        }
        if (z2) {
            u uVar = this.f1447d;
            e eVar = this.f1446c;
            if (e2 != null) {
                uVar.b(eVar, e2);
            } else {
                if (uVar == null) {
                    throw null;
                }
                c.j.b.d.d(eVar, "call");
            }
        }
        if (z) {
            if (e2 != null) {
                this.f1447d.c(this.f1446c, e2);
            } else {
                u uVar2 = this.f1447d;
                e eVar2 = this.f1446c;
                if (uVar2 == null) {
                    throw null;
                }
                c.j.b.d.d(eVar2, "call");
            }
        }
        return (E) this.f1446c.g(this, z2, z, e2);
    }

    public final x b(e0 e0Var, boolean z) {
        c.j.b.d.d(e0Var, "request");
        this.f1444a = z;
        f0 f0Var = e0Var.f1354e;
        c.j.b.d.b(f0Var);
        long jA = f0Var.a();
        u uVar = this.f1447d;
        e eVar = this.f1446c;
        if (uVar == null) {
            throw null;
        }
        c.j.b.d.d(eVar, "call");
        return new a(this, this.f.d(e0Var, jA), jA);
    }

    public final d.c c() throws SocketException {
        this.f1446c.j();
        j jVarH = this.f.h();
        if (jVarH == null) {
            throw null;
        }
        c.j.b.d.d(this, "exchange");
        Socket socket = jVarH.f1475c;
        c.j.b.d.b(socket);
        e.g gVar = jVarH.g;
        c.j.b.d.b(gVar);
        e.f fVar = jVarH.h;
        c.j.b.d.b(fVar);
        socket.setSoTimeout(0);
        jVarH.l();
        return new i(this, gVar, fVar, true, gVar, fVar);
    }

    public final g0.a d(boolean z) throws IOException {
        try {
            g0.a aVarG = this.f.g(z);
            if (aVarG != null) {
                c.j.b.d.d(this, "deferredTrailers");
                aVarG.m = this;
            }
            return aVarG;
        } catch (IOException e2) {
            this.f1447d.c(this.f1446c, e2);
            f(e2);
            throw e2;
        }
    }

    public final void e() {
        u uVar = this.f1447d;
        e eVar = this.f1446c;
        if (uVar == null) {
            throw null;
        }
        c.j.b.d.d(eVar, "call");
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0026, code lost:
    
        if (r6 > 1) goto L41;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(java.io.IOException r6) {
        /*
            r5 = this;
            d.n0.g.d r0 = r5.f1448e
            r0.c(r6)
            d.n0.h.d r0 = r5.f
            d.n0.g.j r0 = r0.h()
            d.n0.g.e r1 = r5.f1446c
            monitor-enter(r0)
            java.lang.String r2 = "call"
            c.j.b.d.d(r1, r2)     // Catch: java.lang.Throwable -> L56
            boolean r2 = r6 instanceof d.n0.j.u     // Catch: java.lang.Throwable -> L56
            r3 = 1
            if (r2 == 0) goto L38
            r2 = r6
            d.n0.j.u r2 = (d.n0.j.u) r2     // Catch: java.lang.Throwable -> L56
            d.n0.j.b r2 = r2.f1623b     // Catch: java.lang.Throwable -> L56
            d.n0.j.b r4 = d.n0.j.b.REFUSED_STREAM     // Catch: java.lang.Throwable -> L56
            if (r2 != r4) goto L2b
            int r6 = r0.m     // Catch: java.lang.Throwable -> L56
            int r6 = r6 + r3
            r0.m = r6     // Catch: java.lang.Throwable -> L56
            if (r6 <= r3) goto L54
        L28:
            r0.i = r3     // Catch: java.lang.Throwable -> L56
            goto L4f
        L2b:
            d.n0.j.u r6 = (d.n0.j.u) r6     // Catch: java.lang.Throwable -> L56
            d.n0.j.b r6 = r6.f1623b     // Catch: java.lang.Throwable -> L56
            d.n0.j.b r2 = d.n0.j.b.CANCEL     // Catch: java.lang.Throwable -> L56
            if (r6 != r2) goto L28
            boolean r6 = r1.n     // Catch: java.lang.Throwable -> L56
            if (r6 == 0) goto L28
            goto L54
        L38:
            boolean r2 = r0.j()     // Catch: java.lang.Throwable -> L56
            if (r2 == 0) goto L42
            boolean r2 = r6 instanceof d.n0.j.a     // Catch: java.lang.Throwable -> L56
            if (r2 == 0) goto L54
        L42:
            r0.i = r3     // Catch: java.lang.Throwable -> L56
            int r2 = r0.l     // Catch: java.lang.Throwable -> L56
            if (r2 != 0) goto L54
            d.c0 r1 = r1.q     // Catch: java.lang.Throwable -> L56
            d.j0 r2 = r0.q     // Catch: java.lang.Throwable -> L56
            r0.d(r1, r2, r6)     // Catch: java.lang.Throwable -> L56
        L4f:
            int r6 = r0.k     // Catch: java.lang.Throwable -> L56
            int r6 = r6 + r3
            r0.k = r6     // Catch: java.lang.Throwable -> L56
        L54:
            monitor-exit(r0)
            return
        L56:
            r6 = move-exception
            monitor-exit(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: d.n0.g.c.f(java.io.IOException):void");
    }
}
