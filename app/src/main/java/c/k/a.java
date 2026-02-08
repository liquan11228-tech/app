package c.k;

import a.b.k.h;
import java.util.Iterator;

/* loaded from: classes.dex */
public class a implements Iterable<Integer>, c.j.b.l.a {

    /* renamed from: b, reason: collision with root package name */
    public final int f1286b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1287c;

    /* renamed from: d, reason: collision with root package name */
    public final int f1288d;

    public a(int i, int i2, int i3) {
        if (i3 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i3 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f1286b = i;
        if (i3 > 0) {
            if (i < i2) {
                i2 -= h.i.H(h.i.H(i2, i3) - h.i.H(i, i3), i3);
            }
        } else {
            if (i3 >= 0) {
                throw new IllegalArgumentException("Step is zero.");
            }
            if (i > i2) {
                int i4 = -i3;
                i2 += h.i.H(h.i.H(i, i4) - h.i.H(i2, i4), i4);
            }
        }
        this.f1287c = i2;
        this.f1288d = i3;
    }

    public boolean equals(Object obj) {
        if (obj instanceof a) {
            if (!isEmpty() || !((a) obj).isEmpty()) {
                a aVar = (a) obj;
                if (this.f1286b != aVar.f1286b || this.f1287c != aVar.f1287c || this.f1288d != aVar.f1288d) {
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f1286b * 31) + this.f1287c) * 31) + this.f1288d;
    }

    public boolean isEmpty() {
        if (this.f1288d > 0) {
            if (this.f1286b > this.f1287c) {
                return true;
            }
        } else if (this.f1286b < this.f1287c) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Iterable
    public Iterator<Integer> iterator() {
        return new b(this.f1286b, this.f1287c, this.f1288d);
    }

    public String toString() {
        StringBuilder sb;
        int i;
        if (this.f1288d > 0) {
            sb = new StringBuilder();
            sb.append(this.f1286b);
            sb.append("..");
            sb.append(this.f1287c);
            sb.append(" step ");
            i = this.f1288d;
        } else {
            sb = new StringBuilder();
            sb.append(this.f1286b);
            sb.append(" downTo ");
            sb.append(this.f1287c);
            sb.append(" step ");
            i = -this.f1288d;
        }
        sb.append(i);
        return sb.toString();
    }
}
