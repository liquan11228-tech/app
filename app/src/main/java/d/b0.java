package d;

import java.util.ArrayList;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class b0 {

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f1326c = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f1327d = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    /* renamed from: e, reason: collision with root package name */
    public static final b0 f1328e = null;

    /* renamed from: a, reason: collision with root package name */
    public final String f1329a;

    /* renamed from: b, reason: collision with root package name */
    public final String[] f1330b;

    public b0(String str, String str2, String str3, String[] strArr, c.j.b.c cVar) {
        this.f1329a = str;
        this.f1330b = strArr;
    }

    public static final b0 a(String str) {
        c.j.b.d.d(str, "$this$toMediaType");
        Matcher matcher = f1326c.matcher(str);
        if (!matcher.lookingAt()) {
            throw new IllegalArgumentException(("No subtype found for: \"" + str + '\"').toString());
        }
        String strGroup = matcher.group(1);
        c.j.b.d.c(strGroup, "typeSubtype.group(1)");
        Locale locale = Locale.US;
        c.j.b.d.c(locale, "Locale.US");
        String lowerCase = strGroup.toLowerCase(locale);
        c.j.b.d.c(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
        String strGroup2 = matcher.group(2);
        c.j.b.d.c(strGroup2, "typeSubtype.group(2)");
        Locale locale2 = Locale.US;
        c.j.b.d.c(locale2, "Locale.US");
        String lowerCase2 = strGroup2.toLowerCase(locale2);
        c.j.b.d.c(lowerCase2, "(this as java.lang.String).toLowerCase(locale)");
        ArrayList arrayList = new ArrayList();
        Matcher matcher2 = f1327d.matcher(str);
        for (int iEnd = matcher.end(); iEnd < str.length(); iEnd = matcher2.end()) {
            matcher2.region(iEnd, str.length());
            if (!matcher2.lookingAt()) {
                StringBuilder sbE = b.a.a.a.a.e("Parameter is not formatted correctly: \"");
                String strSubstring = str.substring(iEnd);
                c.j.b.d.c(strSubstring, "(this as java.lang.String).substring(startIndex)");
                sbE.append(strSubstring);
                sbE.append("\" for: \"");
                sbE.append(str);
                sbE.append('\"');
                throw new IllegalArgumentException(sbE.toString().toString());
            }
            String strGroup3 = matcher2.group(1);
            if (strGroup3 != null) {
                String strGroup4 = matcher2.group(2);
                if (strGroup4 == null) {
                    strGroup4 = matcher2.group(3);
                } else if (c.m.e.z(strGroup4, "'", false, 2) && c.m.e.d(strGroup4, "'", false, 2) && strGroup4.length() > 2) {
                    strGroup4 = strGroup4.substring(1, strGroup4.length() - 1);
                    c.j.b.d.c(strGroup4, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                }
                arrayList.add(strGroup3);
                arrayList.add(strGroup4);
            }
        }
        Object[] array = arrayList.toArray(new String[0]);
        if (array != null) {
            return new b0(str, lowerCase, lowerCase2, (String[]) array, null);
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    public boolean equals(Object obj) {
        return (obj instanceof b0) && c.j.b.d.a(((b0) obj).f1329a, this.f1329a);
    }

    public int hashCode() {
        return this.f1329a.hashCode();
    }

    public String toString() {
        return this.f1329a;
    }
}
