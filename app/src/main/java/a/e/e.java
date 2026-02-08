package a.e;

/* loaded from: classes.dex */
public class e<E> implements Cloneable {
    public static final Object f = new Object();

    /* renamed from: b, reason: collision with root package name */
    public boolean f395b = false;

    /* renamed from: c, reason: collision with root package name */
    public long[] f396c;

    /* renamed from: d, reason: collision with root package name */
    public Object[] f397d;

    /* renamed from: e, reason: collision with root package name */
    public int f398e;

    public e() {
        int iF = d.f(10);
        this.f396c = new long[iF];
        this.f397d = new Object[iF];
    }

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public e<E> clone() {
        try {
            e<E> eVar = (e) super.clone();
            eVar.f396c = (long[]) this.f396c.clone();
            eVar.f397d = (Object[]) this.f397d.clone();
            return eVar;
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }

    public final void b() {
        int i = this.f398e;
        long[] jArr = this.f396c;
        Object[] objArr = this.f397d;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f) {
                if (i3 != i2) {
                    jArr[i2] = jArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f395b = false;
        this.f398e = i2;
    }

    public E c(long j, E e2) {
        int iB = d.b(this.f396c, this.f398e, j);
        if (iB >= 0) {
            Object[] objArr = this.f397d;
            if (objArr[iB] != f) {
                return (E) objArr[iB];
            }
        }
        return e2;
    }

    public void d(long j, E e2) {
        int iB = d.b(this.f396c, this.f398e, j);
        if (iB >= 0) {
            this.f397d[iB] = e2;
            return;
        }
        int i = ~iB;
        if (i < this.f398e) {
            Object[] objArr = this.f397d;
            if (objArr[i] == f) {
                this.f396c[i] = j;
                objArr[i] = e2;
                return;
            }
        }
        if (this.f395b && this.f398e >= this.f396c.length) {
            b();
            i = ~d.b(this.f396c, this.f398e, j);
        }
        int i2 = this.f398e;
        if (i2 >= this.f396c.length) {
            int iF = d.f(i2 + 1);
            long[] jArr = new long[iF];
            Object[] objArr2 = new Object[iF];
            long[] jArr2 = this.f396c;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.f397d;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f396c = jArr;
            this.f397d = objArr2;
        }
        int i3 = this.f398e;
        if (i3 - i != 0) {
            long[] jArr3 = this.f396c;
            int i4 = i + 1;
            System.arraycopy(jArr3, i, jArr3, i4, i3 - i);
            Object[] objArr4 = this.f397d;
            System.arraycopy(objArr4, i, objArr4, i4, this.f398e - i);
        }
        this.f396c[i] = j;
        this.f397d[i] = e2;
        this.f398e++;
    }

    public String toString() {
        if (this.f395b) {
            b();
        }
        int i = this.f398e;
        if (i <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(i * 28);
        sb.append('{');
        for (int i2 = 0; i2 < this.f398e; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            if (this.f395b) {
                b();
            }
            sb.append(this.f396c[i2]);
            sb.append('=');
            if (this.f395b) {
                b();
            }
            Object obj = this.f397d[i2];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
