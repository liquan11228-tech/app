package e;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f1798a;

    /* renamed from: b, reason: collision with root package name */
    public int f1799b;

    /* renamed from: c, reason: collision with root package name */
    public int f1800c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f1801d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f1802e;
    public u f;
    public u g;

    public u() {
        this.f1798a = new byte[8192];
        this.f1802e = true;
        this.f1801d = false;
    }

    public u(byte[] bArr, int i, int i2, boolean z, boolean z2) {
        c.j.b.d.d(bArr, "data");
        this.f1798a = bArr;
        this.f1799b = i;
        this.f1800c = i2;
        this.f1801d = z;
        this.f1802e = z2;
    }

    public final u a() {
        u uVar = this.f;
        if (uVar == this) {
            uVar = null;
        }
        u uVar2 = this.g;
        c.j.b.d.b(uVar2);
        uVar2.f = this.f;
        u uVar3 = this.f;
        c.j.b.d.b(uVar3);
        uVar3.g = this.g;
        this.f = null;
        this.g = null;
        return uVar;
    }

    public final u b(u uVar) {
        c.j.b.d.d(uVar, "segment");
        uVar.g = this;
        uVar.f = this.f;
        u uVar2 = this.f;
        c.j.b.d.b(uVar2);
        uVar2.g = uVar;
        this.f = uVar;
        return uVar;
    }

    public final u c() {
        this.f1801d = true;
        return new u(this.f1798a, this.f1799b, this.f1800c, true, false);
    }

    public final void d(u uVar, int i) {
        c.j.b.d.d(uVar, "sink");
        if (!uVar.f1802e) {
            throw new IllegalStateException("only owner can write".toString());
        }
        int i2 = uVar.f1800c;
        if (i2 + i > 8192) {
            if (uVar.f1801d) {
                throw new IllegalArgumentException();
            }
            int i3 = uVar.f1799b;
            if ((i2 + i) - i3 > 8192) {
                throw new IllegalArgumentException();
            }
            byte[] bArr = uVar.f1798a;
            c.g.e.c(bArr, bArr, 0, i3, i2, 2);
            uVar.f1800c -= uVar.f1799b;
            uVar.f1799b = 0;
        }
        byte[] bArr2 = this.f1798a;
        byte[] bArr3 = uVar.f1798a;
        int i4 = uVar.f1800c;
        int i5 = this.f1799b;
        c.g.e.b(bArr2, bArr3, i4, i5, i5 + i);
        uVar.f1800c += i;
        this.f1799b += i;
    }
}
