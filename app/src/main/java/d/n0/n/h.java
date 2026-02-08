package d.n0.n;

import e.e;
import java.io.Closeable;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class h implements Closeable {

    /* renamed from: b, reason: collision with root package name */
    public boolean f1702b;

    /* renamed from: c, reason: collision with root package name */
    public int f1703c;

    /* renamed from: d, reason: collision with root package name */
    public long f1704d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f1705e;
    public boolean f;
    public boolean g;
    public final e.e h;
    public final e.e i;
    public c j;
    public final byte[] k;
    public final e.a l;
    public final boolean m;
    public final e.g n;
    public final a o;
    public final boolean p;
    public final boolean q;

    public interface a {
        void b(e.h hVar);

        void c(String str);

        void d(e.h hVar);

        void f(e.h hVar);

        void g(int i, String str);
    }

    public h(boolean z, e.g gVar, a aVar, boolean z2, boolean z3) {
        c.j.b.d.d(gVar, "source");
        c.j.b.d.d(aVar, "frameCallback");
        this.m = z;
        this.n = gVar;
        this.o = aVar;
        this.p = z2;
        this.q = z3;
        this.h = new e.e();
        this.i = new e.e();
        this.k = this.m ? null : new byte[4];
        this.l = this.m ? null : new e.a();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        c cVar = this.j;
        if (cVar != null) {
            cVar.f1677d.close();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void y() {
        /*
            r8 = this;
            long r0 = r8.f1704d
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L31
            e.g r4 = r8.n
            e.e r5 = r8.h
            r4.g(r5, r0)
            boolean r0 = r8.m
            if (r0 != 0) goto L31
            e.e r0 = r8.h
            e.e$a r1 = r8.l
            c.j.b.d.b(r1)
            r0.D(r1)
            e.e$a r0 = r8.l
            r0.z(r2)
            e.e$a r0 = r8.l
            byte[] r1 = r8.k
            c.j.b.d.b(r1)
            d.n0.n.g.b(r0, r1)
            e.e$a r0 = r8.l
            r0.close()
        L31:
            int r0 = r8.f1703c
            switch(r0) {
                case 8: goto L69;
                case 9: goto L5c;
                case 10: goto L4f;
                default: goto L36;
            }
        L36:
            java.net.ProtocolException r0 = new java.net.ProtocolException
            java.lang.String r1 = "Unknown control opcode: "
            java.lang.StringBuilder r1 = b.a.a.a.a.e(r1)
            int r2 = r8.f1703c
            java.lang.String r2 = d.n0.c.B(r2)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L4f:
            d.n0.n.h$a r0 = r8.o
            e.e r1 = r8.h
            e.h r1 = r1.E()
            r0.d(r1)
            goto Ld6
        L5c:
            d.n0.n.h$a r0 = r8.o
            e.e r1 = r8.h
            e.h r1 = r1.E()
            r0.f(r1)
            goto Ld6
        L69:
            r0 = 1005(0x3ed, float:1.408E-42)
            e.e r1 = r8.h
            long r4 = r1.f1761c
            r6 = 1
            int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r6 == 0) goto Ld7
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 == 0) goto Lcc
            short r0 = r1.readShort()
            e.e r1 = r8.h
            java.lang.String r1 = r1.H()
            r2 = 1000(0x3e8, float:1.401E-42)
            if (r0 < r2) goto Lb2
            r2 = 5000(0x1388, float:7.006E-42)
            if (r0 < r2) goto L8c
            goto Lb2
        L8c:
            r2 = 1006(0x3ee, float:1.41E-42)
            r3 = 1004(0x3ec, float:1.407E-42)
            if (r3 > r0) goto L94
            if (r2 >= r0) goto L9d
        L94:
            r2 = 2999(0xbb7, float:4.202E-42)
            r3 = 1015(0x3f7, float:1.422E-42)
            if (r3 <= r0) goto L9b
            goto Lb0
        L9b:
            if (r2 < r0) goto Lb0
        L9d:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Code "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r3 = " is reserved and may not be used."
            r2.append(r3)
            goto Lbf
        Lb0:
            r2 = 0
            goto Lc3
        Lb2:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Code must be in range [1000,5000): "
            r2.append(r3)
            r2.append(r0)
        Lbf:
            java.lang.String r2 = r2.toString()
        Lc3:
            if (r2 != 0) goto Lc6
            goto Lce
        Lc6:
            java.net.ProtocolException r0 = new java.net.ProtocolException
            r0.<init>(r2)
            throw r0
        Lcc:
            java.lang.String r1 = ""
        Lce:
            d.n0.n.h$a r2 = r8.o
            r2.g(r0, r1)
            r0 = 1
            r8.f1702b = r0
        Ld6:
            return
        Ld7:
            java.net.ProtocolException r0 = new java.net.ProtocolException
            java.lang.String r1 = "Malformed close payload length of 1."
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: d.n0.n.h.y():void");
    }

    public final void z() {
        boolean z;
        if (this.f1702b) {
            throw new IOException("closed");
        }
        long jH = this.n.b().h();
        this.n.b().b();
        try {
            int iA = d.n0.c.a(this.n.readByte(), 255);
            this.n.b().g(jH, TimeUnit.NANOSECONDS);
            this.f1703c = iA & 15;
            this.f1705e = (iA & 128) != 0;
            boolean z2 = (iA & 8) != 0;
            this.f = z2;
            if (z2 && !this.f1705e) {
                throw new ProtocolException("Control frames must be final.");
            }
            boolean z3 = (iA & 64) != 0;
            int i = this.f1703c;
            if (i == 1 || i == 2) {
                if (!z3) {
                    z = false;
                } else {
                    if (!this.p) {
                        throw new ProtocolException("Unexpected rsv1 flag");
                    }
                    z = true;
                }
                this.g = z;
            } else if (z3) {
                throw new ProtocolException("Unexpected rsv1 flag");
            }
            if ((iA & 32) != 0) {
                throw new ProtocolException("Unexpected rsv2 flag");
            }
            if ((iA & 16) != 0) {
                throw new ProtocolException("Unexpected rsv3 flag");
            }
            int i2 = this.n.readByte() & 255;
            boolean z4 = (i2 & 128) != 0;
            if (z4 == this.m) {
                throw new ProtocolException(this.m ? "Server-sent frames must not be masked." : "Client-sent frames must be masked.");
            }
            long j = i2 & 127;
            this.f1704d = j;
            if (j == 126) {
                this.f1704d = this.n.readShort() & 65535;
            } else if (j == 127) {
                long j2 = this.n.readLong();
                this.f1704d = j2;
                if (j2 < 0) {
                    StringBuilder sbE = b.a.a.a.a.e("Frame length 0x");
                    String hexString = Long.toHexString(this.f1704d);
                    c.j.b.d.c(hexString, "java.lang.Long.toHexString(this)");
                    sbE.append(hexString);
                    sbE.append(" > 0x7FFFFFFFFFFFFFFF");
                    throw new ProtocolException(sbE.toString());
                }
            }
            if (this.f && this.f1704d > 125) {
                throw new ProtocolException("Control frame must be less than 125B.");
            }
            if (z4) {
                e.g gVar = this.n;
                byte[] bArr = this.k;
                c.j.b.d.b(bArr);
                gVar.readFully(bArr);
            }
        } catch (Throwable th) {
            this.n.b().g(jH, TimeUnit.NANOSECONDS);
            throw th;
        }
    }
}
