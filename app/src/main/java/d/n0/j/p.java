package d.n0.j;

import d.n0.j.d;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class p implements Closeable {
    public static final Logger h = Logger.getLogger(e.class.getName());

    /* renamed from: b, reason: collision with root package name */
    public final e.e f1609b;

    /* renamed from: c, reason: collision with root package name */
    public int f1610c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f1611d;

    /* renamed from: e, reason: collision with root package name */
    public final d.b f1612e;
    public final e.f f;
    public final boolean g;

    public p(e.f fVar, boolean z) {
        c.j.b.d.d(fVar, "sink");
        this.f = fVar;
        this.g = z;
        e.e eVar = new e.e();
        this.f1609b = eVar;
        this.f1610c = 16384;
        this.f1612e = new d.b(0, false, eVar, 3);
    }

    public final void A(int i, int i2, int i3, int i4) {
        if (h.isLoggable(Level.FINE)) {
            h.fine(e.f1558e.b(false, i, i2, i3, i4));
        }
        if (!(i2 <= this.f1610c)) {
            StringBuilder sbE = b.a.a.a.a.e("FRAME_SIZE_ERROR length > ");
            sbE.append(this.f1610c);
            sbE.append(": ");
            sbE.append(i2);
            throw new IllegalArgumentException(sbE.toString().toString());
        }
        if (!((((int) 2147483648L) & i) == 0)) {
            throw new IllegalArgumentException(b.a.a.a.a.a("reserved bit set: ", i).toString());
        }
        d.n0.c.I(this.f, i2);
        this.f.r(i3 & 255);
        this.f.r(i4 & 255);
        this.f.d(i & Integer.MAX_VALUE);
    }

    public final synchronized void B(int i, b bVar, byte[] bArr) {
        c.j.b.d.d(bVar, "errorCode");
        c.j.b.d.d(bArr, "debugData");
        if (this.f1611d) {
            throw new IOException("closed");
        }
        if (!(bVar.f1535b != -1)) {
            throw new IllegalArgumentException("errorCode.httpCode == -1".toString());
        }
        A(0, bArr.length + 8, 7, 0);
        this.f.d(i);
        this.f.d(bVar.f1535b);
        if (!(bArr.length == 0)) {
            this.f.c(bArr);
        }
        this.f.flush();
    }

    public final synchronized void C(boolean z, int i, List<c> list) {
        c.j.b.d.d(list, "headerBlock");
        if (this.f1611d) {
            throw new IOException("closed");
        }
        this.f1612e.e(list);
        long j = this.f1609b.f1761c;
        long jMin = Math.min(this.f1610c, j);
        int i2 = j == jMin ? 4 : 0;
        if (z) {
            i2 |= 1;
        }
        A(i, (int) jMin, 1, i2);
        this.f.e(this.f1609b, jMin);
        if (j > jMin) {
            G(i, j - jMin);
        }
    }

    public final synchronized void D(boolean z, int i, int i2) {
        if (this.f1611d) {
            throw new IOException("closed");
        }
        A(0, 8, 6, z ? 1 : 0);
        this.f.d(i);
        this.f.d(i2);
        this.f.flush();
    }

    public final synchronized void E(int i, b bVar) {
        c.j.b.d.d(bVar, "errorCode");
        if (this.f1611d) {
            throw new IOException("closed");
        }
        if (!(bVar.f1535b != -1)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        A(i, 4, 3, 0);
        this.f.d(bVar.f1535b);
        this.f.flush();
    }

    public final synchronized void F(int i, long j) {
        if (this.f1611d) {
            throw new IOException("closed");
        }
        if (!(j != 0 && j <= 2147483647L)) {
            throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j).toString());
        }
        A(i, 4, 8, 0);
        this.f.d((int) j);
        this.f.flush();
    }

    public final void G(int i, long j) {
        while (j > 0) {
            long jMin = Math.min(this.f1610c, j);
            j -= jMin;
            A(i, (int) jMin, 9, j == 0 ? 4 : 0);
            this.f.e(this.f1609b, jMin);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        this.f1611d = true;
        this.f.close();
    }

    public final synchronized void flush() {
        if (this.f1611d) {
            throw new IOException("closed");
        }
        this.f.flush();
    }

    public final synchronized void y(t tVar) {
        c.j.b.d.d(tVar, "peerSettings");
        if (this.f1611d) {
            throw new IOException("closed");
        }
        int i = this.f1610c;
        if ((tVar.f1621a & 32) != 0) {
            i = tVar.f1622b[5];
        }
        this.f1610c = i;
        if (((tVar.f1621a & 2) != 0 ? tVar.f1622b[1] : -1) != -1) {
            d.b bVar = this.f1612e;
            int i2 = (tVar.f1621a & 2) != 0 ? tVar.f1622b[1] : -1;
            bVar.h = i2;
            int iMin = Math.min(i2, 16384);
            int i3 = bVar.f1551c;
            if (i3 != iMin) {
                if (iMin < i3) {
                    bVar.f1549a = Math.min(bVar.f1549a, iMin);
                }
                bVar.f1550b = true;
                bVar.f1551c = iMin;
                int i4 = bVar.g;
                if (iMin < i4) {
                    if (iMin == 0) {
                        bVar.a();
                    } else {
                        bVar.b(i4 - iMin);
                    }
                }
            }
        }
        A(0, 0, 4, 1);
        this.f.flush();
    }

    public final synchronized void z(boolean z, int i, e.e eVar, int i2) {
        if (this.f1611d) {
            throw new IOException("closed");
        }
        A(i, i2, 0, z ? 1 : 0);
        if (i2 > 0) {
            e.f fVar = this.f;
            c.j.b.d.b(eVar);
            fVar.e(eVar, i2);
        }
    }
}
