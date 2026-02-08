package a.j.a;

import android.graphics.Rect;
import android.view.View;
import androidx.fragment.app.Fragment;

/* loaded from: classes.dex */
public final class t implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ Fragment f839b;

    /* renamed from: c */
    public final /* synthetic */ Fragment f840c;

    /* renamed from: d */
    public final /* synthetic */ boolean f841d;

    /* renamed from: e */
    public final /* synthetic */ a.e.a f842e;
    public final /* synthetic */ View f;
    public final /* synthetic */ d0 g;
    public final /* synthetic */ Rect h;

    public t(Fragment fragment, Fragment fragment2, boolean z, a.e.a aVar, View view, d0 d0Var, Rect rect) {
        this.f839b = fragment;
        this.f840c = fragment2;
        this.f841d = z;
        this.f842e = aVar;
        this.f = view;
        this.g = d0Var;
        this.h = rect;
    }

    @Override // java.lang.Runnable
    public void run() {
        v.c(this.f839b, this.f840c, this.f841d, this.f842e, false);
        View view = this.f;
        if (view != null) {
            this.g.f(view, this.h);
        }
    }
}
