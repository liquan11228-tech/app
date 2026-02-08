package a.g.j;

import a.g.j.k;
import android.view.View;

/* loaded from: classes.dex */
public class l extends k.b<Boolean> {
    public l(int i, Class cls, int i2) {
        super(i, cls, i2);
    }

    @Override // a.g.j.k.b
    public Boolean a(View view) {
        return Boolean.valueOf(view.isScreenReaderFocusable());
    }
}
