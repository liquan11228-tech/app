package a.f.b.i.l;

import a.f.b.i.d;
import a.f.b.i.l.f;

/* loaded from: classes.dex */
public class l extends m {
    public f k;
    public g l;

    public l(a.f.b.i.d dVar) {
        super(dVar);
        f fVar = new f(this);
        this.k = fVar;
        this.l = null;
        this.h.f505e = f.a.TOP;
        this.i.f505e = f.a.BOTTOM;
        fVar.f505e = f.a.BASELINE;
        this.f = 1;
    }

    @Override // a.f.b.i.l.m, a.f.b.i.l.d
    public void a(d dVar) {
        float f;
        int i;
        d.a aVar = d.a.MATCH_CONSTRAINT;
        int iOrdinal = this.j.ordinal();
        if (iOrdinal != 1 && iOrdinal != 2 && iOrdinal == 3) {
            a.f.b.i.d dVar2 = this.f514b;
            l(dVar2.z, dVar2.B, 1);
            return;
        }
        g gVar = this.f517e;
        if (gVar.f503c && !gVar.j && this.f516d == aVar) {
            a.f.b.i.d dVar3 = this.f514b;
            int i2 = dVar3.k;
            if (i2 == 2) {
                a.f.b.i.d dVar4 = dVar3.K;
                if (dVar4 != null) {
                    if (dVar4.f482e.f517e.j) {
                        gVar.c((int) ((r1.g * dVar3.r) + 0.5f));
                    }
                }
            } else if (i2 == 3) {
                if (dVar3.f481d.f517e.j) {
                    int i3 = dVar3.O;
                    if (i3 == -1) {
                        f = r0.g / dVar3.N;
                        i = (int) (f + 0.5f);
                        this.f517e.c(i);
                    } else if (i3 != 0) {
                        if (i3 != 1) {
                            i = 0;
                            this.f517e.c(i);
                        }
                        f = r0.g / dVar3.N;
                        i = (int) (f + 0.5f);
                        this.f517e.c(i);
                    } else {
                        f = r0.g * dVar3.N;
                        i = (int) (f + 0.5f);
                        this.f517e.c(i);
                    }
                }
            }
        }
        f fVar = this.h;
        if (fVar.f503c) {
            f fVar2 = this.i;
            if (fVar2.f503c) {
                if (fVar.j && fVar2.j && this.f517e.j) {
                    return;
                }
                if (!this.f517e.j && this.f516d == aVar) {
                    a.f.b.i.d dVar5 = this.f514b;
                    if (dVar5.j == 0 && !dVar5.t()) {
                        f fVar3 = this.h.l.get(0);
                        f fVar4 = this.i.l.get(0);
                        int i4 = fVar3.g;
                        f fVar5 = this.h;
                        int i5 = i4 + fVar5.f;
                        int i6 = fVar4.g + this.i.f;
                        fVar5.c(i5);
                        this.i.c(i6);
                        this.f517e.c(i6 - i5);
                        return;
                    }
                }
                if (!this.f517e.j && this.f516d == aVar && this.f513a == 1 && this.h.l.size() > 0 && this.i.l.size() > 0) {
                    f fVar6 = this.h.l.get(0);
                    int i7 = (this.i.l.get(0).g + this.i.f) - (fVar6.g + this.h.f);
                    g gVar2 = this.f517e;
                    int i8 = gVar2.m;
                    if (i7 < i8) {
                        gVar2.c(i7);
                    } else {
                        gVar2.c(i8);
                    }
                }
                if (this.f517e.j && this.h.l.size() > 0 && this.i.l.size() > 0) {
                    f fVar7 = this.h.l.get(0);
                    f fVar8 = this.i.l.get(0);
                    int i9 = fVar7.g;
                    int i10 = this.h.f + i9;
                    int i11 = fVar8.g;
                    int i12 = this.i.f + i11;
                    float f2 = this.f514b.V;
                    if (fVar7 == fVar8) {
                        f2 = 0.5f;
                    } else {
                        i9 = i10;
                        i11 = i12;
                    }
                    this.h.c((int) ((((i11 - i9) - this.f517e.g) * f2) + i9 + 0.5f));
                    this.i.c(this.h.g + this.f517e.g);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:295:0x0326, code lost:
    
        if (r10.f514b.w != false) goto L296;
     */
    /* JADX WARN: Code restructure failed: missing block: B:296:0x0328, code lost:
    
        r0 = r10.k;
        r1 = r10.h;
        r2 = r10.l;
     */
    /* JADX WARN: Code restructure failed: missing block: B:317:0x03bf, code lost:
    
        if (r10.f514b.w != false) goto L296;
     */
    /* JADX WARN: Removed duplicated region for block: B:337:0x042f A[PHI: r0
  0x042f: PHI (r0v31 a.f.b.i.l.j) = (r0v18 a.f.b.i.l.j), (r0v45 a.f.b.i.l.j) binds: [B:336:0x042d, B:310:0x0386] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:340:0x0453  */
    /* JADX WARN: Removed duplicated region for block: B:353:? A[RETURN, SYNTHETIC] */
    @Override // a.f.b.i.l.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void d() {
        /*
            Method dump skipped, instructions count: 1112
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a.f.b.i.l.l.d():void");
    }

    @Override // a.f.b.i.l.m
    public void e() {
        f fVar = this.h;
        if (fVar.j) {
            this.f514b.Q = fVar.g;
        }
    }

    @Override // a.f.b.i.l.m
    public void f() {
        this.f515c = null;
        this.h.b();
        this.i.b();
        this.k.b();
        this.f517e.b();
        this.g = false;
    }

    @Override // a.f.b.i.l.m
    public boolean k() {
        return this.f516d != d.a.MATCH_CONSTRAINT || this.f514b.k == 0;
    }

    public void m() {
        this.g = false;
        this.h.b();
        this.h.j = false;
        this.i.b();
        this.i.j = false;
        this.k.b();
        this.k.j = false;
        this.f517e.j = false;
    }

    public String toString() {
        StringBuilder sbE = b.a.a.a.a.e("VerticalRun ");
        sbE.append(this.f514b.Y);
        return sbE.toString();
    }
}
