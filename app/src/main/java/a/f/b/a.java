package a.f.b;

import a.f.b.b;
import java.util.Arrays;

/* loaded from: classes.dex */
public class a implements b.a {

    /* renamed from: b, reason: collision with root package name */
    public final b f428b;

    /* renamed from: c, reason: collision with root package name */
    public final c f429c;

    /* renamed from: a, reason: collision with root package name */
    public int f427a = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f430d = 8;

    /* renamed from: e, reason: collision with root package name */
    public g f431e = null;
    public int[] f = new int[8];
    public int[] g = new int[8];
    public float[] h = new float[8];
    public int i = -1;
    public int j = -1;
    public boolean k = false;

    public a(b bVar, c cVar) {
        this.f428b = bVar;
        this.f429c = cVar;
    }

    @Override // a.f.b.b.a
    public float a(int i) {
        int i2 = this.i;
        for (int i3 = 0; i2 != -1 && i3 < this.f427a; i3++) {
            if (i3 == i) {
                return this.h[i2];
            }
            i2 = this.g[i2];
        }
        return 0.0f;
    }

    @Override // a.f.b.b.a
    public final float b(g gVar, boolean z) {
        if (this.f431e == gVar) {
            this.f431e = null;
        }
        int i = this.i;
        if (i == -1) {
            return 0.0f;
        }
        int i2 = 0;
        int i3 = -1;
        while (i != -1 && i2 < this.f427a) {
            if (this.f[i] == gVar.f452c) {
                if (i == this.i) {
                    this.i = this.g[i];
                } else {
                    int[] iArr = this.g;
                    iArr[i3] = iArr[i];
                }
                if (z) {
                    gVar.b(this.f428b);
                }
                gVar.m--;
                this.f427a--;
                this.f[i] = -1;
                if (this.k) {
                    this.j = i;
                }
                return this.h[i];
            }
            i2++;
            i3 = i;
            i = this.g[i];
        }
        return 0.0f;
    }

    @Override // a.f.b.b.a
    public void c(g gVar, float f, boolean z) {
        if (f <= -0.001f || f >= 0.001f) {
            int i = this.i;
            if (i == -1) {
                this.i = 0;
                this.h[0] = f;
                this.f[0] = gVar.f452c;
                this.g[0] = -1;
                gVar.m++;
                gVar.a(this.f428b);
                this.f427a++;
                if (this.k) {
                    return;
                }
                int i2 = this.j + 1;
                this.j = i2;
                int[] iArr = this.f;
                if (i2 >= iArr.length) {
                    this.k = true;
                    this.j = iArr.length - 1;
                    return;
                }
                return;
            }
            int i3 = -1;
            for (int i4 = 0; i != -1 && i4 < this.f427a; i4++) {
                int[] iArr2 = this.f;
                int i5 = iArr2[i];
                int i6 = gVar.f452c;
                if (i5 == i6) {
                    float f2 = this.h[i] + f;
                    if (f2 > -0.001f && f2 < 0.001f) {
                        f2 = 0.0f;
                    }
                    this.h[i] = f2;
                    if (f2 == 0.0f) {
                        if (i == this.i) {
                            this.i = this.g[i];
                        } else {
                            int[] iArr3 = this.g;
                            iArr3[i3] = iArr3[i];
                        }
                        if (z) {
                            gVar.b(this.f428b);
                        }
                        if (this.k) {
                            this.j = i;
                        }
                        gVar.m--;
                        this.f427a--;
                        return;
                    }
                    return;
                }
                if (iArr2[i] < i6) {
                    i3 = i;
                }
                i = this.g[i];
            }
            int length = this.j;
            int i7 = length + 1;
            if (this.k) {
                int[] iArr4 = this.f;
                if (iArr4[length] != -1) {
                    length = iArr4.length;
                }
            } else {
                length = i7;
            }
            int[] iArr5 = this.f;
            if (length >= iArr5.length && this.f427a < iArr5.length) {
                int i8 = 0;
                while (true) {
                    int[] iArr6 = this.f;
                    if (i8 >= iArr6.length) {
                        break;
                    }
                    if (iArr6[i8] == -1) {
                        length = i8;
                        break;
                    }
                    i8++;
                }
            }
            int[] iArr7 = this.f;
            if (length >= iArr7.length) {
                length = iArr7.length;
                int i9 = this.f430d * 2;
                this.f430d = i9;
                this.k = false;
                this.j = length - 1;
                this.h = Arrays.copyOf(this.h, i9);
                this.f = Arrays.copyOf(this.f, this.f430d);
                this.g = Arrays.copyOf(this.g, this.f430d);
            }
            this.f[length] = gVar.f452c;
            this.h[length] = f;
            int[] iArr8 = this.g;
            if (i3 != -1) {
                iArr8[length] = iArr8[i3];
                iArr8[i3] = length;
            } else {
                iArr8[length] = this.i;
                this.i = length;
            }
            gVar.m++;
            gVar.a(this.f428b);
            this.f427a++;
            if (!this.k) {
                this.j++;
            }
            int i10 = this.j;
            int[] iArr9 = this.f;
            if (i10 >= iArr9.length) {
                this.k = true;
                this.j = iArr9.length - 1;
            }
        }
    }

    @Override // a.f.b.b.a
    public final void clear() {
        int i = this.i;
        for (int i2 = 0; i != -1 && i2 < this.f427a; i2++) {
            g gVar = this.f429c.f440d[this.f[i]];
            if (gVar != null) {
                gVar.b(this.f428b);
            }
            i = this.g[i];
        }
        this.i = -1;
        this.j = -1;
        this.k = false;
        this.f427a = 0;
    }

    @Override // a.f.b.b.a
    public g d(int i) {
        int i2 = this.i;
        for (int i3 = 0; i2 != -1 && i3 < this.f427a; i3++) {
            if (i3 == i) {
                return this.f429c.f440d[this.f[i2]];
            }
            i2 = this.g[i2];
        }
        return null;
    }

    @Override // a.f.b.b.a
    public final float e(g gVar) {
        int i = this.i;
        for (int i2 = 0; i != -1 && i2 < this.f427a; i2++) {
            if (this.f[i] == gVar.f452c) {
                return this.h[i];
            }
            i = this.g[i];
        }
        return 0.0f;
    }

    @Override // a.f.b.b.a
    public float f(b bVar, boolean z) {
        float fE = e(bVar.f432a);
        b(bVar.f432a, z);
        b.a aVar = bVar.f436e;
        int iK = aVar.k();
        for (int i = 0; i < iK; i++) {
            g gVarD = aVar.d(i);
            c(gVarD, aVar.e(gVarD) * fE, z);
        }
        return fE;
    }

    @Override // a.f.b.b.a
    public boolean g(g gVar) {
        int i = this.i;
        if (i == -1) {
            return false;
        }
        for (int i2 = 0; i != -1 && i2 < this.f427a; i2++) {
            if (this.f[i] == gVar.f452c) {
                return true;
            }
            i = this.g[i];
        }
        return false;
    }

    @Override // a.f.b.b.a
    public void h(float f) {
        int i = this.i;
        for (int i2 = 0; i != -1 && i2 < this.f427a; i2++) {
            float[] fArr = this.h;
            fArr[i] = fArr[i] / f;
            i = this.g[i];
        }
    }

    @Override // a.f.b.b.a
    public void i() {
        int i = this.i;
        for (int i2 = 0; i != -1 && i2 < this.f427a; i2++) {
            float[] fArr = this.h;
            fArr[i] = fArr[i] * (-1.0f);
            i = this.g[i];
        }
    }

    @Override // a.f.b.b.a
    public final void j(g gVar, float f) {
        if (f == 0.0f) {
            b(gVar, true);
            return;
        }
        int i = this.i;
        if (i == -1) {
            this.i = 0;
            this.h[0] = f;
            this.f[0] = gVar.f452c;
            this.g[0] = -1;
            gVar.m++;
            gVar.a(this.f428b);
            this.f427a++;
            if (this.k) {
                return;
            }
            int i2 = this.j + 1;
            this.j = i2;
            int[] iArr = this.f;
            if (i2 >= iArr.length) {
                this.k = true;
                this.j = iArr.length - 1;
                return;
            }
            return;
        }
        int i3 = -1;
        for (int i4 = 0; i != -1 && i4 < this.f427a; i4++) {
            int[] iArr2 = this.f;
            int i5 = iArr2[i];
            int i6 = gVar.f452c;
            if (i5 == i6) {
                this.h[i] = f;
                return;
            }
            if (iArr2[i] < i6) {
                i3 = i;
            }
            i = this.g[i];
        }
        int length = this.j;
        int i7 = length + 1;
        if (this.k) {
            int[] iArr3 = this.f;
            if (iArr3[length] != -1) {
                length = iArr3.length;
            }
        } else {
            length = i7;
        }
        int[] iArr4 = this.f;
        if (length >= iArr4.length && this.f427a < iArr4.length) {
            int i8 = 0;
            while (true) {
                int[] iArr5 = this.f;
                if (i8 >= iArr5.length) {
                    break;
                }
                if (iArr5[i8] == -1) {
                    length = i8;
                    break;
                }
                i8++;
            }
        }
        int[] iArr6 = this.f;
        if (length >= iArr6.length) {
            length = iArr6.length;
            int i9 = this.f430d * 2;
            this.f430d = i9;
            this.k = false;
            this.j = length - 1;
            this.h = Arrays.copyOf(this.h, i9);
            this.f = Arrays.copyOf(this.f, this.f430d);
            this.g = Arrays.copyOf(this.g, this.f430d);
        }
        this.f[length] = gVar.f452c;
        this.h[length] = f;
        int[] iArr7 = this.g;
        if (i3 != -1) {
            iArr7[length] = iArr7[i3];
            iArr7[i3] = length;
        } else {
            iArr7[length] = this.i;
            this.i = length;
        }
        gVar.m++;
        gVar.a(this.f428b);
        this.f427a++;
        if (!this.k) {
            this.j++;
        }
        if (this.f427a >= this.f.length) {
            this.k = true;
        }
        int i10 = this.j;
        int[] iArr8 = this.f;
        if (i10 >= iArr8.length) {
            this.k = true;
            this.j = iArr8.length - 1;
        }
    }

    @Override // a.f.b.b.a
    public int k() {
        return this.f427a;
    }

    public String toString() {
        int i = this.i;
        String string = "";
        for (int i2 = 0; i != -1 && i2 < this.f427a; i2++) {
            StringBuilder sbE = b.a.a.a.a.e(b.a.a.a.a.b(string, " -> "));
            sbE.append(this.h[i]);
            sbE.append(" : ");
            StringBuilder sbE2 = b.a.a.a.a.e(sbE.toString());
            sbE2.append(this.f429c.f440d[this.f[i]]);
            string = sbE2.toString();
            i = this.g[i];
        }
        return string;
    }
}
