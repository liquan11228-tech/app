package d.n0.h;

import d.b0;
import d.i0;

/* loaded from: classes.dex */
public final class h extends i0 {

    /* renamed from: c, reason: collision with root package name */
    public final String f1506c;

    /* renamed from: d, reason: collision with root package name */
    public final long f1507d;

    /* renamed from: e, reason: collision with root package name */
    public final e.g f1508e;

    public h(String str, long j, e.g gVar) {
        c.j.b.d.d(gVar, "source");
        this.f1506c = str;
        this.f1507d = j;
        this.f1508e = gVar;
    }

    @Override // d.i0
    public b0 A() {
        String str = this.f1506c;
        if (str == null) {
            return null;
        }
        b0 b0Var = b0.f1328e;
        c.j.b.d.d(str, "$this$toMediaTypeOrNull");
        try {
            return b0.a(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    @Override // d.i0
    public e.g B() {
        return this.f1508e;
    }

    @Override // d.i0
    public long z() {
        return this.f1507d;
    }
}
