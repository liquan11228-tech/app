package d.n0.m;

import java.security.GeneralSecurityException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;

/* loaded from: classes.dex */
public final class a extends c {

    /* renamed from: a, reason: collision with root package name */
    public final e f1667a;

    public a(e eVar) {
        c.j.b.d.d(eVar, "trustRootIndex");
        this.f1667a = eVar;
    }

    @Override // d.n0.m.c
    public List<Certificate> a(List<? extends Certificate> list, String str) throws SSLPeerUnverifiedException {
        c.j.b.d.d(list, "chain");
        c.j.b.d.d(str, "hostname");
        ArrayDeque arrayDeque = new ArrayDeque(list);
        ArrayList arrayList = new ArrayList();
        Object objRemoveFirst = arrayDeque.removeFirst();
        c.j.b.d.c(objRemoveFirst, "queue.removeFirst()");
        arrayList.add(objRemoveFirst);
        boolean z = false;
        for (int i = 0; i < 9; i++) {
            Object obj = arrayList.get(arrayList.size() - 1);
            if (obj == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.security.cert.X509Certificate");
            }
            X509Certificate x509Certificate = (X509Certificate) obj;
            X509Certificate x509CertificateA = this.f1667a.a(x509Certificate);
            if (x509CertificateA == null) {
                Iterator it = arrayDeque.iterator();
                c.j.b.d.c(it, "queue.iterator()");
                while (it.hasNext()) {
                    Object next = it.next();
                    if (next == null) {
                        throw new NullPointerException("null cannot be cast to non-null type java.security.cert.X509Certificate");
                    }
                    X509Certificate x509Certificate2 = (X509Certificate) next;
                    if (b(x509Certificate, x509Certificate2)) {
                        it.remove();
                        arrayList.add(x509Certificate2);
                    }
                }
                if (z) {
                    return arrayList;
                }
                throw new SSLPeerUnverifiedException("Failed to find a trusted cert that signed " + x509Certificate);
            }
            if (arrayList.size() > 1 || (!c.j.b.d.a(x509Certificate, x509CertificateA))) {
                arrayList.add(x509CertificateA);
            }
            if (b(x509CertificateA, x509CertificateA)) {
                return arrayList;
            }
            z = true;
        }
        throw new SSLPeerUnverifiedException("Certificate chain too long: " + arrayList);
    }

    public final boolean b(X509Certificate x509Certificate, X509Certificate x509Certificate2) {
        if (!c.j.b.d.a(x509Certificate.getIssuerDN(), x509Certificate2.getSubjectDN())) {
            return false;
        }
        try {
            x509Certificate.verify(x509Certificate2.getPublicKey());
            return true;
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof a) && c.j.b.d.a(((a) obj).f1667a, this.f1667a);
    }

    public int hashCode() {
        return this.f1667a.hashCode();
    }
}
