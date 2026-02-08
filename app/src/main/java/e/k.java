package e;

/* loaded from: classes.dex */
public abstract class k implements z {

    /* renamed from: b, reason: collision with root package name */
    public final z f1774b;

    public k(z zVar) {
        c.j.b.d.d(zVar, "delegate");
        this.f1774b = zVar;
    }

    @Override // e.z
    public a0 b() {
        return this.f1774b.b();
    }

    public String toString() {
        return getClass().getSimpleName() + '(' + this.f1774b + ')';
    }
}
