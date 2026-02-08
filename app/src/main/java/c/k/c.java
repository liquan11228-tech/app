package c.k;

/* loaded from: classes.dex */
public final class c extends a {

    /* renamed from: e */
    public static final c f1293e = new c(1, 0);
    public static final c f = null;

    public c(int i, int i2) {
        super(i, i2, 1);
    }

    @Override // c.k.a
    public boolean equals(Object obj) {
        if (obj instanceof c) {
            if (!isEmpty() || !((c) obj).isEmpty()) {
                c cVar = (c) obj;
                if (this.f1286b != cVar.f1286b || this.f1287c != cVar.f1287c) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // c.k.a
    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f1286b * 31) + this.f1287c;
    }

    @Override // c.k.a
    public boolean isEmpty() {
        return this.f1286b > this.f1287c;
    }

    @Override // c.k.a
    public String toString() {
        return this.f1286b + ".." + this.f1287c;
    }
}
