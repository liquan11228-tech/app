package b.d.a.c0;

import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class u extends y {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Method f1157a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1158b;

    public u(Method method, Object obj) {
        this.f1157a = method;
        this.f1158b = obj;
    }

    @Override // b.d.a.c0.y
    public <T> T b(Class<T> cls) {
        y.a(cls);
        return (T) this.f1157a.invoke(this.f1158b, cls);
    }
}
