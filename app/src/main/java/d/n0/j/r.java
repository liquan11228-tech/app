package d.n0.j;

import java.util.List;

/* loaded from: classes.dex */
public final class r implements s {
    @Override // d.n0.j.s
    public boolean a(int i, List<c> list) {
        c.j.b.d.d(list, "requestHeaders");
        return true;
    }

    @Override // d.n0.j.s
    public boolean b(int i, List<c> list, boolean z) {
        c.j.b.d.d(list, "responseHeaders");
        return true;
    }

    @Override // d.n0.j.s
    public void c(int i, b bVar) {
        c.j.b.d.d(bVar, "errorCode");
    }

    @Override // d.n0.j.s
    public boolean d(int i, e.g gVar, int i2, boolean z) {
        c.j.b.d.d(gVar, "source");
        gVar.p(i2);
        return true;
    }
}
