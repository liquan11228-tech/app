package e;

import a.b.k.h;
import java.io.Serializable;
import java.security.MessageDigest;
import java.util.Arrays;

/* loaded from: classes.dex */
public class h implements Serializable, Comparable<h> {

    /* renamed from: b, reason: collision with root package name */
    public transient int f1767b;

    /* renamed from: c, reason: collision with root package name */
    public transient String f1768c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f1769d;
    public static final a f = new a(null);

    /* renamed from: e, reason: collision with root package name */
    public static final h f1766e = new h(new byte[0]);

    public static final class a {
        public a(c.j.b.c cVar) {
        }

        public static h c(a aVar, byte[] bArr, int i, int i2, int i3) {
            if ((i3 & 1) != 0) {
                i = 0;
            }
            if ((i3 & 2) != 0) {
                i2 = bArr.length;
            }
            c.j.b.d.d(bArr, "$this$toByteString");
            h.i.n(bArr.length, i, i2);
            return new h(c.g.e.d(bArr, i, i2 + i));
        }

        public final h a(String str) {
            c.j.b.d.d(str, "$this$decodeHex");
            if (!(str.length() % 2 == 0)) {
                throw new IllegalArgumentException(b.a.a.a.a.b("Unexpected hex string: ", str).toString());
            }
            int length = str.length() / 2;
            byte[] bArr = new byte[length];
            for (int i = 0; i < length; i++) {
                int i2 = i * 2;
                bArr[i] = (byte) (e.b0.b.a(str.charAt(i2 + 1)) + (e.b0.b.a(str.charAt(i2)) << 4));
            }
            return new h(bArr);
        }

        public final h b(String str) {
            c.j.b.d.d(str, "$this$encodeUtf8");
            c.j.b.d.d(str, "$this$asUtf8ToByteArray");
            byte[] bytes = str.getBytes(c.m.a.f1303a);
            c.j.b.d.c(bytes, "(this as java.lang.String).getBytes(charset)");
            h hVar = new h(bytes);
            hVar.f1768c = str;
            return hVar;
        }
    }

    public h(byte[] bArr) {
        c.j.b.d.d(bArr, "data");
        this.f1769d = bArr;
    }

    public String a() {
        return e.a.a(this.f1769d, null, 1);
    }

    public h b(String str) {
        c.j.b.d.d(str, "algorithm");
        byte[] bArrDigest = MessageDigest.getInstance(str).digest(this.f1769d);
        c.j.b.d.c(bArrDigest, "MessageDigest.getInstance(algorithm).digest(data)");
        return new h(bArrDigest);
    }

    public int c() {
        return this.f1769d.length;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002f, code lost:
    
        if (r0 < r1) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0033, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:?, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0029, code lost:
    
        if (r6 < r7) goto L13;
     */
    @Override // java.lang.Comparable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int compareTo(e.h r9) {
        /*
            r8 = this;
            e.h r9 = (e.h) r9
            java.lang.String r0 = "other"
            c.j.b.d.d(r9, r0)
            int r0 = r8.c()
            int r1 = r9.c()
            int r2 = java.lang.Math.min(r0, r1)
            r3 = 0
            r4 = r3
        L15:
            r5 = -1
            if (r4 >= r2) goto L2c
            byte r6 = r8.f(r4)
            r6 = r6 & 255(0xff, float:3.57E-43)
            byte r7 = r9.f(r4)
            r7 = r7 & 255(0xff, float:3.57E-43)
            if (r6 != r7) goto L29
            int r4 = r4 + 1
            goto L15
        L29:
            if (r6 >= r7) goto L33
            goto L31
        L2c:
            if (r0 != r1) goto L2f
            goto L34
        L2f:
            if (r0 >= r1) goto L33
        L31:
            r3 = r5
            goto L34
        L33:
            r3 = 1
        L34:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: e.h.compareTo(java.lang.Object):int");
    }

    public String d() {
        byte[] bArr = this.f1769d;
        char[] cArr = new char[bArr.length * 2];
        int i = 0;
        for (byte b2 : bArr) {
            int i2 = i + 1;
            char[] cArr2 = e.b0.b.f1755a;
            cArr[i] = cArr2[(b2 >> 4) & 15];
            i = i2 + 1;
            cArr[i2] = cArr2[b2 & 15];
        }
        return new String(cArr);
    }

    public byte[] e() {
        return this.f1769d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            int iC = hVar.c();
            byte[] bArr = this.f1769d;
            if (iC == bArr.length && hVar.h(0, bArr, 0, bArr.length)) {
                return true;
            }
        }
        return false;
    }

    public byte f(int i) {
        return this.f1769d[i];
    }

    public boolean g(int i, h hVar, int i2, int i3) {
        c.j.b.d.d(hVar, "other");
        return hVar.h(i2, this.f1769d, i, i3);
    }

    public boolean h(int i, byte[] bArr, int i2, int i3) {
        c.j.b.d.d(bArr, "other");
        if (i >= 0) {
            byte[] bArr2 = this.f1769d;
            if (i <= bArr2.length - i3 && i2 >= 0 && i2 <= bArr.length - i3 && h.i.f(bArr2, i, bArr, i2, i3)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i = this.f1767b;
        if (i != 0) {
            return i;
        }
        int iHashCode = Arrays.hashCode(this.f1769d);
        this.f1767b = iHashCode;
        return iHashCode;
    }

    public h i() {
        byte b2;
        int i = 0;
        while (true) {
            byte[] bArr = this.f1769d;
            if (i >= bArr.length) {
                return this;
            }
            byte b3 = bArr[i];
            byte b4 = (byte) 65;
            if (b3 >= b4 && b3 <= (b2 = (byte) 90)) {
                byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                c.j.b.d.c(bArrCopyOf, "java.util.Arrays.copyOf(this, size)");
                bArrCopyOf[i] = (byte) (b3 + 32);
                for (int i2 = i + 1; i2 < bArrCopyOf.length; i2++) {
                    byte b5 = bArrCopyOf[i2];
                    if (b5 >= b4 && b5 <= b2) {
                        bArrCopyOf[i2] = (byte) (b5 + 32);
                    }
                }
                return new h(bArrCopyOf);
            }
            i++;
        }
    }

    public String j() {
        String str = this.f1768c;
        if (str != null) {
            return str;
        }
        byte[] bArrE = e();
        c.j.b.d.d(bArrE, "$this$toUtf8String");
        String str2 = new String(bArrE, c.m.a.f1303a);
        this.f1768c = str2;
        return str2;
    }

    public void k(e eVar, int i, int i2) {
        c.j.b.d.d(eVar, "buffer");
        c.j.b.d.d(this, "$this$commonWrite");
        c.j.b.d.d(eVar, "buffer");
        eVar.N(this.f1769d, i, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:138:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 700
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e.h.toString():java.lang.String");
    }
}
