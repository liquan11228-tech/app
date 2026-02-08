package a.b.k;

import android.view.View;

/* loaded from: classes.dex */
public class m extends a.g.j.q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h f39a;

    public m(h hVar) {
        this.f39a = hVar;
    }

    @Override // a.g.j.p
    public void a(View view) {
        this.f39a.p.setAlpha(1.0f);
        this.f39a.s.d(null);
        this.f39a.s = null;
    }

    @Override // a.g.j.q, a.g.j.p
    public void b(View view) {
        this.f39a.p.setVisibility(0);
        this.f39a.p.sendAccessibilityEvent(32);
        if (this.f39a.p.getParent() instanceof View) {
            a.g.j.k.s((View) this.f39a.p.getParent());
        }
    }
}
