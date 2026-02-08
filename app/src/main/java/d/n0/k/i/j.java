package d.n0.k.i;

import d.d0;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* loaded from: classes.dex */
public final class j implements k {

    /* renamed from: a, reason: collision with root package name */
    public k f1664a;

    /* renamed from: b, reason: collision with root package name */
    public final a f1665b;

    public interface a {
        boolean a(SSLSocket sSLSocket);

        k b(SSLSocket sSLSocket);
    }

    public j(a aVar) {
        c.j.b.d.d(aVar, "socketAdapterFactory");
        this.f1665b = aVar;
    }

    @Override // d.n0.k.i.k
    public boolean a(SSLSocket sSLSocket) {
        c.j.b.d.d(sSLSocket, "sslSocket");
        return this.f1665b.a(sSLSocket);
    }

    @Override // d.n0.k.i.k
    public String b(SSLSocket sSLSocket) {
        c.j.b.d.d(sSLSocket, "sslSocket");
        k kVarE = e(sSLSocket);
        if (kVarE != null) {
            return kVarE.b(sSLSocket);
        }
        return null;
    }

    @Override // d.n0.k.i.k
    public boolean c() {
        return true;
    }

    @Override // d.n0.k.i.k
    public void d(SSLSocket sSLSocket, String str, List<? extends d0> list) {
        c.j.b.d.d(sSLSocket, "sslSocket");
        c.j.b.d.d(list, "protocols");
        k kVarE = e(sSLSocket);
        if (kVarE != null) {
            kVarE.d(sSLSocket, str, list);
        }
    }

    public final synchronized k e(SSLSocket sSLSocket) {
        if (this.f1664a == null && this.f1665b.a(sSLSocket)) {
            this.f1664a = this.f1665b.b(sSLSocket);
        }
        return this.f1664a;
    }
}
