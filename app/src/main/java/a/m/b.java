package a.m;

import a.k.d;
import a.k.e;
import a.k.g;
import a.k.h;
import a.m.a;
import android.os.Bundle;
import androidx.savedstate.Recreator;
import java.util.Map;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final c f895a;

    /* renamed from: b, reason: collision with root package name */
    public final a f896b = new a();

    public b(c cVar) {
        this.f895a = cVar;
    }

    public void a(Bundle bundle) {
        d dVarA = this.f895a.a();
        if (((h) dVarA).f876b != d.b.INITIALIZED) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        dVarA.a(new Recreator(this.f895a));
        final a aVar = this.f896b;
        if (aVar.f893c) {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        if (bundle != null) {
            aVar.f892b = bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key");
        }
        dVarA.a(new e() { // from class: androidx.savedstate.SavedStateRegistry$1
            @Override // a.k.e
            public void g(g gVar, d.a aVar2) {
                a aVar3;
                boolean z;
                if (aVar2 == d.a.ON_START) {
                    aVar3 = aVar;
                    z = true;
                } else {
                    if (aVar2 != d.a.ON_STOP) {
                        return;
                    }
                    aVar3 = aVar;
                    z = false;
                }
                aVar3.f894d = z;
            }
        });
        aVar.f893c = true;
    }

    public void b(Bundle bundle) {
        a aVar = this.f896b;
        if (aVar == null) {
            throw null;
        }
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = aVar.f892b;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        a.c.a.b.b<String, a.b>.d dVarB = aVar.f891a.b();
        while (dVarB.hasNext()) {
            Map.Entry entry = (Map.Entry) dVarB.next();
            bundle2.putBundle((String) entry.getKey(), ((a.b) entry.getValue()).a());
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
    }
}
