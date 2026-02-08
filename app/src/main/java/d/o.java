package d;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* loaded from: classes.dex */
public final class o {
    public static final Pattern j = Pattern.compile("(\\d{2,4})[^\\d]*");
    public static final Pattern k = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");
    public static final Pattern l = Pattern.compile("(\\d{1,2})[^\\d]*");
    public static final Pattern m = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");
    public static final o n = null;

    /* renamed from: a */
    public final String f1710a;

    /* renamed from: b */
    public final String f1711b;

    /* renamed from: c */
    public final long f1712c;

    /* renamed from: d */
    public final String f1713d;

    /* renamed from: e */
    public final String f1714e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;

    public o(String str, String str2, long j2, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4, c.j.b.c cVar) {
        this.f1710a = str;
        this.f1711b = str2;
        this.f1712c = j2;
        this.f1713d = str3;
        this.f1714e = str4;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = z4;
    }

    public static final int a(String str, int i, int i2, boolean z) {
        while (i < i2) {
            char cCharAt = str.charAt(i);
            boolean z2 = true;
            if ((cCharAt >= ' ' || cCharAt == '\t') && cCharAt < 127 && (('0' > cCharAt || '9' < cCharAt) && (('a' > cCharAt || 'z' < cCharAt) && (('A' > cCharAt || 'Z' < cCharAt) && cCharAt != ':')))) {
                z2 = false;
            }
            if (z2 == (!z)) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static final long b(String str, int i, int i2) throws NumberFormatException {
        int iA = a(str, i, i2, false);
        Matcher matcher = m.matcher(str);
        int i3 = -1;
        int i4 = -1;
        int i5 = -1;
        int iK = -1;
        int i6 = -1;
        int i7 = -1;
        while (iA < i2) {
            int iA2 = a(str, iA + 1, i2, true);
            matcher.region(iA, iA2);
            if (i4 == -1 && matcher.usePattern(m).matches()) {
                String strGroup = matcher.group(1);
                c.j.b.d.c(strGroup, "matcher.group(1)");
                i4 = Integer.parseInt(strGroup);
                String strGroup2 = matcher.group(2);
                c.j.b.d.c(strGroup2, "matcher.group(2)");
                i6 = Integer.parseInt(strGroup2);
                String strGroup3 = matcher.group(3);
                c.j.b.d.c(strGroup3, "matcher.group(3)");
                i7 = Integer.parseInt(strGroup3);
            } else if (i5 == -1 && matcher.usePattern(l).matches()) {
                String strGroup4 = matcher.group(1);
                c.j.b.d.c(strGroup4, "matcher.group(1)");
                i5 = Integer.parseInt(strGroup4);
            } else if (iK == -1 && matcher.usePattern(k).matches()) {
                String strGroup5 = matcher.group(1);
                c.j.b.d.c(strGroup5, "matcher.group(1)");
                Locale locale = Locale.US;
                c.j.b.d.c(locale, "Locale.US");
                String lowerCase = strGroup5.toLowerCase(locale);
                c.j.b.d.c(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                String strPattern = k.pattern();
                c.j.b.d.c(strPattern, "MONTH_PATTERN.pattern()");
                iK = c.m.e.k(strPattern, lowerCase, 0, false, 6) / 4;
            } else if (i3 == -1 && matcher.usePattern(j).matches()) {
                String strGroup6 = matcher.group(1);
                c.j.b.d.c(strGroup6, "matcher.group(1)");
                i3 = Integer.parseInt(strGroup6);
            }
            iA = a(str, iA2 + 1, i2, false);
        }
        if (70 <= i3 && 99 >= i3) {
            i3 += 1900;
        }
        if (i3 >= 0 && 69 >= i3) {
            i3 += 2000;
        }
        if (!(i3 >= 1601)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (!(iK != -1)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (!(1 <= i5 && 31 >= i5)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (!(i4 >= 0 && 23 >= i4)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (!(i6 >= 0 && 59 >= i6)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (!(i7 >= 0 && 59 >= i7)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar(d.n0.c.f1415e);
        gregorianCalendar.setLenient(false);
        gregorianCalendar.set(1, i3);
        gregorianCalendar.set(2, iK - 1);
        gregorianCalendar.set(5, i5);
        gregorianCalendar.set(11, i4);
        gregorianCalendar.set(12, i6);
        gregorianCalendar.set(13, i7);
        gregorianCalendar.set(14, 0);
        return gregorianCalendar.getTimeInMillis();
    }

    public static final long c(String str) throws NumberFormatException {
        try {
            long j2 = Long.parseLong(str);
            if (j2 <= 0) {
                return Long.MIN_VALUE;
            }
            return j2;
        } catch (NumberFormatException e2) {
            c.j.b.d.d("-?\\d+", "pattern");
            Pattern patternCompile = Pattern.compile("-?\\d+");
            c.j.b.d.c(patternCompile, "Pattern.compile(pattern)");
            c.j.b.d.d(patternCompile, "nativePattern");
            c.j.b.d.d(str, "input");
            if (patternCompile.matcher(str).matches()) {
                return c.m.e.z(str, "-", false, 2) ? Long.MIN_VALUE : Long.MAX_VALUE;
            }
            throw e2;
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof o) {
            o oVar = (o) obj;
            if (c.j.b.d.a(oVar.f1710a, this.f1710a) && c.j.b.d.a(oVar.f1711b, this.f1711b) && oVar.f1712c == this.f1712c && c.j.b.d.a(oVar.f1713d, this.f1713d) && c.j.b.d.a(oVar.f1714e, this.f1714e) && oVar.f == this.f && oVar.g == this.g && oVar.h == this.h && oVar.i == this.i) {
                return true;
            }
        }
        return false;
    }

    @IgnoreJRERequirement
    public int hashCode() {
        return Boolean.hashCode(this.i) + ((Boolean.hashCode(this.h) + ((Boolean.hashCode(this.g) + ((Boolean.hashCode(this.f) + ((this.f1714e.hashCode() + ((this.f1713d.hashCode() + ((Long.hashCode(this.f1712c) + ((this.f1711b.hashCode() + ((this.f1710a.hashCode() + 527) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public String toString() {
        String strA;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f1710a);
        sb.append('=');
        sb.append(this.f1711b);
        if (this.h) {
            if (this.f1712c == Long.MIN_VALUE) {
                strA = "; max-age=0";
            } else {
                sb.append("; expires=");
                strA = d.n0.h.c.a(new Date(this.f1712c));
            }
            sb.append(strA);
        }
        if (!this.i) {
            sb.append("; domain=");
            sb.append(this.f1713d);
        }
        sb.append("; path=");
        sb.append(this.f1714e);
        if (this.f) {
            sb.append("; secure");
        }
        if (this.g) {
            sb.append("; httponly");
        }
        String string = sb.toString();
        c.j.b.d.c(string, "toString()");
        return string;
    }
}
