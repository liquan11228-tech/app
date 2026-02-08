package c.j.b;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class a<T> implements Iterator<T>, c.j.b.l.a {

    /* renamed from: b, reason: collision with root package name */
    public int f1279b;

    /* renamed from: c, reason: collision with root package name */
    public final T[] f1280c;

    public a(T[] tArr) {
        d.d(tArr, "array");
        this.f1280c = tArr;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f1279b < this.f1280c.length;
    }

    @Override // java.util.Iterator
    public T next() {
        try {
            T[] tArr = this.f1280c;
            int i = this.f1279b;
            this.f1279b = i + 1;
            return tArr[i];
        } catch (ArrayIndexOutOfBoundsException e2) {
            this.f1279b--;
            throw new NoSuchElementException(e2.getMessage());
        }
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
