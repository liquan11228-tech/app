package a.e;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* loaded from: classes.dex */
public class h<K, V> {

    /* renamed from: e, reason: collision with root package name */
    public static Object[] f418e;
    public static int f;
    public static Object[] g;
    public static int h;

    /* renamed from: b, reason: collision with root package name */
    public int[] f419b = d.f392a;

    /* renamed from: c, reason: collision with root package name */
    public Object[] f420c = d.f394c;

    /* renamed from: d, reason: collision with root package name */
    public int f421d = 0;

    public static void b(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (h.class) {
                if (h < 10) {
                    objArr[0] = g;
                    objArr[1] = iArr;
                    for (int i2 = (i << 1) - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    g = objArr;
                    h++;
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (h.class) {
                if (f < 10) {
                    objArr[0] = f418e;
                    objArr[1] = iArr;
                    for (int i3 = (i << 1) - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    f418e = objArr;
                    f++;
                }
            }
        }
    }

    public final void a(int i) {
        if (i == 8) {
            synchronized (h.class) {
                if (g != null) {
                    Object[] objArr = g;
                    this.f420c = objArr;
                    g = (Object[]) objArr[0];
                    this.f419b = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    h--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (h.class) {
                if (f418e != null) {
                    Object[] objArr2 = f418e;
                    this.f420c = objArr2;
                    f418e = (Object[]) objArr2[0];
                    this.f419b = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f--;
                    return;
                }
            }
        }
        this.f419b = new int[i];
        this.f420c = new Object[i << 1];
    }

    public int c(Object obj, int i) {
        int i2 = this.f421d;
        if (i2 == 0) {
            return -1;
        }
        try {
            int iA = d.a(this.f419b, i2, i);
            if (iA < 0 || obj.equals(this.f420c[iA << 1])) {
                return iA;
            }
            int i3 = iA + 1;
            while (i3 < i2 && this.f419b[i3] == i) {
                if (obj.equals(this.f420c[i3 << 1])) {
                    return i3;
                }
                i3++;
            }
            for (int i4 = iA - 1; i4 >= 0 && this.f419b[i4] == i; i4--) {
                if (obj.equals(this.f420c[i4 << 1])) {
                    return i4;
                }
            }
            return ~i3;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public void clear() {
        int i = this.f421d;
        if (i > 0) {
            int[] iArr = this.f419b;
            Object[] objArr = this.f420c;
            this.f419b = d.f392a;
            this.f420c = d.f394c;
            this.f421d = 0;
            b(iArr, objArr, i);
        }
        if (this.f421d > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return d(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return f(obj) >= 0;
    }

    public int d(Object obj) {
        return obj == null ? e() : c(obj, obj.hashCode());
    }

    public int e() {
        int i = this.f421d;
        if (i == 0) {
            return -1;
        }
        try {
            int iA = d.a(this.f419b, i, 0);
            if (iA < 0 || this.f420c[iA << 1] == null) {
                return iA;
            }
            int i2 = iA + 1;
            while (i2 < i && this.f419b[i2] == 0) {
                if (this.f420c[i2 << 1] == null) {
                    return i2;
                }
                i2++;
            }
            for (int i3 = iA - 1; i3 >= 0 && this.f419b[i3] == 0; i3--) {
                if (this.f420c[i3 << 1] == null) {
                    return i3;
                }
            }
            return ~i2;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (this.f421d != hVar.f421d) {
                return false;
            }
            for (int i = 0; i < this.f421d; i++) {
                try {
                    K kG = g(i);
                    V vJ = j(i);
                    Object obj2 = hVar.get(kG);
                    if (vJ == null) {
                        if (obj2 != null || !hVar.containsKey(kG)) {
                            return false;
                        }
                    } else if (!vJ.equals(obj2)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (this.f421d != map.size()) {
                return false;
            }
            for (int i2 = 0; i2 < this.f421d; i2++) {
                try {
                    K kG2 = g(i2);
                    V vJ2 = j(i2);
                    Object obj3 = map.get(kG2);
                    if (vJ2 == null) {
                        if (obj3 != null || !map.containsKey(kG2)) {
                            return false;
                        }
                    } else if (!vJ2.equals(obj3)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused2) {
                }
            }
            return true;
        }
        return false;
    }

    public int f(Object obj) {
        int i = this.f421d * 2;
        Object[] objArr = this.f420c;
        if (obj == null) {
            for (int i2 = 1; i2 < i; i2 += 2) {
                if (objArr[i2] == null) {
                    return i2 >> 1;
                }
            }
            return -1;
        }
        for (int i3 = 1; i3 < i; i3 += 2) {
            if (obj.equals(objArr[i3])) {
                return i3 >> 1;
            }
        }
        return -1;
    }

    public K g(int i) {
        return (K) this.f420c[i << 1];
    }

    public V get(Object obj) {
        return getOrDefault(obj, null);
    }

    public V getOrDefault(Object obj, V v) {
        int iD = d(obj);
        return iD >= 0 ? (V) this.f420c[(iD << 1) + 1] : v;
    }

    public V h(int i) {
        Object[] objArr = this.f420c;
        int i2 = i << 1;
        V v = (V) objArr[i2 + 1];
        int i3 = this.f421d;
        int i4 = 0;
        if (i3 <= 1) {
            b(this.f419b, objArr, i3);
            this.f419b = d.f392a;
            this.f420c = d.f394c;
        } else {
            int i5 = i3 - 1;
            int[] iArr = this.f419b;
            if (iArr.length <= 8 || i3 >= iArr.length / 3) {
                if (i < i5) {
                    int[] iArr2 = this.f419b;
                    int i6 = i + 1;
                    int i7 = i5 - i;
                    System.arraycopy(iArr2, i6, iArr2, i, i7);
                    Object[] objArr2 = this.f420c;
                    System.arraycopy(objArr2, i6 << 1, objArr2, i2, i7 << 1);
                }
                Object[] objArr3 = this.f420c;
                int i8 = i5 << 1;
                objArr3[i8] = null;
                objArr3[i8 + 1] = null;
            } else {
                int i9 = i3 > 8 ? i3 + (i3 >> 1) : 8;
                int[] iArr3 = this.f419b;
                Object[] objArr4 = this.f420c;
                a(i9);
                if (i3 != this.f421d) {
                    throw new ConcurrentModificationException();
                }
                if (i > 0) {
                    System.arraycopy(iArr3, 0, this.f419b, 0, i);
                    System.arraycopy(objArr4, 0, this.f420c, 0, i2);
                }
                if (i < i5) {
                    int i10 = i + 1;
                    int i11 = i5 - i;
                    System.arraycopy(iArr3, i10, this.f419b, i, i11);
                    System.arraycopy(objArr4, i10 << 1, this.f420c, i2, i11 << 1);
                }
            }
            i4 = i5;
        }
        if (i3 != this.f421d) {
            throw new ConcurrentModificationException();
        }
        this.f421d = i4;
        return v;
    }

    public int hashCode() {
        int[] iArr = this.f419b;
        Object[] objArr = this.f420c;
        int i = this.f421d;
        int i2 = 1;
        int i3 = 0;
        int iHashCode = 0;
        while (i3 < i) {
            Object obj = objArr[i2];
            iHashCode += (obj == null ? 0 : obj.hashCode()) ^ iArr[i3];
            i3++;
            i2 += 2;
        }
        return iHashCode;
    }

    public V i(int i, V v) {
        int i2 = (i << 1) + 1;
        Object[] objArr = this.f420c;
        V v2 = (V) objArr[i2];
        objArr[i2] = v;
        return v2;
    }

    public boolean isEmpty() {
        return this.f421d <= 0;
    }

    public V j(int i) {
        return (V) this.f420c[(i << 1) + 1];
    }

    public V put(K k, V v) {
        int i;
        int iC;
        int i2 = this.f421d;
        if (k == null) {
            iC = e();
            i = 0;
        } else {
            int iHashCode = k.hashCode();
            i = iHashCode;
            iC = c(k, iHashCode);
        }
        if (iC >= 0) {
            int i3 = (iC << 1) + 1;
            Object[] objArr = this.f420c;
            V v2 = (V) objArr[i3];
            objArr[i3] = v;
            return v2;
        }
        int i4 = ~iC;
        if (i2 >= this.f419b.length) {
            int i5 = 4;
            if (i2 >= 8) {
                i5 = (i2 >> 1) + i2;
            } else if (i2 >= 4) {
                i5 = 8;
            }
            int[] iArr = this.f419b;
            Object[] objArr2 = this.f420c;
            a(i5);
            if (i2 != this.f421d) {
                throw new ConcurrentModificationException();
            }
            int[] iArr2 = this.f419b;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr2, 0, this.f420c, 0, objArr2.length);
            }
            b(iArr, objArr2, i2);
        }
        if (i4 < i2) {
            int[] iArr3 = this.f419b;
            int i6 = i4 + 1;
            System.arraycopy(iArr3, i4, iArr3, i6, i2 - i4);
            Object[] objArr3 = this.f420c;
            System.arraycopy(objArr3, i4 << 1, objArr3, i6 << 1, (this.f421d - i4) << 1);
        }
        int i7 = this.f421d;
        if (i2 == i7) {
            int[] iArr4 = this.f419b;
            if (i4 < iArr4.length) {
                iArr4[i4] = i;
                Object[] objArr4 = this.f420c;
                int i8 = i4 << 1;
                objArr4[i8] = k;
                objArr4[i8 + 1] = v;
                this.f421d = i7 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public V putIfAbsent(K k, V v) {
        V orDefault = getOrDefault(k, null);
        return orDefault == null ? put(k, v) : orDefault;
    }

    public V remove(Object obj) {
        int iD = d(obj);
        if (iD >= 0) {
            return h(iD);
        }
        return null;
    }

    public boolean remove(Object obj, Object obj2) {
        int iD = d(obj);
        if (iD < 0) {
            return false;
        }
        V vJ = j(iD);
        if (obj2 != vJ && (obj2 == null || !obj2.equals(vJ))) {
            return false;
        }
        h(iD);
        return true;
    }

    public V replace(K k, V v) {
        int iD = d(k);
        if (iD >= 0) {
            return i(iD, v);
        }
        return null;
    }

    public boolean replace(K k, V v, V v2) {
        int iD = d(k);
        if (iD < 0) {
            return false;
        }
        V vJ = j(iD);
        if (vJ != v && (v == null || !v.equals(vJ))) {
            return false;
        }
        i(iD, v2);
        return true;
    }

    public int size() {
        return this.f421d;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f421d * 28);
        sb.append('{');
        for (int i = 0; i < this.f421d; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            K kG = g(i);
            if (kG != this) {
                sb.append(kG);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            V vJ = j(i);
            if (vJ != this) {
                sb.append(vJ);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
