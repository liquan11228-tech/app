package b.d.a.c0.z;

import b.d.a.a0;
import b.d.a.z;

/* loaded from: classes.dex */
public class q implements a0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Class f1212b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Class f1213c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z f1214d;

    public q(Class cls, Class cls2, z zVar) {
        this.f1212b = cls;
        this.f1213c = cls2;
        this.f1214d = zVar;
    }

    @Override // b.d.a.a0
    public <T> z<T> a(b.d.a.j jVar, b.d.a.d0.a<T> aVar) {
        Class<? super T> cls = aVar.f1223a;
        if (cls == this.f1212b || cls == this.f1213c) {
            return this.f1214d;
        }
        return null;
    }

    public String toString() {
        StringBuilder sbE = b.a.a.a.a.e("Factory[type=");
        sbE.append(this.f1213c.getName());
        sbE.append("+");
        sbE.append(this.f1212b.getName());
        sbE.append(",adapter=");
        sbE.append(this.f1214d);
        sbE.append("]");
        return sbE.toString();
    }
}
