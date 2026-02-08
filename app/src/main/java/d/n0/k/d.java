package d.n0.k;

import a.b.k.h;
import d.d0;
import java.security.KeyManagementException;
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
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import org.conscrypt.Conscrypt;
import org.conscrypt.ConscryptHostnameVerifier;

/* loaded from: classes.dex */
public final class d extends h {

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f1632e;
    public static final a f;

    /* renamed from: d, reason: collision with root package name */
    public final Provider f1633d;

    public static final class a {
        public a(c.j.b.c cVar) {
        }

        public final boolean a(int i, int i2, int i3) {
            Conscrypt.Version version = Conscrypt.version();
            return version.major() != i ? version.major() > i : version.minor() != i2 ? version.minor() > i2 : version.patch() >= i3;
        }
    }

    public static final class b implements ConscryptHostnameVerifier {

        /* renamed from: a, reason: collision with root package name */
        public static final b f1634a = new b();
    }

    static {
        a aVar = new a(null);
        f = aVar;
        boolean z = false;
        try {
            Class.forName("org.conscrypt.Conscrypt$Version", false, aVar.getClass().getClassLoader());
            if (Conscrypt.isAvailable()) {
                if (f.a(2, 1, 0)) {
                    z = true;
                }
            }
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        f1632e = z;
    }

    public d() {
        Provider providerNewProvider = Conscrypt.newProvider();
        c.j.b.d.c(providerNewProvider, "Conscrypt.newProvider()");
        this.f1633d = providerNewProvider;
    }

    @Override // d.n0.k.h
    public void d(SSLSocket sSLSocket, String str, List<d0> list) {
        c.j.b.d.d(sSLSocket, "sslSocket");
        c.j.b.d.d(list, "protocols");
        if (!Conscrypt.isConscrypt(sSLSocket)) {
            super.d(sSLSocket, str, list);
            return;
        }
        Conscrypt.setUseSessionTickets(sSLSocket, true);
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
        Object[] array = arrayList2.toArray(new String[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        Conscrypt.setApplicationProtocols(sSLSocket, (String[]) array);
    }

    @Override // d.n0.k.h
    public String f(SSLSocket sSLSocket) {
        c.j.b.d.d(sSLSocket, "sslSocket");
        if (Conscrypt.isConscrypt(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        super.f(sSLSocket);
        return null;
    }

    @Override // d.n0.k.h
    public SSLContext l() throws NoSuchAlgorithmException {
        SSLContext sSLContext = SSLContext.getInstance("TLS", this.f1633d);
        c.j.b.d.c(sSLContext, "SSLContext.getInstance(\"TLS\", provider)");
        return sSLContext;
    }

    @Override // d.n0.k.h
    public SSLSocketFactory m(X509TrustManager x509TrustManager) throws NoSuchAlgorithmException, KeyManagementException {
        c.j.b.d.d(x509TrustManager, "trustManager");
        SSLContext sSLContext = SSLContext.getInstance("TLS", this.f1633d);
        c.j.b.d.c(sSLContext, "SSLContext.getInstance(\"TLS\", provider)");
        sSLContext.init(null, new TrustManager[]{x509TrustManager}, null);
        SSLSocketFactory socketFactory = sSLContext.getSocketFactory();
        c.j.b.d.c(socketFactory, "newSSLContext().apply {\n…null)\n    }.socketFactory");
        return socketFactory;
    }

    @Override // d.n0.k.h
    public X509TrustManager n() throws NoSuchAlgorithmException, KeyStoreException {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init((KeyStore) null);
        c.j.b.d.c(trustManagerFactory, "TrustManagerFactory.getI…(null as KeyStore?)\n    }");
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        c.j.b.d.b(trustManagers);
        if (!(trustManagers.length == 1 && (trustManagers[0] instanceof X509TrustManager))) {
            StringBuilder sbE = b.a.a.a.a.e("Unexpected default trust managers: ");
            String string = Arrays.toString(trustManagers);
            c.j.b.d.c(string, "java.util.Arrays.toString(this)");
            sbE.append(string);
            throw new IllegalStateException(sbE.toString().toString());
        }
        TrustManager trustManager = trustManagers[0];
        if (trustManager == null) {
            throw new NullPointerException("null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
        }
        X509TrustManager x509TrustManager = (X509TrustManager) trustManager;
        Conscrypt.setHostnameVerifier(x509TrustManager, b.f1634a);
        return x509TrustManager;
    }
}
