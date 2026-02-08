package b.d.a.c0;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* loaded from: classes.dex */
public final class s<K, V> extends AbstractMap<K, V> implements Serializable {
    public static final Comparator<Comparable> i = new a();

    /* renamed from: b, reason: collision with root package name */
    public Comparator<? super K> f1143b;

    /* renamed from: c, reason: collision with root package name */
    public e<K, V> f1144c;

    /* renamed from: d, reason: collision with root package name */
    public int f1145d;

    /* renamed from: e, reason: collision with root package name */
    public int f1146e;
    public final e<K, V> f;
    public s<K, V>.b g;
    public s<K, V>.c h;

    public class a implements Comparator<Comparable> {
        @Override // java.util.Comparator
        public int compare(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    }

    public class b extends AbstractSet<Map.Entry<K, V>> {

        public class a extends s<K, V>.d<Map.Entry<K, V>> {
            public a(b bVar) {
                super();
            }

            @Override // java.util.Iterator
            public Object next() {
                return a();
            }
        }

        public b() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            s.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return (obj instanceof Map.Entry) && s.this.b((Map.Entry) obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new a(this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            e<K, V> eVarB;
            if (!(obj instanceof Map.Entry) || (eVarB = s.this.b((Map.Entry) obj)) == null) {
                return false;
            }
            s.this.e(eVarB, true);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return s.this.f1145d;
        }
    }

    public final class c extends AbstractSet<K> {

        public class a extends s<K, V>.d<K> {
            public a(c cVar) {
                super();
            }

            @Override // java.util.Iterator
            public K next() {
                return a().g;
            }
        }

        public c() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            s.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return s.this.c(obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return new a(this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            s sVar = s.this;
            e<K, V> eVarC = sVar.c(obj);
            if (eVarC != null) {
                sVar.e(eVarC, true);
            }
            return eVarC != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return s.this.f1145d;
        }
    }

    public abstract class d<T> implements Iterator<T> {

        /* renamed from: b, reason: collision with root package name */
        public e<K, V> f1149b;

        /* renamed from: c, reason: collision with root package name */
        public e<K, V> f1150c;

        /* renamed from: d, reason: collision with root package name */
        public int f1151d;

        public d() {
            s sVar = s.this;
            this.f1149b = sVar.f.f1156e;
            this.f1150c = null;
            this.f1151d = sVar.f1146e;
        }

        public final e<K, V> a() {
            e<K, V> eVar = this.f1149b;
            s sVar = s.this;
            if (eVar == sVar.f) {
                throw new NoSuchElementException();
            }
            if (sVar.f1146e != this.f1151d) {
                throw new ConcurrentModificationException();
            }
            this.f1149b = eVar.f1156e;
            this.f1150c = eVar;
            return eVar;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f1149b != s.this.f;
        }

        @Override // java.util.Iterator
        public final void remove() {
            e<K, V> eVar = this.f1150c;
            if (eVar == null) {
                throw new IllegalStateException();
            }
            s.this.e(eVar, true);
            this.f1150c = null;
            this.f1151d = s.this.f1146e;
        }
    }

    public static final class e<K, V> implements Map.Entry<K, V> {

        /* renamed from: b, reason: collision with root package name */
        public e<K, V> f1153b;

        /* renamed from: c, reason: collision with root package name */
        public e<K, V> f1154c;

        /* renamed from: d, reason: collision with root package name */
        public e<K, V> f1155d;

        /* renamed from: e, reason: collision with root package name */
        public e<K, V> f1156e;
        public e<K, V> f;
        public final K g;
        public V h;
        public int i;

        public e() {
            this.g = null;
            this.f = this;
            this.f1156e = this;
        }

        public e(e<K, V> eVar, K k, e<K, V> eVar2, e<K, V> eVar3) {
            this.f1153b = eVar;
            this.g = k;
            this.i = 1;
            this.f1156e = eVar2;
            this.f = eVar3;
            eVar3.f1156e = this;
            eVar2.f = this;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            K k = this.g;
            if (k == null) {
                if (entry.getKey() != null) {
                    return false;
                }
            } else if (!k.equals(entry.getKey())) {
                return false;
            }
            V v = this.h;
            Object value = entry.getValue();
            if (v == null) {
                if (value != null) {
                    return false;
                }
            } else if (!v.equals(value)) {
                return false;
            }
            return true;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.g;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.h;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K k = this.g;
            int iHashCode = k == null ? 0 : k.hashCode();
            V v = this.h;
            return iHashCode ^ (v != null ? v.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            V v2 = this.h;
            this.h = v;
            return v2;
        }

        public String toString() {
            return this.g + "=" + this.h;
        }
    }

    public s() {
        Comparator<Comparable> comparator = i;
        this.f1145d = 0;
        this.f1146e = 0;
        this.f = new e<>();
        this.f1143b = comparator;
    }

    public e<K, V> a(K k, boolean z) {
        int iCompareTo;
        e<K, V> eVar;
        Comparator<? super K> comparator = this.f1143b;
        e<K, V> eVar2 = this.f1144c;
        if (eVar2 != null) {
            Comparable comparable = comparator == i ? (Comparable) k : null;
            while (true) {
                K k2 = eVar2.g;
                iCompareTo = comparable != null ? comparable.compareTo(k2) : comparator.compare(k, k2);
                if (iCompareTo == 0) {
                    return eVar2;
                }
                e<K, V> eVar3 = iCompareTo < 0 ? eVar2.f1154c : eVar2.f1155d;
                if (eVar3 == null) {
                    break;
                }
                eVar2 = eVar3;
            }
        } else {
            iCompareTo = 0;
        }
        if (!z) {
            return null;
        }
        e<K, V> eVar4 = this.f;
        if (eVar2 != null) {
            eVar = new e<>(eVar2, k, eVar4, eVar4.f);
            if (iCompareTo < 0) {
                eVar2.f1154c = eVar;
            } else {
                eVar2.f1155d = eVar;
            }
            d(eVar2, true);
        } else {
            if (comparator == i && !(k instanceof Comparable)) {
                throw new ClassCastException(k.getClass().getName() + " is not Comparable");
            }
            eVar = new e<>(eVar2, k, eVar4, eVar4.f);
            this.f1144c = eVar;
        }
        this.f1145d++;
        this.f1146e++;
        return eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public b.d.a.c0.s.e<K, V> b(java.util.Map.Entry<?, ?> r5) {
        /*
            r4 = this;
            java.lang.Object r0 = r5.getKey()
            b.d.a.c0.s$e r0 = r4.c(r0)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L23
            V r3 = r0.h
            java.lang.Object r5 = r5.getValue()
            if (r3 == r5) goto L1f
            if (r3 == 0) goto L1d
            boolean r5 = r3.equals(r5)
            if (r5 == 0) goto L1d
            goto L1f
        L1d:
            r5 = r2
            goto L20
        L1f:
            r5 = r1
        L20:
            if (r5 == 0) goto L23
            goto L24
        L23:
            r1 = r2
        L24:
            if (r1 == 0) goto L27
            goto L28
        L27:
            r0 = 0
        L28:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b.d.a.c0.s.b(java.util.Map$Entry):b.d.a.c0.s$e");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e<K, V> c(Object obj) {
        if (obj == 0) {
            return null;
        }
        try {
            return a(obj, false);
        } catch (ClassCastException unused) {
            return null;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        this.f1144c = null;
        this.f1145d = 0;
        this.f1146e++;
        e<K, V> eVar = this.f;
        eVar.f = eVar;
        eVar.f1156e = eVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return c(obj) != null;
    }

    public final void d(e<K, V> eVar, boolean z) {
        while (eVar != null) {
            e<K, V> eVar2 = eVar.f1154c;
            e<K, V> eVar3 = eVar.f1155d;
            int i2 = eVar2 != null ? eVar2.i : 0;
            int i3 = eVar3 != null ? eVar3.i : 0;
            int i4 = i2 - i3;
            if (i4 == -2) {
                e<K, V> eVar4 = eVar3.f1154c;
                e<K, V> eVar5 = eVar3.f1155d;
                int i5 = (eVar4 != null ? eVar4.i : 0) - (eVar5 != null ? eVar5.i : 0);
                if (i5 != -1 && (i5 != 0 || z)) {
                    h(eVar3);
                }
                g(eVar);
                if (z) {
                    return;
                }
            } else if (i4 == 2) {
                e<K, V> eVar6 = eVar2.f1154c;
                e<K, V> eVar7 = eVar2.f1155d;
                int i6 = (eVar6 != null ? eVar6.i : 0) - (eVar7 != null ? eVar7.i : 0);
                if (i6 != 1 && (i6 != 0 || z)) {
                    g(eVar2);
                }
                h(eVar);
                if (z) {
                    return;
                }
            } else if (i4 == 0) {
                eVar.i = i2 + 1;
                if (z) {
                    return;
                }
            } else {
                eVar.i = Math.max(i2, i3) + 1;
                if (!z) {
                    return;
                }
            }
            eVar = eVar.f1153b;
        }
    }

    public void e(e<K, V> eVar, boolean z) {
        e<K, V> eVar2;
        e<K, V> eVar3;
        int i2;
        if (z) {
            e<K, V> eVar4 = eVar.f;
            eVar4.f1156e = eVar.f1156e;
            eVar.f1156e.f = eVar4;
        }
        e<K, V> eVar5 = eVar.f1154c;
        e<K, V> eVar6 = eVar.f1155d;
        e<K, V> eVar7 = eVar.f1153b;
        int i3 = 0;
        if (eVar5 == null || eVar6 == null) {
            if (eVar5 != null) {
                f(eVar, eVar5);
                eVar.f1154c = null;
            } else if (eVar6 != null) {
                f(eVar, eVar6);
                eVar.f1155d = null;
            } else {
                f(eVar, null);
            }
            d(eVar7, false);
            this.f1145d--;
            this.f1146e++;
            return;
        }
        if (eVar5.i > eVar6.i) {
            do {
                eVar3 = eVar5;
                eVar5 = eVar5.f1155d;
            } while (eVar5 != null);
        } else {
            do {
                eVar2 = eVar6;
                eVar6 = eVar6.f1154c;
            } while (eVar6 != null);
            eVar3 = eVar2;
        }
        e(eVar3, false);
        e<K, V> eVar8 = eVar.f1154c;
        if (eVar8 != null) {
            i2 = eVar8.i;
            eVar3.f1154c = eVar8;
            eVar8.f1153b = eVar3;
            eVar.f1154c = null;
        } else {
            i2 = 0;
        }
        e<K, V> eVar9 = eVar.f1155d;
        if (eVar9 != null) {
            i3 = eVar9.i;
            eVar3.f1155d = eVar9;
            eVar9.f1153b = eVar3;
            eVar.f1155d = null;
        }
        eVar3.i = Math.max(i2, i3) + 1;
        f(eVar, eVar3);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        s<K, V>.b bVar = this.g;
        if (bVar != null) {
            return bVar;
        }
        s<K, V>.b bVar2 = new b();
        this.g = bVar2;
        return bVar2;
    }

    public final void f(e<K, V> eVar, e<K, V> eVar2) {
        e<K, V> eVar3 = eVar.f1153b;
        eVar.f1153b = null;
        if (eVar2 != null) {
            eVar2.f1153b = eVar3;
        }
        if (eVar3 == null) {
            this.f1144c = eVar2;
        } else if (eVar3.f1154c == eVar) {
            eVar3.f1154c = eVar2;
        } else {
            eVar3.f1155d = eVar2;
        }
    }

    public final void g(e<K, V> eVar) {
        e<K, V> eVar2 = eVar.f1154c;
        e<K, V> eVar3 = eVar.f1155d;
        e<K, V> eVar4 = eVar3.f1154c;
        e<K, V> eVar5 = eVar3.f1155d;
        eVar.f1155d = eVar4;
        if (eVar4 != null) {
            eVar4.f1153b = eVar;
        }
        f(eVar, eVar3);
        eVar3.f1154c = eVar;
        eVar.f1153b = eVar3;
        int iMax = Math.max(eVar2 != null ? eVar2.i : 0, eVar4 != null ? eVar4.i : 0) + 1;
        eVar.i = iMax;
        eVar3.i = Math.max(iMax, eVar5 != null ? eVar5.i : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        e<K, V> eVarC = c(obj);
        if (eVarC != null) {
            return eVarC.h;
        }
        return null;
    }

    public final void h(e<K, V> eVar) {
        e<K, V> eVar2 = eVar.f1154c;
        e<K, V> eVar3 = eVar.f1155d;
        e<K, V> eVar4 = eVar2.f1154c;
        e<K, V> eVar5 = eVar2.f1155d;
        eVar.f1154c = eVar5;
        if (eVar5 != null) {
            eVar5.f1153b = eVar;
        }
        f(eVar, eVar2);
        eVar2.f1155d = eVar;
        eVar.f1153b = eVar2;
        int iMax = Math.max(eVar3 != null ? eVar3.i : 0, eVar5 != null ? eVar5.i : 0) + 1;
        eVar.i = iMax;
        eVar2.i = Math.max(iMax, eVar4 != null ? eVar4.i : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        s<K, V>.c cVar = this.h;
        if (cVar != null) {
            return cVar;
        }
        s<K, V>.c cVar2 = new c();
        this.h = cVar2;
        return cVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k, V v) {
        if (k == null) {
            throw new NullPointerException("key == null");
        }
        e<K, V> eVarA = a(k, true);
        V v2 = eVarA.h;
        eVarA.h = v;
        return v2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        e<K, V> eVarC = c(obj);
        if (eVarC != null) {
            e(eVarC, true);
        }
        if (eVarC != null) {
            return eVarC.h;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f1145d;
    }
}
