package d.n0.g;

import d.k;
import d.n;
import java.net.UnknownServiceException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public int f1440a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1441b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1442c;

    /* renamed from: d, reason: collision with root package name */
    public final List<d.n> f1443d;

    public b(List<d.n> list) {
        c.j.b.d.d(list, "connectionSpecs");
        this.f1443d = list;
    }

    public final d.n a(SSLSocket sSLSocket) throws UnknownServiceException, CloneNotSupportedException {
        d.n nVar;
        boolean z;
        String[] enabledCipherSuites;
        String[] enabledProtocols;
        c.j.b.d.d(sSLSocket, "sslSocket");
        int i = this.f1440a;
        int size = this.f1443d.size();
        while (true) {
            if (i >= size) {
                nVar = null;
                break;
            }
            nVar = this.f1443d.get(i);
            if (nVar.b(sSLSocket)) {
                this.f1440a = i + 1;
                break;
            }
            i++;
        }
        if (nVar == null) {
            StringBuilder sbE = b.a.a.a.a.e("Unable to find acceptable protocols. isFallback=");
            sbE.append(this.f1442c);
            sbE.append(',');
            sbE.append(" modes=");
            sbE.append(this.f1443d);
            sbE.append(',');
            sbE.append(" supported protocols=");
            String[] enabledProtocols2 = sSLSocket.getEnabledProtocols();
            c.j.b.d.b(enabledProtocols2);
            String string = Arrays.toString(enabledProtocols2);
            c.j.b.d.c(string, "java.util.Arrays.toString(this)");
            sbE.append(string);
            throw new UnknownServiceException(sbE.toString());
        }
        int i2 = this.f1440a;
        int size2 = this.f1443d.size();
        while (true) {
            if (i2 >= size2) {
                z = false;
                break;
            }
            if (this.f1443d.get(i2).b(sSLSocket)) {
                z = true;
                break;
            }
            i2++;
        }
        this.f1441b = z;
        boolean z2 = this.f1442c;
        c.j.b.d.d(sSLSocket, "sslSocket");
        if (nVar.f1402c != null) {
            String[] enabledCipherSuites2 = sSLSocket.getEnabledCipherSuites();
            c.j.b.d.c(enabledCipherSuites2, "sslSocket.enabledCipherSuites");
            String[] strArr = nVar.f1402c;
            k.b bVar = d.k.t;
            enabledCipherSuites = d.n0.c.u(enabledCipherSuites2, strArr, d.k.f1389b);
        } else {
            enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
        }
        if (nVar.f1403d != null) {
            String[] enabledProtocols3 = sSLSocket.getEnabledProtocols();
            c.j.b.d.c(enabledProtocols3, "sslSocket.enabledProtocols");
            enabledProtocols = d.n0.c.u(enabledProtocols3, nVar.f1403d, c.h.a.f1275b);
        } else {
            enabledProtocols = sSLSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        c.j.b.d.c(supportedCipherSuites, "supportedCipherSuites");
        k.b bVar2 = d.k.t;
        int iO = d.n0.c.o(supportedCipherSuites, "TLS_FALLBACK_SCSV", d.k.f1389b);
        if (z2 && iO != -1) {
            c.j.b.d.c(enabledCipherSuites, "cipherSuitesIntersection");
            String str = supportedCipherSuites[iO];
            c.j.b.d.c(str, "supportedCipherSuites[indexOfFallbackScsv]");
            c.j.b.d.d(enabledCipherSuites, "$this$concat");
            c.j.b.d.d(str, "value");
            Object[] objArrCopyOf = Arrays.copyOf(enabledCipherSuites, enabledCipherSuites.length + 1);
            c.j.b.d.c(objArrCopyOf, "java.util.Arrays.copyOf(this, newSize)");
            enabledCipherSuites = (String[]) objArrCopyOf;
            c.j.b.d.d(enabledCipherSuites, "$this$lastIndex");
            enabledCipherSuites[enabledCipherSuites.length - 1] = str;
        }
        n.a aVar = new n.a(nVar);
        c.j.b.d.c(enabledCipherSuites, "cipherSuitesIntersection");
        aVar.b((String[]) Arrays.copyOf(enabledCipherSuites, enabledCipherSuites.length));
        c.j.b.d.c(enabledProtocols, "tlsVersionsIntersection");
        aVar.e((String[]) Arrays.copyOf(enabledProtocols, enabledProtocols.length));
        d.n nVarA = aVar.a();
        if (nVarA.c() != null) {
            sSLSocket.setEnabledProtocols(nVarA.f1403d);
        }
        if (nVarA.a() != null) {
            sSLSocket.setEnabledCipherSuites(nVarA.f1402c);
        }
        return nVar;
    }
}
