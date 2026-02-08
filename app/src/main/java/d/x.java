package d;

import a.b.k.h;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;

/* loaded from: classes.dex */
public final class x {

    /* renamed from: a */
    public final c.a f1730a;

    /* renamed from: b */
    public final k0 f1731b;

    /* renamed from: c */
    public final k f1732c;

    /* renamed from: d */
    public final List<Certificate> f1733d;

    public static final class a extends c.j.b.e implements c.j.a.a<List<? extends Certificate>> {

        /* renamed from: b */
        public final /* synthetic */ c.j.a.a f1734b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(c.j.a.a aVar) {
            super(0);
            this.f1734b = aVar;
        }

        @Override // c.j.a.a
        public List<? extends Certificate> c() {
            try {
                return (List) this.f1734b.c();
            } catch (SSLPeerUnverifiedException unused) {
                return c.g.h.f1272b;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public x(k0 k0Var, k kVar, List<? extends Certificate> list, c.j.a.a<? extends List<? extends Certificate>> aVar) {
        c.j.b.d.d(k0Var, "tlsVersion");
        c.j.b.d.d(kVar, "cipherSuite");
        c.j.b.d.d(list, "localCertificates");
        c.j.b.d.d(aVar, "peerCertificatesFn");
        this.f1731b = k0Var;
        this.f1732c = kVar;
        this.f1733d = list;
        a aVar2 = new a(aVar);
        c.j.b.d.d(aVar2, "initializer");
        this.f1730a = new c.c(aVar2, null, 2);
    }

    public static final x a(SSLSession sSLSession) throws IOException {
        List listN;
        c.j.b.d.d(sSLSession, "$this$handshake");
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite == null) {
            throw new IllegalStateException("cipherSuite == null".toString());
        }
        int iHashCode = cipherSuite.hashCode();
        if (iHashCode == 1019404634 ? cipherSuite.equals("TLS_NULL_WITH_NULL_NULL") : iHashCode == 1208658923 && cipherSuite.equals("SSL_NULL_WITH_NULL_NULL")) {
            throw new IOException(b.a.a.a.a.b("cipherSuite == ", cipherSuite));
        }
        k kVarB = k.t.b(cipherSuite);
        String protocol = sSLSession.getProtocol();
        if (protocol == null) {
            throw new IllegalStateException("tlsVersion == null".toString());
        }
        if (c.j.b.d.a("NONE", protocol)) {
            throw new IOException("tlsVersion == NONE");
        }
        k0 k0VarA = k0.i.a(protocol);
        try {
            Certificate[] peerCertificates = sSLSession.getPeerCertificates();
            listN = peerCertificates != null ? d.n0.c.n((Certificate[]) Arrays.copyOf(peerCertificates, peerCertificates.length)) : c.g.h.f1272b;
        } catch (SSLPeerUnverifiedException unused) {
            listN = c.g.h.f1272b;
        }
        Certificate[] localCertificates = sSLSession.getLocalCertificates();
        return new x(k0VarA, kVarB, localCertificates != null ? d.n0.c.n((Certificate[]) Arrays.copyOf(localCertificates, localCertificates.length)) : c.g.h.f1272b, new w(listN));
    }

    public final String b(Certificate certificate) {
        if (certificate instanceof X509Certificate) {
            return ((X509Certificate) certificate).getSubjectDN().toString();
        }
        String type = certificate.getType();
        c.j.b.d.c(type, "type");
        return type;
    }

    public final List<Certificate> c() {
        return (List) this.f1730a.getValue();
    }

    public boolean equals(Object obj) {
        if (obj instanceof x) {
            x xVar = (x) obj;
            if (xVar.f1731b == this.f1731b && c.j.b.d.a(xVar.f1732c, this.f1732c) && c.j.b.d.a(xVar.c(), c()) && c.j.b.d.a(xVar.f1733d, this.f1733d)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.f1733d.hashCode() + ((c().hashCode() + ((this.f1732c.hashCode() + ((this.f1731b.hashCode() + 527) * 31)) * 31)) * 31);
    }

    public String toString() {
        List<Certificate> listC = c();
        ArrayList arrayList = new ArrayList(h.i.r(listC, 10));
        Iterator<T> it = listC.iterator();
        while (it.hasNext()) {
            arrayList.add(b((Certificate) it.next()));
        }
        String string = arrayList.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("Handshake{");
        sb.append("tlsVersion=");
        sb.append(this.f1731b);
        sb.append(' ');
        sb.append("cipherSuite=");
        sb.append(this.f1732c);
        sb.append(' ');
        sb.append("peerCertificates=");
        sb.append(string);
        sb.append(' ');
        sb.append("localCertificates=");
        List<Certificate> list = this.f1733d;
        ArrayList arrayList2 = new ArrayList(h.i.r(list, 10));
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList2.add(b((Certificate) it2.next()));
        }
        sb.append(arrayList2);
        sb.append('}');
        return sb.toString();
    }
}
