package d;

import a.b.k.h;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class i extends c.j.b.e implements c.j.a.a<List<? extends X509Certificate>> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f1380b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f1381c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f1382d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(h hVar, List list, String str) {
        super(0);
        this.f1380b = hVar;
        this.f1381c = list;
        this.f1382d = str;
    }

    @Override // c.j.a.a
    public List<? extends X509Certificate> c() {
        List<Certificate> listA;
        d.n0.m.c cVar = this.f1380b.f1373b;
        if (cVar == null || (listA = cVar.a(this.f1381c, this.f1382d)) == null) {
            listA = this.f1381c;
        }
        ArrayList arrayList = new ArrayList(h.i.r(listA, 10));
        for (Certificate certificate : listA) {
            if (certificate == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.security.cert.X509Certificate");
            }
            arrayList.add((X509Certificate) certificate);
        }
        return arrayList;
    }
}
