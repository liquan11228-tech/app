package d;

import d.u;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.ArrayList;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes.dex */
public class c0 implements Cloneable {
    public final int A;
    public final int B;
    public final int C;
    public final long D;
    public final d.n0.g.l E;

    /* renamed from: b */
    public final r f1332b;

    /* renamed from: c */
    public final m f1333c;

    /* renamed from: d */
    public final List<a0> f1334d;

    /* renamed from: e */
    public final List<a0> f1335e;
    public final u.b f;
    public final boolean g;
    public final c h;
    public final boolean i;
    public final boolean j;
    public final q k;
    public final d l;
    public final t m;
    public final Proxy n;
    public final ProxySelector o;
    public final c p;
    public final SocketFactory q;
    public final SSLSocketFactory r;
    public final X509TrustManager s;
    public final List<n> t;
    public final List<d0> u;
    public final HostnameVerifier v;
    public final h w;
    public final d.n0.m.c x;
    public final int y;
    public final int z;
    public static final b H = new b(null);
    public static final List<d0> F = d.n0.c.n(d0.HTTP_2, d0.HTTP_1_1);
    public static final List<n> G = d.n0.c.n(n.g, n.h);

    public static final class a {
        public int A;
        public int B;
        public long C;
        public d.n0.g.l D;

        /* renamed from: a */
        public r f1336a = new r();

        /* renamed from: b */
        public m f1337b = new m();

        /* renamed from: c */
        public final List<a0> f1338c = new ArrayList();

        /* renamed from: d */
        public final List<a0> f1339d = new ArrayList();

        /* renamed from: e */
        public u.b f1340e;
        public boolean f;
        public c g;
        public boolean h;
        public boolean i;
        public q j;
        public d k;
        public t l;
        public Proxy m;
        public ProxySelector n;
        public c o;
        public SocketFactory p;
        public SSLSocketFactory q;
        public X509TrustManager r;
        public List<n> s;
        public List<? extends d0> t;
        public HostnameVerifier u;
        public h v;
        public d.n0.m.c w;
        public int x;
        public int y;
        public int z;

        public a() {
            u uVar = u.f1722a;
            c.j.b.d.d(uVar, "$this$asFactory");
            this.f1340e = new d.n0.a(uVar);
            this.f = true;
            this.g = c.f1331a;
            this.h = true;
            this.i = true;
            this.j = q.f1715a;
            this.l = t.f1721a;
            this.o = c.f1331a;
            SocketFactory socketFactory = SocketFactory.getDefault();
            c.j.b.d.c(socketFactory, "SocketFactory.getDefault()");
            this.p = socketFactory;
            b bVar = c0.H;
            this.s = c0.G;
            b bVar2 = c0.H;
            this.t = c0.F;
            this.u = d.n0.m.d.f1669a;
            this.v = h.f1370c;
            this.y = 10000;
            this.z = 10000;
            this.A = 10000;
            this.C = 1024L;
        }
    }

    public static final class b {
        public b(c.j.b.c cVar) {
        }
    }

    public c0() {
        this(new a());
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public c0(d.c0.a r6) {
        /*
            Method dump skipped, instructions count: 523
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: d.c0.<init>(d.c0$a):void");
    }

    public Object clone() {
        return super.clone();
    }
}
