package a.b.p;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CheckBox;

/* loaded from: classes.dex */
public class g extends CheckBox {

    /* renamed from: b, reason: collision with root package name */
    public final i f224b;

    /* renamed from: c, reason: collision with root package name */
    public final e f225c;

    /* renamed from: d, reason: collision with root package name */
    public final y f226d;

    /* JADX WARN: Illegal instructions before constructor call */
    public g(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        int i = a.b.a.checkboxStyle;
        u0.a(context);
        super(context, attributeSet, i);
        s0.a(this, getContext());
        i iVar = new i(this);
        this.f224b = iVar;
        iVar.b(attributeSet, i);
        e eVar = new e(this);
        this.f225c = eVar;
        eVar.d(attributeSet, i);
        y yVar = new y(this);
        this.f226d = yVar;
        yVar.e(attributeSet, i);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f225c;
        if (eVar != null) {
            eVar.a();
        }
        y yVar = this.f226d;
        if (yVar != null) {
            yVar.b();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        i iVar = this.f224b;
        return compoundPaddingLeft;
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f225c;
        if (eVar != null) {
            return eVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f225c;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public ColorStateList getSupportButtonTintList() {
        i iVar = this.f224b;
        if (iVar != null) {
            return iVar.f236b;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        i iVar = this.f224b;
        if (iVar != null) {
            return iVar.f237c;
        }
        return null;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f225c;
        if (eVar != null) {
            eVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        e eVar = this.f225c;
        if (eVar != null) {
            eVar.f(i);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(a.b.l.a.a.b(getContext(), i));
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        i iVar = this.f224b;
        if (iVar != null) {
            if (iVar.f) {
                iVar.f = false;
            } else {
                iVar.f = true;
                iVar.a();
            }
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f225c;
        if (eVar != null) {
            eVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f225c;
        if (eVar != null) {
            eVar.i(mode);
        }
    }

    public void setSupportButtonTintList(ColorStateList colorStateList) {
        i iVar = this.f224b;
        if (iVar != null) {
            iVar.f236b = colorStateList;
            iVar.f238d = true;
            iVar.a();
        }
    }

    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        i iVar = this.f224b;
        if (iVar != null) {
            iVar.f237c = mode;
            iVar.f239e = true;
            iVar.a();
        }
    }
}
