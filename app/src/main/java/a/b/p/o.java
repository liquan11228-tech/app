package a.b.p;

import a.b.k.h;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.MultiAutoCompleteTextView;

/* loaded from: classes.dex */
public class o extends MultiAutoCompleteTextView {

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f278d = {R.attr.popupBackground};

    /* renamed from: b, reason: collision with root package name */
    public final e f279b;

    /* renamed from: c, reason: collision with root package name */
    public final y f280c;

    /* JADX WARN: Illegal instructions before constructor call */
    public o(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        int i = a.b.a.autoCompleteTextViewStyle;
        u0.a(context);
        super(context, attributeSet, i);
        s0.a(this, getContext());
        x0 x0VarO = x0.o(getContext(), attributeSet, f278d, i, 0);
        if (x0VarO.m(0)) {
            setDropDownBackgroundDrawable(x0VarO.e(0));
        }
        x0VarO.f336b.recycle();
        e eVar = new e(this);
        this.f279b = eVar;
        eVar.d(attributeSet, i);
        y yVar = new y(this);
        this.f280c = yVar;
        yVar.e(attributeSet, i);
        this.f280c.b();
    }

    @Override // android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f279b;
        if (eVar != null) {
            eVar.a();
        }
        y yVar = this.f280c;
        if (yVar != null) {
            yVar.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f279b;
        if (eVar != null) {
            return eVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f279b;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        h.i.I(inputConnectionOnCreateInputConnection, editorInfo, this);
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f279b;
        if (eVar != null) {
            eVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        e eVar = this.f279b;
        if (eVar != null) {
            eVar.f(i);
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(a.b.l.a.a.b(getContext(), i));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f279b;
        if (eVar != null) {
            eVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f279b;
        if (eVar != null) {
            eVar.i(mode);
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        y yVar = this.f280c;
        if (yVar != null) {
            yVar.f(context, i);
        }
    }
}
