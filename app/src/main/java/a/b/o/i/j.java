package a.b.o.i;

import a.g.j.b;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class j extends a.b.o.i.c implements MenuItem {

    /* renamed from: d */
    public final a.g.f.a.b f162d;

    /* renamed from: e */
    public Method f163e;

    public class a extends a.g.j.b {

        /* renamed from: b */
        public final ActionProvider f164b;

        public a(Context context, ActionProvider actionProvider) {
            super(context);
            this.f164b = actionProvider;
        }
    }

    public class b extends a implements ActionProvider.VisibilityListener {

        /* renamed from: d */
        public b.a f166d;

        public b(j jVar, Context context, ActionProvider actionProvider) {
            super(context, actionProvider);
        }

        @Override // a.g.j.b
        public boolean a() {
            return this.f164b.isVisible();
        }

        @Override // a.g.j.b
        public View b(MenuItem menuItem) {
            return this.f164b.onCreateActionView(menuItem);
        }

        @Override // a.g.j.b
        public boolean c() {
            return this.f164b.overridesItemVisibility();
        }

        @Override // a.g.j.b
        public void d(b.a aVar) {
            this.f166d = aVar;
            this.f164b.setVisibilityListener(this);
        }

        @Override // android.view.ActionProvider.VisibilityListener
        public void onActionProviderVisibilityChanged(boolean z) {
            b.a aVar = this.f166d;
            if (aVar != null) {
                g gVar = i.this.n;
                gVar.h = true;
                gVar.q(true);
            }
        }
    }

    public static class c extends FrameLayout implements a.b.o.b {

        /* renamed from: b */
        public final CollapsibleActionView f167b;

        /* JADX WARN: Multi-variable type inference failed */
        public c(View view) {
            super(view.getContext());
            this.f167b = (CollapsibleActionView) view;
            addView(view);
        }

        @Override // a.b.o.b
        public void a() {
            this.f167b.onActionViewExpanded();
        }

        @Override // a.b.o.b
        public void d() {
            this.f167b.onActionViewCollapsed();
        }
    }

    public class d implements MenuItem.OnActionExpandListener {

        /* renamed from: a */
        public final MenuItem.OnActionExpandListener f168a;

        public d(MenuItem.OnActionExpandListener onActionExpandListener) {
            this.f168a = onActionExpandListener;
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionCollapse(MenuItem menuItem) {
            return this.f168a.onMenuItemActionCollapse(j.this.c(menuItem));
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionExpand(MenuItem menuItem) {
            return this.f168a.onMenuItemActionExpand(j.this.c(menuItem));
        }
    }

    public class e implements MenuItem.OnMenuItemClickListener {

        /* renamed from: a */
        public final MenuItem.OnMenuItemClickListener f170a;

        public e(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
            this.f170a = onMenuItemClickListener;
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            return this.f170a.onMenuItemClick(j.this.c(menuItem));
        }
    }

    public j(Context context, a.g.f.a.b bVar) {
        super(context);
        if (bVar == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.f162d = bVar;
    }

    @Override // android.view.MenuItem
    public boolean collapseActionView() {
        return this.f162d.collapseActionView();
    }

    @Override // android.view.MenuItem
    public boolean expandActionView() {
        return this.f162d.expandActionView();
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        a.g.j.b bVarA = this.f162d.a();
        if (bVarA instanceof a) {
            return ((a) bVarA).f164b;
        }
        return null;
    }

    @Override // android.view.MenuItem
    public View getActionView() {
        View actionView = this.f162d.getActionView();
        return actionView instanceof c ? (View) ((c) actionView).f167b : actionView;
    }

    @Override // android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f162d.getAlphabeticModifiers();
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f162d.getAlphabeticShortcut();
    }

    @Override // android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f162d.getContentDescription();
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f162d.getGroupId();
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return this.f162d.getIcon();
    }

    @Override // android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f162d.getIconTintList();
    }

    @Override // android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f162d.getIconTintMode();
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f162d.getIntent();
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f162d.getItemId();
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f162d.getMenuInfo();
    }

    @Override // android.view.MenuItem
    public int getNumericModifiers() {
        return this.f162d.getNumericModifiers();
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f162d.getNumericShortcut();
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f162d.getOrder();
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return d(this.f162d.getSubMenu());
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f162d.getTitle();
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        return this.f162d.getTitleCondensed();
    }

    @Override // android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f162d.getTooltipText();
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.f162d.hasSubMenu();
    }

    @Override // android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.f162d.isActionViewExpanded();
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return this.f162d.isCheckable();
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return this.f162d.isChecked();
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return this.f162d.isEnabled();
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return this.f162d.isVisible();
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        b bVar = new b(this, this.f122a, actionProvider);
        a.g.f.a.b bVar2 = this.f162d;
        if (actionProvider == null) {
            bVar = null;
        }
        bVar2.b(bVar);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(int i) {
        this.f162d.setActionView(i);
        View actionView = this.f162d.getActionView();
        if (actionView instanceof CollapsibleActionView) {
            this.f162d.setActionView(new c(actionView));
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new c(view);
        }
        this.f162d.setActionView(view);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c2) {
        this.f162d.setAlphabeticShortcut(c2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c2, int i) {
        this.f162d.setAlphabeticShortcut(c2, i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z) {
        this.f162d.setCheckable(z);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z) {
        this.f162d.setChecked(z);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setContentDescription(CharSequence charSequence) {
        this.f162d.setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z) {
        this.f162d.setEnabled(z);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i) {
        this.f162d.setIcon(i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f162d.setIcon(drawable);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f162d.setIconTintList(colorStateList);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f162d.setIconTintMode(mode);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f162d.setIntent(intent);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c2) {
        this.f162d.setNumericShortcut(c2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c2, int i) {
        this.f162d.setNumericShortcut(c2, i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f162d.setOnActionExpandListener(onActionExpandListener != null ? new d(onActionExpandListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f162d.setOnMenuItemClickListener(onMenuItemClickListener != null ? new e(onMenuItemClickListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c2, char c3) {
        this.f162d.setShortcut(c2, c3);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c2, char c3, int i, int i2) {
        this.f162d.setShortcut(c2, c3, i, i2);
        return this;
    }

    @Override // android.view.MenuItem
    public void setShowAsAction(int i) {
        this.f162d.setShowAsAction(i);
    }

    @Override // android.view.MenuItem
    public MenuItem setShowAsActionFlags(int i) {
        this.f162d.setShowAsActionFlags(i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i) {
        this.f162d.setTitle(i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f162d.setTitle(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f162d.setTitleCondensed(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTooltipText(CharSequence charSequence) {
        this.f162d.setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z) {
        return this.f162d.setVisible(z);
    }
}
