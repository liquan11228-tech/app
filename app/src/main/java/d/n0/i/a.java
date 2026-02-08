package d.n0.i;

import c.j.b.d;
import c.m.e;
import d.y;
import e.g;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public long f1513a;

    /* renamed from: b, reason: collision with root package name */
    public final g f1514b;

    public a(g gVar) {
        d.d(gVar, "source");
        this.f1514b = gVar;
        this.f1513a = 262144;
    }

    public final y a() {
        ArrayList arrayList = new ArrayList(20);
        while (true) {
            String strB = b();
            if (strB.length() == 0) {
                break;
            }
            d.d(strB, "line");
            int iJ = e.j(strB, ':', 1, false, 4);
            if (iJ != -1) {
                String strSubstring = strB.substring(0, iJ);
                d.c(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                strB = strB.substring(iJ + 1);
                d.c(strB, "(this as java.lang.String).substring(startIndex)");
                d.d(strSubstring, "name");
                d.d(strB, "value");
                arrayList.add(strSubstring);
            } else {
                if (strB.charAt(0) == ':') {
                    strB = strB.substring(1);
                    d.c(strB, "(this as java.lang.String).substring(startIndex)");
                }
                d.d("", "name");
                d.d(strB, "value");
                arrayList.add("");
            }
            arrayList.add(e.C(strB).toString());
        }
        Object[] array = arrayList.toArray(new String[0]);
        if (array != null) {
            return new y((String[]) array, null);
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    public final String b() {
        String strO = this.f1514b.o(this.f1513a);
        this.f1513a -= strO.length();
        return strO;
    }
}
