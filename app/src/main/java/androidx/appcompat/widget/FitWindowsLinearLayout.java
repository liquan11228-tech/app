package androidx.appcompat.widget;

import a.b.k.j;
import a.b.p.g0;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.LinearLayout;

/* loaded from: classes.dex */
public class FitWindowsLinearLayout extends LinearLayout {

    /* renamed from: b, reason: collision with root package name */
    public g0 f967b;

    public FitWindowsLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    public boolean fitSystemWindows(Rect rect) {
        g0 g0Var = this.f967b;
        if (g0Var != null) {
            rect.top = ((j) g0Var).f35a.N(null, rect);
        }
        return super.fitSystemWindows(rect);
    }

    public void setOnFitSystemWindowsListener(g0 g0Var) {
        this.f967b = g0Var;
    }
}
