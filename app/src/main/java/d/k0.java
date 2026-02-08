package d;

/* loaded from: classes.dex */
public enum k0 {
    TLS_1_3("TLSv1.3"),
    TLS_1_2("TLSv1.2"),
    TLS_1_1("TLSv1.1"),
    TLS_1_0("TLSv1"),
    SSL_3_0("SSLv3");

    public static final a i = new a(null);

    /* renamed from: b, reason: collision with root package name */
    public final String f1397b;

    public static final class a {
        public a(c.j.b.c cVar) {
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public final k0 a(String str) {
            c.j.b.d.d(str, "javaName");
            int iHashCode = str.hashCode();
            if (iHashCode != 79201641) {
                if (iHashCode != 79923350) {
                    switch (iHashCode) {
                        case -503070503:
                            if (str.equals("TLSv1.1")) {
                                return k0.TLS_1_1;
                            }
                            break;
                        case -503070502:
                            if (str.equals("TLSv1.2")) {
                                return k0.TLS_1_2;
                            }
                            break;
                        case -503070501:
                            if (str.equals("TLSv1.3")) {
                                return k0.TLS_1_3;
                            }
                            break;
                    }
                } else if (str.equals("TLSv1")) {
                    return k0.TLS_1_0;
                }
            } else if (str.equals("SSLv3")) {
                return k0.SSL_3_0;
            }
            throw new IllegalArgumentException(b.a.a.a.a.b("Unexpected TLS version: ", str));
        }
    }

    k0(String str) {
        this.f1397b = str;
    }
}
