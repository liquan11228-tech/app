package d.n0.n;

import e.e;
import java.io.Closeable;
import java.io.IOException;
import java.util.Random;

/* loaded from: classes.dex */
public final class i implements Closeable {

    /* renamed from: b, reason: collision with root package name */
    public final e.e f1706b;

    /* renamed from: c, reason: collision with root package name */
    public final e.e f1707c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f1708d;

    /* renamed from: e, reason: collision with root package name */
    public a f1709e;
    public final byte[] f;
    public final e.a g;
    public final boolean h;
    public final e.f i;
    public final Random j;
    public final boolean k;
    public final boolean l;
    public final long m;

    public i(boolean z, e.f fVar, Random random, boolean z2, boolean z3, long j) {
        c.j.b.d.d(fVar, "sink");
        c.j.b.d.d(random, "random");
        this.h = z;
        this.i = fVar;
        this.j = random;
        this.k = z2;
        this.l = z3;
        this.m = j;
        this.f1706b = new e.e();
        this.f1707c = this.i.a();
        this.f = this.h ? new byte[4] : null;
        this.g = this.h ? new e.a() : null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        a aVar = this.f1709e;
        if (aVar != null) {
            aVar.f1672d.close();
        }
    }

    public final void y(int i, e.h hVar) {
        if (this.f1708d) {
            throw new IOException("closed");
        }
        int iC = hVar.c();
        if (!(((long) iC) <= 125)) {
            throw new IllegalArgumentException("Payload size must be less than or equal to 125".toString());
        }
        this.f1707c.P(i | 128);
        if (this.h) {
            this.f1707c.P(iC | 128);
            Random random = this.j;
            byte[] bArr = this.f;
            c.j.b.d.b(bArr);
            random.nextBytes(bArr);
            this.f1707c.M(this.f);
            if (iC > 0) {
                e.e eVar = this.f1707c;
                long j = eVar.f1761c;
                eVar.L(hVar);
                e.e eVar2 = this.f1707c;
                e.a aVar = this.g;
                c.j.b.d.b(aVar);
                eVar2.D(aVar);
                this.g.z(j);
                g.b(this.g, this.f);
                this.g.close();
            }
        } else {
            this.f1707c.P(iC);
            this.f1707c.L(hVar);
        }
        this.i.flush();
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void z(int r14, e.h r15) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 454
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: d.n0.n.i.z(int, e.h):void");
    }
}
