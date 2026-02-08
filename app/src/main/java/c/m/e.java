package c.m;

import a.b.k.h;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class e extends d {
    public static final String A(CharSequence charSequence, c.k.c cVar) {
        c.j.b.d.d(charSequence, "$this$substring");
        c.j.b.d.d(cVar, "range");
        return charSequence.subSequence(Integer.valueOf(cVar.f1286b).intValue(), Integer.valueOf(cVar.f1287c).intValue() + 1).toString();
    }

    public static final Integer B(String str) {
        int i;
        int i2;
        c.j.b.d.d(str, "$this$toIntOrNull");
        c.j.b.d.d(str, "$this$toIntOrNull");
        h.i.o(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i3 = 0;
        char cCharAt = str.charAt(0);
        int i4 = -2147483647;
        boolean z = true;
        if (c.j.b.d.e(cCharAt, 48) >= 0) {
            i = 0;
            z = false;
        } else {
            if (length == 1) {
                return null;
            }
            if (cCharAt == '-') {
                i4 = Integer.MIN_VALUE;
                i = 1;
            } else {
                if (cCharAt != '+') {
                    return null;
                }
                i = 1;
                z = false;
            }
        }
        int i5 = -59652323;
        while (i < length) {
            int iDigit = Character.digit((int) str.charAt(i), 10);
            if (iDigit < 0) {
                return null;
            }
            if ((i3 < i5 && (i5 != -59652323 || i3 < (i5 = i4 / 10))) || (i2 = i3 * 10) < i4 + iDigit) {
                return null;
            }
            i3 = i2 - iDigit;
            i++;
        }
        if (!z) {
            i3 = -i3;
        }
        return Integer.valueOf(i3);
    }

    public static final CharSequence C(CharSequence charSequence) {
        c.j.b.d.d(charSequence, "$this$trim");
        int length = charSequence.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean zC = h.i.C(charSequence.charAt(!z ? i : length));
            if (z) {
                if (!zC) {
                    break;
                }
                length--;
            } else if (zC) {
                i++;
            } else {
                z = true;
            }
        }
        return charSequence.subSequence(i, length + 1);
    }

    public static String D(String str, String str2, int i) throws IOException {
        String strSubstring;
        String str3 = (i & 1) != 0 ? "|" : null;
        c.j.b.d.d(str, "$this$trimMargin");
        c.j.b.d.d(str3, "marginPrefix");
        c.j.b.d.d(str, "$this$replaceIndentByMargin");
        c.j.b.d.d("", "newIndent");
        c.j.b.d.d(str3, "marginPrefix");
        if (!(!m(str3))) {
            throw new IllegalArgumentException("marginPrefix must be non-blank string.".toString());
        }
        c.j.b.d.d(str, "$this$lines");
        c.j.b.d.d(str, "$this$lineSequence");
        c.l.c cVarU = u(str, new String[]{"\r\n", "\n", "\r"}, false, 0, 6);
        c.j.b.d.d(cVarU, "$this$toList");
        c.j.b.d.d(cVarU, "$this$toMutableList");
        ArrayList arrayList = new ArrayList();
        c.j.b.d.d(cVarU, "$this$toCollection");
        c.j.b.d.d(arrayList, "destination");
        c.l.e eVar = (c.l.e) cVarU;
        Iterator it = eVar.f1299a.iterator();
        while (it.hasNext()) {
            arrayList.add(eVar.f1300b.b(it.next()));
        }
        List listN = h.i.N(arrayList);
        int size = (listN.size() * 0) + str.length();
        c.j.b.d.d(listN, "$this$lastIndex");
        int size2 = listN.size() - 1;
        ArrayList arrayList2 = new ArrayList();
        int i2 = 0;
        for (Object obj : listN) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                h.i.X();
                throw null;
            }
            String str4 = (String) obj;
            if ((i2 == 0 || i2 == size2) && m(str4)) {
                str4 = null;
            } else {
                int length = str4.length();
                int i4 = 0;
                while (true) {
                    if (i4 >= length) {
                        i4 = -1;
                        break;
                    }
                    if (!h.i.C(str4.charAt(i4))) {
                        break;
                    }
                    i4++;
                }
                if (i4 != -1 && y(str4, str3, i4, false, 4)) {
                    strSubstring = str4.substring(str3.length() + i4);
                    c.j.b.d.c(strSubstring, "(this as java.lang.String).substring(startIndex)");
                } else {
                    strSubstring = null;
                }
                if (strSubstring != null) {
                    c.j.b.d.d(strSubstring, "line");
                    str4 = strSubstring;
                }
            }
            if (str4 != null) {
                arrayList2.add(str4);
            }
            i2 = i3;
        }
        StringBuilder sb = new StringBuilder(size);
        c.g.e.f(arrayList2, sb, "\n", "", "", -1, "...", null);
        String string = sb.toString();
        c.j.b.d.c(string, "mapIndexedNotNull { inde…\"\\n\")\n        .toString()");
        return string;
    }

    public static boolean a(CharSequence charSequence, char c2, boolean z, int i) {
        if ((i & 2) != 0) {
            z = false;
        }
        c.j.b.d.d(charSequence, "$this$contains");
        return j(charSequence, c2, 0, z, 2) >= 0;
    }

    public static boolean b(CharSequence charSequence, CharSequence charSequence2, boolean z, int i) {
        if ((i & 2) != 0) {
            z = false;
        }
        c.j.b.d.d(charSequence, "$this$contains");
        c.j.b.d.d(charSequence2, "other");
        return k(charSequence, (String) charSequence2, 0, z, 2) >= 0;
    }

    public static boolean c(CharSequence charSequence, CharSequence charSequence2, boolean z, int i) {
        boolean z2 = (i & 2) != 0 ? false : z;
        c.j.b.d.d(charSequence, "$this$endsWith");
        c.j.b.d.d(charSequence2, "suffix");
        return (z2 || !(charSequence2 instanceof String)) ? q(charSequence, charSequence.length() - charSequence2.length(), charSequence2, 0, charSequence2.length(), z2) : d((String) charSequence, (String) charSequence2, false, 2);
    }

    public static boolean d(String str, String str2, boolean z, int i) {
        if ((i & 2) != 0) {
            z = false;
        }
        c.j.b.d.d(str, "$this$endsWith");
        c.j.b.d.d(str2, "suffix");
        return !z ? str.endsWith(str2) : p(str, str.length() - str2.length(), str2, 0, str2.length(), true);
    }

    public static final boolean e(String str, String str2, boolean z) {
        return str == null ? str2 == null : !z ? str.equals(str2) : str.equalsIgnoreCase(str2);
    }

    public static final int f(CharSequence charSequence) {
        c.j.b.d.d(charSequence, "$this$lastIndex");
        return charSequence.length() - 1;
    }

    public static final int g(CharSequence charSequence, String str, int i, boolean z) {
        c.j.b.d.d(charSequence, "$this$indexOf");
        c.j.b.d.d(str, "string");
        return (z || !(charSequence instanceof String)) ? i(charSequence, str, i, charSequence.length(), z, false, 16) : ((String) charSequence).indexOf(str, i);
    }

    public static final int h(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2) {
        c.k.a aVarA;
        if (z2) {
            int iF = f(charSequence);
            if (i > iF) {
                i = iF;
            }
            if (i2 < 0) {
                i2 = 0;
            }
            aVarA = c.k.d.a(i, i2);
        } else {
            if (i < 0) {
                i = 0;
            }
            int length = charSequence.length();
            if (i2 > length) {
                i2 = length;
            }
            aVarA = new c.k.c(i, i2);
        }
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            int i3 = aVarA.f1286b;
            int i4 = aVarA.f1287c;
            int i5 = aVarA.f1288d;
            if (i5 >= 0) {
                if (i3 > i4) {
                    return -1;
                }
            } else if (i3 < i4) {
                return -1;
            }
            while (!p((String) charSequence2, 0, (String) charSequence, i3, charSequence2.length(), z)) {
                if (i3 == i4) {
                    return -1;
                }
                i3 += i5;
            }
            return i3;
        }
        int i6 = aVarA.f1286b;
        int i7 = aVarA.f1287c;
        int i8 = aVarA.f1288d;
        if (i8 >= 0) {
            if (i6 > i7) {
                return -1;
            }
        } else if (i6 < i7) {
            return -1;
        }
        while (!q(charSequence2, 0, charSequence, i6, charSequence2.length(), z)) {
            if (i6 == i7) {
                return -1;
            }
            i6 += i8;
        }
        return i6;
    }

    public static /* synthetic */ int i(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2, int i3) {
        if ((i3 & 16) != 0) {
            z2 = false;
        }
        return h(charSequence, charSequence2, i, i2, z, z2);
    }

    public static int j(CharSequence charSequence, char c2, int i, boolean z, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        c.j.b.d.d(charSequence, "$this$indexOf");
        return (z || !(charSequence instanceof String)) ? l(charSequence, new char[]{c2}, i, z) : ((String) charSequence).indexOf(c2, i);
    }

    public static /* synthetic */ int k(CharSequence charSequence, String str, int i, boolean z, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return g(charSequence, str, i, z);
    }

    public static final int l(CharSequence charSequence, char[] cArr, int i, boolean z) {
        boolean z2;
        c.j.b.d.d(charSequence, "$this$indexOfAny");
        c.j.b.d.d(cArr, "chars");
        if (!z && cArr.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(h.i.V(cArr), i);
        }
        if (i < 0) {
            i = 0;
        }
        int iF = f(charSequence);
        if (i > iF) {
            return -1;
        }
        while (true) {
            char cCharAt = charSequence.charAt(i);
            int length = cArr.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    z2 = false;
                    break;
                }
                if (h.i.v(cArr[i2], cCharAt, z)) {
                    z2 = true;
                    break;
                }
                i2++;
            }
            if (z2) {
                return i;
            }
            if (i == iF) {
                return -1;
            }
            i++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean m(java.lang.CharSequence r4) {
        /*
            java.lang.String r0 = "$this$isBlank"
            c.j.b.d.d(r4, r0)
            int r0 = r4.length()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L4c
            java.lang.String r0 = "$this$indices"
            c.j.b.d.d(r4, r0)
            c.k.c r0 = new c.k.c
            int r3 = r4.length()
            int r3 = r3 + (-1)
            r0.<init>(r1, r3)
            boolean r3 = r0 instanceof java.util.Collection
            if (r3 == 0) goto L2b
            r3 = r0
            java.util.Collection r3 = (java.util.Collection) r3
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L2b
            goto L49
        L2b:
            java.util.Iterator r0 = r0.iterator()
        L2f:
            r3 = r0
            c.k.b r3 = (c.k.b) r3
            boolean r3 = r3.f1290c
            if (r3 == 0) goto L49
            r3 = r0
            c.g.k r3 = (c.g.k) r3
            int r3 = r3.a()
            char r3 = r4.charAt(r3)
            boolean r3 = a.b.k.h.i.C(r3)
            if (r3 != 0) goto L2f
            r4 = r1
            goto L4a
        L49:
            r4 = r2
        L4a:
            if (r4 == 0) goto L4d
        L4c:
            r1 = r2
        L4d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: c.m.e.m(java.lang.CharSequence):boolean");
    }

    public static int n(CharSequence charSequence, char c2, int i, boolean z, int i2) {
        boolean z2;
        if ((i2 & 2) != 0) {
            i = f(charSequence);
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        c.j.b.d.d(charSequence, "$this$lastIndexOf");
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).lastIndexOf(c2, i);
        }
        char[] cArr = {c2};
        c.j.b.d.d(charSequence, "$this$lastIndexOfAny");
        c.j.b.d.d(cArr, "chars");
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).lastIndexOf(h.i.V(cArr), i);
        }
        int iF = f(charSequence);
        if (i > iF) {
            i = iF;
        }
        while (i >= 0) {
            char cCharAt = charSequence.charAt(i);
            int i3 = 0;
            while (true) {
                if (i3 >= 1) {
                    z2 = false;
                    break;
                }
                if (h.i.v(cArr[i3], cCharAt, z)) {
                    z2 = true;
                    break;
                }
                i3++;
            }
            if (z2) {
                return i;
            }
            i--;
        }
        return -1;
    }

    public static c.l.c o(CharSequence charSequence, char[] cArr, int i, boolean z, int i2, int i3) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        if ((i3 & 8) != 0) {
            i2 = 0;
        }
        if (i2 >= 0) {
            return new b(charSequence, i, i2, new f(cArr, z));
        }
        throw new IllegalArgumentException(("Limit must be non-negative, but was " + i2 + '.').toString());
    }

    public static final boolean p(String str, int i, String str2, int i2, int i3, boolean z) {
        c.j.b.d.d(str, "$this$regionMatches");
        c.j.b.d.d(str2, "other");
        return !z ? str.regionMatches(i, str2, i2, i3) : str.regionMatches(z, i, str2, i2, i3);
    }

    public static final boolean q(CharSequence charSequence, int i, CharSequence charSequence2, int i2, int i3, boolean z) {
        c.j.b.d.d(charSequence, "$this$regionMatchesImpl");
        c.j.b.d.d(charSequence2, "other");
        if (i2 < 0 || i < 0 || i > charSequence.length() - i3 || i2 > charSequence2.length() - i3) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (!h.i.v(charSequence.charAt(i + i4), charSequence2.charAt(i2 + i4), z)) {
                return false;
            }
        }
        return true;
    }

    public static final String r(String str, CharSequence charSequence) {
        c.j.b.d.d(str, "$this$removePrefix");
        c.j.b.d.d(charSequence, "prefix");
        if (!x(str, charSequence, false, 2)) {
            return str;
        }
        String strSubstring = str.substring(charSequence.length());
        c.j.b.d.c(strSubstring, "(this as java.lang.String).substring(startIndex)");
        return strSubstring;
    }

    public static String s(String str, String str2, String str3, boolean z, int i) {
        if ((i & 4) != 0) {
            z = false;
        }
        c.j.b.d.d(str, "$this$replace");
        c.j.b.d.d(str2, "oldValue");
        c.j.b.d.d(str3, "newValue");
        return h.i.D(u(str, new String[]{str2}, z, 0, 4), str3, null, null, 0, null, null, 62);
    }

    public static List t(CharSequence charSequence, char[] cArr, boolean z, int i, int i2) {
        int length = 0;
        boolean z2 = (i2 & 2) != 0 ? false : z;
        int i3 = (i2 & 4) != 0 ? 0 : i;
        c.j.b.d.d(charSequence, "$this$split");
        c.j.b.d.d(cArr, "delimiters");
        int i4 = 10;
        if (cArr.length != 1) {
            c.l.c cVarO = o(charSequence, cArr, 0, z2, i3, 2);
            c.j.b.d.d(cVarO, "$this$asIterable");
            c.l.d dVar = new c.l.d(cVarO);
            ArrayList arrayList = new ArrayList(h.i.r(dVar, 10));
            Iterator it = dVar.iterator();
            while (it.hasNext()) {
                arrayList.add(A(charSequence, (c.k.c) it.next()));
            }
            return arrayList;
        }
        String strValueOf = String.valueOf(cArr[0]);
        if (!(i3 >= 0)) {
            throw new IllegalArgumentException(("Limit must be non-negative, but was " + i3 + '.').toString());
        }
        int iG = g(charSequence, strValueOf, 0, z2);
        if (iG == -1 || i3 == 1) {
            return h.i.E(charSequence.toString());
        }
        boolean z3 = i3 > 0;
        if (z3 && i3 <= 10) {
            i4 = i3;
        }
        ArrayList arrayList2 = new ArrayList(i4);
        do {
            arrayList2.add(charSequence.subSequence(length, iG).toString());
            length = strValueOf.length() + iG;
            if (z3 && arrayList2.size() == i3 - 1) {
                break;
            }
            iG = g(charSequence, strValueOf, length, z2);
        } while (iG != -1);
        arrayList2.add(charSequence.subSequence(length, charSequence.length()).toString());
        return arrayList2;
    }

    public static c.l.c u(CharSequence charSequence, String[] strArr, boolean z, int i, int i2) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        c.j.b.d.d(charSequence, "$this$splitToSequence");
        c.j.b.d.d(strArr, "delimiters");
        if (i >= 0) {
            b bVar = new b(charSequence, 0, i, new g(c.g.e.a(strArr), z));
            h hVar = new h(charSequence);
            c.j.b.d.d(bVar, "$this$map");
            c.j.b.d.d(hVar, "transform");
            return new c.l.e(bVar, hVar);
        }
        throw new IllegalArgumentException(("Limit must be non-negative, but was " + i + '.').toString());
    }

    public static final boolean v(String str, String str2, int i, boolean z) {
        c.j.b.d.d(str, "$this$startsWith");
        c.j.b.d.d(str2, "prefix");
        return !z ? str.startsWith(str2, i) : p(str, i, str2, 0, str2.length(), z);
    }

    public static final boolean w(String str, String str2, boolean z) {
        c.j.b.d.d(str, "$this$startsWith");
        c.j.b.d.d(str2, "prefix");
        return !z ? str.startsWith(str2) : p(str, 0, str2, 0, str2.length(), z);
    }

    public static boolean x(CharSequence charSequence, CharSequence charSequence2, boolean z, int i) {
        boolean z2 = (i & 2) != 0 ? false : z;
        c.j.b.d.d(charSequence, "$this$startsWith");
        c.j.b.d.d(charSequence2, "prefix");
        return (z2 || !(charSequence2 instanceof String)) ? q(charSequence, 0, charSequence2, 0, charSequence2.length(), z2) : z((String) charSequence, (String) charSequence2, false, 2);
    }

    public static /* synthetic */ boolean y(String str, String str2, int i, boolean z, int i2) {
        if ((i2 & 4) != 0) {
            z = false;
        }
        return v(str, str2, i, z);
    }

    public static /* synthetic */ boolean z(String str, String str2, boolean z, int i) {
        if ((i & 2) != 0) {
            z = false;
        }
        return w(str, str2, z);
    }
}
