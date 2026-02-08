package a.b.k;

import android.view.View;

/* loaded from: classes.dex */
public class l implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f37b;

    public class a extends a.g.j.q {
        public a() {
        }

        @Override // a.g.j.p
        public void a(View view) {
            l.this.f37b.p.setAlpha(1.0f);
            l.this.f37b.s.d(null);
            l.this.f37b.s = null;
        }

        @Override // a.g.j.q, a.g.j.p
        public void b(View view) {
            l.this.f37b.p.setVisibility(0);
        }
    }

    public l(h hVar) {
        this.f37b = hVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        h hVar = this.f37b;
        hVar.q.showAtLocation(hVar.p, 55, 0, 0);
        this.f37b.y();
        if (!this.f37b.L()) {
            this.f37b.p.setAlpha(1.0f);
            this.f37b.p.setVisibility(0);
            return;
        }
        this.f37b.p.setAlpha(0.0f);
        h hVar2 = this.f37b;
        a.g.j.o oVarA = a.g.j.k.a(hVar2.p);
        oVarA.a(1.0f);
        hVar2.s = oVarA;
        a.g.j.o oVar = this.f37b.s;
        a aVar = new a();
        View view = oVar.f706a.get();
        if (view != null) {
            oVar.e(view, aVar);
        }
    }
}
