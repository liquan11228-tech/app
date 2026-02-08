package a.b.k;

import a.e.g;
import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: b */
    public static final a.e.c<WeakReference<g>> f10b = new a.e.c<>();

    /* renamed from: c */
    public static final Object f11c = new Object();

    public static g d(Activity activity, f fVar) {
        return new h(activity, null, fVar, activity);
    }

    public static g e(Dialog dialog, f fVar) {
        return new h(dialog.getContext(), dialog.getWindow(), fVar, dialog);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void j(g gVar) {
        synchronized (f11c) {
            Iterator<WeakReference<g>> it = f10b.iterator();
            while (true) {
                g.a aVar = (g.a) it;
                if (aVar.hasNext()) {
                    g gVar2 = (g) ((WeakReference) aVar.next()).get();
                    if (gVar2 == gVar || gVar2 == null) {
                        aVar.remove();
                    }
                }
            }
        }
    }

    public abstract void c(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void f();

    public abstract void g();

    public abstract void h(Bundle bundle);

    public abstract void i();

    public abstract boolean k(int i);

    public abstract void l(int i);

    public abstract void m(View view);

    public abstract void n(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void o(CharSequence charSequence);
}
