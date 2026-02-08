package e;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class a0 {

    /* renamed from: d, reason: collision with root package name */
    public static final a0 f1749d = new a();

    /* renamed from: a, reason: collision with root package name */
    public boolean f1750a;

    /* renamed from: b, reason: collision with root package name */
    public long f1751b;

    /* renamed from: c, reason: collision with root package name */
    public long f1752c;

    public static final class a extends a0 {
        @Override // e.a0
        public a0 d(long j) {
            return this;
        }

        @Override // e.a0
        public void f() {
        }

        @Override // e.a0
        public a0 g(long j, TimeUnit timeUnit) {
            c.j.b.d.d(timeUnit, "unit");
            return this;
        }
    }

    public a0 a() {
        this.f1750a = false;
        return this;
    }

    public a0 b() {
        this.f1752c = 0L;
        return this;
    }

    public long c() {
        if (this.f1750a) {
            return this.f1751b;
        }
        throw new IllegalStateException("No deadline".toString());
    }

    public a0 d(long j) {
        this.f1750a = true;
        this.f1751b = j;
        return this;
    }

    public boolean e() {
        return this.f1750a;
    }

    public void f() throws InterruptedIOException {
        if (Thread.interrupted()) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        }
        if (this.f1750a && this.f1751b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public a0 g(long j, TimeUnit timeUnit) {
        c.j.b.d.d(timeUnit, "unit");
        if (j >= 0) {
            this.f1752c = timeUnit.toNanos(j);
            return this;
        }
        throw new IllegalArgumentException(("timeout < 0: " + j).toString());
    }

    public long h() {
        return this.f1752c;
    }
}
