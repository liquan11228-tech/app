package a.b.p;

import a.b.p.n0;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: b */
    public static final PorterDuff.Mode f246b = PorterDuff.Mode.SRC_IN;

    /* renamed from: c */
    public static j f247c;

    /* renamed from: a */
    public n0 f248a;

    public class a implements n0.c {

        /* renamed from: a */
        public final int[] f249a = {a.b.e.abc_textfield_search_default_mtrl_alpha, a.b.e.abc_textfield_default_mtrl_alpha, a.b.e.abc_ab_share_pack_mtrl_alpha};

        /* renamed from: b */
        public final int[] f250b = {a.b.e.abc_ic_commit_search_api_mtrl_alpha, a.b.e.abc_seekbar_tick_mark_material, a.b.e.abc_ic_menu_share_mtrl_alpha, a.b.e.abc_ic_menu_copy_mtrl_am_alpha, a.b.e.abc_ic_menu_cut_mtrl_alpha, a.b.e.abc_ic_menu_selectall_mtrl_alpha, a.b.e.abc_ic_menu_paste_mtrl_am_alpha};

        /* renamed from: c */
        public final int[] f251c = {a.b.e.abc_textfield_activated_mtrl_alpha, a.b.e.abc_textfield_search_activated_mtrl_alpha, a.b.e.abc_cab_background_top_mtrl_alpha, a.b.e.abc_text_cursor_material, a.b.e.abc_text_select_handle_left_mtrl_dark, a.b.e.abc_text_select_handle_middle_mtrl_dark, a.b.e.abc_text_select_handle_right_mtrl_dark, a.b.e.abc_text_select_handle_left_mtrl_light, a.b.e.abc_text_select_handle_middle_mtrl_light, a.b.e.abc_text_select_handle_right_mtrl_light};

        /* renamed from: d */
        public final int[] f252d = {a.b.e.abc_popup_background_mtrl_mult, a.b.e.abc_cab_background_internal_bg, a.b.e.abc_menu_hardkey_panel_mtrl_mult};

        /* renamed from: e */
        public final int[] f253e = {a.b.e.abc_tab_indicator_material, a.b.e.abc_textfield_search_material};
        public final int[] f = {a.b.e.abc_btn_check_material, a.b.e.abc_btn_radio_material, a.b.e.abc_btn_check_material_anim, a.b.e.abc_btn_radio_material_anim};

        public final boolean a(int[] iArr, int i) {
            for (int i2 : iArr) {
                if (i2 == i) {
                    return true;
                }
            }
            return false;
        }

        public final ColorStateList b(Context context, int i) {
            int iC = s0.c(context, a.b.a.colorControlHighlight);
            return new ColorStateList(new int[][]{s0.f305b, s0.f307d, s0.f306c, s0.f}, new int[]{s0.b(context, a.b.a.colorButtonNormal), a.g.e.a.a(iC, i), a.g.e.a.a(iC, i), i});
        }

        public ColorStateList c(Context context, int i) {
            if (i == a.b.e.abc_edit_text_material) {
                return a.b.l.a.a.a(context, a.b.c.abc_tint_edittext);
            }
            if (i == a.b.e.abc_switch_track_mtrl_alpha) {
                return a.b.l.a.a.a(context, a.b.c.abc_tint_switch_track);
            }
            if (i == a.b.e.abc_switch_thumb_material) {
                int[][] iArr = new int[3][];
                int[] iArr2 = new int[3];
                ColorStateList colorStateListD = s0.d(context, a.b.a.colorSwitchThumbNormal);
                if (colorStateListD == null || !colorStateListD.isStateful()) {
                    iArr[0] = s0.f305b;
                    iArr2[0] = s0.b(context, a.b.a.colorSwitchThumbNormal);
                    iArr[1] = s0.f308e;
                    iArr2[1] = s0.c(context, a.b.a.colorControlActivated);
                    iArr[2] = s0.f;
                    iArr2[2] = s0.c(context, a.b.a.colorSwitchThumbNormal);
                } else {
                    iArr[0] = s0.f305b;
                    iArr2[0] = colorStateListD.getColorForState(iArr[0], 0);
                    iArr[1] = s0.f308e;
                    iArr2[1] = s0.c(context, a.b.a.colorControlActivated);
                    iArr[2] = s0.f;
                    iArr2[2] = colorStateListD.getDefaultColor();
                }
                return new ColorStateList(iArr, iArr2);
            }
            if (i == a.b.e.abc_btn_default_mtrl_shape) {
                return b(context, s0.c(context, a.b.a.colorButtonNormal));
            }
            if (i == a.b.e.abc_btn_borderless_material) {
                return b(context, 0);
            }
            if (i == a.b.e.abc_btn_colored_material) {
                return b(context, s0.c(context, a.b.a.colorAccent));
            }
            if (i == a.b.e.abc_spinner_mtrl_am_alpha || i == a.b.e.abc_spinner_textfield_background_material) {
                return a.b.l.a.a.a(context, a.b.c.abc_tint_spinner);
            }
            if (a(this.f250b, i)) {
                return s0.d(context, a.b.a.colorControlNormal);
            }
            if (a(this.f253e, i)) {
                return a.b.l.a.a.a(context, a.b.c.abc_tint_default);
            }
            if (a(this.f, i)) {
                return a.b.l.a.a.a(context, a.b.c.abc_tint_btn_checkable);
            }
            if (i == a.b.e.abc_seekbar_thumb_material) {
                return a.b.l.a.a.a(context, a.b.c.abc_tint_seek_thumb);
            }
            return null;
        }

        public final void d(Drawable drawable, int i, PorterDuff.Mode mode) {
            PorterDuffColorFilter porterDuffColorFilterG;
            if (e0.a(drawable)) {
                drawable = drawable.mutate();
            }
            if (mode == null) {
                mode = j.f246b;
            }
            synchronized (j.class) {
                porterDuffColorFilterG = n0.g(i, mode);
            }
            drawable.setColorFilter(porterDuffColorFilterG);
        }
    }

    public static synchronized j a() {
        if (f247c == null) {
            d();
        }
        return f247c;
    }

    public static synchronized void d() {
        if (f247c == null) {
            j jVar = new j();
            f247c = jVar;
            jVar.f248a = n0.c();
            n0 n0Var = f247c.f248a;
            a aVar = new a();
            synchronized (n0Var) {
                n0Var.g = aVar;
            }
        }
    }

    public static void e(Drawable drawable, v0 v0Var, int[] iArr) {
        n0.k(drawable, v0Var, iArr);
    }

    public synchronized Drawable b(Context context, int i) {
        return this.f248a.e(context, i);
    }

    public synchronized ColorStateList c(Context context, int i) {
        return this.f248a.h(context, i);
    }
}
