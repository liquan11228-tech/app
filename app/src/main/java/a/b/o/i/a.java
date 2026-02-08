package a.b.o.i;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* loaded from: classes.dex */
public class a implements a.g.f.a.b {

    /* renamed from: a, reason: collision with root package name */
    public final int f113a;

    /* renamed from: b, reason: collision with root package name */
    public final int f114b;

    /* renamed from: c, reason: collision with root package name */
    public final int f115c;

    /* renamed from: d, reason: collision with root package name */
    public CharSequence f116d;

    /* renamed from: e, reason: collision with root package name */
    public CharSequence f117e;
    public Intent f;
    public char g;
    public char i;
    public Drawable k;
    public Context l;
    public CharSequence m;
    public CharSequence n;
    public int h = 4096;
    public int j = 4096;
    public ColorStateList o = null;
    public PorterDuff.Mode p = null;
    public boolean q = false;
    public boolean r = false;
    public int s = 16;

    public a(Context context, int i, int i2, int i3, CharSequence charSequence) {
        this.l = context;
        this.f113a = i2;
        this.f114b = i;
        this.f115c = i3;
        this.f116d = charSequence;
    }

    @Override // a.g.f.a.b
    public a.g.j.b a() {
        return null;
    }

    @Override // a.g.f.a.b
    public a.g.f.a.b b(a.g.j.b bVar) {
        throw new UnsupportedOperationException();
    }

    public final void c() {
        if (this.k != null) {
            if (this.q || this.r) {
                Drawable drawable = this.k;
                this.k = drawable;
                Drawable drawableMutate = drawable.mutate();
                this.k = drawableMutate;
                if (this.q) {
                    drawableMutate.setTintList(this.o);
                }
                if (this.r) {
                    this.k.setTintMode(this.p);
                }
            }
        }
    }

    @Override // a.g.f.a.b, android.view.MenuItem
    public boolean collapseActionView() {
        return false;
    }

    @Override // a.g.f.a.b, android.view.MenuItem
    public boolean expandActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // a.g.f.a.b, android.view.MenuItem
    public View getActionView() {
        return null;
    }

    @Override // a.g.f.a.b, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.j;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.i;
    }

    @Override // a.g.f.a.b, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.m;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f114b;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return this.k;
    }

    @Override // a.g.f.a.b, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.o;
    }

    @Override // a.g.f.a.b, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.p;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f;
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f113a;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // a.g.f.a.b, android.view.MenuItem
    public int getNumericModifiers() {
        return this.h;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.g;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f115c;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f116d;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f117e;
        return charSequence != null ? charSequence : this.f116d;
    }

    @Override // a.g.f.a.b, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.n;
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return false;
    }

    @Override // a.g.f.a.b, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.s & 1) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.s & 2) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.s & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return (this.s & 8) == 0;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // a.g.f.a.b, android.view.MenuItem
    public MenuItem setActionView(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c2) {
        this.i = Character.toLowerCase(c2);
        return this;
    }

    @Override // a.g.f.a.b, android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c2, int i) {
        this.i = Character.toLowerCase(c2);
        this.j = KeyEvent.normalizeMetaState(i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z) {
        this.s = (z ? 1 : 0) | (this.s & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z) {
        this.s = (z ? 2 : 0) | (this.s & (-3));
        return this;
    }

    @Override // a.g.f.a.b, android.view.MenuItem
    public a.g.f.a.b setContentDescription(CharSequence charSequence) {
        this.m = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setContentDescription(CharSequence charSequence) {
        this.m = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z) {
        this.s = (z ? 16 : 0) | (this.s & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i) {
        this.k = a.g.d.a.b(this.l, i);
        c();
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.k = drawable;
        c();
        return this;
    }

    @Override // a.g.f.a.b, android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.o = colorStateList;
        this.q = true;
        c();
        return this;
    }

    @Override // a.g.f.a.b, android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.p = mode;
        this.r = true;
        c();
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c2) {
        this.g = c2;
        return this;
    }

    @Override // a.g.f.a.b, android.view.MenuItem
    public MenuItem setNumericShortcut(char c2, int i) {
        this.g = c2;
        this.h = KeyEvent.normalizeMetaState(i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c2, char c3) {
        this.g = c2;
        this.i = Character.toLowerCase(c3);
        return this;
    }

    @Override // a.g.f.a.b, android.view.MenuItem
    public MenuItem setShortcut(char c2, char c3, int i, int i2) {
        this.g = c2;
        this.h = KeyEvent.normalizeMetaState(i);
        this.i = Character.toLowerCase(c3);
        this.j = KeyEvent.normalizeMetaState(i2);
        return this;
    }

    @Override // a.g.f.a.b, android.view.MenuItem
    public void setShowAsAction(int i) {
    }

    @Override // a.g.f.a.b, android.view.MenuItem
    public MenuItem setShowAsActionFlags(int i) {
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i) {
        this.f116d = this.l.getResources().getString(i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f116d = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f117e = charSequence;
        return this;
    }

    @Override // a.g.f.a.b, android.view.MenuItem
    public a.g.f.a.b setTooltipText(CharSequence charSequence) {
        this.n = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTooltipText(CharSequence charSequence) {
        this.n = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z) {
        this.s = (this.s & 8) | (z ? 0 : 8);
        return this;
    }

    @Override // a.g.f.a.b, android.view.MenuItem
    public MenuItem setActionView(View view) {
        throw new UnsupportedOperationException();
    }
}
