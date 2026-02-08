package a.g.k;

import a.g.j.k;
import android.content.res.Resources;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;

/* loaded from: classes.dex */
public abstract class a implements View.OnTouchListener {
    public static final int r = ViewConfiguration.getTapTimeout();

    /* renamed from: d, reason: collision with root package name */
    public final View f740d;

    /* renamed from: e, reason: collision with root package name */
    public Runnable f741e;
    public int h;
    public int i;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;

    /* renamed from: b, reason: collision with root package name */
    public final C0016a f738b = new C0016a();

    /* renamed from: c, reason: collision with root package name */
    public final Interpolator f739c = new AccelerateInterpolator();
    public float[] f = {0.0f, 0.0f};
    public float[] g = {Float.MAX_VALUE, Float.MAX_VALUE};
    public float[] j = {0.0f, 0.0f};
    public float[] k = {0.0f, 0.0f};
    public float[] l = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: a.g.k.a$a, reason: collision with other inner class name */
    public static class C0016a {

        /* renamed from: a, reason: collision with root package name */
        public int f742a;

        /* renamed from: b, reason: collision with root package name */
        public int f743b;

        /* renamed from: c, reason: collision with root package name */
        public float f744c;

        /* renamed from: d, reason: collision with root package name */
        public float f745d;
        public float j;
        public int k;

        /* renamed from: e, reason: collision with root package name */
        public long f746e = Long.MIN_VALUE;
        public long i = -1;
        public long f = 0;
        public int g = 0;
        public int h = 0;

        public final float a(long j) {
            if (j < this.f746e) {
                return 0.0f;
            }
            long j2 = this.i;
            if (j2 < 0 || j < j2) {
                return a.b((j - this.f746e) / this.f742a, 0.0f, 1.0f) * 0.5f;
            }
            float f = this.j;
            return (a.b((j - j2) / this.k, 0.0f, 1.0f) * f) + (1.0f - f);
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a aVar = a.this;
            if (aVar.p) {
                if (aVar.n) {
                    aVar.n = false;
                    C0016a c0016a = aVar.f738b;
                    if (c0016a == null) {
                        throw null;
                    }
                    long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                    c0016a.f746e = jCurrentAnimationTimeMillis;
                    c0016a.i = -1L;
                    c0016a.f = jCurrentAnimationTimeMillis;
                    c0016a.j = 0.5f;
                    c0016a.g = 0;
                    c0016a.h = 0;
                }
                C0016a c0016a2 = a.this.f738b;
                if ((c0016a2.i > 0 && AnimationUtils.currentAnimationTimeMillis() > c0016a2.i + ((long) c0016a2.k)) || !a.this.e()) {
                    a.this.p = false;
                    return;
                }
                a aVar2 = a.this;
                if (aVar2.o) {
                    aVar2.o = false;
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                    aVar2.f740d.onTouchEvent(motionEventObtain);
                    motionEventObtain.recycle();
                }
                if (c0016a2.f == 0) {
                    throw new RuntimeException("Cannot compute scroll delta before calling start()");
                }
                long jCurrentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                float fA = c0016a2.a(jCurrentAnimationTimeMillis2);
                long j = jCurrentAnimationTimeMillis2 - c0016a2.f;
                c0016a2.f = jCurrentAnimationTimeMillis2;
                float f = j * ((fA * 4.0f) + ((-4.0f) * fA * fA));
                c0016a2.g = (int) (c0016a2.f744c * f);
                int i = (int) (f * c0016a2.f745d);
                c0016a2.h = i;
                ((c) a.this).s.scrollListBy(i);
                k.q(a.this.f740d, this);
            }
        }
    }

    public a(View view) {
        this.f740d = view;
        float f = Resources.getSystem().getDisplayMetrics().density;
        float[] fArr = this.l;
        float f2 = ((int) ((1575.0f * f) + 0.5f)) / 1000.0f;
        fArr[0] = f2;
        fArr[1] = f2;
        float[] fArr2 = this.k;
        float f3 = ((int) ((f * 315.0f) + 0.5f)) / 1000.0f;
        fArr2[0] = f3;
        fArr2[1] = f3;
        this.h = 1;
        float[] fArr3 = this.g;
        fArr3[0] = Float.MAX_VALUE;
        fArr3[1] = Float.MAX_VALUE;
        float[] fArr4 = this.f;
        fArr4[0] = 0.2f;
        fArr4[1] = 0.2f;
        float[] fArr5 = this.j;
        fArr5[0] = 0.001f;
        fArr5[1] = 0.001f;
        this.i = r;
        C0016a c0016a = this.f738b;
        c0016a.f742a = 500;
        c0016a.f743b = 500;
    }

    public static float b(float f, float f2, float f3) {
        return f > f3 ? f3 : f < f2 ? f2 : f;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final float a(int r4, float r5, float r6, float r7) {
        /*
            r3 = this;
            float[] r0 = r3.f
            r0 = r0[r4]
            float[] r1 = r3.g
            r1 = r1[r4]
            float r0 = r0 * r6
            r2 = 0
            float r0 = b(r0, r2, r1)
            float r1 = r3.c(r5, r0)
            float r6 = r6 - r5
            float r5 = r3.c(r6, r0)
            float r5 = r5 - r1
            int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r6 >= 0) goto L25
            android.view.animation.Interpolator r6 = r3.f739c
            float r5 = -r5
            float r5 = r6.getInterpolation(r5)
            float r5 = -r5
            goto L2f
        L25:
            int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r6 <= 0) goto L38
            android.view.animation.Interpolator r6 = r3.f739c
            float r5 = r6.getInterpolation(r5)
        L2f:
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0 = 1065353216(0x3f800000, float:1.0)
            float r5 = b(r5, r6, r0)
            goto L39
        L38:
            r5 = r2
        L39:
            int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r6 != 0) goto L3e
            return r2
        L3e:
            float[] r0 = r3.j
            r0 = r0[r4]
            float[] r1 = r3.k
            r1 = r1[r4]
            float[] r2 = r3.l
            r4 = r2[r4]
            float r0 = r0 * r7
            if (r6 <= 0) goto L53
            float r5 = r5 * r0
            float r4 = b(r5, r1, r4)
            return r4
        L53:
            float r5 = -r5
            float r5 = r5 * r0
            float r4 = b(r5, r1, r4)
            float r4 = -r4
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: a.g.k.a.a(int, float, float, float):float");
    }

    public final float c(float f, float f2) {
        if (f2 == 0.0f) {
            return 0.0f;
        }
        int i = this.h;
        if (i == 0 || i == 1) {
            if (f < f2) {
                if (f >= 0.0f) {
                    return 1.0f - (f / f2);
                }
                if (this.p && this.h == 1) {
                    return 1.0f;
                }
            }
        } else if (i == 2 && f < 0.0f) {
            return f / (-f2);
        }
        return 0.0f;
    }

    public final void d() {
        int i = 0;
        if (this.n) {
            this.p = false;
            return;
        }
        C0016a c0016a = this.f738b;
        if (c0016a == null) {
            throw null;
        }
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        int i2 = (int) (jCurrentAnimationTimeMillis - c0016a.f746e);
        int i3 = c0016a.f743b;
        if (i2 > i3) {
            i = i3;
        } else if (i2 >= 0) {
            i = i2;
        }
        c0016a.k = i;
        c0016a.j = c0016a.a(jCurrentAnimationTimeMillis);
        c0016a.i = jCurrentAnimationTimeMillis;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean e() {
        /*
            r9 = this;
            a.g.k.a$a r0 = r9.f738b
            float r1 = r0.f745d
            float r2 = java.lang.Math.abs(r1)
            float r1 = r1 / r2
            int r1 = (int) r1
            float r0 = r0.f744c
            float r2 = java.lang.Math.abs(r0)
            float r0 = r0 / r2
            int r0 = (int) r0
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L53
            r4 = r9
            a.g.k.c r4 = (a.g.k.c) r4
            android.widget.ListView r4 = r4.s
            int r5 = r4.getCount()
            if (r5 != 0) goto L23
        L21:
            r1 = r3
            goto L51
        L23:
            int r6 = r4.getChildCount()
            int r7 = r4.getFirstVisiblePosition()
            int r8 = r7 + r6
            if (r1 <= 0) goto L41
            if (r8 < r5) goto L50
            int r6 = r6 - r2
            android.view.View r1 = r4.getChildAt(r6)
            int r1 = r1.getBottom()
            int r4 = r4.getHeight()
            if (r1 > r4) goto L50
            goto L21
        L41:
            if (r1 >= 0) goto L21
            if (r7 > 0) goto L50
            android.view.View r1 = r4.getChildAt(r3)
            int r1 = r1.getTop()
            if (r1 < 0) goto L50
            goto L21
        L50:
            r1 = r2
        L51:
            if (r1 != 0) goto L54
        L53:
            r2 = r3
        L54:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: a.g.k.a.e():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0016  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouch(android.view.View r6, android.view.MotionEvent r7) {
        /*
            r5 = this;
            boolean r0 = r5.q
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            int r0 = r7.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L1a
            if (r0 == r2) goto L16
            r3 = 2
            if (r0 == r3) goto L1e
            r6 = 3
            if (r0 == r6) goto L16
            goto L7d
        L16:
            r5.d()
            goto L7d
        L1a:
            r5.o = r2
            r5.m = r1
        L1e:
            float r0 = r7.getX()
            int r3 = r6.getWidth()
            float r3 = (float) r3
            android.view.View r4 = r5.f740d
            int r4 = r4.getWidth()
            float r4 = (float) r4
            float r0 = r5.a(r1, r0, r3, r4)
            float r7 = r7.getY()
            int r6 = r6.getHeight()
            float r6 = (float) r6
            android.view.View r3 = r5.f740d
            int r3 = r3.getHeight()
            float r3 = (float) r3
            float r6 = r5.a(r2, r7, r6, r3)
            a.g.k.a$a r7 = r5.f738b
            r7.f744c = r0
            r7.f745d = r6
            boolean r6 = r5.p
            if (r6 != 0) goto L7d
            boolean r6 = r5.e()
            if (r6 == 0) goto L7d
            java.lang.Runnable r6 = r5.f741e
            if (r6 != 0) goto L61
            a.g.k.a$b r6 = new a.g.k.a$b
            r6.<init>()
            r5.f741e = r6
        L61:
            r5.p = r2
            r5.n = r2
            boolean r6 = r5.m
            if (r6 != 0) goto L76
            int r6 = r5.i
            if (r6 <= 0) goto L76
            android.view.View r7 = r5.f740d
            java.lang.Runnable r0 = r5.f741e
            long r3 = (long) r6
            a.g.j.k.r(r7, r0, r3)
            goto L7b
        L76:
            java.lang.Runnable r6 = r5.f741e
            r6.run()
        L7b:
            r5.m = r2
        L7d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: a.g.k.a.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
