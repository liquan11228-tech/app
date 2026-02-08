package a.b.p;

import a.b.k.h;
import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;

/* loaded from: classes.dex */
public class h extends CheckedTextView {

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f227c = {R.attr.checkMark};

    /* renamed from: b, reason: collision with root package name */
    public final y f228b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        super(context, attributeSet, R.attr.checkedTextViewStyle);
        u0.a(context);
        s0.a(this, getContext());
        y yVar = new y(this);
        this.f228b = yVar;
        yVar.e(attributeSet, R.attr.checkedTextViewStyle);
        this.f228b.b();
        x0 x0VarO = x0.o(getContext(), attributeSet, f227c, R.attr.checkedTextViewStyle, 0);
        setCheckMarkDrawable(x0VarO.e(0));
        x0VarO.f336b.recycle();
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        y yVar = this.f228b;
        if (yVar != null) {
            yVar.b();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        h.i.I(inputConnectionOnCreateInputConnection, editorInfo, this);
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(a.b.l.a.a.b(getContext(), i));
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(h.i.a0(this, callback));
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        y yVar = this.f228b;
        if (yVar != null) {
            yVar.f(context, i);
        }
    }
}
