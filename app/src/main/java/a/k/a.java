package a.k;

import a.k.d;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class a {

    /* renamed from: c, reason: collision with root package name */
    public static a f864c = new a();

    /* renamed from: a, reason: collision with root package name */
    public final Map<Class, C0019a> f865a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final Map<Class, Boolean> f866b = new HashMap();

    /* renamed from: a.k.a$a, reason: collision with other inner class name */
    public static class C0019a {

        /* renamed from: a, reason: collision with root package name */
        public final Map<d.a, List<b>> f867a = new HashMap();

        /* renamed from: b, reason: collision with root package name */
        public final Map<b, d.a> f868b;

        public C0019a(Map<b, d.a> map) {
            this.f868b = map;
            for (Map.Entry<b, d.a> entry : map.entrySet()) {
                d.a value = entry.getValue();
                List<b> arrayList = this.f867a.get(value);
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                    this.f867a.put(value, arrayList);
                }
                arrayList.add(entry.getKey());
            }
        }

        public static void a(List<b> list, g gVar, d.a aVar, Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    b bVar = list.get(size);
                    if (bVar == null) {
                        throw null;
                    }
                    try {
                        int i = bVar.f869a;
                        if (i == 0) {
                            bVar.f870b.invoke(obj, new Object[0]);
                        } else if (i == 1) {
                            bVar.f870b.invoke(obj, gVar);
                        } else if (i == 2) {
                            bVar.f870b.invoke(obj, gVar, aVar);
                        }
                    } catch (IllegalAccessException e2) {
                        throw new RuntimeException(e2);
                    } catch (InvocationTargetException e3) {
                        throw new RuntimeException("Failed to call observer method", e3.getCause());
                    }
                }
            }
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f869a;

        /* renamed from: b, reason: collision with root package name */
        public final Method f870b;

        public b(int i, Method method) {
            this.f869a = i;
            this.f870b = method;
            method.setAccessible(true);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            return this.f869a == bVar.f869a && this.f870b.getName().equals(bVar.f870b.getName());
        }

        public int hashCode() {
            return this.f870b.getName().hashCode() + (this.f869a * 31);
        }
    }

    public final C0019a a(Class cls, Method[] methodArr) throws SecurityException {
        int i;
        C0019a c0019aB;
        Class superclass = cls.getSuperclass();
        HashMap map = new HashMap();
        if (superclass != null && (c0019aB = b(superclass)) != null) {
            map.putAll(c0019aB.f868b);
        }
        for (Class cls2 : cls.getInterfaces()) {
            for (Map.Entry<b, d.a> entry : b(cls2).f868b.entrySet()) {
                c(map, entry.getKey(), entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e2) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e2);
            }
        }
        boolean z = false;
        for (Method method : methodArr) {
            n nVar = (n) method.getAnnotation(n.class);
            if (nVar != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else {
                    if (!parameterTypes[0].isAssignableFrom(g.class)) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    i = 1;
                }
                d.a aVarValue = nVar.value();
                if (parameterTypes.length > 1) {
                    if (!parameterTypes[1].isAssignableFrom(d.a.class)) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (aVarValue != d.a.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                c(map, new b(i, method), aVarValue, cls);
                z = true;
            }
        }
        C0019a c0019a = new C0019a(map);
        this.f865a.put(cls, c0019a);
        this.f866b.put(cls, Boolean.valueOf(z));
        return c0019a;
    }

    public C0019a b(Class cls) {
        C0019a c0019a = this.f865a.get(cls);
        return c0019a != null ? c0019a : a(cls, null);
    }

    public final void c(Map<b, d.a> map, b bVar, d.a aVar, Class cls) {
        d.a aVar2 = map.get(bVar);
        if (aVar2 == null || aVar == aVar2) {
            if (aVar2 == null) {
                map.put(bVar, aVar);
                return;
            }
            return;
        }
        Method method = bVar.f870b;
        StringBuilder sbE = b.a.a.a.a.e("Method ");
        sbE.append(method.getName());
        sbE.append(" in ");
        sbE.append(cls.getName());
        sbE.append(" already declared with different @OnLifecycleEvent value: previous value ");
        sbE.append(aVar2);
        sbE.append(", new value ");
        sbE.append(aVar);
        throw new IllegalArgumentException(sbE.toString());
    }
}
