package d.n0.f;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public c f1422a;

    /* renamed from: b, reason: collision with root package name */
    public long f1423b;

    /* renamed from: c, reason: collision with root package name */
    public final String f1424c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f1425d;

    public a(String str, boolean z) {
        c.j.b.d.d(str, "name");
        this.f1424c = str;
        this.f1425d = z;
        this.f1423b = -1L;
    }

    public /* synthetic */ a(String str, boolean z, int i) {
        this(str, (i & 2) != 0 ? true : z);
    }

    public abstract long a();

    public String toString() {
        return this.f1424c;
    }
}
