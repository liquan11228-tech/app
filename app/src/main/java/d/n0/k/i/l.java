package d.n0.k.i;

import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes.dex */
public final class l extends f {
    public static final a h = new a(null);

    public static final class a {
        public a(c.j.b.c cVar) {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(Class<? super SSLSocket> cls, Class<? super SSLSocketFactory> cls2, Class<?> cls3) {
        super(cls);
        c.j.b.d.d(cls, "sslSocketClass");
        c.j.b.d.d(cls2, "sslSocketFactoryClass");
        c.j.b.d.d(cls3, "paramClass");
    }
}
