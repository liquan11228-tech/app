package a.b.p;

import a.b.p.j;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public final class n0 {
    public static n0 i;

    /* renamed from: a */
    public WeakHashMap<Context, a.e.i<ColorStateList>> f273a;

    /* renamed from: b */
    public a.e.h<String, b> f274b;

    /* renamed from: c */
    public a.e.i<String> f275c;

    /* renamed from: d */
    public final WeakHashMap<Context, a.e.e<WeakReference<Drawable.ConstantState>>> f276d = new WeakHashMap<>(0);

    /* renamed from: e */
    public TypedValue f277e;
    public boolean f;
    public c g;
    public static final PorterDuff.Mode h = PorterDuff.Mode.SRC_IN;
    public static final a j = new a(6);

    public static class a extends a.e.f<Integer, PorterDuffColorFilter> {
        public a(int i) {
            super(i);
        }
    }

    public interface b {
        Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme);
    }

    public interface c {
    }

    public static synchronized n0 c() {
        if (i == null) {
            i = new n0();
        }
        return i;
    }

    public static synchronized PorterDuffColorFilter g(int i2, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilterA;
        a aVar = j;
        if (aVar == null) {
            throw null;
        }
        int i3 = (i2 + 31) * 31;
        porterDuffColorFilterA = aVar.a(Integer.valueOf(mode.hashCode() + i3));
        if (porterDuffColorFilterA == null) {
            porterDuffColorFilterA = new PorterDuffColorFilter(i2, mode);
            a aVar2 = j;
            if (aVar2 == null) {
                throw null;
            }
            aVar2.b(Integer.valueOf(mode.hashCode() + i3), porterDuffColorFilterA);
        }
        return porterDuffColorFilterA;
    }

    public static void k(Drawable drawable, v0 v0Var, int[] iArr) {
        if (!e0.a(drawable) || drawable.mutate() == drawable) {
            if (!v0Var.f316d && !v0Var.f315c) {
                drawable.clearColorFilter();
                return;
            }
            PorterDuffColorFilter porterDuffColorFilterG = null;
            ColorStateList colorStateList = v0Var.f316d ? v0Var.f313a : null;
            PorterDuff.Mode mode = v0Var.f315c ? v0Var.f314b : h;
            if (colorStateList != null && mode != null) {
                porterDuffColorFilterG = g(colorStateList.getColorForState(iArr, 0), mode);
            }
            drawable.setColorFilter(porterDuffColorFilterG);
        }
    }

    public final synchronized boolean a(Context context, long j2, Drawable drawable) {
        boolean z;
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState != null) {
            a.e.e<WeakReference<Drawable.ConstantState>> eVar = this.f276d.get(context);
            if (eVar == null) {
                eVar = new a.e.e<>();
                this.f276d.put(context, eVar);
            }
            eVar.d(j2, new WeakReference<>(constantState));
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    public final Drawable b(Context context, int i2) throws Resources.NotFoundException {
        if (this.f277e == null) {
            this.f277e = new TypedValue();
        }
        TypedValue typedValue = this.f277e;
        context.getResources().getValue(i2, typedValue, true);
        long j2 = (typedValue.assetCookie << 32) | typedValue.data;
        Drawable drawableD = d(context, j2);
        if (drawableD != null) {
            return drawableD;
        }
        c cVar = this.g;
        LayerDrawable layerDrawable = null;
        if (cVar != null) {
            if (i2 == a.b.e.abc_cab_background_top_material) {
                layerDrawable = new LayerDrawable(new Drawable[]{e(context, a.b.e.abc_cab_background_internal_bg), e(context, a.b.e.abc_cab_background_top_mtrl_alpha)});
            }
        }
        if (layerDrawable != null) {
            layerDrawable.setChangingConfigurations(typedValue.changingConfigurations);
            a(context, j2, layerDrawable);
        }
        return layerDrawable;
    }

    public final synchronized Drawable d(Context context, long j2) {
        a.e.e<WeakReference<Drawable.ConstantState>> eVar = this.f276d.get(context);
        if (eVar == null) {
            return null;
        }
        WeakReference<Drawable.ConstantState> weakReferenceC = eVar.c(j2, null);
        if (weakReferenceC != null) {
            Drawable.ConstantState constantState = weakReferenceC.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            int iB = a.e.d.b(eVar.f396c, eVar.f398e, j2);
            if (iB >= 0) {
                Object[] objArr = eVar.f397d;
                Object obj = objArr[iB];
                Object obj2 = a.e.e.f;
                if (obj != obj2) {
                    objArr[iB] = obj2;
                    eVar.f395b = true;
                }
            }
        }
        return null;
    }

    public synchronized Drawable e(Context context, int i2) {
        return f(context, i2, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x0028, code lost:
    
        if (r0 != false) goto L48;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized android.graphics.drawable.Drawable f(android.content.Context r5, int r6, boolean r7) {
        /*
            r4 = this;
            monitor-enter(r4)
            boolean r0 = r4.f     // Catch: java.lang.Throwable -> L47
            if (r0 == 0) goto L6
            goto L2a
        L6:
            r0 = 1
            r4.f = r0     // Catch: java.lang.Throwable -> L47
            int r1 = a.b.n.a.abc_vector_test     // Catch: java.lang.Throwable -> L47
            android.graphics.drawable.Drawable r1 = r4.e(r5, r1)     // Catch: java.lang.Throwable -> L47
            r2 = 0
            if (r1 == 0) goto L49
            boolean r3 = r1 instanceof a.n.a.a.b     // Catch: java.lang.Throwable -> L47
            if (r3 != 0) goto L28
            java.lang.String r3 = "android.graphics.drawable.VectorDrawable"
            java.lang.Class r1 = r1.getClass()     // Catch: java.lang.Throwable -> L47
            java.lang.String r1 = r1.getName()     // Catch: java.lang.Throwable -> L47
            boolean r1 = r3.equals(r1)     // Catch: java.lang.Throwable -> L47
            if (r1 == 0) goto L27
            goto L28
        L27:
            r0 = r2
        L28:
            if (r0 == 0) goto L49
        L2a:
            android.graphics.drawable.Drawable r0 = r4.i(r5, r6)     // Catch: java.lang.Throwable -> L47
            if (r0 != 0) goto L34
            android.graphics.drawable.Drawable r0 = r4.b(r5, r6)     // Catch: java.lang.Throwable -> L47
        L34:
            if (r0 != 0) goto L3a
            android.graphics.drawable.Drawable r0 = a.g.d.a.b(r5, r6)     // Catch: java.lang.Throwable -> L47
        L3a:
            if (r0 == 0) goto L40
            android.graphics.drawable.Drawable r0 = r4.j(r5, r6, r7, r0)     // Catch: java.lang.Throwable -> L47
        L40:
            if (r0 == 0) goto L45
            a.b.p.e0.b(r0)     // Catch: java.lang.Throwable -> L47
        L45:
            monitor-exit(r4)
            return r0
        L47:
            r5 = move-exception
            goto L53
        L49:
            r4.f = r2     // Catch: java.lang.Throwable -> L47
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L47
            java.lang.String r6 = "This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat."
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L47
            throw r5     // Catch: java.lang.Throwable -> L47
        L53:
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: a.b.p.n0.f(android.content.Context, int, boolean):android.graphics.drawable.Drawable");
    }

    public synchronized ColorStateList h(Context context, int i2) {
        ColorStateList colorStateListE;
        a.e.i<ColorStateList> iVar;
        WeakHashMap<Context, a.e.i<ColorStateList>> weakHashMap = this.f273a;
        ColorStateList colorStateListC = null;
        colorStateListE = (weakHashMap == null || (iVar = weakHashMap.get(context)) == null) ? null : iVar.e(i2, null);
        if (colorStateListE == null) {
            if (this.g != null) {
                colorStateListC = ((j.a) this.g).c(context, i2);
            }
            if (colorStateListC != null) {
                if (this.f273a == null) {
                    this.f273a = new WeakHashMap<>();
                }
                a.e.i<ColorStateList> iVar2 = this.f273a.get(context);
                if (iVar2 == null) {
                    iVar2 = new a.e.i<>(10);
                    this.f273a.put(context, iVar2);
                }
                iVar2.a(i2, colorStateListC);
            }
            colorStateListE = colorStateListC;
        }
        return colorStateListE;
    }

    public final Drawable i(Context context, int i2) throws XmlPullParserException, Resources.NotFoundException, IOException {
        int next;
        a.e.h<String, b> hVar = this.f274b;
        if (hVar == null || hVar.isEmpty()) {
            return null;
        }
        a.e.i<String> iVar = this.f275c;
        if (iVar != null) {
            String strE = iVar.e(i2, null);
            if ("appcompat_skip_skip".equals(strE) || (strE != null && this.f274b.getOrDefault(strE, null) == null)) {
                return null;
            }
        } else {
            this.f275c = new a.e.i<>(10);
        }
        if (this.f277e == null) {
            this.f277e = new TypedValue();
        }
        TypedValue typedValue = this.f277e;
        Resources resources = context.getResources();
        resources.getValue(i2, typedValue, true);
        long j2 = (typedValue.assetCookie << 32) | typedValue.data;
        Drawable drawableD = d(context, j2);
        if (drawableD != null) {
            return drawableD;
        }
        CharSequence charSequence = typedValue.string;
        if (charSequence != null && charSequence.toString().endsWith(".xml")) {
            try {
                XmlResourceParser xml = resources.getXml(i2);
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                String name = xml.getName();
                this.f275c.a(i2, name);
                b bVar = this.f274b.get(name);
                if (bVar != null) {
                    drawableD = bVar.a(context, xml, attributeSetAsAttributeSet, context.getTheme());
                }
                if (drawableD != null) {
                    drawableD.setChangingConfigurations(typedValue.changingConfigurations);
                    a(context, j2, drawableD);
                }
            } catch (Exception unused) {
            }
        }
        if (drawableD == null) {
            this.f275c.a(i2, "appcompat_skip_skip");
        }
        return drawableD;
    }

    /* JADX WARN: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.drawable.Drawable j(android.content.Context r10, int r11, boolean r12, android.graphics.drawable.Drawable r13) {
        /*
            r9 = this;
            android.content.res.ColorStateList r0 = r9.h(r10, r11)
            r1 = 0
            if (r0 == 0) goto L28
            boolean r10 = a.b.p.e0.a(r13)
            if (r10 == 0) goto L11
            android.graphics.drawable.Drawable r13 = r13.mutate()
        L11:
            r13.setTintList(r0)
            a.b.p.n0$c r10 = r9.g
            if (r10 != 0) goto L19
            goto L21
        L19:
            a.b.p.j$a r10 = (a.b.p.j.a) r10
            int r10 = a.b.e.abc_switch_thumb_material
            if (r11 != r10) goto L21
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.MULTIPLY
        L21:
            if (r1 == 0) goto La3
            r13.setTintMode(r1)
            goto La3
        L28:
            a.b.p.n0$c r0 = r9.g
            if (r0 == 0) goto L9a
            a.b.p.j$a r0 = (a.b.p.j.a) r0
            if (r0 == 0) goto L99
            int r2 = a.b.e.abc_seekbar_track_material
            r3 = 1
            r4 = 16908301(0x102000d, float:2.3877265E-38)
            r5 = 16908303(0x102000f, float:2.387727E-38)
            r6 = 16908288(0x1020000, float:2.387723E-38)
            if (r11 != r2) goto L6e
            r2 = r13
            android.graphics.drawable.LayerDrawable r2 = (android.graphics.drawable.LayerDrawable) r2
            android.graphics.drawable.Drawable r6 = r2.findDrawableByLayerId(r6)
            int r7 = a.b.a.colorControlNormal
            int r7 = a.b.p.s0.c(r10, r7)
            android.graphics.PorterDuff$Mode r8 = a.b.p.j.f246b
            r0.d(r6, r7, r8)
            android.graphics.drawable.Drawable r5 = r2.findDrawableByLayerId(r5)
            int r6 = a.b.a.colorControlNormal
        L55:
            int r6 = a.b.p.s0.c(r10, r6)
            android.graphics.PorterDuff$Mode r7 = a.b.p.j.f246b
            r0.d(r5, r6, r7)
            android.graphics.drawable.Drawable r2 = r2.findDrawableByLayerId(r4)
            int r4 = a.b.a.colorControlActivated
            int r4 = a.b.p.s0.c(r10, r4)
            android.graphics.PorterDuff$Mode r5 = a.b.p.j.f246b
            r0.d(r2, r4, r5)
            goto L96
        L6e:
            int r2 = a.b.e.abc_ratingbar_material
            if (r11 == r2) goto L7d
            int r2 = a.b.e.abc_ratingbar_indicator_material
            if (r11 == r2) goto L7d
            int r2 = a.b.e.abc_ratingbar_small_material
            if (r11 != r2) goto L7b
            goto L7d
        L7b:
            r3 = 0
            goto L96
        L7d:
            r2 = r13
            android.graphics.drawable.LayerDrawable r2 = (android.graphics.drawable.LayerDrawable) r2
            android.graphics.drawable.Drawable r6 = r2.findDrawableByLayerId(r6)
            int r7 = a.b.a.colorControlNormal
            int r7 = a.b.p.s0.b(r10, r7)
            android.graphics.PorterDuff$Mode r8 = a.b.p.j.f246b
            r0.d(r6, r7, r8)
            android.graphics.drawable.Drawable r5 = r2.findDrawableByLayerId(r5)
            int r6 = a.b.a.colorControlActivated
            goto L55
        L96:
            if (r3 == 0) goto L9a
            goto La3
        L99:
            throw r1
        L9a:
            boolean r10 = r9.l(r10, r11, r13)
            if (r10 != 0) goto La3
            if (r12 == 0) goto La3
            r13 = r1
        La3:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: a.b.p.n0.j(android.content.Context, int, boolean, android.graphics.drawable.Drawable):android.graphics.drawable.Drawable");
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:95:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean l(android.content.Context r8, int r9, android.graphics.drawable.Drawable r10) {
        /*
            r7 = this;
            a.b.p.n0$c r0 = r7.g
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L76
            a.b.p.j$a r0 = (a.b.p.j.a) r0
            if (r0 == 0) goto L74
            android.graphics.PorterDuff$Mode r3 = a.b.p.j.f246b
            int[] r4 = r0.f249a
            boolean r4 = r0.a(r4, r9)
            r5 = 16842801(0x1010031, float:2.3693695E-38)
            r6 = -1
            if (r4 == 0) goto L1b
            int r5 = a.b.a.colorControlNormal
            goto L44
        L1b:
            int[] r4 = r0.f251c
            boolean r4 = r0.a(r4, r9)
            if (r4 == 0) goto L26
            int r5 = a.b.a.colorControlActivated
            goto L44
        L26:
            int[] r4 = r0.f252d
            boolean r0 = r0.a(r4, r9)
            if (r0 == 0) goto L31
            android.graphics.PorterDuff$Mode r3 = android.graphics.PorterDuff.Mode.MULTIPLY
            goto L44
        L31:
            int r0 = a.b.e.abc_list_divider_mtrl_alpha
            if (r9 != r0) goto L40
            r9 = 16842800(0x1010030, float:2.3693693E-38)
            r0 = 1109603123(0x42233333, float:40.8)
            int r0 = java.lang.Math.round(r0)
            goto L46
        L40:
            int r0 = a.b.e.abc_dialog_material_background
            if (r9 != r0) goto L48
        L44:
            r9 = r5
            r0 = r6
        L46:
            r4 = r1
            goto L4b
        L48:
            r9 = r2
            r4 = r9
            r0 = r6
        L4b:
            if (r4 == 0) goto L70
            boolean r4 = a.b.p.e0.a(r10)
            if (r4 == 0) goto L57
            android.graphics.drawable.Drawable r10 = r10.mutate()
        L57:
            int r8 = a.b.p.s0.c(r8, r9)
            java.lang.Class<a.b.p.j> r9 = a.b.p.j.class
            monitor-enter(r9)
            android.graphics.PorterDuffColorFilter r8 = g(r8, r3)     // Catch: java.lang.Throwable -> L6d
            monitor-exit(r9)
            r10.setColorFilter(r8)
            if (r0 == r6) goto L6b
            r10.setAlpha(r0)
        L6b:
            r8 = r1
            goto L71
        L6d:
            r8 = move-exception
            monitor-exit(r9)
            throw r8
        L70:
            r8 = r2
        L71:
            if (r8 == 0) goto L76
            goto L77
        L74:
            r8 = 0
            throw r8
        L76:
            r1 = r2
        L77:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: a.b.p.n0.l(android.content.Context, int, android.graphics.drawable.Drawable):boolean");
    }
}
