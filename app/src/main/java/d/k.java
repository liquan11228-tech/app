package d;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: d, reason: collision with root package name */
    public static final k f1391d;

    /* renamed from: e, reason: collision with root package name */
    public static final k f1392e;
    public static final k f;
    public static final k g;
    public static final k h;
    public static final k i;
    public static final k j;
    public static final k k;
    public static final k l;
    public static final k m;
    public static final k n;
    public static final k o;
    public static final k p;
    public static final k q;
    public static final k r;
    public static final k s;

    /* renamed from: a, reason: collision with root package name */
    public final String f1393a;
    public static final b t = new b(null);

    /* renamed from: b, reason: collision with root package name */
    public static final Comparator<String> f1389b = new a();

    /* renamed from: c, reason: collision with root package name */
    public static final Map<String, k> f1390c = new LinkedHashMap();

    public static final class a implements Comparator<String> {
        /* JADX WARN: Code restructure failed: missing block: B:20:?, code lost:
        
            return 1;
         */
        @Override // java.util.Comparator
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public int compare(java.lang.String r7, java.lang.String r8) {
            /*
                r6 = this;
                java.lang.String r7 = (java.lang.String) r7
                java.lang.String r8 = (java.lang.String) r8
                java.lang.String r0 = "a"
                c.j.b.d.d(r7, r0)
                java.lang.String r0 = "b"
                c.j.b.d.d(r8, r0)
                int r0 = r7.length()
                int r1 = r8.length()
                int r0 = java.lang.Math.min(r0, r1)
                r1 = 4
            L1b:
                r2 = -1
                r3 = 1
                if (r1 >= r0) goto L35
                char r4 = r7.charAt(r1)
                char r5 = r8.charAt(r1)
                if (r4 == r5) goto L32
                int r7 = c.j.b.d.e(r4, r5)
                if (r7 >= 0) goto L30
                goto L43
            L30:
                r2 = r3
                goto L43
            L32:
                int r1 = r1 + 1
                goto L1b
            L35:
                int r7 = r7.length()
                int r8 = r8.length()
                if (r7 == r8) goto L42
                if (r7 >= r8) goto L30
                goto L43
            L42:
                r2 = 0
            L43:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: d.k.a.compare(java.lang.Object, java.lang.Object):int");
        }
    }

    public static final class b {
        public b(c.j.b.c cVar) {
        }

        public static final k a(b bVar, String str, int i) {
            if (bVar == null) {
                throw null;
            }
            k kVar = new k(str, null);
            k.f1390c.put(str, kVar);
            return kVar;
        }

        public final synchronized k b(String str) {
            k kVar;
            c.j.b.d.d(str, "javaName");
            kVar = k.f1390c.get(str);
            if (kVar == null) {
                kVar = k.f1390c.get(c(str));
                if (kVar == null) {
                    kVar = new k(str, null);
                }
                k.f1390c.put(str, kVar);
            }
            return kVar;
        }

        public final String c(String str) {
            StringBuilder sbE;
            if (c.m.e.z(str, "TLS_", false, 2)) {
                sbE = b.a.a.a.a.e("SSL_");
            } else {
                if (!c.m.e.z(str, "SSL_", false, 2)) {
                    return str;
                }
                sbE = b.a.a.a.a.e("TLS_");
            }
            String strSubstring = str.substring(4);
            c.j.b.d.c(strSubstring, "(this as java.lang.String).substring(startIndex)");
            sbE.append(strSubstring);
            return sbE.toString();
        }
    }

    static {
        b.a(t, "SSL_RSA_WITH_NULL_MD5", 1);
        b.a(t, "SSL_RSA_WITH_NULL_SHA", 2);
        b.a(t, "SSL_RSA_EXPORT_WITH_RC4_40_MD5", 3);
        b.a(t, "SSL_RSA_WITH_RC4_128_MD5", 4);
        b.a(t, "SSL_RSA_WITH_RC4_128_SHA", 5);
        b.a(t, "SSL_RSA_EXPORT_WITH_DES40_CBC_SHA", 8);
        b.a(t, "SSL_RSA_WITH_DES_CBC_SHA", 9);
        f1391d = b.a(t, "SSL_RSA_WITH_3DES_EDE_CBC_SHA", 10);
        b.a(t, "SSL_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA", 17);
        b.a(t, "SSL_DHE_DSS_WITH_DES_CBC_SHA", 18);
        b.a(t, "SSL_DHE_DSS_WITH_3DES_EDE_CBC_SHA", 19);
        b.a(t, "SSL_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA", 20);
        b.a(t, "SSL_DHE_RSA_WITH_DES_CBC_SHA", 21);
        b.a(t, "SSL_DHE_RSA_WITH_3DES_EDE_CBC_SHA", 22);
        b.a(t, "SSL_DH_anon_EXPORT_WITH_RC4_40_MD5", 23);
        b.a(t, "SSL_DH_anon_WITH_RC4_128_MD5", 24);
        b.a(t, "SSL_DH_anon_EXPORT_WITH_DES40_CBC_SHA", 25);
        b.a(t, "SSL_DH_anon_WITH_DES_CBC_SHA", 26);
        b.a(t, "SSL_DH_anon_WITH_3DES_EDE_CBC_SHA", 27);
        b.a(t, "TLS_KRB5_WITH_DES_CBC_SHA", 30);
        b.a(t, "TLS_KRB5_WITH_3DES_EDE_CBC_SHA", 31);
        b.a(t, "TLS_KRB5_WITH_RC4_128_SHA", 32);
        b.a(t, "TLS_KRB5_WITH_DES_CBC_MD5", 34);
        b.a(t, "TLS_KRB5_WITH_3DES_EDE_CBC_MD5", 35);
        b.a(t, "TLS_KRB5_WITH_RC4_128_MD5", 36);
        b.a(t, "TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA", 38);
        b.a(t, "TLS_KRB5_EXPORT_WITH_RC4_40_SHA", 40);
        b.a(t, "TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5", 41);
        b.a(t, "TLS_KRB5_EXPORT_WITH_RC4_40_MD5", 43);
        f1392e = b.a(t, "TLS_RSA_WITH_AES_128_CBC_SHA", 47);
        b.a(t, "TLS_DHE_DSS_WITH_AES_128_CBC_SHA", 50);
        b.a(t, "TLS_DHE_RSA_WITH_AES_128_CBC_SHA", 51);
        b.a(t, "TLS_DH_anon_WITH_AES_128_CBC_SHA", 52);
        f = b.a(t, "TLS_RSA_WITH_AES_256_CBC_SHA", 53);
        b.a(t, "TLS_DHE_DSS_WITH_AES_256_CBC_SHA", 56);
        b.a(t, "TLS_DHE_RSA_WITH_AES_256_CBC_SHA", 57);
        b.a(t, "TLS_DH_anon_WITH_AES_256_CBC_SHA", 58);
        b.a(t, "TLS_RSA_WITH_NULL_SHA256", 59);
        b.a(t, "TLS_RSA_WITH_AES_128_CBC_SHA256", 60);
        b.a(t, "TLS_RSA_WITH_AES_256_CBC_SHA256", 61);
        b.a(t, "TLS_DHE_DSS_WITH_AES_128_CBC_SHA256", 64);
        b.a(t, "TLS_RSA_WITH_CAMELLIA_128_CBC_SHA", 65);
        b.a(t, "TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA", 68);
        b.a(t, "TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA", 69);
        b.a(t, "TLS_DHE_RSA_WITH_AES_128_CBC_SHA256", 103);
        b.a(t, "TLS_DHE_DSS_WITH_AES_256_CBC_SHA256", 106);
        b.a(t, "TLS_DHE_RSA_WITH_AES_256_CBC_SHA256", 107);
        b.a(t, "TLS_DH_anon_WITH_AES_128_CBC_SHA256", 108);
        b.a(t, "TLS_DH_anon_WITH_AES_256_CBC_SHA256", 109);
        b.a(t, "TLS_RSA_WITH_CAMELLIA_256_CBC_SHA", 132);
        b.a(t, "TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA", 135);
        b.a(t, "TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA", 136);
        b.a(t, "TLS_PSK_WITH_RC4_128_SHA", 138);
        b.a(t, "TLS_PSK_WITH_3DES_EDE_CBC_SHA", 139);
        b.a(t, "TLS_PSK_WITH_AES_128_CBC_SHA", 140);
        b.a(t, "TLS_PSK_WITH_AES_256_CBC_SHA", 141);
        b.a(t, "TLS_RSA_WITH_SEED_CBC_SHA", 150);
        g = b.a(t, "TLS_RSA_WITH_AES_128_GCM_SHA256", 156);
        h = b.a(t, "TLS_RSA_WITH_AES_256_GCM_SHA384", 157);
        b.a(t, "TLS_DHE_RSA_WITH_AES_128_GCM_SHA256", 158);
        b.a(t, "TLS_DHE_RSA_WITH_AES_256_GCM_SHA384", 159);
        b.a(t, "TLS_DHE_DSS_WITH_AES_128_GCM_SHA256", 162);
        b.a(t, "TLS_DHE_DSS_WITH_AES_256_GCM_SHA384", 163);
        b.a(t, "TLS_DH_anon_WITH_AES_128_GCM_SHA256", 166);
        b.a(t, "TLS_DH_anon_WITH_AES_256_GCM_SHA384", 167);
        b.a(t, "TLS_EMPTY_RENEGOTIATION_INFO_SCSV", 255);
        b.a(t, "TLS_FALLBACK_SCSV", 22016);
        b.a(t, "TLS_ECDH_ECDSA_WITH_NULL_SHA", 49153);
        b.a(t, "TLS_ECDH_ECDSA_WITH_RC4_128_SHA", 49154);
        b.a(t, "TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA", 49155);
        b.a(t, "TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA", 49156);
        b.a(t, "TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA", 49157);
        b.a(t, "TLS_ECDHE_ECDSA_WITH_NULL_SHA", 49158);
        b.a(t, "TLS_ECDHE_ECDSA_WITH_RC4_128_SHA", 49159);
        b.a(t, "TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA", 49160);
        b.a(t, "TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA", 49161);
        b.a(t, "TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA", 49162);
        b.a(t, "TLS_ECDH_RSA_WITH_NULL_SHA", 49163);
        b.a(t, "TLS_ECDH_RSA_WITH_RC4_128_SHA", 49164);
        b.a(t, "TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA", 49165);
        b.a(t, "TLS_ECDH_RSA_WITH_AES_128_CBC_SHA", 49166);
        b.a(t, "TLS_ECDH_RSA_WITH_AES_256_CBC_SHA", 49167);
        b.a(t, "TLS_ECDHE_RSA_WITH_NULL_SHA", 49168);
        b.a(t, "TLS_ECDHE_RSA_WITH_RC4_128_SHA", 49169);
        b.a(t, "TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA", 49170);
        i = b.a(t, "TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA", 49171);
        j = b.a(t, "TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA", 49172);
        b.a(t, "TLS_ECDH_anon_WITH_NULL_SHA", 49173);
        b.a(t, "TLS_ECDH_anon_WITH_RC4_128_SHA", 49174);
        b.a(t, "TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA", 49175);
        b.a(t, "TLS_ECDH_anon_WITH_AES_128_CBC_SHA", 49176);
        b.a(t, "TLS_ECDH_anon_WITH_AES_256_CBC_SHA", 49177);
        b.a(t, "TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256", 49187);
        b.a(t, "TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384", 49188);
        b.a(t, "TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256", 49189);
        b.a(t, "TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384", 49190);
        b.a(t, "TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256", 49191);
        b.a(t, "TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384", 49192);
        b.a(t, "TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256", 49193);
        b.a(t, "TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384", 49194);
        k = b.a(t, "TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256", 49195);
        l = b.a(t, "TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384", 49196);
        b.a(t, "TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256", 49197);
        b.a(t, "TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384", 49198);
        m = b.a(t, "TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256", 49199);
        n = b.a(t, "TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384", 49200);
        b.a(t, "TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256", 49201);
        b.a(t, "TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384", 49202);
        b.a(t, "TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA", 49205);
        b.a(t, "TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA", 49206);
        o = b.a(t, "TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256", 52392);
        p = b.a(t, "TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256", 52393);
        b.a(t, "TLS_DHE_RSA_WITH_CHACHA20_POLY1305_SHA256", 52394);
        b.a(t, "TLS_ECDHE_PSK_WITH_CHACHA20_POLY1305_SHA256", 52396);
        q = b.a(t, "TLS_AES_128_GCM_SHA256", 4865);
        r = b.a(t, "TLS_AES_256_GCM_SHA384", 4866);
        s = b.a(t, "TLS_CHACHA20_POLY1305_SHA256", 4867);
        b.a(t, "TLS_AES_128_CCM_SHA256", 4868);
        b.a(t, "TLS_AES_128_CCM_8_SHA256", 4869);
    }

    public k(String str, c.j.b.c cVar) {
        this.f1393a = str;
    }

    public String toString() {
        return this.f1393a;
    }
}
