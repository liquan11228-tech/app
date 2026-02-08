package d.n0.n;

import e.e;

/* loaded from: classes.dex */
public final class g {
    public static final String a(int i) {
        StringBuilder sb;
        if (i < 1000 || i >= 5000) {
            sb = new StringBuilder();
            sb.append("Code must be in range [1000,5000): ");
            sb.append(i);
        } else {
            if ((1004 > i || 1006 < i) && (1015 > i || 2999 < i)) {
                return null;
            }
            sb = new StringBuilder();
            sb.append("Code ");
            sb.append(i);
            sb.append(" is reserved and may not be used.");
        }
        return sb.toString();
    }

    public static final void b(e.a aVar, byte[] bArr) {
        long j;
        c.j.b.d.d(aVar, "cursor");
        c.j.b.d.d(bArr, "key");
        int length = bArr.length;
        int i = 0;
        do {
            byte[] bArr2 = aVar.f;
            int i2 = aVar.g;
            int i3 = aVar.h;
            if (bArr2 != null) {
                while (i2 < i3) {
                    int i4 = i % length;
                    bArr2[i2] = (byte) (bArr2[i2] ^ bArr[i4]);
                    i2++;
                    i = i4 + 1;
                }
            }
            long j2 = aVar.f1765e;
            e.e eVar = aVar.f1762b;
            c.j.b.d.b(eVar);
            if (!(j2 != eVar.f1761c)) {
                throw new IllegalStateException("no more bytes".toString());
            }
            j = aVar.f1765e;
        } while (aVar.z(j == -1 ? 0L : j + (aVar.h - aVar.g)) != -1);
    }

    public static final void c(int i) {
        String strA = a(i);
        if (strA == null) {
            return;
        }
        c.j.b.d.b(strA);
        throw new IllegalArgumentException(strA.toString());
    }
}
