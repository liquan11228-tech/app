package a.b.p;

import android.graphics.Rect;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class b1 {

    /* renamed from: a, reason: collision with root package name */
    public static Method f200a;

    static {
        try {
            Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
            f200a = declaredMethod;
            if (declaredMethod.isAccessible()) {
                return;
            }
            f200a.setAccessible(true);
        } catch (NoSuchMethodException unused) {
        }
    }

    public static boolean a(View view) {
        return a.g.j.k.f(view) == 1;
    }

    public static void b(View view) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        try {
            Method method = view.getClass().getMethod("makeOptionalFitsSystemWindows", new Class[0]);
            if (!method.isAccessible()) {
                method.setAccessible(true);
            }
            method.invoke(view, new Object[0]);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
        }
    }
}
