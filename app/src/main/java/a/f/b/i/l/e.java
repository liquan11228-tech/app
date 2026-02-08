package a.f.b.i.l;

import a.f.b.i.d;
import a.f.b.i.l.b;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public class e {

    /* renamed from: a */
    public a.f.b.i.e f496a;

    /* renamed from: d */
    public a.f.b.i.e f499d;
    public b.InterfaceC0008b f;
    public b.a g;
    public ArrayList<k> h;

    /* renamed from: b */
    public boolean f497b = true;

    /* renamed from: c */
    public boolean f498c = true;

    /* renamed from: e */
    public ArrayList<m> f500e = new ArrayList<>();

    public e(a.f.b.i.e eVar) {
        new ArrayList();
        this.f = null;
        this.g = new b.a();
        this.h = new ArrayList<>();
        this.f496a = eVar;
        this.f499d = eVar;
    }

    public final void a(f fVar, int i, int i2, f fVar2, ArrayList<k> arrayList, k kVar) {
        m mVar = fVar.f504d;
        if (mVar.f515c == null) {
            a.f.b.i.e eVar = this.f496a;
            if (mVar == eVar.f481d || mVar == eVar.f482e) {
                return;
            }
            if (kVar == null) {
                kVar = new k(mVar, i2);
                arrayList.add(kVar);
            }
            mVar.f515c = kVar;
            kVar.f512b.add(mVar);
            for (d dVar : mVar.h.k) {
                if (dVar instanceof f) {
                    a((f) dVar, i, 0, fVar2, arrayList, kVar);
                }
            }
            for (d dVar2 : mVar.i.k) {
                if (dVar2 instanceof f) {
                    a((f) dVar2, i, 1, fVar2, arrayList, kVar);
                }
            }
            if (i == 1 && (mVar instanceof l)) {
                for (d dVar3 : ((l) mVar).k.k) {
                    if (dVar3 instanceof f) {
                        a((f) dVar3, i, 2, fVar2, arrayList, kVar);
                    }
                }
            }
            Iterator<f> it = mVar.h.l.iterator();
            while (it.hasNext()) {
                a(it.next(), i, 0, fVar2, arrayList, kVar);
            }
            Iterator<f> it2 = mVar.i.l.iterator();
            while (it2.hasNext()) {
                a(it2.next(), i, 1, fVar2, arrayList, kVar);
            }
            if (i == 1 && (mVar instanceof l)) {
                Iterator<f> it3 = ((l) mVar).k.l.iterator();
                while (it3.hasNext()) {
                    a(it3.next(), i, 2, fVar2, arrayList, kVar);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:205:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x01ad A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:353:0x0010 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean b(a.f.b.i.e r19) {
        /*
            Method dump skipped, instructions count: 600
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a.f.b.i.l.e.b(a.f.b.i.e):boolean");
    }

    public void c() {
        m hVar;
        ArrayList<m> arrayList = this.f500e;
        arrayList.clear();
        this.f499d.f481d.f();
        this.f499d.f482e.f();
        arrayList.add(this.f499d.f481d);
        arrayList.add(this.f499d.f482e);
        Iterator<a.f.b.i.d> it = this.f499d.f0.iterator();
        HashSet hashSet = null;
        while (it.hasNext()) {
            a.f.b.i.d next = it.next();
            if (next instanceof a.f.b.i.f) {
                hVar = new h(next);
            } else {
                if (next.s()) {
                    if (next.f479b == null) {
                        next.f479b = new c(next, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(next.f479b);
                } else {
                    arrayList.add(next.f481d);
                }
                if (next.t()) {
                    if (next.f480c == null) {
                        next.f480c = new c(next, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(next.f480c);
                } else {
                    arrayList.add(next.f482e);
                }
                if (next instanceof a.f.b.i.h) {
                    hVar = new i(next);
                }
            }
            arrayList.add(hVar);
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator<m> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            it2.next().f();
        }
        Iterator<m> it3 = arrayList.iterator();
        while (it3.hasNext()) {
            m next2 = it3.next();
            if (next2.f514b != this.f499d) {
                next2.d();
            }
        }
        this.h.clear();
        k.f510c = 0;
        e(this.f496a.f481d, 0, this.h);
        e(this.f496a.f482e, 1, this.h);
        this.f497b = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:81:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int d(a.f.b.i.e r17, int r18) {
        /*
            Method dump skipped, instructions count: 300
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a.f.b.i.l.e.d(a.f.b.i.e, int):int");
    }

    public final void e(m mVar, int i, ArrayList<k> arrayList) {
        for (d dVar : mVar.h.k) {
            if (dVar instanceof f) {
                a((f) dVar, i, 0, mVar.i, arrayList, null);
            } else if (dVar instanceof m) {
                a(((m) dVar).h, i, 0, mVar.i, arrayList, null);
            }
        }
        for (d dVar2 : mVar.i.k) {
            if (dVar2 instanceof f) {
                a((f) dVar2, i, 1, mVar.h, arrayList, null);
            } else if (dVar2 instanceof m) {
                a(((m) dVar2).i, i, 1, mVar.h, arrayList, null);
            }
        }
        if (i == 1) {
            for (d dVar3 : ((l) mVar).k.k) {
                if (dVar3 instanceof f) {
                    a((f) dVar3, i, 2, null, arrayList, null);
                }
            }
        }
    }

    public final void f(a.f.b.i.d dVar, d.a aVar, int i, d.a aVar2, int i2) {
        b.a aVar3 = this.g;
        aVar3.f491a = aVar;
        aVar3.f492b = aVar2;
        aVar3.f493c = i;
        aVar3.f494d = i2;
        ((ConstraintLayout.b) this.f).a(dVar, aVar3);
        dVar.B(this.g.f495e);
        dVar.w(this.g.f);
        b.a aVar4 = this.g;
        dVar.w = aVar4.h;
        int i3 = aVar4.g;
        dVar.R = i3;
        dVar.w = i3 > 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:77:0x007a, code lost:
    
        if (r13 == r7) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x007c, code lost:
    
        r0.m = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x007f, code lost:
    
        r0.c(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x00a2, code lost:
    
        if (r11 == r7) goto L78;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void g() {
        /*
            r14 = this;
            a.f.b.i.d$a r6 = a.f.b.i.d.a.FIXED
            a.f.b.i.d$a r7 = a.f.b.i.d.a.MATCH_CONSTRAINT
            a.f.b.i.d$a r8 = a.f.b.i.d.a.WRAP_CONTENT
            a.f.b.i.e r0 = r14.f496a
            java.util.ArrayList<a.f.b.i.d> r0 = r0.f0
            java.util.Iterator r9 = r0.iterator()
        Le:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto Lb6
            java.lang.Object r0 = r9.next()
            r10 = r0
            a.f.b.i.d r10 = (a.f.b.i.d) r10
            boolean r0 = r10.f478a
            if (r0 == 0) goto L20
            goto Le
        L20:
            a.f.b.i.d$a[] r0 = r10.J
            r1 = 0
            r11 = r0[r1]
            r12 = 1
            r13 = r0[r12]
            int r0 = r10.j
            int r2 = r10.k
            if (r11 == r8) goto L35
            if (r11 != r7) goto L33
            if (r0 != r12) goto L33
            goto L35
        L33:
            r0 = r1
            goto L36
        L35:
            r0 = r12
        L36:
            if (r13 == r8) goto L3c
            if (r13 != r7) goto L3d
            if (r2 != r12) goto L3d
        L3c:
            r1 = r12
        L3d:
            a.f.b.i.l.j r2 = r10.f481d
            a.f.b.i.l.g r2 = r2.f517e
            boolean r3 = r2.j
            a.f.b.i.l.l r4 = r10.f482e
            a.f.b.i.l.g r4 = r4.f517e
            boolean r5 = r4.j
            if (r3 == 0) goto L5b
            if (r5 == 0) goto L5b
            int r3 = r2.g
            int r5 = r4.g
            r0 = r14
            r1 = r10
            r2 = r6
            r4 = r6
            r0.f(r1, r2, r3, r4, r5)
        L58:
            r10.f478a = r12
            goto La5
        L5b:
            if (r3 == 0) goto L83
            if (r1 == 0) goto L83
            a.f.b.i.l.j r0 = r10.f481d
            a.f.b.i.l.g r0 = r0.f517e
            int r3 = r0.g
            a.f.b.i.l.l r0 = r10.f482e
            a.f.b.i.l.g r0 = r0.f517e
            int r5 = r0.g
            r0 = r14
            r1 = r10
            r2 = r6
            r4 = r8
            r0.f(r1, r2, r3, r4, r5)
            a.f.b.i.l.l r0 = r10.f482e
            a.f.b.i.l.g r0 = r0.f517e
            int r1 = r10.i()
            if (r13 != r7) goto L7f
        L7c:
            r0.m = r1
            goto La5
        L7f:
            r0.c(r1)
            goto L58
        L83:
            if (r5 == 0) goto La5
            if (r0 == 0) goto La5
            a.f.b.i.l.j r0 = r10.f481d
            a.f.b.i.l.g r0 = r0.f517e
            int r3 = r0.g
            a.f.b.i.l.l r0 = r10.f482e
            a.f.b.i.l.g r0 = r0.f517e
            int r5 = r0.g
            r0 = r14
            r1 = r10
            r2 = r8
            r4 = r6
            r0.f(r1, r2, r3, r4, r5)
            a.f.b.i.l.j r0 = r10.f481d
            a.f.b.i.l.g r0 = r0.f517e
            int r1 = r10.o()
            if (r11 != r7) goto L7f
            goto L7c
        La5:
            boolean r0 = r10.f478a
            if (r0 == 0) goto Le
            a.f.b.i.l.l r0 = r10.f482e
            a.f.b.i.l.g r0 = r0.l
            if (r0 == 0) goto Le
            int r1 = r10.R
            r0.c(r1)
            goto Le
        Lb6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a.f.b.i.l.e.g():void");
    }
}
