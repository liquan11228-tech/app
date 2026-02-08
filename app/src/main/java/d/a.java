package d;

import a.b.k.h;
import d.z;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.UnknownHostException;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a */
    public final z f1321a;

    /* renamed from: b */
    public final List<d0> f1322b;

    /* renamed from: c */
    public final List<n> f1323c;

    /* renamed from: d */
    public final t f1324d;

    /* renamed from: e */
    public final SocketFactory f1325e;
    public final SSLSocketFactory f;
    public final HostnameVerifier g;
    public final h h;
    public final c i;
    public final Proxy j;
    public final ProxySelector k;

    public a(String str, int i, t tVar, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, h hVar, c cVar, Proxy proxy, List<? extends d0> list, List<n> list2, ProxySelector proxySelector) throws UnknownHostException {
        c.j.b.d.d(str, "uriHost");
        c.j.b.d.d(tVar, "dns");
        c.j.b.d.d(socketFactory, "socketFactory");
        c.j.b.d.d(cVar, "proxyAuthenticator");
        c.j.b.d.d(list, "protocols");
        c.j.b.d.d(list2, "connectionSpecs");
        c.j.b.d.d(proxySelector, "proxySelector");
        this.f1324d = tVar;
        this.f1325e = socketFactory;
        this.f = sSLSocketFactory;
        this.g = hostnameVerifier;
        this.h = hVar;
        this.i = cVar;
        this.j = proxy;
        this.k = proxySelector;
        z.a aVar = new z.a();
        String str2 = "https";
        String str3 = this.f != null ? "https" : "http";
        c.j.b.d.d(str3, "scheme");
        if (c.m.e.e(str3, "http", true)) {
            str2 = "http";
        } else if (!c.m.e.e(str3, "https", true)) {
            throw new IllegalArgumentException(b.a.a.a.a.b("unexpected scheme: ", str3));
        }
        aVar.f1743a = str2;
        c.j.b.d.d(str, "host");
        String strZ = h.i.Z(z.b.c(z.k, str, 0, 0, false, 7));
        if (strZ == null) {
            throw new IllegalArgumentException(b.a.a.a.a.b("unexpected host: ", str));
        }
        aVar.f1746d = strZ;
        if (!(1 <= i && 65535 >= i)) {
            throw new IllegalArgumentException(b.a.a.a.a.a("unexpected port: ", i).toString());
        }
        aVar.f1747e = i;
        this.f1321a = aVar.a();
        this.f1322b = d.n0.c.D(list);
        this.f1323c = d.n0.c.D(list2);
    }

    public final boolean a(a aVar) {
        c.j.b.d.d(aVar, "that");
        return c.j.b.d.a(this.f1324d, aVar.f1324d) && c.j.b.d.a(this.i, aVar.i) && c.j.b.d.a(this.f1322b, aVar.f1322b) && c.j.b.d.a(this.f1323c, aVar.f1323c) && c.j.b.d.a(this.k, aVar.k) && c.j.b.d.a(this.j, aVar.j) && c.j.b.d.a(this.f, aVar.f) && c.j.b.d.a(this.g, aVar.g) && c.j.b.d.a(this.h, aVar.h) && this.f1321a.f == aVar.f1321a.f;
    }

    public boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (c.j.b.d.a(this.f1321a, aVar.f1321a) && a(aVar)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Objects.hashCode(this.h) + ((Objects.hashCode(this.g) + ((Objects.hashCode(this.f) + ((Objects.hashCode(this.j) + ((this.k.hashCode() + ((this.f1323c.hashCode() + ((this.f1322b.hashCode() + ((this.i.hashCode() + ((this.f1324d.hashCode() + ((this.f1321a.hashCode() + 527) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public String toString() {
        StringBuilder sbE;
        Object obj;
        StringBuilder sbE2 = b.a.a.a.a.e("Address{");
        sbE2.append(this.f1321a.f1742e);
        sbE2.append(':');
        sbE2.append(this.f1321a.f);
        sbE2.append(", ");
        if (this.j != null) {
            sbE = b.a.a.a.a.e("proxy=");
            obj = this.j;
        } else {
            sbE = b.a.a.a.a.e("proxySelector=");
            obj = this.k;
        }
        sbE.append(obj);
        sbE2.append(sbE.toString());
        sbE2.append("}");
        return sbE2.toString();
    }
}
