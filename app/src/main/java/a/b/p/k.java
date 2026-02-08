package a.b.p;

import a.b.k.h;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;

/* loaded from: classes.dex */
public class k extends EditText {

    /* renamed from: b, reason: collision with root package name */
    public final e f255b;

    /* renamed from: c, reason: collision with root package name */
    public final y f256c;

    /* renamed from: d, reason: collision with root package name */
    public final x f257d;

    /* JADX WARN: Illegal instructions before constructor call */
    public k(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        int i = a.b.a.editTextStyle;
        u0.a(context);
        super(context, attributeSet, i);
        s0.a(this, getContext());
        e eVar = new e(this);
        this.f255b = eVar;
        eVar.d(attributeSet, i);
        y yVar = new y(this);
        this.f256c = yVar;
        yVar.e(attributeSet, i);
        this.f256c.b();
        this.f257d = new x(this);
    }

    @Override // android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f255b;
        if (eVar != null) {
            eVar.a();
        }
        y yVar = this.f256c;
        if (yVar != null) {
            yVar.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f255b;
        if (eVar != null) {
            return eVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f255b;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : super.getEditableText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        x xVar;
        return (Build.VERSION.SDK_INT >= 28 || (xVar = this.f257d) == null) ? super.getTextClassifier() : xVar.a();
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
        e eVar = this.f255b;
        if (eVar != null) {
            eVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        e eVar = this.f255b;
        if (eVar != null) {
            eVar.f(i);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(h.i.a0(this, callback));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f255b;
        if (eVar != null) {
            eVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f255b;
        if (eVar != null) {
            eVar.i(mode);
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        y yVar = this.f256c;
        if (yVar != null) {
            yVar.f(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        x xVar;
        if (Build.VERSION.SDK_INT >= 28 || (xVar = this.f257d) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            xVar.f334b = textClassifier;
        }
    }
}
