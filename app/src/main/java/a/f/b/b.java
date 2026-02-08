package a.f.b;

import a.f.b.d;
import a.f.b.g;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class b implements d.a {

    /* renamed from: c */
    public boolean f434c;

    /* renamed from: e */
    public a f436e;

    /* renamed from: a */
    public g f432a = null;

    /* renamed from: b */
    public float f433b = 0.0f;

    /* renamed from: d */
    public ArrayList<g> f435d = new ArrayList<>();
    public boolean f = false;

    public interface a {
        float a(int i);

        float b(g gVar, boolean z);

        void c(g gVar, float f, boolean z);

        void clear();

        g d(int i);

        float e(g gVar);

        float f(b bVar, boolean z);

        boolean g(g gVar);

        void h(float f);

        void i();

        void j(g gVar, float f);

        int k();
    }

    public b() {
    }

    public b(c cVar) {
        this.f436e = new a.f.b.a(this, cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0021  */
    @Override // a.f.b.d.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(a.f.b.g r3) {
        /*
            r2 = this;
            int r0 = r3.f454e
            r1 = 1
            if (r0 != r1) goto L6
            goto L21
        L6:
            r1 = 2
            if (r0 != r1) goto Lc
            r0 = 1148846080(0x447a0000, float:1000.0)
            goto L23
        Lc:
            r1 = 3
            if (r0 != r1) goto L13
            r0 = 1232348160(0x49742400, float:1000000.0)
            goto L23
        L13:
            r1 = 4
            if (r0 != r1) goto L1a
            r0 = 1315859240(0x4e6e6b28, float:1.0E9)
            goto L23
        L1a:
            r1 = 5
            if (r0 != r1) goto L21
            r0 = 1399379109(0x5368d4a5, float:1.0E12)
            goto L23
        L21:
            r0 = 1065353216(0x3f800000, float:1.0)
        L23:
            a.f.b.b$a r1 = r2.f436e
            r1.j(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a.f.b.b.a(a.f.b.g):void");
    }

    @Override // a.f.b.d.a
    public g b(d dVar, boolean[] zArr) {
        return i(zArr, null);
    }

    public b c(d dVar, int i) {
        this.f436e.j(dVar.k(i, "ep"), 1.0f);
        this.f436e.j(dVar.k(i, "em"), -1.0f);
        return this;
    }

    @Override // a.f.b.d.a
    public void clear() {
        this.f436e.clear();
        this.f432a = null;
        this.f433b = 0.0f;
    }

    public b d(g gVar, g gVar2, g gVar3, g gVar4, float f) {
        this.f436e.j(gVar, -1.0f);
        this.f436e.j(gVar2, 1.0f);
        this.f436e.j(gVar3, f);
        this.f436e.j(gVar4, -f);
        return this;
    }

    public b e(g gVar, g gVar2, g gVar3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f433b = i;
        }
        if (z) {
            this.f436e.j(gVar, 1.0f);
            this.f436e.j(gVar2, -1.0f);
            this.f436e.j(gVar3, -1.0f);
        } else {
            this.f436e.j(gVar, -1.0f);
            this.f436e.j(gVar2, 1.0f);
            this.f436e.j(gVar3, 1.0f);
        }
        return this;
    }

    public b f(g gVar, g gVar2, g gVar3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f433b = i;
        }
        if (z) {
            this.f436e.j(gVar, 1.0f);
            this.f436e.j(gVar2, -1.0f);
            this.f436e.j(gVar3, 1.0f);
        } else {
            this.f436e.j(gVar, -1.0f);
            this.f436e.j(gVar2, 1.0f);
            this.f436e.j(gVar3, -1.0f);
        }
        return this;
    }

    public b g(g gVar, g gVar2, g gVar3, g gVar4, float f) {
        this.f436e.j(gVar3, 0.5f);
        this.f436e.j(gVar4, 0.5f);
        this.f436e.j(gVar, -0.5f);
        this.f436e.j(gVar2, -0.5f);
        this.f433b = -f;
        return this;
    }

    public final boolean h(g gVar) {
        return gVar.m <= 1;
    }

    public final g i(boolean[] zArr, g gVar) {
        g.a aVar;
        int iK = this.f436e.k();
        g gVar2 = null;
        float f = 0.0f;
        for (int i = 0; i < iK; i++) {
            float fA = this.f436e.a(i);
            if (fA < 0.0f) {
                g gVarD = this.f436e.d(i);
                if ((zArr == null || !zArr[gVarD.f452c]) && gVarD != gVar && (((aVar = gVarD.j) == g.a.SLACK || aVar == g.a.ERROR) && fA < f)) {
                    f = fA;
                    gVar2 = gVarD;
                }
            }
        }
        return gVar2;
    }

    public void j(g gVar) {
        g gVar2 = this.f432a;
        if (gVar2 != null) {
            this.f436e.j(gVar2, -1.0f);
            this.f432a = null;
        }
        float fB = this.f436e.b(gVar, true) * (-1.0f);
        this.f432a = gVar;
        if (fB == 1.0f) {
            return;
        }
        this.f433b /= fB;
        this.f436e.h(fB);
    }

    public void k(g gVar, boolean z) {
        if (gVar.g) {
            float fE = this.f436e.e(gVar);
            this.f433b = (gVar.f * fE) + this.f433b;
            this.f436e.b(gVar, z);
            if (z) {
                gVar.b(this);
            }
        }
    }

    public void l(b bVar, boolean z) {
        float f = this.f436e.f(bVar, z);
        this.f433b = (bVar.f433b * f) + this.f433b;
        if (z) {
            bVar.f432a.b(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String toString() {
        /*
            r10 = this;
            a.f.b.g r0 = r10.f432a
            if (r0 != 0) goto L7
            java.lang.String r0 = "0"
            goto L16
        L7:
            java.lang.String r0 = ""
            java.lang.StringBuilder r0 = b.a.a.a.a.e(r0)
            a.f.b.g r1 = r10.f432a
            r0.append(r1)
            java.lang.String r0 = r0.toString()
        L16:
            java.lang.String r1 = " = "
            java.lang.String r0 = b.a.a.a.a.b(r0, r1)
            float r1 = r10.f433b
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L34
            java.lang.StringBuilder r0 = b.a.a.a.a.e(r0)
            float r1 = r10.f433b
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = r4
            goto L35
        L34:
            r1 = r3
        L35:
            a.f.b.b$a r5 = r10.f436e
            int r5 = r5.k()
        L3b:
            if (r3 >= r5) goto L9f
            a.f.b.b$a r6 = r10.f436e
            a.f.b.g r6 = r6.d(r3)
            if (r6 != 0) goto L46
            goto L9c
        L46:
            a.f.b.b$a r7 = r10.f436e
            float r7 = r7.a(r3)
            int r8 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r8 != 0) goto L51
            goto L9c
        L51:
            java.lang.String r6 = r6.toString()
            r9 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r1 != 0) goto L64
            int r1 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r1 >= 0) goto L7e
            java.lang.StringBuilder r0 = b.a.a.a.a.e(r0)
            java.lang.String r1 = "- "
            goto L76
        L64:
            java.lang.StringBuilder r0 = b.a.a.a.a.e(r0)
            if (r8 <= 0) goto L74
            java.lang.String r1 = " + "
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            goto L7e
        L74:
            java.lang.String r1 = " - "
        L76:
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            float r7 = r7 * r9
        L7e:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 != 0) goto L8a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            goto L97
        L8a:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = " "
        L97:
            java.lang.String r0 = b.a.a.a.a.d(r1, r0, r6)
            r1 = r4
        L9c:
            int r3 = r3 + 1
            goto L3b
        L9f:
            if (r1 != 0) goto La7
            java.lang.String r1 = "0.0"
            java.lang.String r0 = b.a.a.a.a.b(r0, r1)
        La7:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a.f.b.b.toString():java.lang.String");
    }
}
