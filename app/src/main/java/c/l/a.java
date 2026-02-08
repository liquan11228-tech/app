package c.l;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class a<T> implements c<T>, b<T> {

    /* renamed from: a, reason: collision with root package name */
    public final c<T> f1294a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1295b;

    /* renamed from: c.l.a$a, reason: collision with other inner class name */
    public static final class C0032a implements Iterator<T>, c.j.b.l.a {

        /* renamed from: b, reason: collision with root package name */
        public final Iterator<T> f1296b;

        /* renamed from: c, reason: collision with root package name */
        public int f1297c;

        public C0032a(a aVar) {
            this.f1296b = aVar.f1294a.iterator();
            this.f1297c = aVar.f1295b;
        }

        public final void a() {
            while (this.f1297c > 0 && this.f1296b.hasNext()) {
                this.f1296b.next();
                this.f1297c--;
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            a();
            return this.f1296b.hasNext();
        }

        @Override // java.util.Iterator
        public T next() {
            a();
            return this.f1296b.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(c<? extends T> cVar, int i) {
        c.j.b.d.d(cVar, "sequence");
        this.f1294a = cVar;
        this.f1295b = i;
        if (i >= 0) {
            return;
        }
        StringBuilder sbE = b.a.a.a.a.e("count must be non-negative, but was ");
        sbE.append(this.f1295b);
        sbE.append('.');
        throw new IllegalArgumentException(sbE.toString().toString());
    }

    @Override // c.l.b
    public c<T> a(int i) {
        int i2 = this.f1295b + i;
        return i2 < 0 ? new a(this, i) : new a(this.f1294a, i2);
    }

    @Override // c.l.c
    public Iterator<T> iterator() {
        return new C0032a(this);
    }
}
