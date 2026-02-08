package androidx.appcompat.view.menu;

import a.b.a;
import a.b.f;
import a.b.g;
import a.b.h;
import a.b.j;
import a.b.o.i.i;
import a.b.o.i.n;
import a.b.p.x0;
import a.g.j.k;
import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;

/* loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements n.a, AbsListView.SelectionBoundsAdjuster {

    /* renamed from: b */
    public i f938b;

    /* renamed from: c */
    public ImageView f939c;

    /* renamed from: d */
    public RadioButton f940d;

    /* renamed from: e */
    public TextView f941e;
    public CheckBox f;
    public TextView g;
    public ImageView h;
    public ImageView i;
    public LinearLayout j;
    public Drawable k;
    public int l;
    public Context m;
    public boolean n;
    public Drawable o;
    public boolean p;
    public LayoutInflater q;
    public boolean r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int i = a.listMenuViewStyle;
        x0 x0VarO = x0.o(getContext(), attributeSet, j.MenuView, i, 0);
        this.k = x0VarO.e(j.MenuView_android_itemBackground);
        this.l = x0VarO.j(j.MenuView_android_itemTextAppearance, -1);
        this.n = x0VarO.a(j.MenuView_preserveIconSpacing, false);
        this.m = context;
        this.o = x0VarO.e(j.MenuView_subMenuArrow);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{R.attr.divider}, a.dropDownListViewStyle, 0);
        this.p = typedArrayObtainStyledAttributes.hasValue(0);
        x0VarO.f336b.recycle();
        typedArrayObtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        if (this.q == null) {
            this.q = LayoutInflater.from(getContext());
        }
        return this.q;
    }

    private void setSubMenuArrowVisible(boolean z) {
        ImageView imageView = this.h;
        if (imageView != null) {
            imageView.setVisibility(z ? 0 : 8);
        }
    }

    public final void a() {
        CheckBox checkBox = (CheckBox) getInflater().inflate(g.abc_list_menu_item_checkbox, (ViewGroup) this, false);
        this.f = checkBox;
        LinearLayout linearLayout = this.j;
        if (linearLayout != null) {
            linearLayout.addView(checkBox, -1);
        } else {
            addView(checkBox, -1);
        }
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.i;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.i.getLayoutParams();
        rect.top = this.i.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
    }

    public final void b() {
        RadioButton radioButton = (RadioButton) getInflater().inflate(g.abc_list_menu_item_radio, (ViewGroup) this, false);
        this.f940d = radioButton;
        LinearLayout linearLayout = this.j;
        if (linearLayout != null) {
            linearLayout.addView(radioButton, -1);
        } else {
            addView(radioButton, -1);
        }
    }

    @Override // a.b.o.i.n.a
    public boolean c() {
        return false;
    }

    @Override // a.b.o.i.n.a
    public void d(i iVar, int i) {
        this.f938b = iVar;
        setVisibility(iVar.isVisible() ? 0 : 8);
        setTitle(c() ? iVar.getTitleCondensed() : iVar.f160e);
        setCheckable(iVar.isCheckable());
        boolean zM = iVar.m();
        iVar.e();
        e(zM);
        setIcon(iVar.getIcon());
        setEnabled(iVar.isEnabled());
        setSubMenuArrowVisible(iVar.hasSubMenu());
        setContentDescription(iVar.q);
    }

    public void e(boolean z) {
        int i;
        String string;
        int i2 = (z && this.f938b.m()) ? 0 : 8;
        if (i2 == 0) {
            TextView textView = this.g;
            i iVar = this.f938b;
            char cE = iVar.e();
            if (cE == 0) {
                string = "";
            } else {
                Resources resources = iVar.n.f148a.getResources();
                StringBuilder sb = new StringBuilder();
                if (ViewConfiguration.get(iVar.n.f148a).hasPermanentMenuKey()) {
                    sb.append(resources.getString(h.abc_prepend_shortcut_label));
                }
                int i3 = iVar.n.n() ? iVar.k : iVar.i;
                i.c(sb, i3, 65536, resources.getString(h.abc_menu_meta_shortcut_label));
                i.c(sb, i3, 4096, resources.getString(h.abc_menu_ctrl_shortcut_label));
                i.c(sb, i3, 2, resources.getString(h.abc_menu_alt_shortcut_label));
                i.c(sb, i3, 1, resources.getString(h.abc_menu_shift_shortcut_label));
                i.c(sb, i3, 4, resources.getString(h.abc_menu_sym_shortcut_label));
                i.c(sb, i3, 8, resources.getString(h.abc_menu_function_shortcut_label));
                if (cE == '\b') {
                    i = h.abc_menu_delete_shortcut_label;
                } else if (cE == '\n') {
                    i = h.abc_menu_enter_shortcut_label;
                } else if (cE != ' ') {
                    sb.append(cE);
                    string = sb.toString();
                } else {
                    i = h.abc_menu_space_shortcut_label;
                }
                sb.append(resources.getString(i));
                string = sb.toString();
            }
            textView.setText(string);
        }
        if (this.g.getVisibility() != i2) {
            this.g.setVisibility(i2);
        }
    }

    @Override // a.b.o.i.n.a
    public i getItemData() {
        return this.f938b;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        k.v(this, this.k);
        TextView textView = (TextView) findViewById(f.title);
        this.f941e = textView;
        int i = this.l;
        if (i != -1) {
            textView.setTextAppearance(this.m, i);
        }
        this.g = (TextView) findViewById(f.shortcut);
        ImageView imageView = (ImageView) findViewById(f.submenuarrow);
        this.h = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.o);
        }
        this.i = (ImageView) findViewById(f.group_divider);
        this.j = (LinearLayout) findViewById(f.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        if (this.f939c != null && this.n) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f939c.getLayoutParams();
            int i3 = layoutParams.height;
            if (i3 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i3;
            }
        }
        super.onMeasure(i, i2);
    }

    public void setCheckable(boolean z) {
        CompoundButton compoundButton;
        CompoundButton compoundButton2;
        if (!z && this.f940d == null && this.f == null) {
            return;
        }
        if (this.f938b.h()) {
            if (this.f940d == null) {
                b();
            }
            compoundButton = this.f940d;
            compoundButton2 = this.f;
        } else {
            if (this.f == null) {
                a();
            }
            compoundButton = this.f;
            compoundButton2 = this.f940d;
        }
        if (z) {
            compoundButton.setChecked(this.f938b.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (compoundButton2 == null || compoundButton2.getVisibility() == 8) {
                return;
            }
            compoundButton2.setVisibility(8);
            return;
        }
        CheckBox checkBox = this.f;
        if (checkBox != null) {
            checkBox.setVisibility(8);
        }
        RadioButton radioButton = this.f940d;
        if (radioButton != null) {
            radioButton.setVisibility(8);
        }
    }

    public void setChecked(boolean z) {
        CompoundButton compoundButton;
        if (this.f938b.h()) {
            if (this.f940d == null) {
                b();
            }
            compoundButton = this.f940d;
        } else {
            if (this.f == null) {
                a();
            }
            compoundButton = this.f;
        }
        compoundButton.setChecked(z);
    }

    public void setForceShowIcon(boolean z) {
        this.r = z;
        this.n = z;
    }

    public void setGroupDividerEnabled(boolean z) {
        ImageView imageView = this.i;
        if (imageView != null) {
            imageView.setVisibility((this.p || !z) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        boolean z = this.f938b.n.s || this.r;
        if (z || this.n) {
            if (this.f939c == null && drawable == null && !this.n) {
                return;
            }
            if (this.f939c == null) {
                ImageView imageView = (ImageView) getInflater().inflate(g.abc_list_menu_item_icon, (ViewGroup) this, false);
                this.f939c = imageView;
                LinearLayout linearLayout = this.j;
                if (linearLayout != null) {
                    linearLayout.addView(imageView, 0);
                } else {
                    addView(imageView, 0);
                }
            }
            if (drawable == null && !this.n) {
                this.f939c.setVisibility(8);
                return;
            }
            ImageView imageView2 = this.f939c;
            if (!z) {
                drawable = null;
            }
            imageView2.setImageDrawable(drawable);
            if (this.f939c.getVisibility() != 0) {
                this.f939c.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        int i;
        TextView textView;
        if (charSequence != null) {
            this.f941e.setText(charSequence);
            if (this.f941e.getVisibility() == 0) {
                return;
            }
            textView = this.f941e;
            i = 0;
        } else {
            i = 8;
            if (this.f941e.getVisibility() == 8) {
                return;
            } else {
                textView = this.f941e;
            }
        }
        textView.setVisibility(i);
    }
}
