package a.b.o.i;

import a.g.j.b;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.widget.LinearLayout;

/* loaded from: classes.dex */
public final class i implements a.g.f.a.b {
    public a.g.j.b A;
    public MenuItem.OnActionExpandListener B;
    public ContextMenu.ContextMenuInfo D;

    /* renamed from: a */
    public final int f156a;

    /* renamed from: b */
    public final int f157b;

    /* renamed from: c */
    public final int f158c;

    /* renamed from: d */
    public final int f159d;

    /* renamed from: e */
    public CharSequence f160e;
    public CharSequence f;
    public Intent g;
    public char h;
    public char j;
    public Drawable l;
    public g n;
    public r o;
    public MenuItem.OnMenuItemClickListener p;
    public CharSequence q;
    public CharSequence r;
    public int y;
    public View z;
    public int i = 4096;
    public int k = 4096;
    public int m = 0;
    public ColorStateList s = null;
    public PorterDuff.Mode t = null;
    public boolean u = false;
    public boolean v = false;
    public boolean w = false;
    public int x = 16;
    public boolean C = false;

    public class a implements b.a {
        public a() {
        }
    }

    public i(g gVar, int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        this.y = 0;
        this.n = gVar;
        this.f156a = i2;
        this.f157b = i;
        this.f158c = i3;
        this.f159d = i4;
        this.f160e = charSequence;
        this.y = i5;
    }

    public static void c(StringBuilder sb, int i, int i2, String str) {
        if ((i & i2) == i2) {
            sb.append(str);
        }
    }

    @Override // a.g.f.a.b
    public a.g.j.b a() {
        return this.A;
    }

    @Override // a.g.f.a.b
    public a.g.f.a.b b(a.g.j.b bVar) {
        a.g.j.b bVar2 = this.A;
        if (bVar2 != null) {
            bVar2.f679a = null;
        }
        this.z = null;
        this.A = bVar;
        this.n.q(true);
        a.g.j.b bVar3 = this.A;
        if (bVar3 != null) {
            bVar3.d(new a());
        }
        return this;
    }

    @Override // a.g.f.a.b, android.view.MenuItem
    public boolean collapseActionView() {
        if ((this.y & 8) == 0) {
            return false;
        }
        if (this.z == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.n.d(this);
        }
        return false;
    }

    public final Drawable d(Drawable drawable) {
        if (drawable != null && this.w && (this.u || this.v)) {
            drawable = drawable.mutate();
            if (this.u) {
                drawable.setTintList(this.s);
            }
            if (this.v) {
                drawable.setTintMode(this.t);
            }
            this.w = false;
        }
        return drawable;
    }

    public char e() {
        return this.n.n() ? this.j : this.h;
    }

    @Override // a.g.f.a.b, android.view.MenuItem
    public boolean expandActionView() {
        if (!f()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.n.f(this);
        }
        return false;
    }

    public boolean f() {
        a.g.j.b bVar;
        if ((this.y & 8) == 0) {
            return false;
        }
        if (this.z == null && (bVar = this.A) != null) {
            this.z = bVar.b(this);
        }
        return this.z != null;
    }

    public boolean g() {
        return (this.x & 32) == 32;
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // a.g.f.a.b, android.view.MenuItem
    public View getActionView() {
        View view = this.z;
        if (view != null) {
            return view;
        }
        a.g.j.b bVar = this.A;
        if (bVar == null) {
            return null;
        }
        View viewB = bVar.b(this);
        this.z = viewB;
        return viewB;
    }

    @Override // a.g.f.a.b, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.k;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.j;
    }

    @Override // a.g.f.a.b, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.q;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f157b;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        Drawable drawable = this.l;
        if (drawable != null) {
            return d(drawable);
        }
        int i = this.m;
        if (i == 0) {
            return null;
        }
        Drawable drawableB = a.b.l.a.a.b(this.n.f148a, i);
        this.m = 0;
        this.l = drawableB;
        return d(drawableB);
    }

    @Override // a.g.f.a.b, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.s;
    }

    @Override // a.g.f.a.b, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.t;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.g;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public int getItemId() {
        return this.f156a;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.D;
    }

    @Override // a.g.f.a.b, android.view.MenuItem
    public int getNumericModifiers() {
        return this.i;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.h;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f158c;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return this.o;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public CharSequence getTitle() {
        return this.f160e;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f;
        return charSequence != null ? charSequence : this.f160e;
    }

    @Override // a.g.f.a.b, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.r;
    }

    public boolean h() {
        return (this.x & 4) != 0;
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.o != null;
    }

    public a.g.f.a.b i(View view) {
        int i;
        this.z = view;
        this.A = null;
        if (view != null && view.getId() == -1 && (i = this.f156a) > 0) {
            view.setId(i);
        }
        this.n.p();
        return this;
    }

    @Override // a.g.f.a.b, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.C;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.x & 1) == 1;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.x & 2) == 2;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.x & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        a.g.j.b bVar = this.A;
        return (bVar == null || !bVar.c()) ? (this.x & 8) == 0 : (this.x & 8) == 0 && this.A.a();
    }

    public void j(boolean z) {
        int i = this.x;
        int i2 = (z ? 2 : 0) | (i & (-3));
        this.x = i2;
        if (i != i2) {
            this.n.q(false);
        }
    }

    public void k(boolean z) {
        this.x = z ? this.x | 32 : this.x & (-33);
    }

    public boolean l(boolean z) {
        int i = this.x;
        int i2 = (z ? 0 : 8) | (i & (-9));
        this.x = i2;
        return i != i2;
    }

    public boolean m() {
        return this.n.o() && e() != 0;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // a.g.f.a.b, android.view.MenuItem
    public MenuItem setActionView(int i) {
        Context context = this.n.f148a;
        i(LayoutInflater.from(context).inflate(i, (ViewGroup) new LinearLayout(context), false));
        return this;
    }

    @Override // a.g.f.a.b, android.view.MenuItem
    public /* bridge */ /* synthetic */ MenuItem setActionView(View view) {
        i(view);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c2) {
        if (this.j == c2) {
            return this;
        }
        this.j = Character.toLowerCase(c2);
        this.n.q(false);
        return this;
    }

    @Override // a.g.f.a.b, android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c2, int i) {
        if (this.j == c2 && this.k == i) {
            return this;
        }
        this.j = Character.toLowerCase(c2);
        this.k = KeyEvent.normalizeMetaState(i);
        this.n.q(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z) {
        int i = this.x;
        int i2 = (z ? 1 : 0) | (i & (-2));
        this.x = i2;
        if (i != i2) {
            this.n.q(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z) {
        if ((this.x & 4) != 0) {
            g gVar = this.n;
            if (gVar == null) {
                throw null;
            }
            int groupId = getGroupId();
            int size = gVar.f.size();
            gVar.z();
            for (int i = 0; i < size; i++) {
                i iVar = gVar.f.get(i);
                if (iVar.f157b == groupId && iVar.h() && iVar.isCheckable()) {
                    iVar.j(iVar == this);
                }
            }
            gVar.y();
        } else {
            j(z);
        }
        return this;
    }

    @Override // a.g.f.a.b, android.view.MenuItem
    public a.g.f.a.b setContentDescription(CharSequence charSequence) {
        this.q = charSequence;
        this.n.q(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setContentDescription(CharSequence charSequence) {
        this.q = charSequence;
        this.n.q(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z) {
        this.x = z ? this.x | 16 : this.x & (-17);
        this.n.q(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i) {
        this.l = null;
        this.m = i;
        this.w = true;
        this.n.q(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.m = 0;
        this.l = drawable;
        this.w = true;
        this.n.q(false);
        return this;
    }

    @Override // a.g.f.a.b, android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.s = colorStateList;
        this.u = true;
        this.w = true;
        this.n.q(false);
        return this;
    }

    @Override // a.g.f.a.b, android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.t = mode;
        this.v = true;
        this.w = true;
        this.n.q(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c2) {
        if (this.h == c2) {
            return this;
        }
        this.h = c2;
        this.n.q(false);
        return this;
    }

    @Override // a.g.f.a.b, android.view.MenuItem
    public MenuItem setNumericShortcut(char c2, int i) {
        if (this.h == c2 && this.i == i) {
            return this;
        }
        this.h = c2;
        this.i = KeyEvent.normalizeMetaState(i);
        this.n.q(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.B = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.p = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c2, char c3) {
        this.h = c2;
        this.j = Character.toLowerCase(c3);
        this.n.q(false);
        return this;
    }

    @Override // a.g.f.a.b, android.view.MenuItem
    public MenuItem setShortcut(char c2, char c3, int i, int i2) {
        this.h = c2;
        this.i = KeyEvent.normalizeMetaState(i);
        this.j = Character.toLowerCase(c3);
        this.k = KeyEvent.normalizeMetaState(i2);
        this.n.q(false);
        return this;
    }

    @Override // a.g.f.a.b, android.view.MenuItem
    public void setShowAsAction(int i) {
        int i2 = i & 3;
        if (i2 != 0 && i2 != 1 && i2 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.y = i;
        this.n.p();
    }

    @Override // a.g.f.a.b, android.view.MenuItem
    public MenuItem setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i) {
        setTitle(this.n.f148a.getString(i));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f160e = charSequence;
        this.n.q(false);
        r rVar = this.o;
        if (rVar != null) {
            rVar.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f = charSequence;
        this.n.q(false);
        return this;
    }

    @Override // a.g.f.a.b, android.view.MenuItem
    public a.g.f.a.b setTooltipText(CharSequence charSequence) {
        this.r = charSequence;
        this.n.q(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTooltipText(CharSequence charSequence) {
        this.r = charSequence;
        this.n.q(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z) {
        if (l(z)) {
            g gVar = this.n;
            gVar.h = true;
            gVar.q(true);
        }
        return this;
    }

    public String toString() {
        CharSequence charSequence = this.f160e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }
}
