package e;

import a.b.k.h;
import java.io.Closeable;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class e implements g, f, Cloneable, ByteChannel {

    /* renamed from: b */
    public u f1760b;

    /* renamed from: c */
    public long f1761c;

    public static final class a implements Closeable {

        /* renamed from: b */
        public e f1762b;

        /* renamed from: c */
        public boolean f1763c;

        /* renamed from: d */
        public u f1764d;
        public byte[] f;

        /* renamed from: e */
        public long f1765e = -1;
        public int g = -1;
        public int h = -1;

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (!(this.f1762b != null)) {
                throw new IllegalStateException("not attached to a buffer".toString());
            }
            this.f1762b = null;
            this.f1764d = null;
            this.f1765e = -1L;
            this.f = null;
            this.g = -1;
            this.h = -1;
        }

        public final long y(long j) {
            e eVar = this.f1762b;
            if (eVar == null) {
                throw new IllegalStateException("not attached to a buffer".toString());
            }
            if (!this.f1763c) {
                throw new IllegalStateException("resizeBuffer() only permitted for read/write buffers".toString());
            }
            long j2 = eVar.f1761c;
            int i = 1;
            if (j <= j2) {
                if (!(j >= 0)) {
                    throw new IllegalArgumentException(("newSize < 0: " + j).toString());
                }
                long j3 = j2 - j;
                while (true) {
                    if (j3 <= 0) {
                        break;
                    }
                    u uVar = eVar.f1760b;
                    c.j.b.d.b(uVar);
                    u uVar2 = uVar.g;
                    c.j.b.d.b(uVar2);
                    int i2 = uVar2.f1800c;
                    long j4 = i2 - uVar2.f1799b;
                    if (j4 > j3) {
                        uVar2.f1800c = i2 - ((int) j3);
                        break;
                    }
                    eVar.f1760b = uVar2.a();
                    v.a(uVar2);
                    j3 -= j4;
                }
                this.f1764d = null;
                this.f1765e = j;
                this.f = null;
                this.g = -1;
                this.h = -1;
            } else if (j > j2) {
                long j5 = j - j2;
                boolean z = true;
                while (j5 > 0) {
                    u uVarK = eVar.K(i);
                    int iMin = (int) Math.min(j5, 8192 - uVarK.f1800c);
                    int i3 = uVarK.f1800c + iMin;
                    uVarK.f1800c = i3;
                    j5 -= iMin;
                    if (z) {
                        this.f1764d = uVarK;
                        this.f1765e = j2;
                        this.f = uVarK.f1798a;
                        this.g = i3 - iMin;
                        this.h = i3;
                        z = false;
                    }
                    i = 1;
                }
            }
            eVar.f1761c = j;
            return j2;
        }

        public final int z(long j) {
            long j2;
            u uVar;
            e eVar = this.f1762b;
            if (eVar == null) {
                throw new IllegalStateException("not attached to a buffer".toString());
            }
            if (j >= -1) {
                long j3 = eVar.f1761c;
                if (j <= j3) {
                    if (j == -1 || j == j3) {
                        this.f1764d = null;
                        this.f1765e = j;
                        this.f = null;
                        this.g = -1;
                        this.h = -1;
                        return -1;
                    }
                    u uVar2 = eVar.f1760b;
                    u uVar3 = this.f1764d;
                    if (uVar3 != null) {
                        long j4 = this.f1765e;
                        int i = this.g;
                        c.j.b.d.b(uVar3);
                        j2 = j4 - (i - uVar3.f1799b);
                        if (j2 > j) {
                            uVar = uVar2;
                            uVar2 = this.f1764d;
                            j3 = j2;
                            j2 = 0;
                        } else {
                            uVar = this.f1764d;
                        }
                    } else {
                        j2 = 0;
                        uVar = uVar2;
                    }
                    if (j3 - j > j - j2) {
                        while (true) {
                            c.j.b.d.b(uVar);
                            int i2 = uVar.f1800c;
                            int i3 = uVar.f1799b;
                            if (j < (i2 - i3) + j2) {
                                break;
                            }
                            j2 += i2 - i3;
                            uVar = uVar.f;
                        }
                    } else {
                        while (j3 > j) {
                            c.j.b.d.b(uVar2);
                            uVar2 = uVar2.g;
                            c.j.b.d.b(uVar2);
                            j3 -= uVar2.f1800c - uVar2.f1799b;
                        }
                        uVar = uVar2;
                        j2 = j3;
                    }
                    if (this.f1763c) {
                        c.j.b.d.b(uVar);
                        if (uVar.f1801d) {
                            byte[] bArr = uVar.f1798a;
                            byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                            c.j.b.d.c(bArrCopyOf, "java.util.Arrays.copyOf(this, size)");
                            u uVar4 = new u(bArrCopyOf, uVar.f1799b, uVar.f1800c, false, true);
                            if (eVar.f1760b == uVar) {
                                eVar.f1760b = uVar4;
                            }
                            uVar.b(uVar4);
                            u uVar5 = uVar4.g;
                            c.j.b.d.b(uVar5);
                            uVar5.a();
                            uVar = uVar4;
                        }
                    }
                    this.f1764d = uVar;
                    this.f1765e = j;
                    c.j.b.d.b(uVar);
                    this.f = uVar.f1798a;
                    int i4 = uVar.f1799b + ((int) (j - j2));
                    this.g = i4;
                    int i5 = uVar.f1800c;
                    this.h = i5;
                    return i5 - i4;
                }
            }
            String str = String.format("offset=%s > size=%s", Arrays.copyOf(new Object[]{Long.valueOf(j), Long.valueOf(eVar.f1761c)}, 2));
            c.j.b.d.c(str, "java.lang.String.format(format, *args)");
            throw new ArrayIndexOutOfBoundsException(str);
        }
    }

    public long A(byte b2, long j, long j2) {
        u uVar;
        long j3 = 0;
        if (!(0 <= j && j2 >= j)) {
            StringBuilder sbE = b.a.a.a.a.e("size=");
            sbE.append(this.f1761c);
            sbE.append(" fromIndex=");
            sbE.append(j);
            sbE.append(" toIndex=");
            sbE.append(j2);
            throw new IllegalArgumentException(sbE.toString().toString());
        }
        long j4 = this.f1761c;
        if (j2 > j4) {
            j2 = j4;
        }
        if (j != j2 && (uVar = this.f1760b) != null) {
            long j5 = this.f1761c;
            if (j5 - j < j) {
                while (j5 > j) {
                    uVar = uVar.g;
                    c.j.b.d.b(uVar);
                    j5 -= uVar.f1800c - uVar.f1799b;
                }
                while (j5 < j2) {
                    byte[] bArr = uVar.f1798a;
                    int iMin = (int) Math.min(uVar.f1800c, (uVar.f1799b + j2) - j5);
                    for (int i = (int) ((uVar.f1799b + j) - j5); i < iMin; i++) {
                        if (bArr[i] == b2) {
                            return (i - uVar.f1799b) + j5;
                        }
                    }
                    j5 += uVar.f1800c - uVar.f1799b;
                    uVar = uVar.f;
                    c.j.b.d.b(uVar);
                    j = j5;
                }
            } else {
                while (true) {
                    long j6 = (uVar.f1800c - uVar.f1799b) + j3;
                    if (j6 > j) {
                        break;
                    }
                    uVar = uVar.f;
                    c.j.b.d.b(uVar);
                    j3 = j6;
                }
                while (j3 < j2) {
                    byte[] bArr2 = uVar.f1798a;
                    int iMin2 = (int) Math.min(uVar.f1800c, (uVar.f1799b + j2) - j3);
                    for (int i2 = (int) ((uVar.f1799b + j) - j3); i2 < iMin2; i2++) {
                        if (bArr2[i2] == b2) {
                            return (i2 - uVar.f1799b) + j3;
                        }
                    }
                    j3 += uVar.f1800c - uVar.f1799b;
                    uVar = uVar.f;
                    c.j.b.d.b(uVar);
                    j = j3;
                }
            }
        }
        return -1L;
    }

    public long B(h hVar) {
        int i;
        c.j.b.d.d(hVar, "targetBytes");
        c.j.b.d.d(hVar, "targetBytes");
        u uVar = this.f1760b;
        if (uVar == null) {
            return -1L;
        }
        long j = this.f1761c;
        long j2 = 0;
        if (j - 0 < 0) {
            while (j > 0) {
                uVar = uVar.g;
                c.j.b.d.b(uVar);
                j -= uVar.f1800c - uVar.f1799b;
            }
            if (hVar.c() == 2) {
                byte bF = hVar.f(0);
                byte bF2 = hVar.f(1);
                while (j < this.f1761c) {
                    byte[] bArr = uVar.f1798a;
                    i = (int) ((uVar.f1799b + j2) - j);
                    int i2 = uVar.f1800c;
                    while (i < i2) {
                        byte b2 = bArr[i];
                        if (b2 != bF && b2 != bF2) {
                            i++;
                        }
                    }
                    j2 = (uVar.f1800c - uVar.f1799b) + j;
                    uVar = uVar.f;
                    c.j.b.d.b(uVar);
                    j = j2;
                }
                return -1L;
            }
            byte[] bArrE = hVar.e();
            while (j < this.f1761c) {
                byte[] bArr2 = uVar.f1798a;
                i = (int) ((uVar.f1799b + j2) - j);
                int i3 = uVar.f1800c;
                while (i < i3) {
                    byte b3 = bArr2[i];
                    for (byte b4 : bArrE) {
                        if (b3 != b4) {
                        }
                    }
                    i++;
                }
                j2 = (uVar.f1800c - uVar.f1799b) + j;
                uVar = uVar.f;
                c.j.b.d.b(uVar);
                j = j2;
            }
            return -1L;
        }
        j = 0;
        while (true) {
            long j3 = (uVar.f1800c - uVar.f1799b) + j;
            if (j3 > 0) {
                break;
            }
            uVar = uVar.f;
            c.j.b.d.b(uVar);
            j = j3;
        }
        if (hVar.c() == 2) {
            byte bF3 = hVar.f(0);
            byte bF4 = hVar.f(1);
            while (j < this.f1761c) {
                byte[] bArr3 = uVar.f1798a;
                i = (int) ((uVar.f1799b + j2) - j);
                int i4 = uVar.f1800c;
                while (i < i4) {
                    byte b5 = bArr3[i];
                    if (b5 != bF3 && b5 != bF4) {
                        i++;
                    }
                }
                j2 = (uVar.f1800c - uVar.f1799b) + j;
                uVar = uVar.f;
                c.j.b.d.b(uVar);
                j = j2;
            }
            return -1L;
        }
        byte[] bArrE2 = hVar.e();
        while (j < this.f1761c) {
            byte[] bArr4 = uVar.f1798a;
            i = (int) ((uVar.f1799b + j2) - j);
            int i5 = uVar.f1800c;
            while (i < i5) {
                byte b6 = bArr4[i];
                for (byte b7 : bArrE2) {
                    if (b6 != b7) {
                    }
                }
                i++;
            }
            j2 = (uVar.f1800c - uVar.f1799b) + j;
            uVar = uVar.f;
            c.j.b.d.b(uVar);
            j = j2;
        }
        return -1L;
        return (i - uVar.f1799b) + j;
    }

    public int C(byte[] bArr, int i, int i2) {
        c.j.b.d.d(bArr, "sink");
        h.i.n(bArr.length, i, i2);
        u uVar = this.f1760b;
        if (uVar == null) {
            return -1;
        }
        int iMin = Math.min(i2, uVar.f1800c - uVar.f1799b);
        byte[] bArr2 = uVar.f1798a;
        int i3 = uVar.f1799b;
        c.g.e.b(bArr2, bArr, i, i3, i3 + iMin);
        int i4 = uVar.f1799b + iMin;
        uVar.f1799b = i4;
        this.f1761c -= iMin;
        if (i4 != uVar.f1800c) {
            return iMin;
        }
        this.f1760b = uVar.a();
        v.a(uVar);
        return iMin;
    }

    public final a D(a aVar) {
        c.j.b.d.d(aVar, "unsafeCursor");
        if (!(aVar.f1762b == null)) {
            throw new IllegalStateException("already attached to a buffer".toString());
        }
        aVar.f1762b = this;
        aVar.f1763c = true;
        return aVar;
    }

    public h E() {
        return m(this.f1761c);
    }

    public short F() {
        int i = readShort() & 65535;
        return (short) (((i & 255) << 8) | ((65280 & i) >>> 8));
    }

    public String G(long j, Charset charset) throws EOFException {
        c.j.b.d.d(charset, "charset");
        if (!(j >= 0 && j <= ((long) Integer.MAX_VALUE))) {
            throw new IllegalArgumentException(("byteCount: " + j).toString());
        }
        if (this.f1761c < j) {
            throw new EOFException();
        }
        if (j == 0) {
            return "";
        }
        u uVar = this.f1760b;
        c.j.b.d.b(uVar);
        int i = uVar.f1799b;
        if (i + j > uVar.f1800c) {
            return new String(t(j), charset);
        }
        int i2 = (int) j;
        String str = new String(uVar.f1798a, i, i2, charset);
        int i3 = uVar.f1799b + i2;
        uVar.f1799b = i3;
        this.f1761c -= j;
        if (i3 == uVar.f1800c) {
            this.f1760b = uVar.a();
            v.a(uVar);
        }
        return str;
    }

    public String H() {
        return G(this.f1761c, c.m.a.f1303a);
    }

    public String I(long j) {
        return G(j, c.m.a.f1303a);
    }

    public final h J(int i) {
        if (i == 0) {
            return h.f1766e;
        }
        h.i.n(this.f1761c, 0L, i);
        u uVar = this.f1760b;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            c.j.b.d.b(uVar);
            int i5 = uVar.f1800c;
            int i6 = uVar.f1799b;
            if (i5 == i6) {
                throw new AssertionError("s.limit == s.pos");
            }
            i3 += i5 - i6;
            i4++;
            uVar = uVar.f;
        }
        byte[][] bArr = new byte[i4][];
        int[] iArr = new int[i4 * 2];
        u uVar2 = this.f1760b;
        int i7 = 0;
        while (i2 < i) {
            c.j.b.d.b(uVar2);
            bArr[i7] = uVar2.f1798a;
            i2 += uVar2.f1800c - uVar2.f1799b;
            iArr[i7] = Math.min(i2, i);
            iArr[i7 + i4] = uVar2.f1799b;
            uVar2.f1801d = true;
            i7++;
            uVar2 = uVar2.f;
        }
        return new w(bArr, iArr);
    }

    public final u K(int i) {
        if (!(i >= 1 && i <= 8192)) {
            throw new IllegalArgumentException("unexpected capacity".toString());
        }
        u uVar = this.f1760b;
        if (uVar == null) {
            u uVarB = v.b();
            this.f1760b = uVarB;
            uVarB.g = uVarB;
            uVarB.f = uVarB;
            return uVarB;
        }
        c.j.b.d.b(uVar);
        u uVar2 = uVar.g;
        c.j.b.d.b(uVar2);
        if (uVar2.f1800c + i <= 8192 && uVar2.f1802e) {
            return uVar2;
        }
        u uVarB2 = v.b();
        uVar2.b(uVarB2);
        return uVarB2;
    }

    public e L(h hVar) {
        c.j.b.d.d(hVar, "byteString");
        hVar.k(this, 0, hVar.c());
        return this;
    }

    public e M(byte[] bArr) {
        c.j.b.d.d(bArr, "source");
        N(bArr, 0, bArr.length);
        return this;
    }

    public e N(byte[] bArr, int i, int i2) {
        c.j.b.d.d(bArr, "source");
        long j = i2;
        h.i.n(bArr.length, i, j);
        int i3 = i2 + i;
        while (i < i3) {
            u uVarK = K(1);
            int iMin = Math.min(i3 - i, 8192 - uVarK.f1800c);
            int i4 = i + iMin;
            c.g.e.b(bArr, uVarK.f1798a, uVarK.f1800c, i, i4);
            uVarK.f1800c += iMin;
            i = i4;
        }
        this.f1761c += j;
        return this;
    }

    public long O(z zVar) {
        c.j.b.d.d(zVar, "source");
        long j = 0;
        while (true) {
            long jL = zVar.l(this, 8192);
            if (jL == -1) {
                return j;
            }
            j += jL;
        }
    }

    public e P(int i) {
        u uVarK = K(1);
        byte[] bArr = uVarK.f1798a;
        int i2 = uVarK.f1800c;
        uVarK.f1800c = i2 + 1;
        bArr[i2] = (byte) i;
        this.f1761c++;
        return this;
    }

    @Override // e.f
    /* renamed from: Q */
    public e j(long j) {
        if (j == 0) {
            P(48);
        } else {
            long j2 = (j >>> 1) | j;
            long j3 = j2 | (j2 >>> 2);
            long j4 = j3 | (j3 >>> 4);
            long j5 = j4 | (j4 >>> 8);
            long j6 = j5 | (j5 >>> 16);
            long j7 = j6 | (j6 >>> 32);
            long j8 = j7 - ((j7 >>> 1) & 6148914691236517205L);
            long j9 = ((j8 >>> 2) & 3689348814741910323L) + (j8 & 3689348814741910323L);
            long j10 = ((j9 >>> 4) + j9) & 1085102592571150095L;
            long j11 = j10 + (j10 >>> 8);
            long j12 = j11 + (j11 >>> 16);
            int i = (int) ((((j12 & 63) + ((j12 >>> 32) & 63)) + 3) / 4);
            u uVarK = K(i);
            byte[] bArr = uVarK.f1798a;
            int i2 = uVarK.f1800c;
            for (int i3 = (i2 + i) - 1; i3 >= i2; i3--) {
                bArr[i3] = e.b0.a.f1754a[(int) (15 & j)];
                j >>>= 4;
            }
            uVarK.f1800c += i;
            this.f1761c += i;
        }
        return this;
    }

    public e R(int i) {
        u uVarK = K(4);
        byte[] bArr = uVarK.f1798a;
        int i2 = uVarK.f1800c;
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((i >>> 24) & 255);
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((i >>> 16) & 255);
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((i >>> 8) & 255);
        bArr[i5] = (byte) (i & 255);
        uVarK.f1800c = i5 + 1;
        this.f1761c += 4;
        return this;
    }

    public e S(int i) {
        u uVarK = K(2);
        byte[] bArr = uVarK.f1798a;
        int i2 = uVarK.f1800c;
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((i >>> 8) & 255);
        bArr[i3] = (byte) (i & 255);
        uVarK.f1800c = i3 + 1;
        this.f1761c += 2;
        return this;
    }

    public e T(String str) {
        c.j.b.d.d(str, "string");
        U(str, 0, str.length());
        return this;
    }

    public e U(String str, int i, int i2) {
        char cCharAt;
        long j;
        long j2;
        c.j.b.d.d(str, "string");
        if (!(i >= 0)) {
            throw new IllegalArgumentException(b.a.a.a.a.a("beginIndex < 0: ", i).toString());
        }
        if (!(i2 >= i)) {
            throw new IllegalArgumentException(("endIndex < beginIndex: " + i2 + " < " + i).toString());
        }
        if (!(i2 <= str.length())) {
            throw new IllegalArgumentException(("endIndex > string.length: " + i2 + " > " + str.length()).toString());
        }
        while (i < i2) {
            char cCharAt2 = str.charAt(i);
            if (cCharAt2 < 128) {
                u uVarK = K(1);
                byte[] bArr = uVarK.f1798a;
                int i3 = uVarK.f1800c - i;
                int iMin = Math.min(i2, 8192 - i3);
                int i4 = i + 1;
                bArr[i + i3] = (byte) cCharAt2;
                while (true) {
                    i = i4;
                    if (i >= iMin || (cCharAt = str.charAt(i)) >= 128) {
                        break;
                    }
                    i4 = i + 1;
                    bArr[i + i3] = (byte) cCharAt;
                }
                int i5 = uVarK.f1800c;
                int i6 = (i3 + i) - i5;
                uVarK.f1800c = i5 + i6;
                this.f1761c += i6;
            } else {
                if (cCharAt2 < 2048) {
                    u uVarK2 = K(2);
                    byte[] bArr2 = uVarK2.f1798a;
                    int i7 = uVarK2.f1800c;
                    bArr2[i7] = (byte) ((cCharAt2 >> 6) | 192);
                    bArr2[i7 + 1] = (byte) ((cCharAt2 & '?') | 128);
                    uVarK2.f1800c = i7 + 2;
                    j = this.f1761c;
                    j2 = 2;
                } else if (cCharAt2 < 55296 || cCharAt2 > 57343) {
                    u uVarK3 = K(3);
                    byte[] bArr3 = uVarK3.f1798a;
                    int i8 = uVarK3.f1800c;
                    bArr3[i8] = (byte) ((cCharAt2 >> '\f') | 224);
                    bArr3[i8 + 1] = (byte) ((63 & (cCharAt2 >> 6)) | 128);
                    bArr3[i8 + 2] = (byte) ((cCharAt2 & '?') | 128);
                    uVarK3.f1800c = i8 + 3;
                    j = this.f1761c;
                    j2 = 3;
                } else {
                    int i9 = i + 1;
                    char cCharAt3 = i9 < i2 ? str.charAt(i9) : (char) 0;
                    if (cCharAt2 > 56319 || 56320 > cCharAt3 || 57343 < cCharAt3) {
                        P(63);
                        i = i9;
                    } else {
                        int i10 = (((cCharAt2 & 1023) << 10) | (cCharAt3 & 1023)) + 65536;
                        u uVarK4 = K(4);
                        byte[] bArr4 = uVarK4.f1798a;
                        int i11 = uVarK4.f1800c;
                        bArr4[i11] = (byte) ((i10 >> 18) | 240);
                        bArr4[i11 + 1] = (byte) (((i10 >> 12) & 63) | 128);
                        bArr4[i11 + 2] = (byte) (((i10 >> 6) & 63) | 128);
                        bArr4[i11 + 3] = (byte) ((i10 & 63) | 128);
                        uVarK4.f1800c = i11 + 4;
                        this.f1761c += 4;
                        i += 2;
                    }
                }
                this.f1761c = j + j2;
                i++;
            }
        }
        return this;
    }

    public e V(int i) {
        String str;
        long j;
        long j2;
        if (i < 128) {
            P(i);
        } else {
            if (i < 2048) {
                u uVarK = K(2);
                byte[] bArr = uVarK.f1798a;
                int i2 = uVarK.f1800c;
                bArr[i2] = (byte) ((i >> 6) | 192);
                bArr[i2 + 1] = (byte) ((i & 63) | 128);
                uVarK.f1800c = i2 + 2;
                j = this.f1761c;
                j2 = 2;
            } else if (55296 <= i && 57343 >= i) {
                P(63);
            } else if (i < 65536) {
                u uVarK2 = K(3);
                byte[] bArr2 = uVarK2.f1798a;
                int i3 = uVarK2.f1800c;
                bArr2[i3] = (byte) ((i >> 12) | 224);
                bArr2[i3 + 1] = (byte) (((i >> 6) & 63) | 128);
                bArr2[i3 + 2] = (byte) ((i & 63) | 128);
                uVarK2.f1800c = i3 + 3;
                j = this.f1761c;
                j2 = 3;
            } else {
                if (i > 1114111) {
                    StringBuilder sbE = b.a.a.a.a.e("Unexpected code point: 0x");
                    if (i != 0) {
                        char[] cArr = e.b0.b.f1755a;
                        int i4 = 0;
                        char[] cArr2 = {cArr[(i >> 28) & 15], cArr[(i >> 24) & 15], cArr[(i >> 20) & 15], cArr[(i >> 16) & 15], cArr[(i >> 12) & 15], cArr[(i >> 8) & 15], cArr[(i >> 4) & 15], cArr[i & 15]};
                        while (i4 < 8 && cArr2[i4] == '0') {
                            i4++;
                        }
                        str = new String(cArr2, i4, 8 - i4);
                    } else {
                        str = "0";
                    }
                    sbE.append(str);
                    throw new IllegalArgumentException(sbE.toString());
                }
                u uVarK3 = K(4);
                byte[] bArr3 = uVarK3.f1798a;
                int i5 = uVarK3.f1800c;
                bArr3[i5] = (byte) ((i >> 18) | 240);
                bArr3[i5 + 1] = (byte) (((i >> 12) & 63) | 128);
                bArr3[i5 + 2] = (byte) (((i >> 6) & 63) | 128);
                bArr3[i5 + 3] = (byte) ((i & 63) | 128);
                uVarK3.f1800c = i5 + 4;
                j = this.f1761c;
                j2 = 4;
            }
            this.f1761c = j + j2;
        }
        return this;
    }

    @Override // e.g, e.f
    public e a() {
        return this;
    }

    @Override // e.z
    public a0 b() {
        return a0.f1749d;
    }

    @Override // e.f
    public /* bridge */ /* synthetic */ f c(byte[] bArr) {
        M(bArr);
        return this;
    }

    public Object clone() {
        e eVar = new e();
        if (this.f1761c != 0) {
            u uVar = this.f1760b;
            c.j.b.d.b(uVar);
            u uVarC = uVar.c();
            eVar.f1760b = uVarC;
            uVarC.g = uVarC;
            uVarC.f = uVarC;
            for (u uVar2 = uVar.f; uVar2 != uVar; uVar2 = uVar2.f) {
                u uVar3 = uVarC.g;
                c.j.b.d.b(uVar3);
                c.j.b.d.b(uVar2);
                uVar3.b(uVar2.c());
            }
            eVar.f1761c = this.f1761c;
        }
        return eVar;
    }

    @Override // e.z, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // e.f
    public /* bridge */ /* synthetic */ f d(int i) {
        R(i);
        return this;
    }

    @Override // e.x
    public void e(e eVar, long j) {
        int i;
        u uVar;
        u uVarB;
        c.j.b.d.d(eVar, "source");
        if (!(eVar != this)) {
            throw new IllegalArgumentException("source == this".toString());
        }
        h.i.n(eVar.f1761c, 0L, j);
        while (j > 0) {
            u uVar2 = eVar.f1760b;
            c.j.b.d.b(uVar2);
            int i2 = uVar2.f1800c;
            c.j.b.d.b(eVar.f1760b);
            if (j < i2 - r3.f1799b) {
                u uVar3 = this.f1760b;
                if (uVar3 != null) {
                    c.j.b.d.b(uVar3);
                    uVar = uVar3.g;
                } else {
                    uVar = null;
                }
                if (uVar != null && uVar.f1802e) {
                    if ((uVar.f1800c + j) - (uVar.f1801d ? 0 : uVar.f1799b) <= 8192) {
                        u uVar4 = eVar.f1760b;
                        c.j.b.d.b(uVar4);
                        uVar4.d(uVar, (int) j);
                        eVar.f1761c -= j;
                        this.f1761c += j;
                        return;
                    }
                }
                u uVar5 = eVar.f1760b;
                c.j.b.d.b(uVar5);
                int i3 = (int) j;
                if (!(i3 > 0 && i3 <= uVar5.f1800c - uVar5.f1799b)) {
                    throw new IllegalArgumentException("byteCount out of range".toString());
                }
                if (i3 >= 1024) {
                    uVarB = uVar5.c();
                } else {
                    uVarB = v.b();
                    byte[] bArr = uVar5.f1798a;
                    byte[] bArr2 = uVarB.f1798a;
                    int i4 = uVar5.f1799b;
                    c.g.e.c(bArr, bArr2, 0, i4, i4 + i3, 2);
                }
                uVarB.f1800c = uVarB.f1799b + i3;
                uVar5.f1799b += i3;
                u uVar6 = uVar5.g;
                c.j.b.d.b(uVar6);
                uVar6.b(uVarB);
                eVar.f1760b = uVarB;
            }
            u uVar7 = eVar.f1760b;
            c.j.b.d.b(uVar7);
            long j2 = uVar7.f1800c - uVar7.f1799b;
            eVar.f1760b = uVar7.a();
            u uVar8 = this.f1760b;
            if (uVar8 == null) {
                this.f1760b = uVar7;
                uVar7.g = uVar7;
                uVar7.f = uVar7;
            } else {
                c.j.b.d.b(uVar8);
                u uVar9 = uVar8.g;
                c.j.b.d.b(uVar9);
                uVar9.b(uVar7);
                if (!(uVar7.g != uVar7)) {
                    throw new IllegalStateException("cannot compact".toString());
                }
                u uVar10 = uVar7.g;
                c.j.b.d.b(uVar10);
                if (uVar10.f1802e) {
                    int i5 = uVar7.f1800c - uVar7.f1799b;
                    u uVar11 = uVar7.g;
                    c.j.b.d.b(uVar11);
                    int i6 = 8192 - uVar11.f1800c;
                    u uVar12 = uVar7.g;
                    c.j.b.d.b(uVar12);
                    if (uVar12.f1801d) {
                        i = 0;
                    } else {
                        u uVar13 = uVar7.g;
                        c.j.b.d.b(uVar13);
                        i = uVar13.f1799b;
                    }
                    if (i5 <= i6 + i) {
                        u uVar14 = uVar7.g;
                        c.j.b.d.b(uVar14);
                        uVar7.d(uVar14, i5);
                        uVar7.a();
                        v.a(uVar7);
                    }
                }
            }
            eVar.f1761c -= j2;
            this.f1761c += j2;
            j -= j2;
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof e)) {
                return false;
            }
            long j = this.f1761c;
            e eVar = (e) obj;
            if (j != eVar.f1761c) {
                return false;
            }
            if (j != 0) {
                u uVar = this.f1760b;
                c.j.b.d.b(uVar);
                u uVar2 = eVar.f1760b;
                c.j.b.d.b(uVar2);
                int i = uVar.f1799b;
                int i2 = uVar2.f1799b;
                long j2 = 0;
                while (j2 < this.f1761c) {
                    long jMin = Math.min(uVar.f1800c - i, uVar2.f1800c - i2);
                    long j3 = 0;
                    while (j3 < jMin) {
                        int i3 = i + 1;
                        int i4 = i2 + 1;
                        if (uVar.f1798a[i] != uVar2.f1798a[i2]) {
                            return false;
                        }
                        j3++;
                        i = i3;
                        i2 = i4;
                    }
                    if (i == uVar.f1800c) {
                        uVar = uVar.f;
                        c.j.b.d.b(uVar);
                        i = uVar.f1799b;
                    }
                    if (i2 == uVar2.f1800c) {
                        uVar2 = uVar2.f;
                        c.j.b.d.b(uVar2);
                        i2 = uVar2.f1799b;
                    }
                    j2 += jMin;
                }
            }
        }
        return true;
    }

    @Override // e.f
    public /* bridge */ /* synthetic */ f f(h hVar) {
        L(hVar);
        return this;
    }

    @Override // e.f, e.x, java.io.Flushable
    public void flush() {
    }

    @Override // e.g
    public void g(e eVar, long j) throws EOFException {
        c.j.b.d.d(eVar, "sink");
        long j2 = this.f1761c;
        if (j2 >= j) {
            eVar.e(this, j);
        } else {
            eVar.e(this, j2);
            throw new EOFException();
        }
    }

    @Override // e.g
    public String h() {
        return o(Long.MAX_VALUE);
    }

    public int hashCode() {
        u uVar = this.f1760b;
        if (uVar == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = uVar.f1800c;
            for (int i3 = uVar.f1799b; i3 < i2; i3++) {
                i = (i * 31) + uVar.f1798a[i3];
            }
            uVar = uVar.f;
            c.j.b.d.b(uVar);
        } while (uVar != this.f1760b);
        return i;
    }

    @Override // e.f
    public f i() {
        return this;
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return true;
    }

    @Override // e.g
    public void k(long j) throws EOFException {
        if (this.f1761c < j) {
            throw new EOFException();
        }
    }

    @Override // e.z
    public long l(e eVar, long j) {
        c.j.b.d.d(eVar, "sink");
        if (!(j >= 0)) {
            throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
        }
        long j2 = this.f1761c;
        if (j2 == 0) {
            return -1L;
        }
        if (j > j2) {
            j = j2;
        }
        eVar.e(this, j);
        return j;
    }

    @Override // e.g
    public h m(long j) throws EOFException {
        if (!(j >= 0 && j <= ((long) Integer.MAX_VALUE))) {
            throw new IllegalArgumentException(("byteCount: " + j).toString());
        }
        if (this.f1761c < j) {
            throw new EOFException();
        }
        if (j < 4096) {
            return new h(t(j));
        }
        h hVarJ = J((int) j);
        p(j);
        return hVarJ;
    }

    @Override // e.f
    public /* bridge */ /* synthetic */ f n(String str) {
        T(str);
        return this;
    }

    @Override // e.g
    public String o(long j) throws EOFException {
        if (!(j >= 0)) {
            throw new IllegalArgumentException(("limit < 0: " + j).toString());
        }
        long j2 = j != Long.MAX_VALUE ? j + 1 : Long.MAX_VALUE;
        byte b2 = (byte) 10;
        long jA = A(b2, 0L, j2);
        if (jA != -1) {
            return e.b0.a.a(this, jA);
        }
        if (j2 < this.f1761c && z(j2 - 1) == ((byte) 13) && z(j2) == b2) {
            return e.b0.a.a(this, j2);
        }
        e eVar = new e();
        y(eVar, 0L, Math.min(32, this.f1761c));
        StringBuilder sbE = b.a.a.a.a.e("\\n not found: limit=");
        sbE.append(Math.min(this.f1761c, j));
        sbE.append(" content=");
        sbE.append(eVar.E().d());
        sbE.append((char) 8230);
        throw new EOFException(sbE.toString());
    }

    @Override // e.g
    public void p(long j) {
        while (j > 0) {
            u uVar = this.f1760b;
            if (uVar == null) {
                throw new EOFException();
            }
            int iMin = (int) Math.min(j, uVar.f1800c - uVar.f1799b);
            long j2 = iMin;
            this.f1761c -= j2;
            j -= j2;
            int i = uVar.f1799b + iMin;
            uVar.f1799b = i;
            if (i == uVar.f1800c) {
                this.f1760b = uVar.a();
                v.a(uVar);
            }
        }
    }

    @Override // e.g
    public boolean q() {
        return this.f1761c == 0;
    }

    @Override // e.f
    public /* bridge */ /* synthetic */ f r(int i) {
        P(i);
        return this;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) {
        c.j.b.d.d(byteBuffer, "sink");
        u uVar = this.f1760b;
        if (uVar == null) {
            return -1;
        }
        int iMin = Math.min(byteBuffer.remaining(), uVar.f1800c - uVar.f1799b);
        byteBuffer.put(uVar.f1798a, uVar.f1799b, iMin);
        int i = uVar.f1799b + iMin;
        uVar.f1799b = i;
        this.f1761c -= iMin;
        if (i == uVar.f1800c) {
            this.f1760b = uVar.a();
            v.a(uVar);
        }
        return iMin;
    }

    @Override // e.g
    public byte readByte() throws EOFException {
        if (this.f1761c == 0) {
            throw new EOFException();
        }
        u uVar = this.f1760b;
        c.j.b.d.b(uVar);
        int i = uVar.f1799b;
        int i2 = uVar.f1800c;
        int i3 = i + 1;
        byte b2 = uVar.f1798a[i];
        this.f1761c--;
        if (i3 == i2) {
            this.f1760b = uVar.a();
            v.a(uVar);
        } else {
            uVar.f1799b = i3;
        }
        return b2;
    }

    @Override // e.g
    public void readFully(byte[] bArr) throws EOFException {
        c.j.b.d.d(bArr, "sink");
        int i = 0;
        while (i < bArr.length) {
            int iC = C(bArr, i, bArr.length - i);
            if (iC == -1) {
                throw new EOFException();
            }
            i += iC;
        }
    }

    @Override // e.g
    public int readInt() throws EOFException {
        if (this.f1761c < 4) {
            throw new EOFException();
        }
        u uVar = this.f1760b;
        c.j.b.d.b(uVar);
        int i = uVar.f1799b;
        int i2 = uVar.f1800c;
        if (i2 - i < 4) {
            return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
        }
        byte[] bArr = uVar.f1798a;
        int i3 = i + 1;
        int i4 = i3 + 1;
        int i5 = ((bArr[i] & 255) << 24) | ((bArr[i3] & 255) << 16);
        int i6 = i4 + 1;
        int i7 = i5 | ((bArr[i4] & 255) << 8);
        int i8 = i6 + 1;
        int i9 = i7 | (bArr[i6] & 255);
        this.f1761c -= 4;
        if (i8 == i2) {
            this.f1760b = uVar.a();
            v.a(uVar);
        } else {
            uVar.f1799b = i8;
        }
        return i9;
    }

    @Override // e.g
    public long readLong() throws EOFException {
        if (this.f1761c < 8) {
            throw new EOFException();
        }
        u uVar = this.f1760b;
        c.j.b.d.b(uVar);
        int i = uVar.f1799b;
        int i2 = uVar.f1800c;
        if (i2 - i < 8) {
            return ((readInt() & 4294967295L) << 32) | (4294967295L & readInt());
        }
        byte[] bArr = uVar.f1798a;
        long j = (bArr[i] & 255) << 56;
        int i3 = i + 1 + 1 + 1;
        long j2 = j | ((bArr[r7] & 255) << 48) | ((bArr[r1] & 255) << 40);
        long j3 = j2 | ((bArr[i3] & 255) << 32) | ((bArr[r1] & 255) << 24);
        long j4 = j3 | ((bArr[r8] & 255) << 16);
        long j5 = j4 | ((bArr[r1] & 255) << 8);
        int i4 = i3 + 1 + 1 + 1 + 1 + 1;
        long j6 = j5 | (bArr[r8] & 255);
        this.f1761c -= 8;
        if (i4 == i2) {
            this.f1760b = uVar.a();
            v.a(uVar);
        } else {
            uVar.f1799b = i4;
        }
        return j6;
    }

    @Override // e.g
    public short readShort() throws EOFException {
        if (this.f1761c < 2) {
            throw new EOFException();
        }
        u uVar = this.f1760b;
        c.j.b.d.b(uVar);
        int i = uVar.f1799b;
        int i2 = uVar.f1800c;
        if (i2 - i < 2) {
            return (short) (((readByte() & 255) << 8) | (readByte() & 255));
        }
        byte[] bArr = uVar.f1798a;
        int i3 = i + 1;
        int i4 = i3 + 1;
        int i5 = ((bArr[i] & 255) << 8) | (bArr[i3] & 255);
        this.f1761c -= 2;
        if (i4 == i2) {
            this.f1760b = uVar.a();
            v.a(uVar);
        } else {
            uVar.f1799b = i4;
        }
        return (short) i5;
    }

    @Override // e.f
    public f s() {
        return this;
    }

    @Override // e.g
    public byte[] t(long j) throws EOFException {
        if (!(j >= 0 && j <= ((long) Integer.MAX_VALUE))) {
            throw new IllegalArgumentException(("byteCount: " + j).toString());
        }
        if (this.f1761c < j) {
            throw new EOFException();
        }
        byte[] bArr = new byte[(int) j];
        readFully(bArr);
        return bArr;
    }

    public String toString() {
        if (this.f1761c <= ((long) Integer.MAX_VALUE)) {
            return J((int) this.f1761c).toString();
        }
        StringBuilder sbE = b.a.a.a.a.e("size > Int.MAX_VALUE: ");
        sbE.append(this.f1761c);
        throw new IllegalStateException(sbE.toString().toString());
    }

    @Override // e.f
    public /* bridge */ /* synthetic */ f u(int i) {
        S(i);
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:83:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00b8 A[EDGE_INSN: B:94:0x00b8->B:88:0x00b8 BREAK  A[LOOP:0: B:55:0x000c->B:96:?], SYNTHETIC] */
    @Override // e.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long v() throws java.io.EOFException {
        /*
            Method dump skipped, instructions count: 197
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e.e.v():long");
    }

    @Override // e.g
    public String w(Charset charset) {
        c.j.b.d.d(charset, "charset");
        return G(this.f1761c, charset);
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) {
        c.j.b.d.d(byteBuffer, "source");
        int iRemaining = byteBuffer.remaining();
        int i = iRemaining;
        while (i > 0) {
            u uVarK = K(1);
            int iMin = Math.min(i, 8192 - uVarK.f1800c);
            byteBuffer.get(uVarK.f1798a, uVarK.f1800c, iMin);
            i -= iMin;
            uVarK.f1800c += iMin;
        }
        this.f1761c += iRemaining;
        return iRemaining;
    }

    @Override // e.g
    public int x(q qVar) {
        c.j.b.d.d(qVar, "options");
        int iB = e.b0.a.b(this, qVar, false);
        if (iB == -1) {
            return -1;
        }
        p(qVar.f1788b[iB].c());
        return iB;
    }

    public final e y(e eVar, long j, long j2) {
        c.j.b.d.d(eVar, "out");
        h.i.n(this.f1761c, j, j2);
        if (j2 != 0) {
            eVar.f1761c += j2;
            u uVar = this.f1760b;
            while (true) {
                c.j.b.d.b(uVar);
                int i = uVar.f1800c;
                int i2 = uVar.f1799b;
                if (j < i - i2) {
                    break;
                }
                j -= i - i2;
                uVar = uVar.f;
            }
            while (j2 > 0) {
                c.j.b.d.b(uVar);
                u uVarC = uVar.c();
                int i3 = uVarC.f1799b + ((int) j);
                uVarC.f1799b = i3;
                uVarC.f1800c = Math.min(i3 + ((int) j2), uVarC.f1800c);
                u uVar2 = eVar.f1760b;
                if (uVar2 == null) {
                    uVarC.g = uVarC;
                    uVarC.f = uVarC;
                    eVar.f1760b = uVarC;
                } else {
                    c.j.b.d.b(uVar2);
                    u uVar3 = uVar2.g;
                    c.j.b.d.b(uVar3);
                    uVar3.b(uVarC);
                }
                j2 -= uVarC.f1800c - uVarC.f1799b;
                uVar = uVar.f;
                j = 0;
            }
        }
        return this;
    }

    public final byte z(long j) {
        h.i.n(this.f1761c, j, 1L);
        u uVar = this.f1760b;
        if (uVar == null) {
            u uVar2 = null;
            c.j.b.d.b(null);
            return uVar2.f1798a[(int) ((uVar2.f1799b + j) - (-1))];
        }
        long j2 = this.f1761c;
        if (j2 - j < j) {
            while (j2 > j) {
                uVar = uVar.g;
                c.j.b.d.b(uVar);
                j2 -= uVar.f1800c - uVar.f1799b;
            }
            c.j.b.d.b(uVar);
            return uVar.f1798a[(int) ((uVar.f1799b + j) - j2)];
        }
        long j3 = 0;
        while (true) {
            long j4 = (uVar.f1800c - uVar.f1799b) + j3;
            if (j4 > j) {
                c.j.b.d.b(uVar);
                return uVar.f1798a[(int) ((uVar.f1799b + j) - j3)];
            }
            uVar = uVar.f;
            c.j.b.d.b(uVar);
            j3 = j4;
        }
    }
}
