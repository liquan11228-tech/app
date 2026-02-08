package b.d.a.c0;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public class h<T> implements t<T> {

    /* renamed from: a */
    public final /* synthetic */ Constructor f1129a;

    public h(g gVar, Constructor constructor) {
        this.f1129a = constructor;
    }

    @Override // b.d.a.c0.t
    public T a() {
        try {
            return (T) this.f1129a.newInstance(null);
        } catch (IllegalAccessException e2) {
            throw new AssertionError(e2);
        } catch (InstantiationException e3) {
            StringBuilder sbE = b.a.a.a.a.e("Failed to invoke ");
            sbE.append(this.f1129a);
            sbE.append(" with no args");
            throw new RuntimeException(sbE.toString(), e3);
        } catch (InvocationTargetException e4) {
            StringBuilder sbE2 = b.a.a.a.a.e("Failed to invoke ");
            sbE2.append(this.f1129a);
            sbE2.append(" with no args");
            throw new RuntimeException(sbE2.toString(), e4.getTargetException());
        }
    }
}
