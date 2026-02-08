package a.g.c;

import android.app.Activity;
import android.os.Build;

/* loaded from: classes.dex */
public class a extends a.g.d.a {

    /* renamed from: a.g.c.a$a, reason: collision with other inner class name */
    public interface InterfaceC0010a {
    }

    public static void d(Activity activity) {
        activity.finishAffinity();
    }

    public static InterfaceC0010a e() {
        return null;
    }

    public static void f(Activity activity) {
        if (Build.VERSION.SDK_INT < 28 && b.b(activity)) {
            return;
        }
        activity.recreate();
    }
}
