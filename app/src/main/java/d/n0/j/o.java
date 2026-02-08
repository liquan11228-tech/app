package d.n0.j;

import d.y;
import e.a0;
import e.x;
import e.z;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a */
    public long f1596a;

    /* renamed from: b */
    public long f1597b;

    /* renamed from: c */
    public long f1598c;

    /* renamed from: d */
    public long f1599d;

    /* renamed from: e */
    public final ArrayDeque<y> f1600e;
    public boolean f;
    public final b g;
    public final a h;
    public final c i;
    public final c j;
    public d.n0.j.b k;
    public IOException l;
    public final int m;
    public final f n;

    public final class a implements x {

        /* renamed from: b */
        public final e.e f1601b = new e.e();

        /* renamed from: c */
        public boolean f1602c;

        /* renamed from: d */
        public boolean f1603d;

        public a(boolean z) {
            this.f1603d = z;
        }

        @Override // e.x
        public a0 b() {
            return o.this.j;
        }

        @Override // e.x, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws SocketTimeoutException {
            o oVar = o.this;
            if (d.n0.c.g && Thread.holdsLock(oVar)) {
                StringBuilder sbE = b.a.a.a.a.e("Thread ");
                Thread threadCurrentThread = Thread.currentThread();
                c.j.b.d.c(threadCurrentThread, "Thread.currentThread()");
                sbE.append(threadCurrentThread.getName());
                sbE.append(" MUST NOT hold lock on ");
                sbE.append(oVar);
                throw new AssertionError(sbE.toString());
            }
            synchronized (o.this) {
                if (this.f1602c) {
                    return;
                }
                boolean z = o.this.f() == null;
                if (!o.this.h.f1603d) {
                    if (this.f1601b.f1761c > 0) {
                        while (this.f1601b.f1761c > 0) {
                            y(true);
                        }
                    } else if (z) {
                        o oVar2 = o.this;
                        oVar2.n.E(oVar2.m, true, null, 0L);
                    }
                }
                synchronized (o.this) {
                    this.f1602c = true;
                }
                o.this.n.A.flush();
                o.this.a();
            }
        }

        @Override // e.x
        public void e(e.e eVar, long j) throws SocketTimeoutException {
            c.j.b.d.d(eVar, "source");
            o oVar = o.this;
            if (!d.n0.c.g || !Thread.holdsLock(oVar)) {
                this.f1601b.e(eVar, j);
                while (this.f1601b.f1761c >= 16384) {
                    y(false);
                }
            } else {
                StringBuilder sbE = b.a.a.a.a.e("Thread ");
                Thread threadCurrentThread = Thread.currentThread();
                c.j.b.d.c(threadCurrentThread, "Thread.currentThread()");
                sbE.append(threadCurrentThread.getName());
                sbE.append(" MUST NOT hold lock on ");
                sbE.append(oVar);
                throw new AssertionError(sbE.toString());
            }
        }

        @Override // e.x, java.io.Flushable
        public void flush() throws SocketTimeoutException {
            o oVar = o.this;
            if (d.n0.c.g && Thread.holdsLock(oVar)) {
                StringBuilder sbE = b.a.a.a.a.e("Thread ");
                Thread threadCurrentThread = Thread.currentThread();
                c.j.b.d.c(threadCurrentThread, "Thread.currentThread()");
                sbE.append(threadCurrentThread.getName());
                sbE.append(" MUST NOT hold lock on ");
                sbE.append(oVar);
                throw new AssertionError(sbE.toString());
            }
            synchronized (o.this) {
                o.this.b();
            }
            while (this.f1601b.f1761c > 0) {
                y(false);
                o.this.n.flush();
            }
        }

        public final void y(boolean z) throws SocketTimeoutException {
            long jMin;
            boolean z2;
            synchronized (o.this) {
                o.this.j.i();
                while (o.this.f1598c >= o.this.f1599d && !this.f1603d && !this.f1602c && o.this.f() == null) {
                    try {
                        o.this.l();
                    } finally {
                    }
                }
                o.this.j.m();
                o.this.b();
                jMin = Math.min(o.this.f1599d - o.this.f1598c, this.f1601b.f1761c);
                o.this.f1598c += jMin;
                z2 = z && jMin == this.f1601b.f1761c && o.this.f() == null;
            }
            o.this.j.i();
            try {
                o.this.n.E(o.this.m, z2, this.f1601b, jMin);
            } finally {
            }
        }
    }

    public final class b implements z {

        /* renamed from: b */
        public final e.e f1605b = new e.e();

        /* renamed from: c */
        public final e.e f1606c = new e.e();

        /* renamed from: d */
        public boolean f1607d;

        /* renamed from: e */
        public final long f1608e;
        public boolean f;

        public b(long j, boolean z) {
            this.f1608e = j;
            this.f = z;
        }

        @Override // e.z
        public a0 b() {
            return o.this.i;
        }

        @Override // e.z, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            long j;
            synchronized (o.this) {
                this.f1607d = true;
                j = this.f1606c.f1761c;
                e.e eVar = this.f1606c;
                eVar.p(eVar.f1761c);
                o oVar = o.this;
                if (oVar == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.Object");
                }
                oVar.notifyAll();
            }
            if (j > 0) {
                y(j);
            }
            o.this.a();
        }

        @Override // e.z
        public long l(e.e eVar, long j) throws Throwable {
            long jL;
            boolean z;
            c.j.b.d.d(eVar, "sink");
            long j2 = 0;
            if (!(j >= 0)) {
                throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
            }
            while (true) {
                Throwable uVar = null;
                synchronized (o.this) {
                    o.this.i.i();
                    try {
                        if (o.this.f() != null && (uVar = o.this.l) == null) {
                            d.n0.j.b bVarF = o.this.f();
                            c.j.b.d.b(bVarF);
                            uVar = new u(bVarF);
                        }
                        if (this.f1607d) {
                            throw new IOException("stream closed");
                        }
                        if (this.f1606c.f1761c > j2) {
                            jL = this.f1606c.l(eVar, Math.min(j, this.f1606c.f1761c));
                            o.this.f1596a += jL;
                            long j3 = o.this.f1596a - o.this.f1597b;
                            if (uVar == null && j3 >= o.this.n.t.a() / 2) {
                                o.this.n.H(o.this.m, j3);
                                o.this.f1597b = o.this.f1596a;
                            }
                        } else if (this.f || uVar != null) {
                            jL = -1;
                        } else {
                            o.this.l();
                            jL = -1;
                            z = true;
                        }
                        z = false;
                    } finally {
                    }
                }
                if (!z) {
                    if (jL != -1) {
                        y(jL);
                        return jL;
                    }
                    if (uVar == null) {
                        return -1L;
                    }
                    c.j.b.d.b(uVar);
                    throw uVar;
                }
                j2 = 0;
            }
        }

        public final void y(long j) {
            o oVar = o.this;
            if (!d.n0.c.g || !Thread.holdsLock(oVar)) {
                o.this.n.D(j);
                return;
            }
            StringBuilder sbE = b.a.a.a.a.e("Thread ");
            Thread threadCurrentThread = Thread.currentThread();
            c.j.b.d.c(threadCurrentThread, "Thread.currentThread()");
            sbE.append(threadCurrentThread.getName());
            sbE.append(" MUST NOT hold lock on ");
            sbE.append(oVar);
            throw new AssertionError(sbE.toString());
        }
    }

    public final class c extends e.b {
        public c() {
        }

        @Override // e.b
        public IOException k(IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }

        @Override // e.b
        public void l() {
            o.this.e(d.n0.j.b.CANCEL);
            f fVar = o.this.n;
            synchronized (fVar) {
                if (fVar.q < fVar.p) {
                    return;
                }
                fVar.p++;
                fVar.s = System.nanoTime() + 1000000000;
                d.n0.f.c cVar = fVar.j;
                String strD = b.a.a.a.a.d(new StringBuilder(), fVar.f1562e, " ping");
                cVar.c(new l(strD, true, strD, true, fVar), 0L);
            }
        }

        public final void m() throws SocketTimeoutException {
            if (j()) {
                throw new SocketTimeoutException("timeout");
            }
        }
    }

    public o(int i, f fVar, boolean z, boolean z2, y yVar) {
        c.j.b.d.d(fVar, "connection");
        this.m = i;
        this.n = fVar;
        this.f1599d = fVar.u.a();
        this.f1600e = new ArrayDeque<>();
        this.g = new b(this.n.t.a(), z2);
        this.h = new a(z);
        this.i = new c();
        this.j = new c();
        boolean zH = h();
        if (yVar == null) {
            if (!zH) {
                throw new IllegalStateException("remotely-initiated streams should have headers".toString());
            }
        } else {
            if (!(!zH)) {
                throw new IllegalStateException("locally-initiated streams shouldn't have headers yet".toString());
            }
            this.f1600e.add(yVar);
        }
    }

    public final void a() {
        boolean z;
        boolean zI;
        if (d.n0.c.g && Thread.holdsLock(this)) {
            StringBuilder sbE = b.a.a.a.a.e("Thread ");
            Thread threadCurrentThread = Thread.currentThread();
            c.j.b.d.c(threadCurrentThread, "Thread.currentThread()");
            sbE.append(threadCurrentThread.getName());
            sbE.append(" MUST NOT hold lock on ");
            sbE.append(this);
            throw new AssertionError(sbE.toString());
        }
        synchronized (this) {
            z = !this.g.f && this.g.f1607d && (this.h.f1603d || this.h.f1602c);
            zI = i();
        }
        if (z) {
            c(d.n0.j.b.CANCEL, null);
        } else {
            if (zI) {
                return;
            }
            this.n.B(this.m);
        }
    }

    public final void b() throws IOException {
        a aVar = this.h;
        if (aVar.f1602c) {
            throw new IOException("stream closed");
        }
        if (aVar.f1603d) {
            throw new IOException("stream finished");
        }
        if (this.k != null) {
            IOException iOException = this.l;
            if (iOException != null) {
                throw iOException;
            }
            d.n0.j.b bVar = this.k;
            c.j.b.d.b(bVar);
            throw new u(bVar);
        }
    }

    public final void c(d.n0.j.b bVar, IOException iOException) {
        c.j.b.d.d(bVar, "rstStatusCode");
        if (d(bVar, iOException)) {
            f fVar = this.n;
            int i = this.m;
            if (fVar == null) {
                throw null;
            }
            c.j.b.d.d(bVar, "statusCode");
            fVar.A.E(i, bVar);
        }
    }

    public final boolean d(d.n0.j.b bVar, IOException iOException) {
        if (d.n0.c.g && Thread.holdsLock(this)) {
            StringBuilder sbE = b.a.a.a.a.e("Thread ");
            Thread threadCurrentThread = Thread.currentThread();
            c.j.b.d.c(threadCurrentThread, "Thread.currentThread()");
            sbE.append(threadCurrentThread.getName());
            sbE.append(" MUST NOT hold lock on ");
            sbE.append(this);
            throw new AssertionError(sbE.toString());
        }
        synchronized (this) {
            if (this.k != null) {
                return false;
            }
            if (this.g.f && this.h.f1603d) {
                return false;
            }
            this.k = bVar;
            this.l = iOException;
            notifyAll();
            this.n.B(this.m);
            return true;
        }
    }

    public final void e(d.n0.j.b bVar) {
        c.j.b.d.d(bVar, "errorCode");
        if (d(bVar, null)) {
            this.n.G(this.m, bVar);
        }
    }

    public final synchronized d.n0.j.b f() {
        return this.k;
    }

    public final x g() {
        synchronized (this) {
            if (!(this.f || h())) {
                throw new IllegalStateException("reply before requesting the sink".toString());
            }
        }
        return this.h;
    }

    public final boolean h() {
        return this.n.f1559b == ((this.m & 1) == 1);
    }

    public final synchronized boolean i() {
        if (this.k != null) {
            return false;
        }
        if ((this.g.f || this.g.f1607d) && (this.h.f1603d || this.h.f1602c)) {
            if (this.f) {
                return false;
            }
        }
        return true;
    }

    public final void j(y yVar, boolean z) {
        boolean zI;
        c.j.b.d.d(yVar, "headers");
        if (d.n0.c.g && Thread.holdsLock(this)) {
            StringBuilder sbE = b.a.a.a.a.e("Thread ");
            Thread threadCurrentThread = Thread.currentThread();
            c.j.b.d.c(threadCurrentThread, "Thread.currentThread()");
            sbE.append(threadCurrentThread.getName());
            sbE.append(" MUST NOT hold lock on ");
            sbE.append(this);
            throw new AssertionError(sbE.toString());
        }
        synchronized (this) {
            if (!this.f || !z) {
                this.f = true;
                this.f1600e.add(yVar);
            } else if (this.g == null) {
                throw null;
            }
            if (z) {
                this.g.f = true;
            }
            zI = i();
            notifyAll();
        }
        if (zI) {
            return;
        }
        this.n.B(this.m);
    }

    public final synchronized void k(d.n0.j.b bVar) {
        c.j.b.d.d(bVar, "errorCode");
        if (this.k == null) {
            this.k = bVar;
            notifyAll();
        }
    }

    public final void l() throws InterruptedException, InterruptedIOException {
        try {
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }
}
