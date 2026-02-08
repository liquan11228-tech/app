package a.f.b.i.l;

/* loaded from: classes.dex */
public class h extends m {
    public h(a.f.b.i.d dVar) {
        super(dVar);
        dVar.f481d.f();
        dVar.f482e.f();
        this.f = ((a.f.b.i.f) dVar).j0;
    }

    @Override // a.f.b.i.l.m, a.f.b.i.l.d
    public void a(d dVar) {
        f fVar = this.h;
        if (fVar.f503c && !fVar.j) {
            this.h.c((int) ((fVar.l.get(0).g * ((a.f.b.i.f) this.f514b).f0) + 0.5f));
        }
    }

    @Override // a.f.b.i.l.m
    public void d() {
        m mVar;
        a.f.b.i.d dVar = this.f514b;
        a.f.b.i.f fVar = (a.f.b.i.f) dVar;
        int i = fVar.g0;
        int i2 = fVar.h0;
        if (fVar.j0 == 1) {
            f fVar2 = this.h;
            if (i != -1) {
                fVar2.l.add(dVar.K.f481d.h);
                this.f514b.K.f481d.h.k.add(this.h);
                this.h.f = i;
            } else if (i2 != -1) {
                fVar2.l.add(dVar.K.f481d.i);
                this.f514b.K.f481d.i.k.add(this.h);
                this.h.f = -i2;
            } else {
                fVar2.f502b = true;
                fVar2.l.add(dVar.K.f481d.i);
                this.f514b.K.f481d.i.k.add(this.h);
            }
            m(this.f514b.f481d.h);
            mVar = this.f514b.f481d;
        } else {
            f fVar3 = this.h;
            if (i != -1) {
                fVar3.l.add(dVar.K.f482e.h);
                this.f514b.K.f482e.h.k.add(this.h);
                this.h.f = i;
            } else if (i2 != -1) {
                fVar3.l.add(dVar.K.f482e.i);
                this.f514b.K.f482e.i.k.add(this.h);
                this.h.f = -i2;
            } else {
                fVar3.f502b = true;
                fVar3.l.add(dVar.K.f482e.i);
                this.f514b.K.f482e.i.k.add(this.h);
            }
            m(this.f514b.f482e.h);
            mVar = this.f514b.f482e;
        }
        m(mVar.i);
    }

    @Override // a.f.b.i.l.m
    public void e() {
        a.f.b.i.d dVar = this.f514b;
        if (((a.f.b.i.f) dVar).j0 == 1) {
            dVar.P = this.h.g;
        } else {
            dVar.Q = this.h.g;
        }
    }

    @Override // a.f.b.i.l.m
    public void f() {
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
