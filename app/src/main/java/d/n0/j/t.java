package d.n0.j;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public int f1621a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f1622b = new int[10];

    public final int a() {
        if ((this.f1621a & 128) != 0) {
            return this.f1622b[7];
        }
        return 65535;
    }

    public final void b(t tVar) {
        c.j.b.d.d(tVar, "other");
        for (int i = 0; i < 10; i++) {
            if (((1 << i) & tVar.f1621a) != 0) {
                c(i, tVar.f1622b[i]);
            }
        }
    }

    public final t c(int i, int i2) {
        if (i >= 0) {
            int[] iArr = this.f1622b;
            if (i < iArr.length) {
                this.f1621a = (1 << i) | this.f1621a;
                iArr[i] = i2;
            }
        }
        return this;
    }
}
