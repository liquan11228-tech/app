package c.g;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class c<T> implements Collection<T>, c.j.b.l.a {

    /* renamed from: b, reason: collision with root package name */
    public final T[] f1268b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f1269c;

    public c(T[] tArr, boolean z) {
        c.j.b.d.d(tArr, "values");
        this.f1268b = tArr;
        this.f1269c = z;
    }

    @Override // java.util.Collection
    public boolean add(T t) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends T> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean contains(Object obj) {
        int i;
        T[] tArr = this.f1268b;
        c.j.b.d.d(tArr, "$this$contains");
        c.j.b.d.d(tArr, "$this$indexOf");
        if (obj == null) {
            int length = tArr.length;
            i = 0;
            while (i < length) {
                if (tArr[i] == null) {
                    break;
                }
                i++;
            }
            i = -1;
        } else {
            int length2 = tArr.length;
            for (int i2 = 0; i2 < length2; i2++) {
                if (c.j.b.d.a(obj, tArr[i2])) {
                    i = i2;
                    break;
                }
            }
            i = -1;
        }
        return i >= 0;
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
        return this.f1268b.length == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator<T> iterator() {
        T[] tArr = this.f1268b;
        c.j.b.d.d(tArr, "array");
        return new c.j.b.a(tArr);
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
    public final int size() {
        return this.f1268b.length;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        Object[] objArrCopyOf = this.f1268b;
        boolean z = this.f1269c;
        c.j.b.d.d(objArrCopyOf, "$this$copyToArrayOfAny");
        if (!z || !c.j.b.d.a(objArrCopyOf.getClass(), Object[].class)) {
            objArrCopyOf = Arrays.copyOf(objArrCopyOf, objArrCopyOf.length, Object[].class);
        }
        c.j.b.d.c(objArrCopyOf, "if (isVarargs && this.ja… Array<Any?>::class.java)");
        return objArrCopyOf;
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) c.j.b.b.b(this, tArr);
    }
}
