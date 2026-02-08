package a.j.a;

import android.view.View;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes.dex */
public class c0 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f774b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Map f775c;

    public c0(d0 d0Var, ArrayList arrayList, Map map) {
        this.f774b = arrayList;
        this.f775c = map;
    }

    @Override // java.lang.Runnable
    public void run() {
        int size = this.f774b.size();
        for (int i = 0; i < size; i++) {
            View view = (View) this.f774b.get(i);
            view.setTransitionName((String) this.f775c.get(a.g.j.k.i(view)));
        }
    }
}
