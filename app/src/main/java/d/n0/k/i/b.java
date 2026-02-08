package d.n0.k.i;

import android.net.http.X509TrustManagerExtensions;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes.dex */
public final class b extends d.n0.m.c {

    /* renamed from: a, reason: collision with root package name */
    public final X509TrustManager f1647a;

    /* renamed from: b, reason: collision with root package name */
    public final X509TrustManagerExtensions f1648b;

    public b(X509TrustManager x509TrustManager, X509TrustManagerExtensions x509TrustManagerExtensions) {
        c.j.b.d.d(x509TrustManager, "trustManager");
        c.j.b.d.d(x509TrustManagerExtensions, "x509TrustManagerExtensions");
        this.f1647a = x509TrustManager;
        this.f1648b = x509TrustManagerExtensions;
    }

    @Override // d.n0.m.c
    public List<Certificate> a(List<? extends Certificate> list, String str) throws CertificateException, SSLPeerUnverifiedException {
        c.j.b.d.d(list, "chain");
        c.j.b.d.d(str, "hostname");
        Object[] array = list.toArray(new X509Certificate[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        try {
            List<X509Certificate> listCheckServerTrusted = this.f1648b.checkServerTrusted((X509Certificate[]) array, "RSA", str);
            c.j.b.d.c(listCheckServerTrusted, "x509TrustManagerExtensio…ficates, \"RSA\", hostname)");
            return listCheckServerTrusted;
        } catch (CertificateException e2) {
            SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e2.getMessage());
            sSLPeerUnverifiedException.initCause(e2);
            throw sSLPeerUnverifiedException;
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof b) && ((b) obj).f1647a == this.f1647a;
    }

    public int hashCode() {
        return System.identityHashCode(this.f1647a);
    }
}
