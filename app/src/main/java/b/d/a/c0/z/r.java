package b.d.a.c0.z;

import b.d.a.a0;
import b.d.a.z;

/* loaded from: classes.dex */
public class r implements a0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Class f1215b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Class f1216c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z f1217d;

    public r(Class cls, Class cls2, z zVar) {
        this.f1215b = cls;
        this.f1216c = cls2;
        this.f1217d = zVar;
    }

    @Override // b.d.a.a0
    public <T> z<T> a(b.d.a.j jVar, b.d.a.d0.a<T> aVar) {
        Class<? super T> cls = aVar.f1223a;
        if (cls == this.f1215b || cls == this.f1216c) {
            return this.f1217d;
        }
        return null;
    }

    public String toString() {
        StringBuilder sbE = b.a.a.a.a.e("Factory[type=");
        sbE.append(this.f1215b.getName());
        sbE.append("+");
        sbE.append(this.f1216c.getName());
        sbE.append(",adapter=");
        sbE.append(this.f1217d);
        sbE.append("]");
        return sbE.toString();
    }
}
