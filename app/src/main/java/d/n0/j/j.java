package d.n0.j;

import java.io.IOException;
import java.util.List;

/* loaded from: classes.dex */
public final class j extends d.n0.f.a {

    /* renamed from: e */
    public final /* synthetic */ f f1580e;
    public final /* synthetic */ int f;
    public final /* synthetic */ List g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(String str, boolean z, String str2, boolean z2, f fVar, int i, List list) {
        super(str2, z2);
        this.f1580e = fVar;
        this.f = i;
        this.g = list;
    }

    @Override // d.n0.f.a
    public long a() {
        if (!this.f1580e.m.a(this.f, this.g)) {
            return -1L;
        }
        try {
            this.f1580e.A.E(this.f, b.CANCEL);
            synchronized (this.f1580e) {
                this.f1580e.C.remove(Integer.valueOf(this.f));
            }
            return -1L;
        } catch (IOException unused) {
            return -1L;
        }
    }
}
