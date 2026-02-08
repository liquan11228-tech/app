package a.f.b.i.l;

import a.f.b.i.d;

/* loaded from: classes.dex */
public abstract class m implements d {

    /* renamed from: a */
    public int f513a;

    /* renamed from: b */
    public a.f.b.i.d f514b;

    /* renamed from: c */
    public k f515c;

    /* renamed from: d */
    public d.a f516d;

    /* renamed from: e */
    public g f517e = new g(this);
    public int f = 0;
    public boolean g = false;
    public f h = new f(this);
    public f i = new f(this);
    public a j = a.NONE;

    public enum a {
        NONE,
        START,
        END,
        CENTER
    }

    public m(a.f.b.i.d dVar) {
        this.f514b = dVar;
    }

    @Override // a.f.b.i.l.d
    public void a(d dVar) {
    }

    public final void b(f fVar, f fVar2, int i) {
        fVar.l.add(fVar2);
        fVar.f = i;
        fVar2.k.add(fVar);
    }

    public final void c(f fVar, f fVar2, int i, g gVar) {
        fVar.l.add(fVar2);
        fVar.l.add(this.f517e);
        fVar.h = i;
        fVar.i = gVar;
        fVar2.k.add(fVar);
        gVar.k.add(fVar);
    }

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public final int g(int i, int i2) {
        int iMax;
        if (i2 == 0) {
            a.f.b.i.d dVar = this.f514b;
            int i3 = dVar.n;
            iMax = Math.max(dVar.m, i);
            if (i3 > 0) {
                iMax = Math.min(i3, i);
            }
            if (iMax == i) {
                return i;
            }
        } else {
            a.f.b.i.d dVar2 = this.f514b;
            int i4 = dVar2.q;
            iMax = Math.max(dVar2.p, i);
            if (i4 > 0) {
                iMax = Math.min(i4, i);
            }
            if (iMax == i) {
                return i;
            }
        }
        return iMax;
    }

    public final f h(a.f.b.i.c cVar) {
        m mVar;
        m mVar2;
        a.f.b.i.c cVar2 = cVar.f472d;
        if (cVar2 == null) {
            return null;
        }
        a.f.b.i.d dVar = cVar2.f470b;
        int iOrdinal = cVar2.f471c.ordinal();
        if (iOrdinal == 1) {
            mVar = dVar.f481d;
        } else {
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    mVar2 = dVar.f481d;
                } else {
                    if (iOrdinal != 4) {
                        if (iOrdinal != 5) {
                            return null;
                        }
                        return dVar.f482e.k;
                    }
                    mVar2 = dVar.f482e;
                }
                return mVar2.i;
            }
            mVar = dVar.f482e;
        }
        return mVar.h;
    }

    public final f i(a.f.b.i.c cVar, int i) {
        a.f.b.i.c cVar2 = cVar.f472d;
        if (cVar2 == null) {
            return null;
        }
        a.f.b.i.d dVar = cVar2.f470b;
        m mVar = i == 0 ? dVar.f481d : dVar.f482e;
        int iOrdinal = cVar.f472d.f471c.ordinal();
        if (iOrdinal == 1 || iOrdinal == 2) {
            return mVar.h;
        }
        if (iOrdinal == 3 || iOrdinal == 4) {
            return mVar.i;
        }
        return null;
    }

    public long j() {
        if (this.f517e.j) {
            return r0.g;
        }
        return 0L;
    }

    public abstract boolean k();

    /* JADX WARN: Removed duplicated region for block: B:102:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void l(a.f.b.i.c r11, a.f.b.i.c r12, int r13) {
        /*
            Method dump skipped, instructions count: 253
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a.f.b.i.l.m.l(a.f.b.i.c, a.f.b.i.c, int):void");
    }
}
