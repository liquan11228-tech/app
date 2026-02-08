package a.f.b;

import a.f.b.b;
import a.f.b.g;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public class d {
    public static int q = 1000;
    public static boolean r = true;
    public static long s;
    public static long t;

    /* renamed from: c */
    public a f443c;
    public a.f.b.b[] f;
    public final c m;
    public a p;

    /* renamed from: a */
    public int f441a = 0;

    /* renamed from: b */
    public HashMap<String, g> f442b = null;

    /* renamed from: d */
    public int f444d = 32;

    /* renamed from: e */
    public int f445e = 32;
    public boolean g = false;
    public boolean h = false;
    public boolean[] i = new boolean[32];
    public int j = 1;
    public int k = 0;
    public int l = 32;
    public g[] n = new g[q];
    public int o = 0;

    public interface a {
        void a(g gVar);

        g b(d dVar, boolean[] zArr);

        void clear();
    }

    public class b extends a.f.b.b {
        public b(d dVar, c cVar) {
            this.f436e = new h(this, cVar);
        }
    }

    public d() {
        this.f = null;
        this.f = new a.f.b.b[32];
        s();
        c cVar = new c();
        this.m = cVar;
        this.f443c = new f(cVar);
        this.p = r ? new b(this, this.m) : new a.f.b.b(this.m);
    }

    public final g a(g.a aVar, String str) {
        g gVarA = this.m.f439c.a();
        if (gVarA == null) {
            gVarA = new g(aVar);
        } else {
            gVarA.c();
        }
        gVarA.j = aVar;
        int i = this.o;
        int i2 = q;
        if (i >= i2) {
            int i3 = i2 * 2;
            q = i3;
            this.n = (g[]) Arrays.copyOf(this.n, i3);
        }
        g[] gVarArr = this.n;
        int i4 = this.o;
        this.o = i4 + 1;
        gVarArr[i4] = gVarA;
        return gVarA;
    }

    public void b(g gVar, g gVar2, int i, float f, g gVar3, g gVar4, int i2, int i3) {
        int i4;
        float f2;
        a.f.b.b bVarM = m();
        if (gVar2 == gVar3) {
            bVarM.f436e.j(gVar, 1.0f);
            bVarM.f436e.j(gVar4, 1.0f);
            bVarM.f436e.j(gVar2, -2.0f);
        } else {
            if (f == 0.5f) {
                bVarM.f436e.j(gVar, 1.0f);
                bVarM.f436e.j(gVar2, -1.0f);
                bVarM.f436e.j(gVar3, -1.0f);
                bVarM.f436e.j(gVar4, 1.0f);
                if (i > 0 || i2 > 0) {
                    i4 = (-i) + i2;
                    f2 = i4;
                }
            } else if (f <= 0.0f) {
                bVarM.f436e.j(gVar, -1.0f);
                bVarM.f436e.j(gVar2, 1.0f);
                f2 = i;
            } else if (f >= 1.0f) {
                bVarM.f436e.j(gVar4, -1.0f);
                bVarM.f436e.j(gVar3, 1.0f);
                i4 = -i2;
                f2 = i4;
            } else {
                float f3 = 1.0f - f;
                bVarM.f436e.j(gVar, f3 * 1.0f);
                bVarM.f436e.j(gVar2, f3 * (-1.0f));
                bVarM.f436e.j(gVar3, (-1.0f) * f);
                bVarM.f436e.j(gVar4, 1.0f * f);
                if (i > 0 || i2 > 0) {
                    bVarM.f433b = (i2 * f) + ((-i) * f3);
                }
            }
            bVarM.f433b = f2;
        }
        if (i3 != 8) {
            bVarM.c(this, i3);
        }
        c(bVarM);
    }

    public void c(a.f.b.b bVar) {
        boolean z;
        boolean z2;
        boolean z3;
        g gVarI;
        g.a aVar = g.a.UNRESTRICTED;
        boolean z4 = true;
        if (this.k + 1 >= this.l || this.j + 1 >= this.f445e) {
            p();
        }
        if (bVar.f) {
            z = false;
        } else {
            if (this.f.length != 0) {
                boolean z5 = false;
                while (!z5) {
                    int iK = bVar.f436e.k();
                    for (int i = 0; i < iK; i++) {
                        g gVarD = bVar.f436e.d(i);
                        if (gVarD.f453d != -1 || gVarD.g) {
                            bVar.f435d.add(gVarD);
                        }
                    }
                    if (bVar.f435d.size() > 0) {
                        Iterator<g> it = bVar.f435d.iterator();
                        while (it.hasNext()) {
                            g next = it.next();
                            if (next.g) {
                                bVar.k(next, true);
                            } else {
                                bVar.l(this.f[next.f453d], true);
                            }
                        }
                        bVar.f435d.clear();
                    } else {
                        z5 = true;
                    }
                }
            }
            if (bVar.f432a == null && bVar.f433b == 0.0f && bVar.f436e.k() == 0) {
                return;
            }
            float f = bVar.f433b;
            if (f < 0.0f) {
                bVar.f433b = f * (-1.0f);
                bVar.f436e.i();
            }
            int iK2 = bVar.f436e.k();
            float f2 = 0.0f;
            float f3 = 0.0f;
            g gVar = null;
            g gVar2 = null;
            boolean zH = false;
            boolean zH2 = false;
            for (int i2 = 0; i2 < iK2; i2++) {
                float fA = bVar.f436e.a(i2);
                g gVarD2 = bVar.f436e.d(i2);
                if (gVarD2.j == aVar) {
                    if (gVar == null || f2 > fA) {
                        zH = bVar.h(gVarD2);
                    } else if (!zH && bVar.h(gVarD2)) {
                        zH = true;
                    }
                    f2 = fA;
                    gVar = gVarD2;
                } else if (gVar == null && fA < 0.0f) {
                    if (gVar2 == null || f3 > fA) {
                        zH2 = bVar.h(gVarD2);
                    } else if (!zH2 && bVar.h(gVarD2)) {
                        zH2 = true;
                    }
                    f3 = fA;
                    gVar2 = gVarD2;
                }
            }
            if (gVar == null) {
                gVar = gVar2;
            }
            if (gVar == null) {
                z2 = true;
            } else {
                bVar.j(gVar);
                z2 = false;
            }
            if (bVar.f436e.k() == 0) {
                bVar.f = true;
            }
            if (z2) {
                if (this.j + 1 >= this.f445e) {
                    p();
                }
                g gVarA = a(g.a.SLACK, null);
                int i3 = this.f441a + 1;
                this.f441a = i3;
                this.j++;
                gVarA.f452c = i3;
                this.m.f440d[i3] = gVarA;
                bVar.f432a = gVarA;
                i(bVar);
                a.f.b.b bVar2 = (a.f.b.b) this.p;
                if (bVar2 == null) {
                    throw null;
                }
                bVar2.f432a = null;
                bVar2.f436e.clear();
                for (int i4 = 0; i4 < bVar.f436e.k(); i4++) {
                    bVar2.f436e.c(bVar.f436e.d(i4), bVar.f436e.a(i4), true);
                }
                r(this.p);
                if (gVarA.f453d == -1) {
                    if (bVar.f432a == gVarA && (gVarI = bVar.i(null, gVarA)) != null) {
                        bVar.j(gVarI);
                    }
                    if (!bVar.f) {
                        bVar.f432a.e(bVar);
                    }
                    this.k--;
                }
                z3 = true;
            } else {
                z3 = false;
            }
            g gVar3 = bVar.f432a;
            if (gVar3 == null || (gVar3.j != aVar && bVar.f433b < 0.0f)) {
                z4 = false;
            }
            if (!z4) {
                return;
            } else {
                z = z3;
            }
        }
        if (z) {
            return;
        }
        i(bVar);
    }

    public a.f.b.b d(g gVar, g gVar2, int i, int i2) {
        if (i2 == 8 && gVar2.g && gVar.f453d == -1) {
            gVar.d(this, gVar2.f + i);
            return null;
        }
        a.f.b.b bVarM = m();
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            bVarM.f433b = i;
        }
        if (z) {
            bVarM.f436e.j(gVar, 1.0f);
            bVarM.f436e.j(gVar2, -1.0f);
        } else {
            bVarM.f436e.j(gVar, -1.0f);
            bVarM.f436e.j(gVar2, 1.0f);
        }
        if (i2 != 8) {
            bVarM.c(this, i2);
        }
        c(bVarM);
        return bVarM;
    }

    public void e(g gVar, int i) {
        a.f.b.b bVarM;
        b.a aVar;
        float f;
        int i2 = gVar.f453d;
        if (i2 == -1) {
            gVar.d(this, i);
            return;
        }
        if (i2 != -1) {
            a.f.b.b bVar = this.f[i2];
            if (!bVar.f) {
                if (bVar.f436e.k() == 0) {
                    bVar.f = true;
                } else {
                    bVarM = m();
                    if (i < 0) {
                        bVarM.f433b = i * (-1);
                        aVar = bVarM.f436e;
                        f = 1.0f;
                    } else {
                        bVarM.f433b = i;
                        aVar = bVarM.f436e;
                        f = -1.0f;
                    }
                    aVar.j(gVar, f);
                }
            }
            bVar.f433b = i;
            return;
        }
        bVarM = m();
        bVarM.f432a = gVar;
        float f2 = i;
        gVar.f = f2;
        bVarM.f433b = f2;
        bVarM.f = true;
        c(bVarM);
    }

    public void f(g gVar, g gVar2, int i, int i2) {
        a.f.b.b bVarM = m();
        g gVarN = n();
        gVarN.f454e = 0;
        bVarM.e(gVar, gVar2, gVarN, i);
        if (i2 != 8) {
            bVarM.f436e.j(k(i2, null), (int) (bVarM.f436e.e(gVarN) * (-1.0f)));
        }
        c(bVarM);
    }

    public void g(g gVar, g gVar2, int i, int i2) {
        a.f.b.b bVarM = m();
        g gVarN = n();
        gVarN.f454e = 0;
        bVarM.f(gVar, gVar2, gVarN, i);
        if (i2 != 8) {
            bVarM.f436e.j(k(i2, null), (int) (bVarM.f436e.e(gVarN) * (-1.0f)));
        }
        c(bVarM);
    }

    public void h(g gVar, g gVar2, g gVar3, g gVar4, float f, int i) {
        a.f.b.b bVarM = m();
        bVarM.d(gVar, gVar2, gVar3, gVar4, f);
        if (i != 8) {
            bVarM.c(this, i);
        }
        c(bVarM);
    }

    public final void i(a.f.b.b bVar) {
        e<a.f.b.b> eVar;
        a.f.b.b bVar2;
        if (r) {
            a.f.b.b[] bVarArr = this.f;
            int i = this.k;
            if (bVarArr[i] != null) {
                eVar = this.m.f437a;
                bVar2 = bVarArr[i];
                eVar.b(bVar2);
            }
        } else {
            a.f.b.b[] bVarArr2 = this.f;
            int i2 = this.k;
            if (bVarArr2[i2] != null) {
                eVar = this.m.f438b;
                bVar2 = bVarArr2[i2];
                eVar.b(bVar2);
            }
        }
        a.f.b.b[] bVarArr3 = this.f;
        int i3 = this.k;
        bVarArr3[i3] = bVar;
        g gVar = bVar.f432a;
        gVar.f453d = i3;
        this.k = i3 + 1;
        gVar.e(bVar);
    }

    public final void j() {
        for (int i = 0; i < this.k; i++) {
            a.f.b.b bVar = this.f[i];
            bVar.f432a.f = bVar.f433b;
        }
    }

    public g k(int i, String str) {
        if (this.j + 1 >= this.f445e) {
            p();
        }
        g gVarA = a(g.a.ERROR, str);
        int i2 = this.f441a + 1;
        this.f441a = i2;
        this.j++;
        gVarA.f452c = i2;
        gVarA.f454e = i;
        this.m.f440d[i2] = gVarA;
        this.f443c.a(gVarA);
        return gVarA;
    }

    public g l(Object obj) {
        g gVar = null;
        if (obj == null) {
            return null;
        }
        if (this.j + 1 >= this.f445e) {
            p();
        }
        if (obj instanceof a.f.b.i.c) {
            a.f.b.i.c cVar = (a.f.b.i.c) obj;
            gVar = cVar.g;
            if (gVar == null) {
                cVar.f();
                gVar = cVar.g;
            }
            int i = gVar.f452c;
            if (i == -1 || i > this.f441a || this.m.f440d[i] == null) {
                if (gVar.f452c != -1) {
                    gVar.c();
                }
                int i2 = this.f441a + 1;
                this.f441a = i2;
                this.j++;
                gVar.f452c = i2;
                gVar.j = g.a.UNRESTRICTED;
                this.m.f440d[i2] = gVar;
            }
        }
        return gVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0038 A[PHI: r0
  0x0038: PHI (r0v6 a.f.b.b) = (r0v4 a.f.b.b), (r0v11 a.f.b.b) binds: [B:21:0x0029, B:18:0x0010] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public a.f.b.b m() {
        /*
            r5 = this;
            boolean r0 = a.f.b.d.r
            r1 = 1
            if (r0 == 0) goto L1f
            a.f.b.c r0 = r5.m
            a.f.b.e<a.f.b.b> r0 = r0.f437a
            java.lang.Object r0 = r0.a()
            a.f.b.b r0 = (a.f.b.b) r0
            if (r0 != 0) goto L38
            a.f.b.d$b r0 = new a.f.b.d$b
            a.f.b.c r3 = r5.m
            r0.<init>(r5, r3)
            long r3 = a.f.b.d.t
            long r3 = r3 + r1
            a.f.b.d.t = r3
            goto L46
        L1f:
            a.f.b.c r0 = r5.m
            a.f.b.e<a.f.b.b> r0 = r0.f438b
            java.lang.Object r0 = r0.a()
            a.f.b.b r0 = (a.f.b.b) r0
            if (r0 != 0) goto L38
            a.f.b.b r0 = new a.f.b.b
            a.f.b.c r3 = r5.m
            r0.<init>(r3)
            long r3 = a.f.b.d.s
            long r3 = r3 + r1
            a.f.b.d.s = r3
            goto L46
        L38:
            r1 = 0
            r0.f432a = r1
            a.f.b.b$a r1 = r0.f436e
            r1.clear()
            r1 = 0
            r0.f433b = r1
            r1 = 0
            r0.f = r1
        L46:
            int r1 = a.f.b.g.n
            int r1 = r1 + 1
            a.f.b.g.n = r1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a.f.b.d.m():a.f.b.b");
    }

    public g n() {
        if (this.j + 1 >= this.f445e) {
            p();
        }
        g gVarA = a(g.a.SLACK, null);
        int i = this.f441a + 1;
        this.f441a = i;
        this.j++;
        gVarA.f452c = i;
        this.m.f440d[i] = gVarA;
        return gVarA;
    }

    public int o(Object obj) {
        g gVar = ((a.f.b.i.c) obj).g;
        if (gVar != null) {
            return (int) (gVar.f + 0.5f);
        }
        return 0;
    }

    public final void p() {
        int i = this.f444d * 2;
        this.f444d = i;
        this.f = (a.f.b.b[]) Arrays.copyOf(this.f, i);
        c cVar = this.m;
        cVar.f440d = (g[]) Arrays.copyOf(cVar.f440d, this.f444d);
        int i2 = this.f444d;
        this.i = new boolean[i2];
        this.f445e = i2;
        this.l = i2;
    }

    public void q(a aVar) {
        float f;
        int i;
        boolean z;
        g.a aVar2 = g.a.UNRESTRICTED;
        int i2 = 0;
        while (true) {
            f = 0.0f;
            i = 1;
            if (i2 >= this.k) {
                z = false;
                break;
            }
            a.f.b.b[] bVarArr = this.f;
            if (bVarArr[i2].f432a.j != aVar2 && bVarArr[i2].f433b < 0.0f) {
                z = true;
                break;
            }
            i2++;
        }
        if (z) {
            boolean z2 = false;
            int i3 = 0;
            while (!z2) {
                i3 += i;
                float f2 = Float.MAX_VALUE;
                int i4 = -1;
                int i5 = -1;
                int i6 = 0;
                int i7 = 0;
                while (i6 < this.k) {
                    a.f.b.b bVar = this.f[i6];
                    if (bVar.f432a.j != aVar2 && !bVar.f && bVar.f433b < f) {
                        int i8 = i;
                        while (i8 < this.j) {
                            g gVar = this.m.f440d[i8];
                            float fE = bVar.f436e.e(gVar);
                            if (fE > f) {
                                for (int i9 = 0; i9 < 9; i9++) {
                                    float f3 = gVar.h[i9] / fE;
                                    if ((f3 < f2 && i9 == i7) || i9 > i7) {
                                        i7 = i9;
                                        f2 = f3;
                                        i4 = i6;
                                        i5 = i8;
                                    }
                                }
                            }
                            i8++;
                            f = 0.0f;
                        }
                    }
                    i6++;
                    f = 0.0f;
                    i = 1;
                }
                if (i4 != -1) {
                    a.f.b.b bVar2 = this.f[i4];
                    bVar2.f432a.f453d = -1;
                    bVar2.j(this.m.f440d[i5]);
                    g gVar2 = bVar2.f432a;
                    gVar2.f453d = i4;
                    gVar2.e(bVar2);
                } else {
                    z2 = true;
                }
                if (i3 > this.j / 2) {
                    z2 = true;
                }
                f = 0.0f;
                i = 1;
            }
        }
        r(aVar);
        j();
    }

    public final int r(a aVar) {
        for (int i = 0; i < this.j; i++) {
            this.i[i] = false;
        }
        boolean z = false;
        int i2 = 0;
        while (!z) {
            i2++;
            if (i2 >= this.j * 2) {
                return i2;
            }
            g gVar = ((a.f.b.b) aVar).f432a;
            if (gVar != null) {
                this.i[gVar.f452c] = true;
            }
            g gVarB = aVar.b(this, this.i);
            if (gVarB != null) {
                boolean[] zArr = this.i;
                int i3 = gVarB.f452c;
                if (zArr[i3]) {
                    return i2;
                }
                zArr[i3] = true;
            }
            if (gVarB != null) {
                float f = Float.MAX_VALUE;
                int i4 = -1;
                for (int i5 = 0; i5 < this.k; i5++) {
                    a.f.b.b bVar = this.f[i5];
                    if (bVar.f432a.j != g.a.UNRESTRICTED && !bVar.f && bVar.f436e.g(gVarB)) {
                        float fE = bVar.f436e.e(gVarB);
                        if (fE < 0.0f) {
                            float f2 = (-bVar.f433b) / fE;
                            if (f2 < f) {
                                i4 = i5;
                                f = f2;
                            }
                        }
                    }
                }
                if (i4 > -1) {
                    a.f.b.b bVar2 = this.f[i4];
                    bVar2.f432a.f453d = -1;
                    bVar2.j(gVarB);
                    g gVar2 = bVar2.f432a;
                    gVar2.f453d = i4;
                    gVar2.e(bVar2);
                }
            } else {
                z = true;
            }
        }
        return i2;
    }

    public final void s() {
        int i = 0;
        if (r) {
            while (true) {
                a.f.b.b[] bVarArr = this.f;
                if (i >= bVarArr.length) {
                    return;
                }
                a.f.b.b bVar = bVarArr[i];
                if (bVar != null) {
                    this.m.f437a.b(bVar);
                }
                this.f[i] = null;
                i++;
            }
        } else {
            while (true) {
                a.f.b.b[] bVarArr2 = this.f;
                if (i >= bVarArr2.length) {
                    return;
                }
                a.f.b.b bVar2 = bVarArr2[i];
                if (bVar2 != null) {
                    this.m.f438b.b(bVar2);
                }
                this.f[i] = null;
                i++;
            }
        }
    }

    public void t() {
        c cVar;
        int i = 0;
        while (true) {
            cVar = this.m;
            g[] gVarArr = cVar.f440d;
            if (i >= gVarArr.length) {
                break;
            }
            g gVar = gVarArr[i];
            if (gVar != null) {
                gVar.c();
            }
            i++;
        }
        e<g> eVar = cVar.f439c;
        g[] gVarArr2 = this.n;
        int length = this.o;
        if (eVar == null) {
            throw null;
        }
        if (length > gVarArr2.length) {
            length = gVarArr2.length;
        }
        for (int i2 = 0; i2 < length; i2++) {
            g gVar2 = gVarArr2[i2];
            int i3 = eVar.f447b;
            Object[] objArr = eVar.f446a;
            if (i3 < objArr.length) {
                objArr[i3] = gVar2;
                eVar.f447b = i3 + 1;
            }
        }
        this.o = 0;
        Arrays.fill(this.m.f440d, (Object) null);
        HashMap<String, g> map = this.f442b;
        if (map != null) {
            map.clear();
        }
        this.f441a = 0;
        this.f443c.clear();
        this.j = 1;
        for (int i4 = 0; i4 < this.k; i4++) {
            this.f[i4].f434c = false;
        }
        s();
        this.k = 0;
        this.p = r ? new b(this, this.m) : new a.f.b.b(this.m);
    }
}
