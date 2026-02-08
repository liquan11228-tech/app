package d.n0.k.i;

import d.n0.k.i.f;
import d.n0.k.i.j;
import javax.net.ssl.SSLSocket;

/* loaded from: classes.dex */
public final class e implements j.a {

    /* renamed from: a */
    public final /* synthetic */ String f1653a;

    public e(String str) {
        this.f1653a = str;
    }

    @Override // d.n0.k.i.j.a
    public boolean a(SSLSocket sSLSocket) {
        c.j.b.d.d(sSLSocket, "sslSocket");
        String name = sSLSocket.getClass().getName();
        c.j.b.d.c(name, "sslSocket.javaClass.name");
        return c.m.e.z(name, this.f1653a + '.', false, 2);
    }

    @Override // d.n0.k.i.j.a
    public k b(SSLSocket sSLSocket) {
        c.j.b.d.d(sSLSocket, "sslSocket");
        f.a aVar = f.g;
        Class<?> cls = sSLSocket.getClass();
        Class<?> superclass = cls;
        while (superclass != null && (!c.j.b.d.a(superclass.getSimpleName(), "OpenSSLSocketImpl"))) {
            superclass = superclass.getSuperclass();
            if (superclass == null) {
                throw new AssertionError("No OpenSSLSocketImpl superclass of socket of type " + cls);
            }
        }
        c.j.b.d.b(superclass);
        return new f(superclass);
    }
}
