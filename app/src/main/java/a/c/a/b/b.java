package a.c.a.b;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class b<K, V> implements Iterable<Map.Entry<K, V>> {

    /* renamed from: b, reason: collision with root package name */
    public c<K, V> f367b;

    /* renamed from: c, reason: collision with root package name */
    public c<K, V> f368c;

    /* renamed from: d, reason: collision with root package name */
    public WeakHashMap<f<K, V>, Boolean> f369d = new WeakHashMap<>();

    /* renamed from: e, reason: collision with root package name */
    public int f370e = 0;

    public static class a<K, V> extends e<K, V> {
        public a(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        @Override // a.c.a.b.b.e
        public c<K, V> b(c<K, V> cVar) {
            return cVar.f374e;
        }

        @Override // a.c.a.b.b.e
        public c<K, V> c(c<K, V> cVar) {
            return cVar.f373d;
        }
    }

    /* renamed from: a.c.a.b.b$b, reason: collision with other inner class name */
    public static class C0006b<K, V> extends e<K, V> {
        public C0006b(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        @Override // a.c.a.b.b.e
        public c<K, V> b(c<K, V> cVar) {
            return cVar.f373d;
        }

        @Override // a.c.a.b.b.e
        public c<K, V> c(c<K, V> cVar) {
            return cVar.f374e;
        }
    }

    public static class c<K, V> implements Map.Entry<K, V> {

        /* renamed from: b, reason: collision with root package name */
        public final K f371b;

        /* renamed from: c, reason: collision with root package name */
        public final V f372c;

        /* renamed from: d, reason: collision with root package name */
        public c<K, V> f373d;

        /* renamed from: e, reason: collision with root package name */
        public c<K, V> f374e;

        public c(K k, V v) {
            this.f371b = k;
            this.f372c = v;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f371b.equals(cVar.f371b) && this.f372c.equals(cVar.f372c);
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f371b;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f372c;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            return this.f371b.hashCode() ^ this.f372c.hashCode();
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            return this.f371b + "=" + this.f372c;
        }
    }

    public class d implements Iterator<Map.Entry<K, V>>, f<K, V> {

        /* renamed from: b, reason: collision with root package name */
        public c<K, V> f375b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f376c = true;

        public d() {
        }

        @Override // a.c.a.b.b.f
        public void a(c<K, V> cVar) {
            c<K, V> cVar2 = this.f375b;
            if (cVar == cVar2) {
                c<K, V> cVar3 = cVar2.f374e;
                this.f375b = cVar3;
                this.f376c = cVar3 == null;
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f376c) {
                return b.this.f367b != null;
            }
            c<K, V> cVar = this.f375b;
            return (cVar == null || cVar.f373d == null) ? false : true;
        }

        @Override // java.util.Iterator
        public Object next() {
            c<K, V> cVar;
            if (this.f376c) {
                this.f376c = false;
                cVar = b.this.f367b;
            } else {
                c<K, V> cVar2 = this.f375b;
                cVar = cVar2 != null ? cVar2.f373d : null;
            }
            this.f375b = cVar;
            return cVar;
        }
    }

    public static abstract class e<K, V> implements Iterator<Map.Entry<K, V>>, f<K, V> {

        /* renamed from: b, reason: collision with root package name */
        public c<K, V> f378b;

        /* renamed from: c, reason: collision with root package name */
        public c<K, V> f379c;

        public e(c<K, V> cVar, c<K, V> cVar2) {
            this.f378b = cVar2;
            this.f379c = cVar;
        }

        @Override // a.c.a.b.b.f
        public void a(c<K, V> cVar) {
            c<K, V> cVarC = null;
            if (this.f378b == cVar && cVar == this.f379c) {
                this.f379c = null;
                this.f378b = null;
            }
            c<K, V> cVar2 = this.f378b;
            if (cVar2 == cVar) {
                this.f378b = b(cVar2);
            }
            c<K, V> cVar3 = this.f379c;
            if (cVar3 == cVar) {
                c<K, V> cVar4 = this.f378b;
                if (cVar3 != cVar4 && cVar4 != null) {
                    cVarC = c(cVar3);
                }
                this.f379c = cVarC;
            }
        }

        public abstract c<K, V> b(c<K, V> cVar);

        public abstract c<K, V> c(c<K, V> cVar);

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f379c != null;
        }

        @Override // java.util.Iterator
        public Object next() {
            c<K, V> cVar = this.f379c;
            c<K, V> cVar2 = this.f378b;
            this.f379c = (cVar == cVar2 || cVar2 == null) ? null : c(cVar);
            return cVar;
        }
    }

    public interface f<K, V> {
        void a(c<K, V> cVar);
    }

    public c<K, V> a(K k) {
        c<K, V> cVar = this.f367b;
        while (cVar != null && !cVar.f371b.equals(k)) {
            cVar = cVar.f373d;
        }
        return cVar;
    }

    public b<K, V>.d b() {
        b<K, V>.d dVar = new d();
        this.f369d.put(dVar, Boolean.FALSE);
        return dVar;
    }

    public c<K, V> c(K k, V v) {
        c<K, V> cVar = new c<>(k, v);
        this.f370e++;
        c<K, V> cVar2 = this.f368c;
        if (cVar2 == null) {
            this.f367b = cVar;
        } else {
            cVar2.f373d = cVar;
            cVar.f374e = cVar2;
        }
        this.f368c = cVar;
        return cVar;
    }

    public V d(K k) {
        c<K, V> cVarA = a(k);
        if (cVarA == null) {
            return null;
        }
        this.f370e--;
        if (!this.f369d.isEmpty()) {
            Iterator<f<K, V>> it = this.f369d.keySet().iterator();
            while (it.hasNext()) {
                it.next().a(cVarA);
            }
        }
        c<K, V> cVar = cVarA.f374e;
        if (cVar != null) {
            cVar.f373d = cVarA.f373d;
        } else {
            this.f367b = cVarA.f373d;
        }
        c<K, V> cVar2 = cVarA.f373d;
        if (cVar2 != null) {
            cVar2.f374e = cVarA.f374e;
        } else {
            this.f368c = cVarA.f374e;
        }
        cVarA.f373d = null;
        cVarA.f374e = null;
        return cVarA.f372c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0048, code lost:
    
        if (r3.hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0050, code lost:
    
        if (((a.c.a.b.b.e) r7).hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0054, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:?, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 1
            if (r7 != r6) goto L4
            return r0
        L4:
            boolean r1 = r7 instanceof a.c.a.b.b
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            a.c.a.b.b r7 = (a.c.a.b.b) r7
            int r1 = r6.f370e
            int r3 = r7.f370e
            if (r1 == r3) goto L13
            return r2
        L13:
            java.util.Iterator r1 = r6.iterator()
            java.util.Iterator r7 = r7.iterator()
        L1b:
            r3 = r1
            a.c.a.b.b$e r3 = (a.c.a.b.b.e) r3
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L44
            r4 = r7
            a.c.a.b.b$e r4 = (a.c.a.b.b.e) r4
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L44
            java.lang.Object r3 = r3.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r4.next()
            if (r3 != 0) goto L3b
            if (r4 != 0) goto L43
        L3b:
            if (r3 == 0) goto L1b
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L1b
        L43:
            return r2
        L44:
            boolean r1 = r3.hasNext()
            if (r1 != 0) goto L53
            a.c.a.b.b$e r7 = (a.c.a.b.b.e) r7
            boolean r7 = r7.hasNext()
            if (r7 != 0) goto L53
            goto L54
        L53:
            r0 = r2
        L54:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a.c.a.b.b.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        Iterator<Map.Entry<K, V>> it = iterator();
        int iHashCode = 0;
        while (true) {
            e eVar = (e) it;
            if (!eVar.hasNext()) {
                return iHashCode;
            }
            iHashCode += ((Map.Entry) eVar.next()).hashCode();
        }
    }

    @Override // java.lang.Iterable
    public Iterator<Map.Entry<K, V>> iterator() {
        a aVar = new a(this.f367b, this.f368c);
        this.f369d.put(aVar, Boolean.FALSE);
        return aVar;
    }

    public String toString() {
        StringBuilder sbE = b.a.a.a.a.e("[");
        Iterator<Map.Entry<K, V>> it = iterator();
        while (true) {
            e eVar = (e) it;
            if (!eVar.hasNext()) {
                sbE.append("]");
                return sbE.toString();
            }
            sbE.append(((Map.Entry) eVar.next()).toString());
            if (eVar.hasNext()) {
                sbE.append(", ");
            }
        }
    }
}
