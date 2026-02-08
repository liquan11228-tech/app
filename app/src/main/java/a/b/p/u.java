package a.b.p;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;

/* loaded from: classes.dex */
public class u extends q {

    /* renamed from: d, reason: collision with root package name */
    public final SeekBar f310d;

    /* renamed from: e, reason: collision with root package name */
    public Drawable f311e;
    public ColorStateList f;
    public PorterDuff.Mode g;
    public boolean h;
    public boolean i;

    public u(SeekBar seekBar) {
        super(seekBar);
        this.f = null;
        this.g = null;
        this.h = false;
        this.i = false;
        this.f310d = seekBar;
    }

    @Override // a.b.p.q
    public void a(AttributeSet attributeSet, int i) {
        super.a(attributeSet, i);
        x0 x0VarO = x0.o(this.f310d.getContext(), attributeSet, a.b.j.AppCompatSeekBar, i, 0);
        SeekBar seekBar = this.f310d;
        a.g.j.k.t(seekBar, seekBar.getContext(), a.b.j.AppCompatSeekBar, attributeSet, x0VarO.f336b, i, 0);
        Drawable drawableF = x0VarO.f(a.b.j.AppCompatSeekBar_android_thumb);
        if (drawableF != null) {
            this.f310d.setThumb(drawableF);
        }
        Drawable drawableE = x0VarO.e(a.b.j.AppCompatSeekBar_tickMark);
        Drawable drawable = this.f311e;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.f311e = drawableE;
        if (drawableE != null) {
            drawableE.setCallback(this.f310d);
            drawableE.setLayoutDirection(a.g.j.k.f(this.f310d));
            if (drawableE.isStateful()) {
                drawableE.setState(this.f310d.getDrawableState());
            }
            c();
        }
        this.f310d.invalidate();
        if (x0VarO.m(a.b.j.AppCompatSeekBar_tickMarkTintMode)) {
            this.g = e0.c(x0VarO.h(a.b.j.AppCompatSeekBar_tickMarkTintMode, -1), this.g);
            this.i = true;
        }
        if (x0VarO.m(a.b.j.AppCompatSeekBar_tickMarkTint)) {
            this.f = x0VarO.b(a.b.j.AppCompatSeekBar_tickMarkTint);
            this.h = true;
        }
        x0VarO.f336b.recycle();
        c();
    }

    public final void c() {
        if (this.f311e != null) {
            if (this.h || this.i) {
                Drawable drawableMutate = this.f311e.mutate();
                this.f311e = drawableMutate;
                if (this.h) {
                    drawableMutate.setTintList(this.f);
                }
                if (this.i) {
                    this.f311e.setTintMode(this.g);
                }
                if (this.f311e.isStateful()) {
                    this.f311e.setState(this.f310d.getDrawableState());
                }
            }
        }
    }

    public void d(Canvas canvas) {
        if (this.f311e != null) {
            int max = this.f310d.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f311e.getIntrinsicWidth();
                int intrinsicHeight = this.f311e.getIntrinsicHeight();
                int i = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i2 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f311e.setBounds(-i, -i2, i, i2);
                float width = ((this.f310d.getWidth() - this.f310d.getPaddingLeft()) - this.f310d.getPaddingRight()) / max;
                int iSave = canvas.save();
                canvas.translate(this.f310d.getPaddingLeft(), this.f310d.getHeight() / 2);
                for (int i3 = 0; i3 <= max; i3++) {
                    this.f311e.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(iSave);
            }
        }
    }
}
