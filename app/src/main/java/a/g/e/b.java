package a.g.e;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: e, reason: collision with root package name */
    public static final b f616e = new b(0, 0, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final int f617a;

    /* renamed from: b, reason: collision with root package name */
    public final int f618b;

    /* renamed from: c, reason: collision with root package name */
    public final int f619c;

    /* renamed from: d, reason: collision with root package name */
    public final int f620d;

    public b(int i, int i2, int i3, int i4) {
        this.f617a = i;
        this.f618b = i2;
        this.f619c = i3;
        this.f620d = i4;
    }

    public static b a(int i, int i2, int i3, int i4) {
        return (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) ? f616e : new b(i, i2, i3, i4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return this.f620d == bVar.f620d && this.f617a == bVar.f617a && this.f619c == bVar.f619c && this.f618b == bVar.f618b;
    }

    public int hashCode() {
        return (((((this.f617a * 31) + this.f618b) * 31) + this.f619c) * 31) + this.f620d;
    }

    public String toString() {
        StringBuilder sbE = b.a.a.a.a.e("Insets{left=");
        sbE.append(this.f617a);
        sbE.append(", top=");
        sbE.append(this.f618b);
        sbE.append(", right=");
        sbE.append(this.f619c);
        sbE.append(", bottom=");
        sbE.append(this.f620d);
        sbE.append('}');
        return sbE.toString();
    }
}
