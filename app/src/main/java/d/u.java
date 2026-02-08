package d;

import java.io.IOException;

/* loaded from: classes.dex */
public abstract class u {

    /* renamed from: a, reason: collision with root package name */
    public static final u f1722a = new a();

    public static final class a extends u {
    }

    public interface b {
        u a(f fVar);
    }

    public void a(f fVar, l lVar) {
        c.j.b.d.d(fVar, "call");
        c.j.b.d.d(lVar, "connection");
    }

    public void b(f fVar, IOException iOException) {
        c.j.b.d.d(fVar, "call");
        c.j.b.d.d(iOException, "ioe");
    }

    public void c(f fVar, IOException iOException) {
        c.j.b.d.d(fVar, "call");
        c.j.b.d.d(iOException, "ioe");
    }
}
