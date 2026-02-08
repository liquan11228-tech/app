package d.n0.j;

import d.n0.j.n;
import d.n0.k.h;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class f implements Closeable {
    public static final t D;
    public static final f E = null;
    public final p A;
    public final d B;
    public final Set<Integer> C;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f1559b;

    /* renamed from: c, reason: collision with root package name */
    public final c f1560c;

    /* renamed from: d, reason: collision with root package name */
    public final Map<Integer, o> f1561d;

    /* renamed from: e, reason: collision with root package name */
    public final String f1562e;
    public int f;
    public int g;
    public boolean h;
    public final d.n0.f.d i;
    public final d.n0.f.c j;
    public final d.n0.f.c k;
    public final d.n0.f.c l;
    public final s m;
    public long n;
    public long o;
    public long p;
    public long q;
    public long r;
    public long s;
    public final t t;
    public t u;
    public long v;
    public long w;
    public long x;
    public long y;
    public final Socket z;

    public static final class a extends d.n0.f.a {

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ f f1563e;
        public final /* synthetic */ long f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, String str2, f fVar, long j) {
            super(str2, true);
            this.f1563e = fVar;
            this.f = j;
        }

        @Override // d.n0.f.a
        public long a() throws IOException {
            boolean z;
            synchronized (this.f1563e) {
                if (this.f1563e.o < this.f1563e.n) {
                    z = true;
                } else {
                    this.f1563e.n++;
                    z = false;
                }
            }
            f fVar = this.f1563e;
            if (!z) {
                fVar.F(false, 1, 0);
                return this.f;
            }
            d.n0.j.b bVar = d.n0.j.b.PROTOCOL_ERROR;
            fVar.y(bVar, bVar, null);
            return -1L;
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public Socket f1564a;

        /* renamed from: b, reason: collision with root package name */
        public String f1565b;

        /* renamed from: c, reason: collision with root package name */
        public e.g f1566c;

        /* renamed from: d, reason: collision with root package name */
        public e.f f1567d;

        /* renamed from: e, reason: collision with root package name */
        public c f1568e;
        public s f;
        public int g;
        public boolean h;
        public final d.n0.f.d i;

        public b(boolean z, d.n0.f.d dVar) {
            c.j.b.d.d(dVar, "taskRunner");
            this.h = z;
            this.i = dVar;
            this.f1568e = c.f1569a;
            this.f = s.f1620a;
        }
    }

    public static abstract class c {

        /* renamed from: a, reason: collision with root package name */
        public static final c f1569a = new a();

        public static final class a extends c {
            @Override // d.n0.j.f.c
            public void b(o oVar) {
                c.j.b.d.d(oVar, "stream");
                oVar.c(d.n0.j.b.REFUSED_STREAM, null);
            }
        }

        public void a(f fVar, t tVar) {
            c.j.b.d.d(fVar, "connection");
            c.j.b.d.d(tVar, "settings");
        }

        public abstract void b(o oVar);
    }

    public final class d implements n.b, c.j.a.a<c.f> {

        /* renamed from: b, reason: collision with root package name */
        public final n f1570b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ f f1571c;

        public static final class a extends d.n0.f.a {

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ o f1572e;
            public final /* synthetic */ d f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(String str, boolean z, String str2, boolean z2, o oVar, d dVar, o oVar2, int i, List list, boolean z3) {
                super(str2, z2);
                this.f1572e = oVar;
                this.f = dVar;
            }

            @Override // d.n0.f.a
            public long a() {
                try {
                    this.f.f1571c.f1560c.b(this.f1572e);
                    return -1L;
                } catch (IOException e2) {
                    h.a aVar = d.n0.k.h.f1646c;
                    d.n0.k.h hVar = d.n0.k.h.f1644a;
                    StringBuilder sbE = b.a.a.a.a.e("Http2Connection.Listener failure for ");
                    sbE.append(this.f.f1571c.f1562e);
                    hVar.i(sbE.toString(), 4, e2);
                    try {
                        this.f1572e.c(d.n0.j.b.PROTOCOL_ERROR, e2);
                        return -1L;
                    } catch (IOException unused) {
                        return -1L;
                    }
                }
            }
        }

        public static final class b extends d.n0.f.a {

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ d f1573e;
            public final /* synthetic */ int f;
            public final /* synthetic */ int g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(String str, boolean z, String str2, boolean z2, d dVar, int i, int i2) {
                super(str2, z2);
                this.f1573e = dVar;
                this.f = i;
                this.g = i2;
            }

            @Override // d.n0.f.a
            public long a() throws IOException {
                this.f1573e.f1571c.F(true, this.f, this.g);
                return -1L;
            }
        }

        public static final class c extends d.n0.f.a {

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ d f1574e;
            public final /* synthetic */ boolean f;
            public final /* synthetic */ t g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(String str, boolean z, String str2, boolean z2, d dVar, boolean z3, t tVar) {
                super(str2, z2);
                this.f1574e = dVar;
                this.f = z3;
                this.g = tVar;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r3v1, types: [T, d.n0.j.t] */
            /* JADX WARN: Type inference failed for: r3v13 */
            /* JADX WARN: Type inference failed for: r3v14 */
            @Override // d.n0.f.a
            public long a() throws Throwable {
                p pVar;
                ?? r3;
                T t;
                f fVar;
                t tVar;
                d dVar = this.f1574e;
                boolean z = this.f;
                t tVar2 = this.g;
                if (dVar == null) {
                    throw null;
                }
                c.j.b.d.d(tVar2, "settings");
                c.j.b.g gVar = new c.j.b.g();
                c.j.b.h hVar = new c.j.b.h();
                c.j.b.h hVar2 = new c.j.b.h();
                p pVar2 = dVar.f1571c.A;
                synchronized (pVar2) {
                    try {
                    } catch (Throwable th) {
                        th = th;
                        pVar = pVar2;
                    }
                    try {
                        synchronized (dVar.f1571c) {
                            try {
                                t tVar3 = dVar.f1571c.u;
                                if (z) {
                                    r3 = tVar2;
                                } else {
                                    t tVar4 = new t();
                                    tVar4.b(tVar3);
                                    tVar4.b(tVar2);
                                    r3 = tVar4;
                                }
                                hVar2.f1284b = r3;
                                long jA = r3.a() - tVar3.a();
                                gVar.f1283b = jA;
                                if (jA == 0 || dVar.f1571c.f1561d.isEmpty()) {
                                    t = 0;
                                } else {
                                    Object[] array = dVar.f1571c.f1561d.values().toArray(new o[0]);
                                    if (array == null) {
                                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                                    }
                                    t = (o[]) array;
                                }
                                hVar.f1284b = t;
                                fVar = dVar.f1571c;
                                tVar = (t) hVar2.f1284b;
                            } catch (Throwable th2) {
                                th = th2;
                            }
                            try {
                                if (fVar == null) {
                                    throw null;
                                }
                                c.j.b.d.d(tVar, "<set-?>");
                                fVar.u = tVar;
                                d.n0.f.c cVar = dVar.f1571c.l;
                                String str = dVar.f1571c.f1562e + " onSettings";
                                pVar = pVar2;
                                cVar.c(new g(str, true, str, true, dVar, hVar2, z, tVar2, gVar, hVar), 0L);
                                try {
                                    dVar.f1571c.A.y((t) hVar2.f1284b);
                                } catch (IOException e2) {
                                    f fVar2 = dVar.f1571c;
                                    d.n0.j.b bVar = d.n0.j.b.PROTOCOL_ERROR;
                                    fVar2.y(bVar, bVar, e2);
                                }
                                o[] oVarArr = (o[]) hVar.f1284b;
                                if (oVarArr == null) {
                                    return -1L;
                                }
                                c.j.b.d.b(oVarArr);
                                for (o oVar : oVarArr) {
                                    synchronized (oVar) {
                                        long j = gVar.f1283b;
                                        oVar.f1599d += j;
                                        if (j > 0) {
                                            oVar.notifyAll();
                                        }
                                    }
                                }
                                return -1L;
                            } catch (Throwable th3) {
                                th = th3;
                                throw th;
                            }
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        throw th;
                    }
                }
            }
        }

        public d(f fVar, n nVar) {
            c.j.b.d.d(nVar, "reader");
            this.f1571c = fVar;
            this.f1570b = nVar;
        }

        @Override // d.n0.j.n.b
        public void a(int i, int i2, List<d.n0.j.c> list) {
            c.j.b.d.d(list, "requestHeaders");
            f fVar = this.f1571c;
            if (fVar == null) {
                throw null;
            }
            c.j.b.d.d(list, "requestHeaders");
            synchronized (fVar) {
                if (fVar.C.contains(Integer.valueOf(i2))) {
                    fVar.G(i2, d.n0.j.b.PROTOCOL_ERROR);
                    return;
                }
                fVar.C.add(Integer.valueOf(i2));
                d.n0.f.c cVar = fVar.k;
                String str = fVar.f1562e + '[' + i2 + "] onRequest";
                cVar.c(new j(str, true, str, true, fVar, i2, list), 0L);
            }
        }

        @Override // d.n0.j.n.b
        public void b(boolean z, int i, int i2, List<d.n0.j.c> list) {
            c.j.b.d.d(list, "headerBlock");
            if (this.f1571c.A(i)) {
                f fVar = this.f1571c;
                if (fVar == null) {
                    throw null;
                }
                c.j.b.d.d(list, "requestHeaders");
                d.n0.f.c cVar = fVar.k;
                String str = fVar.f1562e + '[' + i + "] onHeaders";
                cVar.c(new i(str, true, str, true, fVar, i, list, z), 0L);
                return;
            }
            synchronized (this.f1571c) {
                o oVarZ = this.f1571c.z(i);
                if (oVarZ != null) {
                    oVarZ.j(d.n0.c.A(list), z);
                    return;
                }
                if (this.f1571c.h) {
                    return;
                }
                if (i <= this.f1571c.f) {
                    return;
                }
                if (i % 2 == this.f1571c.g % 2) {
                    return;
                }
                o oVar = new o(i, this.f1571c, false, z, d.n0.c.A(list));
                this.f1571c.f = i;
                this.f1571c.f1561d.put(Integer.valueOf(i), oVar);
                d.n0.f.c cVarF = this.f1571c.i.f();
                String str2 = this.f1571c.f1562e + '[' + i + "] onStream";
                cVarF.c(new a(str2, true, str2, true, oVar, this, oVarZ, i, list, z), 0L);
            }
        }

        @Override // c.j.a.a
        public c.f c() throws Throwable {
            d.n0.j.b bVar;
            d.n0.j.b bVar2 = d.n0.j.b.PROTOCOL_ERROR;
            d.n0.j.b bVar3 = d.n0.j.b.INTERNAL_ERROR;
            try {
                try {
                    this.f1570b.z(this);
                    while (this.f1570b.y(false, this)) {
                    }
                    bVar = d.n0.j.b.NO_ERROR;
                    try {
                        this.f1571c.y(bVar, d.n0.j.b.CANCEL, null);
                    } catch (Throwable th) {
                        th = th;
                        this.f1571c.y(bVar, bVar3, null);
                        d.n0.c.e(this.f1570b);
                        throw th;
                    }
                } catch (IOException e2) {
                    this.f1571c.y(bVar2, bVar2, e2);
                }
                d.n0.c.e(this.f1570b);
                return c.f.f1260a;
            } catch (Throwable th2) {
                th = th2;
                bVar = bVar3;
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:60:0x015d, code lost:
        
            throw new java.lang.NullPointerException("null cannot be cast to non-null type java.lang.Object");
         */
        /* JADX WARN: Code restructure failed: missing block: B:74:0x0174, code lost:
        
            if (r17 == false) goto L92;
         */
        /* JADX WARN: Code restructure failed: missing block: B:75:0x0176, code lost:
        
            r3.j(d.n0.c.f1412b, true);
         */
        /* JADX WARN: Code restructure failed: missing block: B:76:0x017b, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:92:?, code lost:
        
            return;
         */
        @Override // d.n0.j.n.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void d(boolean r17, int r18, e.g r19, int r20) throws java.io.EOFException {
            /*
                Method dump skipped, instructions count: 381
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: d.n0.j.f.d.d(boolean, int, e.g, int):void");
        }

        @Override // d.n0.j.n.b
        public void e(boolean z, int i, int i2) {
            if (!z) {
                d.n0.f.c cVar = this.f1571c.j;
                String strD = b.a.a.a.a.d(new StringBuilder(), this.f1571c.f1562e, " ping");
                cVar.c(new b(strD, true, strD, true, this, i, i2), 0L);
                return;
            }
            synchronized (this.f1571c) {
                if (i == 1) {
                    this.f1571c.o++;
                } else if (i == 2) {
                    this.f1571c.q++;
                } else if (i == 3) {
                    this.f1571c.r++;
                    f fVar = this.f1571c;
                    if (fVar == null) {
                        throw new NullPointerException("null cannot be cast to non-null type java.lang.Object");
                    }
                    fVar.notifyAll();
                }
            }
        }

        @Override // d.n0.j.n.b
        public void f(int i, d.n0.j.b bVar, e.h hVar) {
            int i2;
            o[] oVarArr;
            c.j.b.d.d(bVar, "errorCode");
            c.j.b.d.d(hVar, "debugData");
            hVar.c();
            synchronized (this.f1571c) {
                Object[] array = this.f1571c.f1561d.values().toArray(new o[0]);
                if (array == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
                oVarArr = (o[]) array;
                this.f1571c.h = true;
            }
            for (o oVar : oVarArr) {
                if (oVar.m > i && oVar.h()) {
                    oVar.k(d.n0.j.b.REFUSED_STREAM);
                    this.f1571c.B(oVar.m);
                }
            }
        }

        @Override // d.n0.j.n.b
        public void g(int i, int i2, int i3, boolean z) {
        }

        @Override // d.n0.j.n.b
        public void h() {
        }

        @Override // d.n0.j.n.b
        public void i(int i, d.n0.j.b bVar) {
            c.j.b.d.d(bVar, "errorCode");
            if (!this.f1571c.A(i)) {
                o oVarB = this.f1571c.B(i);
                if (oVarB != null) {
                    oVarB.k(bVar);
                    return;
                }
                return;
            }
            f fVar = this.f1571c;
            if (fVar == null) {
                throw null;
            }
            c.j.b.d.d(bVar, "errorCode");
            d.n0.f.c cVar = fVar.k;
            String str = fVar.f1562e + '[' + i + "] onReset";
            cVar.c(new k(str, true, str, true, fVar, i, bVar), 0L);
        }

        @Override // d.n0.j.n.b
        public void j(int i, long j) {
            Object obj;
            if (i == 0) {
                Object obj2 = this.f1571c;
                synchronized (obj2) {
                    this.f1571c.y += j;
                    f fVar = this.f1571c;
                    if (fVar == null) {
                        throw new NullPointerException("null cannot be cast to non-null type java.lang.Object");
                    }
                    fVar.notifyAll();
                    obj = obj2;
                }
            } else {
                o oVarZ = this.f1571c.z(i);
                if (oVarZ == null) {
                    return;
                }
                synchronized (oVarZ) {
                    oVarZ.f1599d += j;
                    obj = oVarZ;
                    if (j > 0) {
                        oVarZ.notifyAll();
                        obj = oVarZ;
                    }
                }
            }
        }

        @Override // d.n0.j.n.b
        public void k(boolean z, t tVar) {
            c.j.b.d.d(tVar, "settings");
            d.n0.f.c cVar = this.f1571c.j;
            String strD = b.a.a.a.a.d(new StringBuilder(), this.f1571c.f1562e, " applyAndAckSettings");
            cVar.c(new c(strD, true, strD, true, this, z, tVar), 0L);
        }
    }

    public static final class e extends d.n0.f.a {

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ f f1575e;
        public final /* synthetic */ int f;
        public final /* synthetic */ d.n0.j.b g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, boolean z, String str2, boolean z2, f fVar, int i, d.n0.j.b bVar) {
            super(str2, z2);
            this.f1575e = fVar;
            this.f = i;
            this.g = bVar;
        }

        @Override // d.n0.f.a
        public long a() throws IOException {
            try {
                f fVar = this.f1575e;
                int i = this.f;
                d.n0.j.b bVar = this.g;
                if (fVar == null) {
                    throw null;
                }
                c.j.b.d.d(bVar, "statusCode");
                fVar.A.E(i, bVar);
                return -1L;
            } catch (IOException e2) {
                f fVar2 = this.f1575e;
                d.n0.j.b bVar2 = d.n0.j.b.PROTOCOL_ERROR;
                fVar2.y(bVar2, bVar2, e2);
                return -1L;
            }
        }
    }

    /* renamed from: d.n0.j.f$f, reason: collision with other inner class name */
    public static final class C0036f extends d.n0.f.a {

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ f f1576e;
        public final /* synthetic */ int f;
        public final /* synthetic */ long g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0036f(String str, boolean z, String str2, boolean z2, f fVar, int i, long j) {
            super(str2, z2);
            this.f1576e = fVar;
            this.f = i;
            this.g = j;
        }

        @Override // d.n0.f.a
        public long a() throws IOException {
            try {
                this.f1576e.A.F(this.f, this.g);
                return -1L;
            } catch (IOException e2) {
                f fVar = this.f1576e;
                d.n0.j.b bVar = d.n0.j.b.PROTOCOL_ERROR;
                fVar.y(bVar, bVar, e2);
                return -1L;
            }
        }
    }

    static {
        t tVar = new t();
        tVar.c(7, 65535);
        tVar.c(5, 16384);
        D = tVar;
    }

    public f(b bVar) {
        c.j.b.d.d(bVar, "builder");
        this.f1559b = bVar.h;
        this.f1560c = bVar.f1568e;
        this.f1561d = new LinkedHashMap();
        String str = bVar.f1565b;
        if (str == null) {
            c.j.b.d.h("connectionName");
            throw null;
        }
        this.f1562e = str;
        this.g = bVar.h ? 3 : 2;
        d.n0.f.d dVar = bVar.i;
        this.i = dVar;
        this.j = dVar.f();
        this.k = this.i.f();
        this.l = this.i.f();
        this.m = bVar.f;
        t tVar = new t();
        if (bVar.h) {
            tVar.c(7, 16777216);
        }
        this.t = tVar;
        this.u = D;
        this.y = r0.a();
        Socket socket = bVar.f1564a;
        if (socket == null) {
            c.j.b.d.h("socket");
            throw null;
        }
        this.z = socket;
        e.f fVar = bVar.f1567d;
        if (fVar == null) {
            c.j.b.d.h("sink");
            throw null;
        }
        this.A = new p(fVar, this.f1559b);
        e.g gVar = bVar.f1566c;
        if (gVar == null) {
            c.j.b.d.h("source");
            throw null;
        }
        this.B = new d(this, new n(gVar, this.f1559b));
        this.C = new LinkedHashSet();
        int i = bVar.g;
        if (i != 0) {
            long nanos = TimeUnit.MILLISECONDS.toNanos(i);
            d.n0.f.c cVar = this.j;
            String strD = b.a.a.a.a.d(new StringBuilder(), this.f1562e, " ping");
            cVar.c(new a(strD, strD, this, nanos), nanos);
        }
    }

    public final boolean A(int i) {
        return i != 0 && (i & 1) == 0;
    }

    public final synchronized o B(int i) {
        o oVarRemove;
        oVarRemove = this.f1561d.remove(Integer.valueOf(i));
        notifyAll();
        return oVarRemove;
    }

    public final void C(d.n0.j.b bVar) {
        c.j.b.d.d(bVar, "statusCode");
        synchronized (this.A) {
            synchronized (this) {
                if (this.h) {
                    return;
                }
                this.h = true;
                this.A.B(this.f, bVar, d.n0.c.f1411a);
            }
        }
    }

    public final synchronized void D(long j) {
        long j2 = this.v + j;
        this.v = j2;
        long j3 = j2 - this.w;
        if (j3 >= this.t.a() / 2) {
            H(0, j3);
            this.w += j3;
        }
    }

    public final void E(int i, boolean z, e.e eVar, long j) {
        int iMin;
        long j2;
        if (j == 0) {
            this.A.z(z, i, eVar, 0);
            return;
        }
        while (j > 0) {
            synchronized (this) {
                while (this.x >= this.y) {
                    try {
                        if (!this.f1561d.containsKey(Integer.valueOf(i))) {
                            throw new IOException("stream closed");
                        }
                        wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        throw new InterruptedIOException();
                    }
                }
                iMin = Math.min((int) Math.min(j, this.y - this.x), this.A.f1610c);
                j2 = iMin;
                this.x += j2;
            }
            j -= j2;
            this.A.z(z && j == 0, i, eVar, iMin);
        }
    }

    public final void F(boolean z, int i, int i2) throws IOException {
        try {
            this.A.D(z, i, i2);
        } catch (IOException e2) {
            d.n0.j.b bVar = d.n0.j.b.PROTOCOL_ERROR;
            y(bVar, bVar, e2);
        }
    }

    public final void G(int i, d.n0.j.b bVar) {
        c.j.b.d.d(bVar, "errorCode");
        d.n0.f.c cVar = this.j;
        String str = this.f1562e + '[' + i + "] writeSynReset";
        cVar.c(new e(str, true, str, true, this, i, bVar), 0L);
    }

    public final void H(int i, long j) {
        d.n0.f.c cVar = this.j;
        String str = this.f1562e + '[' + i + "] windowUpdate";
        cVar.c(new C0036f(str, true, str, true, this, i, j), 0L);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        y(d.n0.j.b.NO_ERROR, d.n0.j.b.CANCEL, null);
    }

    public final void flush() {
        this.A.flush();
    }

    public final void y(d.n0.j.b bVar, d.n0.j.b bVar2, IOException iOException) throws IOException {
        int i;
        c.j.b.d.d(bVar, "connectionCode");
        c.j.b.d.d(bVar2, "streamCode");
        if (d.n0.c.g && Thread.holdsLock(this)) {
            StringBuilder sbE = b.a.a.a.a.e("Thread ");
            Thread threadCurrentThread = Thread.currentThread();
            c.j.b.d.c(threadCurrentThread, "Thread.currentThread()");
            sbE.append(threadCurrentThread.getName());
            sbE.append(" MUST NOT hold lock on ");
            sbE.append(this);
            throw new AssertionError(sbE.toString());
        }
        try {
            C(bVar);
        } catch (IOException unused) {
        }
        o[] oVarArr = null;
        synchronized (this) {
            if (!this.f1561d.isEmpty()) {
                Object[] array = this.f1561d.values().toArray(new o[0]);
                if (array == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
                oVarArr = (o[]) array;
                this.f1561d.clear();
            }
        }
        if (oVarArr != null) {
            for (o oVar : oVarArr) {
                try {
                    oVar.c(bVar2, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.A.close();
        } catch (IOException unused3) {
        }
        try {
            this.z.close();
        } catch (IOException unused4) {
        }
        this.j.f();
        this.k.f();
        this.l.f();
    }

    public final synchronized o z(int i) {
        return this.f1561d.get(Integer.valueOf(i));
    }
}
