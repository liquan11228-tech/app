package e;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: b, reason: collision with root package name */
    public static final int f1804b;

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicReference<u>[] f1805c;

    /* renamed from: d, reason: collision with root package name */
    public static final v f1806d = new v();

    /* renamed from: a, reason: collision with root package name */
    public static final u f1803a = new u(new byte[0], 0, 0, false, false);

    static {
        int iHighestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f1804b = iHighestOneBit;
        AtomicReference<u>[] atomicReferenceArr = new AtomicReference[iHighestOneBit];
        for (int i = 0; i < iHighestOneBit; i++) {
            atomicReferenceArr[i] = new AtomicReference<>();
        }
        f1805c = atomicReferenceArr;
    }

    public static final void a(u uVar) {
        c.j.b.d.d(uVar, "segment");
        if (!(uVar.f == null && uVar.g == null)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (uVar.f1801d) {
            return;
        }
        Thread threadCurrentThread = Thread.currentThread();
        c.j.b.d.c(threadCurrentThread, "Thread.currentThread()");
        AtomicReference<u> atomicReference = f1805c[(int) (threadCurrentThread.getId() & (f1804b - 1))];
        u uVar2 = atomicReference.get();
        if (uVar2 == f1803a) {
            return;
        }
        int i = uVar2 != null ? uVar2.f1800c : 0;
        if (i >= 65536) {
            return;
        }
        uVar.f = uVar2;
        uVar.f1799b = 0;
        uVar.f1800c = i + 8192;
        if (atomicReference.compareAndSet(uVar2, uVar)) {
            return;
        }
        uVar.f = null;
    }

    public static final u b() {
        Thread threadCurrentThread = Thread.currentThread();
        c.j.b.d.c(threadCurrentThread, "Thread.currentThread()");
        AtomicReference<u> atomicReference = f1805c[(int) (threadCurrentThread.getId() & (f1804b - 1))];
        u andSet = atomicReference.getAndSet(f1803a);
        if (andSet == f1803a) {
            return new u();
        }
        if (andSet == null) {
            atomicReference.set(null);
            return new u();
        }
        atomicReference.set(andSet.f);
        andSet.f = null;
        andSet.f1800c = 0;
        return andSet;
    }
}
