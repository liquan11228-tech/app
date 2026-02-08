package a.j.a;

import a.j.a.v;
import android.graphics.Rect;
import android.transition.TransitionSet;
import android.view.View;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class u implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ d0 f843b;

    /* renamed from: c */
    public final /* synthetic */ a.e.a f844c;

    /* renamed from: d */
    public final /* synthetic */ Object f845d;

    /* renamed from: e */
    public final /* synthetic */ v.a f846e;
    public final /* synthetic */ ArrayList f;
    public final /* synthetic */ View g;
    public final /* synthetic */ Fragment h;
    public final /* synthetic */ Fragment i;
    public final /* synthetic */ boolean j;
    public final /* synthetic */ ArrayList k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Rect m;

    public u(d0 d0Var, a.e.a aVar, Object obj, v.a aVar2, ArrayList arrayList, View view, Fragment fragment, Fragment fragment2, boolean z, ArrayList arrayList2, Object obj2, Rect rect) {
        this.f843b = d0Var;
        this.f844c = aVar;
        this.f845d = obj;
        this.f846e = aVar2;
        this.f = arrayList;
        this.g = view;
        this.h = fragment;
        this.i = fragment2;
        this.j = z;
        this.k = arrayList2;
        this.l = obj2;
        this.m = rect;
    }

    @Override // java.lang.Runnable
    public void run() {
        a.e.a<String, View> aVarE = v.e(this.f843b, this.f844c, this.f845d, this.f846e);
        if (aVarE != null) {
            this.f.addAll(aVarE.values());
            this.f.add(this.g);
        }
        v.c(this.h, this.i, this.j, aVarE, false);
        Object obj = this.f845d;
        if (obj != null) {
            d0 d0Var = this.f843b;
            ArrayList<View> arrayList = this.k;
            ArrayList<View> arrayList2 = this.f;
            y yVar = (y) d0Var;
            if (yVar == null) {
                throw null;
            }
            TransitionSet transitionSet = (TransitionSet) obj;
            transitionSet.getTargets().clear();
            transitionSet.getTargets().addAll(arrayList2);
            yVar.h(transitionSet, arrayList, arrayList2);
            View viewK = v.k(aVarE, this.f846e, this.l, this.j);
            if (viewK != null) {
                this.f843b.f(viewK, this.m);
            }
        }
    }
}
