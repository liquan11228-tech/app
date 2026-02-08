package a.g.j;

import android.graphics.Insets;
import android.os.Build;
import android.view.DisplayCutout;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.Objects;

/* loaded from: classes.dex */
public class s {

    /* renamed from: b, reason: collision with root package name */
    public static final s f714b;

    /* renamed from: a, reason: collision with root package name */
    public final h f715a;

    public static class a extends c {

        /* renamed from: c, reason: collision with root package name */
        public static Field f716c;

        /* renamed from: d, reason: collision with root package name */
        public static boolean f717d;

        /* renamed from: e, reason: collision with root package name */
        public static Constructor<WindowInsets> f718e;
        public static boolean f;

        /* renamed from: b, reason: collision with root package name */
        public WindowInsets f719b;

        /* JADX WARN: Removed duplicated region for block: B:12:0x0028  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public a() throws java.lang.IllegalAccessException, java.lang.InstantiationException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
            /*
                r6 = this;
                r6.<init>()
                boolean r0 = a.g.j.s.a.f717d
                r1 = 1
                if (r0 != 0) goto L14
                java.lang.Class<android.view.WindowInsets> r0 = android.view.WindowInsets.class
                java.lang.String r2 = "CONSUMED"
                java.lang.reflect.Field r0 = r0.getDeclaredField(r2)     // Catch: java.lang.ReflectiveOperationException -> L12
                a.g.j.s.a.f716c = r0     // Catch: java.lang.ReflectiveOperationException -> L12
            L12:
                a.g.j.s.a.f717d = r1
            L14:
                java.lang.reflect.Field r0 = a.g.j.s.a.f716c
                r2 = 0
                if (r0 == 0) goto L28
                java.lang.Object r0 = r0.get(r2)     // Catch: java.lang.ReflectiveOperationException -> L28
                android.view.WindowInsets r0 = (android.view.WindowInsets) r0     // Catch: java.lang.ReflectiveOperationException -> L28
                if (r0 == 0) goto L28
                android.view.WindowInsets r3 = new android.view.WindowInsets     // Catch: java.lang.ReflectiveOperationException -> L28
                r3.<init>(r0)     // Catch: java.lang.ReflectiveOperationException -> L28
                r2 = r3
                goto L51
            L28:
                boolean r0 = a.g.j.s.a.f
                r3 = 0
                if (r0 != 0) goto L3d
                java.lang.Class<android.view.WindowInsets> r0 = android.view.WindowInsets.class
                java.lang.Class[] r4 = new java.lang.Class[r1]     // Catch: java.lang.ReflectiveOperationException -> L3b
                java.lang.Class<android.graphics.Rect> r5 = android.graphics.Rect.class
                r4[r3] = r5     // Catch: java.lang.ReflectiveOperationException -> L3b
                java.lang.reflect.Constructor r0 = r0.getConstructor(r4)     // Catch: java.lang.ReflectiveOperationException -> L3b
                a.g.j.s.a.f718e = r0     // Catch: java.lang.ReflectiveOperationException -> L3b
            L3b:
                a.g.j.s.a.f = r1
            L3d:
                java.lang.reflect.Constructor<android.view.WindowInsets> r0 = a.g.j.s.a.f718e
                if (r0 == 0) goto L51
                java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.ReflectiveOperationException -> L51
                android.graphics.Rect r4 = new android.graphics.Rect     // Catch: java.lang.ReflectiveOperationException -> L51
                r4.<init>()     // Catch: java.lang.ReflectiveOperationException -> L51
                r1[r3] = r4     // Catch: java.lang.ReflectiveOperationException -> L51
                java.lang.Object r0 = r0.newInstance(r1)     // Catch: java.lang.ReflectiveOperationException -> L51
                android.view.WindowInsets r0 = (android.view.WindowInsets) r0     // Catch: java.lang.ReflectiveOperationException -> L51
                r2 = r0
            L51:
                r6.f719b = r2
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: a.g.j.s.a.<init>():void");
        }

        public a(s sVar) {
            this.f719b = sVar.g();
        }

        @Override // a.g.j.s.c
        public s a() {
            return s.h(this.f719b);
        }

        @Override // a.g.j.s.c
        public void c(a.g.e.b bVar) {
            WindowInsets windowInsets = this.f719b;
            if (windowInsets != null) {
                this.f719b = windowInsets.replaceSystemWindowInsets(bVar.f617a, bVar.f618b, bVar.f619c, bVar.f620d);
            }
        }
    }

    public static class b extends c {

        /* renamed from: b, reason: collision with root package name */
        public final WindowInsets.Builder f720b;

        public b() {
            this.f720b = new WindowInsets.Builder();
        }

        public b(s sVar) {
            WindowInsets windowInsetsG = sVar.g();
            this.f720b = windowInsetsG != null ? new WindowInsets.Builder(windowInsetsG) : new WindowInsets.Builder();
        }

        @Override // a.g.j.s.c
        public s a() {
            return s.h(this.f720b.build());
        }

        @Override // a.g.j.s.c
        public void b(a.g.e.b bVar) {
            this.f720b.setStableInsets(Insets.of(bVar.f617a, bVar.f618b, bVar.f619c, bVar.f620d));
        }

        @Override // a.g.j.s.c
        public void c(a.g.e.b bVar) {
            this.f720b.setSystemWindowInsets(Insets.of(bVar.f617a, bVar.f618b, bVar.f619c, bVar.f620d));
        }
    }

    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public final s f721a = new s((s) null);

        public abstract s a();

        public void b(a.g.e.b bVar) {
        }

        public abstract void c(a.g.e.b bVar);
    }

    public static class d extends h {

        /* renamed from: b, reason: collision with root package name */
        public final WindowInsets f722b;

        /* renamed from: c, reason: collision with root package name */
        public a.g.e.b f723c;

        public d(s sVar, WindowInsets windowInsets) {
            super(sVar);
            this.f723c = null;
            this.f722b = windowInsets;
        }

        @Override // a.g.j.s.h
        public final a.g.e.b f() {
            if (this.f723c == null) {
                this.f723c = a.g.e.b.a(this.f722b.getSystemWindowInsetLeft(), this.f722b.getSystemWindowInsetTop(), this.f722b.getSystemWindowInsetRight(), this.f722b.getSystemWindowInsetBottom());
            }
            return this.f723c;
        }

        @Override // a.g.j.s.h
        public s g(int i, int i2, int i3, int i4) {
            s sVarH = s.h(this.f722b);
            c bVar = Build.VERSION.SDK_INT >= 29 ? new b(sVarH) : new a(sVarH);
            bVar.c(s.f(f(), i, i2, i3, i4));
            bVar.b(s.f(e(), i, i2, i3, i4));
            return bVar.a();
        }

        @Override // a.g.j.s.h
        public boolean i() {
            return this.f722b.isRound();
        }
    }

    public static class e extends d {

        /* renamed from: d, reason: collision with root package name */
        public a.g.e.b f724d;

        public e(s sVar, WindowInsets windowInsets) {
            super(sVar, windowInsets);
            this.f724d = null;
        }

        @Override // a.g.j.s.h
        public s b() {
            return s.h(this.f722b.consumeStableInsets());
        }

        @Override // a.g.j.s.h
        public s c() {
            return s.h(this.f722b.consumeSystemWindowInsets());
        }

        @Override // a.g.j.s.h
        public final a.g.e.b e() {
            if (this.f724d == null) {
                this.f724d = a.g.e.b.a(this.f722b.getStableInsetLeft(), this.f722b.getStableInsetTop(), this.f722b.getStableInsetRight(), this.f722b.getStableInsetBottom());
            }
            return this.f724d;
        }

        @Override // a.g.j.s.h
        public boolean h() {
            return this.f722b.isConsumed();
        }
    }

    public static class f extends e {
        public f(s sVar, WindowInsets windowInsets) {
            super(sVar, windowInsets);
        }

        @Override // a.g.j.s.h
        public s a() {
            return s.h(this.f722b.consumeDisplayCutout());
        }

        @Override // a.g.j.s.h
        public a.g.j.c d() {
            DisplayCutout displayCutout = this.f722b.getDisplayCutout();
            if (displayCutout == null) {
                return null;
            }
            return new a.g.j.c(displayCutout);
        }

        @Override // a.g.j.s.h
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof f) {
                return Objects.equals(this.f722b, ((f) obj).f722b);
            }
            return false;
        }

        @Override // a.g.j.s.h
        public int hashCode() {
            return this.f722b.hashCode();
        }
    }

    public static class g extends f {
        public g(s sVar, WindowInsets windowInsets) {
            super(sVar, windowInsets);
        }

        @Override // a.g.j.s.d, a.g.j.s.h
        public s g(int i, int i2, int i3, int i4) {
            return s.h(this.f722b.inset(i, i2, i3, i4));
        }
    }

    public static class h {

        /* renamed from: a, reason: collision with root package name */
        public final s f725a;

        public h(s sVar) {
            this.f725a = sVar;
        }

        public s a() {
            return this.f725a;
        }

        public s b() {
            return this.f725a;
        }

        public s c() {
            return this.f725a;
        }

        public a.g.j.c d() {
            return null;
        }

        public a.g.e.b e() {
            return a.g.e.b.f616e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return i() == hVar.i() && h() == hVar.h() && Objects.equals(f(), hVar.f()) && Objects.equals(e(), hVar.e()) && Objects.equals(d(), hVar.d());
        }

        public a.g.e.b f() {
            return a.g.e.b.f616e;
        }

        public s g(int i, int i2, int i3, int i4) {
            return s.f714b;
        }

        public boolean h() {
            return false;
        }

        public int hashCode() {
            return Objects.hash(Boolean.valueOf(i()), Boolean.valueOf(h()), f(), e(), d());
        }

        public boolean i() {
            return false;
        }
    }

    static {
        f714b = (Build.VERSION.SDK_INT >= 29 ? new b() : new a()).a().f715a.a().f715a.b().f715a.c();
    }

    public s(s sVar) {
        this.f715a = new h(this);
    }

    public s(WindowInsets windowInsets) {
        int i = Build.VERSION.SDK_INT;
        this.f715a = i >= 29 ? new g(this, windowInsets) : i >= 28 ? new f(this, windowInsets) : new e(this, windowInsets);
    }

    public static a.g.e.b f(a.g.e.b bVar, int i, int i2, int i3, int i4) {
        int iMax = Math.max(0, bVar.f617a - i);
        int iMax2 = Math.max(0, bVar.f618b - i2);
        int iMax3 = Math.max(0, bVar.f619c - i3);
        int iMax4 = Math.max(0, bVar.f620d - i4);
        return (iMax == i && iMax2 == i2 && iMax3 == i3 && iMax4 == i4) ? bVar : a.g.e.b.a(iMax, iMax2, iMax3, iMax4);
    }

    public static s h(WindowInsets windowInsets) {
        if (windowInsets != null) {
            return new s(windowInsets);
        }
        throw null;
    }

    public int a() {
        return e().f620d;
    }

    public int b() {
        return e().f617a;
    }

    public int c() {
        return e().f619c;
    }

    public int d() {
        return e().f618b;
    }

    public a.g.e.b e() {
        return this.f715a.f();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof s) {
            return Objects.equals(this.f715a, ((s) obj).f715a);
        }
        return false;
    }

    public WindowInsets g() {
        h hVar = this.f715a;
        if (hVar instanceof d) {
            return ((d) hVar).f722b;
        }
        return null;
    }

    public int hashCode() {
        h hVar = this.f715a;
        if (hVar == null) {
            return 0;
        }
        return hVar.hashCode();
    }
}
