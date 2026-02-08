package d.n0.j;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: d */
    public static final String[] f1557d;

    /* renamed from: e */
    public static final e f1558e = new e();

    /* renamed from: a */
    public static final e.h f1554a = e.h.f.b("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");

    /* renamed from: b */
    public static final String[] f1555b = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};

    /* renamed from: c */
    public static final String[] f1556c = new String[64];

    static {
        String[] strArr = new String[256];
        for (int i = 0; i < 256; i++) {
            String binaryString = Integer.toBinaryString(i);
            c.j.b.d.c(binaryString, "Integer.toBinaryString(it)");
            String strK = d.n0.c.k("%8s", binaryString);
            c.j.b.d.d(strK, "$this$replace");
            String strReplace = strK.replace(' ', '0');
            c.j.b.d.c(strReplace, "(this as java.lang.Strin…replace(oldChar, newChar)");
            strArr[i] = strReplace;
        }
        f1557d = strArr;
        String[] strArr2 = f1556c;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        for (int i2 = 0; i2 < 1; i2++) {
            int i3 = iArr[i2];
            String[] strArr3 = f1556c;
            strArr3[i3 | 8] = strArr3[i3] + ((Object) "|PADDED");
        }
        String[] strArr4 = f1556c;
        strArr4[4] = "END_HEADERS";
        strArr4[32] = "PRIORITY";
        strArr4[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i4 = 0; i4 < 3; i4++) {
            int i5 = iArr2[i4];
            for (int i6 = 0; i6 < 1; i6++) {
                int i7 = iArr[i6];
                int i8 = i7 | i5;
                f1556c[i8] = f1556c[i7] + "|" + f1556c[i5];
                StringBuilder sb = new StringBuilder();
                sb.append(f1556c[i7]);
                sb.append("|");
                f1556c[i8 | 8] = b.a.a.a.a.d(sb, f1556c[i5], "|PADDED");
            }
        }
        int length = f1556c.length;
        for (int i9 = 0; i9 < length; i9++) {
            String[] strArr5 = f1556c;
            if (strArr5[i9] == null) {
                strArr5[i9] = f1557d[i9];
            }
        }
    }

    public final String a(int i) {
        String[] strArr = f1555b;
        return i < strArr.length ? strArr[i] : d.n0.c.k("0x%02x", Integer.valueOf(i));
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String b(boolean r10, int r11, int r12, int r13, int r14) {
        /*
            r9 = this;
            java.lang.String r0 = r9.a(r13)
            r1 = 0
            r2 = 5
            r3 = 1
            r4 = 3
            r5 = 2
            r6 = 4
            if (r14 != 0) goto Lf
            java.lang.String r13 = ""
            goto L58
        Lf:
            if (r13 == r5) goto L54
            if (r13 == r4) goto L54
            if (r13 == r6) goto L4a
            r7 = 6
            if (r13 == r7) goto L4a
            r7 = 7
            if (r13 == r7) goto L54
            r7 = 8
            if (r13 == r7) goto L54
            java.lang.String[] r7 = d.n0.j.e.f1556c
            int r8 = r7.length
            if (r14 >= r8) goto L2a
            r7 = r7[r14]
            c.j.b.d.b(r7)
            goto L2e
        L2a:
            java.lang.String[] r7 = d.n0.j.e.f1557d
            r7 = r7[r14]
        L2e:
            if (r13 != r2) goto L39
            r8 = r14 & 4
            if (r8 == 0) goto L39
            java.lang.String r13 = "HEADERS"
            java.lang.String r14 = "PUSH_PROMISE"
            goto L43
        L39:
            if (r13 != 0) goto L48
            r13 = r14 & 32
            if (r13 == 0) goto L48
            java.lang.String r13 = "PRIORITY"
            java.lang.String r14 = "COMPRESSED"
        L43:
            java.lang.String r13 = c.m.e.s(r7, r13, r14, r1, r6)
            goto L58
        L48:
            r13 = r7
            goto L58
        L4a:
            if (r14 != r3) goto L4f
            java.lang.String r13 = "ACK"
            goto L58
        L4f:
            java.lang.String[] r13 = d.n0.j.e.f1557d
            r13 = r13[r14]
            goto L58
        L54:
            java.lang.String[] r13 = d.n0.j.e.f1557d
            r13 = r13[r14]
        L58:
            if (r10 == 0) goto L5d
            java.lang.String r10 = "<<"
            goto L5f
        L5d:
            java.lang.String r10 = ">>"
        L5f:
            java.lang.Object[] r14 = new java.lang.Object[r2]
            r14[r1] = r10
            java.lang.Integer r10 = java.lang.Integer.valueOf(r11)
            r14[r3] = r10
            java.lang.Integer r10 = java.lang.Integer.valueOf(r12)
            r14[r5] = r10
            r14[r4] = r0
            r14[r6] = r13
            java.lang.String r10 = "%s 0x%08x %5d %-13s %s"
            java.lang.String r10 = d.n0.c.k(r10, r14)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: d.n0.j.e.b(boolean, int, int, int, int):java.lang.String");
    }
}
