package d.n0.k;

import a.b.k.h;
import d.d0;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import org.openjsse.javax.net.ssl.SSLParameters;
import org.openjsse.net.ssl.OpenJSSE;

/* loaded from: classes.dex */
public final class g extends h {

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f1642e;
    public static final a f;

    /* renamed from: d, reason: collision with root package name */
    public final Provider f1643d = new OpenJSSE();

    public static final class a {
        public a(c.j.b.c cVar) {
        }
    }

    static {
        a aVar = new a(null);
        f = aVar;
        boolean z = false;
        try {
            Class.forName("org.openjsse.net.ssl.OpenJSSE", false, aVar.getClass().getClassLoader());
            z = true;
        } catch (ClassNotFoundException unused) {
        }
        f1642e = z;
    }

    @Override // d.n0.k.h
    public void d(SSLSocket sSLSocket, String str, List<d0> list) {
        c.j.b.d.d(sSLSocket, "sslSocket");
        c.j.b.d.d(list, "protocols");
        if (!(sSLSocket instanceof org.openjsse.javax.net.ssl.SSLSocket)) {
            super.d(sSLSocket, str, list);
            return;
        }
        org.openjsse.javax.net.ssl.SSLSocket sSLSocket2 = (org.openjsse.javax.net.ssl.SSLSocket) sSLSocket;
        SSLParameters sSLParameters = sSLSocket2.getSSLParameters();
        if (sSLParameters instanceof SSLParameters) {
            c.j.b.d.d(list, "protocols");
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (((d0) next) != d0.HTTP_1_0) {
                    arrayList.add(next);
                }
            }
            ArrayList arrayList2 = new ArrayList(h.i.r(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((d0) it2.next()).f1344b);
            }
            SSLParameters sSLParameters2 = sSLParameters;
            Object[] array = arrayList2.toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            sSLParameters2.setApplicationProtocols((String[]) array);
            sSLSocket2.setSSLParameters(sSLParameters);
        }
    }

    @Override // d.n0.k.h
    public String f(SSLSocket sSLSocket) {
        c.j.b.d.d(sSLSocket, "sslSocket");
        if (sSLSocket instanceof org.openjsse.javax.net.ssl.SSLSocket) {
            String applicationProtocol = ((org.openjsse.javax.net.ssl.SSLSocket) sSLSocket).getApplicationProtocol();
            if (applicationProtocol != null && (applicationProtocol.hashCode() != 0 || !applicationProtocol.equals(""))) {
                return applicationProtocol;
            }
        } else {
            super.f(sSLSocket);
        }
        return null;
    }

    @Override // d.n0.k.h
    public SSLContext l() throws NoSuchAlgorithmException {
        SSLContext sSLContext = SSLContext.getInstance("TLSv1.3", this.f1643d);
        c.j.b.d.c(sSLContext, "SSLContext.getInstance(\"TLSv1.3\", provider)");
        return sSLContext;
    }

    @Override // d.n0.k.h
    public X509TrustManager n() throws NoSuchAlgorithmException, KeyStoreException {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm(), this.f1643d);
        trustManagerFactory.init((KeyStore) null);
        c.j.b.d.c(trustManagerFactory, "factory");
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        c.j.b.d.b(trustManagers);
        if (trustManagers.length == 1 && (trustManagers[0] instanceof X509TrustManager)) {
            TrustManager trustManager = trustManagers[0];
            if (trustManager != null) {
                return (X509TrustManager) trustManager;
            }
            throw new NullPointerException("null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
        }
        StringBuilder sbE = b.a.a.a.a.e("Unexpected default trust managers: ");
        String string = Arrays.toString(trustManagers);
        c.j.b.d.c(string, "java.util.Arrays.toString(this)");
        sbE.append(string);
        throw new IllegalStateException(sbE.toString().toString());
    }
}
