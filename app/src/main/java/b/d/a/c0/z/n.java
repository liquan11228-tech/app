package b.d.a.c0.z;

import b.d.a.c0.z.j;
import b.d.a.z;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/* loaded from: classes.dex */
public final class n<T> extends z<T> {

    /* renamed from: a, reason: collision with root package name */
    public final b.d.a.j f1199a;

    /* renamed from: b, reason: collision with root package name */
    public final z<T> f1200b;

    /* renamed from: c, reason: collision with root package name */
    public final Type f1201c;

    public n(b.d.a.j jVar, z<T> zVar, Type type) {
        this.f1199a = jVar;
        this.f1200b = zVar;
        this.f1201c = type;
    }

    @Override // b.d.a.z
    public T a(b.d.a.e0.a aVar) {
        return this.f1200b.a(aVar);
    }

    @Override // b.d.a.z
    public void b(b.d.a.e0.c cVar, T t) {
        z<T> zVarC = this.f1200b;
        Type type = this.f1201c;
        if (t != null && (type == Object.class || (type instanceof TypeVariable) || (type instanceof Class))) {
            type = t.getClass();
        }
        if (type != this.f1201c) {
            zVarC = this.f1199a.c(new b.d.a.d0.a<>(type));
            if (zVarC instanceof j.a) {
                z<T> zVar = this.f1200b;
                if (!(zVar instanceof j.a)) {
                    zVarC = zVar;
                }
            }
        }
        zVarC.b(cVar, t);
    }
}
