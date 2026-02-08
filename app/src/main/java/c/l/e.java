package c.l;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class e<T, R> implements c<R> {

    /* renamed from: a, reason: collision with root package name */
    public final c<T> f1299a;

    /* renamed from: b, reason: collision with root package name */
    public final c.j.a.b<T, R> f1300b;

    public static final class a implements Iterator<R>, c.j.b.l.a {

        /* renamed from: b, reason: collision with root package name */
        public final Iterator<T> f1301b;

        public a() {
            this.f1301b = e.this.f1299a.iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f1301b.hasNext();
        }

        @Override // java.util.Iterator
        public R next() {
            return (R) e.this.f1300b.b(this.f1301b.next());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e(c<? extends T> cVar, c.j.a.b<? super T, ? extends R> bVar) {
        c.j.b.d.d(cVar, "sequence");
        c.j.b.d.d(bVar, "transformer");
        this.f1299a = cVar;
        this.f1300b = bVar;
    }

    @Override // c.l.c
    public Iterator<R> iterator() {
        return new a();
    }
}
