package a.f.b;

import a.f.b.b;
import java.util.Arrays;

/* loaded from: classes.dex */
public class h implements b.a {

    /* renamed from: a, reason: collision with root package name */
    public int f459a = 16;

    /* renamed from: b, reason: collision with root package name */
    public int f460b = 16;

    /* renamed from: c, reason: collision with root package name */
    public int[] f461c = new int[16];

    /* renamed from: d, reason: collision with root package name */
    public int[] f462d = new int[16];

    /* renamed from: e, reason: collision with root package name */
    public int[] f463e = new int[16];
    public float[] f = new float[16];
    public int[] g = new int[16];
    public int[] h = new int[16];
    public int i = 0;
    public int j = -1;
    public final b k;
    public final c l;

    public h(b bVar, c cVar) {
        this.k = bVar;
        this.l = cVar;
        clear();
    }

    @Override // a.f.b.b.a
    public float a(int i) {
        int i2 = this.i;
        int i3 = this.j;
        for (int i4 = 0; i4 < i2; i4++) {
            if (i4 == i) {
                return this.f[i3];
            }
            i3 = this.h[i3];
            if (i3 == -1) {
                return 0.0f;
            }
        }
        return 0.0f;
    }

    @Override // a.f.b.b.a
    public float b(g gVar, boolean z) {
        int iN = n(gVar);
        if (iN == -1) {
            return 0.0f;
        }
        int i = gVar.f452c;
        int i2 = i % this.f460b;
        int[] iArr = this.f461c;
        int i3 = iArr[i2];
        if (i3 != -1) {
            if (this.f463e[i3] == i) {
                int[] iArr2 = this.f462d;
                iArr[i2] = iArr2[i3];
                iArr2[i3] = -1;
            } else {
                while (true) {
                    int[] iArr3 = this.f462d;
                    if (iArr3[i3] == -1 || this.f463e[iArr3[i3]] == i) {
                        break;
                    }
                    i3 = iArr3[i3];
                }
                int[] iArr4 = this.f462d;
                int i4 = iArr4[i3];
                if (i4 != -1 && this.f463e[i4] == i) {
                    iArr4[i3] = iArr4[i4];
                    iArr4[i4] = -1;
                }
            }
        }
        float f = this.f[iN];
        if (this.j == iN) {
            this.j = this.h[iN];
        }
        this.f463e[iN] = -1;
        int[] iArr5 = this.g;
        if (iArr5[iN] != -1) {
            int[] iArr6 = this.h;
            iArr6[iArr5[iN]] = iArr6[iN];
        }
        int[] iArr7 = this.h;
        if (iArr7[iN] != -1) {
            int[] iArr8 = this.g;
            iArr8[iArr7[iN]] = iArr8[iN];
        }
        this.i--;
        gVar.m--;
        if (z) {
            gVar.b(this.k);
        }
        return f;
    }

    @Override // a.f.b.b.a
    public void c(g gVar, float f, boolean z) {
        if (f <= -0.001f || f >= 0.001f) {
            int iN = n(gVar);
            if (iN == -1) {
                j(gVar, f);
                return;
            }
            float[] fArr = this.f;
            fArr[iN] = fArr[iN] + f;
            if (fArr[iN] <= -0.001f || fArr[iN] >= 0.001f) {
                return;
            }
            fArr[iN] = 0.0f;
            b(gVar, z);
        }
    }

    @Override // a.f.b.b.a
    public void clear() {
        int i = this.i;
        for (int i2 = 0; i2 < i; i2++) {
            g gVarD = d(i2);
            if (gVarD != null) {
                gVarD.b(this.k);
            }
        }
        for (int i3 = 0; i3 < this.f459a; i3++) {
            this.f463e[i3] = -1;
            this.f462d[i3] = -1;
        }
        for (int i4 = 0; i4 < this.f460b; i4++) {
            this.f461c[i4] = -1;
        }
        this.i = 0;
        this.j = -1;
    }

    @Override // a.f.b.b.a
    public g d(int i) {
        int i2 = this.i;
        if (i2 == 0) {
            return null;
        }
        int i3 = this.j;
        for (int i4 = 0; i4 < i2; i4++) {
            if (i4 == i && i3 != -1) {
                return this.l.f440d[this.f463e[i3]];
            }
            i3 = this.h[i3];
            if (i3 == -1) {
                break;
            }
        }
        return null;
    }

    @Override // a.f.b.b.a
    public float e(g gVar) {
        int iN = n(gVar);
        if (iN != -1) {
            return this.f[iN];
        }
        return 0.0f;
    }

    @Override // a.f.b.b.a
    public float f(b bVar, boolean z) {
        float fE = e(bVar.f432a);
        b(bVar.f432a, z);
        h hVar = (h) bVar.f436e;
        int i = hVar.i;
        int i2 = 0;
        int i3 = 0;
        while (i2 < i) {
            int[] iArr = hVar.f463e;
            if (iArr[i3] != -1) {
                c(this.l.f440d[iArr[i3]], hVar.f[i3] * fE, z);
                i2++;
            }
            i3++;
        }
        return fE;
    }

    @Override // a.f.b.b.a
    public boolean g(g gVar) {
        return n(gVar) != -1;
    }

    @Override // a.f.b.b.a
    public void h(float f) {
        int i = this.i;
        int i2 = this.j;
        for (int i3 = 0; i3 < i; i3++) {
            float[] fArr = this.f;
            fArr[i2] = fArr[i2] / f;
            i2 = this.h[i2];
            if (i2 == -1) {
                return;
            }
        }
    }

    @Override // a.f.b.b.a
    public void i() {
        int i = this.i;
        int i2 = this.j;
        for (int i3 = 0; i3 < i; i3++) {
            float[] fArr = this.f;
            fArr[i2] = fArr[i2] * (-1.0f);
            i2 = this.h[i2];
            if (i2 == -1) {
                return;
            }
        }
    }

    @Override // a.f.b.b.a
    public void j(g gVar, float f) {
        if (f > -0.001f && f < 0.001f) {
            b(gVar, true);
            return;
        }
        int i = 0;
        if (this.i == 0) {
            m(0, gVar, f);
            l(gVar, 0);
            this.j = 0;
            return;
        }
        int iN = n(gVar);
        if (iN != -1) {
            this.f[iN] = f;
            return;
        }
        int i2 = this.i + 1;
        int i3 = this.f459a;
        if (i2 >= i3) {
            int i4 = i3 * 2;
            this.f463e = Arrays.copyOf(this.f463e, i4);
            this.f = Arrays.copyOf(this.f, i4);
            this.g = Arrays.copyOf(this.g, i4);
            this.h = Arrays.copyOf(this.h, i4);
            this.f462d = Arrays.copyOf(this.f462d, i4);
            for (int i5 = this.f459a; i5 < i4; i5++) {
                this.f463e[i5] = -1;
                this.f462d[i5] = -1;
            }
            this.f459a = i4;
        }
        int i6 = this.i;
        int i7 = this.j;
        int i8 = -1;
        for (int i9 = 0; i9 < i6; i9++) {
            int[] iArr = this.f463e;
            int i10 = iArr[i7];
            int i11 = gVar.f452c;
            if (i10 == i11) {
                this.f[i7] = f;
                return;
            }
            if (iArr[i7] < i11) {
                i8 = i7;
            }
            i7 = this.h[i7];
            if (i7 == -1) {
                break;
            }
        }
        while (true) {
            if (i >= this.f459a) {
                i = -1;
                break;
            } else if (this.f463e[i] == -1) {
                break;
            } else {
                i++;
            }
        }
        m(i, gVar, f);
        int[] iArr2 = this.g;
        if (i8 != -1) {
            iArr2[i] = i8;
            int[] iArr3 = this.h;
            iArr3[i] = iArr3[i8];
            iArr3[i8] = i;
        } else {
            iArr2[i] = -1;
            if (this.i > 0) {
                this.h[i] = this.j;
                this.j = i;
            } else {
                this.h[i] = -1;
            }
        }
        int[] iArr4 = this.h;
        if (iArr4[i] != -1) {
            this.g[iArr4[i]] = i;
        }
        l(gVar, i);
    }

    @Override // a.f.b.b.a
    public int k() {
        return this.i;
    }

    public final void l(g gVar, int i) {
        int[] iArr;
        int i2 = gVar.f452c % this.f460b;
        int[] iArr2 = this.f461c;
        int i3 = iArr2[i2];
        if (i3 == -1) {
            iArr2[i2] = i;
        } else {
            while (true) {
                iArr = this.f462d;
                if (iArr[i3] == -1) {
                    break;
                } else {
                    i3 = iArr[i3];
                }
            }
            iArr[i3] = i;
        }
        this.f462d[i] = -1;
    }

    public final void m(int i, g gVar, float f) {
        this.f463e[i] = gVar.f452c;
        this.f[i] = f;
        this.g[i] = -1;
        this.h[i] = -1;
        gVar.a(this.k);
        gVar.m++;
        this.i++;
    }

    public int n(g gVar) {
        if (this.i == 0) {
            return -1;
        }
        int i = gVar.f452c;
        int i2 = this.f461c[i % this.f460b];
        if (i2 == -1) {
            return -1;
        }
        if (this.f463e[i2] == i) {
            return i2;
        }
        while (true) {
            int[] iArr = this.f462d;
            if (iArr[i2] == -1 || this.f463e[iArr[i2]] == i) {
                break;
            }
            i2 = iArr[i2];
        }
        int[] iArr2 = this.f462d;
        if (iArr2[i2] != -1 && this.f463e[iArr2[i2]] == i) {
            return iArr2[i2];
        }
        return -1;
    }

    public String toString() {
        StringBuilder sbE;
        String strB;
        String strB2 = hashCode() + " { ";
        int i = this.i;
        for (int i2 = 0; i2 < i; i2++) {
            g gVarD = d(i2);
            if (gVarD != null) {
                String str = strB2 + gVarD + " = " + a(i2) + " ";
                int iN = n(gVarD);
                String strB3 = b.a.a.a.a.b(str, "[p: ");
                if (this.g[iN] != -1) {
                    sbE = b.a.a.a.a.e(strB3);
                    sbE.append(this.l.f440d[this.f463e[this.g[iN]]]);
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append(strB3);
                    sb.append("none");
                    sbE = sb;
                }
                String strB4 = b.a.a.a.a.b(sbE.toString(), ", n: ");
                if (this.h[iN] != -1) {
                    StringBuilder sbE2 = b.a.a.a.a.e(strB4);
                    sbE2.append(this.l.f440d[this.f463e[this.h[iN]]]);
                    strB = sbE2.toString();
                } else {
                    strB = b.a.a.a.a.b(strB4, "none");
                }
                strB2 = b.a.a.a.a.b(strB, "]");
            }
        }
        return b.a.a.a.a.b(strB2, " }");
    }
}
