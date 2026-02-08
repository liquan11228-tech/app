package e;

import a.b.k.h;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public final class t implements g {

    /* renamed from: b, reason: collision with root package name */
    public final e f1795b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1796c;

    /* renamed from: d, reason: collision with root package name */
    public final z f1797d;

    public t(z zVar) {
        c.j.b.d.d(zVar, "source");
        this.f1797d = zVar;
        this.f1795b = new e();
    }

    public boolean A(long j) {
        e eVar;
        if (!(j >= 0)) {
            throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
        }
        if (!(!this.f1796c)) {
            throw new IllegalStateException("closed".toString());
        }
        do {
            eVar = this.f1795b;
            if (eVar.f1761c >= j) {
                return true;
            }
        } while (this.f1797d.l(eVar, 8192) != -1);
        return false;
    }

    @Override // e.g, e.f
    public e a() {
        return this.f1795b;
    }

    @Override // e.z
    public a0 b() {
        return this.f1797d.b();
    }

    @Override // e.z, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f1796c) {
            return;
        }
        this.f1796c = true;
        this.f1797d.close();
        e eVar = this.f1795b;
        eVar.p(eVar.f1761c);
    }

    @Override // e.g
    public void g(e eVar, long j) throws EOFException {
        c.j.b.d.d(eVar, "sink");
        try {
            if (!A(j)) {
                throw new EOFException();
            }
            this.f1795b.g(eVar, j);
        } catch (EOFException e2) {
            eVar.O(this.f1795b);
            throw e2;
        }
    }

    @Override // e.g
    public String h() {
        return o(Long.MAX_VALUE);
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.f1796c;
    }

    @Override // e.g
    public void k(long j) throws EOFException {
        if (!A(j)) {
            throw new EOFException();
        }
    }

    @Override // e.z
    public long l(e eVar, long j) {
        c.j.b.d.d(eVar, "sink");
        if (!(j >= 0)) {
            throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
        }
        if (!(!this.f1796c)) {
            throw new IllegalStateException("closed".toString());
        }
        e eVar2 = this.f1795b;
        if (eVar2.f1761c == 0 && this.f1797d.l(eVar2, 8192) == -1) {
            return -1L;
        }
        return this.f1795b.l(eVar, Math.min(j, this.f1795b.f1761c));
    }

    @Override // e.g
    public h m(long j) throws EOFException {
        if (A(j)) {
            return this.f1795b.m(j);
        }
        throw new EOFException();
    }

    @Override // e.g
    public String o(long j) throws EOFException {
        if (!(j >= 0)) {
            throw new IllegalArgumentException(("limit < 0: " + j).toString());
        }
        long j2 = j == Long.MAX_VALUE ? Long.MAX_VALUE : j + 1;
        byte b2 = (byte) 10;
        long jY = y(b2, 0L, j2);
        if (jY != -1) {
            return e.b0.a.a(this.f1795b, jY);
        }
        if (j2 < Long.MAX_VALUE && A(j2) && this.f1795b.z(j2 - 1) == ((byte) 13) && A(1 + j2) && this.f1795b.z(j2) == b2) {
            return e.b0.a.a(this.f1795b, j2);
        }
        e eVar = new e();
        e eVar2 = this.f1795b;
        eVar2.y(eVar, 0L, Math.min(32, eVar2.f1761c));
        StringBuilder sbE = b.a.a.a.a.e("\\n not found: limit=");
        sbE.append(Math.min(this.f1795b.f1761c, j));
        sbE.append(" content=");
        sbE.append(eVar.E().d());
        sbE.append("…");
        throw new EOFException(sbE.toString());
    }

    @Override // e.g
    public void p(long j) throws EOFException {
        if (!(!this.f1796c)) {
            throw new IllegalStateException("closed".toString());
        }
        while (j > 0) {
            e eVar = this.f1795b;
            if (eVar.f1761c == 0 && this.f1797d.l(eVar, 8192) == -1) {
                throw new EOFException();
            }
            long jMin = Math.min(j, this.f1795b.f1761c);
            this.f1795b.p(jMin);
            j -= jMin;
        }
    }

    @Override // e.g
    public boolean q() {
        if (!this.f1796c) {
            return this.f1795b.q() && this.f1797d.l(this.f1795b, (long) 8192) == -1;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) {
        c.j.b.d.d(byteBuffer, "sink");
        e eVar = this.f1795b;
        if (eVar.f1761c == 0 && this.f1797d.l(eVar, 8192) == -1) {
            return -1;
        }
        return this.f1795b.read(byteBuffer);
    }

    @Override // e.g
    public byte readByte() throws EOFException {
        k(1L);
        return this.f1795b.readByte();
    }

    @Override // e.g
    public void readFully(byte[] bArr) throws EOFException {
        c.j.b.d.d(bArr, "sink");
        try {
            k(bArr.length);
            this.f1795b.readFully(bArr);
        } catch (EOFException e2) {
            int i = 0;
            while (true) {
                e eVar = this.f1795b;
                long j = eVar.f1761c;
                if (j <= 0) {
                    throw e2;
                }
                int iC = eVar.C(bArr, i, (int) j);
                if (iC == -1) {
                    throw new AssertionError();
                }
                i += iC;
            }
        }
    }

    @Override // e.g
    public int readInt() throws EOFException {
        k(4L);
        return this.f1795b.readInt();
    }

    @Override // e.g
    public long readLong() throws EOFException {
        k(8L);
        return this.f1795b.readLong();
    }

    @Override // e.g
    public short readShort() throws EOFException {
        k(2L);
        return this.f1795b.readShort();
    }

    @Override // e.g
    public byte[] t(long j) throws EOFException {
        if (A(j)) {
            return this.f1795b.t(j);
        }
        throw new EOFException();
    }

    public String toString() {
        StringBuilder sbE = b.a.a.a.a.e("buffer(");
        sbE.append(this.f1797d);
        sbE.append(')');
        return sbE.toString();
    }

    @Override // e.g
    public long v() throws EOFException {
        byte bZ;
        k(1L);
        int i = 0;
        while (true) {
            int i2 = i + 1;
            if (!A(i2)) {
                break;
            }
            bZ = this.f1795b.z(i);
            if ((bZ < ((byte) 48) || bZ > ((byte) 57)) && ((bZ < ((byte) 97) || bZ > ((byte) 102)) && (bZ < ((byte) 65) || bZ > ((byte) 70)))) {
                break;
            }
            i = i2;
        }
        if (i == 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("Expected leading [0-9a-fA-F] character but was 0x");
            h.i.o(16);
            h.i.o(16);
            String string = Integer.toString(bZ, 16);
            c.j.b.d.c(string, "java.lang.Integer.toStri…(this, checkRadix(radix))");
            sb.append(string);
            throw new NumberFormatException(sb.toString());
        }
        return this.f1795b.v();
    }

    @Override // e.g
    public String w(Charset charset) {
        c.j.b.d.d(charset, "charset");
        this.f1795b.O(this.f1797d);
        e eVar = this.f1795b;
        if (eVar == null) {
            throw null;
        }
        c.j.b.d.d(charset, "charset");
        return eVar.G(eVar.f1761c, charset);
    }

    @Override // e.g
    public int x(q qVar) {
        c.j.b.d.d(qVar, "options");
        if (!(!this.f1796c)) {
            throw new IllegalStateException("closed".toString());
        }
        while (true) {
            int iB = e.b0.a.b(this.f1795b, qVar, true);
            if (iB != -2) {
                if (iB != -1) {
                    this.f1795b.p(qVar.f1788b[iB].c());
                    return iB;
                }
            } else if (this.f1797d.l(this.f1795b, 8192) == -1) {
                break;
            }
        }
        return -1;
    }

    public long y(byte b2, long j, long j2) {
        if (!(!this.f1796c)) {
            throw new IllegalStateException("closed".toString());
        }
        if (!(0 <= j && j2 >= j)) {
            throw new IllegalArgumentException(("fromIndex=" + j + " toIndex=" + j2).toString());
        }
        while (j < j2) {
            long jA = this.f1795b.A(b2, j, j2);
            if (jA != -1) {
                return jA;
            }
            e eVar = this.f1795b;
            long j3 = eVar.f1761c;
            if (j3 >= j2 || this.f1797d.l(eVar, 8192) == -1) {
                return -1L;
            }
            j = Math.max(j, j3);
        }
        return -1L;
    }

    public int z() throws EOFException {
        k(4L);
        int i = this.f1795b.readInt();
        return ((i & 255) << 24) | (((-16777216) & i) >>> 24) | ((16711680 & i) >>> 8) | ((65280 & i) << 8);
    }
}
