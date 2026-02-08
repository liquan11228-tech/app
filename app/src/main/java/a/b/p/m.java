package a.b.p;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;

/* loaded from: classes.dex */
public class m {

    /* renamed from: a, reason: collision with root package name */
    public final ImageView f269a;

    /* renamed from: b, reason: collision with root package name */
    public v0 f270b;

    public m(ImageView imageView) {
        this.f269a = imageView;
    }

    public void a() {
        v0 v0Var;
        Drawable drawable = this.f269a.getDrawable();
        if (drawable != null) {
            e0.b(drawable);
        }
        if (drawable == null || (v0Var = this.f270b) == null) {
            return;
        }
        j.e(drawable, v0Var, this.f269a.getDrawableState());
    }

    public void b(AttributeSet attributeSet, int i) {
        int iJ;
        x0 x0VarO = x0.o(this.f269a.getContext(), attributeSet, a.b.j.AppCompatImageView, i, 0);
        ImageView imageView = this.f269a;
        a.g.j.k.t(imageView, imageView.getContext(), a.b.j.AppCompatImageView, attributeSet, x0VarO.f336b, i, 0);
        try {
            Drawable drawable = this.f269a.getDrawable();
            if (drawable == null && (iJ = x0VarO.j(a.b.j.AppCompatImageView_srcCompat, -1)) != -1 && (drawable = a.b.l.a.a.b(this.f269a.getContext(), iJ)) != null) {
                this.f269a.setImageDrawable(drawable);
            }
            if (drawable != null) {
                e0.b(drawable);
            }
            if (x0VarO.m(a.b.j.AppCompatImageView_tint)) {
                this.f269a.setImageTintList(x0VarO.b(a.b.j.AppCompatImageView_tint));
            }
            if (x0VarO.m(a.b.j.AppCompatImageView_tintMode)) {
                this.f269a.setImageTintMode(e0.c(x0VarO.h(a.b.j.AppCompatImageView_tintMode, -1), null));
            }
            x0VarO.f336b.recycle();
        } catch (Throwable th) {
            x0VarO.f336b.recycle();
            throw th;
        }
    }

    public void c(int i) {
        if (i != 0) {
            Drawable drawableB = a.b.l.a.a.b(this.f269a.getContext(), i);
            if (drawableB != null) {
                e0.b(drawableB);
            }
            this.f269a.setImageDrawable(drawableB);
        } else {
            this.f269a.setImageDrawable(null);
        }
        a();
    }

    public void d(ColorStateList colorStateList) {
        if (this.f270b == null) {
            this.f270b = new v0();
        }
        v0 v0Var = this.f270b;
        v0Var.f313a = colorStateList;
        v0Var.f316d = true;
        a();
    }

    public void e(PorterDuff.Mode mode) {
        if (this.f270b == null) {
            this.f270b = new v0();
        }
        v0 v0Var = this.f270b;
        v0Var.f314b = mode;
        v0Var.f315c = true;
        a();
    }
}
