package e;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class l extends a0 {

    /* renamed from: e, reason: collision with root package name */
    public a0 f1775e;

    public l(a0 a0Var) {
        c.j.b.d.d(a0Var, "delegate");
        this.f1775e = a0Var;
    }

    @Override // e.a0
    public a0 a() {
        return this.f1775e.a();
    }

    @Override // e.a0
    public a0 b() {
        return this.f1775e.b();
    }

    @Override // e.a0
    public long c() {
        return this.f1775e.c();
    }

    @Override // e.a0
    public a0 d(long j) {
        return this.f1775e.d(j);
    }

    @Override // e.a0
    public boolean e() {
        return this.f1775e.e();
    }

    @Override // e.a0
    public void f() throws InterruptedIOException {
        this.f1775e.f();
    }

    @Override // e.a0
    public a0 g(long j, TimeUnit timeUnit) {
        c.j.b.d.d(timeUnit, "unit");
        return this.f1775e.g(j, timeUnit);
    }

    @Override // e.a0
    public long h() {
        return this.f1775e.h();
    }
}
