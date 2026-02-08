package d;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class y implements Iterable<c.b<? extends String, ? extends String>>, c.j.b.l.a {

    /* renamed from: c */
    public static final b f1735c = new b(null);

    /* renamed from: b */
    public final String[] f1736b;

    public static final class a {

        /* renamed from: a */
        public final List<String> f1737a = new ArrayList(20);

        public final a a(String str, String str2) {
            c.j.b.d.d(str, "name");
            c.j.b.d.d(str2, "value");
            this.f1737a.add(str);
            this.f1737a.add(c.m.e.C(str2).toString());
            return this;
        }

        public final y b() {
            Object[] array = this.f1737a.toArray(new String[0]);
            if (array != null) {
                return new y((String[]) array, null);
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }

        public final a c(String str) {
            c.j.b.d.d(str, "name");
            int i = 0;
            while (i < this.f1737a.size()) {
                if (c.m.e.e(str, this.f1737a.get(i), true)) {
                    this.f1737a.remove(i);
                    this.f1737a.remove(i);
                    i -= 2;
                }
                i += 2;
            }
            return this;
        }

        public final a d(String str, String str2) {
            c.j.b.d.d(str, "name");
            c.j.b.d.d(str2, "value");
            if (!(str.length() > 0)) {
                throw new IllegalArgumentException("name is empty".toString());
            }
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char cCharAt = str.charAt(i);
                if (!('!' <= cCharAt && '~' >= cCharAt)) {
                    throw new IllegalArgumentException(d.n0.c.k("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(cCharAt), Integer.valueOf(i), str).toString());
                }
            }
            int length2 = str2.length();
            for (int i2 = 0; i2 < length2; i2++) {
                char cCharAt2 = str2.charAt(i2);
                if (!(cCharAt2 == '\t' || (' ' <= cCharAt2 && '~' >= cCharAt2))) {
                    throw new IllegalArgumentException(d.n0.c.k("Unexpected char %#04x at %d in %s value: %s", Integer.valueOf(cCharAt2), Integer.valueOf(i2), str, str2).toString());
                }
            }
            c(str);
            a(str, str2);
            return this;
        }
    }

    public static final class b {
        public b(c.j.b.c cVar) {
        }

        public final void a(String str) {
            if (!(str.length() > 0)) {
                throw new IllegalArgumentException("name is empty".toString());
            }
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char cCharAt = str.charAt(i);
                if (!('!' <= cCharAt && '~' >= cCharAt)) {
                    throw new IllegalArgumentException(d.n0.c.k("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(cCharAt), Integer.valueOf(i), str).toString());
                }
            }
        }

        public final void b(String str, String str2) {
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char cCharAt = str.charAt(i);
                if (!(cCharAt == '\t' || (' ' <= cCharAt && '~' >= cCharAt))) {
                    throw new IllegalArgumentException(d.n0.c.k("Unexpected char %#04x at %d in %s value: %s", Integer.valueOf(cCharAt), Integer.valueOf(i), str2, str).toString());
                }
            }
        }

        public final y c(String... strArr) throws CloneNotSupportedException {
            c.j.b.d.d(strArr, "namesAndValues");
            if (!(strArr.length % 2 == 0)) {
                throw new IllegalArgumentException("Expected alternating header names and values".toString());
            }
            Object objClone = strArr.clone();
            if (objClone == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.String>");
            }
            String[] strArr2 = (String[]) objClone;
            int length = strArr2.length;
            for (int i = 0; i < length; i++) {
                if (!(strArr2[i] != null)) {
                    throw new IllegalArgumentException("Headers cannot be null".toString());
                }
                String str = strArr2[i];
                if (str == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
                }
                strArr2[i] = c.m.e.C(str).toString();
            }
            c.k.a aVarB = c.k.d.b(c.k.d.c(0, strArr2.length), 2);
            int i2 = aVarB.f1286b;
            int i3 = aVarB.f1287c;
            int i4 = aVarB.f1288d;
            if (i4 < 0 ? i2 >= i3 : i2 <= i3) {
                while (true) {
                    String str2 = strArr2[i2];
                    String str3 = strArr2[i2 + 1];
                    a(str2);
                    b(str3, str2);
                    if (i2 == i3) {
                        break;
                    }
                    i2 += i4;
                }
            }
            return new y(strArr2, null);
        }
    }

    public y(String[] strArr, c.j.b.c cVar) {
        this.f1736b = strArr;
    }

    public final String a(String str) {
        c.j.b.d.d(str, "name");
        String[] strArr = this.f1736b;
        c.k.a aVarB = c.k.d.b(c.k.d.a(strArr.length - 2, 0), 2);
        int i = aVarB.f1286b;
        int i2 = aVarB.f1287c;
        int i3 = aVarB.f1288d;
        if (i3 >= 0) {
            if (i > i2) {
                return null;
            }
        } else if (i < i2) {
            return null;
        }
        while (!c.m.e.e(str, strArr[i], true)) {
            if (i == i2) {
                return null;
            }
            i += i3;
        }
        return strArr[i + 1];
    }

    public final String b(int i) {
        return this.f1736b[i * 2];
    }

    public final a c() {
        a aVar = new a();
        List<String> list = aVar.f1737a;
        String[] strArr = this.f1736b;
        c.j.b.d.d(list, "$this$addAll");
        c.j.b.d.d(strArr, "elements");
        list.addAll(c.g.e.a(strArr));
        return aVar;
    }

    public final String d(int i) {
        return this.f1736b[(i * 2) + 1];
    }

    public boolean equals(Object obj) {
        return (obj instanceof y) && Arrays.equals(this.f1736b, ((y) obj).f1736b);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f1736b);
    }

    @Override // java.lang.Iterable
    public Iterator<c.b<? extends String, ? extends String>> iterator() {
        int size = size();
        c.b[] bVarArr = new c.b[size];
        for (int i = 0; i < size; i++) {
            bVarArr[i] = new c.b(b(i), d(i));
        }
        c.j.b.d.d(bVarArr, "array");
        return new c.j.b.a(bVarArr);
    }

    public final int size() {
        return this.f1736b.length / 2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        int size = size();
        for (int i = 0; i < size; i++) {
            sb.append(b(i));
            sb.append(": ");
            sb.append(d(i));
            sb.append("\n");
        }
        String string = sb.toString();
        c.j.b.d.c(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
