package d.n0.g;

import java.io.IOException;

/* loaded from: classes.dex */
public final class m extends RuntimeException {

    /* renamed from: b, reason: collision with root package name */
    public IOException f1485b;

    /* renamed from: c, reason: collision with root package name */
    public final IOException f1486c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(IOException iOException) {
        super(iOException);
        c.j.b.d.d(iOException, "firstConnectException");
        this.f1486c = iOException;
        this.f1485b = iOException;
    }
}
