package d;

import a.b.k.h;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class z {

    /* renamed from: a */
    public final boolean f1738a;

    /* renamed from: b */
    public final String f1739b;

    /* renamed from: c */
    public final String f1740c;

    /* renamed from: d */
    public final String f1741d;

    /* renamed from: e */
    public final String f1742e;
    public final int f;
    public final List<String> g;
    public final String h;
    public final String i;
    public static final b k = new b(null);
    public static final char[] j = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    public static final class a {
        public static final C0039a i = new C0039a(null);

        /* renamed from: a */
        public String f1743a;

        /* renamed from: d */
        public String f1746d;
        public final List<String> f;
        public List<String> g;
        public String h;

        /* renamed from: b */
        public String f1744b = "";

        /* renamed from: c */
        public String f1745c = "";

        /* renamed from: e */
        public int f1747e = -1;

        /* renamed from: d.z$a$a */
        public static final class C0039a {
            public C0039a(c.j.b.c cVar) {
            }
        }

        public a() {
            ArrayList arrayList = new ArrayList();
            this.f = arrayList;
            arrayList.add("");
        }

        public final z a() {
            ArrayList arrayList;
            String str = this.f1743a;
            if (str == null) {
                throw new IllegalStateException("scheme == null");
            }
            String strC = b.c(z.k, this.f1744b, 0, 0, false, 7);
            String strC2 = b.c(z.k, this.f1745c, 0, 0, false, 7);
            String str2 = this.f1746d;
            if (str2 == null) {
                throw new IllegalStateException("host == null");
            }
            int iB = b();
            List<String> list = this.f;
            ArrayList arrayList2 = new ArrayList(h.i.r(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(b.c(z.k, (String) it.next(), 0, 0, false, 7));
            }
            List<String> list2 = this.g;
            if (list2 != null) {
                ArrayList arrayList3 = new ArrayList(h.i.r(list2, 10));
                for (String str3 : list2) {
                    arrayList3.add(str3 != null ? b.c(z.k, str3, 0, 0, true, 3) : null);
                }
                arrayList = arrayList3;
            } else {
                arrayList = null;
            }
            String str4 = this.h;
            return new z(str, strC, strC2, str2, iB, arrayList2, arrayList, str4 != null ? b.c(z.k, str4, 0, 0, false, 7) : null, toString());
        }

        public final int b() {
            int i2 = this.f1747e;
            if (i2 != -1) {
                return i2;
            }
            String str = this.f1743a;
            c.j.b.d.b(str);
            c.j.b.d.d(str, "scheme");
            int iHashCode = str.hashCode();
            if (iHashCode != 3213448) {
                if (iHashCode == 99617003 && str.equals("https")) {
                    return 443;
                }
            } else if (str.equals("http")) {
                return 80;
            }
            return -1;
        }

        public final a c(String str) {
            String strSubstring;
            ArrayList arrayList = null;
            if (str != null) {
                String strA = b.a(z.k, str, 0, 0, " \"'<>#", true, false, true, false, null, 211);
                c.j.b.d.d(strA, "$this$toQueryNamesAndValues");
                ArrayList arrayList2 = new ArrayList();
                int i2 = 0;
                while (i2 <= strA.length()) {
                    int iJ = c.m.e.j(strA, '&', i2, false, 4);
                    if (iJ == -1) {
                        iJ = strA.length();
                    }
                    int iJ2 = c.m.e.j(strA, '=', i2, false, 4);
                    if (iJ2 == -1 || iJ2 > iJ) {
                        String strSubstring2 = strA.substring(i2, iJ);
                        c.j.b.d.c(strSubstring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                        arrayList2.add(strSubstring2);
                        strSubstring = null;
                    } else {
                        String strSubstring3 = strA.substring(i2, iJ2);
                        c.j.b.d.c(strSubstring3, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                        arrayList2.add(strSubstring3);
                        strSubstring = strA.substring(iJ2 + 1, iJ);
                        c.j.b.d.c(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    }
                    arrayList2.add(strSubstring);
                    i2 = iJ + 1;
                }
                arrayList = arrayList2;
            }
            this.g = arrayList;
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:306:0x007d  */
        /* JADX WARN: Removed duplicated region for block: B:410:0x0305  */
        /* JADX WARN: Removed duplicated region for block: B:444:0x03ba  */
        /* JADX WARN: Removed duplicated region for block: B:445:0x03be  */
        /* JADX WARN: Removed duplicated region for block: B:478:0x0458 A[LOOP:3: B:430:0x0368->B:478:0x0458, LOOP_END] */
        /* JADX WARN: Type inference failed for: r7v0 */
        /* JADX WARN: Type inference failed for: r7v16, types: [int] */
        /* JADX WARN: Type inference failed for: r7v17 */
        /* JADX WARN: Type inference failed for: r7v21, types: [boolean, int] */
        /* JADX WARN: Type inference failed for: r7v24 */
        /* JADX WARN: Type inference failed for: r7v25 */
        /* JADX WARN: Type inference failed for: r7v6 */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final d.z.a d(d.z r31, java.lang.String r32) throws java.lang.NumberFormatException {
            /*
                Method dump skipped, instructions count: 1259
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: d.z.a.d(d.z, java.lang.String):d.z$a");
        }

        /* JADX WARN: Removed duplicated region for block: B:123:0x00b2  */
        /* JADX WARN: Removed duplicated region for block: B:92:0x0032  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.String toString() {
            /*
                Method dump skipped, instructions count: 329
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: d.z.a.toString():java.lang.String");
        }
    }

    public static final class b {
        public b(c.j.b.c cVar) {
        }

        public static String a(b bVar, String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset, int i3) {
            boolean z5;
            int i4 = (i3 & 1) != 0 ? 0 : i;
            int length = (i3 & 2) != 0 ? str.length() : i2;
            boolean z6 = (i3 & 8) != 0 ? false : z;
            boolean z7 = (i3 & 16) != 0 ? false : z2;
            boolean z8 = (i3 & 32) != 0 ? false : z3;
            boolean z9 = (i3 & 64) != 0 ? false : z4;
            Charset charset2 = (i3 & 128) != 0 ? null : charset;
            c.j.b.d.d(str, "$this$canonicalize");
            c.j.b.d.d(str2, "encodeSet");
            int iCharCount = i4;
            while (iCharCount < length) {
                int iCodePointAt = str.codePointAt(iCharCount);
                int i5 = 2;
                if (iCodePointAt < 32 || iCodePointAt == 127 || ((iCodePointAt >= 128 && !z9) || c.m.e.a(str2, (char) iCodePointAt, false, 2) || ((iCodePointAt == 37 && (!z6 || (z7 && !bVar.b(str, iCharCount, length)))) || (iCodePointAt == 43 && z8)))) {
                    e.e eVar = new e.e();
                    eVar.U(str, i4, iCharCount);
                    e.e eVar2 = null;
                    while (iCharCount < length) {
                        int iCodePointAt2 = str.codePointAt(iCharCount);
                        if (z6 && (iCodePointAt2 == 9 || iCodePointAt2 == 10 || iCodePointAt2 == 12 || iCodePointAt2 == 13)) {
                            z5 = z8;
                        } else if (iCodePointAt2 == 43 && z8) {
                            eVar.T(z6 ? "+" : "%2B");
                            z5 = z8;
                        } else {
                            if (iCodePointAt2 < 32 || iCodePointAt2 == 127 || (iCodePointAt2 >= 128 && !z9)) {
                                z5 = z8;
                            } else {
                                z5 = z8;
                                if (!c.m.e.a(str2, (char) iCodePointAt2, false, i5) && (iCodePointAt2 != 37 || (z6 && (!z7 || bVar.b(str, iCharCount, length))))) {
                                    eVar.V(iCodePointAt2);
                                }
                            }
                            if (eVar2 == null) {
                                eVar2 = new e.e();
                            }
                            if (charset2 == null || c.j.b.d.a(charset2, StandardCharsets.UTF_8)) {
                                eVar2.V(iCodePointAt2);
                            } else {
                                int iCharCount2 = Character.charCount(iCodePointAt2) + iCharCount;
                                c.j.b.d.d(str, "string");
                                c.j.b.d.d(charset2, "charset");
                                if (!(iCharCount >= 0)) {
                                    throw new IllegalArgumentException(b.a.a.a.a.a("beginIndex < 0: ", iCharCount).toString());
                                }
                                if (!(iCharCount2 >= iCharCount)) {
                                    throw new IllegalArgumentException(("endIndex < beginIndex: " + iCharCount2 + " < " + iCharCount).toString());
                                }
                                if (!(iCharCount2 <= str.length())) {
                                    throw new IllegalArgumentException(("endIndex > string.length: " + iCharCount2 + " > " + str.length()).toString());
                                }
                                if (c.j.b.d.a(charset2, c.m.a.f1303a)) {
                                    eVar2.U(str, iCharCount, iCharCount2);
                                } else {
                                    String strSubstring = str.substring(iCharCount, iCharCount2);
                                    c.j.b.d.c(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                                    byte[] bytes = strSubstring.getBytes(charset2);
                                    c.j.b.d.c(bytes, "(this as java.lang.String).getBytes(charset)");
                                    eVar2.N(bytes, 0, bytes.length);
                                }
                            }
                            while (!eVar2.q()) {
                                int i6 = eVar2.readByte() & 255;
                                eVar.P(37);
                                eVar.P(z.j[(i6 >> 4) & 15]);
                                eVar.P(z.j[i6 & 15]);
                            }
                        }
                        iCharCount += Character.charCount(iCodePointAt2);
                        i5 = 2;
                        z8 = z5;
                    }
                    return eVar.H();
                }
                iCharCount += Character.charCount(iCodePointAt);
            }
            String strSubstring2 = str.substring(i4, length);
            c.j.b.d.c(strSubstring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return strSubstring2;
        }

        public static String c(b bVar, String str, int i, int i2, boolean z, int i3) {
            int i4;
            if ((i3 & 1) != 0) {
                i = 0;
            }
            if ((i3 & 2) != 0) {
                i2 = str.length();
            }
            if ((i3 & 4) != 0) {
                z = false;
            }
            c.j.b.d.d(str, "$this$percentDecode");
            int iCharCount = i;
            while (iCharCount < i2) {
                char cCharAt = str.charAt(iCharCount);
                if (cCharAt == '%' || (cCharAt == '+' && z)) {
                    e.e eVar = new e.e();
                    eVar.U(str, i, iCharCount);
                    while (iCharCount < i2) {
                        int iCodePointAt = str.codePointAt(iCharCount);
                        if (iCodePointAt == 37 && (i4 = iCharCount + 2) < i2) {
                            int iV = d.n0.c.v(str.charAt(iCharCount + 1));
                            int iV2 = d.n0.c.v(str.charAt(i4));
                            if (iV == -1 || iV2 == -1) {
                                eVar.V(iCodePointAt);
                                iCharCount += Character.charCount(iCodePointAt);
                            } else {
                                eVar.P((iV << 4) + iV2);
                                iCharCount = Character.charCount(iCodePointAt) + i4;
                            }
                        } else if (iCodePointAt == 43 && z) {
                            eVar.P(32);
                            iCharCount++;
                        } else {
                            eVar.V(iCodePointAt);
                            iCharCount += Character.charCount(iCodePointAt);
                        }
                    }
                    return eVar.H();
                }
                iCharCount++;
            }
            String strSubstring = str.substring(i, i2);
            c.j.b.d.c(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return strSubstring;
        }

        public final boolean b(String str, int i, int i2) {
            int i3 = i + 2;
            return i3 < i2 && str.charAt(i) == '%' && d.n0.c.v(str.charAt(i + 1)) != -1 && d.n0.c.v(str.charAt(i3)) != -1;
        }

        public final List<String> d(String str) {
            String strSubstring;
            c.j.b.d.d(str, "$this$toQueryNamesAndValues");
            ArrayList arrayList = new ArrayList();
            int i = 0;
            while (i <= str.length()) {
                int iJ = c.m.e.j(str, '&', i, false, 4);
                if (iJ == -1) {
                    iJ = str.length();
                }
                int iJ2 = c.m.e.j(str, '=', i, false, 4);
                if (iJ2 == -1 || iJ2 > iJ) {
                    String strSubstring2 = str.substring(i, iJ);
                    c.j.b.d.c(strSubstring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    arrayList.add(strSubstring2);
                    strSubstring = null;
                } else {
                    String strSubstring3 = str.substring(i, iJ2);
                    c.j.b.d.c(strSubstring3, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    arrayList.add(strSubstring3);
                    strSubstring = str.substring(iJ2 + 1, iJ);
                    c.j.b.d.c(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                }
                arrayList.add(strSubstring);
                i = iJ + 1;
            }
            return arrayList;
        }
    }

    public z(String str, String str2, String str3, String str4, int i, List<String> list, List<String> list2, String str5, String str6) {
        c.j.b.d.d(str, "scheme");
        c.j.b.d.d(str2, "username");
        c.j.b.d.d(str3, "password");
        c.j.b.d.d(str4, "host");
        c.j.b.d.d(list, "pathSegments");
        c.j.b.d.d(str6, "url");
        this.f1739b = str;
        this.f1740c = str2;
        this.f1741d = str3;
        this.f1742e = str4;
        this.f = i;
        this.g = list2;
        this.h = str5;
        this.i = str6;
        this.f1738a = c.j.b.d.a(str, "https");
    }

    public final String a() {
        if (this.f1741d.length() == 0) {
            return "";
        }
        int iJ = c.m.e.j(this.i, ':', this.f1739b.length() + 3, false, 4) + 1;
        int iJ2 = c.m.e.j(this.i, '@', 0, false, 6);
        String str = this.i;
        if (str == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        String strSubstring = str.substring(iJ, iJ2);
        c.j.b.d.c(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public final String b() {
        int iJ = c.m.e.j(this.i, '/', this.f1739b.length() + 3, false, 4);
        String str = this.i;
        int iH = d.n0.c.h(str, "?#", iJ, str.length());
        String str2 = this.i;
        if (str2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        String strSubstring = str2.substring(iJ, iH);
        c.j.b.d.c(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public final List<String> c() {
        int iJ = c.m.e.j(this.i, '/', this.f1739b.length() + 3, false, 4);
        String str = this.i;
        int iH = d.n0.c.h(str, "?#", iJ, str.length());
        ArrayList arrayList = new ArrayList();
        while (iJ < iH) {
            int i = iJ + 1;
            int iG = d.n0.c.g(this.i, '/', i, iH);
            String str2 = this.i;
            if (str2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            String strSubstring = str2.substring(i, iG);
            c.j.b.d.c(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            arrayList.add(strSubstring);
            iJ = iG;
        }
        return arrayList;
    }

    public final String d() {
        if (this.g == null) {
            return null;
        }
        int iJ = c.m.e.j(this.i, '?', 0, false, 6) + 1;
        String str = this.i;
        int iG = d.n0.c.g(str, '#', iJ, str.length());
        String str2 = this.i;
        if (str2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        String strSubstring = str2.substring(iJ, iG);
        c.j.b.d.c(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public final String e() {
        if (this.f1740c.length() == 0) {
            return "";
        }
        int length = this.f1739b.length() + 3;
        String str = this.i;
        int iH = d.n0.c.h(str, ":@", length, str.length());
        String str2 = this.i;
        if (str2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        String strSubstring = str2.substring(length, iH);
        c.j.b.d.c(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public boolean equals(Object obj) {
        return (obj instanceof z) && c.j.b.d.a(((z) obj).i, this.i);
    }

    public final String f() {
        a aVar;
        c.j.b.d.d("/...", "link");
        try {
            aVar = new a();
            aVar.d(this, "/...");
        } catch (IllegalArgumentException unused) {
            aVar = null;
        }
        c.j.b.d.b(aVar);
        c.j.b.d.d("", "username");
        aVar.f1744b = b.a(k, "", 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, 251);
        c.j.b.d.d("", "password");
        aVar.f1745c = b.a(k, "", 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, 251);
        return aVar.a().i;
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.net.URI g() {
        /*
            Method dump skipped, instructions count: 392
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: d.z.g():java.net.URI");
    }

    public int hashCode() {
        return this.i.hashCode();
    }

    public String toString() {
        return this.i;
    }
}
