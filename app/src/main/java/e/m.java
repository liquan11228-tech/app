package e;

import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.zip.CRC32;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* loaded from: classes.dex */
public final class m implements z {

    /* renamed from: b, reason: collision with root package name */
    public byte f1776b;

    /* renamed from: c, reason: collision with root package name */
    public final t f1777c;

    /* renamed from: d, reason: collision with root package name */
    public final Inflater f1778d;

    /* renamed from: e, reason: collision with root package name */
    public final n f1779e;
    public final CRC32 f;

    public m(z zVar) {
        c.j.b.d.d(zVar, "source");
        this.f1777c = new t(zVar);
        Inflater inflater = new Inflater(true);
        this.f1778d = inflater;
        this.f1779e = new n((g) this.f1777c, inflater);
        this.f = new CRC32();
    }

    @Override // e.z
    public a0 b() {
        return this.f1777c.b();
    }

    @Override // e.z, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f1779e.close();
    }

    @Override // e.z
    public long l(e eVar, long j) throws DataFormatException, IOException {
        long j2;
        c.j.b.d.d(eVar, "sink");
        if (!(j >= 0)) {
            throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
        }
        if (j == 0) {
            return 0L;
        }
        if (this.f1776b == 0) {
            this.f1777c.k(10L);
            byte bZ = this.f1777c.f1795b.z(3L);
            boolean z = ((bZ >> 1) & 1) == 1;
            if (z) {
                z(this.f1777c.f1795b, 0L, 10L);
            }
            y("ID1ID2", 8075, this.f1777c.readShort());
            this.f1777c.p(8L);
            if (((bZ >> 2) & 1) == 1) {
                this.f1777c.k(2L);
                if (z) {
                    z(this.f1777c.f1795b, 0L, 2L);
                }
                long jF = this.f1777c.f1795b.F();
                this.f1777c.k(jF);
                if (z) {
                    j2 = jF;
                    z(this.f1777c.f1795b, 0L, jF);
                } else {
                    j2 = jF;
                }
                this.f1777c.p(j2);
            }
            if (((bZ >> 3) & 1) == 1) {
                long jY = this.f1777c.y((byte) 0, 0L, Long.MAX_VALUE);
                if (jY == -1) {
                    throw new EOFException();
                }
                if (z) {
                    z(this.f1777c.f1795b, 0L, jY + 1);
                }
                this.f1777c.p(jY + 1);
            }
            if (((bZ >> 4) & 1) == 1) {
                long jY2 = this.f1777c.y((byte) 0, 0L, Long.MAX_VALUE);
                if (jY2 == -1) {
                    throw new EOFException();
                }
                if (z) {
                    z(this.f1777c.f1795b, 0L, jY2 + 1);
                }
                this.f1777c.p(jY2 + 1);
            }
            if (z) {
                t tVar = this.f1777c;
                tVar.k(2L);
                y("FHCRC", tVar.f1795b.F(), (short) this.f.getValue());
                this.f.reset();
            }
            this.f1776b = (byte) 1;
        }
        if (this.f1776b == 1) {
            long j3 = eVar.f1761c;
            long jL = this.f1779e.l(eVar, j);
            if (jL != -1) {
                z(eVar, j3, jL);
                return jL;
            }
            this.f1776b = (byte) 2;
        }
        if (this.f1776b == 2) {
            y("CRC", this.f1777c.z(), (int) this.f.getValue());
            y("ISIZE", this.f1777c.z(), (int) this.f1778d.getBytesWritten());
            this.f1776b = (byte) 3;
            if (!this.f1777c.q()) {
                throw new IOException("gzip finished without exhausting source");
            }
        }
        return -1L;
    }

    public final void y(String str, int i, int i2) throws IOException {
        if (i2 == i) {
            return;
        }
        String str2 = String.format("%s: actual 0x%08x != expected 0x%08x", Arrays.copyOf(new Object[]{str, Integer.valueOf(i2), Integer.valueOf(i)}, 3));
        c.j.b.d.c(str2, "java.lang.String.format(this, *args)");
        throw new IOException(str2);
    }

    public final void z(e eVar, long j, long j2) {
        u uVar = eVar.f1760b;
        while (true) {
            c.j.b.d.b(uVar);
            int i = uVar.f1800c;
            int i2 = uVar.f1799b;
            if (j < i - i2) {
                break;
            }
            j -= i - i2;
            uVar = uVar.f;
        }
        while (j2 > 0) {
            int iMin = (int) Math.min(uVar.f1800c - r6, j2);
            this.f.update(uVar.f1798a, (int) (uVar.f1799b + j), iMin);
            j2 -= iMin;
            uVar = uVar.f;
            c.j.b.d.b(uVar);
            j = 0;
        }
    }
}
