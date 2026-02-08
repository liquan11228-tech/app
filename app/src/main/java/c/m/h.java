package c.m;

/* loaded from: classes.dex */
public final class h extends c.j.b.e implements c.j.a.b<c.k.c, String> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CharSequence f1320b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(CharSequence charSequence) {
        super(1);
        this.f1320b = charSequence;
    }

    @Override // c.j.a.b
    public String b(c.k.c cVar) {
        c.k.c cVar2 = cVar;
        c.j.b.d.d(cVar2, "it");
        return e.A(this.f1320b, cVar2);
    }
}
