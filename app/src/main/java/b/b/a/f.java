package b.b.a;

import a.b.k.h;
import d.c0;
import d.e0;
import d.g0;
import d.i0;
import d.v;
import java.io.IOException;

/* loaded from: classes.dex */
public class f {

    /* renamed from: a */
    public static final c0 f1080a = new c0(new c0.a());

    public static class a implements d.g {

        /* renamed from: a */
        public final /* synthetic */ b f1081a;

        public a(b bVar) {
            this.f1081a = bVar;
        }

        @Override // d.g
        public void a(d.f fVar, g0 g0Var) {
            int i = g0Var.f1364e;
            if (!(200 <= i && 299 >= i)) {
                b bVar = this.f1081a;
                StringBuilder sbE = b.a.a.a.a.e("Unexpected response code: ");
                sbE.append(g0Var.f1364e);
                bVar.b(new IOException(sbE.toString()));
                return;
            }
            i0 i0Var = g0Var.h;
            e.g gVarB = i0Var.B();
            try {
                String strW = gVarB.w(d.n0.c.w(gVarB, i0Var.y()));
                h.i.q(gVarB, null);
                this.f1081a.a(strW);
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    h.i.q(gVarB, th);
                    throw th2;
                }
            }
        }

        @Override // d.g
        public void b(d.f fVar, IOException iOException) {
            this.f1081a.b(iOException);
        }
    }

    public interface b {
        void a(String str);

        void b(IOException iOException);
    }

    public static void a(String str, v.a aVar, b bVar) {
        v vVar = new v(aVar.f1726a, aVar.f1727b);
        e0.a aVar2 = new e0.a();
        aVar2.e(str);
        c.j.b.d.d(vVar, "body");
        aVar2.c("POST", vVar);
        e0 e0VarA = aVar2.a();
        c0 c0Var = f1080a;
        if (c0Var == null) {
            throw null;
        }
        c.j.b.d.d(e0VarA, "request");
        new d.n0.g.e(c0Var, e0VarA, false).d(new a(bVar));
    }
}
