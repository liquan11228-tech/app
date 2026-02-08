package e;

/* loaded from: classes.dex */
public abstract class j implements x {

    /* renamed from: b, reason: collision with root package name */
    public final x f1773b;

    public j(x xVar) {
        c.j.b.d.d(xVar, "delegate");
        this.f1773b = xVar;
    }

    @Override // e.x
    public a0 b() {
        return this.f1773b.b();
    }

    @Override // e.x
    public void e(e eVar, long j) {
        c.j.b.d.d(eVar, "source");
        this.f1773b.e(eVar, j);
    }

    public String toString() {
        return getClass().getSimpleName() + '(' + this.f1773b + ')';
    }
}
