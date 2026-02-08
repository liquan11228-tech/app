package b.d.a.c0;

import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class v extends y {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Method f1159a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1160b;

    public v(Method method, int i) {
        this.f1159a = method;
        this.f1160b = i;
    }

    @Override // b.d.a.c0.y
    public <T> T b(Class<T> cls) {
        y.a(cls);
        return (T) this.f1159a.invoke(null, cls, Integer.valueOf(this.f1160b));
    }
}
