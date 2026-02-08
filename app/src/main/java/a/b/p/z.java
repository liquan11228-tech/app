package a.b.p;

import a.b.k.h;
import a.g.h.a;
import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* loaded from: classes.dex */
public class z extends TextView implements a.g.k.b {

    /* renamed from: b, reason: collision with root package name */
    public final e f349b;

    /* renamed from: c, reason: collision with root package name */
    public final y f350c;

    /* renamed from: d, reason: collision with root package name */
    public final x f351d;

    /* renamed from: e, reason: collision with root package name */
    public Future<a.g.h.a> f352e;

    public z(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(Context context, AttributeSet attributeSet, int i) throws Resources.NotFoundException {
        super(context, attributeSet, i);
        u0.a(context);
        s0.a(this, getContext());
        e eVar = new e(this);
        this.f349b = eVar;
        eVar.d(attributeSet, i);
        y yVar = new y(this);
        this.f350c = yVar;
        yVar.e(attributeSet, i);
        this.f350c.b();
        this.f351d = new x(this);
    }

    @Override // android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f349b;
        if (eVar != null) {
            eVar.a();
        }
        y yVar = this.f350c;
        if (yVar != null) {
            yVar.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (a.g.k.b.f748a) {
            return super.getAutoSizeMaxTextSize();
        }
        y yVar = this.f350c;
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
        y yVar = this.f350c;
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
        y yVar = this.f350c;
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
        y yVar = this.f350c;
        return yVar != null ? yVar.i.f : new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (a.g.k.b.f748a) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        y yVar = this.f350c;
        if (yVar != null) {
            return yVar.i.f193a;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f349b;
        if (eVar != null) {
            return eVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f349b;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        v0 v0Var = this.f350c.h;
        if (v0Var != null) {
            return v0Var.f313a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        v0 v0Var = this.f350c.h;
        if (v0Var != null) {
            return v0Var.f314b;
        }
        return null;
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        Future<a.g.h.a> future = this.f352e;
        if (future != null) {
            try {
                this.f352e = null;
                h.i.U(this, future.get());
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        x xVar;
        return (Build.VERSION.SDK_INT >= 28 || (xVar = this.f351d) == null) ? super.getTextClassifier() : xVar.a();
    }

    public a.C0014a getTextMetricsParamsCompat() {
        return h.i.B(this);
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        h.i.I(inputConnectionOnCreateInputConnection, editorInfo, this);
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        y yVar = this.f350c;
        if (yVar == null || a.g.k.b.f748a) {
            return;
        }
        yVar.i.a();
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        Future<a.g.h.a> future = this.f352e;
        if (future != null) {
            try {
                this.f352e = null;
                h.i.U(this, future.get());
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        super.onMeasure(i, i2);
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        y yVar = this.f350c;
        if (yVar == null || a.g.k.b.f748a || !yVar.d()) {
            return;
        }
        this.f350c.i.a();
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (a.g.k.b.f748a) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        y yVar = this.f350c;
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
        y yVar = this.f350c;
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
        y yVar = this.f350c;
        if (yVar != null) {
            yVar.i(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f349b;
        if (eVar != null) {
            eVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        e eVar = this.f349b;
        if (eVar != null) {
            eVar.f(i);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        y yVar = this.f350c;
        if (yVar != null) {
            yVar.b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        y yVar = this.f350c;
        if (yVar != null) {
            yVar.b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i != 0 ? a.b.l.a.a.b(context, i) : null, i2 != 0 ? a.b.l.a.a.b(context, i2) : null, i3 != 0 ? a.b.l.a.a.b(context, i3) : null, i4 != 0 ? a.b.l.a.a.b(context, i4) : null);
        y yVar = this.f350c;
        if (yVar != null) {
            yVar.b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i != 0 ? a.b.l.a.a.b(context, i) : null, i2 != 0 ? a.b.l.a.a.b(context, i2) : null, i3 != 0 ? a.b.l.a.a.b(context, i3) : null, i4 != 0 ? a.b.l.a.a.b(context, i4) : null);
        y yVar = this.f350c;
        if (yVar != null) {
            yVar.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(h.i.a0(this, callback));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setFirstBaselineToTopHeight(i);
        } else {
            h.i.R(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setLastBaselineToBottomHeight(i);
        } else {
            h.i.S(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i) {
        h.i.T(this, i);
    }

    public void setPrecomputedText(a.g.h.a aVar) {
        h.i.U(this, aVar);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f349b;
        if (eVar != null) {
            eVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f349b;
        if (eVar != null) {
            eVar.i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f350c.j(colorStateList);
        this.f350c.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f350c.k(mode);
        this.f350c.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        y yVar = this.f350c;
        if (yVar != null) {
            yVar.f(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        x xVar;
        if (Build.VERSION.SDK_INT >= 28 || (xVar = this.f351d) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            xVar.f334b = textClassifier;
        }
    }

    public void setTextFuture(Future<a.g.h.a> future) {
        this.f352e = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(a.C0014a c0014a) {
        TextDirectionHeuristic textDirectionHeuristic = c0014a.f670b;
        int i = 1;
        if (textDirectionHeuristic != TextDirectionHeuristics.FIRSTSTRONG_RTL && textDirectionHeuristic != TextDirectionHeuristics.FIRSTSTRONG_LTR) {
            if (textDirectionHeuristic == TextDirectionHeuristics.ANYRTL_LTR) {
                i = 2;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.LTR) {
                i = 3;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.RTL) {
                i = 4;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.LOCALE) {
                i = 5;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_LTR) {
                i = 6;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_RTL) {
                i = 7;
            }
        }
        setTextDirection(i);
        getPaint().set(c0014a.f669a);
        setBreakStrategy(c0014a.f671c);
        setHyphenationFrequency(c0014a.f672d);
    }

    @Override // android.widget.TextView
    public void setTextSize(int i, float f) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        boolean z = a.g.k.b.f748a;
        if (z) {
            super.setTextSize(i, f);
            return;
        }
        y yVar = this.f350c;
        if (yVar == null || z || yVar.d()) {
            return;
        }
        yVar.i.f(i, f);
    }

    @Override // android.widget.TextView
    public void setTypeface(Typeface typeface, int i) {
        Typeface typefaceA = (typeface == null || i <= 0) ? null : a.g.e.c.a(getContext(), typeface, i);
        if (typefaceA != null) {
            typeface = typefaceA;
        }
        super.setTypeface(typeface, i);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        y yVar = this.f350c;
        if (yVar != null) {
            yVar.b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        y yVar = this.f350c;
        if (yVar != null) {
            yVar.b();
        }
    }
}
