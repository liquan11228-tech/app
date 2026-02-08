package androidx.lifecycle;

import a.k.b;
import a.k.d;
import a.k.e;
import a.k.g;

/* loaded from: classes.dex */
public class FullLifecycleObserverAdapter implements e {

    /* renamed from: a, reason: collision with root package name */
    public final b f1054a;

    /* renamed from: b, reason: collision with root package name */
    public final e f1055b;

    public FullLifecycleObserverAdapter(b bVar, e eVar) {
        this.f1054a = bVar;
        this.f1055b = eVar;
    }

    @Override // a.k.e
    public void g(g gVar, d.a aVar) {
        switch (aVar) {
            case ON_CREATE:
                this.f1054a.e(gVar);
                break;
            case ON_START:
                this.f1054a.f(gVar);
                break;
            case ON_RESUME:
                this.f1054a.a(gVar);
                break;
            case ON_PAUSE:
                this.f1054a.b(gVar);
                break;
            case ON_STOP:
                this.f1054a.d(gVar);
                break;
            case ON_DESTROY:
                this.f1054a.c(gVar);
                break;
            case ON_ANY:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        e eVar = this.f1055b;
        if (eVar != null) {
            eVar.g(gVar, aVar);
        }
    }
}
