package e;

import a.b.k.h;
import java.util.zip.Deflater;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* loaded from: classes.dex */
public final class i implements x {

    /* renamed from: b, reason: collision with root package name */
    public boolean f1770b;

    /* renamed from: c, reason: collision with root package name */
    public final f f1771c;

    /* renamed from: d, reason: collision with root package name */
    public final Deflater f1772d;

    public i(x xVar, Deflater deflater) {
        c.j.b.d.d(xVar, "sink");
        c.j.b.d.d(deflater, "deflater");
        f fVarG = h.i.g(xVar);
        c.j.b.d.d(fVarG, "sink");
        c.j.b.d.d(deflater, "deflater");
        this.f1771c = fVarG;
        this.f1772d = deflater;
    }

    @Override // e.x
    public a0 b() {
        return this.f1771c.b();
    }

    @Override // e.x, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        if (this.f1770b) {
            return;
        }
        Throwable th = null;
        try {
            this.f1772d.finish();
            y(false);
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            this.f1772d.end();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        try {
            this.f1771c.close();
        } catch (Throwable th4) {
            if (th == null) {
                th = th4;
            }
        }
        this.f1770b = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // e.x
    public void e(e eVar, long j) {
        c.j.b.d.d(eVar, "source");
        h.i.n(eVar.f1761c, 0L, j);
        while (j > 0) {
            u uVar = eVar.f1760b;
            c.j.b.d.b(uVar);
            int iMin = (int) Math.min(j, uVar.f1800c - uVar.f1799b);
            this.f1772d.setInput(uVar.f1798a, uVar.f1799b, iMin);
            y(false);
            long j2 = iMin;
            eVar.f1761c -= j2;
            int i = uVar.f1799b + iMin;
            uVar.f1799b = i;
            if (i == uVar.f1800c) {
                eVar.f1760b = uVar.a();
                v.a(uVar);
            }
            j -= j2;
        }
    }

    @Override // e.x, java.io.Flushable
    public void flush() {
        y(true);
        this.f1771c.flush();
    }

    public String toString() {
        StringBuilder sbE = b.a.a.a.a.e("DeflaterSink(");
        sbE.append(this.f1771c);
        sbE.append(')');
        return sbE.toString();
    }

    @IgnoreJRERequirement
    public final void y(boolean z) {
        u uVarK;
        e eVarA = this.f1771c.a();
        while (true) {
            uVarK = eVarA.K(1);
            Deflater deflater = this.f1772d;
            byte[] bArr = uVarK.f1798a;
            int i = uVarK.f1800c;
            int i2 = 8192 - i;
            int iDeflate = z ? deflater.deflate(bArr, i, i2, 2) : deflater.deflate(bArr, i, i2);
            if (iDeflate > 0) {
                uVarK.f1800c += iDeflate;
                eVarA.f1761c += iDeflate;
                this.f1771c.i();
            } else if (this.f1772d.needsInput()) {
                break;
            }
        }
        if (uVarK.f1799b == uVarK.f1800c) {
            eVarA.f1760b = uVarK.a();
            v.a(uVarK);
        }
    }
}
