package e;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class b extends a0 {
    public static b j;

    /* renamed from: e, reason: collision with root package name */
    public boolean f1753e;
    public b f;
    public long g;
    public static final a k = new a(null);
    public static final long h = TimeUnit.SECONDS.toMillis(60);
    public static final long i = TimeUnit.MILLISECONDS.toNanos(h);

    public static final class a {
        public a(c.j.b.c cVar) {
        }

        public final b a() throws InterruptedException {
            b bVar = b.j;
            c.j.b.d.b(bVar);
            b bVar2 = bVar.f;
            long jNanoTime = System.nanoTime();
            if (bVar2 == null) {
                b.class.wait(b.h);
                b bVar3 = b.j;
                c.j.b.d.b(bVar3);
                if (bVar3.f != null || System.nanoTime() - jNanoTime < b.i) {
                    return null;
                }
                return b.j;
            }
            long j = bVar2.g - jNanoTime;
            if (j > 0) {
                long j2 = j / 1000000;
                b.class.wait(j2, (int) (j - (1000000 * j2)));
                return null;
            }
            b bVar4 = b.j;
            c.j.b.d.b(bVar4);
            bVar4.f = bVar2.f;
            bVar2.f = null;
            return bVar2;
        }
    }

    /* renamed from: e.b$b, reason: collision with other inner class name */
    public static final class C0040b extends Thread {
        public C0040b() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            b bVarA;
            while (true) {
                try {
                    synchronized (b.class) {
                        bVarA = b.k.a();
                        if (bVarA == b.j) {
                            b.j = null;
                            return;
                        }
                    }
                    if (bVarA != null) {
                        bVarA.l();
                    }
                } catch (InterruptedException unused) {
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0053 A[Catch: all -> 0x0078, TryCatch #0 {, blocks: (B:10:0x0018, B:12:0x001c, B:13:0x002b, B:16:0x0033, B:18:0x003f, B:21:0x0047, B:22:0x004c, B:24:0x0053, B:27:0x0060, B:28:0x0063, B:30:0x006d, B:20:0x0043, B:33:0x0072, B:34:0x0077), top: B:40:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006d A[Catch: all -> 0x0078, TRY_LEAVE, TryCatch #0 {, blocks: (B:10:0x0018, B:12:0x001c, B:13:0x002b, B:16:0x0033, B:18:0x003f, B:21:0x0047, B:22:0x004c, B:24:0x0053, B:27:0x0060, B:28:0x0063, B:30:0x006d, B:20:0x0043, B:33:0x0072, B:34:0x0077), top: B:40:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0063 A[EDGE_INSN: B:41:0x0063->B:28:0x0063 BREAK  A[LOOP:0: B:22:0x004c->B:27:0x0060], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i() {
        /*
            r9 = this;
            boolean r0 = r9.f1753e
            r1 = 1
            r0 = r0 ^ r1
            if (r0 == 0) goto L7b
            long r2 = r9.f1752c
            boolean r0 = r9.f1750a
            r4 = 0
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 != 0) goto L13
            if (r0 != 0) goto L13
            return
        L13:
            r9.f1753e = r1
            java.lang.Class<e.b> r1 = e.b.class
            monitor-enter(r1)
            e.b r5 = e.b.j     // Catch: java.lang.Throwable -> L78
            if (r5 != 0) goto L2b
            e.b r5 = new e.b     // Catch: java.lang.Throwable -> L78
            r5.<init>()     // Catch: java.lang.Throwable -> L78
            e.b.j = r5     // Catch: java.lang.Throwable -> L78
            e.b$b r5 = new e.b$b     // Catch: java.lang.Throwable -> L78
            r5.<init>()     // Catch: java.lang.Throwable -> L78
            r5.start()     // Catch: java.lang.Throwable -> L78
        L2b:
            long r5 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L78
            if (r4 == 0) goto L3d
            if (r0 == 0) goto L3d
            long r7 = r9.c()     // Catch: java.lang.Throwable -> L78
            long r7 = r7 - r5
            long r2 = java.lang.Math.min(r2, r7)     // Catch: java.lang.Throwable -> L78
            goto L3f
        L3d:
            if (r4 == 0) goto L41
        L3f:
            long r2 = r2 + r5
            goto L47
        L41:
            if (r0 == 0) goto L72
            long r2 = r9.c()     // Catch: java.lang.Throwable -> L78
        L47:
            r9.g = r2     // Catch: java.lang.Throwable -> L78
            long r2 = r2 - r5
            e.b r0 = e.b.j     // Catch: java.lang.Throwable -> L78
        L4c:
            c.j.b.d.b(r0)     // Catch: java.lang.Throwable -> L78
            e.b r4 = r0.f     // Catch: java.lang.Throwable -> L78
            if (r4 == 0) goto L63
            e.b r4 = r0.f     // Catch: java.lang.Throwable -> L78
            c.j.b.d.b(r4)     // Catch: java.lang.Throwable -> L78
            long r7 = r4.g     // Catch: java.lang.Throwable -> L78
            long r7 = r7 - r5
            int r4 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r4 >= 0) goto L60
            goto L63
        L60:
            e.b r0 = r0.f     // Catch: java.lang.Throwable -> L78
            goto L4c
        L63:
            e.b r2 = r0.f     // Catch: java.lang.Throwable -> L78
            r9.f = r2     // Catch: java.lang.Throwable -> L78
            r0.f = r9     // Catch: java.lang.Throwable -> L78
            e.b r2 = e.b.j     // Catch: java.lang.Throwable -> L78
            if (r0 != r2) goto L70
            r1.notify()     // Catch: java.lang.Throwable -> L78
        L70:
            monitor-exit(r1)
            return
        L72:
            java.lang.AssertionError r0 = new java.lang.AssertionError     // Catch: java.lang.Throwable -> L78
            r0.<init>()     // Catch: java.lang.Throwable -> L78
            throw r0     // Catch: java.lang.Throwable -> L78
        L78:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L7b:
            java.lang.String r0 = "Unbalanced enter/exit"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: e.b.i():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0014, code lost:
    
        r3.f = r5.f;
        r5.f = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean j() {
        /*
            r5 = this;
            boolean r0 = r5.f1753e
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            r5.f1753e = r1
            r0 = 0
            java.lang.Class<e.b> r2 = e.b.class
            monitor-enter(r2)
            e.b r3 = e.b.j     // Catch: java.lang.Throwable -> L21
        Le:
            if (r3 == 0) goto L1e
            e.b r4 = r3.f     // Catch: java.lang.Throwable -> L21
            if (r4 != r5) goto L1b
            e.b r4 = r5.f     // Catch: java.lang.Throwable -> L21
            r3.f = r4     // Catch: java.lang.Throwable -> L21
            r5.f = r0     // Catch: java.lang.Throwable -> L21
            goto L1f
        L1b:
            e.b r3 = r3.f     // Catch: java.lang.Throwable -> L21
            goto Le
        L1e:
            r1 = 1
        L1f:
            monitor-exit(r2)
            return r1
        L21:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: e.b.j():boolean");
    }

    public IOException k(IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    public void l() {
    }
}
