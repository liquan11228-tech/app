package b.d.a.c0.z;

import b.d.a.a0;
import b.d.a.z;

/* loaded from: classes.dex */
public class p implements a0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Class f1210b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z f1211c;

    public p(Class cls, z zVar) {
        this.f1210b = cls;
        this.f1211c = zVar;
    }

    @Override // b.d.a.a0
    public <T> z<T> a(b.d.a.j jVar, b.d.a.d0.a<T> aVar) {
        if (aVar.f1223a == this.f1210b) {
            return this.f1211c;
        }
        return null;
    }

    public String toString() {
        StringBuilder sbE = b.a.a.a.a.e("Factory[type=");
        sbE.append(this.f1210b.getName());
        sbE.append(",adapter=");
        sbE.append(this.f1211c);
        sbE.append("]");
        return sbE.toString();
    }
}
