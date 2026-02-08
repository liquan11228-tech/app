package a.b.p;

import android.content.Context;
import android.content.ContextWrapper;

/* loaded from: classes.dex */
public class u0 extends ContextWrapper {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f312a = new Object();

    public static Context a(Context context) {
        if (!(context instanceof u0) && !(context.getResources() instanceof w0) && !(context.getResources() instanceof a1)) {
            a1.a();
        }
        return context;
    }
}
