package b.d.a.c0.z;

import b.d.a.a0;
import b.d.a.c0.t;
import b.d.a.e0.a;
import b.d.a.w;
import b.d.a.z;
import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;

/* loaded from: classes.dex */
public final class g implements a0 {

    /* renamed from: b, reason: collision with root package name */
    public final b.d.a.c0.g f1171b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f1172c;

    public final class a<K, V> extends z<Map<K, V>> {

        /* renamed from: a, reason: collision with root package name */
        public final z<K> f1173a;

        /* renamed from: b, reason: collision with root package name */
        public final z<V> f1174b;

        /* renamed from: c, reason: collision with root package name */
        public final t<? extends Map<K, V>> f1175c;

        public a(b.d.a.j jVar, Type type, z<K> zVar, Type type2, z<V> zVar2, t<? extends Map<K, V>> tVar) {
            this.f1173a = new n(jVar, zVar, type);
            this.f1174b = new n(jVar, zVar2, type2);
            this.f1175c = tVar;
        }

        @Override // b.d.a.z
        public Object a(b.d.a.e0.a aVar) throws IOException {
            int i;
            b.d.a.e0.b bVarT = aVar.T();
            if (bVarT == b.d.a.e0.b.NULL) {
                aVar.P();
                return null;
            }
            Map<K, V> mapA = this.f1175c.a();
            if (bVarT == b.d.a.e0.b.BEGIN_ARRAY) {
                aVar.y();
                while (aVar.G()) {
                    aVar.y();
                    K kA = this.f1173a.a(aVar);
                    if (mapA.put(kA, this.f1174b.a(aVar)) != null) {
                        throw new w("duplicate key: " + kA);
                    }
                    aVar.C();
                }
                aVar.C();
            } else {
                aVar.z();
                while (aVar.G()) {
                    if (((a.C0028a) b.d.a.c0.q.f1141a) == null) {
                        throw null;
                    }
                    if (aVar instanceof e) {
                        e eVar = (e) aVar;
                        eVar.a0(b.d.a.e0.b.NAME);
                        Map.Entry entry = (Map.Entry) ((Iterator) eVar.b0()).next();
                        eVar.d0(entry.getValue());
                        eVar.d0(new b.d.a.t((String) entry.getKey()));
                    } else {
                        int iB = aVar.i;
                        if (iB == 0) {
                            iB = aVar.B();
                        }
                        if (iB == 13) {
                            i = 9;
                        } else if (iB == 12) {
                            i = 8;
                        } else {
                            if (iB != 14) {
                                StringBuilder sbE = b.a.a.a.a.e("Expected a name but was ");
                                sbE.append(aVar.T());
                                sbE.append(aVar.I());
                                throw new IllegalStateException(sbE.toString());
                            }
                            i = 10;
                        }
                        aVar.i = i;
                    }
                    K kA2 = this.f1173a.a(aVar);
                    if (mapA.put(kA2, this.f1174b.a(aVar)) != null) {
                        throw new w("duplicate key: " + kA2);
                    }
                }
                aVar.D();
            }
            return mapA;
        }

        @Override // b.d.a.z
        public void b(b.d.a.e0.c cVar, Object obj) throws IOException {
            String strD;
            Map map = (Map) obj;
            if (map == null) {
                cVar.G();
                return;
            }
            if (g.this.f1172c) {
                ArrayList arrayList = new ArrayList(map.size());
                ArrayList arrayList2 = new ArrayList(map.size());
                int i = 0;
                boolean z = false;
                for (Map.Entry<K, V> entry : map.entrySet()) {
                    z<K> zVar = this.f1173a;
                    K key = entry.getKey();
                    if (zVar == null) {
                        throw null;
                    }
                    try {
                        f fVar = new f();
                        zVar.b(fVar, key);
                        if (!fVar.m.isEmpty()) {
                            throw new IllegalStateException("Expected one JSON element but was " + fVar.m);
                        }
                        b.d.a.o oVar = fVar.o;
                        arrayList.add(oVar);
                        arrayList2.add(entry.getValue());
                        if (oVar == null) {
                            throw null;
                        }
                        z |= (oVar instanceof b.d.a.l) || (oVar instanceof b.d.a.r);
                    } catch (IOException e2) {
                        throw new b.d.a.p(e2);
                    }
                }
                if (z) {
                    cVar.z();
                    int size = arrayList.size();
                    while (i < size) {
                        cVar.z();
                        o.X.b(cVar, (b.d.a.o) arrayList.get(i));
                        this.f1174b.b(cVar, arrayList2.get(i));
                        cVar.C();
                        i++;
                    }
                    cVar.C();
                    return;
                }
                cVar.A();
                int size2 = arrayList.size();
                while (i < size2) {
                    b.d.a.o oVar2 = (b.d.a.o) arrayList.get(i);
                    if (oVar2 == null) {
                        throw null;
                    }
                    if (oVar2 instanceof b.d.a.t) {
                        b.d.a.t tVarA = oVar2.a();
                        Object obj2 = tVarA.f1249a;
                        if (obj2 instanceof Number) {
                            strD = String.valueOf(tVarA.c());
                        } else if (obj2 instanceof Boolean) {
                            strD = Boolean.toString(tVarA.b());
                        } else {
                            if (!(obj2 instanceof String)) {
                                throw new AssertionError();
                            }
                            strD = tVarA.d();
                        }
                    } else {
                        if (!(oVar2 instanceof b.d.a.q)) {
                            throw new AssertionError();
                        }
                        strD = "null";
                    }
                    cVar.E(strD);
                    this.f1174b.b(cVar, arrayList2.get(i));
                    i++;
                }
            } else {
                cVar.A();
                for (Map.Entry<K, V> entry2 : map.entrySet()) {
                    cVar.E(String.valueOf(entry2.getKey()));
                    this.f1174b.b(cVar, entry2.getValue());
                }
            }
            cVar.D();
        }
    }

    public g(b.d.a.c0.g gVar, boolean z) {
        this.f1171b = gVar;
        this.f1172c = z;
    }

    @Override // b.d.a.a0
    public <T> z<T> a(b.d.a.j jVar, b.d.a.d0.a<T> aVar) {
        Type[] actualTypeArguments;
        Type type = aVar.f1224b;
        if (!Map.class.isAssignableFrom(aVar.f1223a)) {
            return null;
        }
        Class<?> clsE = b.d.a.c0.a.e(type);
        if (type == Properties.class) {
            actualTypeArguments = new Type[]{String.class, String.class};
        } else {
            Type typeF = b.d.a.c0.a.f(type, clsE, Map.class);
            actualTypeArguments = typeF instanceof ParameterizedType ? ((ParameterizedType) typeF).getActualTypeArguments() : new Type[]{Object.class, Object.class};
        }
        Type type2 = actualTypeArguments[0];
        return new a(jVar, actualTypeArguments[0], (type2 == Boolean.TYPE || type2 == Boolean.class) ? o.f : jVar.c(new b.d.a.d0.a<>(type2)), actualTypeArguments[1], jVar.c(new b.d.a.d0.a<>(actualTypeArguments[1])), this.f1171b.a(aVar));
    }
}
