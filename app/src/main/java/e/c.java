package e;

import a.b.k.h;
import java.io.IOException;

/* loaded from: classes.dex */
public final class c implements x {

    /* renamed from: b */
    public final /* synthetic */ b f1756b;

    /* renamed from: c */
    public final /* synthetic */ x f1757c;

    public c(b bVar, x xVar) {
        this.f1756b = bVar;
        this.f1757c = xVar;
    }

    @Override // e.x
    public a0 b() {
        return this.f1756b;
    }

    @Override // e.x, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        b bVar = this.f1756b;
        bVar.i();
        try {
            this.f1757c.close();
            if (bVar.j()) {
                throw bVar.k(null);
            }
        } catch (IOException e2) {
            if (!bVar.j()) {
                throw e2;
            }
            throw bVar.k(e2);
        } finally {
            bVar.j();
        }
    }

    @Override // e.x
    public void e(e eVar, long j) throws IOException {
        c.j.b.d.d(eVar, "source");
        h.i.n(eVar.f1761c, 0L, j);
        while (true) {
            long j2 = 0;
            if (j <= 0) {
                return;
            }
            u uVar = eVar.f1760b;
            while (true) {
                c.j.b.d.b(uVar);
                if (j2 >= 65536) {
                    break;
                }
                j2 += uVar.f1800c - uVar.f1799b;
                if (j2 >= j) {
                    j2 = j;
                    break;
                }
                uVar = uVar.f;
            }
            b bVar = this.f1756b;
            bVar.i();
            try {
                this.f1757c.e(eVar, j2);
                if (bVar.j()) {
                    throw bVar.k(null);
                }
                j -= j2;
            } catch (IOException e2) {
                if (!bVar.j()) {
                    throw e2;
                }
                throw bVar.k(e2);
            } finally {
                bVar.j();
            }
        }
    }

    @Override // e.x, java.io.Flushable
    public void flush() throws IOException {
        b bVar = this.f1756b;
        bVar.i();
        try {
            this.f1757c.flush();
            if (bVar.j()) {
                throw bVar.k(null);
            }
        } catch (IOException e2) {
            if (!bVar.j()) {
                throw e2;
            }
            throw bVar.k(e2);
        } finally {
            bVar.j();
        }
    }

    public String toString() {
        StringBuilder sbE = b.a.a.a.a.e("AsyncTimeout.sink(");
        sbE.append(this.f1757c);
        sbE.append(')');
        return sbE.toString();
    }
}
