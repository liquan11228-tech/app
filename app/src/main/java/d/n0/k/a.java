package d.n0.k;

import a.b.k.h;
import android.annotation.SuppressLint;
import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import d.d0;
import d.n0.k.i.f;
import d.n0.k.i.i;
import d.n0.k.i.j;
import d.n0.k.i.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes.dex */
public final class a extends h {

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f1624e;
    public static final a f = null;

    /* renamed from: d, reason: collision with root package name */
    public final List<k> f1625d;

    static {
        f1624e = h.f1646c.c() && Build.VERSION.SDK_INT >= 29;
    }

    public a() {
        k[] kVarArr = new k[4];
        kVarArr[0] = c.j.b.d.a("Dalvik", System.getProperty("java.vm.name")) && Build.VERSION.SDK_INT >= 29 ? new d.n0.k.i.a() : null;
        f.a aVar = d.n0.k.i.f.g;
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
        this.f1625d = arrayList;
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
    public void d(SSLSocket sSLSocket, String str, List<? extends d0> list) {
        Object next;
        c.j.b.d.d(sSLSocket, "sslSocket");
        c.j.b.d.d(list, "protocols");
        Iterator<T> it = this.f1625d.iterator();
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
    public String f(SSLSocket sSLSocket) {
        Object next;
        c.j.b.d.d(sSLSocket, "sslSocket");
        Iterator<T> it = this.f1625d.iterator();
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
    @SuppressLint({"NewApi"})
    public boolean h(String str) {
        c.j.b.d.d(str, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }
}
