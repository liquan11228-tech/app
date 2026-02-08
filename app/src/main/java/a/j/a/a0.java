package a.j.a;

import android.view.View;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class a0 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f763b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f764c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ArrayList f765d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ArrayList f766e;
    public final /* synthetic */ ArrayList f;

    public a0(d0 d0Var, int i, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
        this.f763b = i;
        this.f764c = arrayList;
        this.f765d = arrayList2;
        this.f766e = arrayList3;
        this.f = arrayList4;
    }

    @Override // java.lang.Runnable
    public void run() {
        for (int i = 0; i < this.f763b; i++) {
            a.g.j.k.z((View) this.f764c.get(i), (String) this.f765d.get(i));
            ((View) this.f766e.get(i)).setTransitionName((String) this.f.get(i));
        }
    }
}
