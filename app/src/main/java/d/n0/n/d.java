package d.n0.n;

import a.b.k.h;
import android.content.Intent;
import android.text.TextUtils;
import b.d.a.j;
import d.d0;
import d.e0;
import d.g0;
import d.l0;
import d.m0;
import d.n0.n.h;
import e.e;
import e.h;
import java.io.Closeable;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.zip.DataFormatException;
import u3_8w.n5shm.t6lh5.CardLoadingActivity;
import u3_8w.n5shm.t6lh5.LoginActivity;
import u3_8w.n5shm.t6lh5.WebSocketService;

/* loaded from: classes.dex */
public final class d implements l0, h.a {
    public static final List<d0> z = h.i.E(d0.HTTP_1_1);

    /* renamed from: a */
    public final String f1679a;

    /* renamed from: b */
    public d.f f1680b;

    /* renamed from: c */
    public d.n0.f.a f1681c;

    /* renamed from: d */
    public h f1682d;

    /* renamed from: e */
    public i f1683e;
    public d.n0.f.c f;
    public String g;
    public c h;
    public final ArrayDeque<e.h> i;
    public final ArrayDeque<Object> j;
    public long k;
    public boolean l;
    public int m;
    public String n;
    public boolean o;
    public int p;
    public int q;
    public int r;
    public boolean s;
    public final e0 t;
    public final m0 u;
    public final Random v;
    public final long w;
    public d.n0.n.f x;
    public long y;

    public static final class a {

        /* renamed from: a */
        public final int f1684a;

        /* renamed from: b */
        public final e.h f1685b;

        /* renamed from: c */
        public final long f1686c;

        public a(int i, e.h hVar, long j) {
            this.f1684a = i;
            this.f1685b = hVar;
            this.f1686c = j;
        }
    }

    public static final class b {

        /* renamed from: a */
        public final int f1687a;

        /* renamed from: b */
        public final e.h f1688b;

        public b(int i, e.h hVar) {
            c.j.b.d.d(hVar, "data");
            this.f1687a = i;
            this.f1688b = hVar;
        }
    }

    public static abstract class c implements Closeable {

        /* renamed from: b */
        public final boolean f1689b;

        /* renamed from: c */
        public final e.g f1690c;

        /* renamed from: d */
        public final e.f f1691d;

        public c(boolean z, e.g gVar, e.f fVar) {
            c.j.b.d.d(gVar, "source");
            c.j.b.d.d(fVar, "sink");
            this.f1689b = z;
            this.f1690c = gVar;
            this.f1691d = fVar;
        }
    }

    /* renamed from: d.n0.n.d$d */
    public final class C0038d extends d.n0.f.a {
        public C0038d() {
            super(b.a.a.a.a.d(new StringBuilder(), d.this.g, " writer"), false, 2);
        }

        @Override // d.n0.f.a
        public long a() {
            try {
                return d.this.m() ? 0L : -1L;
            } catch (IOException e2) {
                d.this.i(e2, null);
                return -1L;
            }
        }
    }

    public static final class e extends d.n0.f.a {

        /* renamed from: e */
        public final /* synthetic */ long f1693e;
        public final /* synthetic */ d f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, String str2, long j, d dVar, String str3, c cVar, d.n0.n.f fVar) {
            super(str2, true);
            this.f1693e = j;
            this.f = dVar;
        }

        @Override // d.n0.f.a
        public long a() {
            i iVar;
            d dVar = this.f;
            synchronized (dVar) {
                if (!dVar.o && (iVar = dVar.f1683e) != null) {
                    int i = dVar.s ? dVar.p : -1;
                    dVar.p++;
                    dVar.s = true;
                    if (i != -1) {
                        StringBuilder sbE = b.a.a.a.a.e("sent ping but didn't receive pong within ");
                        sbE.append(dVar.w);
                        sbE.append("ms (after ");
                        sbE.append(i - 1);
                        sbE.append(" successful ping/pongs)");
                        e = new SocketTimeoutException(sbE.toString());
                    } else {
                        try {
                            e.h hVar = e.h.f1766e;
                            c.j.b.d.d(hVar, "payload");
                            iVar.y(9, hVar);
                        } catch (IOException e2) {
                            e = e2;
                        }
                    }
                    dVar.i(e, null);
                }
            }
            return this.f1693e;
        }
    }

    public static final class f extends d.n0.f.a {

        /* renamed from: e */
        public final /* synthetic */ d f1694e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str, boolean z, String str2, boolean z2, d dVar, i iVar, e.h hVar, c.j.b.h hVar2, c.j.b.f fVar, c.j.b.h hVar3, c.j.b.h hVar4, c.j.b.h hVar5, c.j.b.h hVar6) {
            super(str2, z2);
            this.f1694e = dVar;
        }

        @Override // d.n0.f.a
        public long a() {
            d.f fVar = this.f1694e.f1680b;
            c.j.b.d.b(fVar);
            fVar.cancel();
            return -1L;
        }
    }

    public d(d.n0.f.d dVar, e0 e0Var, m0 m0Var, Random random, long j, d.n0.n.f fVar, long j2) {
        c.j.b.d.d(dVar, "taskRunner");
        c.j.b.d.d(e0Var, "originalRequest");
        c.j.b.d.d(m0Var, "listener");
        c.j.b.d.d(random, "random");
        this.t = e0Var;
        this.u = m0Var;
        this.v = random;
        this.w = j;
        this.x = null;
        this.y = j2;
        this.f = dVar.f();
        this.i = new ArrayDeque<>();
        this.j = new ArrayDeque<>();
        this.m = -1;
        if (!c.j.b.d.a("GET", this.t.f1352c)) {
            StringBuilder sbE = b.a.a.a.a.e("Request must be GET: ");
            sbE.append(this.t.f1352c);
            throw new IllegalArgumentException(sbE.toString().toString());
        }
        h.a aVar = e.h.f;
        byte[] bArr = new byte[16];
        this.v.nextBytes(bArr);
        this.f1679a = h.a.c(aVar, bArr, 0, 0, 3).a();
    }

    @Override // d.l0
    public boolean a(int i, String str) {
        synchronized (this) {
            g.c(i);
            e.h hVarB = null;
            if (str != null) {
                hVarB = e.h.f.b(str);
                if (!(((long) hVarB.c()) <= 123)) {
                    throw new IllegalArgumentException(("reason.size() > 123: " + str).toString());
                }
            }
            if (!this.o && !this.l) {
                this.l = true;
                this.j.add(new a(i, hVarB, 60000L));
                l();
                return true;
            }
            return false;
        }
    }

    @Override // d.n0.n.h.a
    public void b(e.h hVar) {
        c.j.b.d.d(hVar, "bytes");
        if (((WebSocketService.a) this.u) == null) {
            throw null;
        }
        WebSocketService.i = true;
        c.j.b.d.d(this, "webSocket");
        c.j.b.d.d(hVar, "bytes");
    }

    @Override // d.n0.n.h.a
    public void c(String str) {
        Intent intent;
        HashMap map;
        j jVar;
        c.j.b.d.d(str, "text");
        WebSocketService.a aVar = (WebSocketService.a) this.u;
        if (aVar == null) {
            throw null;
        }
        WebSocketService.i = true;
        c.j.b.d.d(this, "webSocket");
        c.j.b.d.d(str, "text");
        WebSocketService webSocketService = WebSocketService.this;
        if (webSocketService == null) {
            throw null;
        }
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            Map map2 = (Map) new j().b(str, Map.class);
            String str2 = (String) map2.get("cmd");
            if ("checkDevice".equals(str2)) {
                if ("1".equals((String) map2.get("code"))) {
                    webSocketService.f1820b = true;
                } else {
                    webSocketService.f1820b = false;
                }
                String str3 = (String) map2.get("sessionId");
                if (!TextUtils.isEmpty(str3) && !TextUtils.isEmpty(WebSocketService.g)) {
                    if (str3.equals(WebSocketService.g)) {
                        WebSocketService.o = false;
                    } else {
                        WebSocketService.o = true;
                    }
                }
                if (!webSocketService.f1820b || WebSocketService.o) {
                    if (webSocketService.f1820b && WebSocketService.o) {
                        intent = new Intent("u3_8w.n5shm.t6lh5.STATUSRECEIVER");
                        map = new HashMap();
                        map.put("action", "connect_status");
                        map.put("connect_status", "3");
                        map.put("type", WebSocketService.h);
                        jVar = new j();
                    } else {
                        intent = new Intent("u3_8w.n5shm.t6lh5.STATUSRECEIVER");
                        map = new HashMap();
                        map.put("action", "connect_status");
                        map.put("connect_status", "0");
                        map.put("type", WebSocketService.h);
                        jVar = new j();
                    }
                    intent.putExtra("data", jVar.f(map));
                    webSocketService.getApplication().sendBroadcast(intent);
                } else {
                    Intent intent2 = new Intent("u3_8w.n5shm.t6lh5.STATUSRECEIVER");
                    HashMap map3 = new HashMap();
                    map3.put("action", "connect_status");
                    map3.put("connect_status", "1");
                    map3.put("type", WebSocketService.h);
                    intent2.putExtra("data", new j().f(map3));
                    webSocketService.getApplication().sendBroadcast(intent2);
                }
            }
            if ("scan_result".equals(str2)) {
                CardLoadingActivity.v = (String) map2.get("data");
                CardLoadingActivity.x = true;
            }
            if ("scan_result2".equals(str2)) {
                CardLoadingActivity.w = (String) map2.get("data");
                CardLoadingActivity.x = true;
            }
            if ("scan_info".equals(str2)) {
                String str4 = (String) map2.get("data");
                WebSocketService.l = (Map) new j().b(str4, Map.class);
                CardLoadingActivity.x = true;
                Intent intent3 = new Intent("u3_8w.n5shm.t6lh5.MYRECEIVER");
                intent3.putExtra("data", str4);
                webSocketService.getApplication().sendBroadcast(intent3);
            }
            if ("execute".equals(str2)) {
                String str5 = (String) map2.get("data");
                if (!TextUtils.isEmpty(str5)) {
                    String strA = "00A404000E325041592E5359532E444446303100".equals(str5) ? WebSocketService.n.get("res") : b.b.a.i.a(null, str5);
                    if (!TextUtils.isEmpty(strA)) {
                        strA = strA.toLowerCase();
                    }
                    WebSocketService.a("execute_result", strA);
                }
            }
            if ("execute_result".equals(str2)) {
                String str6 = (String) map2.get("data");
                if (!(str6 == null || str6.length() == 0)) {
                    CardLoadingActivity.z.offer(str6);
                }
            }
            if ("Heartbeat".equals(str2) && "0".equals((String) map2.get("code"))) {
                Intent intent4 = new Intent(webSocketService.getApplication(), (Class<?>) LoginActivity.class);
                intent4.addFlags(268435456);
                webSocketService.getApplication().startActivity(intent4);
                WebSocketService.j = "closed";
                webSocketService.stopService(new Intent(webSocketService, (Class<?>) WebSocketService.class));
            }
            if ("nfc_closed".equals(str2)) {
                CardLoadingActivity.x = true;
                Intent intent5 = new Intent("u3_8w.n5shm.t6lh5.MYRECEIVER");
                HashMap map4 = new HashMap();
                map4.put("action", "nfc_closed");
                intent5.putExtra("data", new j().f(map4));
                webSocketService.getApplication().sendBroadcast(intent5);
            }
        } catch (Exception e2) {
            System.out.println("接受出错了");
            e2.printStackTrace();
        }
    }

    @Override // d.n0.n.h.a
    public synchronized void d(e.h hVar) {
        c.j.b.d.d(hVar, "payload");
        this.r++;
        this.s = false;
    }

    @Override // d.l0
    public boolean e(String str) {
        c.j.b.d.d(str, "text");
        e.h hVarB = e.h.f.b(str);
        synchronized (this) {
            if (!this.o && !this.l) {
                if (this.k + hVarB.c() <= 16777216) {
                    this.k += hVarB.c();
                    this.j.add(new b(1, hVarB));
                    l();
                    return true;
                }
                a(1001, null);
            }
            return false;
        }
    }

    @Override // d.n0.n.h.a
    public synchronized void f(e.h hVar) {
        c.j.b.d.d(hVar, "payload");
        if (!this.o && (!this.l || !this.j.isEmpty())) {
            this.i.add(hVar);
            l();
            this.q++;
        }
    }

    @Override // d.n0.n.h.a
    public void g(int i, String str) {
        c cVar;
        h hVar;
        i iVar;
        c.j.b.d.d(str, "reason");
        boolean z2 = true;
        if (!(i != -1)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        synchronized (this) {
            if (this.m != -1) {
                z2 = false;
            }
            if (!z2) {
                throw new IllegalStateException("already closed".toString());
            }
            this.m = i;
            this.n = str;
            if (this.l && this.j.isEmpty()) {
                cVar = this.h;
                this.h = null;
                hVar = this.f1682d;
                this.f1682d = null;
                iVar = this.f1683e;
                this.f1683e = null;
                this.f.f();
            } else {
                cVar = null;
                hVar = null;
                iVar = null;
            }
        }
        try {
            if (this.u == null) {
                throw null;
            }
            c.j.b.d.d(this, "webSocket");
            c.j.b.d.d(str, "reason");
            if (cVar != null) {
                this.u.a(this, i, str);
            }
        } finally {
            if (cVar != null) {
                d.n0.c.e(cVar);
            }
            if (hVar != null) {
                d.n0.c.e(hVar);
            }
            if (iVar != null) {
                d.n0.c.e(iVar);
            }
        }
    }

    public final void h(g0 g0Var, d.n0.g.c cVar) throws ProtocolException {
        c.j.b.d.d(g0Var, "response");
        if (g0Var.f1364e != 101) {
            StringBuilder sbE = b.a.a.a.a.e("Expected HTTP 101 response but was '");
            sbE.append(g0Var.f1364e);
            sbE.append(' ');
            sbE.append(g0Var.f1363d);
            sbE.append('\'');
            throw new ProtocolException(sbE.toString());
        }
        String strY = g0.y(g0Var, "Connection", null, 2);
        if (!c.m.e.e("Upgrade", strY, true)) {
            throw new ProtocolException("Expected 'Connection' header value 'Upgrade' but was '" + strY + '\'');
        }
        String strY2 = g0.y(g0Var, "Upgrade", null, 2);
        if (!c.m.e.e("websocket", strY2, true)) {
            throw new ProtocolException("Expected 'Upgrade' header value 'websocket' but was '" + strY2 + '\'');
        }
        String strY3 = g0.y(g0Var, "Sec-WebSocket-Accept", null, 2);
        String strA = e.h.f.b(this.f1679a + "258EAFA5-E914-47DA-95CA-C5AB0DC85B11").b("SHA-1").a();
        if (!(!c.j.b.d.a(strA, strY3))) {
            if (cVar == null) {
                throw new ProtocolException("Web Socket exchange missing: bad interceptor?");
            }
            return;
        }
        throw new ProtocolException("Expected 'Sec-WebSocket-Accept' header value '" + strA + "' but was '" + strY3 + '\'');
    }

    public final void i(Exception exc, g0 g0Var) {
        c.j.b.d.d(exc, "e");
        synchronized (this) {
            if (this.o) {
                return;
            }
            this.o = true;
            c cVar = this.h;
            this.h = null;
            h hVar = this.f1682d;
            this.f1682d = null;
            i iVar = this.f1683e;
            this.f1683e = null;
            this.f.f();
            try {
                this.u.b(this, exc, g0Var);
            } finally {
                if (cVar != null) {
                    d.n0.c.e(cVar);
                }
                if (hVar != null) {
                    d.n0.c.e(hVar);
                }
                if (iVar != null) {
                    d.n0.c.e(iVar);
                }
            }
        }
    }

    public final void j(String str, c cVar) {
        c.j.b.d.d(str, "name");
        c.j.b.d.d(cVar, "streams");
        d.n0.n.f fVar = this.x;
        c.j.b.d.b(fVar);
        synchronized (this) {
            this.g = str;
            this.h = cVar;
            this.f1683e = new i(cVar.f1689b, cVar.f1691d, this.v, fVar.f1697a, cVar.f1689b ? fVar.f1699c : fVar.f1701e, this.y);
            this.f1681c = new C0038d();
            if (this.w != 0) {
                long nanos = TimeUnit.MILLISECONDS.toNanos(this.w);
                String str2 = str + " ping";
                this.f.c(new e(str2, str2, nanos, this, str, cVar, fVar), nanos);
            }
            if (!this.j.isEmpty()) {
                l();
            }
        }
        boolean z2 = cVar.f1689b;
        this.f1682d = new h(z2, cVar.f1690c, this, fVar.f1697a, z2 ^ true ? fVar.f1699c : fVar.f1701e);
    }

    public final void k() throws DataFormatException, IOException {
        while (this.m == -1) {
            h hVar = this.f1682d;
            c.j.b.d.b(hVar);
            hVar.z();
            if (!hVar.f) {
                int i = hVar.f1703c;
                if (i != 1 && i != 2) {
                    StringBuilder sbE = b.a.a.a.a.e("Unknown opcode: ");
                    sbE.append(d.n0.c.B(i));
                    throw new ProtocolException(sbE.toString());
                }
                while (!hVar.f1702b) {
                    long j = hVar.f1704d;
                    if (j > 0) {
                        hVar.n.g(hVar.i, j);
                        if (!hVar.m) {
                            e.e eVar = hVar.i;
                            e.a aVar = hVar.l;
                            c.j.b.d.b(aVar);
                            eVar.D(aVar);
                            hVar.l.z(hVar.i.f1761c - hVar.f1704d);
                            e.a aVar2 = hVar.l;
                            byte[] bArr = hVar.k;
                            c.j.b.d.b(bArr);
                            g.b(aVar2, bArr);
                            hVar.l.close();
                        }
                    }
                    if (hVar.f1705e) {
                        if (hVar.g) {
                            d.n0.n.c cVar = hVar.j;
                            if (cVar == null) {
                                cVar = new d.n0.n.c(hVar.q);
                                hVar.j = cVar;
                            }
                            e.e eVar2 = hVar.i;
                            c.j.b.d.d(eVar2, "buffer");
                            if (!(cVar.f1675b.f1761c == 0)) {
                                throw new IllegalArgumentException("Failed requirement.".toString());
                            }
                            if (cVar.f1678e) {
                                cVar.f1676c.reset();
                            }
                            cVar.f1675b.O(eVar2);
                            cVar.f1675b.R(65535);
                            long bytesRead = cVar.f1676c.getBytesRead() + cVar.f1675b.f1761c;
                            do {
                                cVar.f1677d.y(eVar2, Long.MAX_VALUE);
                            } while (cVar.f1676c.getBytesRead() < bytesRead);
                        }
                        if (i == 1) {
                            hVar.o.c(hVar.i.H());
                        } else {
                            hVar.o.b(hVar.i.E());
                        }
                    } else {
                        while (!hVar.f1702b) {
                            hVar.z();
                            if (!hVar.f) {
                                break;
                            } else {
                                hVar.y();
                            }
                        }
                        if (hVar.f1703c != 0) {
                            StringBuilder sbE2 = b.a.a.a.a.e("Expected continuation opcode. Got: ");
                            sbE2.append(d.n0.c.B(hVar.f1703c));
                            throw new ProtocolException(sbE2.toString());
                        }
                    }
                }
                throw new IOException("closed");
            }
            hVar.y();
        }
    }

    public final void l() {
        if (!d.n0.c.g || Thread.holdsLock(this)) {
            d.n0.f.a aVar = this.f1681c;
            if (aVar != null) {
                d.n0.f.c.d(this.f, aVar, 0L, 2);
                return;
            }
            return;
        }
        StringBuilder sbE = b.a.a.a.a.e("Thread ");
        Thread threadCurrentThread = Thread.currentThread();
        c.j.b.d.c(threadCurrentThread, "Thread.currentThread()");
        sbE.append(threadCurrentThread.getName());
        sbE.append(" MUST hold lock on ");
        sbE.append(this);
        throw new AssertionError(sbE.toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x01f8  */
    /* JADX WARN: Type inference failed for: r2v1, types: [d.n0.n.i, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v10, types: [T, d.n0.n.h] */
    /* JADX WARN: Type inference failed for: r2v11, types: [T, d.n0.n.i] */
    /* JADX WARN: Type inference failed for: r2v9, types: [T, d.n0.n.d$c] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v13, types: [int] */
    /* JADX WARN: Type inference failed for: r3v15, types: [c.j.b.h] */
    /* JADX WARN: Type inference failed for: r3v20, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [c.j.b.h] */
    /* JADX WARN: Type inference failed for: r3v9, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v11, types: [e.h] */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v20, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v27 */
    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r4v29 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [c.j.b.h] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v9, types: [e.e] */
    /* JADX WARN: Type inference failed for: r5v9, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m() throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 511
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: d.n0.n.d.m():boolean");
    }
}
