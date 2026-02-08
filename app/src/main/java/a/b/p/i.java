package a.b.p;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CompoundButton;

/* loaded from: classes.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    public final CompoundButton f235a;

    /* renamed from: b, reason: collision with root package name */
    public ColorStateList f236b = null;

    /* renamed from: c, reason: collision with root package name */
    public PorterDuff.Mode f237c = null;

    /* renamed from: d, reason: collision with root package name */
    public boolean f238d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f239e = false;
    public boolean f;

    public i(CompoundButton compoundButton) {
        this.f235a = compoundButton;
    }

    public void a() {
        Drawable buttonDrawable = this.f235a.getButtonDrawable();
        if (buttonDrawable != null) {
            if (this.f238d || this.f239e) {
                Drawable drawableMutate = buttonDrawable.mutate();
                if (this.f238d) {
                    drawableMutate.setTintList(this.f236b);
                }
                if (this.f239e) {
                    drawableMutate.setTintMode(this.f237c);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(this.f235a.getDrawableState());
                }
                this.f235a.setButtonDrawable(drawableMutate);
            }
        }
    }

    public void b(AttributeSet attributeSet, int i) {
        boolean z;
        int iJ;
        int iJ2;
        x0 x0VarO = x0.o(this.f235a.getContext(), attributeSet, a.b.j.CompoundButton, i, 0);
        CompoundButton compoundButton = this.f235a;
        a.g.j.k.t(compoundButton, compoundButton.getContext(), a.b.j.CompoundButton, attributeSet, x0VarO.f336b, i, 0);
        try {
            if (!x0VarO.m(a.b.j.CompoundButton_buttonCompat) || (iJ2 = x0VarO.j(a.b.j.CompoundButton_buttonCompat, 0)) == 0) {
                z = false;
            } else {
                try {
                    this.f235a.setButtonDrawable(a.b.l.a.a.b(this.f235a.getContext(), iJ2));
                    z = true;
                } catch (Resources.NotFoundException unused) {
                }
            }
            if (!z && x0VarO.m(a.b.j.CompoundButton_android_button) && (iJ = x0VarO.j(a.b.j.CompoundButton_android_button, 0)) != 0) {
                this.f235a.setButtonDrawable(a.b.l.a.a.b(this.f235a.getContext(), iJ));
            }
            if (x0VarO.m(a.b.j.CompoundButton_buttonTint)) {
                this.f235a.setButtonTintList(x0VarO.b(a.b.j.CompoundButton_buttonTint));
            }
            if (x0VarO.m(a.b.j.CompoundButton_buttonTintMode)) {
                this.f235a.setButtonTintMode(e0.c(x0VarO.h(a.b.j.CompoundButton_buttonTintMode, -1), null));
            }
            x0VarO.f336b.recycle();
        } catch (Throwable th) {
            x0VarO.f336b.recycle();
            throw th;
        }
    }
}
