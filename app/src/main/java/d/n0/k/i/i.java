package d.n0.k.i;

import d.d0;
import d.n0.k.d;
import d.n0.k.i.j;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;

/* loaded from: classes.dex */
public final class i implements k {

    /* renamed from: a, reason: collision with root package name */
    public static final j.a f1663a = new a();

    public static final class a implements j.a {
        @Override // d.n0.k.i.j.a
        public boolean a(SSLSocket sSLSocket) {
            c.j.b.d.d(sSLSocket, "sslSocket");
            d.a aVar = d.n0.k.d.f;
            return d.n0.k.d.f1632e && Conscrypt.isConscrypt(sSLSocket);
        }

        @Override // d.n0.k.i.j.a
        public k b(SSLSocket sSLSocket) {
            c.j.b.d.d(sSLSocket, "sslSocket");
            return new i();
        }
    }

    @Override // d.n0.k.i.k
    public boolean a(SSLSocket sSLSocket) {
        c.j.b.d.d(sSLSocket, "sslSocket");
        return Conscrypt.isConscrypt(sSLSocket);
    }

    @Override // d.n0.k.i.k
    public String b(SSLSocket sSLSocket) {
        c.j.b.d.d(sSLSocket, "sslSocket");
        if (a(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }

    @Override // d.n0.k.i.k
    public boolean c() {
        d.a aVar = d.n0.k.d.f;
        return d.n0.k.d.f1632e;
    }

    @Override // d.n0.k.i.k
    public void d(SSLSocket sSLSocket, String str, List<? extends d0> list) {
        c.j.b.d.d(sSLSocket, "sslSocket");
        c.j.b.d.d(list, "protocols");
        if (a(sSLSocket)) {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            Object[] array = ((ArrayList) d.n0.k.h.f1646c.a(list)).toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) array);
        }
    }
}
