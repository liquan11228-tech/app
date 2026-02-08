package d;

import a.b.k.h;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class s implements t {
    @Override // d.t
    public List<InetAddress> a(String str) throws UnknownHostException {
        c.j.b.d.d(str, "hostname");
        try {
            InetAddress[] allByName = InetAddress.getAllByName(str);
            c.j.b.d.c(allByName, "InetAddress.getAllByName(hostname)");
            c.j.b.d.d(allByName, "$this$toList");
            int length = allByName.length;
            if (length == 0) {
                return c.g.h.f1272b;
            }
            if (length == 1) {
                return h.i.E(allByName[0]);
            }
            c.j.b.d.d(allByName, "$this$toMutableList");
            c.j.b.d.d(allByName, "$this$asCollection");
            return new ArrayList(new c.g.c(allByName, false));
        } catch (NullPointerException e2) {
            UnknownHostException unknownHostException = new UnknownHostException(b.a.a.a.a.b("Broken system behaviour for dns lookup of ", str));
            unknownHostException.initCause(e2);
            throw unknownHostException;
        }
    }
}
