package d.n0.k.i;

import d.d0;
import d.n0.k.b;
import d.n0.k.i.j;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* loaded from: classes.dex */
public class f implements k {
    public static final j.a f;
    public static final a g;

    /* renamed from: a, reason: collision with root package name */
    public final Method f1654a;

    /* renamed from: b, reason: collision with root package name */
    public final Method f1655b;

    /* renamed from: c, reason: collision with root package name */
    public final Method f1656c;

    /* renamed from: d, reason: collision with root package name */
    public final Method f1657d;

    /* renamed from: e, reason: collision with root package name */
    public final Class<? super SSLSocket> f1658e;

    public static final class a {
        public a(c.j.b.c cVar) {
        }
    }

    static {
        a aVar = new a(null);
        g = aVar;
        if (aVar == null) {
            throw null;
        }
        c.j.b.d.d("com.google.android.gms.org.conscrypt", "packageName");
        f = new e("com.google.android.gms.org.conscrypt");
    }

    public f(Class<? super SSLSocket> cls) throws NoSuchMethodException, SecurityException {
        c.j.b.d.d(cls, "sslSocketClass");
        this.f1658e = cls;
        Method declaredMethod = cls.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
        c.j.b.d.c(declaredMethod, "sslSocketClass.getDeclar…:class.javaPrimitiveType)");
        this.f1654a = declaredMethod;
        this.f1655b = this.f1658e.getMethod("setHostname", String.class);
        this.f1656c = this.f1658e.getMethod("getAlpnSelectedProtocol", new Class[0]);
        this.f1657d = this.f1658e.getMethod("setAlpnProtocols", byte[].class);
    }

    @Override // d.n0.k.i.k
    public boolean a(SSLSocket sSLSocket) {
        c.j.b.d.d(sSLSocket, "sslSocket");
        return this.f1658e.isInstance(sSLSocket);
    }

    @Override // d.n0.k.i.k
    public String b(SSLSocket sSLSocket) {
        c.j.b.d.d(sSLSocket, "sslSocket");
        if (!a(sSLSocket)) {
            return null;
        }
        try {
            byte[] bArr = (byte[]) this.f1656c.invoke(sSLSocket, new Object[0]);
            if (bArr == null) {
                return null;
            }
            Charset charset = StandardCharsets.UTF_8;
            c.j.b.d.c(charset, "StandardCharsets.UTF_8");
            return new String(bArr, charset);
        } catch (IllegalAccessException e2) {
            throw new AssertionError(e2);
        } catch (NullPointerException e3) {
            if (c.j.b.d.a(e3.getMessage(), "ssl == null")) {
                return null;
            }
            throw e3;
        } catch (InvocationTargetException e4) {
            throw new AssertionError(e4);
        }
    }

    @Override // d.n0.k.i.k
    public boolean c() {
        b.a aVar = d.n0.k.b.g;
        return d.n0.k.b.f;
    }

    @Override // d.n0.k.i.k
    public void d(SSLSocket sSLSocket, String str, List<? extends d0> list) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        c.j.b.d.d(sSLSocket, "sslSocket");
        c.j.b.d.d(list, "protocols");
        if (a(sSLSocket)) {
            try {
                this.f1654a.invoke(sSLSocket, Boolean.TRUE);
                if (str != null) {
                    this.f1655b.invoke(sSLSocket, str);
                }
                this.f1657d.invoke(sSLSocket, d.n0.k.h.f1646c.b(list));
            } catch (IllegalAccessException e2) {
                throw new AssertionError(e2);
            } catch (InvocationTargetException e3) {
                throw new AssertionError(e3);
            }
        }
    }
}
