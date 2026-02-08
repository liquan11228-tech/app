package d.n0.g;

import a.b.k.h;
import d.x;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class h extends c.j.b.e implements c.j.a.a<List<? extends X509Certificate>> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f1472b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(j jVar) {
        super(0);
        this.f1472b = jVar;
    }

    @Override // c.j.a.a
    public List<? extends X509Certificate> c() {
        x xVar = this.f1472b.f1476d;
        c.j.b.d.b(xVar);
        List<Certificate> listC = xVar.c();
        ArrayList arrayList = new ArrayList(h.i.r(listC, 10));
        for (Certificate certificate : listC) {
            if (certificate == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.security.cert.X509Certificate");
            }
            arrayList.add((X509Certificate) certificate);
        }
        return arrayList;
    }
}
