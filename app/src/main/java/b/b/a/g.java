package b.b.a;

import android.content.Context;
import android.content.SharedPreferences;

/* loaded from: classes.dex */
public class g {

    /* renamed from: c */
    public static g f1082c;

    /* renamed from: a */
    public SharedPreferences f1083a;

    /* renamed from: b */
    public SharedPreferences.Editor f1084b;

    public g(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("my_prefs", 0);
        this.f1083a = sharedPreferences;
        this.f1084b = sharedPreferences.edit();
    }

    public static synchronized g a(Context context) {
        if (f1082c == null) {
            f1082c = new g(context.getApplicationContext());
        }
        return f1082c;
    }
}
