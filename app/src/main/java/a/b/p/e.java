package a.b.p;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;

/* loaded from: classes.dex */
public class e {

    /* renamed from: a */
    public final View f209a;

    /* renamed from: d */
    public v0 f212d;

    /* renamed from: e */
    public v0 f213e;
    public v0 f;

    /* renamed from: c */
    public int f211c = -1;

    /* renamed from: b */
    public final j f210b = j.a();

    public e(View view) {
        this.f209a = view;
    }

    public void a() {
        Drawable background = this.f209a.getBackground();
        if (background != null) {
            boolean z = true;
            if (this.f212d != null) {
                if (this.f == null) {
                    this.f = new v0();
                }
                v0 v0Var = this.f;
                v0Var.f313a = null;
                v0Var.f316d = false;
                v0Var.f314b = null;
                v0Var.f315c = false;
                ColorStateList colorStateListE = a.g.j.k.e(this.f209a);
                if (colorStateListE != null) {
                    v0Var.f316d = true;
                    v0Var.f313a = colorStateListE;
                }
                PorterDuff.Mode backgroundTintMode = this.f209a.getBackgroundTintMode();
                if (backgroundTintMode != null) {
                    v0Var.f315c = true;
                    v0Var.f314b = backgroundTintMode;
                }
                if (v0Var.f316d || v0Var.f315c) {
                    j.e(background, v0Var, this.f209a.getDrawableState());
                } else {
                    z = false;
                }
                if (z) {
                    return;
                }
            }
            v0 v0Var2 = this.f213e;
            if (v0Var2 != null) {
                j.e(background, v0Var2, this.f209a.getDrawableState());
                return;
            }
            v0 v0Var3 = this.f212d;
            if (v0Var3 != null) {
                j.e(background, v0Var3, this.f209a.getDrawableState());
            }
        }
    }

    public ColorStateList b() {
        v0 v0Var = this.f213e;
        if (v0Var != null) {
            return v0Var.f313a;
        }
        return null;
    }

    public PorterDuff.Mode c() {
        v0 v0Var = this.f213e;
        if (v0Var != null) {
            return v0Var.f314b;
        }
        return null;
    }

    public void d(AttributeSet attributeSet, int i) {
        x0 x0VarO = x0.o(this.f209a.getContext(), attributeSet, a.b.j.ViewBackgroundHelper, i, 0);
        View view = this.f209a;
        a.g.j.k.t(view, view.getContext(), a.b.j.ViewBackgroundHelper, attributeSet, x0VarO.f336b, i, 0);
        try {
            if (x0VarO.m(a.b.j.ViewBackgroundHelper_android_background)) {
                this.f211c = x0VarO.j(a.b.j.ViewBackgroundHelper_android_background, -1);
                ColorStateList colorStateListC = this.f210b.c(this.f209a.getContext(), this.f211c);
                if (colorStateListC != null) {
                    g(colorStateListC);
                }
            }
            if (x0VarO.m(a.b.j.ViewBackgroundHelper_backgroundTint)) {
                this.f209a.setBackgroundTintList(x0VarO.b(a.b.j.ViewBackgroundHelper_backgroundTint));
            }
            if (x0VarO.m(a.b.j.ViewBackgroundHelper_backgroundTintMode)) {
                this.f209a.setBackgroundTintMode(e0.c(x0VarO.h(a.b.j.ViewBackgroundHelper_backgroundTintMode, -1), null));
            }
            x0VarO.f336b.recycle();
        } catch (Throwable th) {
            x0VarO.f336b.recycle();
            throw th;
        }
    }

    public void e() {
        this.f211c = -1;
        g(null);
        a();
    }

    public void f(int i) {
        this.f211c = i;
        j jVar = this.f210b;
        g(jVar != null ? jVar.c(this.f209a.getContext(), i) : null);
        a();
    }

    public void g(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f212d == null) {
                this.f212d = new v0();
            }
            v0 v0Var = this.f212d;
            v0Var.f313a = colorStateList;
            v0Var.f316d = true;
        } else {
            this.f212d = null;
        }
        a();
    }

    public void h(ColorStateList colorStateList) {
        if (this.f213e == null) {
            this.f213e = new v0();
        }
        v0 v0Var = this.f213e;
        v0Var.f313a = colorStateList;
        v0Var.f316d = true;
        a();
    }

    public void i(PorterDuff.Mode mode) {
        if (this.f213e == null) {
            this.f213e = new v0();
        }
        v0 v0Var = this.f213e;
        v0Var.f314b = mode;
        v0Var.f315c = true;
        a();
    }
}
