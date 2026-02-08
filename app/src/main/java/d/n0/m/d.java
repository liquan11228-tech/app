package d.n0.m;

import c.g.h;
import java.security.cert.Certificate;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;

/* loaded from: classes.dex */
public final class d implements HostnameVerifier {

    /* renamed from: a, reason: collision with root package name */
    public static final d f1669a = new d();

    public final List<String> a(X509Certificate x509Certificate, int i) throws CertificateParsingException {
        Object obj;
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return h.f1272b;
            }
            ArrayList arrayList = new ArrayList();
            for (List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && !(!c.j.b.d.a(list.get(0), Integer.valueOf(i))) && (obj = list.get(1)) != null) {
                    arrayList.add((String) obj);
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return h.f1272b;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x012e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:? A[LOOP:1: B:17:0x0060->B:88:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean b(java.lang.String r13, java.security.cert.X509Certificate r14) throws java.security.cert.CertificateParsingException, java.net.UnknownHostException {
        /*
            Method dump skipped, instructions count: 304
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: d.n0.m.d.b(java.lang.String, java.security.cert.X509Certificate):boolean");
    }

    @Override // javax.net.ssl.HostnameVerifier
    public boolean verify(String str, SSLSession sSLSession) {
        c.j.b.d.d(str, "host");
        c.j.b.d.d(sSLSession, "session");
        try {
            Certificate certificate = sSLSession.getPeerCertificates()[0];
            if (certificate != null) {
                return b(str, (X509Certificate) certificate);
            }
            throw new NullPointerException("null cannot be cast to non-null type java.security.cert.X509Certificate");
        } catch (SSLException unused) {
            return false;
        }
    }
}
