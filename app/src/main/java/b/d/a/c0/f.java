package b.d.a.c0;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;

/* loaded from: classes.dex */
public class f<T> implements t<T> {

    /* renamed from: a */
    public final y f1120a;

    /* renamed from: b */
    public final /* synthetic */ Class f1121b;

    /* renamed from: c */
    public final /* synthetic */ Type f1122c;

    public f(g gVar, Class cls, Type type) throws NoSuchFieldException, NoSuchMethodException, ClassNotFoundException, SecurityException {
        y xVar;
        this.f1121b = cls;
        this.f1122c = type;
        try {
            Class<?> cls2 = Class.forName("sun.misc.Unsafe");
            Field declaredField = cls2.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            xVar = new u(cls2.getMethod("allocateInstance", Class.class), declaredField.get(null));
        } catch (Exception unused) {
            try {
                try {
                    Method declaredMethod = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", Class.class);
                    declaredMethod.setAccessible(true);
                    int iIntValue = ((Integer) declaredMethod.invoke(null, Object.class)).intValue();
                    Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("newInstance", Class.class, Integer.TYPE);
                    declaredMethod2.setAccessible(true);
                    xVar = new v(declaredMethod2, iIntValue);
                } catch (Exception unused2) {
                    xVar = new x();
                }
            } catch (Exception unused3) {
                Method declaredMethod3 = ObjectInputStream.class.getDeclaredMethod("newInstance", Class.class, Class.class);
                declaredMethod3.setAccessible(true);
                xVar = new w(declaredMethod3);
            }
        }
        this.f1120a = xVar;
    }

    @Override // b.d.a.c0.t
    public T a() {
        try {
            return (T) this.f1120a.b(this.f1121b);
        } catch (Exception e2) {
            StringBuilder sbE = b.a.a.a.a.e("Unable to invoke no-args constructor for ");
            sbE.append(this.f1122c);
            sbE.append(". Registering an InstanceCreator with Gson for this type may fix this problem.");
            throw new RuntimeException(sbE.toString(), e2);
        }
    }
}
