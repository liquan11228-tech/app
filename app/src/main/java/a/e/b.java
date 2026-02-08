package a.e;

import java.util.Map;

/* loaded from: classes.dex */
public class b<E> extends g<E, E> {

    /* renamed from: d */
    public final /* synthetic */ c f387d;

    public b(c cVar) {
        this.f387d = cVar;
    }

    @Override // a.e.g
    public void a() {
        this.f387d.clear();
    }

    @Override // a.e.g
    public Object b(int i, int i2) {
        return this.f387d.f389c[i];
    }

    @Override // a.e.g
    public Map<E, E> c() {
        throw new UnsupportedOperationException("not a map");
    }

    @Override // a.e.g
    public int d() {
        return this.f387d.f390d;
    }

    @Override // a.e.g
    public int e(Object obj) {
        return this.f387d.indexOf(obj);
    }

    @Override // a.e.g
    public int f(Object obj) {
        return this.f387d.indexOf(obj);
    }

    @Override // a.e.g
    public void g(E e2, E e3) {
        this.f387d.add(e2);
    }

    @Override // a.e.g
    public void h(int i) {
        this.f387d.e(i);
    }

    @Override // a.e.g
    public E i(int i, E e2) {
        throw new UnsupportedOperationException("not a map");
    }
}
