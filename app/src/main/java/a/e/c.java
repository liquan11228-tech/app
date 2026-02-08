package a.e;

import a.e.g;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public final class c<E> implements Collection<E>, Set<E> {
    public static final int[] f = new int[0];
    public static final Object[] g = new Object[0];
    public static Object[] h;
    public static int i;
    public static Object[] j;
    public static int k;

    /* renamed from: b, reason: collision with root package name */
    public int[] f388b = f;

    /* renamed from: c, reason: collision with root package name */
    public Object[] f389c = g;

    /* renamed from: d, reason: collision with root package name */
    public int f390d = 0;

    /* renamed from: e, reason: collision with root package name */
    public g<E, E> f391e;

    public static void b(int[] iArr, Object[] objArr, int i2) {
        if (iArr.length == 8) {
            synchronized (c.class) {
                if (k < 10) {
                    objArr[0] = j;
                    objArr[1] = iArr;
                    for (int i3 = i2 - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    j = objArr;
                    k++;
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (c.class) {
                if (i < 10) {
                    objArr[0] = h;
                    objArr[1] = iArr;
                    for (int i4 = i2 - 1; i4 >= 2; i4--) {
                        objArr[i4] = null;
                    }
                    h = objArr;
                    i++;
                }
            }
        }
    }

    public final void a(int i2) {
        if (i2 == 8) {
            synchronized (c.class) {
                if (j != null) {
                    Object[] objArr = j;
                    this.f389c = objArr;
                    j = (Object[]) objArr[0];
                    this.f388b = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    k--;
                    return;
                }
            }
        } else if (i2 == 4) {
            synchronized (c.class) {
                if (h != null) {
                    Object[] objArr2 = h;
                    this.f389c = objArr2;
                    h = (Object[]) objArr2[0];
                    this.f388b = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    i--;
                    return;
                }
            }
        }
        this.f388b = new int[i2];
        this.f389c = new Object[i2];
    }

    @Override // java.util.Collection, java.util.Set
    public boolean add(E e2) {
        int i2;
        int iC;
        if (e2 == null) {
            iC = d();
            i2 = 0;
        } else {
            int iHashCode = e2.hashCode();
            i2 = iHashCode;
            iC = c(e2, iHashCode);
        }
        if (iC >= 0) {
            return false;
        }
        int i3 = ~iC;
        int i4 = this.f390d;
        if (i4 >= this.f388b.length) {
            int i5 = 4;
            if (i4 >= 8) {
                i5 = (i4 >> 1) + i4;
            } else if (i4 >= 4) {
                i5 = 8;
            }
            int[] iArr = this.f388b;
            Object[] objArr = this.f389c;
            a(i5);
            int[] iArr2 = this.f388b;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.f389c, 0, objArr.length);
            }
            b(iArr, objArr, this.f390d);
        }
        int i6 = this.f390d;
        if (i3 < i6) {
            int[] iArr3 = this.f388b;
            int i7 = i3 + 1;
            System.arraycopy(iArr3, i3, iArr3, i7, i6 - i3);
            Object[] objArr2 = this.f389c;
            System.arraycopy(objArr2, i3, objArr2, i7, this.f390d - i3);
        }
        this.f388b[i3] = i2;
        this.f389c[i3] = e2;
        this.f390d++;
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean addAll(Collection<? extends E> collection) {
        int size = collection.size() + this.f390d;
        int[] iArr = this.f388b;
        boolean zAdd = false;
        if (iArr.length < size) {
            Object[] objArr = this.f389c;
            a(size);
            int i2 = this.f390d;
            if (i2 > 0) {
                System.arraycopy(iArr, 0, this.f388b, 0, i2);
                System.arraycopy(objArr, 0, this.f389c, 0, this.f390d);
            }
            b(iArr, objArr, this.f390d);
        }
        Iterator<? extends E> it = collection.iterator();
        while (it.hasNext()) {
            zAdd |= add(it.next());
        }
        return zAdd;
    }

    public final int c(Object obj, int i2) {
        int i3 = this.f390d;
        if (i3 == 0) {
            return -1;
        }
        int iA = d.a(this.f388b, i3, i2);
        if (iA < 0 || obj.equals(this.f389c[iA])) {
            return iA;
        }
        int i4 = iA + 1;
        while (i4 < i3 && this.f388b[i4] == i2) {
            if (obj.equals(this.f389c[i4])) {
                return i4;
            }
            i4++;
        }
        for (int i5 = iA - 1; i5 >= 0 && this.f388b[i5] == i2; i5--) {
            if (obj.equals(this.f389c[i5])) {
                return i5;
            }
        }
        return ~i4;
    }

    @Override // java.util.Collection, java.util.Set
    public void clear() {
        int i2 = this.f390d;
        if (i2 != 0) {
            b(this.f388b, this.f389c, i2);
            this.f388b = f;
            this.f389c = g;
            this.f390d = 0;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean containsAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final int d() {
        int i2 = this.f390d;
        if (i2 == 0) {
            return -1;
        }
        int iA = d.a(this.f388b, i2, 0);
        if (iA < 0 || this.f389c[iA] == null) {
            return iA;
        }
        int i3 = iA + 1;
        while (i3 < i2 && this.f388b[i3] == 0) {
            if (this.f389c[i3] == null) {
                return i3;
            }
            i3++;
        }
        for (int i4 = iA - 1; i4 >= 0 && this.f388b[i4] == 0; i4--) {
            if (this.f389c[i4] == null) {
                return i4;
            }
        }
        return ~i3;
    }

    public E e(int i2) {
        Object[] objArr = this.f389c;
        E e2 = (E) objArr[i2];
        int i3 = this.f390d;
        if (i3 <= 1) {
            b(this.f388b, objArr, i3);
            this.f388b = f;
            this.f389c = g;
            this.f390d = 0;
        } else {
            int[] iArr = this.f388b;
            if (iArr.length <= 8 || i3 >= iArr.length / 3) {
                int i4 = this.f390d - 1;
                this.f390d = i4;
                if (i2 < i4) {
                    int[] iArr2 = this.f388b;
                    int i5 = i2 + 1;
                    System.arraycopy(iArr2, i5, iArr2, i2, i4 - i2);
                    Object[] objArr2 = this.f389c;
                    System.arraycopy(objArr2, i5, objArr2, i2, this.f390d - i2);
                }
                this.f389c[this.f390d] = null;
            } else {
                int i6 = i3 > 8 ? i3 + (i3 >> 1) : 8;
                int[] iArr3 = this.f388b;
                Object[] objArr3 = this.f389c;
                a(i6);
                this.f390d--;
                if (i2 > 0) {
                    System.arraycopy(iArr3, 0, this.f388b, 0, i2);
                    System.arraycopy(objArr3, 0, this.f389c, 0, i2);
                }
                int i7 = this.f390d;
                if (i2 < i7) {
                    int i8 = i2 + 1;
                    System.arraycopy(iArr3, i8, this.f388b, i2, i7 - i2);
                    System.arraycopy(objArr3, i8, this.f389c, i2, this.f390d - i2);
                }
            }
        }
        return e2;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (this.f390d != set.size()) {
                return false;
            }
            for (int i2 = 0; i2 < this.f390d; i2++) {
                try {
                    if (!set.contains(this.f389c[i2])) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        int[] iArr = this.f388b;
        int i2 = this.f390d;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            i3 += iArr[i4];
        }
        return i3;
    }

    public int indexOf(Object obj) {
        return obj == null ? d() : c(obj, obj.hashCode());
    }

    @Override // java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f390d <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        if (this.f391e == null) {
            this.f391e = new b(this);
        }
        g<E, E> gVar = this.f391e;
        if (gVar.f405b == null) {
            gVar.f405b = new g.c();
        }
        return gVar.f405b.iterator();
    }

    @Override // java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf < 0) {
            return false;
        }
        e(iIndexOf);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean removeAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= remove(it.next());
        }
        return zRemove;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean retainAll(Collection<?> collection) {
        boolean z = false;
        for (int i2 = this.f390d - 1; i2 >= 0; i2--) {
            if (!collection.contains(this.f389c[i2])) {
                e(i2);
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public int size() {
        return this.f390d;
    }

    @Override // java.util.Collection, java.util.Set
    public Object[] toArray() {
        int i2 = this.f390d;
        Object[] objArr = new Object[i2];
        System.arraycopy(this.f389c, 0, objArr, 0, i2);
        return objArr;
    }

    @Override // java.util.Collection, java.util.Set
    public <T> T[] toArray(T[] tArr) {
        if (tArr.length < this.f390d) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.f390d));
        }
        System.arraycopy(this.f389c, 0, tArr, 0, this.f390d);
        int length = tArr.length;
        int i2 = this.f390d;
        if (length > i2) {
            tArr[i2] = null;
        }
        return tArr;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f390d * 14);
        sb.append('{');
        for (int i2 = 0; i2 < this.f390d; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            Object obj = this.f389c[i2];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
