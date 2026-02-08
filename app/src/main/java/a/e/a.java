package a.e;

import a.e.g.b;
import a.e.g.c;
import a.e.g.e;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class a<K, V> extends h<K, V> implements Map<K, V> {
    public g<K, V> i;

    /* renamed from: a.e.a$a, reason: collision with other inner class name */
    public class C0007a extends g<K, V> {
        public C0007a() {
        }

        @Override // a.e.g
        public void a() {
            a.this.clear();
        }

        @Override // a.e.g
        public Object b(int i, int i2) {
            return a.this.f420c[(i << 1) + i2];
        }

        @Override // a.e.g
        public Map<K, V> c() {
            return a.this;
        }

        @Override // a.e.g
        public int d() {
            return a.this.f421d;
        }

        @Override // a.e.g
        public int e(Object obj) {
            return a.this.d(obj);
        }

        @Override // a.e.g
        public int f(Object obj) {
            return a.this.f(obj);
        }

        @Override // a.e.g
        public void g(K k, V v) {
            a.this.put(k, v);
        }

        @Override // a.e.g
        public void h(int i) {
            a.this.h(i);
        }

        @Override // a.e.g
        public V i(int i, V v) {
            int i2 = (i << 1) + 1;
            Object[] objArr = a.this.f420c;
            V v2 = (V) objArr[i2];
            objArr[i2] = v;
            return v2;
        }
    }

    @Override // java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        g<K, V> gVarK = k();
        if (gVarK.f404a == null) {
            gVarK.f404a = gVarK.new b();
        }
        return gVarK.f404a;
    }

    public final g<K, V> k() {
        if (this.i == null) {
            this.i = new C0007a();
        }
        return this.i;
    }

    @Override // java.util.Map
    public Set<K> keySet() {
        g<K, V> gVarK = k();
        if (gVarK.f405b == null) {
            gVarK.f405b = gVarK.new c();
        }
        return gVarK.f405b;
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        int size = map.size() + this.f421d;
        int i = this.f421d;
        int[] iArr = this.f419b;
        if (iArr.length < size) {
            Object[] objArr = this.f420c;
            a(size);
            if (this.f421d > 0) {
                System.arraycopy(iArr, 0, this.f419b, 0, i);
                System.arraycopy(objArr, 0, this.f420c, 0, i << 1);
            }
            h.b(iArr, objArr, i);
        }
        if (this.f421d != i) {
            throw new ConcurrentModificationException();
        }
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public Collection<V> values() {
        g<K, V> gVarK = k();
        if (gVarK.f406c == null) {
            gVarK.f406c = gVarK.new e();
        }
        return gVarK.f406c;
    }
}
