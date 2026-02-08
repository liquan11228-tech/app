package d.n0.k;

import a.b.k.h;
import d.d0;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* loaded from: classes.dex */
public final class e extends h {

    /* renamed from: d, reason: collision with root package name */
    public final Method f1635d;

    /* renamed from: e, reason: collision with root package name */
    public final Method f1636e;
    public final Method f;
    public final Class<?> g;
    public final Class<?> h;

    public static final class a implements InvocationHandler {

        /* renamed from: a, reason: collision with root package name */
        public boolean f1637a;

        /* renamed from: b, reason: collision with root package name */
        public String f1638b;

        /* renamed from: c, reason: collision with root package name */
        public final List<String> f1639c;

        public a(List<String> list) {
            c.j.b.d.d(list, "protocols");
            this.f1639c = list;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            c.j.b.d.d(obj, "proxy");
            c.j.b.d.d(method, "method");
            if (objArr == null) {
                objArr = new Object[0];
            }
            String name = method.getName();
            Class<?> returnType = method.getReturnType();
            if (c.j.b.d.a(name, "supports") && c.j.b.d.a(Boolean.TYPE, returnType)) {
                return Boolean.TRUE;
            }
            if (c.j.b.d.a(name, "unsupported") && c.j.b.d.a(Void.TYPE, returnType)) {
                this.f1637a = true;
                return null;
            }
            if (c.j.b.d.a(name, "protocols")) {
                if (objArr.length == 0) {
                    return this.f1639c;
                }
            }
            if ((!c.j.b.d.a(name, "selectProtocol") && !c.j.b.d.a(name, "select")) || !c.j.b.d.a(String.class, returnType) || objArr.length != 1 || !(objArr[0] instanceof List)) {
                if ((!c.j.b.d.a(name, "protocolSelected") && !c.j.b.d.a(name, "selected")) || objArr.length != 1) {
                    return method.invoke(this, Arrays.copyOf(objArr, objArr.length));
                }
                Object obj2 = objArr[0];
                if (obj2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
                this.f1638b = (String) obj2;
                return null;
            }
            Object obj3 = objArr[0];
            if (obj3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<*>");
            }
            List list = (List) obj3;
            int size = list.size();
            if (size >= 0) {
                int i = 0;
                while (true) {
                    Object obj4 = list.get(i);
                    if (obj4 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                    }
                    String str = (String) obj4;
                    if (!this.f1639c.contains(str)) {
                        if (i == size) {
                            break;
                        }
                        i++;
                    } else {
                        this.f1638b = str;
                        return str;
                    }
                }
            }
            String str2 = this.f1639c.get(0);
            this.f1638b = str2;
            return str2;
        }
    }

    public e(Method method, Method method2, Method method3, Class<?> cls, Class<?> cls2) {
        c.j.b.d.d(method, "putMethod");
        c.j.b.d.d(method2, "getMethod");
        c.j.b.d.d(method3, "removeMethod");
        c.j.b.d.d(cls, "clientProviderClass");
        c.j.b.d.d(cls2, "serverProviderClass");
        this.f1635d = method;
        this.f1636e = method2;
        this.f = method3;
        this.g = cls;
        this.h = cls2;
    }

    @Override // d.n0.k.h
    public void a(SSLSocket sSLSocket) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        c.j.b.d.d(sSLSocket, "sslSocket");
        try {
            this.f.invoke(null, sSLSocket);
        } catch (IllegalAccessException e2) {
            throw new AssertionError("failed to remove ALPN", e2);
        } catch (InvocationTargetException e3) {
            throw new AssertionError("failed to remove ALPN", e3);
        }
    }

    @Override // d.n0.k.h
    public void d(SSLSocket sSLSocket, String str, List<? extends d0> list) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        c.j.b.d.d(sSLSocket, "sslSocket");
        c.j.b.d.d(list, "protocols");
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
        try {
            this.f1635d.invoke(null, sSLSocket, Proxy.newProxyInstance(h.class.getClassLoader(), new Class[]{this.g, this.h}, new a(arrayList2)));
        } catch (IllegalAccessException e2) {
            throw new AssertionError("failed to set ALPN", e2);
        } catch (InvocationTargetException e3) {
            throw new AssertionError("failed to set ALPN", e3);
        }
    }

    @Override // d.n0.k.h
    public String f(SSLSocket sSLSocket) throws IllegalArgumentException {
        c.j.b.d.d(sSLSocket, "sslSocket");
        try {
            InvocationHandler invocationHandler = Proxy.getInvocationHandler(this.f1636e.invoke(null, sSLSocket));
            if (invocationHandler == null) {
                throw new NullPointerException("null cannot be cast to non-null type okhttp3.internal.platform.Jdk8WithJettyBootPlatform.AlpnProvider");
            }
            a aVar = (a) invocationHandler;
            if (!aVar.f1637a && aVar.f1638b == null) {
                h.j(this, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", 0, null, 6, null);
                return null;
            }
            if (aVar.f1637a) {
                return null;
            }
            return aVar.f1638b;
        } catch (IllegalAccessException e2) {
            throw new AssertionError("failed to get ALPN selected protocol", e2);
        } catch (InvocationTargetException e3) {
            throw new AssertionError("failed to get ALPN selected protocol", e3);
        }
    }
}
