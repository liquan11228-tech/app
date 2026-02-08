package a.k;

import androidx.lifecycle.CompositeGeneratedAdaptersObserver;
import androidx.lifecycle.FullLifecycleObserverAdapter;
import androidx.lifecycle.ReflectiveGenericLifecycleObserver;
import androidx.lifecycle.SingleGeneratedAdapterObserver;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class j {

    /* renamed from: a */
    public static Map<Class, Integer> f882a = new HashMap();

    /* renamed from: b */
    public static Map<Class, List<Constructor<? extends c>>> f883b = new HashMap();

    public static c a(Constructor<? extends c> constructor, Object obj) {
        try {
            return constructor.newInstance(obj);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException(e2);
        } catch (InstantiationException e3) {
            throw new RuntimeException(e3);
        } catch (InvocationTargetException e4) {
            throw new RuntimeException(e4);
        }
    }

    public static String b(String str) {
        return str.replace(".", "_") + "_LifecycleAdapter";
    }

    /* JADX WARN: Removed duplicated region for block: B:151:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0117 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int c(java.lang.Class<?> r11) throws java.lang.NoSuchMethodException, java.lang.SecurityException {
        /*
            Method dump skipped, instructions count: 306
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a.k.j.c(java.lang.Class):int");
    }

    public static e d(Object obj) {
        boolean z = obj instanceof e;
        boolean z2 = obj instanceof b;
        if (z && z2) {
            return new FullLifecycleObserverAdapter((b) obj, (e) obj);
        }
        if (z2) {
            return new FullLifecycleObserverAdapter((b) obj, null);
        }
        if (z) {
            return (e) obj;
        }
        Class<?> cls = obj.getClass();
        if (c(cls) != 2) {
            return new ReflectiveGenericLifecycleObserver(obj);
        }
        List<Constructor<? extends c>> list = f883b.get(cls);
        if (list.size() == 1) {
            return new SingleGeneratedAdapterObserver(a(list.get(0), obj));
        }
        c[] cVarArr = new c[list.size()];
        for (int i = 0; i < list.size(); i++) {
            cVarArr[i] = a(list.get(i), obj);
        }
        return new CompositeGeneratedAdaptersObserver(cVarArr);
    }
}
