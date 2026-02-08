package b.d.a;

import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public class h extends z<AtomicLong> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ z f1238a;

    public h(z zVar) {
        this.f1238a = zVar;
    }

    @Override // b.d.a.z
    public AtomicLong a(b.d.a.e0.a aVar) {
        return new AtomicLong(((Number) this.f1238a.a(aVar)).longValue());
    }

    @Override // b.d.a.z
    public void b(b.d.a.e0.c cVar, AtomicLong atomicLong) {
        this.f1238a.b(cVar, Long.valueOf(atomicLong.get()));
    }
}
