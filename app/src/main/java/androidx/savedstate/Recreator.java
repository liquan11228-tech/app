package androidx.savedstate;

import a.k.d;
import a.k.e;
import a.k.g;
import a.k.h;
import a.m.a;
import a.m.c;
import android.annotation.SuppressLint;
import android.os.Bundle;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Iterator;

@SuppressLint({"RestrictedApi"})
/* loaded from: classes.dex */
public final class Recreator implements e {

    /* renamed from: a, reason: collision with root package name */
    public final c f1069a;

    public Recreator(c cVar) {
        this.f1069a = cVar;
    }

    @Override // a.k.e
    public void g(g gVar, d.a aVar) throws NoSuchMethodException, SecurityException {
        if (aVar != d.a.ON_CREATE) {
            throw new AssertionError("Next event must be ON_CREATE");
        }
        ((h) gVar.a()).f875a.d(this);
        a aVarD = this.f1069a.d();
        if (!aVarD.f893c) {
            throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
        }
        Bundle bundle = aVarD.f892b;
        Bundle bundle2 = null;
        if (bundle != null) {
            Bundle bundle3 = bundle.getBundle("androidx.savedstate.Restarter");
            aVarD.f892b.remove("androidx.savedstate.Restarter");
            if (aVarD.f892b.isEmpty()) {
                aVarD.f892b = null;
            }
            bundle2 = bundle3;
        }
        if (bundle2 == null) {
            return;
        }
        ArrayList<String> stringArrayList = bundle2.getStringArrayList("classes_to_restore");
        if (stringArrayList == null) {
            throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
        }
        Iterator<String> it = stringArrayList.iterator();
        while (it.hasNext()) {
            String next = it.next();
            try {
                Class<? extends U> clsAsSubclass = Class.forName(next, false, Recreator.class.getClassLoader()).asSubclass(a.InterfaceC0021a.class);
                try {
                    Constructor declaredConstructor = clsAsSubclass.getDeclaredConstructor(new Class[0]);
                    declaredConstructor.setAccessible(true);
                    try {
                        ((a.InterfaceC0021a) declaredConstructor.newInstance(new Object[0])).a(this.f1069a);
                    } catch (Exception e2) {
                        throw new RuntimeException(b.a.a.a.a.b("Failed to instantiate ", next), e2);
                    }
                } catch (NoSuchMethodException e3) {
                    StringBuilder sbE = b.a.a.a.a.e("Class");
                    sbE.append(clsAsSubclass.getSimpleName());
                    sbE.append(" must have default constructor in order to be automatically recreated");
                    throw new IllegalStateException(sbE.toString(), e3);
                }
            } catch (ClassNotFoundException e4) {
                throw new RuntimeException(b.a.a.a.a.c("Class ", next, " wasn't found"), e4);
            }
        }
    }
}
