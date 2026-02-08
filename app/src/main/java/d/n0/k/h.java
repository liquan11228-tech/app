package d.n0.k;

import a.b.k.h;
import d.d0;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes.dex */
public class h {

    /* renamed from: a */
    public static volatile h f1644a;

    /* renamed from: b */
    public static final Logger f1645b;

    /* renamed from: c */
    public static final a f1646c;

    public static final class a {
        public a(c.j.b.c cVar) {
        }

        public final List<String> a(List<? extends d0> list) {
            c.j.b.d.d(list, "protocols");
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((d0) obj) != d0.HTTP_1_0) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(h.i.r(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((d0) it.next()).f1344b);
            }
            return arrayList2;
        }

        public final byte[] b(List<? extends d0> list) {
            c.j.b.d.d(list, "protocols");
            e.e eVar = new e.e();
            Iterator it = ((ArrayList) a(list)).iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                eVar.P(str.length());
                eVar.T(str);
            }
            return eVar.t(eVar.f1761c);
        }

        public final boolean c() {
            return c.j.b.d.a("Dalvik", System.getProperty("java.vm.name"));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x00fc  */
    static {
        /*
            Method dump skipped, instructions count: 411
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: d.n0.k.h.<clinit>():void");
    }

    public static /* synthetic */ void j(h hVar, String str, int i, Throwable th, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 4;
        }
        int i3 = i2 & 4;
        hVar.i(str, i, null);
    }

    public void a(SSLSocket sSLSocket) {
        c.j.b.d.d(sSLSocket, "sslSocket");
    }

    public d.n0.m.c b(X509TrustManager x509TrustManager) {
        c.j.b.d.d(x509TrustManager, "trustManager");
        return new d.n0.m.a(c(x509TrustManager));
    }

    public d.n0.m.e c(X509TrustManager x509TrustManager) {
        c.j.b.d.d(x509TrustManager, "trustManager");
        X509Certificate[] acceptedIssuers = x509TrustManager.getAcceptedIssuers();
        c.j.b.d.c(acceptedIssuers, "trustManager.acceptedIssuers");
        return new d.n0.m.b((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
    }

    public void d(SSLSocket sSLSocket, String str, List<d0> list) {
        c.j.b.d.d(sSLSocket, "sslSocket");
        c.j.b.d.d(list, "protocols");
    }

    public void e(Socket socket, InetSocketAddress inetSocketAddress, int i) throws IOException {
        c.j.b.d.d(socket, "socket");
        c.j.b.d.d(inetSocketAddress, "address");
        socket.connect(inetSocketAddress, i);
    }

    public String f(SSLSocket sSLSocket) {
        c.j.b.d.d(sSLSocket, "sslSocket");
        return null;
    }

    public Object g(String str) {
        c.j.b.d.d(str, "closer");
        if (f1645b.isLoggable(Level.FINE)) {
            return new Throwable(str);
        }
        return null;
    }

    public boolean h(String str) {
        c.j.b.d.d(str, "hostname");
        return true;
    }

    public void i(String str, int i, Throwable th) {
        c.j.b.d.d(str, "message");
        f1645b.log(i == 5 ? Level.WARNING : Level.INFO, str, th);
    }

    public void k(String str, Object obj) {
        c.j.b.d.d(str, "message");
        if (obj == null) {
            str = b.a.a.a.a.b(str, " To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);");
        }
        i(str, 5, (Throwable) obj);
    }

    public SSLContext l() throws NoSuchAlgorithmException {
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        c.j.b.d.c(sSLContext, "SSLContext.getInstance(\"TLS\")");
        return sSLContext;
    }

    public SSLSocketFactory m(X509TrustManager x509TrustManager) throws KeyManagementException {
        c.j.b.d.d(x509TrustManager, "trustManager");
        try {
            SSLContext sSLContextL = l();
            sSLContextL.init(null, new TrustManager[]{x509TrustManager}, null);
            SSLSocketFactory socketFactory = sSLContextL.getSocketFactory();
            c.j.b.d.c(socketFactory, "newSSLContext().apply {\n…ll)\n  }.socketFactory");
            return socketFactory;
        } catch (GeneralSecurityException e2) {
            throw new AssertionError("No System TLS: " + e2, e2);
        }
    }

    public X509TrustManager n() throws NoSuchAlgorithmException, KeyStoreException {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
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

    public String toString() {
        String simpleName = getClass().getSimpleName();
        c.j.b.d.c(simpleName, "javaClass.simpleName");
        return simpleName;
    }
}
