package b.d.a;

import java.io.IOException;

/* JADX INFO: Add missing generic type declarations: [T] */
/* loaded from: classes.dex */
public class y<T> extends z<T> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ z f1253a;

    public y(z zVar) {
        this.f1253a = zVar;
    }

    @Override // b.d.a.z
    public T a(b.d.a.e0.a aVar) throws IOException {
        if (aVar.T() != b.d.a.e0.b.NULL) {
            return (T) this.f1253a.a(aVar);
        }
        aVar.P();
        return null;
    }

    @Override // b.d.a.z
    public void b(b.d.a.e0.c cVar, T t) throws IOException {
        if (t == null) {
            cVar.G();
        } else {
            this.f1253a.b(cVar, t);
        }
    }
}
