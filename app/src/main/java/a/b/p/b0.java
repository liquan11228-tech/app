package a.b.p;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.widget.ToggleButton;

/* loaded from: classes.dex */
public class b0 extends ToggleButton {

    /* renamed from: b, reason: collision with root package name */
    public final y f199b;

    public b0(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        super(context, attributeSet, R.attr.buttonStyleToggle);
        s0.a(this, getContext());
        y yVar = new y(this);
        this.f199b = yVar;
        yVar.e(attributeSet, R.attr.buttonStyleToggle);
    }
}
