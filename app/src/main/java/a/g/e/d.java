package a.g.e;

import a.b.k.h;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class d extends h {

    /* renamed from: b */
    public static Class<?> f623b;

    /* renamed from: c */
    public static Constructor<?> f624c;

    /* renamed from: d */
    public static Method f625d;

    /* renamed from: e */
    public static Method f626e;
    public static boolean f;

    public static boolean f(Object obj, String str, int i, boolean z) throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        g();
        try {
            return ((Boolean) f625d.invoke(obj, str, Integer.valueOf(i), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static void g() throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        Method method;
        Class<?> cls;
        Method method2;
        if (f) {
            return;
        }
        f = true;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(new Class[0]);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e2) {
            e2.getClass().getName();
            method = null;
            cls = null;
            method2 = null;
        }
        f624c = constructor;
        f623b = cls;
        f625d = method2;
        f626e = method;
    }

    @Override // a.g.e.h
    public Typeface a(Context context, a.g.d.b.b bVar, Resources resources, int i) throws IllegalAccessException, NoSuchMethodException, InstantiationException, ClassNotFoundException, SecurityException, IOException, ArrayIndexOutOfBoundsException, IllegalArgumentException, InvocationTargetException, NegativeArraySizeException {
        g();
        try {
            Object objNewInstance = f624c.newInstance(new Object[0]);
            for (a.g.d.b.c cVar : bVar.f600a) {
                File fileA = h.i.A(context);
                if (fileA == null) {
                    return null;
                }
                try {
                    if (!h.i.s(fileA, resources, cVar.f)) {
                        return null;
                    }
                    if (!f(objNewInstance, fileA.getPath(), cVar.f602b, cVar.f603c)) {
                        return null;
                    }
                } catch (RuntimeException unused) {
                    return null;
                } finally {
                    fileA.delete();
                }
            }
            g();
            try {
                Object objNewInstance2 = Array.newInstance(f623b, 1);
                Array.set(objNewInstance2, 0, objNewInstance);
                return (Typeface) f626e.invoke(null, objNewInstance2);
            } catch (IllegalAccessException | InvocationTargetException e2) {
                throw new RuntimeException(e2);
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }
}
