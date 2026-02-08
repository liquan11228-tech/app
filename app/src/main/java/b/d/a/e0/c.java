package b.d.a.e0;

import a.f.c.k;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.util.Arrays;

/* loaded from: classes.dex */
public class c implements Closeable, Flushable {
    public static final String[] k = new String[128];
    public static final String[] l;

    /* renamed from: b, reason: collision with root package name */
    public final Writer f1234b;

    /* renamed from: c, reason: collision with root package name */
    public int[] f1235c = new int[32];

    /* renamed from: d, reason: collision with root package name */
    public int f1236d = 0;

    /* renamed from: e, reason: collision with root package name */
    public String f1237e;
    public String f;
    public boolean g;
    public boolean h;
    public String i;
    public boolean j;

    static {
        for (int i = 0; i <= 31; i++) {
            k[i] = String.format("\\u%04x", Integer.valueOf(i));
        }
        String[] strArr = k;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        l = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public c(Writer writer) {
        I(6);
        this.f = ":";
        this.j = true;
        if (writer == null) {
            throw new NullPointerException("out == null");
        }
        this.f1234b = writer;
    }

    public c A() throws IOException {
        Q();
        y();
        I(3);
        this.f1234b.write(k.AppCompatTheme_windowMinWidthMinor);
        return this;
    }

    public final c B(int i, int i2, char c2) throws IOException {
        int iH = H();
        if (iH != i2 && iH != i) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.i != null) {
            StringBuilder sbE = b.a.a.a.a.e("Dangling name: ");
            sbE.append(this.i);
            throw new IllegalStateException(sbE.toString());
        }
        this.f1236d--;
        if (iH == i2) {
            F();
        }
        this.f1234b.write(c2);
        return this;
    }

    public c C() throws IOException {
        B(1, 2, ']');
        return this;
    }

    public c D() throws IOException {
        B(3, 5, '}');
        return this;
    }

    public c E(String str) {
        if (str == null) {
            throw new NullPointerException("name == null");
        }
        if (this.i != null) {
            throw new IllegalStateException();
        }
        if (this.f1236d == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.i = str;
        return this;
    }

    public final void F() throws IOException {
        if (this.f1237e == null) {
            return;
        }
        this.f1234b.write(10);
        int i = this.f1236d;
        for (int i2 = 1; i2 < i; i2++) {
            this.f1234b.write(this.f1237e);
        }
    }

    public c G() throws IOException {
        if (this.i != null) {
            if (!this.j) {
                this.i = null;
                return this;
            }
            Q();
        }
        y();
        this.f1234b.write("null");
        return this;
    }

    public final int H() {
        int i = this.f1236d;
        if (i != 0) {
            return this.f1235c[i - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    public final void I(int i) {
        int i2 = this.f1236d;
        int[] iArr = this.f1235c;
        if (i2 == iArr.length) {
            this.f1235c = Arrays.copyOf(iArr, i2 * 2);
        }
        int[] iArr2 = this.f1235c;
        int i3 = this.f1236d;
        this.f1236d = i3 + 1;
        iArr2[i3] = i;
    }

    public final void J(int i) {
        this.f1235c[this.f1236d - 1] = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void K(java.lang.String r9) throws java.io.IOException {
        /*
            r8 = this;
            boolean r0 = r8.h
            if (r0 == 0) goto L7
            java.lang.String[] r0 = b.d.a.e0.c.l
            goto L9
        L7:
            java.lang.String[] r0 = b.d.a.e0.c.k
        L9:
            java.io.Writer r1 = r8.f1234b
            r2 = 34
            r1.write(r2)
            int r1 = r9.length()
            r3 = 0
            r4 = r3
        L16:
            if (r3 >= r1) goto L45
            char r5 = r9.charAt(r3)
            r6 = 128(0x80, float:1.8E-43)
            if (r5 >= r6) goto L25
            r5 = r0[r5]
            if (r5 != 0) goto L32
            goto L42
        L25:
            r6 = 8232(0x2028, float:1.1535E-41)
            if (r5 != r6) goto L2c
            java.lang.String r5 = "\\u2028"
            goto L32
        L2c:
            r6 = 8233(0x2029, float:1.1537E-41)
            if (r5 != r6) goto L42
            java.lang.String r5 = "\\u2029"
        L32:
            if (r4 >= r3) goto L3b
            java.io.Writer r6 = r8.f1234b
            int r7 = r3 - r4
            r6.write(r9, r4, r7)
        L3b:
            java.io.Writer r4 = r8.f1234b
            r4.write(r5)
            int r4 = r3 + 1
        L42:
            int r3 = r3 + 1
            goto L16
        L45:
            if (r4 >= r1) goto L4d
            java.io.Writer r0 = r8.f1234b
            int r1 = r1 - r4
            r0.write(r9, r4, r1)
        L4d:
            java.io.Writer r9 = r8.f1234b
            r9.write(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b.d.a.e0.c.K(java.lang.String):void");
    }

    public c L(long j) throws IOException {
        Q();
        y();
        this.f1234b.write(Long.toString(j));
        return this;
    }

    public c M(Boolean bool) throws IOException {
        if (bool == null) {
            return G();
        }
        Q();
        y();
        this.f1234b.write(bool.booleanValue() ? "true" : "false");
        return this;
    }

    public c N(Number number) throws IOException {
        if (number == null) {
            return G();
        }
        Q();
        String string = number.toString();
        if (this.g || !(string.equals("-Infinity") || string.equals("Infinity") || string.equals("NaN"))) {
            y();
            this.f1234b.append((CharSequence) string);
            return this;
        }
        throw new IllegalArgumentException("Numeric values must be finite, but was " + number);
    }

    public c O(String str) throws IOException {
        if (str == null) {
            return G();
        }
        Q();
        y();
        K(str);
        return this;
    }

    public c P(boolean z) throws IOException {
        Q();
        y();
        this.f1234b.write(z ? "true" : "false");
        return this;
    }

    public final void Q() throws IOException {
        if (this.i != null) {
            int iH = H();
            if (iH == 5) {
                this.f1234b.write(44);
            } else if (iH != 3) {
                throw new IllegalStateException("Nesting problem.");
            }
            F();
            J(4);
            K(this.i);
            this.i = null;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f1234b.close();
        int i = this.f1236d;
        if (i > 1 || (i == 1 && this.f1235c[i - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f1236d = 0;
    }

    public void flush() throws IOException {
        if (this.f1236d == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f1234b.flush();
    }

    public final void y() throws IOException {
        int iH = H();
        if (iH == 1) {
            J(2);
        } else {
            if (iH != 2) {
                if (iH == 4) {
                    this.f1234b.append((CharSequence) this.f);
                    J(5);
                    return;
                }
                if (iH != 6) {
                    if (iH != 7) {
                        throw new IllegalStateException("Nesting problem.");
                    }
                    if (!this.g) {
                        throw new IllegalStateException("JSON must have only one top-level value.");
                    }
                }
                J(7);
                return;
            }
            this.f1234b.append(',');
        }
        F();
    }

    public c z() throws IOException {
        Q();
        y();
        I(1);
        this.f1234b.write(91);
        return this;
    }
}
