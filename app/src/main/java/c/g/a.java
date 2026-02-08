package c.g;

import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class a<E> implements Collection<E>, c.j.b.l.a {

    /* renamed from: c.g.a$a, reason: collision with other inner class name */
    public static final class C0029a extends c.j.b.e implements c.j.a.b<E, CharSequence> {
        public C0029a() {
            super(1);
        }

        @Override // c.j.a.b
        public CharSequence b(Object obj) {
            return obj == a.this ? "(this Collection)" : String.valueOf(obj);
        }
    }

    public abstract int a();

    @Override // java.util.Collection
    public boolean add(E e2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean contains(Object obj) {
        if (isEmpty()) {
            return false;
        }
        Iterator<E> it = iterator();
        while (it.hasNext()) {
            if (c.j.b.d.a(it.next(), obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection<? extends Object> collection) {
        c.j.b.d.d(collection, "elements");
        if (collection.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return a() == 0;
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ int size() {
        return a();
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return c.j.b.b.a(this);
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        c.j.b.d.d(tArr, "array");
        return (T[]) c.j.b.b.b(this, tArr);
    }

    public String toString() throws IOException {
        C0029a c0029a = new C0029a();
        c.j.b.d.d(this, "$this$joinToString");
        c.j.b.d.d(", ", "separator");
        c.j.b.d.d("[", "prefix");
        c.j.b.d.d("]", "postfix");
        c.j.b.d.d("...", "truncated");
        StringBuilder sb = new StringBuilder();
        e.f(this, sb, ", ", "[", "]", -1, "...", c0029a);
        String string = sb.toString();
        c.j.b.d.c(string, "joinTo(StringBuilder(), …ed, transform).toString()");
        return string;
    }
}
