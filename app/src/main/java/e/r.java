package e;

import a.b.k.h;
import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes.dex */
public final class r implements x {

    /* renamed from: b */
    public final OutputStream f1790b;

    /* renamed from: c */
    public final a0 f1791c;

    public r(OutputStream outputStream, a0 a0Var) {
        c.j.b.d.d(outputStream, "out");
        c.j.b.d.d(a0Var, "timeout");
        this.f1790b = outputStream;
        this.f1791c = a0Var;
    }

    @Override // e.x
    public a0 b() {
        return this.f1791c;
    }

    @Override // e.x, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f1790b.close();
    }

    @Override // e.x
    public void e(e eVar, long j) throws IOException {
        c.j.b.d.d(eVar, "source");
        h.i.n(eVar.f1761c, 0L, j);
        while (j > 0) {
            this.f1791c.f();
            u uVar = eVar.f1760b;
            c.j.b.d.b(uVar);
            int iMin = (int) Math.min(j, uVar.f1800c - uVar.f1799b);
            this.f1790b.write(uVar.f1798a, uVar.f1799b, iMin);
            int i = uVar.f1799b + iMin;
            uVar.f1799b = i;
            long j2 = iMin;
            j -= j2;
            eVar.f1761c -= j2;
            if (i == uVar.f1800c) {
                eVar.f1760b = uVar.a();
                v.a(uVar);
            }
        }
    }

    @Override // e.x, java.io.Flushable
    public void flush() throws IOException {
        this.f1790b.flush();
    }

    public String toString() {
        StringBuilder sbE = b.a.a.a.a.e("sink(");
        sbE.append(this.f1790b);
        sbE.append(')');
        return sbE.toString();
    }
}
