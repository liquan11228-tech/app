package d;

import d.n0.g.e;
import java.util.ArrayDeque;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: c */
    public ExecutorService f1718c;

    /* renamed from: a */
    public int f1716a = 64;

    /* renamed from: b */
    public int f1717b = 5;

    /* renamed from: d */
    public final ArrayDeque<e.a> f1719d = new ArrayDeque<>();

    /* renamed from: e */
    public final ArrayDeque<e.a> f1720e = new ArrayDeque<>();
    public final ArrayDeque<d.n0.g.e> f = new ArrayDeque<>();

    public final void a(e.a aVar) {
        c.j.b.d.d(aVar, "call");
        aVar.f1464b.decrementAndGet();
        ArrayDeque<e.a> arrayDeque = this.f1720e;
        synchronized (this) {
            if (!arrayDeque.remove(aVar)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
        }
        b();
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x0099  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean b() {
        /*
            Method dump skipped, instructions count: 348
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: d.r.b():boolean");
    }
}
