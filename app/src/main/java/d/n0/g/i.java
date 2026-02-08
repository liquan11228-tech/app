package d.n0.g;

import d.n0.n.d;

/* loaded from: classes.dex */
public final class i extends d.c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c f1473e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(c cVar, e.g gVar, e.f fVar, boolean z, e.g gVar2, e.f fVar2) {
        super(z, gVar2, fVar2);
        this.f1473e = cVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f1473e.a(-1L, true, true, null);
    }
}
