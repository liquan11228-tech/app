package a.e;

/* loaded from: classes.dex */
public class i<E> implements Cloneable {
    public static final Object f = new Object();

    /* renamed from: b, reason: collision with root package name */
    public boolean f422b;

    /* renamed from: c, reason: collision with root package name */
    public int[] f423c;

    /* renamed from: d, reason: collision with root package name */
    public Object[] f424d;

    /* renamed from: e, reason: collision with root package name */
    public int f425e;

    public i() {
        this(10);
    }

    public i(int i) {
        this.f422b = false;
        if (i == 0) {
            this.f423c = d.f392a;
            this.f424d = d.f394c;
        } else {
            int iE = d.e(i);
            this.f423c = new int[iE];
            this.f424d = new Object[iE];
        }
    }

    public void a(int i, E e2) {
        int i2 = this.f425e;
        if (i2 != 0 && i <= this.f423c[i2 - 1]) {
            g(i, e2);
            return;
        }
        if (this.f422b && this.f425e >= this.f423c.length) {
            c();
        }
        int i3 = this.f425e;
        if (i3 >= this.f423c.length) {
            int iE = d.e(i3 + 1);
            int[] iArr = new int[iE];
            Object[] objArr = new Object[iE];
            int[] iArr2 = this.f423c;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr2 = this.f424d;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f423c = iArr;
            this.f424d = objArr;
        }
        this.f423c[i3] = i;
        this.f424d[i3] = e2;
        this.f425e = i3 + 1;
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public i<E> clone() {
        try {
            i<E> iVar = (i) super.clone();
            iVar.f423c = (int[]) this.f423c.clone();
            iVar.f424d = (Object[]) this.f424d.clone();
            return iVar;
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }

    public final void c() {
        int i = this.f425e;
        int[] iArr = this.f423c;
        Object[] objArr = this.f424d;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f422b = false;
        this.f425e = i2;
    }

    public E d(int i) {
        return e(i, null);
    }

    public E e(int i, E e2) {
        int iA = d.a(this.f423c, this.f425e, i);
        if (iA >= 0) {
            Object[] objArr = this.f424d;
            if (objArr[iA] != f) {
                return (E) objArr[iA];
            }
        }
        return e2;
    }

    public int f(int i) {
        if (this.f422b) {
            c();
        }
        return this.f423c[i];
    }

    public void g(int i, E e2) {
        int iA = d.a(this.f423c, this.f425e, i);
        if (iA >= 0) {
            this.f424d[iA] = e2;
            return;
        }
        int i2 = ~iA;
        if (i2 < this.f425e) {
            Object[] objArr = this.f424d;
            if (objArr[i2] == f) {
                this.f423c[i2] = i;
                objArr[i2] = e2;
                return;
            }
        }
        if (this.f422b && this.f425e >= this.f423c.length) {
            c();
            i2 = ~d.a(this.f423c, this.f425e, i);
        }
        int i3 = this.f425e;
        if (i3 >= this.f423c.length) {
            int iE = d.e(i3 + 1);
            int[] iArr = new int[iE];
            Object[] objArr2 = new Object[iE];
            int[] iArr2 = this.f423c;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.f424d;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f423c = iArr;
            this.f424d = objArr2;
        }
        int i4 = this.f425e;
        if (i4 - i2 != 0) {
            int[] iArr3 = this.f423c;
            int i5 = i2 + 1;
            System.arraycopy(iArr3, i2, iArr3, i5, i4 - i2);
            Object[] objArr4 = this.f424d;
            System.arraycopy(objArr4, i2, objArr4, i5, this.f425e - i2);
        }
        this.f423c[i2] = i;
        this.f424d[i2] = e2;
        this.f425e++;
    }

    public void h(int i) {
        int iA = d.a(this.f423c, this.f425e, i);
        if (iA >= 0) {
            Object[] objArr = this.f424d;
            Object obj = objArr[iA];
            Object obj2 = f;
            if (obj != obj2) {
                objArr[iA] = obj2;
                this.f422b = true;
            }
        }
    }

    public int i() {
        if (this.f422b) {
            c();
        }
        return this.f425e;
    }

    public E j(int i) {
        if (this.f422b) {
            c();
        }
        return (E) this.f424d[i];
    }

    public String toString() {
        if (i() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f425e * 28);
        sb.append('{');
        for (int i = 0; i < this.f425e; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(f(i));
            sb.append('=');
            E eJ = j(i);
            if (eJ != this) {
                sb.append(eJ);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
