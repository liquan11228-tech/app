package a.b.p;

import a.b.k.h;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public class f extends Button implements a.g.k.b {

    /* renamed from: b, reason: collision with root package name */
    public final e f216b;

    /* renamed from: c, reason: collision with root package name */
    public final y f217c;

    /* JADX WARN: Illegal instructions before constructor call */
    public f(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        int i = a.b.a.buttonStyle;
        u0.a(context);
        super(context, attributeSet, i);
        s0.a(this, getContext());
        e eVar = new e(this);
        this.f216b = eVar;
        eVar.d(attributeSet, i);
        y yVar = new y(this);
        this.f217c = yVar;
        yVar.e(attributeSet, i);
        this.f217c.b();
    }

    @Override // android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f216b;
        if (eVar != null) {
            eVar.a();
        }
        y yVar = this.f217c;
        if (yVar != null) {
            yVar.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (a.g.k.b.f748a) {
            return super.getAutoSizeMaxTextSize();
        }
        y yVar = this.f217c;
        if (yVar != null) {
            return Math.round(yVar.i.f197e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (a.g.k.b.f748a) {
            return super.getAutoSizeMinTextSize();
        }
        y yVar = this.f217c;
        if (yVar != null) {
            return Math.round(yVar.i.f196d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (a.g.k.b.f748a) {
            return super.getAutoSizeStepGranularity();
        }
        y yVar = this.f217c;
        if (yVar != null) {
            return Math.round(yVar.i.f195c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (a.g.k.b.f748a) {
            return super.getAutoSizeTextAvailableSizes();
        }
        y yVar = this.f217c;
        return yVar != null ? yVar.i.f : new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (a.g.k.b.f748a) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        y yVar = this.f217c;
        if (yVar != null) {
            return yVar.i.f193a;
        }
        return 0;
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f216b;
        if (eVar != null) {
            return eVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f216b;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        v0 v0Var = this.f217c.h;
        if (v0Var != null) {
            return v0Var.f313a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        v0 v0Var = this.f217c.h;
        if (v0Var != null) {
            return v0Var.f314b;
        }
        return null;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        y yVar = this.f217c;
        if (yVar == null || a.g.k.b.f748a) {
            return;
        }
        yVar.i.a();
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        y yVar = this.f217c;
        if (yVar == null || a.g.k.b.f748a || !yVar.d()) {
            return;
        }
        this.f217c.i.a();
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (a.g.k.b.f748a) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        y yVar = this.f217c;
        if (yVar != null) {
            yVar.g(i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (a.g.k.b.f748a) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        y yVar = this.f217c;
        if (yVar != null) {
            yVar.h(iArr, i);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (a.g.k.b.f748a) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        y yVar = this.f217c;
        if (yVar != null) {
            yVar.i(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f216b;
        if (eVar != null) {
            eVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        e eVar = this.f216b;
        if (eVar != null) {
            eVar.f(i);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(h.i.a0(this, callback));
    }

    public void setSupportAllCaps(boolean z) {
        y yVar = this.f217c;
        if (yVar != null) {
            yVar.f338a.setAllCaps(z);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f216b;
        if (eVar != null) {
            eVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f216b;
        if (eVar != null) {
            eVar.i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f217c.j(colorStateList);
        this.f217c.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f217c.k(mode);
        this.f217c.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        y yVar = this.f217c;
        if (yVar != null) {
            yVar.f(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextSize(int i, float f) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        boolean z = a.g.k.b.f748a;
        if (z) {
            super.setTextSize(i, f);
            return;
        }
        y yVar = this.f217c;
        if (yVar == null || z || yVar.d()) {
            return;
        }
        yVar.i.f(i, f);
    }
}
