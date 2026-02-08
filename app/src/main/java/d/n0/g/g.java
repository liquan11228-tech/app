package d.n0.g;

import d.x;
import java.security.cert.Certificate;
import java.util.List;

/* loaded from: classes.dex */
public final class g extends c.j.b.e implements c.j.a.a<List<? extends Certificate>> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d.h f1469b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x f1470c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d.a f1471d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(d.h hVar, x xVar, d.a aVar) {
        super(0);
        this.f1469b = hVar;
        this.f1470c = xVar;
        this.f1471d = aVar;
    }

    @Override // c.j.a.a
    public List<? extends Certificate> c() {
        d.n0.m.c cVar = this.f1469b.f1373b;
        c.j.b.d.b(cVar);
        return cVar.a(this.f1470c.c(), this.f1471d.f1321a.f1742e);
    }
}
