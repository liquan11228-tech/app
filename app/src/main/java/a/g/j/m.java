package a.g.j;

import a.g.j.k;
import android.view.View;

/* loaded from: classes.dex */
public class m extends k.b<CharSequence> {
    public m(int i, Class cls, int i2, int i3) {
        super(i, cls, i2, i3);
    }

    @Override // a.g.j.k.b
    public CharSequence a(View view) {
        return view.getAccessibilityPaneTitle();
    }
}
