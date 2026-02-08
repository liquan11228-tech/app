package d;

import e.h;
import java.security.Principal;
import java.security.PublicKey;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: c */
    public static final h f1370c;

    /* renamed from: d */
    public static final a f1371d = new a(null);

    /* renamed from: a */
    public final Set<b> f1372a;

    /* renamed from: b */
    public final d.n0.m.c f1373b;

    public static final class a {
        public a(c.j.b.c cVar) {
        }

        public final String a(Certificate certificate) {
            c.j.b.d.d(certificate, "certificate");
            if (!(certificate instanceof X509Certificate)) {
                throw new IllegalArgumentException("Certificate pinning requires X509 certificates".toString());
            }
            StringBuilder sbE = b.a.a.a.a.e("sha256/");
            sbE.append(b((X509Certificate) certificate).a());
            return sbE.toString();
        }

        public final e.h b(X509Certificate x509Certificate) {
            c.j.b.d.d(x509Certificate, "$this$sha256Hash");
            h.a aVar = e.h.f;
            PublicKey publicKey = x509Certificate.getPublicKey();
            c.j.b.d.c(publicKey, "publicKey");
            byte[] encoded = publicKey.getEncoded();
            c.j.b.d.c(encoded, "publicKey.encoded");
            return h.a.c(aVar, encoded, 0, 0, 3).b("SHA-256");
        }
    }

    public static final class b {

        /* renamed from: a */
        public final String f1374a;

        /* renamed from: b */
        public final String f1375b;

        /* renamed from: c */
        public final e.h f1376c;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return ((c.j.b.d.a(null, bVar.f1374a) ^ true) || (c.j.b.d.a(null, bVar.f1375b) ^ true) || (c.j.b.d.a(null, bVar.f1376c) ^ true)) ? false : true;
        }

        public int hashCode() {
            throw null;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append((String) null);
            sb.append('/');
            throw null;
        }
    }

    static {
        Set setSingleton;
        ArrayList arrayList = new ArrayList();
        c.j.b.d.d(arrayList, "$this$toSet");
        int size = arrayList.size();
        if (size == 0) {
            setSingleton = c.g.j.f1274b;
        } else if (size != 1) {
            int size2 = arrayList.size();
            if (size2 >= 0) {
                size2 = size2 < 3 ? size2 + 1 : size2 < 1073741824 ? (int) ((size2 / 0.75f) + 1.0f) : Integer.MAX_VALUE;
            }
            setSingleton = new LinkedHashSet(size2);
            c.g.e.g(arrayList, setSingleton);
        } else {
            setSingleton = Collections.singleton(arrayList.get(0));
            c.j.b.d.c(setSingleton, "java.util.Collections.singleton(element)");
        }
        f1370c = new h(setSingleton, null, 2);
    }

    public h(Set<b> set, d.n0.m.c cVar) {
        c.j.b.d.d(set, "pins");
        this.f1372a = set;
        this.f1373b = cVar;
    }

    public h(Set set, d.n0.m.c cVar, int i) {
        int i2 = i & 2;
        c.j.b.d.d(set, "pins");
        this.f1372a = set;
        this.f1373b = null;
    }

    public final void a(String str, c.j.a.a<? extends List<? extends X509Certificate>> aVar) {
        c.j.b.d.d(str, "hostname");
        c.j.b.d.d(aVar, "cleanedPeerCertificatesFn");
        c.j.b.d.d(str, "hostname");
        Set<b> set = this.f1372a;
        List<b> arrayList = c.g.h.f1272b;
        for (Object obj : set) {
            if (((b) obj) == null) {
                throw null;
            }
            c.j.b.d.d(str, "hostname");
            if (c.m.e.z(null, "**.", false, 2)) {
                throw null;
            }
            if (c.m.e.z(null, "*.", false, 2)) {
                throw null;
            }
            if (c.j.b.d.a(str, null)) {
                if (arrayList.isEmpty()) {
                    arrayList = new ArrayList();
                }
                if (arrayList instanceof c.j.b.l.a) {
                    ClassCastException classCastException = new ClassCastException(b.a.a.a.a.c(arrayList.getClass().getName(), " cannot be cast to ", "kotlin.collections.MutableList"));
                    c.j.b.d.g(classCastException, c.j.b.k.class.getName());
                    throw classCastException;
                }
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        List<? extends X509Certificate> listC = aVar.c();
        for (X509Certificate x509Certificate : listC) {
            Iterator it = arrayList.iterator();
            if (it.hasNext()) {
                if (((b) it.next()) == null) {
                    throw null;
                }
                throw null;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Certificate pinning failure!");
        sb.append("\n  Peer certificate chain:");
        for (X509Certificate x509Certificate2 : listC) {
            sb.append("\n    ");
            sb.append(f1371d.a(x509Certificate2));
            sb.append(": ");
            Principal subjectDN = x509Certificate2.getSubjectDN();
            c.j.b.d.c(subjectDN, "element.subjectDN");
            sb.append(subjectDN.getName());
        }
        sb.append("\n  Pinned certificates for ");
        sb.append(str);
        sb.append(":");
        for (b bVar : arrayList) {
            sb.append("\n    ");
            sb.append(bVar);
        }
        String string = sb.toString();
        c.j.b.d.c(string, "StringBuilder().apply(builderAction).toString()");
        throw new SSLPeerUnverifiedException(string);
    }

    public final h b(d.n0.m.c cVar) {
        c.j.b.d.d(cVar, "certificateChainCleaner");
        return c.j.b.d.a(this.f1373b, cVar) ? this : new h(this.f1372a, cVar);
    }

    public boolean equals(Object obj) {
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (c.j.b.d.a(hVar.f1372a, this.f1372a) && c.j.b.d.a(hVar.f1373b, this.f1373b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (this.f1372a.hashCode() + 1517) * 41;
        d.n0.m.c cVar = this.f1373b;
        return iHashCode + (cVar != null ? cVar.hashCode() : 0);
    }
}
