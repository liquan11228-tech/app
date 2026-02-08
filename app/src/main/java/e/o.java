package e;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class o implements z {

    /* renamed from: b */
    public final InputStream f1784b;

    /* renamed from: c */
    public final a0 f1785c;

    public o(InputStream inputStream, a0 a0Var) {
        c.j.b.d.d(inputStream, "input");
        c.j.b.d.d(a0Var, "timeout");
        this.f1784b = inputStream;
        this.f1785c = a0Var;
    }

    @Override // e.z
    public a0 b() {
        return this.f1785c;
    }

    @Override // e.z, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f1784b.close();
    }

    @Override // e.z
    public long l(e eVar, long j) throws IOException {
        c.j.b.d.d(eVar, "sink");
        if (j == 0) {
            return 0L;
        }
        if (!(j >= 0)) {
            throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
        }
        try {
            this.f1785c.f();
            u uVarK = eVar.K(1);
            int i = this.f1784b.read(uVarK.f1798a, uVarK.f1800c, (int) Math.min(j, 8192 - uVarK.f1800c));
            if (i != -1) {
                uVarK.f1800c += i;
                long j2 = i;
                eVar.f1761c += j2;
                return j2;
            }
            if (uVarK.f1799b != uVarK.f1800c) {
                return -1L;
            }
            eVar.f1760b = uVarK.a();
            v.a(uVarK);
            return -1L;
        } catch (AssertionError e2) {
            if (p.a(e2)) {
                throw new IOException(e2);
            }
            throw e2;
        }
    }

    public String toString() {
        StringBuilder sbE = b.a.a.a.a.e("source(");
        sbE.append(this.f1784b);
        sbE.append(')');
        return sbE.toString();
    }
}
