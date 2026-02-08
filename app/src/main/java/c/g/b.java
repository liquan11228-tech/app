package c.g;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public abstract class b<E> extends c.g.a<E> implements List<E>, c.j.b.l.a {

    public class a implements Iterator<E>, c.j.b.l.a {

        /* renamed from: b, reason: collision with root package name */
        public int f1262b;

        public a() {
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f1262b < b.this.a();
        }

        @Override // java.util.Iterator
        public E next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            b bVar = b.this;
            int i = this.f1262b;
            this.f1262b = i + 1;
            return (E) bVar.get(i);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* renamed from: c.g.b$b, reason: collision with other inner class name */
    public class C0030b extends b<E>.a implements ListIterator<E>, c.j.b.l.a {
        public C0030b(int i) {
            super();
            int iA = b.this.a();
            if (i >= 0 && i <= iA) {
                this.f1262b = i;
                return;
            }
            throw new IndexOutOfBoundsException("index: " + i + ", size: " + iA);
        }

        @Override // java.util.ListIterator
        public void add(E e2) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f1262b > 0;
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f1262b;
        }

        @Override // java.util.ListIterator
        public E previous() {
            if (!hasPrevious()) {
                throw new NoSuchElementException();
            }
            b bVar = b.this;
            int i = this.f1262b - 1;
            this.f1262b = i;
            return (E) bVar.get(i);
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f1262b - 1;
        }

        @Override // java.util.ListIterator
        public void set(E e2) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public static final class c<E> extends b<E> implements RandomAccess {

        /* renamed from: b, reason: collision with root package name */
        public int f1265b;

        /* renamed from: c, reason: collision with root package name */
        public final b<E> f1266c;

        /* renamed from: d, reason: collision with root package name */
        public final int f1267d;

        /* JADX WARN: Multi-variable type inference failed */
        public c(b<? extends E> bVar, int i, int i2) {
            c.j.b.d.d(bVar, "list");
            this.f1266c = bVar;
            this.f1267d = i;
            int iA = bVar.a();
            if (i < 0 || i2 > iA) {
                throw new IndexOutOfBoundsException("fromIndex: " + i + ", toIndex: " + i2 + ", size: " + iA);
            }
            if (i <= i2) {
                this.f1265b = i2 - this.f1267d;
                return;
            }
            throw new IllegalArgumentException("fromIndex: " + i + " > toIndex: " + i2);
        }

        @Override // c.g.a
        public int a() {
            return this.f1265b;
        }

        @Override // c.g.b, java.util.List
        public E get(int i) {
            int i2 = this.f1265b;
            if (i >= 0 && i < i2) {
                return this.f1266c.get(this.f1267d + i);
            }
            throw new IndexOutOfBoundsException("index: " + i + ", size: " + i2);
        }
    }

    @Override // java.util.List
    public void add(int i, E e2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i, Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        Collection collection = (Collection) obj;
        c.j.b.d.d(this, "c");
        c.j.b.d.d(collection, "other");
        if (size() == collection.size()) {
            Iterator<E> it = collection.iterator();
            Iterator<E> it2 = iterator();
            while (it2.hasNext()) {
                if (!c.j.b.d.a(it2.next(), it.next())) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.util.List
    public abstract E get(int i);

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        c.j.b.d.d(this, "c");
        Iterator<E> it = iterator();
        int iHashCode = 1;
        while (it.hasNext()) {
            E next = it.next();
            iHashCode = (iHashCode * 31) + (next != null ? next.hashCode() : 0);
        }
        return iHashCode;
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        Iterator<E> it = iterator();
        int i = 0;
        while (it.hasNext()) {
            if (c.j.b.d.a(it.next(), obj)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<E> iterator() {
        return new a();
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        ListIterator<E> listIterator = listIterator(size());
        while (listIterator.hasPrevious()) {
            if (c.j.b.d.a(listIterator.previous(), obj)) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    @Override // java.util.List
    public ListIterator<E> listIterator() {
        return new C0030b(0);
    }

    @Override // java.util.List
    public ListIterator<E> listIterator(int i) {
        return new C0030b(i);
    }

    @Override // java.util.List
    public E remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public E set(int i, E e2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public List<E> subList(int i, int i2) {
        return new c(this, i, i2);
    }
}
