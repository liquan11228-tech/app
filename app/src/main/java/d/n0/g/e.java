package d.n0.g;

import a.b.k.h;
import d.c0;
import d.e0;
import d.n0.k.h;
import d.r;
import d.u;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class e implements d.f {

    /* renamed from: b */
    public final k f1460b;

    /* renamed from: c */
    public final u f1461c;

    /* renamed from: d */
    public final c f1462d;

    /* renamed from: e */
    public final AtomicBoolean f1463e;
    public Object f;
    public d g;
    public j h;
    public boolean i;
    public d.n0.g.c j;
    public boolean k;
    public boolean l;
    public boolean m;
    public volatile boolean n;
    public volatile d.n0.g.c o;
    public volatile j p;
    public final c0 q;
    public final e0 r;
    public final boolean s;

    public final class a implements Runnable {

        /* renamed from: b */
        public volatile AtomicInteger f1464b;

        /* renamed from: c */
        public final d.g f1465c;

        /* renamed from: d */
        public final /* synthetic */ e f1466d;

        public a(e eVar, d.g gVar) {
            c.j.b.d.d(gVar, "responseCallback");
            this.f1466d = eVar;
            this.f1465c = gVar;
            this.f1464b = new AtomicInteger(0);
        }

        public final String a() {
            return this.f1466d.r.f1351b.f1742e;
        }

        @Override // java.lang.Runnable
        public void run() {
            e eVar;
            StringBuilder sbE = b.a.a.a.a.e("OkHttp ");
            sbE.append(this.f1466d.r.f1351b.f());
            String string = sbE.toString();
            Thread threadCurrentThread = Thread.currentThread();
            c.j.b.d.c(threadCurrentThread, "currentThread");
            String name = threadCurrentThread.getName();
            threadCurrentThread.setName(string);
            try {
                this.f1466d.f1462d.i();
                boolean z = false;
                try {
                    try {
                    } catch (IOException e2) {
                        e = e2;
                    } catch (Throwable th) {
                        th = th;
                    }
                    try {
                        this.f1465c.a(this.f1466d, this.f1466d.f());
                        eVar = this.f1466d;
                    } catch (IOException e3) {
                        e = e3;
                        z = true;
                        if (z) {
                            h.a aVar = d.n0.k.h.f1646c;
                            d.n0.k.h.f1644a.i("Callback failure for " + e.a(this.f1466d), 4, e);
                        } else {
                            this.f1465c.b(this.f1466d, e);
                        }
                        eVar = this.f1466d;
                        eVar.q.f1332b.a(this);
                    } catch (Throwable th2) {
                        th = th2;
                        z = true;
                        this.f1466d.cancel();
                        if (!z) {
                            IOException iOException = new IOException("canceled due to " + th);
                            h.i.c(iOException, th);
                            this.f1465c.b(this.f1466d, iOException);
                        }
                        throw th;
                    }
                    eVar.q.f1332b.a(this);
                } catch (Throwable th3) {
                    this.f1466d.q.f1332b.a(this);
                    throw th3;
                }
            } finally {
                threadCurrentThread.setName(name);
            }
        }
    }

    public static final class b extends WeakReference<e> {

        /* renamed from: a */
        public final Object f1467a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(e eVar, Object obj) {
            super(eVar);
            c.j.b.d.d(eVar, "referent");
            this.f1467a = obj;
        }
    }

    public static final class c extends e.b {
        public c() {
        }

        @Override // e.b
        public void l() throws IOException {
            e.this.cancel();
        }
    }

    public e(c0 c0Var, e0 e0Var, boolean z) {
        c.j.b.d.d(c0Var, "client");
        c.j.b.d.d(e0Var, "originalRequest");
        this.q = c0Var;
        this.r = e0Var;
        this.s = z;
        this.f1460b = c0Var.f1333c.f1398a;
        this.f1461c = c0Var.f.a(this);
        c cVar = new c();
        cVar.g(this.q.y, TimeUnit.MILLISECONDS);
        this.f1462d = cVar;
        this.f1463e = new AtomicBoolean();
        this.m = true;
    }

    public static final String a(e eVar) {
        StringBuilder sb = new StringBuilder();
        sb.append(eVar.n ? "canceled " : "");
        sb.append(eVar.s ? "web socket" : "call");
        sb.append(" to ");
        sb.append(eVar.r.f1351b.f());
        return sb.toString();
    }

    public final void b(j jVar) {
        c.j.b.d.d(jVar, "connection");
        if (!d.n0.c.g || Thread.holdsLock(jVar)) {
            if (!(this.h == null)) {
                throw new IllegalStateException("Check failed.".toString());
            }
            this.h = jVar;
            jVar.o.add(new b(this, this.f));
            return;
        }
        StringBuilder sbE = b.a.a.a.a.e("Thread ");
        Thread threadCurrentThread = Thread.currentThread();
        c.j.b.d.c(threadCurrentThread, "Thread.currentThread()");
        sbE.append(threadCurrentThread.getName());
        sbE.append(" MUST hold lock on ");
        sbE.append(jVar);
        throw new AssertionError(sbE.toString());
    }

    public final <E extends IOException> E c(E e2) throws IOException {
        E interruptedIOException;
        Socket socketI;
        if (d.n0.c.g && Thread.holdsLock(this)) {
            StringBuilder sbE = b.a.a.a.a.e("Thread ");
            Thread threadCurrentThread = Thread.currentThread();
            c.j.b.d.c(threadCurrentThread, "Thread.currentThread()");
            sbE.append(threadCurrentThread.getName());
            sbE.append(" MUST NOT hold lock on ");
            sbE.append(this);
            throw new AssertionError(sbE.toString());
        }
        j jVar = this.h;
        if (jVar != null) {
            if (d.n0.c.g && Thread.holdsLock(jVar)) {
                StringBuilder sbE2 = b.a.a.a.a.e("Thread ");
                Thread threadCurrentThread2 = Thread.currentThread();
                c.j.b.d.c(threadCurrentThread2, "Thread.currentThread()");
                sbE2.append(threadCurrentThread2.getName());
                sbE2.append(" MUST NOT hold lock on ");
                sbE2.append(jVar);
                throw new AssertionError(sbE2.toString());
            }
            synchronized (jVar) {
                socketI = i();
            }
            if (this.h == null) {
                if (socketI != null) {
                    d.n0.c.f(socketI);
                }
                if (this.f1461c == null) {
                    throw null;
                }
                c.j.b.d.d(this, "call");
                c.j.b.d.d(jVar, "connection");
            } else {
                if (!(socketI == null)) {
                    throw new IllegalStateException("Check failed.".toString());
                }
            }
        }
        if (!this.i && this.f1462d.j()) {
            interruptedIOException = new InterruptedIOException("timeout");
            if (e2 != null) {
                interruptedIOException.initCause(e2);
            }
        } else {
            interruptedIOException = e2;
        }
        if (e2 != null) {
            u uVar = this.f1461c;
            c.j.b.d.b(interruptedIOException);
            if (uVar == null) {
                throw null;
            }
            c.j.b.d.d(this, "call");
            c.j.b.d.d(interruptedIOException, "ioe");
        } else {
            if (this.f1461c == null) {
                throw null;
            }
            c.j.b.d.d(this, "call");
        }
        return interruptedIOException;
    }

    @Override // d.f
    public void cancel() throws IOException {
        Socket socket;
        if (this.n) {
            return;
        }
        this.n = true;
        d.n0.g.c cVar = this.o;
        if (cVar != null) {
            cVar.f.cancel();
        }
        j jVar = this.p;
        if (jVar != null && (socket = jVar.f1474b) != null) {
            d.n0.c.f(socket);
        }
        if (this.f1461c == null) {
            throw null;
        }
        c.j.b.d.d(this, "call");
    }

    public Object clone() {
        return new e(this.q, this.r, this.s);
    }

    public void d(d.g gVar) {
        a next;
        c.j.b.d.d(gVar, "responseCallback");
        if (!this.f1463e.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed".toString());
        }
        h.a aVar = d.n0.k.h.f1646c;
        this.f = d.n0.k.h.f1644a.g("response.body().close()");
        a aVar2 = null;
        if (this.f1461c == null) {
            throw null;
        }
        c.j.b.d.d(this, "call");
        r rVar = this.q.f1332b;
        a aVar3 = new a(this, gVar);
        if (rVar == null) {
            throw null;
        }
        c.j.b.d.d(aVar3, "call");
        synchronized (rVar) {
            rVar.f1719d.add(aVar3);
            if (!aVar3.f1466d.s) {
                String strA = aVar3.a();
                Iterator<a> it = rVar.f1720e.iterator();
                while (true) {
                    if (it.hasNext()) {
                        next = it.next();
                        if (c.j.b.d.a(next.a(), strA)) {
                            break;
                        }
                    } else {
                        Iterator<a> it2 = rVar.f1719d.iterator();
                        while (it2.hasNext()) {
                            next = it2.next();
                            if (c.j.b.d.a(next.a(), strA)) {
                            }
                        }
                    }
                }
                aVar2 = next;
                if (aVar2 != null) {
                    c.j.b.d.d(aVar2, "other");
                    aVar3.f1464b = aVar2.f1464b;
                }
            }
        }
        rVar.b();
    }

    public final void e(boolean z) {
        d.n0.g.c cVar;
        synchronized (this) {
            if (!this.m) {
                throw new IllegalStateException("released".toString());
            }
        }
        if (z && (cVar = this.o) != null) {
            cVar.f.cancel();
            cVar.f1446c.g(cVar, true, true, null);
        }
        this.j = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final d.g0 f() throws java.lang.Throwable {
        /*
            r12 = this;
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            d.c0 r0 = r12.q
            java.util.List<d.a0> r0 = r0.f1334d
            a.b.k.h.i.b(r2, r0)
            d.n0.h.i r0 = new d.n0.h.i
            d.c0 r1 = r12.q
            r0.<init>(r1)
            r2.add(r0)
            d.n0.h.a r0 = new d.n0.h.a
            d.c0 r1 = r12.q
            d.q r1 = r1.k
            r0.<init>(r1)
            r2.add(r0)
            d.n0.e.a r0 = new d.n0.e.a
            d.c0 r1 = r12.q
            r9 = 0
            if (r1 == 0) goto L93
            r0.<init>()
            r2.add(r0)
            d.n0.g.a r0 = d.n0.g.a.f1439a
            r2.add(r0)
            boolean r0 = r12.s
            if (r0 != 0) goto L3f
            d.c0 r0 = r12.q
            java.util.List<d.a0> r0 = r0.f1335e
            a.b.k.h.i.b(r2, r0)
        L3f:
            d.n0.h.b r0 = new d.n0.h.b
            boolean r1 = r12.s
            r0.<init>(r1)
            r2.add(r0)
            d.n0.h.g r10 = new d.n0.h.g
            r3 = 0
            r4 = 0
            d.e0 r5 = r12.r
            d.c0 r0 = r12.q
            int r6 = r0.z
            int r7 = r0.A
            int r8 = r0.B
            r0 = r10
            r1 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r0 = 0
            d.e0 r1 = r12.r     // Catch: java.lang.Throwable -> L76 java.io.IOException -> L78
            d.g0 r1 = r10.b(r1)     // Catch: java.lang.Throwable -> L76 java.io.IOException -> L78
            boolean r2 = r12.n     // Catch: java.lang.Throwable -> L76 java.io.IOException -> L78
            if (r2 != 0) goto L6b
            r12.h(r9)
            return r1
        L6b:
            d.n0.c.e(r1)     // Catch: java.lang.Throwable -> L76 java.io.IOException -> L78
            java.io.IOException r1 = new java.io.IOException     // Catch: java.lang.Throwable -> L76 java.io.IOException -> L78
            java.lang.String r2 = "Canceled"
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L76 java.io.IOException -> L78
            throw r1     // Catch: java.lang.Throwable -> L76 java.io.IOException -> L78
        L76:
            r1 = move-exception
            goto L8d
        L78:
            r0 = move-exception
            r1 = 1
            java.io.IOException r0 = r12.h(r0)     // Catch: java.lang.Throwable -> L89
            if (r0 != 0) goto L88
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch: java.lang.Throwable -> L89
            java.lang.String r2 = "null cannot be cast to non-null type kotlin.Throwable"
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L89
            throw r0     // Catch: java.lang.Throwable -> L89
        L88:
            throw r0     // Catch: java.lang.Throwable -> L89
        L89:
            r0 = move-exception
            r11 = r1
            r1 = r0
            r0 = r11
        L8d:
            if (r0 != 0) goto L92
            r12.h(r9)
        L92:
            throw r1
        L93:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: d.n0.g.e.f():d.g0");
    }

    public final <E extends IOException> E g(d.n0.g.c cVar, boolean z, boolean z2, E e2) {
        boolean z3;
        boolean z4;
        c.j.b.d.d(cVar, "exchange");
        if (!c.j.b.d.a(cVar, this.o)) {
            return e2;
        }
        synchronized (this) {
            z3 = false;
            if (z) {
                try {
                    if (!this.k) {
                        if (z2 || !this.l) {
                            z4 = false;
                        }
                    }
                    if (z) {
                        this.k = false;
                    }
                    if (z2) {
                        this.l = false;
                    }
                    boolean z5 = (this.k || this.l) ? false : true;
                    if (!this.k && !this.l) {
                        if (!this.m) {
                            z3 = true;
                        }
                    }
                    boolean z6 = z5;
                    z4 = z3;
                    z3 = z6;
                } catch (Throwable th) {
                    throw th;
                }
            } else {
                if (z2) {
                }
                z4 = false;
            }
        }
        if (z3) {
            this.o = null;
            j jVar = this.h;
            if (jVar != null) {
                synchronized (jVar) {
                    jVar.l++;
                }
            }
        }
        return z4 ? (E) c(e2) : e2;
    }

    public final IOException h(IOException iOException) {
        boolean z;
        synchronized (this) {
            z = false;
            if (this.m) {
                this.m = false;
                if (!this.k) {
                    if (!this.l) {
                        z = true;
                    }
                }
            }
        }
        return z ? c(iOException) : iOException;
    }

    public final Socket i() {
        j jVar = this.h;
        c.j.b.d.b(jVar);
        if (d.n0.c.g && !Thread.holdsLock(jVar)) {
            StringBuilder sbE = b.a.a.a.a.e("Thread ");
            Thread threadCurrentThread = Thread.currentThread();
            c.j.b.d.c(threadCurrentThread, "Thread.currentThread()");
            sbE.append(threadCurrentThread.getName());
            sbE.append(" MUST hold lock on ");
            sbE.append(jVar);
            throw new AssertionError(sbE.toString());
        }
        List<Reference<e>> list = jVar.o;
        Iterator<Reference<e>> it = list.iterator();
        boolean z = false;
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (c.j.b.d.a(it.next().get(), this)) {
                break;
            }
            i++;
        }
        if (!(i != -1)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        list.remove(i);
        this.h = null;
        if (list.isEmpty()) {
            jVar.p = System.nanoTime();
            k kVar = this.f1460b;
            if (kVar == null) {
                throw null;
            }
            c.j.b.d.d(jVar, "connection");
            if (d.n0.c.g && !Thread.holdsLock(jVar)) {
                StringBuilder sbE2 = b.a.a.a.a.e("Thread ");
                Thread threadCurrentThread2 = Thread.currentThread();
                c.j.b.d.c(threadCurrentThread2, "Thread.currentThread()");
                sbE2.append(threadCurrentThread2.getName());
                sbE2.append(" MUST hold lock on ");
                sbE2.append(jVar);
                throw new AssertionError(sbE2.toString());
            }
            if (jVar.i || kVar.f1482e == 0) {
                jVar.i = true;
                kVar.f1481d.remove(jVar);
                if (kVar.f1481d.isEmpty()) {
                    kVar.f1479b.a();
                }
                z = true;
            } else {
                d.n0.f.c.d(kVar.f1479b, kVar.f1480c, 0L, 2);
            }
            if (z) {
                Socket socket = jVar.f1475c;
                c.j.b.d.b(socket);
                return socket;
            }
        }
        return null;
    }

    public final void j() {
        if (!(!this.i)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        this.i = true;
        this.f1462d.j();
    }
}
