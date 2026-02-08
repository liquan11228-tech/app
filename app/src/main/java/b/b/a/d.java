package b.b.a;

import android.widget.Toast;
import u3_8w.n5shm.t6lh5.LoginActivity;

/* loaded from: classes.dex */
public class d implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ String f1073b;

    /* renamed from: c */
    public final /* synthetic */ LoginActivity f1074c;

    public d(LoginActivity loginActivity, String str) {
        this.f1074c = loginActivity;
        this.f1073b = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        Toast.makeText(this.f1074c.getApplicationContext(), this.f1073b, 0).show();
    }
}
