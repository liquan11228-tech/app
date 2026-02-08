package d.n0.g;

import a.b.k.h;
import d.c0;
import d.d0;
import d.e0;
import d.g0;
import d.j0;
import d.n0.i.b;
import d.n0.j.f;
import d.n0.j.o;
import d.n0.j.t;
import d.n0.k.h;
import d.u;
import d.x;
import d.z;
import e.p;
import java.io.IOException;
import java.lang.ref.Reference;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.security.Principal;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes.dex */
public final class j extends f.c implements d.l {

    /* renamed from: b */
    public Socket f1474b;

    /* renamed from: c */
    public Socket f1475c;

    /* renamed from: d */
    public x f1476d;

    /* renamed from: e */
    public d0 f1477e;
    public d.n0.j.f f;
    public e.g g;
    public e.f h;
    public boolean i;
    public boolean j;
    public int k;
    public int l;
    public int m;
    public int n;
    public final List<Reference<e>> o;
    public long p;
    public final j0 q;

    public j(k kVar, j0 j0Var) {
        c.j.b.d.d(kVar, "connectionPool");
        c.j.b.d.d(j0Var, "route");
        this.q = j0Var;
        this.n = 1;
        this.o = new ArrayList();
        this.p = Long.MAX_VALUE;
    }

    @Override // d.n0.j.f.c
    public synchronized void a(d.n0.j.f fVar, t tVar) {
        c.j.b.d.d(fVar, "connection");
        c.j.b.d.d(tVar, "settings");
        this.n = (tVar.f1621a & 16) != 0 ? tVar.f1622b[4] : Integer.MAX_VALUE;
    }

    @Override // d.n0.j.f.c
    public void b(o oVar) {
        c.j.b.d.d(oVar, "stream");
        oVar.c(d.n0.j.b.REFUSED_STREAM, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:149:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x015d A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(int r17, int r18, int r19, int r20, boolean r21, d.f r22, d.u r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 375
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: d.n0.g.j.c(int, int, int, int, boolean, d.f, d.u):void");
    }

    public final void d(c0 c0Var, j0 j0Var, IOException iOException) {
        c.j.b.d.d(c0Var, "client");
        c.j.b.d.d(j0Var, "failedRoute");
        c.j.b.d.d(iOException, "failure");
        if (j0Var.f1387b.type() != Proxy.Type.DIRECT) {
            d.a aVar = j0Var.f1386a;
            aVar.k.connectFailed(aVar.f1321a.g(), j0Var.f1387b.address(), iOException);
        }
        l lVar = c0Var.E;
        synchronized (lVar) {
            c.j.b.d.d(j0Var, "failedRoute");
            lVar.f1484a.add(j0Var);
        }
    }

    public final void e(int i, int i2, d.f fVar, u uVar) throws IOException {
        Socket socket;
        int i3;
        j0 j0Var = this.q;
        Proxy proxy = j0Var.f1387b;
        d.a aVar = j0Var.f1386a;
        Proxy.Type type = proxy.type();
        if (type != null && ((i3 = f.f1468a[type.ordinal()]) == 1 || i3 == 2)) {
            socket = aVar.f1325e.createSocket();
            c.j.b.d.b(socket);
        } else {
            socket = new Socket(proxy);
        }
        this.f1474b = socket;
        InetSocketAddress inetSocketAddress = this.q.f1388c;
        if (uVar == null) {
            throw null;
        }
        c.j.b.d.d(fVar, "call");
        c.j.b.d.d(inetSocketAddress, "inetSocketAddress");
        c.j.b.d.d(proxy, "proxy");
        socket.setSoTimeout(i2);
        try {
            h.a aVar2 = d.n0.k.h.f1646c;
            d.n0.k.h.f1644a.e(socket, this.q.f1388c, i);
            try {
                this.g = h.i.h(p.d(socket));
                this.h = h.i.g(p.b(socket));
            } catch (NullPointerException e2) {
                if (c.j.b.d.a(e2.getMessage(), "throw with null exception")) {
                    throw new IOException(e2);
                }
            }
        } catch (ConnectException e3) {
            StringBuilder sbE = b.a.a.a.a.e("Failed to connect to ");
            sbE.append(this.q.f1388c);
            ConnectException connectException = new ConnectException(sbE.toString());
            connectException.initCause(e3);
            throw connectException;
        }
    }

    public final void f(int i, int i2, int i3, d.f fVar, u uVar) throws IOException {
        int i4 = i2;
        e0.a aVar = new e0.a();
        aVar.f(this.q.f1386a.f1321a);
        c0 c0Var = null;
        aVar.c("CONNECT", null);
        boolean z = true;
        aVar.b("Host", d.n0.c.C(this.q.f1386a.f1321a, true));
        aVar.b("Proxy-Connection", "Keep-Alive");
        aVar.b("User-Agent", "okhttp/4.9.0");
        e0 e0VarA = aVar.a();
        g0.a aVar2 = new g0.a();
        aVar2.g(e0VarA);
        aVar2.f(d0.HTTP_1_1);
        aVar2.f1367c = 407;
        aVar2.e("Preemptive Authenticate");
        aVar2.g = d.n0.c.f1413c;
        aVar2.k = -1L;
        aVar2.l = -1L;
        c.j.b.d.d("Proxy-Authenticate", "name");
        c.j.b.d.d("OkHttp-Preemptive", "value");
        aVar2.f.d("Proxy-Authenticate", "OkHttp-Preemptive");
        g0 g0VarA = aVar2.a();
        j0 j0Var = this.q;
        e0 e0VarA2 = j0Var.f1386a.i.a(j0Var, g0VarA);
        if (e0VarA2 != null) {
            e0VarA = e0VarA2;
        }
        z zVar = e0VarA.f1351b;
        int i5 = 0;
        while (i5 < 21) {
            e(i, i4, fVar, uVar);
            String str = "CONNECT " + d.n0.c.C(zVar, z) + " HTTP/1.1";
            while (true) {
                e.g gVar = this.g;
                c.j.b.d.b(gVar);
                e.f fVar2 = this.h;
                c.j.b.d.b(fVar2);
                d.n0.i.b bVar = new d.n0.i.b(c0Var, this, gVar, fVar2);
                gVar.b().g(i4, TimeUnit.MILLISECONDS);
                fVar2.b().g(i3, TimeUnit.MILLISECONDS);
                bVar.k(e0VarA.f1353d, str);
                bVar.g.flush();
                g0.a aVarG = bVar.g(false);
                c.j.b.d.b(aVarG);
                aVarG.g(e0VarA);
                g0 g0VarA2 = aVarG.a();
                c.j.b.d.d(g0VarA2, "response");
                long jM = d.n0.c.m(g0VarA2);
                if (jM != -1) {
                    e.z zVarJ = bVar.j(jM);
                    d.n0.c.z(zVarJ, Integer.MAX_VALUE, TimeUnit.MILLISECONDS);
                    ((b.d) zVarJ).close();
                }
                int i6 = g0VarA2.f1364e;
                if (i6 != 200) {
                    if (i6 != 407) {
                        StringBuilder sbE = b.a.a.a.a.e("Unexpected response code for CONNECT: ");
                        sbE.append(g0VarA2.f1364e);
                        throw new IOException(sbE.toString());
                    }
                    j0 j0Var2 = this.q;
                    e0VarA = j0Var2.f1386a.i.a(j0Var2, g0VarA2);
                    if (e0VarA == null) {
                        throw new IOException("Failed to authenticate with proxy");
                    }
                    if (c.m.e.e("close", g0.y(g0VarA2, "Connection", null, 2), true)) {
                        z = true;
                        break;
                    } else {
                        c0Var = null;
                        i4 = i2;
                    }
                } else {
                    if (!gVar.a().q() || !fVar2.a().q()) {
                        throw new IOException("TLS tunnel buffered too many bytes!");
                    }
                    e0VarA = null;
                    z = true;
                }
            }
            if (e0VarA == null) {
                return;
            }
            Socket socket = this.f1474b;
            if (socket != null) {
                d.n0.c.f(socket);
            }
            c0Var = null;
            this.f1474b = null;
            this.h = null;
            this.g = null;
            j0 j0Var3 = this.q;
            InetSocketAddress inetSocketAddress = j0Var3.f1388c;
            Proxy proxy = j0Var3.f1387b;
            c.j.b.d.d(fVar, "call");
            c.j.b.d.d(inetSocketAddress, "inetSocketAddress");
            c.j.b.d.d(proxy, "proxy");
            i5++;
            i4 = i2;
        }
    }

    public final void g(b bVar, int i, d.f fVar, u uVar) throws Throwable {
        d0 d0Var = d0.H2_PRIOR_KNOWLEDGE;
        d0 d0VarA = d0.HTTP_1_1;
        d.a aVar = this.q.f1386a;
        if (aVar.f == null) {
            if (!aVar.f1322b.contains(d0Var)) {
                this.f1475c = this.f1474b;
                this.f1477e = d0VarA;
                return;
            } else {
                this.f1475c = this.f1474b;
                this.f1477e = d0Var;
                m(i);
                return;
            }
        }
        SSLSocket sSLSocket = null;
        String strF = null;
        c.j.b.d.d(fVar, "call");
        d.a aVar2 = this.q.f1386a;
        SSLSocketFactory sSLSocketFactory = aVar2.f;
        try {
            c.j.b.d.b(sSLSocketFactory);
            Socket socketCreateSocket = sSLSocketFactory.createSocket(this.f1474b, aVar2.f1321a.f1742e, aVar2.f1321a.f, true);
            if (socketCreateSocket == null) {
                throw new NullPointerException("null cannot be cast to non-null type javax.net.ssl.SSLSocket");
            }
            SSLSocket sSLSocket2 = (SSLSocket) socketCreateSocket;
            try {
                d.n nVarA = bVar.a(sSLSocket2);
                if (nVarA.f1401b) {
                    h.a aVar3 = d.n0.k.h.f1646c;
                    d.n0.k.h.f1644a.d(sSLSocket2, aVar2.f1321a.f1742e, aVar2.f1322b);
                }
                sSLSocket2.startHandshake();
                SSLSession session = sSLSocket2.getSession();
                c.j.b.d.c(session, "sslSocketSession");
                x xVarA = x.a(session);
                HostnameVerifier hostnameVerifier = aVar2.g;
                c.j.b.d.b(hostnameVerifier);
                if (hostnameVerifier.verify(aVar2.f1321a.f1742e, session)) {
                    d.h hVar = aVar2.h;
                    c.j.b.d.b(hVar);
                    this.f1476d = new x(xVarA.f1731b, xVarA.f1732c, xVarA.f1733d, new g(hVar, xVarA, aVar2));
                    hVar.a(aVar2.f1321a.f1742e, new h(this));
                    if (nVarA.f1401b) {
                        h.a aVar4 = d.n0.k.h.f1646c;
                        strF = d.n0.k.h.f1644a.f(sSLSocket2);
                    }
                    this.f1475c = sSLSocket2;
                    this.g = h.i.h(p.d(sSLSocket2));
                    this.h = h.i.g(p.b(sSLSocket2));
                    if (strF != null) {
                        d0VarA = d0.j.a(strF);
                    }
                    this.f1477e = d0VarA;
                    h.a aVar5 = d.n0.k.h.f1646c;
                    d.n0.k.h.f1644a.a(sSLSocket2);
                    c.j.b.d.d(fVar, "call");
                    if (this.f1477e == d0.HTTP_2) {
                        m(i);
                        return;
                    }
                    return;
                }
                List<Certificate> listC = xVarA.c();
                if (!(!listC.isEmpty())) {
                    throw new SSLPeerUnverifiedException("Hostname " + aVar2.f1321a.f1742e + " not verified (no certificates)");
                }
                Certificate certificate = listC.get(0);
                if (certificate == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.security.cert.X509Certificate");
                }
                X509Certificate x509Certificate = (X509Certificate) certificate;
                StringBuilder sb = new StringBuilder();
                sb.append("\n              |Hostname ");
                sb.append(aVar2.f1321a.f1742e);
                sb.append(" not verified:\n              |    certificate: ");
                sb.append(d.h.f1371d.a(x509Certificate));
                sb.append("\n              |    DN: ");
                Principal subjectDN = x509Certificate.getSubjectDN();
                c.j.b.d.c(subjectDN, "cert.subjectDN");
                sb.append(subjectDN.getName());
                sb.append("\n              |    subjectAltNames: ");
                d.n0.m.d dVar = d.n0.m.d.f1669a;
                c.j.b.d.d(x509Certificate, "certificate");
                List<String> listA = dVar.a(x509Certificate, 7);
                List<String> listA2 = dVar.a(x509Certificate, 2);
                c.j.b.d.d(listA, "$this$plus");
                c.j.b.d.d(listA2, "elements");
                ArrayList arrayList = new ArrayList(listA2.size() + listA.size());
                arrayList.addAll(listA);
                arrayList.addAll(listA2);
                sb.append(arrayList);
                sb.append("\n              ");
                throw new SSLPeerUnverifiedException(c.m.e.D(sb.toString(), null, 1));
            } catch (Throwable th) {
                th = th;
                sSLSocket = sSLSocket2;
                if (sSLSocket != null) {
                    h.a aVar6 = d.n0.k.h.f1646c;
                    d.n0.k.h.f1644a.a(sSLSocket);
                }
                if (sSLSocket != null) {
                    d.n0.c.f(sSLSocket);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:145:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x013c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:171:0x013d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean h(d.a r9, java.util.List<d.j0> r10) {
        /*
            Method dump skipped, instructions count: 355
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: d.n0.g.j.h(d.a, java.util.List):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:98:0x0077, code lost:
    
        if (r0 >= r2.s) goto L99;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean i(boolean r10) throws java.net.SocketException {
        /*
            r9 = this;
            boolean r0 = d.n0.c.g
            if (r0 == 0) goto L33
            boolean r0 = java.lang.Thread.holdsLock(r9)
            if (r0 != 0) goto Lb
            goto L33
        Lb:
            java.lang.AssertionError r10 = new java.lang.AssertionError
            java.lang.String r0 = "Thread "
            java.lang.StringBuilder r0 = b.a.a.a.a.e(r0)
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            java.lang.String r2 = "Thread.currentThread()"
            c.j.b.d.c(r1, r2)
            java.lang.String r1 = r1.getName()
            r0.append(r1)
            java.lang.String r1 = " MUST NOT hold lock on "
            r0.append(r1)
            r0.append(r9)
            java.lang.String r0 = r0.toString()
            r10.<init>(r0)
            throw r10
        L33:
            long r0 = java.lang.System.nanoTime()
            java.net.Socket r2 = r9.f1474b
            c.j.b.d.b(r2)
            java.net.Socket r3 = r9.f1475c
            c.j.b.d.b(r3)
            e.g r4 = r9.g
            c.j.b.d.b(r4)
            boolean r2 = r2.isClosed()
            r5 = 0
            if (r2 != 0) goto Lb7
            boolean r2 = r3.isClosed()
            if (r2 != 0) goto Lb7
            boolean r2 = r3.isInputShutdown()
            if (r2 != 0) goto Lb7
            boolean r2 = r3.isOutputShutdown()
            if (r2 == 0) goto L60
            goto Lb7
        L60:
            d.n0.j.f r2 = r9.f
            r6 = 1
            if (r2 == 0) goto L81
            monitor-enter(r2)
            boolean r10 = r2.h     // Catch: java.lang.Throwable -> L7e
            if (r10 == 0) goto L6b
            goto L79
        L6b:
            long r3 = r2.q     // Catch: java.lang.Throwable -> L7e
            long r7 = r2.p     // Catch: java.lang.Throwable -> L7e
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 >= 0) goto L7b
            long r3 = r2.s     // Catch: java.lang.Throwable -> L7e
            int r10 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r10 < 0) goto L7b
        L79:
            monitor-exit(r2)
            goto L7d
        L7b:
            monitor-exit(r2)
            r5 = r6
        L7d:
            return r5
        L7e:
            r10 = move-exception
            monitor-exit(r2)
            throw r10
        L81:
            monitor-enter(r9)
            long r7 = r9.p     // Catch: java.lang.Throwable -> Lb4
            long r0 = r0 - r7
            monitor-exit(r9)
            r7 = 10000000000(0x2540be400, double:4.9406564584E-314)
            int r0 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r0 < 0) goto Lb3
            if (r10 == 0) goto Lb3
            java.lang.String r10 = "$this$isHealthy"
            c.j.b.d.d(r3, r10)
            java.lang.String r10 = "source"
            c.j.b.d.d(r4, r10)
            int r10 = r3.getSoTimeout()     // Catch: java.net.SocketTimeoutException -> Lb1 java.io.IOException -> Lb2
            r3.setSoTimeout(r6)     // Catch: java.lang.Throwable -> Lac
            boolean r0 = r4.q()     // Catch: java.lang.Throwable -> Lac
            r0 = r0 ^ r6
            r3.setSoTimeout(r10)     // Catch: java.net.SocketTimeoutException -> Lb1 java.io.IOException -> Lb2
            r5 = r0
            goto Lb2
        Lac:
            r0 = move-exception
            r3.setSoTimeout(r10)     // Catch: java.net.SocketTimeoutException -> Lb1 java.io.IOException -> Lb2
            throw r0     // Catch: java.net.SocketTimeoutException -> Lb1 java.io.IOException -> Lb2
        Lb1:
            r5 = r6
        Lb2:
            return r5
        Lb3:
            return r6
        Lb4:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        Lb7:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: d.n0.g.j.i(boolean):boolean");
    }

    public final boolean j() {
        return this.f != null;
    }

    public final d.n0.h.d k(c0 c0Var, d.n0.h.g gVar) throws SocketException {
        c.j.b.d.d(c0Var, "client");
        c.j.b.d.d(gVar, "chain");
        Socket socket = this.f1475c;
        c.j.b.d.b(socket);
        e.g gVar2 = this.g;
        c.j.b.d.b(gVar2);
        e.f fVar = this.h;
        c.j.b.d.b(fVar);
        d.n0.j.f fVar2 = this.f;
        if (fVar2 != null) {
            return new d.n0.j.m(c0Var, this, gVar, fVar2);
        }
        socket.setSoTimeout(gVar.h);
        gVar2.b().g(gVar.h, TimeUnit.MILLISECONDS);
        fVar.b().g(gVar.i, TimeUnit.MILLISECONDS);
        return new d.n0.i.b(c0Var, this, gVar2, fVar);
    }

    public final synchronized void l() {
        this.i = true;
    }

    public final void m(int i) throws SocketException {
        StringBuilder sbE;
        Socket socket = this.f1475c;
        c.j.b.d.b(socket);
        e.g gVar = this.g;
        c.j.b.d.b(gVar);
        e.f fVar = this.h;
        c.j.b.d.b(fVar);
        socket.setSoTimeout(0);
        f.b bVar = new f.b(true, d.n0.f.d.h);
        String str = this.q.f1386a.f1321a.f1742e;
        c.j.b.d.d(socket, "socket");
        c.j.b.d.d(str, "peerName");
        c.j.b.d.d(gVar, "source");
        c.j.b.d.d(fVar, "sink");
        bVar.f1564a = socket;
        if (bVar.h) {
            sbE = new StringBuilder();
            sbE.append(d.n0.c.h);
            sbE.append(' ');
        } else {
            sbE = b.a.a.a.a.e("MockWebServer ");
        }
        sbE.append(str);
        bVar.f1565b = sbE.toString();
        bVar.f1566c = gVar;
        bVar.f1567d = fVar;
        c.j.b.d.d(this, "listener");
        bVar.f1568e = this;
        bVar.g = i;
        d.n0.j.f fVar2 = new d.n0.j.f(bVar);
        this.f = fVar2;
        d.n0.j.f fVar3 = d.n0.j.f.E;
        t tVar = d.n0.j.f.D;
        this.n = (tVar.f1621a & 16) != 0 ? tVar.f1622b[4] : Integer.MAX_VALUE;
        d.n0.f.d dVar = d.n0.f.d.h;
        c.j.b.d.d(dVar, "taskRunner");
        d.n0.j.p pVar = fVar2.A;
        synchronized (pVar) {
            if (pVar.f1611d) {
                throw new IOException("closed");
            }
            if (pVar.g) {
                if (d.n0.j.p.h.isLoggable(Level.FINE)) {
                    d.n0.j.p.h.fine(d.n0.c.k(">> CONNECTION " + d.n0.j.e.f1554a.d(), new Object[0]));
                }
                pVar.f.f(d.n0.j.e.f1554a);
                pVar.f.flush();
            }
        }
        d.n0.j.p pVar2 = fVar2.A;
        t tVar2 = fVar2.t;
        synchronized (pVar2) {
            c.j.b.d.d(tVar2, "settings");
            if (pVar2.f1611d) {
                throw new IOException("closed");
            }
            pVar2.A(0, Integer.bitCount(tVar2.f1621a) * 6, 4, 0);
            int i2 = 0;
            while (i2 < 10) {
                if (((1 << i2) & tVar2.f1621a) != 0) {
                    pVar2.f.u(i2 != 4 ? i2 != 7 ? i2 : 4 : 3);
                    pVar2.f.d(tVar2.f1622b[i2]);
                }
                i2++;
            }
            pVar2.f.flush();
        }
        if (fVar2.t.a() != 65535) {
            fVar2.A.F(0, r1 - 65535);
        }
        d.n0.f.c cVarF = dVar.f();
        String str2 = fVar2.f1562e;
        cVarF.c(new d.n0.f.b(fVar2.B, str2, true, str2, true), 0L);
    }

    public String toString() {
        Object obj;
        StringBuilder sbE = b.a.a.a.a.e("Connection{");
        sbE.append(this.q.f1386a.f1321a.f1742e);
        sbE.append(':');
        sbE.append(this.q.f1386a.f1321a.f);
        sbE.append(',');
        sbE.append(" proxy=");
        sbE.append(this.q.f1387b);
        sbE.append(" hostAddress=");
        sbE.append(this.q.f1388c);
        sbE.append(" cipherSuite=");
        x xVar = this.f1476d;
        if (xVar == null || (obj = xVar.f1732c) == null) {
            obj = "none";
        }
        sbE.append(obj);
        sbE.append(" protocol=");
        sbE.append(this.f1477e);
        sbE.append('}');
        return sbE.toString();
    }
}
