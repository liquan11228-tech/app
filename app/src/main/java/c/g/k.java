package c.g;

import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class k implements Iterator<Integer>, c.j.b.l.a {
    public abstract int a();

    @Override // java.util.Iterator
    public Integer next() {
        return Integer.valueOf(a());
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
