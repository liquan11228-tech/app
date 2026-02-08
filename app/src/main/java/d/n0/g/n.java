package d.n0.g;

import a.b.k.h;
import d.j0;
import d.u;
import d.z;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a */
    public List<? extends Proxy> f1487a;

    /* renamed from: b */
    public int f1488b;

    /* renamed from: c */
    public List<? extends InetSocketAddress> f1489c;

    /* renamed from: d */
    public final List<j0> f1490d;

    /* renamed from: e */
    public final d.a f1491e;
    public final l f;
    public final d.f g;
    public final u h;

    public static final class a {

        /* renamed from: a */
        public int f1492a;

        /* renamed from: b */
        public final List<j0> f1493b;

        public a(List<j0> list) {
            c.j.b.d.d(list, "routes");
            this.f1493b = list;
        }

        public final boolean a() {
            return this.f1492a < this.f1493b.size();
        }

        public final j0 b() {
            if (!a()) {
                throw new NoSuchElementException();
            }
            List<j0> list = this.f1493b;
            int i = this.f1492a;
            this.f1492a = i + 1;
            return list.get(i);
        }
    }

    public n(d.a aVar, l lVar, d.f fVar, u uVar) {
        List<? extends Proxy> listN;
        c.j.b.d.d(aVar, "address");
        c.j.b.d.d(lVar, "routeDatabase");
        c.j.b.d.d(fVar, "call");
        c.j.b.d.d(uVar, "eventListener");
        this.f1491e = aVar;
        this.f = lVar;
        this.g = fVar;
        this.h = uVar;
        c.g.h hVar = c.g.h.f1272b;
        this.f1487a = hVar;
        this.f1489c = hVar;
        this.f1490d = new ArrayList();
        d.a aVar2 = this.f1491e;
        z zVar = aVar2.f1321a;
        Proxy proxy = aVar2.j;
        u uVar2 = this.h;
        d.f fVar2 = this.g;
        if (uVar2 == null) {
            throw null;
        }
        c.j.b.d.d(fVar2, "call");
        c.j.b.d.d(zVar, "url");
        if (proxy != null) {
            listN = h.i.E(proxy);
        } else {
            URI uriG = zVar.g();
            if (uriG.getHost() == null) {
                listN = d.n0.c.n(Proxy.NO_PROXY);
            } else {
                List<Proxy> listSelect = this.f1491e.k.select(uriG);
                listN = listSelect == null || listSelect.isEmpty() ? d.n0.c.n(Proxy.NO_PROXY) : d.n0.c.D(listSelect);
            }
        }
        this.f1487a = listN;
        this.f1488b = 0;
        u uVar3 = this.h;
        d.f fVar3 = this.g;
        if (uVar3 == null) {
            throw null;
        }
        c.j.b.d.d(fVar3, "call");
        c.j.b.d.d(zVar, "url");
        c.j.b.d.d(listN, "proxies");
    }

    public final boolean a() {
        return b() || (this.f1490d.isEmpty() ^ true);
    }

    public final boolean b() {
        return this.f1488b < this.f1487a.size();
    }
}
