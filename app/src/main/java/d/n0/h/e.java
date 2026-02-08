package d.n0.h;

import d.g0;
import d.n0.k.h;
import d.y;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final e.h f1499a = e.h.f.b("\"\\");

    /* renamed from: b, reason: collision with root package name */
    public static final e.h f1500b = e.h.f.b("\t ,=");

    public static final List<d.j> a(y yVar, String str) {
        c.j.b.d.d(yVar, "$this$parseChallenges");
        c.j.b.d.d(str, "headerName");
        ArrayList arrayList = new ArrayList();
        int size = yVar.size();
        for (int i = 0; i < size; i++) {
            if (c.m.e.e(str, yVar.b(i), true)) {
                e.e eVar = new e.e();
                eVar.T(yVar.d(i));
                try {
                    c(eVar, arrayList);
                } catch (EOFException e2) {
                    h.a aVar = d.n0.k.h.f1646c;
                    d.n0.k.h.f1644a.i("Unable to parse challenge", 5, e2);
                }
            }
        }
        return arrayList;
    }

    public static final boolean b(g0 g0Var) {
        c.j.b.d.d(g0Var, "$this$promisesBody");
        if (c.j.b.d.a(g0Var.f1361b.f1352c, "HEAD")) {
            return false;
        }
        int i = g0Var.f1364e;
        return (((i >= 100 && i < 200) || i == 204 || i == 304) && d.n0.c.m(g0Var) == -1 && !c.m.e.e("chunked", g0.y(g0Var, "Transfer-Encoding", null, 2), true)) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:111:0x00f7, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x00f7, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0045, code lost:
    
        r6 = new java.lang.StringBuilder();
        r6.append(r5);
        c.j.b.d.d("=", "$this$repeat");
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0056, code lost:
    
        if (r7 < 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0058, code lost:
    
        r8 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005a, code lost:
    
        r8 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005b, code lost:
    
        if (r8 == false) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005d, code lost:
    
        if (r7 == 0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005f, code lost:
    
        if (r7 == 1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0061, code lost:
    
        r8 = "=".length();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0065, code lost:
    
        if (r8 == 0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0067, code lost:
    
        if (r8 == 1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0069, code lost:
    
        r8 = new java.lang.StringBuilder("=".length() * r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0073, code lost:
    
        if (1 > r7) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0075, code lost:
    
        r8.append((java.lang.CharSequence) "=");
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0078, code lost:
    
        if (r10 == r7) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x007a, code lost:
    
        r10 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007d, code lost:
    
        r5 = r8.toString();
        c.j.b.d.c(r5, "sb.toString()");
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0087, code lost:
    
        r5 = "=".charAt(0);
        r8 = new char[r7];
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x008d, code lost:
    
        if (r9 >= r7) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x008f, code lost:
    
        r8[r9] = r5;
        r9 = r9 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0094, code lost:
    
        r5 = new java.lang.String(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x009a, code lost:
    
        r5 = "=".toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x009f, code lost:
    
        r5 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00d8, code lost:
    
        throw new java.lang.IllegalArgumentException(("Count 'n' must be non-negative, but was " + r7 + '.').toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x014f, code lost:
    
        r7 = r3;
     */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0102  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void c(e.e r18, java.util.List<d.j> r19) throws java.io.EOFException {
        /*
            Method dump skipped, instructions count: 412
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: d.n0.h.e.c(e.e, java.util.List):void");
    }

    public static final String d(e.e eVar) {
        long jB = eVar.B(f1500b);
        if (jB == -1) {
            jB = eVar.f1761c;
        }
        if (jB != 0) {
            return eVar.I(jB);
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x01f9, code lost:
    
        if (okhttp3.internal.publicsuffix.PublicSuffixDatabase.g.a(r9) == null) goto L105;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01aa A[PHI: r7
  0x01aa: PHI (r7v10 long) = (r7v9 long), (r7v27 long) binds: [B:69:0x017f, B:80:0x01a7] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void e(d.q r30, d.z r31, d.y r32) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 610
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: d.n0.h.e.e(d.q, d.z, d.y):void");
    }

    public static final boolean f(e.e eVar) throws EOFException {
        boolean z = false;
        while (!eVar.q()) {
            byte bZ = eVar.z(0L);
            if (bZ == 9 || bZ == 32) {
                eVar.readByte();
            } else {
                if (bZ != 44) {
                    break;
                }
                eVar.readByte();
                z = true;
            }
        }
        return z;
    }
}
