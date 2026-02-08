package d.n0.g;

import d.j0;
import d.n0.g.e;
import d.n0.k.h;
import java.io.IOException;
import java.lang.ref.Reference;
import java.net.Socket;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final long f1478a;

    /* renamed from: b, reason: collision with root package name */
    public final d.n0.f.c f1479b;

    /* renamed from: c, reason: collision with root package name */
    public final a f1480c;

    /* renamed from: d, reason: collision with root package name */
    public final ConcurrentLinkedQueue<j> f1481d;

    /* renamed from: e, reason: collision with root package name */
    public final int f1482e;

    public static final class a extends d.n0.f.a {
        public a(String str) {
            super(str, true);
        }

        @Override // d.n0.f.a
        public long a() throws IOException {
            k kVar = k.this;
            long jNanoTime = System.nanoTime();
            Iterator<j> it = kVar.f1481d.iterator();
            int i = 0;
            long j = Long.MIN_VALUE;
            j jVar = null;
            int i2 = 0;
            while (it.hasNext()) {
                j next = it.next();
                c.j.b.d.c(next, "connection");
                synchronized (next) {
                    if (kVar.b(next, jNanoTime) > 0) {
                        i2++;
                    } else {
                        i++;
                        long j2 = jNanoTime - next.p;
                        if (j2 > j) {
                            jVar = next;
                            j = j2;
                        }
                    }
                }
            }
            long j3 = kVar.f1478a;
            if (j < j3 && i <= kVar.f1482e) {
                if (i > 0) {
                    return j3 - j;
                }
                if (i2 > 0) {
                    return j3;
                }
                return -1L;
            }
            c.j.b.d.b(jVar);
            synchronized (jVar) {
                if (!(!jVar.o.isEmpty()) && jVar.p + j == jNanoTime) {
                    jVar.i = true;
                    kVar.f1481d.remove(jVar);
                    Socket socket = jVar.f1475c;
                    c.j.b.d.b(socket);
                    d.n0.c.f(socket);
                    if (!kVar.f1481d.isEmpty()) {
                        return 0L;
                    }
                    kVar.f1479b.a();
                    return 0L;
                }
                return 0L;
            }
        }
    }

    public k(d.n0.f.d dVar, int i, long j, TimeUnit timeUnit) {
        c.j.b.d.d(dVar, "taskRunner");
        c.j.b.d.d(timeUnit, "timeUnit");
        this.f1482e = i;
        this.f1478a = timeUnit.toNanos(j);
        this.f1479b = dVar.f();
        this.f1480c = new a(b.a.a.a.a.d(new StringBuilder(), d.n0.c.h, " ConnectionPool"));
        this.f1481d = new ConcurrentLinkedQueue<>();
        if (j > 0) {
            return;
        }
        throw new IllegalArgumentException(("keepAliveDuration <= 0: " + j).toString());
    }

    public final boolean a(d.a aVar, e eVar, List<j0> list, boolean z) {
        c.j.b.d.d(aVar, "address");
        c.j.b.d.d(eVar, "call");
        Iterator<j> it = this.f1481d.iterator();
        while (it.hasNext()) {
            j next = it.next();
            c.j.b.d.c(next, "connection");
            synchronized (next) {
                if (z) {
                    if (!next.j()) {
                    }
                }
                if (next.h(aVar, list)) {
                    eVar.b(next);
                    return true;
                }
            }
        }
        return false;
    }

    public final int b(j jVar, long j) {
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
        int i = 0;
        while (i < list.size()) {
            Reference<e> reference = list.get(i);
            if (reference.get() != null) {
                i++;
            } else {
                StringBuilder sbE2 = b.a.a.a.a.e("A connection to ");
                sbE2.append(jVar.q.f1386a.f1321a);
                sbE2.append(" was leaked. ");
                sbE2.append("Did you forget to close a response body?");
                String string = sbE2.toString();
                h.a aVar = d.n0.k.h.f1646c;
                d.n0.k.h.f1644a.k(string, ((e.b) reference).f1467a);
                list.remove(i);
                jVar.i = true;
                if (list.isEmpty()) {
                    jVar.p = j - this.f1478a;
                    return 0;
                }
            }
        }
        return list.size();
    }

    public final void c(j jVar) {
        c.j.b.d.d(jVar, "connection");
        if (!d.n0.c.g || Thread.holdsLock(jVar)) {
            this.f1481d.add(jVar);
            d.n0.f.c.d(this.f1479b, this.f1480c, 0L, 2);
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
}
