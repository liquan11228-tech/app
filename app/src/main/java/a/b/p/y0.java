package a.b.p;

import android.R;
import android.view.View;
import android.view.Window;

/* loaded from: classes.dex */
public class y0 implements View.OnClickListener {

    /* renamed from: b */
    public final a.b.o.i.a f347b;

    /* renamed from: c */
    public final /* synthetic */ z0 f348c;

    public y0(z0 z0Var) {
        this.f348c = z0Var;
        this.f347b = new a.b.o.i.a(this.f348c.f353a.getContext(), 0, R.id.home, 0, this.f348c.i);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        z0 z0Var = this.f348c;
        Window.Callback callback = z0Var.l;
        if (callback == null || !z0Var.m) {
            return;
        }
        callback.onMenuItemSelected(0, this.f347b);
    }
}
