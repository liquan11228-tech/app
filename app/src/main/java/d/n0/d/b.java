package d.n0.d;

import c.g.e;
import c.j.b.d;
import d.c;
import d.t;
import d.z;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.SocketAddress;

/* loaded from: classes.dex */
public final class b implements c {

    /* renamed from: b */
    public final t f1417b;

    public b(t tVar, int i) {
        t tVar2 = (i & 1) != 0 ? t.f1721a : null;
        d.d(tVar2, "defaultDns");
        this.f1417b = tVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x002e  */
    @Override // d.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public d.e0 a(d.j0 r21, d.g0 r22) {
        /*
            Method dump skipped, instructions count: 454
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: d.n0.d.b.a(d.j0, d.g0):d.e0");
    }

    public final InetAddress b(Proxy proxy, z zVar, t tVar) {
        Proxy.Type type = proxy.type();
        if (type != null && a.f1416a[type.ordinal()] == 1) {
            return (InetAddress) e.e(tVar.a(zVar.f1742e));
        }
        SocketAddress socketAddressAddress = proxy.address();
        if (socketAddressAddress == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.net.InetSocketAddress");
        }
        InetAddress address = ((InetSocketAddress) socketAddressAddress).getAddress();
        d.c(address, "(address() as InetSocketAddress).address");
        return address;
    }
}
