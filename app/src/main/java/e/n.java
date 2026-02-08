package e;

import a.b.k.h;
import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* loaded from: classes.dex */
public final class n implements z {

    /* renamed from: b, reason: collision with root package name */
    public int f1780b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1781c;

    /* renamed from: d, reason: collision with root package name */
    public final g f1782d;

    /* renamed from: e, reason: collision with root package name */
    public final Inflater f1783e;

    public n(g gVar, Inflater inflater) {
        c.j.b.d.d(gVar, "source");
        c.j.b.d.d(inflater, "inflater");
        this.f1782d = gVar;
        this.f1783e = inflater;
    }

    public n(z zVar, Inflater inflater) {
        c.j.b.d.d(zVar, "source");
        c.j.b.d.d(inflater, "inflater");
        g gVarH = h.i.h(zVar);
        c.j.b.d.d(gVarH, "source");
        c.j.b.d.d(inflater, "inflater");
        this.f1782d = gVarH;
        this.f1783e = inflater;
    }

    @Override // e.z
    public a0 b() {
        return this.f1782d.b();
    }

    @Override // e.z, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f1781c) {
            return;
        }
        this.f1783e.end();
        this.f1781c = true;
        this.f1782d.close();
    }

    @Override // e.z
    public long l(e eVar, long j) throws DataFormatException, IOException {
        c.j.b.d.d(eVar, "sink");
        do {
            long jY = y(eVar, j);
            if (jY > 0) {
                return jY;
            }
            if (this.f1783e.finished() || this.f1783e.needsDictionary()) {
                return -1L;
            }
        } while (!this.f1782d.q());
        throw new EOFException("source exhausted prematurely");
    }

    public final long y(e eVar, long j) throws DataFormatException, IOException {
        c.j.b.d.d(eVar, "sink");
        if (!(j >= 0)) {
            throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
        }
        if (!(!this.f1781c)) {
            throw new IllegalStateException("closed".toString());
        }
        if (j == 0) {
            return 0L;
        }
        try {
            u uVarK = eVar.K(1);
            int iMin = (int) Math.min(j, 8192 - uVarK.f1800c);
            if (this.f1783e.needsInput() && !this.f1782d.q()) {
                u uVar = this.f1782d.a().f1760b;
                c.j.b.d.b(uVar);
                int i = uVar.f1800c;
                int i2 = uVar.f1799b;
                int i3 = i - i2;
                this.f1780b = i3;
                this.f1783e.setInput(uVar.f1798a, i2, i3);
            }
            int iInflate = this.f1783e.inflate(uVarK.f1798a, uVarK.f1800c, iMin);
            int i4 = this.f1780b;
            if (i4 != 0) {
                int remaining = i4 - this.f1783e.getRemaining();
                this.f1780b -= remaining;
                this.f1782d.p(remaining);
            }
            if (iInflate > 0) {
                uVarK.f1800c += iInflate;
                long j2 = iInflate;
                eVar.f1761c += j2;
                return j2;
            }
            if (uVarK.f1799b == uVarK.f1800c) {
                eVar.f1760b = uVarK.a();
                v.a(uVarK);
            }
            return 0L;
        } catch (DataFormatException e2) {
            throw new IOException(e2);
        }
    }
}
