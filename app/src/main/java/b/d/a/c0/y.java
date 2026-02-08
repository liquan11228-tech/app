package b.d.a.c0;

import java.lang.reflect.Modifier;

/* loaded from: classes.dex */
public abstract class y {
    public static void a(Class<?> cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            StringBuilder sbE = b.a.a.a.a.e("Interface can't be instantiated! Interface name: ");
            sbE.append(cls.getName());
            throw new UnsupportedOperationException(sbE.toString());
        }
        if (Modifier.isAbstract(modifiers)) {
            StringBuilder sbE2 = b.a.a.a.a.e("Abstract class can't be instantiated! Class name: ");
            sbE2.append(cls.getName());
            throw new UnsupportedOperationException(sbE2.toString());
        }
    }

    public abstract <T> T b(Class<T> cls);
}
