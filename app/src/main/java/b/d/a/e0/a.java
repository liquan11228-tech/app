package b.d.a.e0;

import b.d.a.c0.q;
import java.io.Closeable;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;

/* loaded from: classes.dex */
public class a implements Closeable {
    public static final char[] q = ")]}'\n".toCharArray();

    /* renamed from: b, reason: collision with root package name */
    public final Reader f1226b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1227c = false;

    /* renamed from: d, reason: collision with root package name */
    public final char[] f1228d = new char[1024];

    /* renamed from: e, reason: collision with root package name */
    public int f1229e = 0;
    public int f = 0;
    public int g = 0;
    public int h = 0;
    public int i = 0;
    public long j;
    public int k;
    public String l;
    public int[] m;
    public int n;
    public String[] o;
    public int[] p;

    /* renamed from: b.d.a.e0.a$a, reason: collision with other inner class name */
    public class C0028a extends q {
    }

    static {
        q.f1141a = new C0028a();
    }

    public a(Reader reader) {
        int[] iArr = new int[32];
        this.m = iArr;
        this.n = 0;
        this.n = 0 + 1;
        iArr[0] = 6;
        this.o = new String[32];
        this.p = new int[32];
        if (reader == null) {
            throw new NullPointerException("in == null");
        }
        this.f1226b = reader;
    }

    public final void A() throws d {
        if (this.f1227c) {
            return;
        }
        Z("Use JsonReader.setLenient(true) to accept malformed JSON");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:162:0x020a, code lost:
    
        r19 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0210, code lost:
    
        if (H(r6) != false) goto L114;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0174 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x026f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0270  */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int B() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 808
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: b.d.a.e0.a.B():int");
    }

    public void C() throws IOException {
        int iB = this.i;
        if (iB == 0) {
            iB = B();
        }
        if (iB != 4) {
            StringBuilder sbE = b.a.a.a.a.e("Expected END_ARRAY but was ");
            sbE.append(T());
            sbE.append(I());
            throw new IllegalStateException(sbE.toString());
        }
        int i = this.n - 1;
        this.n = i;
        int[] iArr = this.p;
        int i2 = i - 1;
        iArr[i2] = iArr[i2] + 1;
        this.i = 0;
    }

    public void D() throws IOException {
        int iB = this.i;
        if (iB == 0) {
            iB = B();
        }
        if (iB != 2) {
            StringBuilder sbE = b.a.a.a.a.e("Expected END_OBJECT but was ");
            sbE.append(T());
            sbE.append(I());
            throw new IllegalStateException(sbE.toString());
        }
        int i = this.n - 1;
        this.n = i;
        this.o[i] = null;
        int[] iArr = this.p;
        int i2 = i - 1;
        iArr[i2] = iArr[i2] + 1;
        this.i = 0;
    }

    public final boolean E(int i) throws IOException {
        int i2;
        char[] cArr = this.f1228d;
        int i3 = this.h;
        int i4 = this.f1229e;
        this.h = i3 - i4;
        int i5 = this.f;
        if (i5 != i4) {
            int i6 = i5 - i4;
            this.f = i6;
            System.arraycopy(cArr, i4, cArr, 0, i6);
        } else {
            this.f = 0;
        }
        this.f1229e = 0;
        do {
            Reader reader = this.f1226b;
            int i7 = this.f;
            int i8 = reader.read(cArr, i7, cArr.length - i7);
            if (i8 == -1) {
                return false;
            }
            int i9 = this.f + i8;
            this.f = i9;
            if (this.g == 0 && (i2 = this.h) == 0 && i9 > 0 && cArr[0] == 65279) {
                this.f1229e++;
                this.h = i2 + 1;
                i++;
            }
        } while (this.f < i);
        return true;
    }

    public String F() {
        StringBuilder sb = new StringBuilder();
        sb.append('$');
        int i = this.n;
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = this.m[i2];
            if (i3 == 1 || i3 == 2) {
                sb.append('[');
                sb.append(this.p[i2]);
                sb.append(']');
            } else if (i3 == 3 || i3 == 4 || i3 == 5) {
                sb.append('.');
                String[] strArr = this.o;
                if (strArr[i2] != null) {
                    sb.append(strArr[i2]);
                }
            }
        }
        return sb.toString();
    }

    public boolean G() throws IOException {
        int iB = this.i;
        if (iB == 0) {
            iB = B();
        }
        return (iB == 2 || iB == 4) ? false : true;
    }

    public final boolean H(char c2) throws d {
        if (c2 == '\t' || c2 == '\n' || c2 == '\f' || c2 == '\r' || c2 == ' ') {
            return false;
        }
        if (c2 != '#') {
            if (c2 == ',') {
                return false;
            }
            if (c2 != '/' && c2 != '=') {
                if (c2 == '{' || c2 == '}' || c2 == ':') {
                    return false;
                }
                if (c2 != ';') {
                    switch (c2) {
                        case '[':
                        case ']':
                            return false;
                        case '\\':
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        A();
        return false;
    }

    public String I() {
        return " at line " + (this.g + 1) + " column " + ((this.f1229e - this.h) + 1) + " path " + F();
    }

    public boolean J() throws IOException {
        int iB = this.i;
        if (iB == 0) {
            iB = B();
        }
        if (iB == 5) {
            this.i = 0;
            int[] iArr = this.p;
            int i = this.n - 1;
            iArr[i] = iArr[i] + 1;
            return true;
        }
        if (iB != 6) {
            StringBuilder sbE = b.a.a.a.a.e("Expected a boolean but was ");
            sbE.append(T());
            sbE.append(I());
            throw new IllegalStateException(sbE.toString());
        }
        this.i = 0;
        int[] iArr2 = this.p;
        int i2 = this.n - 1;
        iArr2[i2] = iArr2[i2] + 1;
        return false;
    }

    public double K() throws IOException, NumberFormatException {
        String strQ;
        int iB = this.i;
        if (iB == 0) {
            iB = B();
        }
        if (iB == 15) {
            this.i = 0;
            int[] iArr = this.p;
            int i = this.n - 1;
            iArr[i] = iArr[i] + 1;
            return this.j;
        }
        if (iB == 16) {
            this.l = new String(this.f1228d, this.f1229e, this.k);
            this.f1229e += this.k;
        } else {
            if (iB == 8 || iB == 9) {
                strQ = Q(iB == 8 ? '\'' : '\"');
            } else if (iB == 10) {
                strQ = S();
            } else if (iB != 11) {
                StringBuilder sbE = b.a.a.a.a.e("Expected a double but was ");
                sbE.append(T());
                sbE.append(I());
                throw new IllegalStateException(sbE.toString());
            }
            this.l = strQ;
        }
        this.i = 11;
        double d2 = Double.parseDouble(this.l);
        if (!this.f1227c && (Double.isNaN(d2) || Double.isInfinite(d2))) {
            throw new d("JSON forbids NaN and infinities: " + d2 + I());
        }
        this.l = null;
        this.i = 0;
        int[] iArr2 = this.p;
        int i2 = this.n - 1;
        iArr2[i2] = iArr2[i2] + 1;
        return d2;
    }

    public int L() throws IOException, NumberFormatException {
        String strQ;
        int iB = this.i;
        if (iB == 0) {
            iB = B();
        }
        if (iB == 15) {
            long j = this.j;
            int i = (int) j;
            if (j != i) {
                StringBuilder sbE = b.a.a.a.a.e("Expected an int but was ");
                sbE.append(this.j);
                sbE.append(I());
                throw new NumberFormatException(sbE.toString());
            }
            this.i = 0;
            int[] iArr = this.p;
            int i2 = this.n - 1;
            iArr[i2] = iArr[i2] + 1;
            return i;
        }
        if (iB == 16) {
            this.l = new String(this.f1228d, this.f1229e, this.k);
            this.f1229e += this.k;
        } else {
            if (iB != 8 && iB != 9 && iB != 10) {
                StringBuilder sbE2 = b.a.a.a.a.e("Expected an int but was ");
                sbE2.append(T());
                sbE2.append(I());
                throw new IllegalStateException(sbE2.toString());
            }
            if (iB == 10) {
                strQ = S();
            } else {
                strQ = Q(iB == 8 ? '\'' : '\"');
            }
            this.l = strQ;
            try {
                int i3 = Integer.parseInt(this.l);
                this.i = 0;
                int[] iArr2 = this.p;
                int i4 = this.n - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return i3;
            } catch (NumberFormatException unused) {
            }
        }
        this.i = 11;
        double d2 = Double.parseDouble(this.l);
        int i5 = (int) d2;
        if (i5 != d2) {
            StringBuilder sbE3 = b.a.a.a.a.e("Expected an int but was ");
            sbE3.append(this.l);
            sbE3.append(I());
            throw new NumberFormatException(sbE3.toString());
        }
        this.l = null;
        this.i = 0;
        int[] iArr3 = this.p;
        int i6 = this.n - 1;
        iArr3[i6] = iArr3[i6] + 1;
        return i5;
    }

    public long M() throws IOException, NumberFormatException {
        String strQ;
        int iB = this.i;
        if (iB == 0) {
            iB = B();
        }
        if (iB == 15) {
            this.i = 0;
            int[] iArr = this.p;
            int i = this.n - 1;
            iArr[i] = iArr[i] + 1;
            return this.j;
        }
        if (iB == 16) {
            this.l = new String(this.f1228d, this.f1229e, this.k);
            this.f1229e += this.k;
        } else {
            if (iB != 8 && iB != 9 && iB != 10) {
                StringBuilder sbE = b.a.a.a.a.e("Expected a long but was ");
                sbE.append(T());
                sbE.append(I());
                throw new IllegalStateException(sbE.toString());
            }
            if (iB == 10) {
                strQ = S();
            } else {
                strQ = Q(iB == 8 ? '\'' : '\"');
            }
            this.l = strQ;
            try {
                long j = Long.parseLong(this.l);
                this.i = 0;
                int[] iArr2 = this.p;
                int i2 = this.n - 1;
                iArr2[i2] = iArr2[i2] + 1;
                return j;
            } catch (NumberFormatException unused) {
            }
        }
        this.i = 11;
        double d2 = Double.parseDouble(this.l);
        long j2 = (long) d2;
        if (j2 != d2) {
            StringBuilder sbE2 = b.a.a.a.a.e("Expected a long but was ");
            sbE2.append(this.l);
            sbE2.append(I());
            throw new NumberFormatException(sbE2.toString());
        }
        this.l = null;
        this.i = 0;
        int[] iArr3 = this.p;
        int i3 = this.n - 1;
        iArr3[i3] = iArr3[i3] + 1;
        return j2;
    }

    public String N() throws IOException {
        char c2;
        String strQ;
        int iB = this.i;
        if (iB == 0) {
            iB = B();
        }
        if (iB == 14) {
            strQ = S();
        } else {
            if (iB == 12) {
                c2 = '\'';
            } else {
                if (iB != 13) {
                    StringBuilder sbE = b.a.a.a.a.e("Expected a name but was ");
                    sbE.append(T());
                    sbE.append(I());
                    throw new IllegalStateException(sbE.toString());
                }
                c2 = '\"';
            }
            strQ = Q(c2);
        }
        this.i = 0;
        this.o[this.n - 1] = strQ;
        return strQ;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0051, code lost:
    
        if (r1 != '/') goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0053, code lost:
    
        r9.f1229e = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0056, code lost:
    
        if (r4 != r2) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0058, code lost:
    
        r9.f1229e = r4 - 1;
        r2 = E(2);
        r9.f1229e++;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0065, code lost:
    
        if (r2 != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0067, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0068, code lost:
    
        A();
        r2 = r9.f1229e;
        r4 = r0[r2];
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0071, code lost:
    
        if (r4 == '*') goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0073, code lost:
    
        if (r4 == '/') goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0075, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0076, code lost:
    
        r9.f1229e = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x007b, code lost:
    
        r9.f1229e = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x007f, code lost:
    
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0085, code lost:
    
        if ((r9.f1229e + 2) <= r9.f) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x008b, code lost:
    
        if (E(2) == false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x008e, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0090, code lost:
    
        r1 = r9.f1228d;
        r2 = r9.f1229e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0096, code lost:
    
        if (r1[r2] != '\n') goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0098, code lost:
    
        r9.g++;
        r9.h = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00a2, code lost:
    
        if (r4 >= 2) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00b1, code lost:
    
        if (r9.f1228d[r9.f1229e + r4] == "*\/".charAt(r4)) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00b3, code lost:
    
        r9.f1229e++;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00b9, code lost:
    
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00bc, code lost:
    
        if (r3 == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00c3, code lost:
    
        Z("Unterminated comment");
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00c9, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00ca, code lost:
    
        r9.f1229e = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00ce, code lost:
    
        if (r1 != '#') goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00d0, code lost:
    
        A();
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00d8, code lost:
    
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int O(boolean r10) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 220
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: b.d.a.e0.a.O(boolean):int");
    }

    public void P() throws IOException {
        int iB = this.i;
        if (iB == 0) {
            iB = B();
        }
        if (iB != 7) {
            StringBuilder sbE = b.a.a.a.a.e("Expected null but was ");
            sbE.append(T());
            sbE.append(I());
            throw new IllegalStateException(sbE.toString());
        }
        this.i = 0;
        int[] iArr = this.p;
        int i = this.n - 1;
        iArr[i] = iArr[i] + 1;
    }

    public final String Q(char c2) throws d {
        char[] cArr = this.f1228d;
        StringBuilder sb = null;
        while (true) {
            int i = this.f1229e;
            int i2 = this.f;
            while (true) {
                if (i < i2) {
                    int i3 = i + 1;
                    char c3 = cArr[i];
                    if (c3 == c2) {
                        this.f1229e = i3;
                        int i4 = (i3 - i) - 1;
                        if (sb == null) {
                            return new String(cArr, i, i4);
                        }
                        sb.append(cArr, i, i4);
                        return sb.toString();
                    }
                    if (c3 == '\\') {
                        this.f1229e = i3;
                        int i5 = (i3 - i) - 1;
                        if (sb == null) {
                            sb = new StringBuilder(Math.max((i5 + 1) * 2, 16));
                        }
                        sb.append(cArr, i, i5);
                        sb.append(V());
                    } else {
                        if (c3 == '\n') {
                            this.g++;
                            this.h = i3;
                        }
                        i = i3;
                    }
                } else {
                    if (sb == null) {
                        sb = new StringBuilder(Math.max((i - i) * 2, 16));
                    }
                    sb.append(cArr, i, i - i);
                    this.f1229e = i;
                    if (!E(1)) {
                        Z("Unterminated string");
                        throw null;
                    }
                }
            }
        }
    }

    public String R() throws IOException {
        String str;
        char c2;
        int iB = this.i;
        if (iB == 0) {
            iB = B();
        }
        if (iB == 10) {
            str = S();
        } else {
            if (iB == 8) {
                c2 = '\'';
            } else if (iB == 9) {
                c2 = '\"';
            } else if (iB == 11) {
                str = this.l;
                this.l = null;
            } else if (iB == 15) {
                str = Long.toString(this.j);
            } else {
                if (iB != 16) {
                    StringBuilder sbE = b.a.a.a.a.e("Expected a string but was ");
                    sbE.append(T());
                    sbE.append(I());
                    throw new IllegalStateException(sbE.toString());
                }
                str = new String(this.f1228d, this.f1229e, this.k);
                this.f1229e += this.k;
            }
            str = Q(c2);
        }
        this.i = 0;
        int[] iArr = this.p;
        int i = this.n - 1;
        iArr[i] = iArr[i] + 1;
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x004a, code lost:
    
        A();
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:32:0x0044. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String S() throws b.d.a.e0.d {
        /*
            r6 = this;
            r0 = 0
            r1 = 0
        L2:
            r2 = r0
        L3:
            int r3 = r6.f1229e
            int r4 = r3 + r2
            int r5 = r6.f
            if (r4 >= r5) goto L4e
            char[] r4 = r6.f1228d
            int r3 = r3 + r2
            char r3 = r4[r3]
            r4 = 9
            if (r3 == r4) goto L5c
            r4 = 10
            if (r3 == r4) goto L5c
            r4 = 12
            if (r3 == r4) goto L5c
            r4 = 13
            if (r3 == r4) goto L5c
            r4 = 32
            if (r3 == r4) goto L5c
            r4 = 35
            if (r3 == r4) goto L4a
            r4 = 44
            if (r3 == r4) goto L5c
            r4 = 47
            if (r3 == r4) goto L4a
            r4 = 61
            if (r3 == r4) goto L4a
            r4 = 123(0x7b, float:1.72E-43)
            if (r3 == r4) goto L5c
            r4 = 125(0x7d, float:1.75E-43)
            if (r3 == r4) goto L5c
            r4 = 58
            if (r3 == r4) goto L5c
            r4 = 59
            if (r3 == r4) goto L4a
            switch(r3) {
                case 91: goto L5c;
                case 92: goto L4a;
                case 93: goto L5c;
                default: goto L47;
            }
        L47:
            int r2 = r2 + 1
            goto L3
        L4a:
            r6.A()
            goto L5c
        L4e:
            char[] r3 = r6.f1228d
            int r3 = r3.length
            if (r2 >= r3) goto L5e
            int r3 = r2 + 1
            boolean r3 = r6.E(r3)
            if (r3 == 0) goto L5c
            goto L3
        L5c:
            r0 = r2
            goto L7e
        L5e:
            if (r1 != 0) goto L6b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r3 = 16
            int r3 = java.lang.Math.max(r2, r3)
            r1.<init>(r3)
        L6b:
            char[] r3 = r6.f1228d
            int r4 = r6.f1229e
            r1.append(r3, r4, r2)
            int r3 = r6.f1229e
            int r3 = r3 + r2
            r6.f1229e = r3
            r2 = 1
            boolean r2 = r6.E(r2)
            if (r2 != 0) goto L2
        L7e:
            if (r1 != 0) goto L8a
            java.lang.String r1 = new java.lang.String
            char[] r2 = r6.f1228d
            int r3 = r6.f1229e
            r1.<init>(r2, r3, r0)
            goto L95
        L8a:
            char[] r2 = r6.f1228d
            int r3 = r6.f1229e
            r1.append(r2, r3, r0)
            java.lang.String r1 = r1.toString()
        L95:
            int r2 = r6.f1229e
            int r2 = r2 + r0
            r6.f1229e = r2
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: b.d.a.e0.a.S():java.lang.String");
    }

    public b T() throws IOException {
        int iB = this.i;
        if (iB == 0) {
            iB = B();
        }
        switch (iB) {
            case 1:
                return b.BEGIN_OBJECT;
            case 2:
                return b.END_OBJECT;
            case 3:
                return b.BEGIN_ARRAY;
            case 4:
                return b.END_ARRAY;
            case 5:
            case 6:
                return b.BOOLEAN;
            case 7:
                return b.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return b.STRING;
            case 12:
            case 13:
            case 14:
                return b.NAME;
            case 15:
            case 16:
                return b.NUMBER;
            case 17:
                return b.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    public final void U(int i) {
        int i2 = this.n;
        int[] iArr = this.m;
        if (i2 == iArr.length) {
            int i3 = i2 * 2;
            this.m = Arrays.copyOf(iArr, i3);
            this.p = Arrays.copyOf(this.p, i3);
            this.o = (String[]) Arrays.copyOf(this.o, i3);
        }
        int[] iArr2 = this.m;
        int i4 = this.n;
        this.n = i4 + 1;
        iArr2[i4] = i;
    }

    public final char V() throws d {
        int i;
        int i2;
        if (this.f1229e == this.f && !E(1)) {
            Z("Unterminated escape sequence");
            throw null;
        }
        char[] cArr = this.f1228d;
        int i3 = this.f1229e;
        int i4 = i3 + 1;
        this.f1229e = i4;
        char c2 = cArr[i3];
        if (c2 == '\n') {
            this.g++;
            this.h = i4;
        } else if (c2 != '\"' && c2 != '\'' && c2 != '/' && c2 != '\\') {
            if (c2 == 'b') {
                return '\b';
            }
            if (c2 == 'f') {
                return '\f';
            }
            if (c2 == 'n') {
                return '\n';
            }
            if (c2 == 'r') {
                return '\r';
            }
            if (c2 == 't') {
                return '\t';
            }
            if (c2 != 'u') {
                Z("Invalid escape sequence");
                throw null;
            }
            if (i4 + 4 > this.f && !E(4)) {
                Z("Unterminated escape sequence");
                throw null;
            }
            char c3 = 0;
            int i5 = this.f1229e;
            int i6 = i5 + 4;
            while (i5 < i6) {
                char c4 = this.f1228d[i5];
                char c5 = (char) (c3 << 4);
                if (c4 < '0' || c4 > '9') {
                    if (c4 >= 'a' && c4 <= 'f') {
                        i = c4 - 'a';
                    } else {
                        if (c4 < 'A' || c4 > 'F') {
                            StringBuilder sbE = b.a.a.a.a.e("\\u");
                            sbE.append(new String(this.f1228d, this.f1229e, 4));
                            throw new NumberFormatException(sbE.toString());
                        }
                        i = c4 - 'A';
                    }
                    i2 = i + 10;
                } else {
                    i2 = c4 - '0';
                }
                c3 = (char) (i2 + c5);
                i5++;
            }
            this.f1229e += 4;
            return c3;
        }
        return c2;
    }

    public final void W(char c2) throws d {
        char[] cArr = this.f1228d;
        while (true) {
            int i = this.f1229e;
            int i2 = this.f;
            while (true) {
                if (i < i2) {
                    int i3 = i + 1;
                    char c3 = cArr[i];
                    if (c3 == c2) {
                        this.f1229e = i3;
                        return;
                    }
                    if (c3 == '\\') {
                        this.f1229e = i3;
                        V();
                        break;
                    } else {
                        if (c3 == '\n') {
                            this.g++;
                            this.h = i3;
                        }
                        i = i3;
                    }
                } else {
                    this.f1229e = i;
                    if (!E(1)) {
                        Z("Unterminated string");
                        throw null;
                    }
                }
            }
        }
    }

    public final void X() {
        char c2;
        do {
            if (this.f1229e >= this.f && !E(1)) {
                return;
            }
            char[] cArr = this.f1228d;
            int i = this.f1229e;
            int i2 = i + 1;
            this.f1229e = i2;
            c2 = cArr[i];
            if (c2 == '\n') {
                this.g++;
                this.h = i2;
                return;
            }
        } while (c2 != '\r');
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x0099, code lost:
    
        A();
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:61:0x0093. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void Y() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 204
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: b.d.a.e0.a.Y():void");
    }

    public final IOException Z(String str) throws d {
        StringBuilder sbE = b.a.a.a.a.e(str);
        sbE.append(I());
        throw new d(sbE.toString());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.i = 0;
        this.m[0] = 8;
        this.n = 1;
        this.f1226b.close();
    }

    public String toString() {
        return getClass().getSimpleName() + I();
    }

    public void y() throws IOException {
        int iB = this.i;
        if (iB == 0) {
            iB = B();
        }
        if (iB == 3) {
            U(1);
            this.p[this.n - 1] = 0;
            this.i = 0;
        } else {
            StringBuilder sbE = b.a.a.a.a.e("Expected BEGIN_ARRAY but was ");
            sbE.append(T());
            sbE.append(I());
            throw new IllegalStateException(sbE.toString());
        }
    }

    public void z() throws IOException {
        int iB = this.i;
        if (iB == 0) {
            iB = B();
        }
        if (iB == 1) {
            U(3);
            this.i = 0;
        } else {
            StringBuilder sbE = b.a.a.a.a.e("Expected BEGIN_OBJECT but was ");
            sbE.append(T());
            sbE.append(I());
            throw new IllegalStateException(sbE.toString());
        }
    }
}
