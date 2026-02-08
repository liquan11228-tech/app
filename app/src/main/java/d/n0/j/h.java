package d.n0.j;

import java.io.IOException;

/* loaded from: classes.dex */
public final class h extends d.n0.f.a {

    /* renamed from: e */
    public final /* synthetic */ f f1578e;
    public final /* synthetic */ int f;
    public final /* synthetic */ e.e g;
    public final /* synthetic */ int h;
    public final /* synthetic */ boolean i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(String str, boolean z, String str2, boolean z2, f fVar, int i, e.e eVar, int i2, boolean z3) {
        super(str2, z2);
        this.f1578e = fVar;
        this.f = i;
        this.g = eVar;
        this.h = i2;
        this.i = z3;
    }

    @Override // d.n0.f.a
    public long a() {
        try {
            boolean zD = this.f1578e.m.d(this.f, this.g, this.h, this.i);
            if (zD) {
                this.f1578e.A.E(this.f, b.CANCEL);
            }
            if (!zD && !this.i) {
                return -1L;
            }
            synchronized (this.f1578e) {
                this.f1578e.C.remove(Integer.valueOf(this.f));
            }
            return -1L;
        } catch (IOException unused) {
            return -1L;
        }
    }
}
