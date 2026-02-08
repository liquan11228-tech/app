package e;

import java.io.IOException;

/* loaded from: classes.dex */
public final class d implements z {

    /* renamed from: b */
    public final /* synthetic */ b f1758b;

    /* renamed from: c */
    public final /* synthetic */ z f1759c;

    public d(b bVar, z zVar) {
        this.f1758b = bVar;
        this.f1759c = zVar;
    }

    @Override // e.z
    public a0 b() {
        return this.f1758b;
    }

    @Override // e.z, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        b bVar = this.f1758b;
        bVar.i();
        try {
            this.f1759c.close();
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

    @Override // e.z
    public long l(e eVar, long j) throws IOException {
        c.j.b.d.d(eVar, "sink");
        b bVar = this.f1758b;
        bVar.i();
        try {
            long jL = this.f1759c.l(eVar, j);
            if (bVar.j()) {
                throw bVar.k(null);
            }
            return jL;
        } catch (IOException e2) {
            if (bVar.j()) {
                throw bVar.k(e2);
            }
            throw e2;
        } finally {
            bVar.j();
        }
    }

    public String toString() {
        StringBuilder sbE = b.a.a.a.a.e("AsyncTimeout.source(");
        sbE.append(this.f1759c);
        sbE.append(')');
        return sbE.toString();
    }
}
