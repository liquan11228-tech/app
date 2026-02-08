package a.b.o.i;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* loaded from: classes.dex */
public class s extends o implements SubMenu {

    /* renamed from: e */
    public final a.g.f.a.c f185e;

    public s(Context context, a.g.f.a.c cVar) {
        super(context, cVar);
        this.f185e = cVar;
    }

    @Override // android.view.SubMenu
    public void clearHeader() {
        this.f185e.clearHeader();
    }

    @Override // android.view.SubMenu
    public MenuItem getItem() {
        return c(this.f185e.getItem());
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(int i) {
        this.f185e.setHeaderIcon(i);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(Drawable drawable) {
        this.f185e.setHeaderIcon(drawable);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(int i) {
        this.f185e.setHeaderTitle(i);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(CharSequence charSequence) {
        this.f185e.setHeaderTitle(charSequence);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderView(View view) {
        this.f185e.setHeaderView(view);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(int i) {
        this.f185e.setIcon(i);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(Drawable drawable) {
        this.f185e.setIcon(drawable);
        return this;
    }
}
