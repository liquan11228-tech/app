package e;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a */
    public static final byte[] f1748a = h.f.b("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/").f1769d;

    static {
        h.f.b("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_");
    }

    public static String a(byte[] bArr, byte[] bArr2, int i) {
        byte[] bArr3 = (i & 1) != 0 ? f1748a : null;
        c.j.b.d.d(bArr, "$this$encodeBase64");
        c.j.b.d.d(bArr3, "map");
        byte[] bArr4 = new byte[((bArr.length + 2) / 3) * 4];
        int length = bArr.length - (bArr.length % 3);
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            int i4 = i2 + 1;
            byte b2 = bArr[i2];
            int i5 = i4 + 1;
            byte b3 = bArr[i4];
            int i6 = i5 + 1;
            byte b4 = bArr[i5];
            int i7 = i3 + 1;
            bArr4[i3] = bArr3[(b2 & 255) >> 2];
            int i8 = i7 + 1;
            bArr4[i7] = bArr3[((b2 & 3) << 4) | ((b3 & 255) >> 4)];
            int i9 = i8 + 1;
            bArr4[i8] = bArr3[((b3 & 15) << 2) | ((b4 & 255) >> 6)];
            i3 = i9 + 1;
            bArr4[i9] = bArr3[b4 & 63];
            i2 = i6;
        }
        int length2 = bArr.length - length;
        if (length2 == 1) {
            byte b5 = bArr[i2];
            int i10 = i3 + 1;
            bArr4[i3] = bArr3[(b5 & 255) >> 2];
            int i11 = i10 + 1;
            bArr4[i10] = bArr3[(b5 & 3) << 4];
            byte b6 = (byte) 61;
            bArr4[i11] = b6;
            bArr4[i11 + 1] = b6;
        } else if (length2 == 2) {
            int i12 = i2 + 1;
            byte b7 = bArr[i2];
            byte b8 = bArr[i12];
            int i13 = i3 + 1;
            bArr4[i3] = bArr3[(b7 & 255) >> 2];
            int i14 = i13 + 1;
            bArr4[i13] = bArr3[((b7 & 3) << 4) | ((b8 & 255) >> 4)];
            bArr4[i14] = bArr3[(b8 & 15) << 2];
            bArr4[i14 + 1] = (byte) 61;
        }
        c.j.b.d.d(bArr4, "$this$toUtf8String");
        return new String(bArr4, c.m.a.f1303a);
    }
}
