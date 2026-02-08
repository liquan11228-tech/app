package a.g.j;

import a.g.j.k;
import android.view.View;

/* loaded from: classes.dex */
public class n extends k.b<Boolean> {
    public n(int i, Class cls, int i2) {
        super(i, cls, i2);
    }

    @Override // a.g.j.k.b
    public Boolean a(View view) {
        return Boolean.valueOf(view.isAccessibilityHeading());
    }
}
