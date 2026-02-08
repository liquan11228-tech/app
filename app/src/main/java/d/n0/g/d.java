package d.n0.g;

import d.j0;
import d.n0.g.n;
import d.u;
import d.z;
import java.io.IOException;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public n.a f1455a;

    /* renamed from: b, reason: collision with root package name */
    public n f1456b;

    /* renamed from: c, reason: collision with root package name */
    public int f1457c;

    /* renamed from: d, reason: collision with root package name */
    public int f1458d;

    /* renamed from: e, reason: collision with root package name */
    public int f1459e;
    public j0 f;
    public final k g;
    public final d.a h;
    public final e i;
    public final u j;

    public d(k kVar, d.a aVar, e eVar, u uVar) {
        c.j.b.d.d(kVar, "connectionPool");
        c.j.b.d.d(aVar, "address");
        c.j.b.d.d(eVar, "call");
        c.j.b.d.d(uVar, "eventListener");
        this.g = kVar;
        this.h = aVar;
        this.i = eVar;
        this.j = uVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0299 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final d.n0.g.j a(int r16, int r17, int r18, int r19, boolean r20, boolean r21) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 822
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: d.n0.g.d.a(int, int, int, int, boolean, boolean):d.n0.g.j");
    }

    public final boolean b(z zVar) {
        c.j.b.d.d(zVar, "url");
        z zVar2 = this.h.f1321a;
        return zVar.f == zVar2.f && c.j.b.d.a(zVar.f1742e, zVar2.f1742e);
    }

    public final void c(IOException iOException) {
        c.j.b.d.d(iOException, "e");
        this.f = null;
        if ((iOException instanceof d.n0.j.u) && ((d.n0.j.u) iOException).f1623b == d.n0.j.b.REFUSED_STREAM) {
            this.f1457c++;
        } else if (iOException instanceof d.n0.j.a) {
            this.f1458d++;
        } else {
            this.f1459e++;
        }
    }
}
