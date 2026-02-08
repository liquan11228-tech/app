package d;

import java.io.Closeable;

/* loaded from: classes.dex */
public abstract class i0 implements Closeable {

    /* renamed from: b */
    public static final a f1383b = new a(null);

    public static final class a {
        public a(c.j.b.c cVar) {
        }
    }

    public abstract b0 A();

    public abstract e.g B();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        d.n0.c.e(B());
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x004e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.nio.charset.Charset y() {
        /*
            r8 = this;
            d.b0 r0 = r8.A()
            if (r0 == 0) goto L55
            java.nio.charset.Charset r1 = c.m.a.f1303a
            java.lang.String r2 = "charset"
            java.lang.String r3 = "name"
            c.j.b.d.d(r2, r3)
            java.lang.String[] r3 = r0.f1330b
            java.lang.String r4 = "$this$indices"
            c.j.b.d.d(r3, r4)
            c.k.c r4 = new c.k.c
            java.lang.String r5 = "$this$lastIndex"
            c.j.b.d.d(r3, r5)
            int r3 = r3.length
            int r3 = r3 + (-1)
            r5 = 0
            r4.<init>(r5, r3)
            r3 = 2
            c.k.a r3 = c.k.d.b(r4, r3)
            int r4 = r3.f1286b
            int r5 = r3.f1287c
            int r3 = r3.f1288d
            if (r3 < 0) goto L34
            if (r4 > r5) goto L4b
            goto L36
        L34:
            if (r4 < r5) goto L4b
        L36:
            java.lang.String[] r6 = r0.f1330b
            r6 = r6[r4]
            r7 = 1
            boolean r6 = c.m.e.e(r6, r2, r7)
            if (r6 == 0) goto L47
            java.lang.String[] r0 = r0.f1330b
            int r4 = r4 + r7
            r0 = r0[r4]
            goto L4c
        L47:
            if (r4 == r5) goto L4b
            int r4 = r4 + r3
            goto L36
        L4b:
            r0 = 0
        L4c:
            if (r0 == 0) goto L52
            java.nio.charset.Charset r1 = java.nio.charset.Charset.forName(r0)     // Catch: java.lang.IllegalArgumentException -> L52
        L52:
            if (r1 == 0) goto L55
            goto L57
        L55:
            java.nio.charset.Charset r1 = c.m.a.f1303a
        L57:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: d.i0.y():java.nio.charset.Charset");
    }

    public abstract long z();
}
