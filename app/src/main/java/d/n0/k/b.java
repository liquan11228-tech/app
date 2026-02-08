package d.n0.k;

import a.b.k.h;
import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import d.d0;
import d.n0.k.i.f;
import d.n0.k.i.i;
import d.n0.k.i.j;
import d.n0.k.i.k;
import d.n0.k.i.l;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes.dex */
public final class b extends h {
    public static final boolean f;
    public static final a g = new a(null);

    /* renamed from: d */
    public final List<k> f1626d;

    /* renamed from: e */
    public final d.n0.k.i.h f1627e;

    public static final class a {
        public a(c.j.b.c cVar) {
        }
    }

    /* renamed from: d.n0.k.b$b */
    public static final class C0037b implements d.n0.m.e {

        /* renamed from: a */
        public final X509TrustManager f1628a;

        /* renamed from: b */
        public final Method f1629b;

        public C0037b(X509TrustManager x509TrustManager, Method method) {
            c.j.b.d.d(x509TrustManager, "trustManager");
            c.j.b.d.d(method, "findByIssuerAndSignatureMethod");
            this.f1628a = x509TrustManager;
            this.f1629b = method;
        }

        @Override // d.n0.m.e
        public X509Certificate a(X509Certificate x509Certificate) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            c.j.b.d.d(x509Certificate, "cert");
            try {
                Object objInvoke = this.f1629b.invoke(this.f1628a, x509Certificate);
                if (objInvoke != null) {
                    return ((TrustAnchor) objInvoke).getTrustedCert();
                }
                throw new NullPointerException("null cannot be cast to non-null type java.security.cert.TrustAnchor");
            } catch (IllegalAccessException e2) {
                throw new AssertionError("unable to get issues and signature", e2);
            } catch (InvocationTargetException unused) {
                return null;
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0037b)) {
                return false;
            }
            C0037b c0037b = (C0037b) obj;
            return c.j.b.d.a(this.f1628a, c0037b.f1628a) && c.j.b.d.a(this.f1629b, c0037b.f1629b);
        }

        public int hashCode() {
            X509TrustManager x509TrustManager = this.f1628a;
            int iHashCode = (x509TrustManager != null ? x509TrustManager.hashCode() : 0) * 31;
            Method method = this.f1629b;
            return iHashCode + (method != null ? method.hashCode() : 0);
        }

        public String toString() {
            StringBuilder sbE = b.a.a.a.a.e("CustomTrustRootIndex(trustManager=");
            sbE.append(this.f1628a);
            sbE.append(", findByIssuerAndSignatureMethod=");
            sbE.append(this.f1629b);
            sbE.append(")");
            return sbE.toString();
        }
    }

    static {
        boolean z = true;
        if (!h.f1646c.c() || Build.VERSION.SDK_INT >= 30) {
            z = false;
        } else if (1 == 0) {
            StringBuilder sbE = b.a.a.a.a.e("Expected Android API level 21+ but was ");
            sbE.append(Build.VERSION.SDK_INT);
            throw new IllegalStateException(sbE.toString().toString());
        }
        f = z;
    }

    public b() throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        l lVar;
        Method method;
        Method method2;
        k[] kVarArr = new k[4];
        l.a aVar = l.h;
        c.j.b.d.d("com.android.org.conscrypt", "packageName");
        Method method3 = null;
        try {
            Class<?> cls = Class.forName("com.android.org.conscrypt.OpenSSLSocketImpl");
            Class<?> cls2 = Class.forName("com.android.org.conscrypt.OpenSSLSocketFactoryImpl");
            Class<?> cls3 = Class.forName("com.android.org.conscrypt.SSLParametersImpl");
            c.j.b.d.c(cls3, "paramsClass");
            lVar = new l(cls, cls2, cls3);
        } catch (Exception e2) {
            h.f1644a.i("unable to load android socket classes", 5, e2);
            lVar = null;
        }
        kVarArr[0] = lVar;
        f.a aVar2 = d.n0.k.i.f.g;
        kVarArr[1] = new j(d.n0.k.i.f.f);
        kVarArr[2] = new j(i.f1663a);
        kVarArr[3] = new j(d.n0.k.i.g.f1659a);
        List listF = h.i.F(kVarArr);
        ArrayList arrayList = new ArrayList();
        Iterator it = ((ArrayList) listF).iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((k) next).c()) {
                arrayList.add(next);
            }
        }
        this.f1626d = arrayList;
        try {
            Class<?> cls4 = Class.forName("dalvik.system.CloseGuard");
            Method method4 = cls4.getMethod("get", new Class[0]);
            method2 = cls4.getMethod("open", String.class);
            method = cls4.getMethod("warnIfOpen", new Class[0]);
            method3 = method4;
        } catch (Exception unused) {
            method = null;
            method2 = null;
        }
        this.f1627e = new d.n0.k.i.h(method3, method2, method);
    }

    @Override // d.n0.k.h
    public d.n0.m.c b(X509TrustManager x509TrustManager) {
        X509TrustManagerExtensions x509TrustManagerExtensions;
        c.j.b.d.d(x509TrustManager, "trustManager");
        c.j.b.d.d(x509TrustManager, "trustManager");
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
        } catch (IllegalArgumentException unused) {
            x509TrustManagerExtensions = null;
        }
        d.n0.k.i.b bVar = x509TrustManagerExtensions != null ? new d.n0.k.i.b(x509TrustManager, x509TrustManagerExtensions) : null;
        return bVar != null ? bVar : super.b(x509TrustManager);
    }

    @Override // d.n0.k.h
    public d.n0.m.e c(X509TrustManager x509TrustManager) throws NoSuchMethodException, SecurityException {
        c.j.b.d.d(x509TrustManager, "trustManager");
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            c.j.b.d.c(declaredMethod, "method");
            declaredMethod.setAccessible(true);
            return new C0037b(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.c(x509TrustManager);
        }
    }

    @Override // d.n0.k.h
    public void d(SSLSocket sSLSocket, String str, List<d0> list) {
        Object next;
        c.j.b.d.d(sSLSocket, "sslSocket");
        c.j.b.d.d(list, "protocols");
        Iterator<T> it = this.f1626d.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((k) next).a(sSLSocket)) {
                    break;
                }
            }
        }
        k kVar = (k) next;
        if (kVar != null) {
            kVar.d(sSLSocket, str, list);
        }
    }

    @Override // d.n0.k.h
    public void e(Socket socket, InetSocketAddress inetSocketAddress, int i) throws IOException {
        c.j.b.d.d(socket, "socket");
        c.j.b.d.d(inetSocketAddress, "address");
        try {
            socket.connect(inetSocketAddress, i);
        } catch (ClassCastException e2) {
            if (Build.VERSION.SDK_INT != 26) {
                throw e2;
            }
            throw new IOException("Exception in connect", e2);
        }
    }

    @Override // d.n0.k.h
    public String f(SSLSocket sSLSocket) {
        Object next;
        c.j.b.d.d(sSLSocket, "sslSocket");
        Iterator<T> it = this.f1626d.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((k) next).a(sSLSocket)) {
                break;
            }
        }
        k kVar = (k) next;
        if (kVar != null) {
            return kVar.b(sSLSocket);
        }
        return null;
    }

    @Override // d.n0.k.h
    public Object g(String str) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        c.j.b.d.d(str, "closer");
        d.n0.k.i.h hVar = this.f1627e;
        if (hVar == null) {
            throw null;
        }
        c.j.b.d.d(str, "closer");
        Method method = hVar.f1660a;
        if (method == null) {
            return null;
        }
        try {
            Object objInvoke = method.invoke(null, new Object[0]);
            Method method2 = hVar.f1661b;
            c.j.b.d.b(method2);
            method2.invoke(objInvoke, str);
            return objInvoke;
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // d.n0.k.h
    public boolean h(String str) {
        c.j.b.d.d(str, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }

    @Override // d.n0.k.h
    public void k(String str, Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        c.j.b.d.d(str, "message");
        d.n0.k.i.h hVar = this.f1627e;
        if (hVar == null) {
            throw null;
        }
        boolean z = false;
        if (obj != null) {
            try {
                Method method = hVar.f1662c;
                c.j.b.d.b(method);
                method.invoke(obj, new Object[0]);
                z = true;
            } catch (Exception unused) {
            }
        }
        if (z) {
            return;
        }
        h.j(this, str, 5, null, 4, null);
    }
}
