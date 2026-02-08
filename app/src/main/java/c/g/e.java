package c.g;

import a.b.k.h;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public class e extends d {
    public static final <T> List<T> a(T[] tArr) {
        c.j.b.d.d(tArr, "$this$asList");
        List<T> listAsList = Arrays.asList(tArr);
        c.j.b.d.c(listAsList, "ArraysUtilJVM.asList(this)");
        return listAsList;
    }

    public static final byte[] b(byte[] bArr, byte[] bArr2, int i, int i2, int i3) {
        c.j.b.d.d(bArr, "$this$copyInto");
        c.j.b.d.d(bArr2, "destination");
        System.arraycopy(bArr, i2, bArr2, i, i3 - i2);
        return bArr2;
    }

    public static /* synthetic */ byte[] c(byte[] bArr, byte[] bArr2, int i, int i2, int i3, int i4) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = bArr.length;
        }
        b(bArr, bArr2, i, i2, i3);
        return bArr2;
    }

    public static final byte[] d(byte[] bArr, int i, int i2) {
        c.j.b.d.d(bArr, "$this$copyOfRangeImpl");
        int length = bArr.length;
        if (i2 <= length) {
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i, i2);
            c.j.b.d.c(bArrCopyOfRange, "java.util.Arrays.copyOfR…this, fromIndex, toIndex)");
            return bArrCopyOfRange;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i2 + ") is greater than size (" + length + ").");
    }

    public static final <T> T e(List<? extends T> list) {
        c.j.b.d.d(list, "$this$first");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(0);
    }

    public static final <T, A extends Appendable> A f(Iterable<? extends T> iterable, A a2, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, c.j.a.b<? super T, ? extends CharSequence> bVar) throws IOException {
        c.j.b.d.d(iterable, "$this$joinTo");
        c.j.b.d.d(a2, "buffer");
        c.j.b.d.d(charSequence, "separator");
        c.j.b.d.d(charSequence2, "prefix");
        c.j.b.d.d(charSequence3, "postfix");
        c.j.b.d.d(charSequence4, "truncated");
        a2.append(charSequence2);
        int i2 = 0;
        for (T t : iterable) {
            i2++;
            if (i2 > 1) {
                a2.append(charSequence);
            }
            if (i >= 0 && i2 > i) {
                break;
            }
            h.i.d(a2, t, bVar);
        }
        if (i >= 0 && i2 > i) {
            a2.append(charSequence4);
        }
        a2.append(charSequence3);
        return a2;
    }

    public static final <T, C extends Collection<? super T>> C g(Iterable<? extends T> iterable, C c2) {
        c.j.b.d.d(iterable, "$this$toCollection");
        c.j.b.d.d(c2, "destination");
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            c2.add(it.next());
        }
        return c2;
    }

    public static final <T> List<T> h(Iterable<? extends T> iterable) {
        List listI;
        c.j.b.d.d(iterable, "$this$toList");
        boolean z = iterable instanceof Collection;
        if (z) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size == 0) {
                return h.f1272b;
            }
            if (size != 1) {
                return i(collection);
            }
            return h.i.E(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
        }
        c.j.b.d.d(iterable, "$this$toMutableList");
        if (z) {
            listI = i((Collection) iterable);
        } else {
            ArrayList arrayList = new ArrayList();
            g(iterable, arrayList);
            listI = arrayList;
        }
        return h.i.N(listI);
    }

    public static final <T> List<T> i(Collection<? extends T> collection) {
        c.j.b.d.d(collection, "$this$toMutableList");
        return new ArrayList(collection);
    }
}
