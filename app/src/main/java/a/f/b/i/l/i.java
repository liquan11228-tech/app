package a.f.b.i.l;

import a.f.b.i.l.f;
import java.util.Iterator;

/* loaded from: classes.dex */
public class i extends m {
    public i(a.f.b.i.d dVar) {
        super(dVar);
    }

    @Override // a.f.b.i.l.m, a.f.b.i.l.d
    public void a(d dVar) {
        a.f.b.i.a aVar = (a.f.b.i.a) this.f514b;
        int i = aVar.h0;
        int i2 = 0;
        Iterator<f> it = this.h.l.iterator();
        int i3 = -1;
        while (it.hasNext()) {
            int i4 = it.next().g;
            if (i3 == -1 || i4 < i3) {
                i3 = i4;
            }
            if (i2 < i4) {
                i2 = i4;
            }
        }
        if (i == 0 || i == 2) {
            this.h.c(i3 + aVar.j0);
        } else {
            this.h.c(i2 + aVar.j0);
        }
    }

    @Override // a.f.b.i.l.m
    public void d() {
        m mVar;
        a.f.b.i.d dVar = this.f514b;
        if (dVar instanceof a.f.b.i.a) {
            f fVar = this.h;
            fVar.f502b = true;
            a.f.b.i.a aVar = (a.f.b.i.a) dVar;
            int i = aVar.h0;
            boolean z = aVar.i0;
            int i2 = 0;
            if (i == 0) {
                fVar.f505e = f.a.LEFT;
                while (i2 < aVar.g0) {
                    a.f.b.i.d dVar2 = aVar.f0[i2];
                    if (z || dVar2.X != 8) {
                        f fVar2 = dVar2.f481d.h;
                        fVar2.k.add(this.h);
                        this.h.l.add(fVar2);
                    }
                    i2++;
                }
            } else {
                if (i != 1) {
                    if (i == 2) {
                        fVar.f505e = f.a.TOP;
                        while (i2 < aVar.g0) {
                            a.f.b.i.d dVar3 = aVar.f0[i2];
                            if (z || dVar3.X != 8) {
                                f fVar3 = dVar3.f482e.h;
                                fVar3.k.add(this.h);
                                this.h.l.add(fVar3);
                            }
                            i2++;
                        }
                    } else {
                        if (i != 3) {
                            return;
                        }
                        fVar.f505e = f.a.BOTTOM;
                        while (i2 < aVar.g0) {
                            a.f.b.i.d dVar4 = aVar.f0[i2];
                            if (z || dVar4.X != 8) {
                                f fVar4 = dVar4.f482e.i;
                                fVar4.k.add(this.h);
                                this.h.l.add(fVar4);
                            }
                            i2++;
                        }
                    }
                    m(this.f514b.f482e.h);
                    mVar = this.f514b.f482e;
                    m(mVar.i);
                }
                fVar.f505e = f.a.RIGHT;
                while (i2 < aVar.g0) {
                    a.f.b.i.d dVar5 = aVar.f0[i2];
                    if (z || dVar5.X != 8) {
                        f fVar5 = dVar5.f481d.i;
                        fVar5.k.add(this.h);
                        this.h.l.add(fVar5);
                    }
                    i2++;
                }
            }
            m(this.f514b.f481d.h);
            mVar = this.f514b.f481d;
            m(mVar.i);
        }
    }

    @Override // a.f.b.i.l.m
    public void e() {
        a.f.b.i.d dVar = this.f514b;
        if (dVar instanceof a.f.b.i.a) {
            int i = ((a.f.b.i.a) dVar).h0;
            if (i != 0 && i != 1) {
                dVar.Q = this.h.g;
            } else {
                this.f514b.P = this.h.g;
            }
        }
    }

    @Override // a.f.b.i.l.m
    public void f() {
        this.f515c = null;
        this.h.b();
    }

    @Override // a.f.b.i.l.m
    public boolean k() {
        return false;
    }

    public final void m(f fVar) {
        this.h.k.add(fVar);
        fVar.l.add(this.h);
    }
}
