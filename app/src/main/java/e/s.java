package e;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class s implements f {

    /* renamed from: b, reason: collision with root package name */
    public final e f1792b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1793c;

    /* renamed from: d, reason: collision with root package name */
    public final x f1794d;

    public s(x xVar) {
        c.j.b.d.d(xVar, "sink");
        this.f1794d = xVar;
        this.f1792b = new e();
    }

    @Override // e.f
    public e a() {
        return this.f1792b;
    }

    @Override // e.x
    public a0 b() {
        return this.f1794d.b();
    }

    @Override // e.f
    public f c(byte[] bArr) {
        c.j.b.d.d(bArr, "source");
        if (!(!this.f1793c)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f1792b.M(bArr);
        i();
        return this;
    }

    @Override // e.x, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        if (this.f1793c) {
            return;
        }
        Throwable th = null;
        try {
            if (this.f1792b.f1761c > 0) {
                this.f1794d.e(this.f1792b, this.f1792b.f1761c);
            }
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            this.f1794d.close();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        this.f1793c = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // e.f
    public f d(int i) {
        if (!(!this.f1793c)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f1792b.R(i);
        return i();
    }

    @Override // e.x
    public void e(e eVar, long j) {
        c.j.b.d.d(eVar, "source");
        if (!(!this.f1793c)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f1792b.e(eVar, j);
        i();
    }

    @Override // e.f
    public f f(h hVar) {
        c.j.b.d.d(hVar, "byteString");
        if (!(!this.f1793c)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f1792b.L(hVar);
        i();
        return this;
    }

    @Override // e.f, e.x, java.io.Flushable
    public void flush() {
        if (!(!this.f1793c)) {
            throw new IllegalStateException("closed".toString());
        }
        e eVar = this.f1792b;
        long j = eVar.f1761c;
        if (j > 0) {
            this.f1794d.e(eVar, j);
        }
        this.f1794d.flush();
    }

    @Override // e.f
    public f i() {
        if (!(!this.f1793c)) {
            throw new IllegalStateException("closed".toString());
        }
        e eVar = this.f1792b;
        long j = eVar.f1761c;
        if (j == 0) {
            j = 0;
        } else {
            u uVar = eVar.f1760b;
            c.j.b.d.b(uVar);
            u uVar2 = uVar.g;
            c.j.b.d.b(uVar2);
            if (uVar2.f1800c < 8192 && uVar2.f1802e) {
                j -= r5 - uVar2.f1799b;
            }
        }
        if (j > 0) {
            this.f1794d.e(this.f1792b, j);
        }
        return this;
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.f1793c;
    }

    @Override // e.f
    public f j(long j) {
        if (!(!this.f1793c)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f1792b.j(j);
        return i();
    }

    @Override // e.f
    public f n(String str) {
        c.j.b.d.d(str, "string");
        if (!(!this.f1793c)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f1792b.T(str);
        i();
        return this;
    }

    @Override // e.f
    public f r(int i) {
        if (!(!this.f1793c)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f1792b.P(i);
        return i();
    }

    @Override // e.f
    public f s() {
        if (!(!this.f1793c)) {
            throw new IllegalStateException("closed".toString());
        }
        e eVar = this.f1792b;
        long j = eVar.f1761c;
        if (j > 0) {
            this.f1794d.e(eVar, j);
        }
        return this;
    }

    public String toString() {
        StringBuilder sbE = b.a.a.a.a.e("buffer(");
        sbE.append(this.f1794d);
        sbE.append(')');
        return sbE.toString();
    }

    @Override // e.f
    public f u(int i) {
        if (!(!this.f1793c)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f1792b.S(i);
        i();
        return this;
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) {
        c.j.b.d.d(byteBuffer, "source");
        if (!(!this.f1793c)) {
            throw new IllegalStateException("closed".toString());
        }
        int iWrite = this.f1792b.write(byteBuffer);
        i();
        return iWrite;
    }
}
