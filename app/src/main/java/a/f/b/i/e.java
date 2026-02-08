package a.f.b.i;

import a.b.k.h;
import a.f.b.i.d;
import a.f.b.i.l.b;
import a.f.b.i.l.m;
import java.util.Arrays;
import java.util.Iterator;

/* loaded from: classes.dex */
public class e extends k {
    public int l0;
    public int m0;
    public a.f.b.i.l.b g0 = new a.f.b.i.l.b(this);
    public a.f.b.i.l.e h0 = new a.f.b.i.l.e(this);
    public b.InterfaceC0008b i0 = null;
    public boolean j0 = false;
    public a.f.b.d k0 = new a.f.b.d();
    public int n0 = 0;
    public int o0 = 0;
    public b[] p0 = new b[4];
    public b[] q0 = new b[4];
    public int r0 = 263;
    public boolean s0 = false;
    public boolean t0 = false;

    @Override // a.f.b.i.d
    public void C(boolean z, boolean z2) {
        super.C(z, z2);
        int size = this.f0.size();
        for (int i = 0; i < size; i++) {
            this.f0.get(i).C(z, z2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:143:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x00d1 A[Catch: Exception -> 0x00dd, TryCatch #1 {Exception -> 0x00dd, blocks: (B:168:0x00b2, B:170:0x00b8, B:181:0x00d1, B:173:0x00bd, B:175:0x00c1, B:182:0x00d7, B:178:0x00cb), top: B:244:0x00b2 }] */
    /* JADX WARN: Removed duplicated region for block: B:190:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0215 A[PHI: r0 r14
  0x0215: PHI (r0v30 boolean) = (r0v29 boolean), (r0v32 boolean), (r0v32 boolean), (r0v32 boolean) binds: [B:222:0x01df, B:230:0x01ff, B:231:0x0201, B:233:0x0207] A[DONT_GENERATE, DONT_INLINE]
  0x0215: PHI (r14v5 boolean) = (r14v4 boolean), (r14v7 boolean), (r14v7 boolean), (r14v7 boolean) binds: [B:222:0x01df, B:230:0x01ff, B:231:0x0201, B:233:0x0207] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v13 */
    @Override // a.f.b.i.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void E() {
        /*
            Method dump skipped, instructions count: 561
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a.f.b.i.e.E():void");
    }

    public void F(d dVar, int i) {
        if (i == 0) {
            int i2 = this.n0 + 1;
            b[] bVarArr = this.q0;
            if (i2 >= bVarArr.length) {
                this.q0 = (b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
            }
            this.q0[this.n0] = new b(dVar, 0, this.j0);
            this.n0++;
            return;
        }
        if (i == 1) {
            int i3 = this.o0 + 1;
            b[] bVarArr2 = this.p0;
            if (i3 >= bVarArr2.length) {
                this.p0 = (b[]) Arrays.copyOf(bVarArr2, bVarArr2.length * 2);
            }
            this.p0[this.o0] = new b(dVar, 1, this.j0);
            this.o0++;
        }
    }

    public boolean G(a.f.b.d dVar) {
        d.a aVar = d.a.FIXED;
        d.a aVar2 = d.a.WRAP_CONTENT;
        b(dVar);
        int size = this.f0.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            d dVar2 = this.f0.get(i);
            boolean[] zArr = dVar2.I;
            zArr[0] = false;
            zArr[1] = false;
            if (dVar2 instanceof a) {
                z = true;
            }
        }
        if (z) {
            for (int i2 = 0; i2 < size; i2++) {
                d dVar3 = this.f0.get(i2);
                if (dVar3 instanceof a) {
                    a aVar3 = (a) dVar3;
                    for (int i3 = 0; i3 < aVar3.g0; i3++) {
                        d dVar4 = aVar3.f0[i3];
                        int i4 = aVar3.h0;
                        if (i4 == 0 || i4 == 1) {
                            dVar4.I[0] = true;
                        } else if (i4 == 2 || i4 == 3) {
                            dVar4.I[1] = true;
                        }
                    }
                }
            }
        }
        for (int i5 = 0; i5 < size; i5++) {
            d dVar5 = this.f0.get(i5);
            if (dVar5 == null) {
                throw null;
            }
            if ((dVar5 instanceof j) || (dVar5 instanceof f)) {
                dVar5.b(dVar);
            }
        }
        for (int i6 = 0; i6 < size; i6++) {
            d dVar6 = this.f0.get(i6);
            if (dVar6 instanceof e) {
                d.a[] aVarArr = dVar6.J;
                d.a aVar4 = aVarArr[0];
                d.a aVar5 = aVarArr[1];
                if (aVar4 == aVar2) {
                    aVarArr[0] = aVar;
                }
                if (aVar5 == aVar2) {
                    dVar6.J[1] = aVar;
                }
                dVar6.b(dVar);
                if (aVar4 == aVar2) {
                    dVar6.x(aVar4);
                }
                if (aVar5 == aVar2) {
                    dVar6.A(aVar5);
                }
            } else {
                d.a aVar6 = d.a.MATCH_PARENT;
                dVar6.h = -1;
                dVar6.i = -1;
                if (this.J[0] != aVar2 && dVar6.J[0] == aVar6) {
                    int i7 = dVar6.y.f473e;
                    int iO = o() - dVar6.A.f473e;
                    c cVar = dVar6.y;
                    cVar.g = dVar.l(cVar);
                    c cVar2 = dVar6.A;
                    cVar2.g = dVar.l(cVar2);
                    dVar.e(dVar6.y.g, i7);
                    dVar.e(dVar6.A.g, iO);
                    dVar6.h = 2;
                    dVar6.P = i7;
                    int i8 = iO - i7;
                    dVar6.L = i8;
                    int i9 = dVar6.S;
                    if (i8 < i9) {
                        dVar6.L = i9;
                    }
                }
                if (this.J[1] != aVar2 && dVar6.J[1] == aVar6) {
                    int i10 = dVar6.z.f473e;
                    int i11 = i() - dVar6.B.f473e;
                    c cVar3 = dVar6.z;
                    cVar3.g = dVar.l(cVar3);
                    c cVar4 = dVar6.B;
                    cVar4.g = dVar.l(cVar4);
                    dVar.e(dVar6.z.g, i10);
                    dVar.e(dVar6.B.g, i11);
                    if (dVar6.R > 0 || dVar6.X == 8) {
                        c cVar5 = dVar6.C;
                        cVar5.g = dVar.l(cVar5);
                        dVar.e(dVar6.C.g, dVar6.R + i10);
                    }
                    dVar6.i = 2;
                    dVar6.Q = i10;
                    int i12 = i11 - i10;
                    dVar6.M = i12;
                    int i13 = dVar6.T;
                    if (i12 < i13) {
                        dVar6.M = i13;
                    }
                }
                if (!((dVar6 instanceof j) || (dVar6 instanceof f))) {
                    dVar6.b(dVar);
                }
            }
        }
        if (this.n0 > 0) {
            h.i.e(this, dVar, 0);
        }
        if (this.o0 > 0) {
            h.i.e(this, dVar, 1);
        }
        return true;
    }

    public boolean H(boolean z, int i) {
        a.f.b.i.l.g gVar;
        int i2;
        boolean z2;
        a.f.b.i.l.g gVar2;
        int i3;
        a.f.b.i.l.e eVar = this.h0;
        d.a aVar = d.a.MATCH_PARENT;
        d.a aVar2 = d.a.WRAP_CONTENT;
        d.a aVar3 = d.a.FIXED;
        boolean z3 = true;
        boolean z4 = z & true;
        d.a aVarH = eVar.f496a.h(0);
        d.a aVarH2 = eVar.f496a.h(1);
        int iP = eVar.f496a.p();
        int iQ = eVar.f496a.q();
        if (z4 && (aVarH == aVar2 || aVarH2 == aVar2)) {
            Iterator<m> it = eVar.f500e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                m next = it.next();
                if (next.f == i && !next.k()) {
                    z4 = false;
                    break;
                }
            }
            if (i == 0) {
                if (z4 && aVarH == aVar2) {
                    e eVar2 = eVar.f496a;
                    eVar2.J[0] = aVar3;
                    eVar2.B(eVar.d(eVar2, 0));
                    e eVar3 = eVar.f496a;
                    gVar2 = eVar3.f481d.f517e;
                    i3 = eVar3.o();
                    gVar2.c(i3);
                }
            } else if (z4 && aVarH2 == aVar2) {
                e eVar4 = eVar.f496a;
                eVar4.J[1] = aVar3;
                eVar4.w(eVar.d(eVar4, 1));
                e eVar5 = eVar.f496a;
                gVar2 = eVar5.f482e.f517e;
                i3 = eVar5.i();
                gVar2.c(i3);
            }
        }
        d.a[] aVarArr = eVar.f496a.J;
        if (i == 0) {
            if (aVarArr[0] == aVar3 || aVarArr[0] == aVar) {
                int iO = eVar.f496a.o() + iP;
                eVar.f496a.f481d.i.c(iO);
                gVar = eVar.f496a.f481d.f517e;
                i2 = iO - iP;
                gVar.c(i2);
                z2 = true;
            }
            z2 = false;
        } else {
            if (aVarArr[1] == aVar3 || aVarArr[1] == aVar) {
                int i4 = eVar.f496a.i() + iQ;
                eVar.f496a.f482e.i.c(i4);
                gVar = eVar.f496a.f482e.f517e;
                i2 = i4 - iQ;
                gVar.c(i2);
                z2 = true;
            }
            z2 = false;
        }
        eVar.g();
        Iterator<m> it2 = eVar.f500e.iterator();
        while (it2.hasNext()) {
            m next2 = it2.next();
            if (next2.f == i && (next2.f514b != eVar.f496a || next2.g)) {
                next2.e();
            }
        }
        Iterator<m> it3 = eVar.f500e.iterator();
        while (it3.hasNext()) {
            m next3 = it3.next();
            if (next3.f == i && (z2 || next3.f514b != eVar.f496a)) {
                if (!next3.h.j || !next3.i.j || (!(next3 instanceof a.f.b.i.l.c) && !next3.f517e.j)) {
                    z3 = false;
                    break;
                }
            }
        }
        eVar.f496a.x(aVarH);
        eVar.f496a.A(aVarH2);
        return z3;
    }

    public void I() {
        this.h0.f497b = true;
    }

    public void J(int i) {
        this.r0 = i;
        a.f.b.d.r = i.a(i, 256);
    }

    @Override // a.f.b.i.k, a.f.b.i.d
    public void u() {
        this.k0.t();
        this.l0 = 0;
        this.m0 = 0;
        super.u();
    }
}
