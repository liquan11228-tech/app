package androidx.lifecycle;

import a.k.c;
import a.k.d;
import a.k.e;
import a.k.g;
import a.k.k;

/* loaded from: classes.dex */
public class CompositeGeneratedAdaptersObserver implements e {

    /* renamed from: a, reason: collision with root package name */
    public final c[] f1053a;

    public CompositeGeneratedAdaptersObserver(c[] cVarArr) {
        this.f1053a = cVarArr;
    }

    @Override // a.k.e
    public void g(g gVar, d.a aVar) {
        k kVar = new k();
        for (c cVar : this.f1053a) {
            cVar.a(gVar, aVar, false, kVar);
        }
        for (c cVar2 : this.f1053a) {
            cVar2.a(gVar, aVar, true, kVar);
        }
    }
}
