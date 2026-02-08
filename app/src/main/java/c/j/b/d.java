package c.j.b;

import java.util.Arrays;

/* loaded from: classes.dex */
public class d {
    public static boolean a(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public static void b(Object obj) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException();
        f(nullPointerException);
        throw nullPointerException;
    }

    public static void c(Object obj, String str) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(b.a.a.a.a.b(str, " must not be null"));
        f(nullPointerException);
        throw nullPointerException;
    }

    public static void d(Object obj, String str) {
        if (obj != null) {
            return;
        }
        StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[4];
        NullPointerException nullPointerException = new NullPointerException("Parameter specified as non-null is null: method " + stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName() + ", parameter " + str);
        f(nullPointerException);
        throw nullPointerException;
    }

    public static int e(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i == i2 ? 0 : 1;
    }

    public static <T extends Throwable> T f(T t) {
        g(t, d.class.getName());
        return t;
    }

    public static <T extends Throwable> T g(T t, String str) {
        StackTraceElement[] stackTrace = t.getStackTrace();
        int length = stackTrace.length;
        int i = -1;
        for (int i2 = 0; i2 < length; i2++) {
            if (str.equals(stackTrace[i2].getClassName())) {
                i = i2;
            }
        }
        t.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i + 1, length));
        return t;
    }

    public static void h(String str) {
        c.e eVar = new c.e(b.a.a.a.a.c("lateinit property ", str, " has not been initialized"));
        f(eVar);
        throw eVar;
    }
}
