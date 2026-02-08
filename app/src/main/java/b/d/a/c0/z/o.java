package b.d.a.c0.z;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;

/* loaded from: classes.dex */
public final class o {
    public static final b.d.a.z<String> A;
    public static final b.d.a.z<BigDecimal> B;
    public static final b.d.a.z<BigInteger> C;
    public static final b.d.a.a0 D;
    public static final b.d.a.z<StringBuilder> E;
    public static final b.d.a.a0 F;
    public static final b.d.a.z<StringBuffer> G;
    public static final b.d.a.a0 H;
    public static final b.d.a.z<URL> I;
    public static final b.d.a.a0 J;
    public static final b.d.a.z<URI> K;
    public static final b.d.a.a0 L;
    public static final b.d.a.z<InetAddress> M;
    public static final b.d.a.a0 N;
    public static final b.d.a.z<UUID> O;
    public static final b.d.a.a0 P;
    public static final b.d.a.z<Currency> Q;
    public static final b.d.a.a0 R;
    public static final b.d.a.a0 S;
    public static final b.d.a.z<Calendar> T;
    public static final b.d.a.a0 U;
    public static final b.d.a.z<Locale> V;
    public static final b.d.a.a0 W;
    public static final b.d.a.z<b.d.a.o> X;
    public static final b.d.a.a0 Y;
    public static final b.d.a.a0 Z;

    /* renamed from: a */
    public static final b.d.a.z<Class> f1202a;

    /* renamed from: b */
    public static final b.d.a.a0 f1203b;

    /* renamed from: c */
    public static final b.d.a.z<BitSet> f1204c;

    /* renamed from: d */
    public static final b.d.a.a0 f1205d;

    /* renamed from: e */
    public static final b.d.a.z<Boolean> f1206e;
    public static final b.d.a.z<Boolean> f;
    public static final b.d.a.a0 g;
    public static final b.d.a.z<Number> h;
    public static final b.d.a.a0 i;
    public static final b.d.a.z<Number> j;
    public static final b.d.a.a0 k;
    public static final b.d.a.z<Number> l;
    public static final b.d.a.a0 m;
    public static final b.d.a.z<AtomicInteger> n;
    public static final b.d.a.a0 o;
    public static final b.d.a.z<AtomicBoolean> p;
    public static final b.d.a.a0 q;
    public static final b.d.a.z<AtomicIntegerArray> r;
    public static final b.d.a.a0 s;
    public static final b.d.a.z<Number> t;
    public static final b.d.a.z<Number> u;
    public static final b.d.a.z<Number> v;
    public static final b.d.a.z<Number> w;
    public static final b.d.a.a0 x;
    public static final b.d.a.z<Character> y;
    public static final b.d.a.a0 z;

    public class a extends b.d.a.z<AtomicIntegerArray> {
        @Override // b.d.a.z
        public AtomicIntegerArray a(b.d.a.e0.a aVar) throws IOException {
            ArrayList arrayList = new ArrayList();
            aVar.y();
            while (aVar.G()) {
                try {
                    arrayList.add(Integer.valueOf(aVar.L()));
                } catch (NumberFormatException e2) {
                    throw new b.d.a.w(e2);
                }
            }
            aVar.C();
            int size = arrayList.size();
            AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
            for (int i = 0; i < size; i++) {
                atomicIntegerArray.set(i, ((Integer) arrayList.get(i)).intValue());
            }
            return atomicIntegerArray;
        }

        @Override // b.d.a.z
        public void b(b.d.a.e0.c cVar, AtomicIntegerArray atomicIntegerArray) throws IOException {
            cVar.z();
            int length = atomicIntegerArray.length();
            for (int i = 0; i < length; i++) {
                cVar.L(r6.get(i));
            }
            cVar.C();
        }
    }

    public class a0 extends b.d.a.z<Number> {
        @Override // b.d.a.z
        public Number a(b.d.a.e0.a aVar) throws IOException {
            if (aVar.T() == b.d.a.e0.b.NULL) {
                aVar.P();
                return null;
            }
            try {
                return Short.valueOf((short) aVar.L());
            } catch (NumberFormatException e2) {
                throw new b.d.a.w(e2);
            }
        }

        @Override // b.d.a.z
        public void b(b.d.a.e0.c cVar, Number number) throws IOException {
            cVar.N(number);
        }
    }

    public class b extends b.d.a.z<Number> {
        @Override // b.d.a.z
        public Number a(b.d.a.e0.a aVar) throws IOException {
            if (aVar.T() == b.d.a.e0.b.NULL) {
                aVar.P();
                return null;
            }
            try {
                return Long.valueOf(aVar.M());
            } catch (NumberFormatException e2) {
                throw new b.d.a.w(e2);
            }
        }

        @Override // b.d.a.z
        public void b(b.d.a.e0.c cVar, Number number) throws IOException {
            cVar.N(number);
        }
    }

    public class b0 extends b.d.a.z<Number> {
        @Override // b.d.a.z
        public Number a(b.d.a.e0.a aVar) throws IOException {
            if (aVar.T() == b.d.a.e0.b.NULL) {
                aVar.P();
                return null;
            }
            try {
                return Integer.valueOf(aVar.L());
            } catch (NumberFormatException e2) {
                throw new b.d.a.w(e2);
            }
        }

        @Override // b.d.a.z
        public void b(b.d.a.e0.c cVar, Number number) throws IOException {
            cVar.N(number);
        }
    }

    public class c extends b.d.a.z<Number> {
        @Override // b.d.a.z
        public Number a(b.d.a.e0.a aVar) throws IOException {
            if (aVar.T() != b.d.a.e0.b.NULL) {
                return Float.valueOf((float) aVar.K());
            }
            aVar.P();
            return null;
        }

        @Override // b.d.a.z
        public void b(b.d.a.e0.c cVar, Number number) throws IOException {
            cVar.N(number);
        }
    }

    public class c0 extends b.d.a.z<AtomicInteger> {
        @Override // b.d.a.z
        public AtomicInteger a(b.d.a.e0.a aVar) {
            try {
                return new AtomicInteger(aVar.L());
            } catch (NumberFormatException e2) {
                throw new b.d.a.w(e2);
            }
        }

        @Override // b.d.a.z
        public void b(b.d.a.e0.c cVar, AtomicInteger atomicInteger) throws IOException {
            cVar.L(atomicInteger.get());
        }
    }

    public class d extends b.d.a.z<Number> {
        @Override // b.d.a.z
        public Number a(b.d.a.e0.a aVar) throws IOException {
            if (aVar.T() != b.d.a.e0.b.NULL) {
                return Double.valueOf(aVar.K());
            }
            aVar.P();
            return null;
        }

        @Override // b.d.a.z
        public void b(b.d.a.e0.c cVar, Number number) throws IOException {
            cVar.N(number);
        }
    }

    public class d0 extends b.d.a.z<AtomicBoolean> {
        @Override // b.d.a.z
        public AtomicBoolean a(b.d.a.e0.a aVar) {
            return new AtomicBoolean(aVar.J());
        }

        @Override // b.d.a.z
        public void b(b.d.a.e0.c cVar, AtomicBoolean atomicBoolean) throws IOException {
            cVar.P(atomicBoolean.get());
        }
    }

    public class e extends b.d.a.z<Number> {
        @Override // b.d.a.z
        public Number a(b.d.a.e0.a aVar) throws IOException {
            b.d.a.e0.b bVarT = aVar.T();
            int iOrdinal = bVarT.ordinal();
            if (iOrdinal == 5 || iOrdinal == 6) {
                return new b.d.a.c0.r(aVar.R());
            }
            if (iOrdinal == 8) {
                aVar.P();
                return null;
            }
            throw new b.d.a.w("Expecting number, got: " + bVarT);
        }

        @Override // b.d.a.z
        public void b(b.d.a.e0.c cVar, Number number) throws IOException {
            cVar.N(number);
        }
    }

    public static final class e0<T extends Enum<T>> extends b.d.a.z<T> {

        /* renamed from: a */
        public final Map<String, T> f1207a = new HashMap();

        /* renamed from: b */
        public final Map<T, String> f1208b = new HashMap();

        public e0(Class<T> cls) {
            try {
                for (T t : cls.getEnumConstants()) {
                    String strName = t.name();
                    b.d.a.b0.b bVar = (b.d.a.b0.b) cls.getField(strName).getAnnotation(b.d.a.b0.b.class);
                    if (bVar != null) {
                        strName = bVar.value();
                        for (String str : bVar.alternate()) {
                            this.f1207a.put(str, t);
                        }
                    }
                    this.f1207a.put(strName, t);
                    this.f1208b.put(t, strName);
                }
            } catch (NoSuchFieldException e2) {
                throw new AssertionError(e2);
            }
        }

        @Override // b.d.a.z
        public Object a(b.d.a.e0.a aVar) throws IOException {
            if (aVar.T() != b.d.a.e0.b.NULL) {
                return this.f1207a.get(aVar.R());
            }
            aVar.P();
            return null;
        }

        @Override // b.d.a.z
        public void b(b.d.a.e0.c cVar, Object obj) throws IOException {
            Enum r3 = (Enum) obj;
            cVar.O(r3 == null ? null : this.f1208b.get(r3));
        }
    }

    public class f extends b.d.a.z<Character> {
        @Override // b.d.a.z
        public Character a(b.d.a.e0.a aVar) throws IOException {
            if (aVar.T() == b.d.a.e0.b.NULL) {
                aVar.P();
                return null;
            }
            String strR = aVar.R();
            if (strR.length() == 1) {
                return Character.valueOf(strR.charAt(0));
            }
            throw new b.d.a.w(b.a.a.a.a.b("Expecting character, got: ", strR));
        }

        @Override // b.d.a.z
        public void b(b.d.a.e0.c cVar, Character ch) throws IOException {
            Character ch2 = ch;
            cVar.O(ch2 == null ? null : String.valueOf(ch2));
        }
    }

    public class g extends b.d.a.z<String> {
        @Override // b.d.a.z
        public String a(b.d.a.e0.a aVar) throws IOException {
            b.d.a.e0.b bVarT = aVar.T();
            if (bVarT != b.d.a.e0.b.NULL) {
                return bVarT == b.d.a.e0.b.BOOLEAN ? Boolean.toString(aVar.J()) : aVar.R();
            }
            aVar.P();
            return null;
        }

        @Override // b.d.a.z
        public void b(b.d.a.e0.c cVar, String str) throws IOException {
            cVar.O(str);
        }
    }

    public class h extends b.d.a.z<BigDecimal> {
        @Override // b.d.a.z
        public BigDecimal a(b.d.a.e0.a aVar) throws IOException {
            if (aVar.T() == b.d.a.e0.b.NULL) {
                aVar.P();
                return null;
            }
            try {
                return new BigDecimal(aVar.R());
            } catch (NumberFormatException e2) {
                throw new b.d.a.w(e2);
            }
        }

        @Override // b.d.a.z
        public void b(b.d.a.e0.c cVar, BigDecimal bigDecimal) throws IOException {
            cVar.N(bigDecimal);
        }
    }

    public class i extends b.d.a.z<BigInteger> {
        @Override // b.d.a.z
        public BigInteger a(b.d.a.e0.a aVar) throws IOException {
            if (aVar.T() == b.d.a.e0.b.NULL) {
                aVar.P();
                return null;
            }
            try {
                return new BigInteger(aVar.R());
            } catch (NumberFormatException e2) {
                throw new b.d.a.w(e2);
            }
        }

        @Override // b.d.a.z
        public void b(b.d.a.e0.c cVar, BigInteger bigInteger) throws IOException {
            cVar.N(bigInteger);
        }
    }

    public class j extends b.d.a.z<StringBuilder> {
        @Override // b.d.a.z
        public StringBuilder a(b.d.a.e0.a aVar) throws IOException {
            if (aVar.T() != b.d.a.e0.b.NULL) {
                return new StringBuilder(aVar.R());
            }
            aVar.P();
            return null;
        }

        @Override // b.d.a.z
        public void b(b.d.a.e0.c cVar, StringBuilder sb) throws IOException {
            StringBuilder sb2 = sb;
            cVar.O(sb2 == null ? null : sb2.toString());
        }
    }

    public class k extends b.d.a.z<Class> {
        @Override // b.d.a.z
        public Class a(b.d.a.e0.a aVar) {
            throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?");
        }

        @Override // b.d.a.z
        public void b(b.d.a.e0.c cVar, Class cls) {
            StringBuilder sbE = b.a.a.a.a.e("Attempted to serialize java.lang.Class: ");
            sbE.append(cls.getName());
            sbE.append(". Forgot to register a type adapter?");
            throw new UnsupportedOperationException(sbE.toString());
        }
    }

    public class l extends b.d.a.z<StringBuffer> {
        @Override // b.d.a.z
        public StringBuffer a(b.d.a.e0.a aVar) throws IOException {
            if (aVar.T() != b.d.a.e0.b.NULL) {
                return new StringBuffer(aVar.R());
            }
            aVar.P();
            return null;
        }

        @Override // b.d.a.z
        public void b(b.d.a.e0.c cVar, StringBuffer stringBuffer) throws IOException {
            StringBuffer stringBuffer2 = stringBuffer;
            cVar.O(stringBuffer2 == null ? null : stringBuffer2.toString());
        }
    }

    public class m extends b.d.a.z<URL> {
        @Override // b.d.a.z
        public URL a(b.d.a.e0.a aVar) throws IOException {
            if (aVar.T() == b.d.a.e0.b.NULL) {
                aVar.P();
                return null;
            }
            String strR = aVar.R();
            if ("null".equals(strR)) {
                return null;
            }
            return new URL(strR);
        }

        @Override // b.d.a.z
        public void b(b.d.a.e0.c cVar, URL url) throws IOException {
            URL url2 = url;
            cVar.O(url2 == null ? null : url2.toExternalForm());
        }
    }

    public class n extends b.d.a.z<URI> {
        @Override // b.d.a.z
        public URI a(b.d.a.e0.a aVar) throws IOException {
            if (aVar.T() == b.d.a.e0.b.NULL) {
                aVar.P();
                return null;
            }
            try {
                String strR = aVar.R();
                if ("null".equals(strR)) {
                    return null;
                }
                return new URI(strR);
            } catch (URISyntaxException e2) {
                throw new b.d.a.p(e2);
            }
        }

        @Override // b.d.a.z
        public void b(b.d.a.e0.c cVar, URI uri) throws IOException {
            URI uri2 = uri;
            cVar.O(uri2 == null ? null : uri2.toASCIIString());
        }
    }

    /* renamed from: b.d.a.c0.z.o$o */
    public class C0027o extends b.d.a.z<InetAddress> {
        @Override // b.d.a.z
        public InetAddress a(b.d.a.e0.a aVar) throws IOException {
            if (aVar.T() != b.d.a.e0.b.NULL) {
                return InetAddress.getByName(aVar.R());
            }
            aVar.P();
            return null;
        }

        @Override // b.d.a.z
        public void b(b.d.a.e0.c cVar, InetAddress inetAddress) throws IOException {
            InetAddress inetAddress2 = inetAddress;
            cVar.O(inetAddress2 == null ? null : inetAddress2.getHostAddress());
        }
    }

    public class p extends b.d.a.z<UUID> {
        @Override // b.d.a.z
        public UUID a(b.d.a.e0.a aVar) throws IOException {
            if (aVar.T() != b.d.a.e0.b.NULL) {
                return UUID.fromString(aVar.R());
            }
            aVar.P();
            return null;
        }

        @Override // b.d.a.z
        public void b(b.d.a.e0.c cVar, UUID uuid) throws IOException {
            UUID uuid2 = uuid;
            cVar.O(uuid2 == null ? null : uuid2.toString());
        }
    }

    public class q extends b.d.a.z<Currency> {
        @Override // b.d.a.z
        public Currency a(b.d.a.e0.a aVar) {
            return Currency.getInstance(aVar.R());
        }

        @Override // b.d.a.z
        public void b(b.d.a.e0.c cVar, Currency currency) throws IOException {
            cVar.O(currency.getCurrencyCode());
        }
    }

    public class r implements b.d.a.a0 {

        public class a extends b.d.a.z<Timestamp> {

            /* renamed from: a */
            public final /* synthetic */ b.d.a.z f1209a;

            public a(r rVar, b.d.a.z zVar) {
                this.f1209a = zVar;
            }

            @Override // b.d.a.z
            public Timestamp a(b.d.a.e0.a aVar) {
                Date date = (Date) this.f1209a.a(aVar);
                if (date != null) {
                    return new Timestamp(date.getTime());
                }
                return null;
            }

            @Override // b.d.a.z
            public void b(b.d.a.e0.c cVar, Timestamp timestamp) {
                this.f1209a.b(cVar, timestamp);
            }
        }

        @Override // b.d.a.a0
        public <T> b.d.a.z<T> a(b.d.a.j jVar, b.d.a.d0.a<T> aVar) {
            if (aVar.f1223a != Timestamp.class) {
                return null;
            }
            if (jVar != null) {
                return new a(this, jVar.c(new b.d.a.d0.a<>(Date.class)));
            }
            throw null;
        }
    }

    public class s extends b.d.a.z<Calendar> {
        @Override // b.d.a.z
        public Calendar a(b.d.a.e0.a aVar) throws IOException, NumberFormatException {
            if (aVar.T() == b.d.a.e0.b.NULL) {
                aVar.P();
                return null;
            }
            aVar.z();
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            while (aVar.T() != b.d.a.e0.b.END_OBJECT) {
                String strN = aVar.N();
                int iL = aVar.L();
                if ("year".equals(strN)) {
                    i = iL;
                } else if ("month".equals(strN)) {
                    i2 = iL;
                } else if ("dayOfMonth".equals(strN)) {
                    i3 = iL;
                } else if ("hourOfDay".equals(strN)) {
                    i4 = iL;
                } else if ("minute".equals(strN)) {
                    i5 = iL;
                } else if ("second".equals(strN)) {
                    i6 = iL;
                }
            }
            aVar.D();
            return new GregorianCalendar(i, i2, i3, i4, i5, i6);
        }

        @Override // b.d.a.z
        public void b(b.d.a.e0.c cVar, Calendar calendar) throws IOException {
            if (calendar == null) {
                cVar.G();
                return;
            }
            cVar.A();
            cVar.E("year");
            cVar.L(r4.get(1));
            cVar.E("month");
            cVar.L(r4.get(2));
            cVar.E("dayOfMonth");
            cVar.L(r4.get(5));
            cVar.E("hourOfDay");
            cVar.L(r4.get(11));
            cVar.E("minute");
            cVar.L(r4.get(12));
            cVar.E("second");
            cVar.L(r4.get(13));
            cVar.D();
        }
    }

    public class t extends b.d.a.z<Locale> {
        @Override // b.d.a.z
        public Locale a(b.d.a.e0.a aVar) throws IOException {
            if (aVar.T() == b.d.a.e0.b.NULL) {
                aVar.P();
                return null;
            }
            StringTokenizer stringTokenizer = new StringTokenizer(aVar.R(), "_");
            String strNextToken = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            String strNextToken2 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            String strNextToken3 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            if (strNextToken2 == null && strNextToken3 == null) {
                return new Locale(strNextToken);
            }
            return strNextToken3 == null ? new Locale(strNextToken, strNextToken2) : new Locale(strNextToken, strNextToken2, strNextToken3);
        }

        @Override // b.d.a.z
        public void b(b.d.a.e0.c cVar, Locale locale) throws IOException {
            Locale locale2 = locale;
            cVar.O(locale2 == null ? null : locale2.toString());
        }
    }

    public class u extends b.d.a.z<b.d.a.o> {
        @Override // b.d.a.z
        /* renamed from: c */
        public b.d.a.o a(b.d.a.e0.a aVar) throws IOException {
            int iOrdinal = aVar.T().ordinal();
            if (iOrdinal == 0) {
                b.d.a.l lVar = new b.d.a.l();
                aVar.y();
                while (aVar.G()) {
                    lVar.f1246b.add(a(aVar));
                }
                aVar.C();
                return lVar;
            }
            if (iOrdinal == 2) {
                b.d.a.r rVar = new b.d.a.r();
                aVar.z();
                while (aVar.G()) {
                    rVar.f1248a.put(aVar.N(), a(aVar));
                }
                aVar.D();
                return rVar;
            }
            if (iOrdinal == 5) {
                return new b.d.a.t(aVar.R());
            }
            if (iOrdinal == 6) {
                return new b.d.a.t(new b.d.a.c0.r(aVar.R()));
            }
            if (iOrdinal == 7) {
                return new b.d.a.t(Boolean.valueOf(aVar.J()));
            }
            if (iOrdinal != 8) {
                throw new IllegalArgumentException();
            }
            aVar.P();
            return b.d.a.q.f1247a;
        }

        @Override // b.d.a.z
        /* renamed from: d */
        public void b(b.d.a.e0.c cVar, b.d.a.o oVar) throws IOException {
            if (oVar == null || (oVar instanceof b.d.a.q)) {
                cVar.G();
                return;
            }
            if (oVar instanceof b.d.a.t) {
                b.d.a.t tVarA = oVar.a();
                Object obj = tVarA.f1249a;
                if (obj instanceof Number) {
                    cVar.N(tVarA.c());
                    return;
                } else if (obj instanceof Boolean) {
                    cVar.P(tVarA.b());
                    return;
                } else {
                    cVar.O(tVarA.d());
                    return;
                }
            }
            boolean z = oVar instanceof b.d.a.l;
            if (z) {
                cVar.z();
                if (!z) {
                    throw new IllegalStateException("Not a JSON Array: " + oVar);
                }
                Iterator<b.d.a.o> it = ((b.d.a.l) oVar).iterator();
                while (it.hasNext()) {
                    b(cVar, it.next());
                }
                cVar.C();
                return;
            }
            boolean z2 = oVar instanceof b.d.a.r;
            if (!z2) {
                StringBuilder sbE = b.a.a.a.a.e("Couldn't write ");
                sbE.append(oVar.getClass());
                throw new IllegalArgumentException(sbE.toString());
            }
            cVar.A();
            if (!z2) {
                throw new IllegalStateException("Not a JSON Object: " + oVar);
            }
            for (Map.Entry<String, b.d.a.o> entry : ((b.d.a.r) oVar).f1248a.entrySet()) {
                cVar.E(entry.getKey());
                b(cVar, entry.getValue());
            }
            cVar.D();
        }
    }

    public class v extends b.d.a.z<BitSet> {
        /* JADX WARN: Removed duplicated region for block: B:55:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:56:0x004e  */
        @Override // b.d.a.z
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.util.BitSet a(b.d.a.e0.a r7) throws java.io.IOException {
            /*
                r6 = this;
                java.util.BitSet r0 = new java.util.BitSet
                r0.<init>()
                r7.y()
                b.d.a.e0.b r1 = r7.T()
                r2 = 0
                r3 = r2
            Le:
                b.d.a.e0.b r4 = b.d.a.e0.b.END_ARRAY
                if (r1 == r4) goto L67
                int r4 = r1.ordinal()
                r5 = 5
                if (r4 == r5) goto L42
                r5 = 6
                if (r4 == r5) goto L3b
                r5 = 7
                if (r4 != r5) goto L24
                boolean r1 = r7.J()
                goto L4f
            L24:
                b.d.a.w r7 = new b.d.a.w
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r2 = "Invalid bitset value type: "
                r0.append(r2)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r7.<init>(r0)
                throw r7
            L3b:
                int r1 = r7.L()
                if (r1 == 0) goto L4e
                goto L4c
            L42:
                java.lang.String r1 = r7.R()
                int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.NumberFormatException -> L5b
                if (r1 == 0) goto L4e
            L4c:
                r1 = 1
                goto L4f
            L4e:
                r1 = r2
            L4f:
                if (r1 == 0) goto L54
                r0.set(r3)
            L54:
                int r3 = r3 + 1
                b.d.a.e0.b r1 = r7.T()
                goto Le
            L5b:
                b.d.a.w r7 = new b.d.a.w
                java.lang.String r0 = "Error: Expecting: bitset number value (1, 0), Found: "
                java.lang.String r0 = b.a.a.a.a.b(r0, r1)
                r7.<init>(r0)
                throw r7
            L67:
                r7.C()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: b.d.a.c0.z.o.v.a(b.d.a.e0.a):java.lang.Object");
        }

        @Override // b.d.a.z
        public void b(b.d.a.e0.c cVar, BitSet bitSet) throws IOException {
            BitSet bitSet2 = bitSet;
            cVar.z();
            int length = bitSet2.length();
            for (int i = 0; i < length; i++) {
                cVar.L(bitSet2.get(i) ? 1L : 0L);
            }
            cVar.C();
        }
    }

    public class w implements b.d.a.a0 {
        @Override // b.d.a.a0
        public <T> b.d.a.z<T> a(b.d.a.j jVar, b.d.a.d0.a<T> aVar) {
            Class<? super T> superclass = aVar.f1223a;
            if (!Enum.class.isAssignableFrom(superclass) || superclass == Enum.class) {
                return null;
            }
            if (!superclass.isEnum()) {
                superclass = superclass.getSuperclass();
            }
            return new e0(superclass);
        }
    }

    public class x extends b.d.a.z<Boolean> {
        @Override // b.d.a.z
        public Boolean a(b.d.a.e0.a aVar) throws IOException {
            b.d.a.e0.b bVarT = aVar.T();
            if (bVarT != b.d.a.e0.b.NULL) {
                return Boolean.valueOf(bVarT == b.d.a.e0.b.STRING ? Boolean.parseBoolean(aVar.R()) : aVar.J());
            }
            aVar.P();
            return null;
        }

        @Override // b.d.a.z
        public void b(b.d.a.e0.c cVar, Boolean bool) throws IOException {
            cVar.M(bool);
        }
    }

    public class y extends b.d.a.z<Boolean> {
        @Override // b.d.a.z
        public Boolean a(b.d.a.e0.a aVar) throws IOException {
            if (aVar.T() != b.d.a.e0.b.NULL) {
                return Boolean.valueOf(aVar.R());
            }
            aVar.P();
            return null;
        }

        @Override // b.d.a.z
        public void b(b.d.a.e0.c cVar, Boolean bool) throws IOException {
            Boolean bool2 = bool;
            cVar.O(bool2 == null ? "null" : bool2.toString());
        }
    }

    public class z extends b.d.a.z<Number> {
        @Override // b.d.a.z
        public Number a(b.d.a.e0.a aVar) throws IOException {
            if (aVar.T() == b.d.a.e0.b.NULL) {
                aVar.P();
                return null;
            }
            try {
                return Byte.valueOf((byte) aVar.L());
            } catch (NumberFormatException e2) {
                throw new b.d.a.w(e2);
            }
        }

        @Override // b.d.a.z
        public void b(b.d.a.e0.c cVar, Number number) throws IOException {
            cVar.N(number);
        }
    }

    static {
        b.d.a.y yVar = new b.d.a.y(new k());
        f1202a = yVar;
        f1203b = new b.d.a.c0.z.p(Class.class, yVar);
        b.d.a.y yVar2 = new b.d.a.y(new v());
        f1204c = yVar2;
        f1205d = new b.d.a.c0.z.p(BitSet.class, yVar2);
        f1206e = new x();
        f = new y();
        g = new b.d.a.c0.z.q(Boolean.TYPE, Boolean.class, f1206e);
        h = new z();
        i = new b.d.a.c0.z.q(Byte.TYPE, Byte.class, h);
        j = new a0();
        k = new b.d.a.c0.z.q(Short.TYPE, Short.class, j);
        l = new b0();
        m = new b.d.a.c0.z.q(Integer.TYPE, Integer.class, l);
        b.d.a.y yVar3 = new b.d.a.y(new c0());
        n = yVar3;
        o = new b.d.a.c0.z.p(AtomicInteger.class, yVar3);
        b.d.a.y yVar4 = new b.d.a.y(new d0());
        p = yVar4;
        q = new b.d.a.c0.z.p(AtomicBoolean.class, yVar4);
        b.d.a.y yVar5 = new b.d.a.y(new a());
        r = yVar5;
        s = new b.d.a.c0.z.p(AtomicIntegerArray.class, yVar5);
        t = new b();
        u = new c();
        v = new d();
        e eVar = new e();
        w = eVar;
        x = new b.d.a.c0.z.p(Number.class, eVar);
        y = new f();
        z = new b.d.a.c0.z.q(Character.TYPE, Character.class, y);
        A = new g();
        B = new h();
        C = new i();
        D = new b.d.a.c0.z.p(String.class, A);
        j jVar = new j();
        E = jVar;
        F = new b.d.a.c0.z.p(StringBuilder.class, jVar);
        l lVar = new l();
        G = lVar;
        H = new b.d.a.c0.z.p(StringBuffer.class, lVar);
        m mVar = new m();
        I = mVar;
        J = new b.d.a.c0.z.p(URL.class, mVar);
        n nVar = new n();
        K = nVar;
        L = new b.d.a.c0.z.p(URI.class, nVar);
        C0027o c0027o = new C0027o();
        M = c0027o;
        N = new b.d.a.c0.z.s(InetAddress.class, c0027o);
        p pVar = new p();
        O = pVar;
        P = new b.d.a.c0.z.p(UUID.class, pVar);
        b.d.a.y yVar6 = new b.d.a.y(new q());
        Q = yVar6;
        R = new b.d.a.c0.z.p(Currency.class, yVar6);
        S = new r();
        s sVar = new s();
        T = sVar;
        U = new b.d.a.c0.z.r(Calendar.class, GregorianCalendar.class, sVar);
        t tVar = new t();
        V = tVar;
        W = new b.d.a.c0.z.p(Locale.class, tVar);
        u uVar = new u();
        X = uVar;
        Y = new b.d.a.c0.z.s(b.d.a.o.class, uVar);
        Z = new w();
    }
}
