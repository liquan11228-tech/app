package d.n0.j;

import java.io.IOException;

/* loaded from: classes.dex */
public final class u extends IOException {

    /* renamed from: b, reason: collision with root package name */
    public final b f1623b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(b bVar) {
        super("stream was reset: " + bVar);
        c.j.b.d.d(bVar, "errorCode");
        this.f1623b = bVar;
    }
}
