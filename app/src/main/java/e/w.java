package e;

import a.b.k.h;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes.dex */
public final class w extends h {
    public final transient byte[][] g;
    public final transient int[] h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(byte[][] bArr, int[] iArr) {
        super(h.f1766e.f1769d);
        c.j.b.d.d(bArr, "segments");
        c.j.b.d.d(iArr, "directory");
        this.g = bArr;
        this.h = iArr;
    }

    @Override // e.h
    public String a() {
        return m().a();
    }

    @Override // e.h
    public h b(String str) throws NoSuchAlgorithmException {
        c.j.b.d.d(str, "algorithm");
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        int length = this.g.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int[] iArr = this.h;
            int i3 = iArr[length + i];
            int i4 = iArr[i];
            messageDigest.update(this.g[i], i3, i4 - i2);
            i++;
            i2 = i4;
        }
        byte[] bArrDigest = messageDigest.digest();
        c.j.b.d.c(bArrDigest, "digest.digest()");
        return new h(bArrDigest);
    }

    @Override // e.h
    public int c() {
        return this.h[this.g.length - 1];
    }

    @Override // e.h
    public String d() {
        return m().d();
    }

    @Override // e.h
    public byte[] e() {
        return l();
    }

    @Override // e.h
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (hVar.c() == c() && g(0, hVar, 0, c())) {
                return true;
            }
        }
        return false;
    }

    @Override // e.h
    public byte f(int i) {
        h.i.n(this.h[this.g.length - 1], i, 1L);
        int iQ = h.i.Q(this, i);
        int i2 = iQ == 0 ? 0 : this.h[iQ - 1];
        int[] iArr = this.h;
        byte[][] bArr = this.g;
        return bArr[iQ][(i - i2) + iArr[bArr.length + iQ]];
    }

    @Override // e.h
    public boolean g(int i, h hVar, int i2, int i3) {
        c.j.b.d.d(hVar, "other");
        if (i < 0 || i > c() - i3) {
            return false;
        }
        int i4 = i3 + i;
        int iQ = h.i.Q(this, i);
        while (i < i4) {
            int i5 = iQ == 0 ? 0 : this.h[iQ - 1];
            int[] iArr = this.h;
            int i6 = iArr[iQ] - i5;
            int i7 = iArr[this.g.length + iQ];
            int iMin = Math.min(i4, i6 + i5) - i;
            if (!hVar.h(i2, this.g[iQ], (i - i5) + i7, iMin)) {
                return false;
            }
            i2 += iMin;
            i += iMin;
            iQ++;
        }
        return true;
    }

    @Override // e.h
    public boolean h(int i, byte[] bArr, int i2, int i3) {
        c.j.b.d.d(bArr, "other");
        if (i < 0 || i > c() - i3 || i2 < 0 || i2 > bArr.length - i3) {
            return false;
        }
        int i4 = i3 + i;
        int iQ = h.i.Q(this, i);
        while (i < i4) {
            int i5 = iQ == 0 ? 0 : this.h[iQ - 1];
            int[] iArr = this.h;
            int i6 = iArr[iQ] - i5;
            int i7 = iArr[this.g.length + iQ];
            int iMin = Math.min(i4, i6 + i5) - i;
            if (!h.i.f(this.g[iQ], (i - i5) + i7, bArr, i2, iMin)) {
                return false;
            }
            i2 += iMin;
            i += iMin;
            iQ++;
        }
        return true;
    }

    @Override // e.h
    public int hashCode() {
        int i = this.f1767b;
        if (i != 0) {
            return i;
        }
        int length = this.g.length;
        int i2 = 0;
        int i3 = 1;
        int i4 = 0;
        while (i2 < length) {
            int[] iArr = this.h;
            int i5 = iArr[length + i2];
            int i6 = iArr[i2];
            byte[] bArr = this.g[i2];
            int i7 = (i6 - i4) + i5;
            while (i5 < i7) {
                i3 = (i3 * 31) + bArr[i5];
                i5++;
            }
            i2++;
            i4 = i6;
        }
        this.f1767b = i3;
        return i3;
    }

    @Override // e.h
    public h i() {
        return m().i();
    }

    @Override // e.h
    public void k(e eVar, int i, int i2) {
        c.j.b.d.d(eVar, "buffer");
        int i3 = i2 + i;
        int iQ = h.i.Q(this, i);
        while (i < i3) {
            int i4 = iQ == 0 ? 0 : this.h[iQ - 1];
            int[] iArr = this.h;
            int i5 = iArr[iQ] - i4;
            int i6 = iArr[this.g.length + iQ];
            int iMin = Math.min(i3, i5 + i4) - i;
            int i7 = (i - i4) + i6;
            u uVar = new u(this.g[iQ], i7, i7 + iMin, true, false);
            u uVar2 = eVar.f1760b;
            if (uVar2 == null) {
                uVar.g = uVar;
                uVar.f = uVar;
                eVar.f1760b = uVar;
            } else {
                c.j.b.d.b(uVar2);
                u uVar3 = uVar2.g;
                c.j.b.d.b(uVar3);
                uVar3.b(uVar);
            }
            i += iMin;
            iQ++;
        }
        eVar.f1761c += c();
    }

    public byte[] l() {
        byte[] bArr = new byte[c()];
        int length = this.g.length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < length) {
            int[] iArr = this.h;
            int i4 = iArr[length + i];
            int i5 = iArr[i];
            int i6 = i5 - i2;
            c.g.e.b(this.g[i], bArr, i3, i4, i4 + i6);
            i3 += i6;
            i++;
            i2 = i5;
        }
        return bArr;
    }

    public final h m() {
        return new h(l());
    }

    @Override // e.h
    public String toString() {
        return m().toString();
    }
}
