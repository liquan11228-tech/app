package b.b.a;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import u3_8w.n5shm.t6lh5.R;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a */
    public PopupWindow f1072a;

    public c(Context context) {
        PopupWindow popupWindow = new PopupWindow(LayoutInflater.from(context).inflate(R.layout.loading_popup, (ViewGroup) null), -2, -2, true);
        this.f1072a = popupWindow;
        popupWindow.setOutsideTouchable(false);
    }
}
