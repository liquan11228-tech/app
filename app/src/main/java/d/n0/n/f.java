package d.n0.n;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f1697a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f1698b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f1699c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f1700d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f1701e;
    public final boolean f;

    public f() {
        this.f1697a = false;
        this.f1698b = null;
        this.f1699c = false;
        this.f1700d = null;
        this.f1701e = false;
        this.f = false;
    }

    public f(boolean z, Integer num, boolean z2, Integer num2, boolean z3, boolean z4) {
        this.f1697a = z;
        this.f1698b = num;
        this.f1699c = z2;
        this.f1700d = num2;
        this.f1701e = z3;
        this.f = z4;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f1697a == fVar.f1697a && c.j.b.d.a(this.f1698b, fVar.f1698b) && this.f1699c == fVar.f1699c && c.j.b.d.a(this.f1700d, fVar.f1700d) && this.f1701e == fVar.f1701e && this.f == fVar.f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r2v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v6, types: [boolean] */
    public int hashCode() {
        boolean z = this.f1697a;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        Integer num = this.f1698b;
        int iHashCode = (i + (num != null ? num.hashCode() : 0)) * 31;
        ?? r2 = this.f1699c;
        int i2 = r2;
        if (r2 != 0) {
            i2 = 1;
        }
        int i3 = (iHashCode + i2) * 31;
        Integer num2 = this.f1700d;
        int iHashCode2 = (i3 + (num2 != null ? num2.hashCode() : 0)) * 31;
        ?? r22 = this.f1701e;
        int i4 = r22;
        if (r22 != 0) {
            i4 = 1;
        }
        int i5 = (iHashCode2 + i4) * 31;
        boolean z2 = this.f;
        return i5 + (z2 ? 1 : z2 ? 1 : 0);
    }

    public String toString() {
        StringBuilder sbE = b.a.a.a.a.e("WebSocketExtensions(perMessageDeflate=");
        sbE.append(this.f1697a);
        sbE.append(", clientMaxWindowBits=");
        sbE.append(this.f1698b);
        sbE.append(", clientNoContextTakeover=");
        sbE.append(this.f1699c);
        sbE.append(", serverMaxWindowBits=");
        sbE.append(this.f1700d);
        sbE.append(", serverNoContextTakeover=");
        sbE.append(this.f1701e);
        sbE.append(", unknownValues=");
        sbE.append(this.f);
        sbE.append(")");
        return sbE.toString();
    }
}
