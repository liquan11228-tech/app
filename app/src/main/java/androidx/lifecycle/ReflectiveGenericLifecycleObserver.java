package androidx.lifecycle;

import a.k.a;
import a.k.d;
import a.k.e;
import a.k.g;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public class ReflectiveGenericLifecycleObserver implements e {

    /* renamed from: a, reason: collision with root package name */
    public final Object f1066a;

    /* renamed from: b, reason: collision with root package name */
    public final a.C0019a f1067b;

    public ReflectiveGenericLifecycleObserver(Object obj) {
        this.f1066a = obj;
        this.f1067b = a.f864c.b(obj.getClass());
    }

    @Override // a.k.e
    public void g(g gVar, d.a aVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        a.C0019a c0019a = this.f1067b;
        Object obj = this.f1066a;
        a.C0019a.a(c0019a.f867a.get(aVar), gVar, aVar, obj);
        a.C0019a.a(c0019a.f867a.get(d.a.ON_ANY), gVar, aVar, obj);
    }
}
