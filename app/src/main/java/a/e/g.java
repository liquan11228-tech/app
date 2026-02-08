package a.e;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class g<K, V> {

    /* renamed from: a, reason: collision with root package name */
    public g<K, V>.b f404a;

    /* renamed from: b, reason: collision with root package name */
    public g<K, V>.c f405b;

    /* renamed from: c, reason: collision with root package name */
    public g<K, V>.e f406c;

    public final class a<T> implements Iterator<T> {

        /* renamed from: b, reason: collision with root package name */
        public final int f407b;

        /* renamed from: c, reason: collision with root package name */
        public int f408c;

        /* renamed from: d, reason: collision with root package name */
        public int f409d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f410e = false;

        public a(int i) {
            this.f407b = i;
            this.f408c = g.this.d();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f409d < this.f408c;
        }

        @Override // java.util.Iterator
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            T t = (T) g.this.b(this.f409d, this.f407b);
            this.f409d++;
            this.f410e = true;
            return t;
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f410e) {
                throw new IllegalStateException();
            }
            int i = this.f409d - 1;
            this.f409d = i;
            this.f408c--;
            this.f410e = false;
            g.this.h(i);
        }
    }

    public final class b implements Set<Map.Entry<K, V>> {
        public b() {
        }

        @Override // java.util.Set, java.util.Collection
        public boolean add(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(Collection<? extends Map.Entry<K, V>> collection) {
            int iD = g.this.d();
            for (Map.Entry<K, V> entry : collection) {
                g.this.g(entry.getKey(), entry.getValue());
            }
            return iD != g.this.d();
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            g.this.a();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            int iE = g.this.e(entry.getKey());
            if (iE < 0) {
                return false;
            }
            return a.e.d.c(g.this.b(iE, 1), entry.getValue());
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean equals(Object obj) {
            return g.j(this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public int hashCode() {
            int iHashCode = 0;
            for (int iD = g.this.d() - 1; iD >= 0; iD--) {
                Object objB = g.this.b(iD, 0);
                Object objB2 = g.this.b(iD, 1);
                iHashCode += (objB == null ? 0 : objB.hashCode()) ^ (objB2 == null ? 0 : objB2.hashCode());
            }
            return iHashCode;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            return g.this.d() == 0;
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public Iterator<Map.Entry<K, V>> iterator() {
            return new d();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
            return g.this.d();
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            throw new UnsupportedOperationException();
        }
    }

    public final class c implements Set<K> {
        public c() {
        }

        @Override // java.util.Set, java.util.Collection
        public boolean add(K k) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            g.this.a();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object obj) {
            return g.this.e(obj) >= 0;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            Map<K, V> mapC = g.this.c();
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!mapC.containsKey(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean equals(Object obj) {
            return g.j(this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public int hashCode() {
            int iHashCode = 0;
            for (int iD = g.this.d() - 1; iD >= 0; iD--) {
                Object objB = g.this.b(iD, 0);
                iHashCode += objB == null ? 0 : objB.hashCode();
            }
            return iHashCode;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            return g.this.d() == 0;
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public Iterator<K> iterator() {
            return new a(0);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(Object obj) {
            int iE = g.this.e(obj);
            if (iE < 0) {
                return false;
            }
            g.this.h(iE);
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            Map<K, V> mapC = g.this.c();
            int size = mapC.size();
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                mapC.remove(it.next());
            }
            return size != mapC.size();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            return g.k(g.this.c(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
            return g.this.d();
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray() {
            return g.this.l(0);
        }

        @Override // java.util.Set, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) g.this.m(tArr, 0);
        }
    }

    public final class d implements Iterator<Map.Entry<K, V>>, Map.Entry<K, V> {

        /* renamed from: b, reason: collision with root package name */
        public int f413b;

        /* renamed from: d, reason: collision with root package name */
        public boolean f415d = false;

        /* renamed from: c, reason: collision with root package name */
        public int f414c = -1;

        public d() {
            this.f413b = g.this.d() - 1;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (!this.f415d) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return a.e.d.c(entry.getKey(), g.this.b(this.f414c, 0)) && a.e.d.c(entry.getValue(), g.this.b(this.f414c, 1));
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            if (this.f415d) {
                return (K) g.this.b(this.f414c, 0);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            if (this.f415d) {
                return (V) g.this.b(this.f414c, 1);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f414c < this.f413b;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            if (!this.f415d) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            Object objB = g.this.b(this.f414c, 0);
            Object objB2 = g.this.b(this.f414c, 1);
            return (objB == null ? 0 : objB.hashCode()) ^ (objB2 != null ? objB2.hashCode() : 0);
        }

        @Override // java.util.Iterator
        public Object next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            this.f414c++;
            this.f415d = true;
            return this;
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f415d) {
                throw new IllegalStateException();
            }
            g.this.h(this.f414c);
            this.f414c--;
            this.f413b--;
            this.f415d = false;
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            if (this.f415d) {
                return (V) g.this.i(this.f414c, v);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public String toString() {
            return getKey() + "=" + getValue();
        }
    }

    public final class e implements Collection<V> {
        public e() {
        }

        @Override // java.util.Collection
        public boolean add(V v) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public boolean addAll(Collection<? extends V> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public void clear() {
            g.this.a();
        }

        @Override // java.util.Collection
        public boolean contains(Object obj) {
            return g.this.f(obj) >= 0;
        }

        @Override // java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Collection
        public boolean isEmpty() {
            return g.this.d() == 0;
        }

        @Override // java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return new a(1);
        }

        @Override // java.util.Collection
        public boolean remove(Object obj) {
            int iF = g.this.f(obj);
            if (iF < 0) {
                return false;
            }
            g.this.h(iF);
            return true;
        }

        @Override // java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            int iD = g.this.d();
            int i = 0;
            boolean z = false;
            while (i < iD) {
                if (collection.contains(g.this.b(i, 1))) {
                    g.this.h(i);
                    i--;
                    iD--;
                    z = true;
                }
                i++;
            }
            return z;
        }

        @Override // java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            int iD = g.this.d();
            int i = 0;
            boolean z = false;
            while (i < iD) {
                if (!collection.contains(g.this.b(i, 1))) {
                    g.this.h(i);
                    i--;
                    iD--;
                    z = true;
                }
                i++;
            }
            return z;
        }

        @Override // java.util.Collection
        public int size() {
            return g.this.d();
        }

        @Override // java.util.Collection
        public Object[] toArray() {
            return g.this.l(1);
        }

        @Override // java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) g.this.m(tArr, 1);
        }
    }

    public static <T> boolean j(Set<T> set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
                return false;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public static <K, V> boolean k(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator<K> it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        return size != map.size();
    }

    public abstract void a();

    public abstract Object b(int i, int i2);

    public abstract Map<K, V> c();

    public abstract int d();

    public abstract int e(Object obj);

    public abstract int f(Object obj);

    public abstract void g(K k, V v);

    public abstract void h(int i);

    public abstract V i(int i, V v);

    public Object[] l(int i) {
        int iD = d();
        Object[] objArr = new Object[iD];
        for (int i2 = 0; i2 < iD; i2++) {
            objArr[i2] = b(i2, i);
        }
        return objArr;
    }

    public <T> T[] m(T[] tArr, int i) {
        int iD = d();
        if (tArr.length < iD) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), iD));
        }
        for (int i2 = 0; i2 < iD; i2++) {
            tArr[i2] = b(i2, i);
        }
        if (tArr.length > iD) {
            tArr[iD] = null;
        }
        return tArr;
    }
}
