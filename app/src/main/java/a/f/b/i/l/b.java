package a.f.b.i.l;

import a.f.b.i.d;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a */
    public final ArrayList<a.f.b.i.d> f488a = new ArrayList<>();

    /* renamed from: b */
    public a f489b = new a();

    /* renamed from: c */
    public a.f.b.i.e f490c;

    public static class a {

        /* renamed from: a */
        public d.a f491a;

        /* renamed from: b */
        public d.a f492b;

        /* renamed from: c */
        public int f493c;

        /* renamed from: d */
        public int f494d;

        /* renamed from: e */
        public int f495e;
        public int f;
        public int g;
        public boolean h;
        public boolean i;
        public boolean j;
    }

    /* renamed from: a.f.b.i.l.b$b */
    public interface InterfaceC0008b {
    }

    public b(a.f.b.i.e eVar) {
        this.f490c = eVar;
    }

    public final boolean a(InterfaceC0008b interfaceC0008b, a.f.b.i.d dVar, boolean z) {
        d.a aVar = d.a.FIXED;
        d.a aVar2 = d.a.MATCH_CONSTRAINT;
        this.f489b.f491a = dVar.j();
        this.f489b.f492b = dVar.n();
        this.f489b.f493c = dVar.o();
        this.f489b.f494d = dVar.i();
        a aVar3 = this.f489b;
        aVar3.i = false;
        aVar3.j = z;
        boolean z2 = aVar3.f491a == aVar2;
        boolean z3 = this.f489b.f492b == aVar2;
        boolean z4 = z2 && dVar.N > 0.0f;
        boolean z5 = z3 && dVar.N > 0.0f;
        if (z4 && dVar.l[0] == 4) {
            this.f489b.f491a = aVar;
        }
        if (z5 && dVar.l[1] == 4) {
            this.f489b.f492b = aVar;
        }
        ((ConstraintLayout.b) interfaceC0008b).a(dVar, this.f489b);
        dVar.B(this.f489b.f495e);
        dVar.w(this.f489b.f);
        a aVar4 = this.f489b;
        dVar.w = aVar4.h;
        int i = aVar4.g;
        dVar.R = i;
        dVar.w = i > 0;
        a aVar5 = this.f489b;
        aVar5.j = false;
        return aVar5.i;
    }

    public final void b(a.f.b.i.e eVar, int i, int i2) {
        int i3 = eVar.S;
        int i4 = eVar.T;
        eVar.z(0);
        eVar.y(0);
        eVar.L = i;
        int i5 = eVar.S;
        if (i < i5) {
            eVar.L = i5;
        }
        eVar.M = i2;
        int i6 = eVar.T;
        if (i2 < i6) {
            eVar.M = i6;
        }
        eVar.z(i3);
        eVar.y(i4);
        this.f490c.E();
    }
}
