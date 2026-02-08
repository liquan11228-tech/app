package d;

import java.net.InetSocketAddress;
import java.net.Proxy;

/* loaded from: classes.dex */
public final class j0 {

    /* renamed from: a, reason: collision with root package name */
    public final a f1386a;

    /* renamed from: b, reason: collision with root package name */
    public final Proxy f1387b;

    /* renamed from: c, reason: collision with root package name */
    public final InetSocketAddress f1388c;

    public j0(a aVar, Proxy proxy, InetSocketAddress inetSocketAddress) {
        c.j.b.d.d(aVar, "address");
        c.j.b.d.d(proxy, "proxy");
        c.j.b.d.d(inetSocketAddress, "socketAddress");
        this.f1386a = aVar;
        this.f1387b = proxy;
        this.f1388c = inetSocketAddress;
    }

    public final boolean a() {
        return this.f1386a.f != null && this.f1387b.type() == Proxy.Type.HTTP;
    }

    public boolean equals(Object obj) {
        if (obj instanceof j0) {
            j0 j0Var = (j0) obj;
            if (c.j.b.d.a(j0Var.f1386a, this.f1386a) && c.j.b.d.a(j0Var.f1387b, this.f1387b) && c.j.b.d.a(j0Var.f1388c, this.f1388c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.f1388c.hashCode() + ((this.f1387b.hashCode() + ((this.f1386a.hashCode() + 527) * 31)) * 31);
    }

    public String toString() {
        StringBuilder sbE = b.a.a.a.a.e("Route{");
        sbE.append(this.f1388c);
        sbE.append('}');
        return sbE.toString();
    }
}
