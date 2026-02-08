package b.d.a.d0;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* loaded from: classes.dex */
public class a<T> {

    /* renamed from: a, reason: collision with root package name */
    public final Class<? super T> f1223a;

    /* renamed from: b, reason: collision with root package name */
    public final Type f1224b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1225c;

    public a() {
        Type genericSuperclass = a.class.getGenericSuperclass();
        if (genericSuperclass instanceof Class) {
            throw new RuntimeException("Missing type parameter.");
        }
        Type typeA = b.d.a.c0.a.a(((ParameterizedType) genericSuperclass).getActualTypeArguments()[0]);
        this.f1224b = typeA;
        this.f1223a = (Class<? super T>) b.d.a.c0.a.e(typeA);
        this.f1225c = this.f1224b.hashCode();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof a) && b.d.a.c0.a.c(this.f1224b, ((a) obj).f1224b);
    }

    public final int hashCode() {
        return this.f1225c;
    }

    public final String toString() {
        return b.d.a.c0.a.i(this.f1224b);
    }

    public a(Type type) {
        if (type == null) {
            throw null;
        }
        Type typeA = b.d.a.c0.a.a(type);
        this.f1224b = typeA;
        this.f1223a = (Class<? super T>) b.d.a.c0.a.e(typeA);
        this.f1225c = this.f1224b.hashCode();
    }
}
