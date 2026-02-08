package a.b.o.i;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public final Context f122a;

    /* renamed from: b, reason: collision with root package name */
    public a.e.h<a.g.f.a.b, MenuItem> f123b;

    /* renamed from: c, reason: collision with root package name */
    public a.e.h<a.g.f.a.c, SubMenu> f124c;

    public c(Context context) {
        this.f122a = context;
    }

    public final MenuItem c(MenuItem menuItem) {
        if (!(menuItem instanceof a.g.f.a.b)) {
            return menuItem;
        }
        a.g.f.a.b bVar = (a.g.f.a.b) menuItem;
        if (this.f123b == null) {
            this.f123b = new a.e.h<>();
        }
        MenuItem orDefault = this.f123b.getOrDefault(menuItem, null);
        if (orDefault != null) {
            return orDefault;
        }
        j jVar = new j(this.f122a, bVar);
        this.f123b.put(bVar, jVar);
        return jVar;
    }

    public final SubMenu d(SubMenu subMenu) {
        if (!(subMenu instanceof a.g.f.a.c)) {
            return subMenu;
        }
        a.g.f.a.c cVar = (a.g.f.a.c) subMenu;
        if (this.f124c == null) {
            this.f124c = new a.e.h<>();
        }
        SubMenu subMenu2 = this.f124c.get(cVar);
        if (subMenu2 != null) {
            return subMenu2;
        }
        s sVar = new s(this.f122a, cVar);
        this.f124c.put(cVar, sVar);
        return sVar;
    }
}
