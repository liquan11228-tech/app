package d.n0;

import a.b.k.h;
import c.g.i;
import c.j.b.d;
import c.m.e;
import d.g0;
import d.i0;
import d.y;
import d.z;
import e.a0;
import e.f;
import e.g;
import e.h;
import e.q;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.reflect.InvocationTargetException;
import java.net.Socket;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a */
    public static final byte[] f1411a = new byte[0];

    /* renamed from: b */
    public static final y f1412b = y.f1735c.c(new String[0]);

    /* renamed from: c */
    public static final i0 f1413c;

    /* renamed from: d */
    public static final q f1414d;

    /* renamed from: e */
    public static final TimeZone f1415e;
    public static final c.m.c f;
    public static final boolean g;
    public static final String h;

    /* JADX WARN: Code restructure failed: missing block: B:199:0x0201, code lost:
    
        continue;
     */
    static {
        /*
            Method dump skipped, instructions count: 685
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: d.n0.c.<clinit>():void");
    }

    public static final y A(List<d.n0.j.c> list) {
        d.d(list, "$this$toHeaders");
        ArrayList arrayList = new ArrayList(20);
        for (d.n0.j.c cVar : list) {
            h hVar = cVar.f1539b;
            h hVar2 = cVar.f1540c;
            String strJ = hVar.j();
            String strJ2 = hVar2.j();
            d.d(strJ, "name");
            d.d(strJ2, "value");
            arrayList.add(strJ);
            arrayList.add(e.C(strJ2).toString());
        }
        Object[] array = arrayList.toArray(new String[0]);
        if (array != null) {
            return new y((String[]) array, null);
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    public static final String B(int i) {
        String hexString = Integer.toHexString(i);
        d.c(hexString, "Integer.toHexString(this)");
        return hexString;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.String C(d.z r4, boolean r5) {
        /*
            java.lang.String r0 = "$this$toHostHeader"
            c.j.b.d.d(r4, r0)
            java.lang.String r0 = r4.f1742e
            r1 = 0
            r2 = 2
            java.lang.String r3 = ":"
            boolean r0 = c.m.e.b(r0, r3, r1, r2)
            if (r0 == 0) goto L2a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 91
            r0.append(r1)
            java.lang.String r1 = r4.f1742e
            r0.append(r1)
            r1 = 93
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            goto L2c
        L2a:
            java.lang.String r0 = r4.f1742e
        L2c:
            if (r5 != 0) goto L5f
            int r5 = r4.f
            java.lang.String r1 = r4.f1739b
            java.lang.String r2 = "scheme"
            c.j.b.d.d(r1, r2)
            int r2 = r1.hashCode()
            r3 = 3213448(0x310888, float:4.503E-39)
            if (r2 == r3) goto L51
            r3 = 99617003(0x5f008eb, float:2.2572767E-35)
            if (r2 == r3) goto L46
            goto L5c
        L46:
            java.lang.String r2 = "https"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L5c
            r1 = 443(0x1bb, float:6.21E-43)
            goto L5d
        L51:
            java.lang.String r2 = "http"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L5c
            r1 = 80
            goto L5d
        L5c:
            r1 = -1
        L5d:
            if (r5 == r1) goto L75
        L5f:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r0)
            r0 = 58
            r5.append(r0)
            int r4 = r4.f
            r5.append(r4)
            java.lang.String r0 = r5.toString()
        L75:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: d.n0.c.C(d.z, boolean):java.lang.String");
    }

    public static final <T> List<T> D(List<? extends T> list) {
        d.d(list, "$this$toImmutableList");
        List<T> listUnmodifiableList = Collections.unmodifiableList(c.g.e.i(list));
        d.c(listUnmodifiableList, "Collections.unmodifiableList(toMutableList())");
        return listUnmodifiableList;
    }

    public static final <K, V> Map<K, V> E(Map<K, ? extends V> map) {
        d.d(map, "$this$toImmutableMap");
        if (map.isEmpty()) {
            return i.f1273b;
        }
        Map<K, V> mapUnmodifiableMap = Collections.unmodifiableMap(new LinkedHashMap(map));
        d.c(mapUnmodifiableMap, "Collections.unmodifiableMap(LinkedHashMap(this))");
        return mapUnmodifiableMap;
    }

    public static final int F(String str, int i) throws NumberFormatException {
        if (str != null) {
            try {
                long j = Long.parseLong(str);
                if (j > Integer.MAX_VALUE) {
                    return Integer.MAX_VALUE;
                }
                if (j < 0) {
                    return 0;
                }
                return (int) j;
            } catch (NumberFormatException unused) {
            }
        }
        return i;
    }

    public static final String G(String str, int i, int i2) {
        d.d(str, "$this$trimSubstring");
        int iQ = q(str, i, i2);
        String strSubstring = str.substring(iQ, s(str, iQ, i2));
        d.c(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public static final Throwable H(Exception exc, List<? extends Exception> list) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        d.d(exc, "$this$withSuppressed");
        d.d(list, "suppressed");
        if (list.size() > 1) {
            System.out.println(list);
        }
        Iterator<? extends Exception> it = list.iterator();
        while (it.hasNext()) {
            h.i.c(exc, it.next());
        }
        return exc;
    }

    public static final void I(f fVar, int i) {
        d.d(fVar, "$this$writeMedium");
        fVar.r((i >>> 16) & 255);
        fVar.r((i >>> 8) & 255);
        fVar.r(i & 255);
    }

    public static final int a(byte b2, int i) {
        return b2 & i;
    }

    public static final boolean b(String str) {
        d.d(str, "$this$canParseAsIpAddress");
        return f.a(str);
    }

    public static final boolean c(z zVar, z zVar2) {
        d.d(zVar, "$this$canReuseConnectionFor");
        d.d(zVar2, "other");
        return d.a(zVar.f1742e, zVar2.f1742e) && zVar.f == zVar2.f && d.a(zVar.f1739b, zVar2.f1739b);
    }

    public static final void d(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public static final void e(Closeable closeable) {
        d.d(closeable, "$this$closeQuietly");
        try {
            closeable.close();
        } catch (RuntimeException e2) {
            throw e2;
        } catch (Exception unused) {
        }
    }

    public static final void f(Socket socket) throws IOException {
        d.d(socket, "$this$closeQuietly");
        try {
            socket.close();
        } catch (AssertionError e2) {
            throw e2;
        } catch (RuntimeException e3) {
            throw e3;
        } catch (Exception unused) {
        }
    }

    public static final int g(String str, char c2, int i, int i2) {
        d.d(str, "$this$delimiterOffset");
        while (i < i2) {
            if (str.charAt(i) == c2) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static final int h(String str, String str2, int i, int i2) {
        d.d(str, "$this$delimiterOffset");
        d.d(str2, "delimiters");
        while (i < i2) {
            if (e.a(str2, str.charAt(i), false, 2)) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static /* synthetic */ int i(String str, char c2, int i, int i2, int i3) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = str.length();
        }
        return g(str, c2, i, i2);
    }

    public static final boolean j(e.z zVar, int i, TimeUnit timeUnit) {
        d.d(zVar, "$this$discard");
        d.d(timeUnit, "timeUnit");
        try {
            return z(zVar, i, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    public static final String k(String str, Object... objArr) {
        d.d(str, "format");
        d.d(objArr, "args");
        Locale locale = Locale.US;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        String str2 = String.format(locale, str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        d.c(str2, "java.lang.String.format(locale, format, *args)");
        return str2;
    }

    public static final boolean l(String[] strArr, String[] strArr2, Comparator<? super String> comparator) {
        d.d(strArr, "$this$hasIntersection");
        d.d(comparator, "comparator");
        if (!(strArr.length == 0) && strArr2 != null) {
            if (!(strArr2.length == 0)) {
                for (String str : strArr) {
                    for (String str2 : strArr2) {
                        if (comparator.compare(str, str2) == 0) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public static final long m(g0 g0Var) {
        d.d(g0Var, "$this$headersContentLength");
        String strA = g0Var.g.a("Content-Length");
        if (strA != null) {
            d.d(strA, "$this$toLongOrDefault");
            try {
                return Long.parseLong(strA);
            } catch (NumberFormatException unused) {
            }
        }
        return -1L;
    }

    @SafeVarargs
    public static final <T> List<T> n(T... tArr) {
        d.d(tArr, "elements");
        Object[] objArr = (Object[]) tArr.clone();
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        d.d(objArrCopyOf, "elements");
        List<T> listUnmodifiableList = Collections.unmodifiableList(objArrCopyOf.length > 0 ? c.g.e.a(objArrCopyOf) : c.g.h.f1272b);
        d.c(listUnmodifiableList, "Collections.unmodifiable…istOf(*elements.clone()))");
        return listUnmodifiableList;
    }

    public static final int o(String[] strArr, String str, Comparator<String> comparator) {
        d.d(strArr, "$this$indexOf");
        d.d(str, "value");
        d.d(comparator, "comparator");
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            if (comparator.compare(strArr[i], str) == 0) {
                return i;
            }
        }
        return -1;
    }

    public static final int p(String str) {
        d.d(str, "$this$indexOfControlOrNonAscii");
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (d.e(cCharAt, 31) <= 0 || d.e(cCharAt, 127) >= 0) {
                return i;
            }
        }
        return -1;
    }

    public static final int q(String str, int i, int i2) {
        d.d(str, "$this$indexOfFirstNonAsciiWhitespace");
        while (i < i2) {
            char cCharAt = str.charAt(i);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static /* synthetic */ int r(String str, int i, int i2, int i3) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        return q(str, i, i2);
    }

    public static final int s(String str, int i, int i2) {
        d.d(str, "$this$indexOfLastNonAsciiWhitespace");
        int i3 = i2 - 1;
        if (i3 >= i) {
            while (true) {
                char cCharAt = str.charAt(i3);
                if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                    return i3 + 1;
                }
                if (i3 == i) {
                    break;
                }
                i3--;
            }
        }
        return i;
    }

    public static final int t(String str, int i) {
        d.d(str, "$this$indexOfNonWhitespace");
        int length = str.length();
        while (i < length) {
            char cCharAt = str.charAt(i);
            if (cCharAt != ' ' && cCharAt != '\t') {
                return i;
            }
            i++;
        }
        return str.length();
    }

    public static final String[] u(String[] strArr, String[] strArr2, Comparator<? super String> comparator) {
        d.d(strArr, "$this$intersect");
        d.d(strArr2, "other");
        d.d(comparator, "comparator");
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int length = strArr2.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (comparator.compare(str, strArr2[i]) == 0) {
                    arrayList.add(str);
                    break;
                }
                i++;
            }
        }
        Object[] array = arrayList.toArray(new String[0]);
        if (array != null) {
            return (String[]) array;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    public static final int v(char c2) {
        if ('0' <= c2 && '9' >= c2) {
            return c2 - '0';
        }
        char c3 = 'a';
        if ('a' > c2 || 'f' < c2) {
            c3 = 'A';
            if ('A' > c2 || 'F' < c2) {
                return -1;
            }
        }
        return (c2 - c3) + 10;
    }

    public static final Charset w(g gVar, Charset charset) {
        Charset charset2;
        String str;
        Charset charsetForName;
        d.d(gVar, "$this$readBomAsCharset");
        d.d(charset, "default");
        int iX = gVar.x(f1414d);
        if (iX == -1) {
            return charset;
        }
        if (iX == 0) {
            charset2 = StandardCharsets.UTF_8;
            str = "UTF_8";
        } else if (iX == 1) {
            charset2 = StandardCharsets.UTF_16BE;
            str = "UTF_16BE";
        } else {
            if (iX != 2) {
                if (iX == 3) {
                    c.m.a aVar = c.m.a.f1306d;
                    charsetForName = c.m.a.f1305c;
                    if (charsetForName == null) {
                        charsetForName = Charset.forName("UTF-32BE");
                        d.c(charsetForName, "Charset.forName(\"UTF-32BE\")");
                        c.m.a.f1305c = charsetForName;
                    }
                } else {
                    if (iX != 4) {
                        throw new AssertionError();
                    }
                    c.m.a aVar2 = c.m.a.f1306d;
                    charsetForName = c.m.a.f1304b;
                    if (charsetForName == null) {
                        charsetForName = Charset.forName("UTF-32LE");
                        d.c(charsetForName, "Charset.forName(\"UTF-32LE\")");
                        c.m.a.f1304b = charsetForName;
                    }
                }
                return charsetForName;
            }
            charset2 = StandardCharsets.UTF_16LE;
            str = "UTF_16LE";
        }
        String str2 = str;
        Charset charset3 = charset2;
        d.c(charset3, str2);
        return charset3;
    }

    public static final int x(g gVar) {
        d.d(gVar, "$this$readMedium");
        return (gVar.readByte() & 255) | ((gVar.readByte() & 255) << 16) | ((gVar.readByte() & 255) << 8);
    }

    public static final int y(e.e eVar, byte b2) throws EOFException {
        d.d(eVar, "$this$skipAll");
        int i = 0;
        while (!eVar.q() && eVar.z(0L) == b2) {
            i++;
            eVar.readByte();
        }
        return i;
    }

    public static final boolean z(e.z zVar, int i, TimeUnit timeUnit) {
        boolean z;
        d.d(zVar, "$this$skipAll");
        d.d(timeUnit, "timeUnit");
        long jNanoTime = System.nanoTime();
        long jC = zVar.b().e() ? zVar.b().c() - jNanoTime : Long.MAX_VALUE;
        zVar.b().d(Math.min(jC, timeUnit.toNanos(i)) + jNanoTime);
        try {
            e.e eVar = new e.e();
            while (zVar.l(eVar, 8192L) != -1) {
                eVar.p(eVar.f1761c);
            }
            z = true;
        } catch (InterruptedIOException unused) {
            z = false;
            if (jC == Long.MAX_VALUE) {
            }
        } catch (Throwable th) {
            a0 a0VarB = zVar.b();
            if (jC == Long.MAX_VALUE) {
                a0VarB.a();
            } else {
                a0VarB.d(jNanoTime + jC);
            }
            throw th;
        }
        if (jC == Long.MAX_VALUE) {
            zVar.b().a();
        } else {
            zVar.b().d(jNanoTime + jC);
        }
        return z;
    }
}
