package d.n0.j;

import java.io.IOException;

/* loaded from: classes.dex */
public final class l extends d.n0.f.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f f1582e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(String str, boolean z, String str2, boolean z2, f fVar) {
        super(str2, z2);
        this.f1582e = fVar;
    }

    @Override // d.n0.f.a
    public long a() throws IOException {
        this.f1582e.F(false, 2, 0);
        return -1L;
    }
}
