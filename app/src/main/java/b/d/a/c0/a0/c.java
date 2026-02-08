package b.d.a.c0.a0;

import b.d.a.p;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public final class c extends b {

    /* renamed from: d */
    public static Class f1117d;

    /* renamed from: b */
    public final Object f1118b;

    /* renamed from: c */
    public final Field f1119c;

    public c() throws IllegalAccessException, NoSuchFieldException, ClassNotFoundException, IllegalArgumentException {
        Object obj;
        Field declaredField = null;
        try {
            Class<?> cls = Class.forName("sun.misc.Unsafe");
            f1117d = cls;
            Field declaredField2 = cls.getDeclaredField("theUnsafe");
            declaredField2.setAccessible(true);
            obj = declaredField2.get(null);
        } catch (Exception unused) {
            obj = null;
        }
        this.f1118b = obj;
        try {
            declaredField = AccessibleObject.class.getDeclaredField("override");
        } catch (NoSuchFieldException unused2) {
        }
        this.f1119c = declaredField;
    }

    @Override // b.d.a.c0.a0.b
    public void a(AccessibleObject accessibleObject) throws IllegalAccessException, SecurityException, IllegalArgumentException, InvocationTargetException {
        boolean z = false;
        if (this.f1118b != null && this.f1119c != null) {
            try {
                f1117d.getMethod("putBoolean", Object.class, Long.TYPE, Boolean.TYPE).invoke(this.f1118b, accessibleObject, Long.valueOf(((Long) f1117d.getMethod("objectFieldOffset", Field.class).invoke(this.f1118b, this.f1119c)).longValue()), Boolean.TRUE);
                z = true;
            } catch (Exception unused) {
            }
        }
        if (z) {
            return;
        }
        try {
            accessibleObject.setAccessible(true);
        } catch (SecurityException e2) {
            throw new p("Gson couldn't modify fields for " + accessibleObject + "\nand sun.misc.Unsafe not found.\nEither write a custom type adapter, or make fields accessible, or include sun.misc.Unsafe.", e2);
        }
    }
}
