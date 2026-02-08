package e.b0;

import c.j.b.d;
import e.e;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f1754a;

    static {
        d.d("0123456789abcdef", "$this$asUtf8ToByteArray");
        byte[] bytes = "0123456789abcdef".getBytes(c.m.a.f1303a);
        d.c(bytes, "(this as java.lang.String).getBytes(charset)");
        f1754a = bytes;
    }

    public static final String a(e eVar, long j) {
        d.d(eVar, "$this$readUtf8Line");
        if (j > 0) {
            long j2 = j - 1;
            if (eVar.z(j2) == ((byte) 13)) {
                String strI = eVar.I(j2);
                eVar.p(2L);
                return strI;
            }
        }
        String strI2 = eVar.I(j);
        eVar.p(1L);
        return strI2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x005b, code lost:
    
        if (r19 == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005d, code lost:
    
        return -2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005e, code lost:
    
        return r10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final int b(e.e r17, e.q r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 175
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e.b0.a.b(e.e, e.q, boolean):int");
    }
}
