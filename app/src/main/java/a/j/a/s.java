package a.j.a;

import android.transition.Transition;
import android.view.View;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class s implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ Object f835b;

    /* renamed from: c */
    public final /* synthetic */ d0 f836c;

    /* renamed from: d */
    public final /* synthetic */ View f837d;

    /* renamed from: e */
    public final /* synthetic */ Fragment f838e;
    public final /* synthetic */ ArrayList f;
    public final /* synthetic */ ArrayList g;
    public final /* synthetic */ ArrayList h;
    public final /* synthetic */ Object i;

    public s(Object obj, d0 d0Var, View view, Fragment fragment, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Object obj2) {
        this.f835b = obj;
        this.f836c = d0Var;
        this.f837d = view;
        this.f838e = fragment;
        this.f = arrayList;
        this.g = arrayList2;
        this.h = arrayList3;
        this.i = obj2;
    }

    @Override // java.lang.Runnable
    public void run() {
        Object obj = this.f835b;
        if (obj != null) {
            d0 d0Var = this.f836c;
            View view = this.f837d;
            if (((y) d0Var) == null) {
                throw null;
            }
            if (obj != null) {
                ((Transition) obj).removeTarget(view);
            }
            this.g.addAll(v.h(this.f836c, this.f835b, this.f838e, this.f, this.f837d));
        }
        if (this.h != null) {
            if (this.i != null) {
                ArrayList<View> arrayList = new ArrayList<>();
                arrayList.add(this.f837d);
                this.f836c.h(this.i, this.h, arrayList);
            }
            this.h.clear();
            this.h.add(this.f837d);
        }
    }
}
