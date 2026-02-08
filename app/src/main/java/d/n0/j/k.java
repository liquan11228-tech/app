package d.n0.j;

/* loaded from: classes.dex */
public final class k extends d.n0.f.a {

    /* renamed from: e */
    public final /* synthetic */ f f1581e;
    public final /* synthetic */ int f;
    public final /* synthetic */ b g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(String str, boolean z, String str2, boolean z2, f fVar, int i, b bVar) {
        super(str2, z2);
        this.f1581e = fVar;
        this.f = i;
        this.g = bVar;
    }

    @Override // d.n0.f.a
    public long a() {
        this.f1581e.m.c(this.f, this.g);
        synchronized (this.f1581e) {
            this.f1581e.C.remove(Integer.valueOf(this.f));
        }
        return -1L;
    }
}
