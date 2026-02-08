package a.b.o;

import a.b.o.a;
import a.b.o.i.g;
import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class d extends a implements g.a {

    /* renamed from: d, reason: collision with root package name */
    public Context f83d;

    /* renamed from: e, reason: collision with root package name */
    public ActionBarContextView f84e;
    public a.InterfaceC0002a f;
    public WeakReference<View> g;
    public boolean h;
    public a.b.o.i.g i;

    public d(Context context, ActionBarContextView actionBarContextView, a.InterfaceC0002a interfaceC0002a, boolean z) {
        this.f83d = context;
        this.f84e = actionBarContextView;
        this.f = interfaceC0002a;
        a.b.o.i.g gVar = new a.b.o.i.g(actionBarContextView.getContext());
        gVar.l = 1;
        this.i = gVar;
        gVar.f152e = this;
    }

    @Override // a.b.o.i.g.a
    public void a(a.b.o.i.g gVar) {
        i();
        a.b.p.c cVar = this.f84e.f189e;
        if (cVar != null) {
            cVar.n();
        }
    }

    @Override // a.b.o.i.g.a
    public boolean b(a.b.o.i.g gVar, MenuItem menuItem) {
        return this.f.c(this, menuItem);
    }

    @Override // a.b.o.a
    public void c() {
        if (this.h) {
            return;
        }
        this.h = true;
        this.f84e.sendAccessibilityEvent(32);
        this.f.b(this);
    }

    @Override // a.b.o.a
    public View d() {
        WeakReference<View> weakReference = this.g;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // a.b.o.a
    public Menu e() {
        return this.i;
    }

    @Override // a.b.o.a
    public MenuInflater f() {
        return new f(this.f84e.getContext());
    }

    @Override // a.b.o.a
    public CharSequence g() {
        return this.f84e.getSubtitle();
    }

    @Override // a.b.o.a
    public CharSequence h() {
        return this.f84e.getTitle();
    }

    @Override // a.b.o.a
    public void i() {
        this.f.a(this, this.i);
    }

    @Override // a.b.o.a
    public boolean j() {
        return this.f84e.s;
    }

    @Override // a.b.o.a
    public void k(View view) {
        this.f84e.setCustomView(view);
        this.g = view != null ? new WeakReference<>(view) : null;
    }

    @Override // a.b.o.a
    public void l(int i) {
        this.f84e.setSubtitle(this.f83d.getString(i));
    }

    @Override // a.b.o.a
    public void m(CharSequence charSequence) {
        this.f84e.setSubtitle(charSequence);
    }

    @Override // a.b.o.a
    public void n(int i) {
        this.f84e.setTitle(this.f83d.getString(i));
    }

    @Override // a.b.o.a
    public void o(CharSequence charSequence) {
        this.f84e.setTitle(charSequence);
    }

    @Override // a.b.o.a
    public void p(boolean z) {
        this.f77c = z;
        this.f84e.setTitleOptional(z);
    }
}
