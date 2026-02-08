package a.b.p;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageButton;

/* loaded from: classes.dex */
public class l extends ImageButton {

    /* renamed from: b, reason: collision with root package name */
    public final e f267b;

    /* renamed from: c, reason: collision with root package name */
    public final m f268c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        u0.a(context);
        s0.a(this, getContext());
        e eVar = new e(this);
        this.f267b = eVar;
        eVar.d(attributeSet, i);
        m mVar = new m(this);
        this.f268c = mVar;
        mVar.b(attributeSet, i);
    }

    @Override // android.widget.ImageView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f267b;
        if (eVar != null) {
            eVar.a();
        }
        m mVar = this.f268c;
        if (mVar != null) {
            mVar.a();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f267b;
        if (eVar != null) {
            return eVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f267b;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        v0 v0Var;
        m mVar = this.f268c;
        if (mVar == null || (v0Var = mVar.f270b) == null) {
            return null;
        }
        return v0Var.f313a;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        v0 v0Var;
        m mVar = this.f268c;
        if (mVar == null || (v0Var = mVar.f270b) == null) {
            return null;
        }
        return v0Var.f314b;
    }

    @Override // android.widget.ImageView, android.view.View
    public boolean hasOverlappingRendering() {
        return ((this.f268c.f269a.getBackground() instanceof RippleDrawable) ^ true) && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f267b;
        if (eVar != null) {
            eVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        e eVar = this.f267b;
        if (eVar != null) {
            eVar.f(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        m mVar = this.f268c;
        if (mVar != null) {
            mVar.a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        m mVar = this.f268c;
        if (mVar != null) {
            mVar.a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        this.f268c.c(i);
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        m mVar = this.f268c;
        if (mVar != null) {
            mVar.a();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f267b;
        if (eVar != null) {
            eVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f267b;
        if (eVar != null) {
            eVar.i(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        m mVar = this.f268c;
        if (mVar != null) {
            mVar.d(colorStateList);
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        m mVar = this.f268c;
        if (mVar != null) {
            mVar.e(mode);
        }
    }
}
