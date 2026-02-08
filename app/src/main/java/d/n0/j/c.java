package d.n0.j;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: d, reason: collision with root package name */
    public static final e.h f1536d = e.h.f.b(":");

    /* renamed from: e, reason: collision with root package name */
    public static final e.h f1537e = e.h.f.b(":status");
    public static final e.h f = e.h.f.b(":method");
    public static final e.h g = e.h.f.b(":path");
    public static final e.h h = e.h.f.b(":scheme");
    public static final e.h i = e.h.f.b(":authority");

    /* renamed from: a, reason: collision with root package name */
    public final int f1538a;

    /* renamed from: b, reason: collision with root package name */
    public final e.h f1539b;

    /* renamed from: c, reason: collision with root package name */
    public final e.h f1540c;

    public c(e.h hVar, e.h hVar2) {
        c.j.b.d.d(hVar, "name");
        c.j.b.d.d(hVar2, "value");
        this.f1539b = hVar;
        this.f1540c = hVar2;
        this.f1538a = hVar.c() + 32 + this.f1540c.c();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(e.h hVar, String str) {
        this(hVar, e.h.f.b(str));
        c.j.b.d.d(hVar, "name");
        c.j.b.d.d(str, "value");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(String str, String str2) {
        this(e.h.f.b(str), e.h.f.b(str2));
        c.j.b.d.d(str, "name");
        c.j.b.d.d(str2, "value");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return c.j.b.d.a(this.f1539b, cVar.f1539b) && c.j.b.d.a(this.f1540c, cVar.f1540c);
    }

    public int hashCode() {
        e.h hVar = this.f1539b;
        int iHashCode = (hVar != null ? hVar.hashCode() : 0) * 31;
        e.h hVar2 = this.f1540c;
        return iHashCode + (hVar2 != null ? hVar2.hashCode() : 0);
    }

    public String toString() {
        return this.f1539b.j() + ": " + this.f1540c.j();
    }
}
