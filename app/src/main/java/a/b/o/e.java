package a.b.o;

import a.b.o.a;
import a.b.o.i.j;
import a.b.o.i.o;
import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class e extends ActionMode {

    /* renamed from: a, reason: collision with root package name */
    public final Context f85a;

    /* renamed from: b, reason: collision with root package name */
    public final a.b.o.a f86b;

    public static class a implements a.InterfaceC0002a {

        /* renamed from: a, reason: collision with root package name */
        public final ActionMode.Callback f87a;

        /* renamed from: b, reason: collision with root package name */
        public final Context f88b;

        /* renamed from: c, reason: collision with root package name */
        public final ArrayList<e> f89c = new ArrayList<>();

        /* renamed from: d, reason: collision with root package name */
        public final a.e.h<Menu, Menu> f90d = new a.e.h<>();

        public a(Context context, ActionMode.Callback callback) {
            this.f88b = context;
            this.f87a = callback;
        }

        @Override // a.b.o.a.InterfaceC0002a
        public boolean a(a.b.o.a aVar, Menu menu) {
            return this.f87a.onPrepareActionMode(e(aVar), f(menu));
        }

        @Override // a.b.o.a.InterfaceC0002a
        public void b(a.b.o.a aVar) {
            this.f87a.onDestroyActionMode(e(aVar));
        }

        @Override // a.b.o.a.InterfaceC0002a
        public boolean c(a.b.o.a aVar, MenuItem menuItem) {
            return this.f87a.onActionItemClicked(e(aVar), new j(this.f88b, (a.g.f.a.b) menuItem));
        }

        @Override // a.b.o.a.InterfaceC0002a
        public boolean d(a.b.o.a aVar, Menu menu) {
            return this.f87a.onCreateActionMode(e(aVar), f(menu));
        }

        public ActionMode e(a.b.o.a aVar) {
            int size = this.f89c.size();
            for (int i = 0; i < size; i++) {
                e eVar = this.f89c.get(i);
                if (eVar != null && eVar.f86b == aVar) {
                    return eVar;
                }
            }
            e eVar2 = new e(this.f88b, aVar);
            this.f89c.add(eVar2);
            return eVar2;
        }

        public final Menu f(Menu menu) {
            Menu orDefault = this.f90d.getOrDefault(menu, null);
            if (orDefault != null) {
                return orDefault;
            }
            o oVar = new o(this.f88b, (a.g.f.a.a) menu);
            this.f90d.put(menu, oVar);
            return oVar;
        }
    }

    public e(Context context, a.b.o.a aVar) {
        this.f85a = context;
        this.f86b = aVar;
    }

    @Override // android.view.ActionMode
    public void finish() {
        this.f86b.c();
    }

    @Override // android.view.ActionMode
    public View getCustomView() {
        return this.f86b.d();
    }

    @Override // android.view.ActionMode
    public Menu getMenu() {
        return new o(this.f85a, (a.g.f.a.a) this.f86b.e());
    }

    @Override // android.view.ActionMode
    public MenuInflater getMenuInflater() {
        return this.f86b.f();
    }

    @Override // android.view.ActionMode
    public CharSequence getSubtitle() {
        return this.f86b.g();
    }

    @Override // android.view.ActionMode
    public Object getTag() {
        return this.f86b.f76b;
    }

    @Override // android.view.ActionMode
    public CharSequence getTitle() {
        return this.f86b.h();
    }

    @Override // android.view.ActionMode
    public boolean getTitleOptionalHint() {
        return this.f86b.f77c;
    }

    @Override // android.view.ActionMode
    public void invalidate() {
        this.f86b.i();
    }

    @Override // android.view.ActionMode
    public boolean isTitleOptional() {
        return this.f86b.j();
    }

    @Override // android.view.ActionMode
    public void setCustomView(View view) {
        this.f86b.k(view);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(int i) {
        this.f86b.l(i);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(CharSequence charSequence) {
        this.f86b.m(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTag(Object obj) {
        this.f86b.f76b = obj;
    }

    @Override // android.view.ActionMode
    public void setTitle(int i) {
        this.f86b.n(i);
    }

    @Override // android.view.ActionMode
    public void setTitle(CharSequence charSequence) {
        this.f86b.o(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTitleOptionalHint(boolean z) {
        this.f86b.p(z);
    }
}
