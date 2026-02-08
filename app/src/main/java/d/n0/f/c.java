package d.n0.f;

import a.b.k.h;
import d.n0.f.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a */
    public boolean f1427a;

    /* renamed from: b */
    public a f1428b;

    /* renamed from: c */
    public final List<a> f1429c;

    /* renamed from: d */
    public boolean f1430d;

    /* renamed from: e */
    public final d f1431e;
    public final String f;

    public c(d dVar, String str) {
        c.j.b.d.d(dVar, "taskRunner");
        c.j.b.d.d(str, "name");
        this.f1431e = dVar;
        this.f = str;
        this.f1429c = new ArrayList();
    }

    public static /* synthetic */ void d(c cVar, a aVar, long j, int i) {
        if ((i & 2) != 0) {
            j = 0;
        }
        cVar.c(aVar, j);
    }

    public final void a() {
        if (!d.n0.c.g || !Thread.holdsLock(this)) {
            synchronized (this.f1431e) {
                if (b()) {
                    this.f1431e.e(this);
                }
            }
            return;
        }
        StringBuilder sbE = b.a.a.a.a.e("Thread ");
        Thread threadCurrentThread = Thread.currentThread();
        c.j.b.d.c(threadCurrentThread, "Thread.currentThread()");
        sbE.append(threadCurrentThread.getName());
        sbE.append(" MUST NOT hold lock on ");
        sbE.append(this);
        throw new AssertionError(sbE.toString());
    }

    public final boolean b() {
        a aVar = this.f1428b;
        if (aVar != null) {
            c.j.b.d.b(aVar);
            if (aVar.f1425d) {
                this.f1430d = true;
            }
        }
        boolean z = false;
        for (int size = this.f1429c.size() - 1; size >= 0; size--) {
            if (this.f1429c.get(size).f1425d) {
                a aVar2 = this.f1429c.get(size);
                if (d.j.a().isLoggable(Level.FINE)) {
                    h.i.a(aVar2, this, "canceled");
                }
                this.f1429c.remove(size);
                z = true;
            }
        }
        return z;
    }

    public final void c(a aVar, long j) {
        c.j.b.d.d(aVar, "task");
        synchronized (this.f1431e) {
            if (!this.f1427a) {
                if (e(aVar, j, false)) {
                    this.f1431e.e(this);
                }
            } else if (aVar.f1425d) {
                if (d.j.a().isLoggable(Level.FINE)) {
                    h.i.a(aVar, this, "schedule canceled (queue is shutdown)");
                }
            } else {
                if (d.j.a().isLoggable(Level.FINE)) {
                    h.i.a(aVar, this, "schedule failed (queue is shutdown)");
                }
                throw new RejectedExecutionException();
            }
        }
    }

    public final boolean e(a aVar, long j, boolean z) {
        StringBuilder sb;
        String str;
        c.j.b.d.d(aVar, "task");
        c.j.b.d.d(this, "queue");
        c cVar = aVar.f1422a;
        if (cVar != this) {
            if (!(cVar == null)) {
                throw new IllegalStateException("task is in multiple queues".toString());
            }
            aVar.f1422a = this;
        }
        long jD = this.f1431e.g.d();
        long j2 = jD + j;
        int iIndexOf = this.f1429c.indexOf(aVar);
        if (iIndexOf != -1) {
            if (aVar.f1423b <= j2) {
                d.b bVar = d.j;
                if (d.i.isLoggable(Level.FINE)) {
                    h.i.a(aVar, this, "already scheduled");
                }
                return false;
            }
            this.f1429c.remove(iIndexOf);
        }
        aVar.f1423b = j2;
        d.b bVar2 = d.j;
        if (d.i.isLoggable(Level.FINE)) {
            if (z) {
                sb = new StringBuilder();
                str = "run again after ";
            } else {
                sb = new StringBuilder();
                str = "scheduled after ";
            }
            sb.append(str);
            sb.append(h.i.w(j2 - jD));
            h.i.a(aVar, this, sb.toString());
        }
        Iterator<a> it = this.f1429c.iterator();
        int size = 0;
        while (true) {
            if (!it.hasNext()) {
                size = -1;
                break;
            }
            if (it.next().f1423b - jD > j) {
                break;
            }
            size++;
        }
        if (size == -1) {
            size = this.f1429c.size();
        }
        this.f1429c.add(size, aVar);
        return size == 0;
    }

    public final void f() {
        if (!d.n0.c.g || !Thread.holdsLock(this)) {
            synchronized (this.f1431e) {
                this.f1427a = true;
                if (b()) {
                    this.f1431e.e(this);
                }
            }
            return;
        }
        StringBuilder sbE = b.a.a.a.a.e("Thread ");
        Thread threadCurrentThread = Thread.currentThread();
        c.j.b.d.c(threadCurrentThread, "Thread.currentThread()");
        sbE.append(threadCurrentThread.getName());
        sbE.append(" MUST NOT hold lock on ");
        sbE.append(this);
        throw new AssertionError(sbE.toString());
    }

    public String toString() {
        return this.f;
    }
}
