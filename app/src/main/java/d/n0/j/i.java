package d.n0.j;

import java.io.IOException;
import java.util.List;

/* loaded from: classes.dex */
public final class i extends d.n0.f.a {

    /* renamed from: e */
    public final /* synthetic */ f f1579e;
    public final /* synthetic */ int f;
    public final /* synthetic */ List g;
    public final /* synthetic */ boolean h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(String str, boolean z, String str2, boolean z2, f fVar, int i, List list, boolean z3) {
        super(str2, z2);
        this.f1579e = fVar;
        this.f = i;
        this.g = list;
        this.h = z3;
    }

    @Override // d.n0.f.a
    public long a() {
        boolean zB = this.f1579e.m.b(this.f, this.g, this.h);
        if (zB) {
            try {
                this.f1579e.A.E(this.f, b.CANCEL);
            } catch (IOException unused) {
                return -1L;
            }
        }
        if (!zB && !this.h) {
            return -1L;
        }
        synchronized (this.f1579e) {
            this.f1579e.C.remove(Integer.valueOf(this.f));
        }
        return -1L;
    }
}
