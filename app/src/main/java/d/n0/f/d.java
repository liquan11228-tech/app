package d.n0.f;

import a.b.k.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class d {
    public static final d h;
    public static final Logger i;
    public static final b j = new b(null);

    /* renamed from: a, reason: collision with root package name */
    public int f1432a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1433b;

    /* renamed from: c, reason: collision with root package name */
    public long f1434c;

    /* renamed from: d, reason: collision with root package name */
    public final List<d.n0.f.c> f1435d;

    /* renamed from: e, reason: collision with root package name */
    public final List<d.n0.f.c> f1436e;
    public final Runnable f;
    public final a g;

    public interface a {
        void a(d dVar);

        void b(d dVar, long j);

        void c(Runnable runnable);

        long d();
    }

    public static final class b {
        public b(c.j.b.c cVar) {
        }

        public final Logger a() {
            return d.i;
        }
    }

    public static final class c implements a {

        /* renamed from: a, reason: collision with root package name */
        public final ThreadPoolExecutor f1437a;

        public c(ThreadFactory threadFactory) {
            c.j.b.d.d(threadFactory, "threadFactory");
            this.f1437a = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), threadFactory);
        }

        @Override // d.n0.f.d.a
        public void a(d dVar) {
            c.j.b.d.d(dVar, "taskRunner");
            dVar.notify();
        }

        @Override // d.n0.f.d.a
        public void b(d dVar, long j) throws InterruptedException {
            c.j.b.d.d(dVar, "taskRunner");
            long j2 = j / 1000000;
            long j3 = j - (1000000 * j2);
            if (j2 > 0 || j > 0) {
                dVar.wait(j2, (int) j3);
            }
        }

        @Override // d.n0.f.d.a
        public void c(Runnable runnable) {
            c.j.b.d.d(runnable, "runnable");
            this.f1437a.execute(runnable);
        }

        @Override // d.n0.f.d.a
        public long d() {
            return System.nanoTime();
        }
    }

    /* renamed from: d.n0.f.d$d, reason: collision with other inner class name */
    public static final class RunnableC0034d implements Runnable {
        public RunnableC0034d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            d.n0.f.a aVarC;
            while (true) {
                synchronized (d.this) {
                    aVarC = d.this.c();
                }
                if (aVarC == null) {
                    return;
                }
                d.n0.f.c cVar = aVarC.f1422a;
                c.j.b.d.b(cVar);
                long jD = -1;
                b bVar = d.j;
                boolean zIsLoggable = d.i.isLoggable(Level.FINE);
                if (zIsLoggable) {
                    jD = cVar.f1431e.g.d();
                    h.i.a(aVarC, cVar, "starting");
                }
                try {
                    d.a(d.this, aVarC);
                    if (zIsLoggable) {
                        long jD2 = cVar.f1431e.g.d() - jD;
                        StringBuilder sbE = b.a.a.a.a.e("finished run in ");
                        sbE.append(h.i.w(jD2));
                        h.i.a(aVarC, cVar, sbE.toString());
                    }
                } finally {
                }
            }
        }
    }

    static {
        String str = d.n0.c.h + " TaskRunner";
        c.j.b.d.d(str, "name");
        h = new d(new c(new d.n0.b(str, true)));
        Logger logger = Logger.getLogger(d.class.getName());
        c.j.b.d.c(logger, "Logger.getLogger(TaskRunner::class.java.name)");
        i = logger;
    }

    public d(a aVar) {
        c.j.b.d.d(aVar, "backend");
        this.g = aVar;
        this.f1432a = 10000;
        this.f1435d = new ArrayList();
        this.f1436e = new ArrayList();
        this.f = new RunnableC0034d();
    }

    public static final void a(d dVar, d.n0.f.a aVar) {
        if (dVar == null) {
            throw null;
        }
        if (d.n0.c.g && Thread.holdsLock(dVar)) {
            StringBuilder sbE = b.a.a.a.a.e("Thread ");
            Thread threadCurrentThread = Thread.currentThread();
            c.j.b.d.c(threadCurrentThread, "Thread.currentThread()");
            sbE.append(threadCurrentThread.getName());
            sbE.append(" MUST NOT hold lock on ");
            sbE.append(dVar);
            throw new AssertionError(sbE.toString());
        }
        Thread threadCurrentThread2 = Thread.currentThread();
        c.j.b.d.c(threadCurrentThread2, "currentThread");
        String name = threadCurrentThread2.getName();
        threadCurrentThread2.setName(aVar.f1424c);
        try {
            long jA = aVar.a();
            synchronized (dVar) {
                dVar.b(aVar, jA);
            }
            threadCurrentThread2.setName(name);
        } catch (Throwable th) {
            synchronized (dVar) {
                dVar.b(aVar, -1L);
                threadCurrentThread2.setName(name);
                throw th;
            }
        }
    }

    public final void b(d.n0.f.a aVar, long j2) {
        if (d.n0.c.g && !Thread.holdsLock(this)) {
            StringBuilder sbE = b.a.a.a.a.e("Thread ");
            Thread threadCurrentThread = Thread.currentThread();
            c.j.b.d.c(threadCurrentThread, "Thread.currentThread()");
            sbE.append(threadCurrentThread.getName());
            sbE.append(" MUST hold lock on ");
            sbE.append(this);
            throw new AssertionError(sbE.toString());
        }
        d.n0.f.c cVar = aVar.f1422a;
        c.j.b.d.b(cVar);
        if (!(cVar.f1428b == aVar)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        boolean z = cVar.f1430d;
        cVar.f1430d = false;
        cVar.f1428b = null;
        this.f1435d.remove(cVar);
        if (j2 != -1 && !z && !cVar.f1427a) {
            cVar.e(aVar, j2, true);
        }
        if (!cVar.f1429c.isEmpty()) {
            this.f1436e.add(cVar);
        }
    }

    public final d.n0.f.a c() {
        boolean z;
        if (d.n0.c.g && !Thread.holdsLock(this)) {
            StringBuilder sbE = b.a.a.a.a.e("Thread ");
            Thread threadCurrentThread = Thread.currentThread();
            c.j.b.d.c(threadCurrentThread, "Thread.currentThread()");
            sbE.append(threadCurrentThread.getName());
            sbE.append(" MUST hold lock on ");
            sbE.append(this);
            throw new AssertionError(sbE.toString());
        }
        while (true) {
            d.n0.f.a aVar = null;
            if (this.f1436e.isEmpty()) {
                return null;
            }
            long jD = this.g.d();
            long jMin = Long.MAX_VALUE;
            Iterator<d.n0.f.c> it = this.f1436e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                d.n0.f.a aVar2 = it.next().f1429c.get(0);
                long jMax = Math.max(0L, aVar2.f1423b - jD);
                if (jMax > 0) {
                    jMin = Math.min(jMax, jMin);
                } else {
                    if (aVar != null) {
                        z = true;
                        break;
                    }
                    aVar = aVar2;
                }
            }
            if (aVar != null) {
                if (d.n0.c.g && !Thread.holdsLock(this)) {
                    StringBuilder sbE2 = b.a.a.a.a.e("Thread ");
                    Thread threadCurrentThread2 = Thread.currentThread();
                    c.j.b.d.c(threadCurrentThread2, "Thread.currentThread()");
                    sbE2.append(threadCurrentThread2.getName());
                    sbE2.append(" MUST hold lock on ");
                    sbE2.append(this);
                    throw new AssertionError(sbE2.toString());
                }
                aVar.f1423b = -1L;
                d.n0.f.c cVar = aVar.f1422a;
                c.j.b.d.b(cVar);
                cVar.f1429c.remove(aVar);
                this.f1436e.remove(cVar);
                cVar.f1428b = aVar;
                this.f1435d.add(cVar);
                if (z || (!this.f1433b && (!this.f1436e.isEmpty()))) {
                    this.g.c(this.f);
                }
                return aVar;
            }
            if (this.f1433b) {
                if (jMin >= this.f1434c - jD) {
                    return null;
                }
                this.g.a(this);
                return null;
            }
            this.f1433b = true;
            this.f1434c = jD + jMin;
            try {
                try {
                    this.g.b(this, jMin);
                } catch (InterruptedException unused) {
                    d();
                }
            } finally {
                this.f1433b = false;
            }
        }
    }

    public final void d() {
        for (int size = this.f1435d.size() - 1; size >= 0; size--) {
            this.f1435d.get(size).b();
        }
        for (int size2 = this.f1436e.size() - 1; size2 >= 0; size2--) {
            d.n0.f.c cVar = this.f1436e.get(size2);
            cVar.b();
            if (cVar.f1429c.isEmpty()) {
                this.f1436e.remove(size2);
            }
        }
    }

    public final void e(d.n0.f.c cVar) {
        c.j.b.d.d(cVar, "taskQueue");
        if (d.n0.c.g && !Thread.holdsLock(this)) {
            StringBuilder sbE = b.a.a.a.a.e("Thread ");
            Thread threadCurrentThread = Thread.currentThread();
            c.j.b.d.c(threadCurrentThread, "Thread.currentThread()");
            sbE.append(threadCurrentThread.getName());
            sbE.append(" MUST hold lock on ");
            sbE.append(this);
            throw new AssertionError(sbE.toString());
        }
        if (cVar.f1428b == null) {
            if (!cVar.f1429c.isEmpty()) {
                List<d.n0.f.c> list = this.f1436e;
                c.j.b.d.d(list, "$this$addIfAbsent");
                if (!list.contains(cVar)) {
                    list.add(cVar);
                }
            } else {
                this.f1436e.remove(cVar);
            }
        }
        if (this.f1433b) {
            this.g.a(this);
        } else {
            this.g.c(this.f);
        }
    }

    public final d.n0.f.c f() {
        int i2;
        synchronized (this) {
            i2 = this.f1432a;
            this.f1432a = i2 + 1;
        }
        StringBuilder sb = new StringBuilder();
        sb.append('Q');
        sb.append(i2);
        return new d.n0.f.c(this, sb.toString());
    }
}
