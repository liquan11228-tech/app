package d.n0.k.i;

import d.d0;
import d.n0.k.c;
import d.n0.k.i.j;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLSocket;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;

/* loaded from: classes.dex */
public final class g implements k {

    /* renamed from: a, reason: collision with root package name */
    public static final j.a f1659a = new a();

    public static final class a implements j.a {
        @Override // d.n0.k.i.j.a
        public boolean a(SSLSocket sSLSocket) {
            c.j.b.d.d(sSLSocket, "sslSocket");
            c.a aVar = d.n0.k.c.f;
            return d.n0.k.c.f1630e && (sSLSocket instanceof BCSSLSocket);
        }

        @Override // d.n0.k.i.j.a
        public k b(SSLSocket sSLSocket) {
            c.j.b.d.d(sSLSocket, "sslSocket");
            return new g();
        }
    }

    @Override // d.n0.k.i.k
    public boolean a(SSLSocket sSLSocket) {
        c.j.b.d.d(sSLSocket, "sslSocket");
        return sSLSocket instanceof BCSSLSocket;
    }

    @Override // d.n0.k.i.k
    public String b(SSLSocket sSLSocket) {
        c.j.b.d.d(sSLSocket, "sslSocket");
        String applicationProtocol = ((BCSSLSocket) sSLSocket).getApplicationProtocol();
        if (applicationProtocol == null || (applicationProtocol.hashCode() == 0 && applicationProtocol.equals(""))) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // d.n0.k.i.k
    public boolean c() {
        c.a aVar = d.n0.k.c.f;
        return d.n0.k.c.f1630e;
    }

    @Override // d.n0.k.i.k
    public void d(SSLSocket sSLSocket, String str, List<? extends d0> list) {
        c.j.b.d.d(sSLSocket, "sslSocket");
        c.j.b.d.d(list, "protocols");
        if (a(sSLSocket)) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sSLSocket;
            BCSSLParameters parameters = bCSSLSocket.getParameters();
            c.j.b.d.c(parameters, "sslParameters");
            Object[] array = ((ArrayList) d.n0.k.h.f1646c.a(list)).toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            parameters.setApplicationProtocols((String[]) array);
            bCSSLSocket.setParameters(parameters);
        }
    }
}
