package a.c.a.a;

/* loaded from: classes.dex */
public class a extends c {

    /* renamed from: c, reason: collision with root package name */
    public static volatile a f361c;

    /* renamed from: a, reason: collision with root package name */
    public c f362a;

    /* renamed from: b, reason: collision with root package name */
    public c f363b;

    public a() {
        b bVar = new b();
        this.f363b = bVar;
        this.f362a = bVar;
    }

    public static a b() {
        if (f361c != null) {
            return f361c;
        }
        synchronized (a.class) {
            if (f361c == null) {
                f361c = new a();
            }
        }
        return f361c;
    }

    @Override // a.c.a.a.c
    public boolean a() {
        return this.f362a.a();
    }
}
