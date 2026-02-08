package b.d.a.c0;

import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class w extends y {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Method f1161a;

    public w(Method method) {
        this.f1161a = method;
    }

    @Override // b.d.a.c0.y
    public <T> T b(Class<T> cls) {
        y.a(cls);
        return (T) this.f1161a.invoke(null, cls, Object.class);
    }
}
