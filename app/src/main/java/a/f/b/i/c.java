package a.f.b.i;

import a.f.b.g;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public class c {

    /* renamed from: b */
    public final d f470b;

    /* renamed from: c */
    public final a f471c;

    /* renamed from: d */
    public c f472d;
    public a.f.b.g g;

    /* renamed from: a */
    public HashSet<c> f469a = null;

    /* renamed from: e */
    public int f473e = 0;
    public int f = -1;

    public enum a {
        NONE,
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        BASELINE,
        CENTER,
        CENTER_X,
        CENTER_Y
    }

    public c(d dVar, a aVar) {
        this.f470b = dVar;
        this.f471c = aVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:84:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean a(a.f.b.i.c r7, int r8, int r9, boolean r10) {
        /*
            r6 = this;
            r0 = 1
            if (r7 != 0) goto L7
            r6.e()
            return r0
        L7:
            r1 = 0
            if (r10 != 0) goto L75
            a.f.b.i.c$a r10 = a.f.b.i.c.a.CENTER_Y
            a.f.b.i.c$a r2 = a.f.b.i.c.a.CENTER_X
            a.f.b.i.c$a r3 = a.f.b.i.c.a.BASELINE
            a.f.b.i.c$a r4 = r7.f471c
            a.f.b.i.c$a r5 = r6.f471c
            if (r4 != r5) goto L25
            if (r5 != r3) goto L3e
            a.f.b.i.d r10 = r7.f470b
            boolean r10 = r10.w
            if (r10 == 0) goto L40
            a.f.b.i.d r10 = r6.f470b
            boolean r10 = r10.w
            if (r10 != 0) goto L3e
            goto L40
        L25:
            int r5 = r5.ordinal()
            switch(r5) {
                case 0: goto L40;
                case 1: goto L5b;
                case 2: goto L42;
                case 3: goto L5b;
                case 4: goto L42;
                case 5: goto L40;
                case 6: goto L38;
                case 7: goto L40;
                case 8: goto L40;
                default: goto L2c;
            }
        L2c:
            java.lang.AssertionError r7 = new java.lang.AssertionError
            a.f.b.i.c$a r8 = r6.f471c
            java.lang.String r8 = r8.name()
            r7.<init>(r8)
            throw r7
        L38:
            if (r4 == r3) goto L40
            if (r4 == r2) goto L40
            if (r4 == r10) goto L40
        L3e:
            r10 = r0
            goto L72
        L40:
            r10 = r1
            goto L72
        L42:
            a.f.b.i.c$a r2 = a.f.b.i.c.a.TOP
            if (r4 == r2) goto L4d
            a.f.b.i.c$a r2 = a.f.b.i.c.a.BOTTOM
            if (r4 != r2) goto L4b
            goto L4d
        L4b:
            r2 = r1
            goto L4e
        L4d:
            r2 = r0
        L4e:
            a.f.b.i.d r3 = r7.f470b
            boolean r3 = r3 instanceof a.f.b.i.f
            if (r3 == 0) goto L59
            if (r2 != 0) goto L3e
            if (r4 != r10) goto L40
            goto L3e
        L59:
            r10 = r2
            goto L72
        L5b:
            a.f.b.i.c$a r10 = a.f.b.i.c.a.LEFT
            if (r4 == r10) goto L66
            a.f.b.i.c$a r10 = a.f.b.i.c.a.RIGHT
            if (r4 != r10) goto L64
            goto L66
        L64:
            r10 = r1
            goto L67
        L66:
            r10 = r0
        L67:
            a.f.b.i.d r3 = r7.f470b
            boolean r3 = r3 instanceof a.f.b.i.f
            if (r3 == 0) goto L72
            if (r10 != 0) goto L3e
            if (r4 != r2) goto L40
            goto L3e
        L72:
            if (r10 != 0) goto L75
            return r1
        L75:
            r6.f472d = r7
            java.util.HashSet<a.f.b.i.c> r10 = r7.f469a
            if (r10 != 0) goto L82
            java.util.HashSet r10 = new java.util.HashSet
            r10.<init>()
            r7.f469a = r10
        L82:
            a.f.b.i.c r7 = r6.f472d
            java.util.HashSet<a.f.b.i.c> r7 = r7.f469a
            r7.add(r6)
            if (r8 <= 0) goto L8e
            r6.f473e = r8
            goto L90
        L8e:
            r6.f473e = r1
        L90:
            r6.f = r9
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a.f.b.i.c.a(a.f.b.i.c, int, int, boolean):boolean");
    }

    public int b() {
        c cVar;
        if (this.f470b.X == 8) {
            return 0;
        }
        int i = this.f;
        return (i <= -1 || (cVar = this.f472d) == null || cVar.f470b.X != 8) ? this.f473e : i;
    }

    public boolean c() {
        c cVar;
        HashSet<c> hashSet = this.f469a;
        if (hashSet == null) {
            return false;
        }
        Iterator<c> it = hashSet.iterator();
        while (it.hasNext()) {
            c next = it.next();
            switch (next.f471c) {
                case NONE:
                case BASELINE:
                case CENTER:
                case CENTER_X:
                case CENTER_Y:
                    cVar = null;
                    break;
                case LEFT:
                    cVar = next.f470b.A;
                    break;
                case TOP:
                    cVar = next.f470b.B;
                    break;
                case RIGHT:
                    cVar = next.f470b.y;
                    break;
                case BOTTOM:
                    cVar = next.f470b.z;
                    break;
                default:
                    throw new AssertionError(next.f471c.name());
            }
            if (cVar.d()) {
                return true;
            }
        }
        return false;
    }

    public boolean d() {
        return this.f472d != null;
    }

    public void e() {
        HashSet<c> hashSet;
        c cVar = this.f472d;
        if (cVar != null && (hashSet = cVar.f469a) != null) {
            hashSet.remove(this);
        }
        this.f472d = null;
        this.f473e = 0;
        this.f = -1;
    }

    public void f() {
        a.f.b.g gVar = this.g;
        if (gVar == null) {
            this.g = new a.f.b.g(g.a.UNRESTRICTED);
        } else {
            gVar.c();
        }
    }

    public String toString() {
        return this.f470b.Y + ":" + this.f471c.toString();
    }
}
