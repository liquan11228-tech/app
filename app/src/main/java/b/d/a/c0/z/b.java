package b.d.a.c0.z;

import b.d.a.a0;
import b.d.a.c0.t;
import b.d.a.z;
import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class b implements a0 {

    /* renamed from: b, reason: collision with root package name */
    public final b.d.a.c0.g f1165b;

    public static final class a<E> extends z<Collection<E>> {

        /* renamed from: a, reason: collision with root package name */
        public final z<E> f1166a;

        /* renamed from: b, reason: collision with root package name */
        public final t<? extends Collection<E>> f1167b;

        public a(b.d.a.j jVar, Type type, z<E> zVar, t<? extends Collection<E>> tVar) {
            this.f1166a = new n(jVar, zVar, type);
            this.f1167b = tVar;
        }

        @Override // b.d.a.z
        public Object a(b.d.a.e0.a aVar) throws IOException {
            if (aVar.T() == b.d.a.e0.b.NULL) {
                aVar.P();
                return null;
            }
            Collection<E> collectionA = this.f1167b.a();
            aVar.y();
            while (aVar.G()) {
                collectionA.add(this.f1166a.a(aVar));
            }
            aVar.C();
            return collectionA;
        }

        @Override // b.d.a.z
        public void b(b.d.a.e0.c cVar, Object obj) throws IOException {
            Collection collection = (Collection) obj;
            if (collection == null) {
                cVar.G();
                return;
            }
            cVar.z();
            Iterator<E> it = collection.iterator();
            while (it.hasNext()) {
                this.f1166a.b(cVar, it.next());
            }
            cVar.C();
        }
    }

    public b(b.d.a.c0.g gVar) {
        this.f1165b = gVar;
    }

    @Override // b.d.a.a0
    public <T> z<T> a(b.d.a.j jVar, b.d.a.d0.a<T> aVar) {
        Type type = aVar.f1224b;
        Class<? super T> cls = aVar.f1223a;
        if (!Collection.class.isAssignableFrom(cls)) {
            return null;
        }
        Type typeF = b.d.a.c0.a.f(type, cls, Collection.class);
        if (typeF instanceof WildcardType) {
            typeF = ((WildcardType) typeF).getUpperBounds()[0];
        }
        Class cls2 = typeF instanceof ParameterizedType ? ((ParameterizedType) typeF).getActualTypeArguments()[0] : Object.class;
        return new a(jVar, cls2, jVar.c(new b.d.a.d0.a<>(cls2)), this.f1165b.a(aVar));
    }
}
