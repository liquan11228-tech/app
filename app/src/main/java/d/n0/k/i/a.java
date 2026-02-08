package d.n0.k.i;

import android.annotation.SuppressLint;
import android.net.ssl.SSLSockets;
import android.os.Build;
import d.d0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

@SuppressLint({"NewApi"})
/* loaded from: classes.dex */
public final class a implements k {
    @Override // d.n0.k.i.k
    public boolean a(SSLSocket sSLSocket) {
        c.j.b.d.d(sSLSocket, "sslSocket");
        return SSLSockets.isSupportedSocket(sSLSocket);
    }

    @Override // d.n0.k.i.k
    @SuppressLint({"NewApi"})
    public String b(SSLSocket sSLSocket) {
        c.j.b.d.d(sSLSocket, "sslSocket");
        String applicationProtocol = sSLSocket.getApplicationProtocol();
        if (applicationProtocol == null || (applicationProtocol.hashCode() == 0 && applicationProtocol.equals(""))) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // d.n0.k.i.k
    public boolean c() {
        return d.n0.k.h.f1646c.c() && Build.VERSION.SDK_INT >= 29;
    }

    @Override // d.n0.k.i.k
    @SuppressLint({"NewApi"})
    public void d(SSLSocket sSLSocket, String str, List<? extends d0> list) throws IOException {
        c.j.b.d.d(sSLSocket, "sslSocket");
        c.j.b.d.d(list, "protocols");
        try {
            SSLSockets.setUseSessionTickets(sSLSocket, true);
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            c.j.b.d.c(sSLParameters, "sslParameters");
            Object[] array = ((ArrayList) d.n0.k.h.f1646c.a(list)).toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            sSLParameters.setApplicationProtocols((String[]) array);
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalArgumentException e2) {
            throw new IOException("Android internal error", e2);
        }
    }
}
