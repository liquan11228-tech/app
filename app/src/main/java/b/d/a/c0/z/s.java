package b.d.a.c0.z;

import b.d.a.a0;
import b.d.a.w;
import b.d.a.z;

/* loaded from: classes.dex */
public class s implements a0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Class f1218b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z f1219c;

    /* JADX INFO: Add missing generic type declarations: [T1] */
    public class a<T1> extends z<T1> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Class f1220a;

        public a(Class cls) {
            this.f1220a = cls;
        }

        @Override // b.d.a.z
        public T1 a(b.d.a.e0.a aVar) {
            T1 t1 = (T1) s.this.f1219c.a(aVar);
            if (t1 == null || this.f1220a.isInstance(t1)) {
                return t1;
            }
            StringBuilder sbE = b.a.a.a.a.e("Expected a ");
            sbE.append(this.f1220a.getName());
            sbE.append(" but was ");
            sbE.append(t1.getClass().getName());
            throw new w(sbE.toString());
        }

        @Override // b.d.a.z
        public void b(b.d.a.e0.c cVar, T1 t1) {
            s.this.f1219c.b(cVar, t1);
        }
    }

    public s(Class cls, z zVar) {
        this.f1218b = cls;
        this.f1219c = zVar;
    }

    @Override // b.d.a.a0
    public <T2> z<T2> a(b.d.a.j jVar, b.d.a.d0.a<T2> aVar) {
        Class<? super T2> cls = aVar.f1223a;
        if (this.f1218b.isAssignableFrom(cls)) {
            return new a(cls);
        }
        return null;
    }

    public String toString() {
        StringBuilder sbE = b.a.a.a.a.e("Factory[typeHierarchy=");
        sbE.append(this.f1218b.getName());
        sbE.append(",adapter=");
        sbE.append(this.f1219c);
        sbE.append("]");
        return sbE.toString();
    }
}
