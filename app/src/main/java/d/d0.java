package d;

import java.io.IOException;

/* loaded from: classes.dex */
public enum d0 {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2"),
    H2_PRIOR_KNOWLEDGE("h2_prior_knowledge"),
    QUIC("quic");

    public static final a j = new a(null);

    /* renamed from: b, reason: collision with root package name */
    public final String f1344b;

    public static final class a {
        public a(c.j.b.c cVar) {
        }

        public final d0 a(String str) throws IOException {
            d0 d0Var = d0.QUIC;
            d0 d0Var2 = d0.SPDY_3;
            d0 d0Var3 = d0.HTTP_2;
            d0 d0Var4 = d0.H2_PRIOR_KNOWLEDGE;
            d0 d0Var5 = d0.HTTP_1_1;
            d0 d0Var6 = d0.HTTP_1_0;
            c.j.b.d.d(str, "protocol");
            if (c.j.b.d.a(str, d0Var6.f1344b)) {
                return d0Var6;
            }
            if (c.j.b.d.a(str, d0Var5.f1344b)) {
                return d0Var5;
            }
            if (c.j.b.d.a(str, d0Var4.f1344b)) {
                return d0Var4;
            }
            if (c.j.b.d.a(str, d0Var3.f1344b)) {
                return d0Var3;
            }
            if (c.j.b.d.a(str, d0Var2.f1344b)) {
                return d0Var2;
            }
            if (c.j.b.d.a(str, d0Var.f1344b)) {
                return d0Var;
            }
            throw new IOException(b.a.a.a.a.b("Unexpected protocol: ", str));
        }
    }

    d0(String str) {
        this.f1344b = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f1344b;
    }
}
