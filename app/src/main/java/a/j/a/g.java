package a.j.a;

import androidx.fragment.app.Fragment;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    public static final a.e.h<String, Class<?>> f778a = new a.e.h<>();

    public static boolean b(ClassLoader classLoader, String str) {
        try {
            return Fragment.class.isAssignableFrom(c(classLoader, str));
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public static Class<?> c(ClassLoader classLoader, String str) throws ClassNotFoundException {
        Class<?> orDefault = f778a.getOrDefault(str, null);
        if (orDefault != null) {
            return orDefault;
        }
        Class<?> cls = Class.forName(str, false, classLoader);
        f778a.put(str, cls);
        return cls;
    }

    public static Class<? extends Fragment> d(ClassLoader classLoader, String str) {
        try {
            return c(classLoader, str);
        } catch (ClassCastException e2) {
            throw new Fragment.c(b.a.a.a.a.c("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"), e2);
        } catch (ClassNotFoundException e3) {
            throw new Fragment.c(b.a.a.a.a.c("Unable to instantiate fragment ", str, ": make sure class name exists"), e3);
        }
    }

    public Fragment a(ClassLoader classLoader, String str) {
        try {
            return d(classLoader, str).getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (IllegalAccessException e2) {
            throw new Fragment.c(b.a.a.a.a.c("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e2);
        } catch (InstantiationException e3) {
            throw new Fragment.c(b.a.a.a.a.c("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e3);
        } catch (NoSuchMethodException e4) {
            throw new Fragment.c(b.a.a.a.a.c("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e4);
        } catch (InvocationTargetException e5) {
            throw new Fragment.c(b.a.a.a.a.c("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e5);
        }
    }
}
