package b.d.a.c0.z;

import b.d.a.a0;
import b.d.a.z;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class a<E> extends z<Object> {

    /* renamed from: c, reason: collision with root package name */
    public static final a0 f1162c = new C0026a();

    /* renamed from: a, reason: collision with root package name */
    public final Class<E> f1163a;

    /* renamed from: b, reason: collision with root package name */
    public final z<E> f1164b;

    /* renamed from: b.d.a.c0.z.a$a, reason: collision with other inner class name */
    public class C0026a implements a0 {
        @Override // b.d.a.a0
        public <T> z<T> a(b.d.a.j jVar, b.d.a.d0.a<T> aVar) {
            Type type = aVar.f1224b;
            boolean z = type instanceof GenericArrayType;
            if (!z && (!(type instanceof Class) || !((Class) type).isArray())) {
                return null;
            }
            Type genericComponentType = z ? ((GenericArrayType) type).getGenericComponentType() : ((Class) type).getComponentType();
            return new a(jVar, jVar.c(new b.d.a.d0.a<>(genericComponentType)), b.d.a.c0.a.e(genericComponentType));
        }
    }

    public a(b.d.a.j jVar, z<E> zVar, Class<E> cls) {
        this.f1164b = new n(jVar, zVar, cls);
        this.f1163a = cls;
    }

    @Override // b.d.a.z
    public Object a(b.d.a.e0.a aVar) throws IOException, ArrayIndexOutOfBoundsException, IllegalArgumentException, NegativeArraySizeException {
        if (aVar.T() == b.d.a.e0.b.NULL) {
            aVar.P();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        aVar.y();
        while (aVar.G()) {
            arrayList.add(this.f1164b.a(aVar));
        }
        aVar.C();
        int size = arrayList.size();
        Object objNewInstance = Array.newInstance((Class<?>) this.f1163a, size);
        for (int i = 0; i < size; i++) {
            Array.set(objNewInstance, i, arrayList.get(i));
        }
        return objNewInstance;
    }

    @Override // b.d.a.z
    public void b(b.d.a.e0.c cVar, Object obj) throws IOException, ArrayIndexOutOfBoundsException, IllegalArgumentException {
        if (obj == null) {
            cVar.G();
            return;
        }
        cVar.z();
        int length = Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            this.f1164b.b(cVar, Array.get(obj, i));
        }
        cVar.C();
    }
}
