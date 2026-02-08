package d;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final Map<String, String> f1384a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1385b;

    public j(String str, Map<String, String> map) {
        String lowerCase;
        c.j.b.d.d(str, "scheme");
        c.j.b.d.d(map, "authParams");
        this.f1385b = str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (key != null) {
                Locale locale = Locale.US;
                c.j.b.d.c(locale, "US");
                lowerCase = key.toLowerCase(locale);
                c.j.b.d.c(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
            } else {
                lowerCase = null;
            }
            linkedHashMap.put(lowerCase, value);
        }
        Map<String, String> mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        c.j.b.d.c(mapUnmodifiableMap, "unmodifiableMap<String?, String>(newAuthParams)");
        this.f1384a = mapUnmodifiableMap;
    }

    public boolean equals(Object obj) {
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (c.j.b.d.a(jVar.f1385b, this.f1385b) && c.j.b.d.a(jVar.f1384a, this.f1384a)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.f1384a.hashCode() + ((this.f1385b.hashCode() + 899) * 31);
    }

    public String toString() {
        return this.f1385b + " authParams=" + this.f1384a;
    }
}
