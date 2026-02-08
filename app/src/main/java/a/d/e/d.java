package a.d.e;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public class d extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    public float f380a;

    /* renamed from: c, reason: collision with root package name */
    public final RectF f382c;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f383d;

    /* renamed from: e, reason: collision with root package name */
    public float f384e;
    public ColorStateList h;
    public PorterDuffColorFilter i;
    public ColorStateList j;
    public boolean f = false;
    public boolean g = true;
    public PorterDuff.Mode k = PorterDuff.Mode.SRC_IN;

    /* renamed from: b, reason: collision with root package name */
    public final Paint f381b = new Paint(5);

    public d(ColorStateList colorStateList, float f) {
        this.f380a = f;
        b(colorStateList);
        this.f382c = new RectF();
        this.f383d = new Rect();
    }

    public final PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    public final void b(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.h = colorStateList;
        this.f381b.setColor(colorStateList.getColorForState(getState(), this.h.getDefaultColor()));
    }

    public final void c(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        this.f382c.set(rect.left, rect.top, rect.right, rect.bottom);
        this.f383d.set(rect);
        if (this.f) {
            this.f383d.inset((int) Math.ceil(e.a(this.f384e, this.f380a, this.g)), (int) Math.ceil(e.b(this.f384e, this.f380a, this.g)));
            this.f382c.set(this.f383d);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        boolean z;
        Paint paint = this.f381b;
        if (this.i == null || paint.getColorFilter() != null) {
            z = false;
        } else {
            paint.setColorFilter(this.i);
            z = true;
        }
        RectF rectF = this.f382c;
        float f = this.f380a;
        canvas.drawRoundRect(rectF, f, f, paint);
        if (z) {
            paint.setColorFilter(null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        outline.setRoundRect(this.f383d, this.f380a);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.j;
        return (colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = this.h) != null && colorStateList.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        c(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.h;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        boolean z = colorForState != this.f381b.getColor();
        if (z) {
            this.f381b.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.j;
        if (colorStateList2 == null || (mode = this.k) == null) {
            return z;
        }
        this.i = a(colorStateList2, mode);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f381b.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f381b.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.j = colorStateList;
        this.i = a(colorStateList, this.k);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        this.k = mode;
        this.i = a(this.j, mode);
        invalidateSelf();
    }
}
