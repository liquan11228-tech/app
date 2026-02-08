package d.n0.j;

import a.b.k.h;
import d.n0.j.q;
import e.z;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: b */
    public static final Map<e.h, Integer> f1542b;

    /* renamed from: c */
    public static final d f1543c = new d();

    /* renamed from: a */
    public static final c[] f1541a = {new c(c.i, ""), new c(c.f, "GET"), new c(c.f, "POST"), new c(c.g, "/"), new c(c.g, "/index.html"), new c(c.h, "http"), new c(c.h, "https"), new c(c.f1537e, "200"), new c(c.f1537e, "204"), new c(c.f1537e, "206"), new c(c.f1537e, "304"), new c(c.f1537e, "400"), new c(c.f1537e, "404"), new c(c.f1537e, "500"), new c("accept-charset", ""), new c("accept-encoding", "gzip, deflate"), new c("accept-language", ""), new c("accept-ranges", ""), new c("accept", ""), new c("access-control-allow-origin", ""), new c("age", ""), new c("allow", ""), new c("authorization", ""), new c("cache-control", ""), new c("content-disposition", ""), new c("content-encoding", ""), new c("content-language", ""), new c("content-length", ""), new c("content-location", ""), new c("content-range", ""), new c("content-type", ""), new c("cookie", ""), new c("date", ""), new c("etag", ""), new c("expect", ""), new c("expires", ""), new c("from", ""), new c("host", ""), new c("if-match", ""), new c("if-modified-since", ""), new c("if-none-match", ""), new c("if-range", ""), new c("if-unmodified-since", ""), new c("last-modified", ""), new c("link", ""), new c("location", ""), new c("max-forwards", ""), new c("proxy-authenticate", ""), new c("proxy-authorization", ""), new c("range", ""), new c("referer", ""), new c("refresh", ""), new c("retry-after", ""), new c("server", ""), new c("set-cookie", ""), new c("strict-transport-security", ""), new c("transfer-encoding", ""), new c("user-agent", ""), new c("vary", ""), new c("via", ""), new c("www-authenticate", "")};

    public static final class a {

        /* renamed from: a */
        public final List<c> f1544a;

        /* renamed from: b */
        public final e.g f1545b;

        /* renamed from: c */
        public c[] f1546c;

        /* renamed from: d */
        public int f1547d;

        /* renamed from: e */
        public int f1548e;
        public int f;
        public final int g;
        public int h;

        public a(z zVar, int i, int i2, int i3) {
            i2 = (i3 & 4) != 0 ? i : i2;
            c.j.b.d.d(zVar, "source");
            this.g = i;
            this.h = i2;
            this.f1544a = new ArrayList();
            this.f1545b = h.i.h(zVar);
            this.f1546c = new c[8];
            this.f1547d = 7;
        }

        public final void a() {
            c[] cVarArr = this.f1546c;
            int length = cVarArr.length;
            c.j.b.d.d(cVarArr, "$this$fill");
            Arrays.fill(cVarArr, 0, length, (Object) null);
            this.f1547d = this.f1546c.length - 1;
            this.f1548e = 0;
            this.f = 0;
        }

        public final int b(int i) {
            return this.f1547d + 1 + i;
        }

        public final int c(int i) {
            int i2 = 0;
            if (i > 0) {
                int length = this.f1546c.length;
                while (true) {
                    length--;
                    if (length < this.f1547d || i <= 0) {
                        break;
                    }
                    c cVar = this.f1546c[length];
                    c.j.b.d.b(cVar);
                    int i3 = cVar.f1538a;
                    i -= i3;
                    this.f -= i3;
                    this.f1548e--;
                    i2++;
                }
                c[] cVarArr = this.f1546c;
                int i4 = this.f1547d;
                System.arraycopy(cVarArr, i4 + 1, cVarArr, i4 + 1 + i2, this.f1548e);
                this.f1547d += i2;
            }
            return i2;
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x000d  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final e.h d(int r5) throws java.io.IOException {
            /*
                r4 = this;
                r0 = 1
                if (r5 < 0) goto Ld
                d.n0.j.d r1 = d.n0.j.d.f1543c
                d.n0.j.c[] r1 = d.n0.j.d.f1541a
                int r1 = r1.length
                int r1 = r1 - r0
                if (r5 > r1) goto Ld
                r1 = r0
                goto Le
            Ld:
                r1 = 0
            Le:
                if (r1 == 0) goto L17
                d.n0.j.d r0 = d.n0.j.d.f1543c
                d.n0.j.c[] r0 = d.n0.j.d.f1541a
                r5 = r0[r5]
                goto L2e
            L17:
                d.n0.j.d r1 = d.n0.j.d.f1543c
                d.n0.j.c[] r1 = d.n0.j.d.f1541a
                int r1 = r1.length
                int r1 = r5 - r1
                int r1 = r4.b(r1)
                if (r1 < 0) goto L31
                d.n0.j.c[] r2 = r4.f1546c
                int r3 = r2.length
                if (r1 >= r3) goto L31
                r5 = r2[r1]
                c.j.b.d.b(r5)
            L2e:
                e.h r5 = r5.f1539b
                return r5
            L31:
                java.io.IOException r1 = new java.io.IOException
                java.lang.String r2 = "Header index too large "
                java.lang.StringBuilder r2 = b.a.a.a.a.e(r2)
                int r5 = r5 + r0
                r2.append(r5)
                java.lang.String r5 = r2.toString()
                r1.<init>(r5)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: d.n0.j.d.a.d(int):e.h");
        }

        public final void e(int i, c cVar) {
            this.f1544a.add(cVar);
            int i2 = cVar.f1538a;
            if (i != -1) {
                c cVar2 = this.f1546c[this.f1547d + 1 + i];
                c.j.b.d.b(cVar2);
                i2 -= cVar2.f1538a;
            }
            int i3 = this.h;
            if (i2 > i3) {
                a();
                return;
            }
            int iC = c((this.f + i2) - i3);
            if (i == -1) {
                int i4 = this.f1548e + 1;
                c[] cVarArr = this.f1546c;
                if (i4 > cVarArr.length) {
                    c[] cVarArr2 = new c[cVarArr.length * 2];
                    System.arraycopy(cVarArr, 0, cVarArr2, cVarArr.length, cVarArr.length);
                    this.f1547d = this.f1546c.length - 1;
                    this.f1546c = cVarArr2;
                }
                int i5 = this.f1547d;
                this.f1547d = i5 - 1;
                this.f1546c[i5] = cVar;
                this.f1548e++;
            } else {
                this.f1546c[this.f1547d + 1 + i + iC + i] = cVar;
            }
            this.f += i2;
        }

        public final e.h f() {
            int iA = d.n0.c.a(this.f1545b.readByte(), 255);
            int i = 0;
            boolean z = (iA & 128) == 128;
            long jG = g(iA, 127);
            if (!z) {
                return this.f1545b.m(jG);
            }
            e.e eVar = new e.e();
            q qVar = q.f1616d;
            e.g gVar = this.f1545b;
            c.j.b.d.d(gVar, "source");
            c.j.b.d.d(eVar, "sink");
            q.a aVar = q.f1615c;
            int i2 = 0;
            for (long j = 0; j < jG; j++) {
                i = (i << 8) | (gVar.readByte() & 255);
                i2 += 8;
                while (i2 >= 8) {
                    int i3 = i2 - 8;
                    q.a[] aVarArr = aVar.f1617a;
                    c.j.b.d.b(aVarArr);
                    aVar = aVarArr[(i >>> i3) & 255];
                    c.j.b.d.b(aVar);
                    if (aVar.f1617a == null) {
                        eVar.P(aVar.f1618b);
                        i2 -= aVar.f1619c;
                        aVar = q.f1615c;
                    } else {
                        i2 = i3;
                    }
                }
            }
            while (i2 > 0) {
                q.a[] aVarArr2 = aVar.f1617a;
                c.j.b.d.b(aVarArr2);
                q.a aVar2 = aVarArr2[(i << (8 - i2)) & 255];
                c.j.b.d.b(aVar2);
                if (aVar2.f1617a != null || aVar2.f1619c > i2) {
                    break;
                }
                eVar.P(aVar2.f1618b);
                i2 -= aVar2.f1619c;
                aVar = q.f1615c;
            }
            return eVar.E();
        }

        public final int g(int i, int i2) {
            int i3 = i & i2;
            if (i3 < i2) {
                return i3;
            }
            int i4 = 0;
            while (true) {
                int iA = d.n0.c.a(this.f1545b.readByte(), 255);
                if ((iA & 128) == 0) {
                    return i2 + (iA << i4);
                }
                i2 += (iA & 127) << i4;
                i4 += 7;
            }
        }
    }

    public static final class b {

        /* renamed from: a */
        public int f1549a;

        /* renamed from: b */
        public boolean f1550b;

        /* renamed from: c */
        public int f1551c;

        /* renamed from: d */
        public c[] f1552d;

        /* renamed from: e */
        public int f1553e;
        public int f;
        public int g;
        public int h;
        public final boolean i;
        public final e.e j;

        public b(int i, boolean z, e.e eVar, int i2) {
            i = (i2 & 1) != 0 ? 4096 : i;
            z = (i2 & 2) != 0 ? true : z;
            c.j.b.d.d(eVar, "out");
            this.h = i;
            this.i = z;
            this.j = eVar;
            this.f1549a = Integer.MAX_VALUE;
            this.f1551c = i;
            this.f1552d = new c[8];
            this.f1553e = 7;
        }

        public final void a() {
            c[] cVarArr = this.f1552d;
            int length = cVarArr.length;
            c.j.b.d.d(cVarArr, "$this$fill");
            Arrays.fill(cVarArr, 0, length, (Object) null);
            this.f1553e = this.f1552d.length - 1;
            this.f = 0;
            this.g = 0;
        }

        public final int b(int i) {
            int i2 = 0;
            if (i > 0) {
                int length = this.f1552d.length;
                while (true) {
                    length--;
                    if (length < this.f1553e || i <= 0) {
                        break;
                    }
                    c cVar = this.f1552d[length];
                    c.j.b.d.b(cVar);
                    i -= cVar.f1538a;
                    int i3 = this.g;
                    c cVar2 = this.f1552d[length];
                    c.j.b.d.b(cVar2);
                    this.g = i3 - cVar2.f1538a;
                    this.f--;
                    i2++;
                }
                c[] cVarArr = this.f1552d;
                int i4 = this.f1553e;
                System.arraycopy(cVarArr, i4 + 1, cVarArr, i4 + 1 + i2, this.f);
                c[] cVarArr2 = this.f1552d;
                int i5 = this.f1553e;
                Arrays.fill(cVarArr2, i5 + 1, i5 + 1 + i2, (Object) null);
                this.f1553e += i2;
            }
            return i2;
        }

        public final void c(c cVar) {
            int i = cVar.f1538a;
            int i2 = this.f1551c;
            if (i > i2) {
                a();
                return;
            }
            b((this.g + i) - i2);
            int i3 = this.f + 1;
            c[] cVarArr = this.f1552d;
            if (i3 > cVarArr.length) {
                c[] cVarArr2 = new c[cVarArr.length * 2];
                System.arraycopy(cVarArr, 0, cVarArr2, cVarArr.length, cVarArr.length);
                this.f1553e = this.f1552d.length - 1;
                this.f1552d = cVarArr2;
            }
            int i4 = this.f1553e;
            this.f1553e = i4 - 1;
            this.f1552d[i4] = cVar;
            this.f++;
            this.g += i;
        }

        /* JADX WARN: Removed duplicated region for block: B:46:0x0094  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void d(e.h r12) {
            /*
                r11 = this;
                java.lang.String r0 = "data"
                c.j.b.d.d(r12, r0)
                boolean r0 = r11.i
                r1 = 127(0x7f, float:1.78E-43)
                r2 = 0
                if (r0 == 0) goto L94
                d.n0.j.q r0 = d.n0.j.q.f1616d
                java.lang.String r0 = "bytes"
                c.j.b.d.d(r12, r0)
                int r0 = r12.c()
                r3 = 0
                r5 = r2
                r6 = r3
            L1b:
                r8 = 255(0xff, float:3.57E-43)
                if (r5 >= r0) goto L30
                byte r9 = r12.f(r5)
                int r8 = d.n0.c.a(r9, r8)
                byte[] r9 = d.n0.j.q.f1614b
                r8 = r9[r8]
                long r8 = (long) r8
                long r6 = r6 + r8
                int r5 = r5 + 1
                goto L1b
            L30:
                r0 = 7
                long r9 = (long) r0
                long r6 = r6 + r9
                r0 = 3
                long r5 = r6 >> r0
                int r0 = (int) r5
                int r5 = r12.c()
                if (r0 >= r5) goto L94
                e.e r0 = new e.e
                r0.<init>()
                d.n0.j.q r5 = d.n0.j.q.f1616d
                java.lang.String r5 = "source"
                c.j.b.d.d(r12, r5)
                java.lang.String r5 = "sink"
                c.j.b.d.d(r0, r5)
                int r5 = r12.c()
                r6 = r3
                r3 = r2
            L54:
                if (r2 >= r5) goto L7a
                byte r4 = r12.f(r2)
                int r4 = d.n0.c.a(r4, r8)
                int[] r9 = d.n0.j.q.f1613a
                r9 = r9[r4]
                byte[] r10 = d.n0.j.q.f1614b
                r4 = r10[r4]
                long r6 = r6 << r4
                long r9 = (long) r9
                long r6 = r6 | r9
                int r3 = r3 + r4
            L6a:
                r4 = 8
                if (r3 < r4) goto L77
                int r3 = r3 + (-8)
                long r9 = r6 >> r3
                int r4 = (int) r9
                r0.r(r4)
                goto L6a
            L77:
                int r2 = r2 + 1
                goto L54
            L7a:
                if (r3 <= 0) goto L89
                int r12 = 8 - r3
                long r4 = r6 << r12
                r6 = 255(0xff, double:1.26E-321)
                long r2 = r6 >>> r3
                long r2 = r2 | r4
                int r12 = (int) r2
                r0.r(r12)
            L89:
                e.h r12 = r0.E()
                int r0 = r12.c()
                r2 = 128(0x80, float:1.8E-43)
                goto L98
            L94:
                int r0 = r12.c()
            L98:
                r11.f(r0, r1, r2)
                e.e r0 = r11.j
                r0.L(r12)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: d.n0.j.d.b.d(e.h):void");
        }

        /* JADX WARN: Removed duplicated region for block: B:101:0x00bc  */
        /* JADX WARN: Removed duplicated region for block: B:102:0x00c4  */
        /* JADX WARN: Removed duplicated region for block: B:86:0x0074  */
        /* JADX WARN: Removed duplicated region for block: B:90:0x007a  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void e(java.util.List<d.n0.j.c> r13) {
            /*
                Method dump skipped, instructions count: 265
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: d.n0.j.d.b.e(java.util.List):void");
        }

        public final void f(int i, int i2, int i3) {
            int i4;
            e.e eVar;
            if (i < i2) {
                eVar = this.j;
                i4 = i | i3;
            } else {
                this.j.P(i3 | i2);
                i4 = i - i2;
                while (i4 >= 128) {
                    this.j.P(128 | (i4 & 127));
                    i4 >>>= 7;
                }
                eVar = this.j;
            }
            eVar.P(i4);
        }
    }

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap(f1541a.length);
        int length = f1541a.length;
        for (int i = 0; i < length; i++) {
            if (!linkedHashMap.containsKey(f1541a[i].f1539b)) {
                linkedHashMap.put(f1541a[i].f1539b, Integer.valueOf(i));
            }
        }
        Map<e.h, Integer> mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        c.j.b.d.c(mapUnmodifiableMap, "Collections.unmodifiableMap(result)");
        f1542b = mapUnmodifiableMap;
    }

    public final e.h a(e.h hVar) throws IOException {
        c.j.b.d.d(hVar, "name");
        int iC = hVar.c();
        for (int i = 0; i < iC; i++) {
            byte b2 = (byte) 65;
            byte b3 = (byte) 90;
            byte bF = hVar.f(i);
            if (b2 <= bF && b3 >= bF) {
                StringBuilder sbE = b.a.a.a.a.e("PROTOCOL_ERROR response malformed: mixed case name: ");
                sbE.append(hVar.j());
                throw new IOException(sbE.toString());
            }
        }
        return hVar;
    }
}
