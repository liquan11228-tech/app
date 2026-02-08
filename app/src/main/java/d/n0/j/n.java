package d.n0.j;

import d.n0.j.d;
import e.a0;
import e.z;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class n implements Closeable {
    public static final Logger f;
    public static final n g = null;

    /* renamed from: b */
    public final a f1588b;

    /* renamed from: c */
    public final d.a f1589c;

    /* renamed from: d */
    public final e.g f1590d;

    /* renamed from: e */
    public final boolean f1591e;

    public static final class a implements z {

        /* renamed from: b */
        public int f1592b;

        /* renamed from: c */
        public int f1593c;

        /* renamed from: d */
        public int f1594d;

        /* renamed from: e */
        public int f1595e;
        public int f;
        public final e.g g;

        public a(e.g gVar) {
            c.j.b.d.d(gVar, "source");
            this.g = gVar;
        }

        @Override // e.z
        public a0 b() {
            return this.g.b();
        }

        @Override // e.z, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // e.z
        public long l(e.e eVar, long j) throws IOException {
            int i;
            int i2;
            c.j.b.d.d(eVar, "sink");
            do {
                int i3 = this.f1595e;
                if (i3 != 0) {
                    long jL = this.g.l(eVar, Math.min(j, i3));
                    if (jL == -1) {
                        return -1L;
                    }
                    this.f1595e -= (int) jL;
                    return jL;
                }
                this.g.p(this.f);
                this.f = 0;
                if ((this.f1593c & 4) != 0) {
                    return -1L;
                }
                i = this.f1594d;
                int iX = d.n0.c.x(this.g);
                this.f1595e = iX;
                this.f1592b = iX;
                int i4 = this.g.readByte() & 255;
                this.f1593c = this.g.readByte() & 255;
                n nVar = n.g;
                if (n.f.isLoggable(Level.FINE)) {
                    n nVar2 = n.g;
                    n.f.fine(e.f1558e.b(true, this.f1594d, this.f1592b, i4, this.f1593c));
                }
                i2 = this.g.readInt() & Integer.MAX_VALUE;
                this.f1594d = i2;
                if (i4 != 9) {
                    throw new IOException(i4 + " != TYPE_CONTINUATION");
                }
            } while (i2 == i);
            throw new IOException("TYPE_CONTINUATION streamId changed");
        }
    }

    public interface b {
        void a(int i, int i2, List<c> list);

        void b(boolean z, int i, int i2, List<c> list);

        void d(boolean z, int i, e.g gVar, int i2);

        void e(boolean z, int i, int i2);

        void f(int i, d.n0.j.b bVar, e.h hVar);

        void g(int i, int i2, int i3, boolean z);

        void h();

        void i(int i, d.n0.j.b bVar);

        void j(int i, long j);

        void k(boolean z, t tVar);
    }

    static {
        Logger logger = Logger.getLogger(e.class.getName());
        c.j.b.d.c(logger, "Logger.getLogger(Http2::class.java.name)");
        f = logger;
    }

    public n(e.g gVar, boolean z) {
        c.j.b.d.d(gVar, "source");
        this.f1590d = gVar;
        this.f1591e = z;
        a aVar = new a(gVar);
        this.f1588b = aVar;
        this.f1589c = new d.a(aVar, 4096, 0, 4);
    }

    /* JADX WARN: Removed duplicated region for block: B:99:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<d.n0.j.c> A(int r3, int r4, int r5, int r6) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 322
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: d.n0.j.n.A(int, int, int, int):java.util.List");
    }

    public final void B(b bVar, int i) {
        int i2 = this.f1590d.readInt();
        bVar.g(i, i2 & Integer.MAX_VALUE, d.n0.c.a(this.f1590d.readByte(), 255) + 1, (((int) 2147483648L) & i2) != 0);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f1590d.close();
    }

    /* JADX WARN: Code restructure failed: missing block: B:298:0x01e5, code lost:
    
        throw new java.io.IOException(b.a.a.a.a.a("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: ", r11));
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean y(boolean r17, d.n0.j.n.b r18) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 890
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: d.n0.j.n.y(boolean, d.n0.j.n$b):boolean");
    }

    public final void z(b bVar) throws IOException {
        c.j.b.d.d(bVar, "handler");
        if (this.f1591e) {
            if (!y(true, bVar)) {
                throw new IOException("Required SETTINGS preface not received");
            }
            return;
        }
        e.h hVarM = this.f1590d.m(e.f1554a.c());
        if (f.isLoggable(Level.FINE)) {
            Logger logger = f;
            StringBuilder sbE = b.a.a.a.a.e("<< CONNECTION ");
            sbE.append(hVarM.d());
            logger.fine(d.n0.c.k(sbE.toString(), new Object[0]));
        }
        if (!c.j.b.d.a(e.f1554a, hVarM)) {
            StringBuilder sbE2 = b.a.a.a.a.e("Expected a connection header but was ");
            sbE2.append(hVarM.j());
            throw new IOException(sbE2.toString());
        }
    }
}
