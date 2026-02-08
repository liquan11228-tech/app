package c.j.b;

/* loaded from: classes.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    public static final j f1285a;

    static {
        j jVar = null;
        try {
            jVar = (j) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (jVar == null) {
            jVar = new j();
        }
        f1285a = jVar;
    }
}
