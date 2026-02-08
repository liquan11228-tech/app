package a.f.b.i.l;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class c extends m {
    public ArrayList<m> k;
    public int l;

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0042 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0034  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:79:0x0038 -> B:80:0x003a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public c(a.f.b.i.d r4, int r5) {
        /*
            r3 = this;
            r3.<init>(r4)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r3.k = r4
            r3.f = r5
            a.f.b.i.d r4 = r3.f514b
        Le:
            int r5 = r3.f
            a.f.b.i.d r5 = r4.l(r5)
            if (r5 == 0) goto L18
            r4 = r5
            goto Le
        L18:
            r3.f514b = r4
            java.util.ArrayList<a.f.b.i.l.m> r5 = r3.k
            int r0 = r3.f
            r1 = 1
            if (r0 != 0) goto L23
            r0 = r3
            goto L3a
        L23:
            if (r0 != r1) goto L27
            r0 = r3
            goto L3f
        L27:
            r0 = r3
        L28:
            r2 = 0
        L29:
            r5.add(r2)
            int r5 = r0.f
            a.f.b.i.d r4 = r4.k(r5)
            if (r4 == 0) goto L42
            java.util.ArrayList<a.f.b.i.l.m> r5 = r0.k
            int r2 = r0.f
            if (r2 != 0) goto L3d
        L3a:
            a.f.b.i.l.j r2 = r4.f481d
            goto L29
        L3d:
            if (r2 != r1) goto L28
        L3f:
            a.f.b.i.l.l r2 = r4.f482e
            goto L29
        L42:
            java.util.ArrayList<a.f.b.i.l.m> r4 = r0.k
            java.util.Iterator r4 = r4.iterator()
        L48:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L64
            java.lang.Object r5 = r4.next()
            a.f.b.i.l.m r5 = (a.f.b.i.l.m) r5
            int r2 = r0.f
            if (r2 != 0) goto L5d
            a.f.b.i.d r5 = r5.f514b
            r5.f479b = r0
            goto L48
        L5d:
            if (r2 != r1) goto L48
            a.f.b.i.d r5 = r5.f514b
            r5.f480c = r0
            goto L48
        L64:
            int r4 = r0.f
            if (r4 != 0) goto L74
            a.f.b.i.d r4 = r0.f514b
            a.f.b.i.d r4 = r4.K
            a.f.b.i.e r4 = (a.f.b.i.e) r4
            boolean r4 = r4.j0
            if (r4 == 0) goto L74
            r4 = r1
            goto L75
        L74:
            r4 = 0
        L75:
            if (r4 == 0) goto L90
            java.util.ArrayList<a.f.b.i.l.m> r4 = r0.k
            int r4 = r4.size()
            if (r4 <= r1) goto L90
            java.util.ArrayList<a.f.b.i.l.m> r4 = r0.k
            int r5 = r4.size()
            int r5 = r5 - r1
            java.lang.Object r4 = r4.get(r5)
            a.f.b.i.l.m r4 = (a.f.b.i.l.m) r4
            a.f.b.i.d r4 = r4.f514b
            r0.f514b = r4
        L90:
            int r4 = r0.f
            if (r4 != 0) goto L99
            a.f.b.i.d r4 = r0.f514b
            int r4 = r4.a0
            goto L9d
        L99:
            a.f.b.i.d r4 = r0.f514b
            int r4 = r4.b0
        L9d:
            r0.l = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a.f.b.i.l.c.<init>(a.f.b.i.d, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:458:0x01b4 A[PHI: r1 r22 r23
  0x01b4: PHI (r1v46 int) = (r1v44 int), (r1v52 int) binds: [B:457:0x01b2, B:448:0x018c] A[DONT_GENERATE, DONT_INLINE]
  0x01b4: PHI (r22v3 float) = (r22v2 float), (r22v5 float) binds: [B:457:0x01b2, B:448:0x018c] A[DONT_GENERATE, DONT_INLINE]
  0x01b4: PHI (r23v8 a.f.b.i.d$a) = (r23v7 a.f.b.i.d$a), (r23v10 a.f.b.i.d$a) binds: [B:457:0x01b2, B:448:0x018c] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // a.f.b.i.l.m, a.f.b.i.l.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(a.f.b.i.l.d r25) {
        /*
            Method dump skipped, instructions count: 990
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a.f.b.i.l.c.a(a.f.b.i.l.d):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x0078 A[PHI: r0 r1
  0x0078: PHI (r0v15 int) = (r0v10 int), (r0v20 int) binds: [B:63:0x00c4, B:53:0x0076] A[DONT_GENERATE, DONT_INLINE]
  0x0078: PHI (r1v3 a.f.b.i.l.f) = (r1v2 a.f.b.i.l.f), (r1v7 a.f.b.i.l.f) binds: [B:63:0x00c4, B:53:0x0076] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // a.f.b.i.l.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void d() {
        /*
            r6 = this;
            java.util.ArrayList<a.f.b.i.l.m> r0 = r6.k
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L16
            java.lang.Object r1 = r0.next()
            a.f.b.i.l.m r1 = (a.f.b.i.l.m) r1
            r1.d()
            goto L6
        L16:
            java.util.ArrayList<a.f.b.i.l.m> r0 = r6.k
            int r0 = r0.size()
            r1 = 1
            if (r0 >= r1) goto L20
            return
        L20:
            java.util.ArrayList<a.f.b.i.l.m> r2 = r6.k
            r3 = 0
            java.lang.Object r2 = r2.get(r3)
            a.f.b.i.l.m r2 = (a.f.b.i.l.m) r2
            a.f.b.i.d r2 = r2.f514b
            java.util.ArrayList<a.f.b.i.l.m> r4 = r6.k
            int r0 = r0 - r1
            java.lang.Object r0 = r4.get(r0)
            a.f.b.i.l.m r0 = (a.f.b.i.l.m) r0
            a.f.b.i.d r0 = r0.f514b
            int r4 = r6.f
            if (r4 != 0) goto L88
            a.f.b.i.c r1 = r2.y
            a.f.b.i.c r0 = r0.A
            a.f.b.i.l.f r2 = r6.i(r1, r3)
            int r1 = r1.b()
            a.f.b.i.d r4 = r6.m()
            if (r4 == 0) goto L52
            a.f.b.i.c r1 = r4.y
            int r1 = r1.b()
        L52:
            if (r2 == 0) goto L62
            a.f.b.i.l.f r4 = r6.h
            java.util.List<a.f.b.i.l.f> r5 = r4.l
            r5.add(r2)
            r4.f = r1
            java.util.List<a.f.b.i.l.d> r1 = r2.k
            r1.add(r4)
        L62:
            a.f.b.i.l.f r1 = r6.i(r0, r3)
            int r0 = r0.b()
            a.f.b.i.d r2 = r6.n()
            if (r2 == 0) goto L76
            a.f.b.i.c r0 = r2.A
            int r0 = r0.b()
        L76:
            if (r1 == 0) goto Lc7
        L78:
            a.f.b.i.l.f r2 = r6.i
            int r0 = -r0
            java.util.List<a.f.b.i.l.f> r3 = r2.l
            r3.add(r1)
            r2.f = r0
            java.util.List<a.f.b.i.l.d> r0 = r1.k
            r0.add(r2)
            goto Lc7
        L88:
            a.f.b.i.c r2 = r2.z
            a.f.b.i.c r0 = r0.B
            a.f.b.i.l.f r3 = r6.i(r2, r1)
            int r2 = r2.b()
            a.f.b.i.d r4 = r6.m()
            if (r4 == 0) goto La0
            a.f.b.i.c r2 = r4.z
            int r2 = r2.b()
        La0:
            if (r3 == 0) goto Lb0
            a.f.b.i.l.f r4 = r6.h
            java.util.List<a.f.b.i.l.f> r5 = r4.l
            r5.add(r3)
            r4.f = r2
            java.util.List<a.f.b.i.l.d> r2 = r3.k
            r2.add(r4)
        Lb0:
            a.f.b.i.l.f r1 = r6.i(r0, r1)
            int r0 = r0.b()
            a.f.b.i.d r2 = r6.n()
            if (r2 == 0) goto Lc4
            a.f.b.i.c r0 = r2.B
            int r0 = r0.b()
        Lc4:
            if (r1 == 0) goto Lc7
            goto L78
        Lc7:
            a.f.b.i.l.f r0 = r6.h
            r0.f501a = r6
            a.f.b.i.l.f r0 = r6.i
            r0.f501a = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a.f.b.i.l.c.d():void");
    }

    @Override // a.f.b.i.l.m
    public void e() {
        for (int i = 0; i < this.k.size(); i++) {
            this.k.get(i).e();
        }
    }

    @Override // a.f.b.i.l.m
    public void f() {
        this.f515c = null;
        Iterator<m> it = this.k.iterator();
        while (it.hasNext()) {
            it.next().f();
        }
    }

    @Override // a.f.b.i.l.m
    public long j() {
        int size = this.k.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            j = r4.i.f + this.k.get(i).j() + j + r4.h.f;
        }
        return j;
    }

    @Override // a.f.b.i.l.m
    public boolean k() {
        int size = this.k.size();
        for (int i = 0; i < size; i++) {
            if (!this.k.get(i).k()) {
                return false;
            }
        }
        return true;
    }

    public final a.f.b.i.d m() {
        for (int i = 0; i < this.k.size(); i++) {
            a.f.b.i.d dVar = this.k.get(i).f514b;
            if (dVar.X != 8) {
                return dVar;
            }
        }
        return null;
    }

    public final a.f.b.i.d n() {
        for (int size = this.k.size() - 1; size >= 0; size--) {
            a.f.b.i.d dVar = this.k.get(size).f514b;
            if (dVar.X != 8) {
                return dVar;
            }
        }
        return null;
    }

    public String toString() {
        StringBuilder sbE = b.a.a.a.a.e("ChainRun ");
        sbE.append(this.f == 0 ? "horizontal : " : "vertical : ");
        String string = sbE.toString();
        Iterator<m> it = this.k.iterator();
        while (it.hasNext()) {
            m next = it.next();
            string = b.a.a.a.a.b(b.a.a.a.a.b(string, "<") + next, "> ");
        }
        return string;
    }
}
