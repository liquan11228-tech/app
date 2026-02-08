package d;

import d.k;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: e, reason: collision with root package name */
    public static final k[] f1399e;
    public static final k[] f;
    public static final n g;
    public static final n h;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f1400a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f1401b;

    /* renamed from: c, reason: collision with root package name */
    public final String[] f1402c;

    /* renamed from: d, reason: collision with root package name */
    public final String[] f1403d;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public boolean f1404a;

        /* renamed from: b, reason: collision with root package name */
        public String[] f1405b;

        /* renamed from: c, reason: collision with root package name */
        public String[] f1406c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f1407d;

        public a(n nVar) {
            c.j.b.d.d(nVar, "connectionSpec");
            this.f1404a = nVar.f1400a;
            this.f1405b = nVar.f1402c;
            this.f1406c = nVar.f1403d;
            this.f1407d = nVar.f1401b;
        }

        public a(boolean z) {
            this.f1404a = z;
        }

        public final n a() {
            return new n(this.f1404a, this.f1407d, this.f1405b, this.f1406c);
        }

        public final a b(String... strArr) throws CloneNotSupportedException {
            c.j.b.d.d(strArr, "cipherSuites");
            if (!this.f1404a) {
                throw new IllegalArgumentException("no cipher suites for cleartext connections".toString());
            }
            if (!(!(strArr.length == 0))) {
                throw new IllegalArgumentException("At least one cipher suite is required".toString());
            }
            Object objClone = strArr.clone();
            if (objClone == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.String>");
            }
            this.f1405b = (String[]) objClone;
            return this;
        }

        public final a c(k... kVarArr) throws CloneNotSupportedException {
            c.j.b.d.d(kVarArr, "cipherSuites");
            if (!this.f1404a) {
                throw new IllegalArgumentException("no cipher suites for cleartext connections".toString());
            }
            ArrayList arrayList = new ArrayList(kVarArr.length);
            for (k kVar : kVarArr) {
                arrayList.add(kVar.f1393a);
            }
            Object[] array = arrayList.toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            String[] strArr = (String[]) array;
            b((String[]) Arrays.copyOf(strArr, strArr.length));
            return this;
        }

        public final a d(boolean z) {
            if (!this.f1404a) {
                throw new IllegalArgumentException("no TLS extensions for cleartext connections".toString());
            }
            this.f1407d = z;
            return this;
        }

        public final a e(String... strArr) throws CloneNotSupportedException {
            c.j.b.d.d(strArr, "tlsVersions");
            if (!this.f1404a) {
                throw new IllegalArgumentException("no TLS versions for cleartext connections".toString());
            }
            if (!(!(strArr.length == 0))) {
                throw new IllegalArgumentException("At least one TLS version is required".toString());
            }
            Object objClone = strArr.clone();
            if (objClone == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.String>");
            }
            this.f1406c = (String[]) objClone;
            return this;
        }

        public final a f(k0... k0VarArr) throws CloneNotSupportedException {
            c.j.b.d.d(k0VarArr, "tlsVersions");
            if (!this.f1404a) {
                throw new IllegalArgumentException("no TLS versions for cleartext connections".toString());
            }
            ArrayList arrayList = new ArrayList(k0VarArr.length);
            for (k0 k0Var : k0VarArr) {
                arrayList.add(k0Var.f1397b);
            }
            Object[] array = arrayList.toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            String[] strArr = (String[]) array;
            e((String[]) Arrays.copyOf(strArr, strArr.length));
            return this;
        }
    }

    static {
        k0 k0Var = k0.TLS_1_2;
        k0 k0Var2 = k0.TLS_1_3;
        f1399e = new k[]{k.q, k.r, k.s, k.k, k.m, k.l, k.n, k.p, k.o};
        f = new k[]{k.q, k.r, k.s, k.k, k.m, k.l, k.n, k.p, k.o, k.i, k.j, k.g, k.h, k.f1392e, k.f, k.f1391d};
        a aVar = new a(true);
        k[] kVarArr = f1399e;
        aVar.c((k[]) Arrays.copyOf(kVarArr, kVarArr.length));
        aVar.f(k0Var2, k0Var);
        aVar.d(true);
        aVar.a();
        a aVar2 = new a(true);
        k[] kVarArr2 = f;
        aVar2.c((k[]) Arrays.copyOf(kVarArr2, kVarArr2.length));
        aVar2.f(k0Var2, k0Var);
        aVar2.d(true);
        g = aVar2.a();
        a aVar3 = new a(true);
        k[] kVarArr3 = f;
        aVar3.c((k[]) Arrays.copyOf(kVarArr3, kVarArr3.length));
        aVar3.f(k0Var2, k0Var, k0.TLS_1_1, k0.TLS_1_0);
        aVar3.d(true);
        aVar3.a();
        h = new n(false, false, null, null);
    }

    public n(boolean z, boolean z2, String[] strArr, String[] strArr2) {
        this.f1400a = z;
        this.f1401b = z2;
        this.f1402c = strArr;
        this.f1403d = strArr2;
    }

    public final List<k> a() {
        String[] strArr = this.f1402c;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(k.t.b(str));
        }
        return c.g.e.h(arrayList);
    }

    public final boolean b(SSLSocket sSLSocket) {
        c.j.b.d.d(sSLSocket, "socket");
        if (!this.f1400a) {
            return false;
        }
        String[] strArr = this.f1403d;
        if (strArr != null && !d.n0.c.l(strArr, sSLSocket.getEnabledProtocols(), c.h.a.f1275b)) {
            return false;
        }
        String[] strArr2 = this.f1402c;
        if (strArr2 == null) {
            return true;
        }
        String[] enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
        k.b bVar = k.t;
        return d.n0.c.l(strArr2, enabledCipherSuites, k.f1389b);
    }

    public final List<k0> c() {
        String[] strArr = this.f1403d;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(k0.i.a(str));
        }
        return c.g.e.h(arrayList);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof n)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        boolean z = this.f1400a;
        n nVar = (n) obj;
        if (z != nVar.f1400a) {
            return false;
        }
        return !z || (Arrays.equals(this.f1402c, nVar.f1402c) && Arrays.equals(this.f1403d, nVar.f1403d) && this.f1401b == nVar.f1401b);
    }

    public int hashCode() {
        if (!this.f1400a) {
            return 17;
        }
        String[] strArr = this.f1402c;
        int iHashCode = (527 + (strArr != null ? Arrays.hashCode(strArr) : 0)) * 31;
        String[] strArr2 = this.f1403d;
        return ((iHashCode + (strArr2 != null ? Arrays.hashCode(strArr2) : 0)) * 31) + (!this.f1401b ? 1 : 0);
    }

    public String toString() {
        if (!this.f1400a) {
            return "ConnectionSpec()";
        }
        return "ConnectionSpec(cipherSuites=" + Objects.toString(a(), "[all enabled]") + ", tlsVersions=" + Objects.toString(c(), "[all enabled]") + ", supportsTlsExtensions=" + this.f1401b + ')';
    }
}
