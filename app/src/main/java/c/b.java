package c;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class b<A, B> implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    public final A f1254b;

    /* renamed from: c, reason: collision with root package name */
    public final B f1255c;

    public b(A a2, B b2) {
        this.f1254b = a2;
        this.f1255c = b2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return c.j.b.d.a(this.f1254b, bVar.f1254b) && c.j.b.d.a(this.f1255c, bVar.f1255c);
    }

    public int hashCode() {
        A a2 = this.f1254b;
        int iHashCode = (a2 != null ? a2.hashCode() : 0) * 31;
        B b2 = this.f1255c;
        return iHashCode + (b2 != null ? b2.hashCode() : 0);
    }

    public String toString() {
        return '(' + this.f1254b + ", " + this.f1255c + ')';
    }
}
