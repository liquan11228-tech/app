package d.n0.h;

import d.a0;
import d.c0;
import d.d0;
import d.e0;
import d.f0;
import d.g0;
import d.i0;
import d.j0;
import d.n0.g.k;
import d.n0.g.m;
import d.n0.g.n;
import d.u;
import d.x;
import d.y;
import d.z;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import java.util.ArrayList;
import java.util.regex.Pattern;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes.dex */
public final class i implements a0 {

    /* renamed from: a, reason: collision with root package name */
    public final c0 f1509a;

    public i(c0 c0Var) {
        c.j.b.d.d(c0Var, "client");
        this.f1509a = c0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // d.a0
    public g0 a(a0.a aVar) throws Throwable {
        c.g.h hVar;
        g0 g0Var;
        int i;
        d.n0.g.e eVar;
        g gVar;
        d.n0.g.e eVar2;
        g0 g0Var2;
        i iVar;
        boolean z;
        i iVar2;
        d.n0.g.e eVar3;
        e0 e0Var;
        d0 d0Var;
        int i2;
        String str;
        x xVar;
        y.a aVarC;
        i0 i0Var;
        g0 g0Var3;
        g0 g0Var4;
        long j;
        g gVar2;
        SSLSocketFactory sSLSocketFactory;
        HostnameVerifier hostnameVerifier;
        d.h hVar2;
        i iVar3 = this;
        c.j.b.d.d(aVar, "chain");
        g gVar3 = (g) aVar;
        e0 e0Var2 = gVar3.f;
        d.n0.g.e eVar4 = gVar3.f1502b;
        boolean z2 = true;
        c.g.h hVar3 = c.g.h.f1272b;
        g0 g0Var5 = null;
        int i3 = 0;
        e0 e0VarB = e0Var2;
        boolean z3 = true;
        while (eVar4 != null) {
            c.j.b.d.d(e0VarB, "request");
            if (!(eVar4.j == null ? z2 : false)) {
                throw new IllegalStateException("Check failed.".toString());
            }
            synchronized (eVar4) {
                try {
                } catch (Throwable th) {
                    th = th;
                    iVar3 = eVar4;
                }
                try {
                    if (!(eVar4.l ^ z2)) {
                        throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()".toString());
                    }
                    if (!(eVar4.k ^ z2)) {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                } catch (Throwable th2) {
                    th = th2;
                    throw th;
                }
            }
            if (z3) {
                k kVar = eVar4.f1460b;
                z zVar = e0VarB.f1351b;
                if (zVar.f1738a) {
                    c0 c0Var = eVar4.q;
                    SSLSocketFactory sSLSocketFactory2 = c0Var.r;
                    if (sSLSocketFactory2 == null) {
                        throw new IllegalStateException("CLEARTEXT-only client");
                    }
                    HostnameVerifier hostnameVerifier2 = c0Var.v;
                    hVar2 = c0Var.w;
                    sSLSocketFactory = sSLSocketFactory2;
                    hostnameVerifier = hostnameVerifier2;
                } else {
                    sSLSocketFactory = null;
                    hostnameVerifier = null;
                    hVar2 = null;
                }
                String str2 = zVar.f1742e;
                int i4 = zVar.f;
                c0 c0Var2 = eVar4.q;
                hVar = hVar3;
                i = i3;
                g0Var = g0Var5;
                d.a aVar2 = new d.a(str2, i4, c0Var2.m, c0Var2.q, sSLSocketFactory, hostnameVerifier, hVar2, c0Var2.p, c0Var2.n, c0Var2.u, c0Var2.t, c0Var2.o);
                u uVar = eVar4.f1461c;
                eVar4.g = new d.n0.g.d(kVar, aVar2, eVar4, uVar);
                eVar = uVar;
            } else {
                hVar = hVar3;
                g0Var = g0Var5;
                i = i3;
                eVar = iVar3;
            }
            try {
                if (eVar4.n) {
                    throw new IOException("Canceled");
                }
                try {
                    g0 g0VarB = gVar3.b(e0VarB);
                    if (g0Var != null) {
                        try {
                            c.j.b.d.d(g0VarB, "response");
                            e0Var = g0VarB.f1361b;
                            d0Var = g0VarB.f1362c;
                            i2 = g0VarB.f1364e;
                            str = g0VarB.f1363d;
                            xVar = g0VarB.f;
                            aVarC = g0VarB.g.c();
                            i0Var = g0VarB.h;
                            g0Var3 = g0VarB.i;
                            g0Var4 = g0VarB.j;
                            j = g0VarB.l;
                            gVar2 = gVar3;
                            eVar3 = eVar4;
                        } catch (Throwable th3) {
                            th = th3;
                            eVar3 = eVar4;
                        }
                        try {
                            long j2 = g0VarB.m;
                            d.n0.g.c cVar = g0VarB.n;
                            g0 g0Var6 = g0Var;
                            c.j.b.d.d(g0Var6, "response");
                            e0 e0Var3 = g0Var6.f1361b;
                            d0 d0Var2 = g0Var6.f1362c;
                            int i5 = g0Var6.f1364e;
                            String str3 = g0Var6.f1363d;
                            x xVar2 = g0Var6.f;
                            y.a aVarC2 = g0Var6.g.c();
                            g0 g0Var7 = g0Var6.i;
                            g0 g0Var8 = g0Var6.j;
                            g0 g0Var9 = g0Var6.k;
                            long j3 = g0Var6.l;
                            long j4 = g0Var6.m;
                            d.n0.g.c cVar2 = g0Var6.n;
                            if (!(i5 >= 0)) {
                                throw new IllegalStateException(("code < 0: " + i5).toString());
                            }
                            if (e0Var3 == null) {
                                throw new IllegalStateException("request == null".toString());
                            }
                            if (d0Var2 == null) {
                                throw new IllegalStateException("protocol == null".toString());
                            }
                            if (str3 == null) {
                                throw new IllegalStateException("message == null".toString());
                            }
                            g0 g0Var10 = new g0(e0Var3, d0Var2, str3, i5, xVar2, aVarC2.b(), null, g0Var7, g0Var8, g0Var9, j3, j4, cVar2);
                            if (!(g0Var10.h == null)) {
                                throw new IllegalArgumentException("priorResponse.body != null".toString());
                            }
                            if (!(i2 >= 0)) {
                                throw new IllegalStateException(("code < 0: " + i2).toString());
                            }
                            if (e0Var == null) {
                                throw new IllegalStateException("request == null".toString());
                            }
                            if (d0Var == null) {
                                throw new IllegalStateException("protocol == null".toString());
                            }
                            if (str == null) {
                                throw new IllegalStateException("message == null".toString());
                            }
                            g0VarB = new g0(e0Var, d0Var, str, i2, xVar, aVarC.b(), i0Var, g0Var3, g0Var4, g0Var10, j, j2, cVar);
                        } catch (Throwable th4) {
                            th = th4;
                            eVar = eVar3;
                            eVar.e(true);
                            throw th;
                        }
                    } else {
                        gVar2 = gVar3;
                        eVar3 = eVar4;
                    }
                    g0Var5 = g0VarB;
                    eVar = eVar3;
                } catch (m e2) {
                    gVar = gVar3;
                    eVar2 = eVar4;
                    c.g.h hVar4 = hVar;
                    g0Var2 = g0Var;
                    iVar = this;
                    z = false;
                    if (!iVar.c(e2.f1485b, eVar2, e0VarB, false)) {
                        IOException iOException = e2.f1486c;
                        d.n0.c.H(iOException, hVar4);
                        throw iOException;
                    }
                    IOException iOException2 = e2.f1486c;
                    c.j.b.d.d(hVar4, "$this$plus");
                    ArrayList arrayList = new ArrayList(hVar4.size() + 1);
                    arrayList.addAll(hVar4);
                    arrayList.add(iOException2);
                    eVar2.e(true);
                    hVar3 = arrayList;
                    eVar4 = eVar2;
                    iVar2 = iVar;
                    z3 = z;
                    g0Var5 = g0Var2;
                    gVar3 = gVar;
                    i3 = i;
                    z2 = true;
                    iVar3 = iVar2;
                } catch (IOException e3) {
                    gVar = gVar3;
                    eVar2 = eVar4;
                    g0Var2 = g0Var;
                    iVar = this;
                    if (!iVar.c(e3, eVar2, e0VarB, !(e3 instanceof d.n0.j.a))) {
                        d.n0.c.H(e3, hVar);
                        throw e3;
                    }
                    c.g.h hVar5 = hVar;
                    c.j.b.d.d(hVar5, "$this$plus");
                    ArrayList arrayList2 = new ArrayList(hVar5.size() + 1);
                    arrayList2.addAll(hVar5);
                    arrayList2.add(e3);
                    eVar2.e(true);
                    hVar3 = arrayList2;
                    z = false;
                    eVar4 = eVar2;
                    iVar2 = iVar;
                    z3 = z;
                    g0Var5 = g0Var2;
                    gVar3 = gVar;
                    i3 = i;
                    z2 = true;
                    iVar3 = iVar2;
                }
                try {
                    d.n0.g.c cVar3 = eVar.j;
                    try {
                        e0VarB = b(g0Var5, cVar3);
                        if (e0VarB == null) {
                            if (cVar3 != null && cVar3.f1444a) {
                                eVar.j();
                            }
                            eVar.e(false);
                            return g0Var5;
                        }
                        i0 i0Var2 = g0Var5.h;
                        if (i0Var2 != null) {
                            d.n0.c.e(i0Var2);
                        }
                        i3 = i + 1;
                        if (i3 > 20) {
                            throw new ProtocolException("Too many follow-up requests: " + i3);
                        }
                        eVar.e(true);
                        eVar4 = eVar;
                        iVar2 = this;
                        gVar3 = gVar2;
                        hVar3 = hVar;
                        z3 = true;
                        z2 = true;
                        iVar3 = iVar2;
                    } catch (Throwable th5) {
                        th = th5;
                        eVar.e(true);
                        throw th;
                    }
                } catch (Throwable th6) {
                    th = th6;
                    eVar.e(true);
                    throw th;
                }
            } catch (Throwable th7) {
                th = th7;
                eVar = eVar4;
            }
        }
        throw null;
    }

    public final e0 b(g0 g0Var, d.n0.g.c cVar) throws ProtocolException {
        String strY;
        z.a aVar;
        d.n0.g.j jVar;
        f0 f0Var = null;
        j0 j0Var = (cVar == null || (jVar = cVar.f1445b) == null) ? null : jVar.q;
        int i = g0Var.f1364e;
        String str = g0Var.f1361b.f1352c;
        if (i != 307 && i != 308) {
            if (i == 401) {
                return this.f1509a.h.a(j0Var, g0Var);
            }
            if (i == 421) {
                if (cVar == null || !(!c.j.b.d.a(cVar.f1448e.h.f1321a.f1742e, cVar.f1445b.q.f1386a.f1321a.f1742e))) {
                    return null;
                }
                d.n0.g.j jVar2 = cVar.f1445b;
                synchronized (jVar2) {
                    jVar2.j = true;
                }
                return g0Var.f1361b;
            }
            if (i == 503) {
                g0 g0Var2 = g0Var.k;
                if ((g0Var2 == null || g0Var2.f1364e != 503) && d(g0Var, Integer.MAX_VALUE) == 0) {
                    return g0Var.f1361b;
                }
                return null;
            }
            if (i == 407) {
                c.j.b.d.b(j0Var);
                if (j0Var.f1387b.type() == Proxy.Type.HTTP) {
                    return this.f1509a.p.a(j0Var, g0Var);
                }
                throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
            }
            if (i == 408) {
                if (!this.f1509a.g) {
                    return null;
                }
                g0 g0Var3 = g0Var.k;
                if ((g0Var3 == null || g0Var3.f1364e != 408) && d(g0Var, 0) <= 0) {
                    return g0Var.f1361b;
                }
                return null;
            }
            switch (i) {
                case 300:
                case 301:
                case 302:
                case 303:
                    break;
                default:
                    return null;
            }
        }
        if (!this.f1509a.i || (strY = g0.y(g0Var, "Location", null, 2)) == null) {
            return null;
        }
        z zVar = g0Var.f1361b.f1351b;
        if (zVar == null) {
            throw null;
        }
        c.j.b.d.d(strY, "link");
        c.j.b.d.d(strY, "link");
        try {
            aVar = new z.a();
            aVar.d(zVar, strY);
        } catch (IllegalArgumentException unused) {
            aVar = null;
        }
        z zVarA = aVar != null ? aVar.a() : null;
        if (zVarA == null) {
            return null;
        }
        if (!c.j.b.d.a(zVarA.f1739b, g0Var.f1361b.f1351b.f1739b) && !this.f1509a.j) {
            return null;
        }
        e0 e0Var = g0Var.f1361b;
        if (e0Var == null) {
            throw null;
        }
        e0.a aVar2 = new e0.a(e0Var);
        if (f.a(str)) {
            int i2 = g0Var.f1364e;
            c.j.b.d.d(str, "method");
            boolean z = c.j.b.d.a(str, "PROPFIND") || i2 == 308 || i2 == 307;
            c.j.b.d.d(str, "method");
            if ((true ^ c.j.b.d.a(str, "PROPFIND")) && i2 != 308 && i2 != 307) {
                str = "GET";
            } else if (z) {
                f0Var = g0Var.f1361b.f1354e;
            }
            aVar2.c(str, f0Var);
            if (!z) {
                aVar2.d("Transfer-Encoding");
                aVar2.d("Content-Length");
                aVar2.d("Content-Type");
            }
        }
        if (!d.n0.c.c(g0Var.f1361b.f1351b, zVarA)) {
            aVar2.d("Authorization");
        }
        aVar2.f(zVarA);
        return aVar2.a();
    }

    public final boolean c(IOException iOException, d.n0.g.e eVar, e0 e0Var, boolean z) {
        boolean zA;
        n nVar;
        d.n0.g.j jVar;
        if (!this.f1509a.g) {
            return false;
        }
        if (z) {
            f0 f0Var = e0Var.f1354e;
            if (iOException instanceof FileNotFoundException) {
                return false;
            }
        }
        if (!(!(iOException instanceof ProtocolException) && (!(iOException instanceof InterruptedIOException) ? ((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException) : !((iOException instanceof SocketTimeoutException) && !z)))) {
            return false;
        }
        d.n0.g.d dVar = eVar.g;
        c.j.b.d.b(dVar);
        if (dVar.f1457c == 0 && dVar.f1458d == 0 && dVar.f1459e == 0) {
            zA = false;
        } else if (dVar.f != null) {
            zA = true;
        } else {
            j0 j0Var = null;
            if (dVar.f1457c <= 1 && dVar.f1458d <= 1 && dVar.f1459e <= 0 && (jVar = dVar.i.h) != null) {
                synchronized (jVar) {
                    if (jVar.k == 0 && d.n0.c.c(jVar.q.f1386a.f1321a, dVar.h.f1321a)) {
                        j0Var = jVar.q;
                    }
                }
            }
            if (j0Var != null) {
                dVar.f = j0Var;
            } else {
                n.a aVar = dVar.f1455a;
                if ((aVar == null || !aVar.a()) && (nVar = dVar.f1456b) != null) {
                    zA = nVar.a();
                }
            }
            zA = true;
        }
        return zA;
    }

    public final int d(g0 g0Var, int i) throws NumberFormatException {
        String strY = g0.y(g0Var, "Retry-After", null, 2);
        if (strY == null) {
            return i;
        }
        c.j.b.d.d("\\d+", "pattern");
        Pattern patternCompile = Pattern.compile("\\d+");
        c.j.b.d.c(patternCompile, "Pattern.compile(pattern)");
        c.j.b.d.d(patternCompile, "nativePattern");
        c.j.b.d.d(strY, "input");
        if (!patternCompile.matcher(strY).matches()) {
            return Integer.MAX_VALUE;
        }
        Integer numValueOf = Integer.valueOf(strY);
        c.j.b.d.c(numValueOf, "Integer.valueOf(header)");
        return numValueOf.intValue();
    }
}
