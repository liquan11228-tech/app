package d.n0.m;

import java.security.cert.X509Certificate;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import javax.security.auth.x500.X500Principal;

/* loaded from: classes.dex */
public final class b implements e {

    /* renamed from: a, reason: collision with root package name */
    public final Map<X500Principal, Set<X509Certificate>> f1668a;

    public b(X509Certificate... x509CertificateArr) {
        c.j.b.d.d(x509CertificateArr, "caCerts");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (X509Certificate x509Certificate : x509CertificateArr) {
            X500Principal subjectX500Principal = x509Certificate.getSubjectX500Principal();
            c.j.b.d.c(subjectX500Principal, "caCert.subjectX500Principal");
            Object linkedHashSet = linkedHashMap.get(subjectX500Principal);
            if (linkedHashSet == null) {
                linkedHashSet = new LinkedHashSet();
                linkedHashMap.put(subjectX500Principal, linkedHashSet);
            }
            ((Set) linkedHashSet).add(x509Certificate);
        }
        this.f1668a = linkedHashMap;
    }

    @Override // d.n0.m.e
    public X509Certificate a(X509Certificate x509Certificate) {
        boolean z;
        c.j.b.d.d(x509Certificate, "cert");
        Set<X509Certificate> set = this.f1668a.get(x509Certificate.getIssuerX500Principal());
        Object obj = null;
        if (set == null) {
            return null;
        }
        Iterator<T> it = set.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            try {
                x509Certificate.verify(((X509Certificate) next).getPublicKey());
                z = true;
            } catch (Exception unused) {
                z = false;
            }
            if (z) {
                obj = next;
                break;
            }
        }
        return (X509Certificate) obj;
    }

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof b) && c.j.b.d.a(((b) obj).f1668a, this.f1668a));
    }

    public int hashCode() {
        return this.f1668a.hashCode();
    }
}
