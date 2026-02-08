package d.n0.k;

import a.b.k.h;
import d.d0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

/* loaded from: classes.dex */
public class f extends h {

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f1640d;

    /* renamed from: e, reason: collision with root package name */
    public static final a f1641e = new a(null);

    public static final class a {
        public a(c.j.b.c cVar) {
        }
    }

    static {
        String property = System.getProperty("java.specification.version");
        Integer numB = property != null ? c.m.e.B(property) : null;
        boolean z = true;
        if (numB == null) {
            try {
                SSLSocket.class.getMethod("getApplicationProtocol", new Class[0]);
            } catch (NoSuchMethodException unused) {
            }
        } else if (numB.intValue() < 9) {
            z = false;
        }
        f1640d = z;
    }

    @Override // d.n0.k.h
    public void d(SSLSocket sSLSocket, String str, List<d0> list) {
        c.j.b.d.d(sSLSocket, "sslSocket");
        c.j.b.d.d(list, "protocols");
        SSLParameters sSLParameters = sSLSocket.getSSLParameters();
        c.j.b.d.d(list, "protocols");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((d0) next) != d0.HTTP_1_0) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(h.i.r(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((d0) it2.next()).f1344b);
        }
        c.j.b.d.c(sSLParameters, "sslParameters");
        Object[] array = arrayList2.toArray(new String[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        sSLParameters.setApplicationProtocols((String[]) array);
        sSLSocket.setSSLParameters(sSLParameters);
    }

    @Override // d.n0.k.h
    public String f(SSLSocket sSLSocket) {
        c.j.b.d.d(sSLSocket, "sslSocket");
        try {
            String applicationProtocol = sSLSocket.getApplicationProtocol();
            if (applicationProtocol != null) {
                if (applicationProtocol.hashCode() != 0) {
                    return applicationProtocol;
                }
                if (!applicationProtocol.equals("")) {
                    return applicationProtocol;
                }
            }
        } catch (UnsupportedOperationException unused) {
        }
        return null;
    }
}
