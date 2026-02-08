package a.b.p;

import a.b.k.h;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.LocaleList;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* loaded from: classes.dex */
public class y {

    /* renamed from: a */
    public final TextView f338a;

    /* renamed from: b */
    public v0 f339b;

    /* renamed from: c */
    public v0 f340c;

    /* renamed from: d */
    public v0 f341d;

    /* renamed from: e */
    public v0 f342e;
    public v0 f;
    public v0 g;
    public v0 h;
    public final a0 i;
    public int j = 0;
    public int k = -1;
    public Typeface l;
    public boolean m;

    public class a extends a.g.d.b.e {

        /* renamed from: a */
        public final /* synthetic */ int f343a;

        /* renamed from: b */
        public final /* synthetic */ int f344b;

        /* renamed from: c */
        public final /* synthetic */ WeakReference f345c;

        public a(int i, int i2, WeakReference weakReference) {
            this.f343a = i;
            this.f344b = i2;
            this.f345c = weakReference;
        }

        @Override // a.g.d.b.e
        public void c(Typeface typeface) {
            int i;
            if (Build.VERSION.SDK_INT >= 28 && (i = this.f343a) != -1) {
                typeface = Typeface.create(typeface, i, (this.f344b & 2) != 0);
            }
            y yVar = y.this;
            WeakReference weakReference = this.f345c;
            if (yVar.m) {
                yVar.l = typeface;
                TextView textView = (TextView) weakReference.get();
                if (textView != null) {
                    textView.setTypeface(typeface, yVar.j);
                }
            }
        }
    }

    public y(TextView textView) {
        this.f338a = textView;
        this.i = new a0(this.f338a);
    }

    public static v0 c(Context context, j jVar, int i) {
        ColorStateList colorStateListC = jVar.c(context, i);
        if (colorStateListC == null) {
            return null;
        }
        v0 v0Var = new v0();
        v0Var.f316d = true;
        v0Var.f313a = colorStateListC;
        return v0Var;
    }

    public final void a(Drawable drawable, v0 v0Var) {
        if (drawable == null || v0Var == null) {
            return;
        }
        j.e(drawable, v0Var, this.f338a.getDrawableState());
    }

    public void b() {
        if (this.f339b != null || this.f340c != null || this.f341d != null || this.f342e != null) {
            Drawable[] compoundDrawables = this.f338a.getCompoundDrawables();
            a(compoundDrawables[0], this.f339b);
            a(compoundDrawables[1], this.f340c);
            a(compoundDrawables[2], this.f341d);
            a(compoundDrawables[3], this.f342e);
        }
        if (this.f == null && this.g == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = this.f338a.getCompoundDrawablesRelative();
        a(compoundDrawablesRelative[0], this.f);
        a(compoundDrawablesRelative[2], this.g);
    }

    public boolean d() {
        a0 a0Var = this.i;
        return a0Var.i() && a0Var.f193a != 0;
    }

    @SuppressLint({"NewApi"})
    public void e(AttributeSet attributeSet, int i) throws Resources.NotFoundException {
        boolean zA;
        boolean z;
        String strK;
        String strK2;
        ColorStateList colorStateList;
        int resourceId;
        int resourceId2;
        Context context = this.f338a.getContext();
        j jVarA = j.a();
        x0 x0VarO = x0.o(context, attributeSet, a.b.j.AppCompatTextHelper, i, 0);
        TextView textView = this.f338a;
        a.g.j.k.t(textView, textView.getContext(), a.b.j.AppCompatTextHelper, attributeSet, x0VarO.f336b, i, 0);
        int iJ = x0VarO.j(a.b.j.AppCompatTextHelper_android_textAppearance, -1);
        if (x0VarO.m(a.b.j.AppCompatTextHelper_android_drawableLeft)) {
            this.f339b = c(context, jVarA, x0VarO.j(a.b.j.AppCompatTextHelper_android_drawableLeft, 0));
        }
        if (x0VarO.m(a.b.j.AppCompatTextHelper_android_drawableTop)) {
            this.f340c = c(context, jVarA, x0VarO.j(a.b.j.AppCompatTextHelper_android_drawableTop, 0));
        }
        if (x0VarO.m(a.b.j.AppCompatTextHelper_android_drawableRight)) {
            this.f341d = c(context, jVarA, x0VarO.j(a.b.j.AppCompatTextHelper_android_drawableRight, 0));
        }
        if (x0VarO.m(a.b.j.AppCompatTextHelper_android_drawableBottom)) {
            this.f342e = c(context, jVarA, x0VarO.j(a.b.j.AppCompatTextHelper_android_drawableBottom, 0));
        }
        if (x0VarO.m(a.b.j.AppCompatTextHelper_android_drawableStart)) {
            this.f = c(context, jVarA, x0VarO.j(a.b.j.AppCompatTextHelper_android_drawableStart, 0));
        }
        if (x0VarO.m(a.b.j.AppCompatTextHelper_android_drawableEnd)) {
            this.g = c(context, jVarA, x0VarO.j(a.b.j.AppCompatTextHelper_android_drawableEnd, 0));
        }
        x0VarO.f336b.recycle();
        boolean z2 = this.f338a.getTransformationMethod() instanceof PasswordTransformationMethod;
        if (iJ != -1) {
            x0 x0Var = new x0(context, context.obtainStyledAttributes(iJ, a.b.j.TextAppearance));
            if (z2 || !x0Var.m(a.b.j.TextAppearance_textAllCaps)) {
                zA = false;
                z = false;
            } else {
                zA = x0Var.a(a.b.j.TextAppearance_textAllCaps, false);
                z = true;
            }
            l(context, x0Var);
            strK = x0Var.m(a.b.j.TextAppearance_textLocale) ? x0Var.k(a.b.j.TextAppearance_textLocale) : null;
            strK2 = x0Var.m(a.b.j.TextAppearance_fontVariationSettings) ? x0Var.k(a.b.j.TextAppearance_fontVariationSettings) : null;
            x0Var.f336b.recycle();
        } else {
            zA = false;
            z = false;
            strK = null;
            strK2 = null;
        }
        x0 x0Var2 = new x0(context, context.obtainStyledAttributes(attributeSet, a.b.j.TextAppearance, i, 0));
        if (!z2 && x0Var2.m(a.b.j.TextAppearance_textAllCaps)) {
            zA = x0Var2.a(a.b.j.TextAppearance_textAllCaps, false);
            z = true;
        }
        if (x0Var2.m(a.b.j.TextAppearance_textLocale)) {
            strK = x0Var2.k(a.b.j.TextAppearance_textLocale);
        }
        if (x0Var2.m(a.b.j.TextAppearance_fontVariationSettings)) {
            strK2 = x0Var2.k(a.b.j.TextAppearance_fontVariationSettings);
        }
        if (Build.VERSION.SDK_INT >= 28 && x0Var2.m(a.b.j.TextAppearance_android_textSize) && x0Var2.d(a.b.j.TextAppearance_android_textSize, -1) == 0) {
            this.f338a.setTextSize(0, 0.0f);
        }
        l(context, x0Var2);
        x0Var2.f336b.recycle();
        if (!z2 && z) {
            this.f338a.setAllCaps(zA);
        }
        Typeface typeface = this.l;
        if (typeface != null) {
            if (this.k == -1) {
                this.f338a.setTypeface(typeface, this.j);
            } else {
                this.f338a.setTypeface(typeface);
            }
        }
        if (strK2 != null) {
            this.f338a.setFontVariationSettings(strK2);
        }
        if (strK != null) {
            this.f338a.setTextLocales(LocaleList.forLanguageTags(strK));
        }
        a0 a0Var = this.i;
        TypedArray typedArrayObtainStyledAttributes = a0Var.j.obtainStyledAttributes(attributeSet, a.b.j.AppCompatTextView, i, 0);
        TextView textView2 = a0Var.i;
        a.g.j.k.t(textView2, textView2.getContext(), a.b.j.AppCompatTextView, attributeSet, typedArrayObtainStyledAttributes, i, 0);
        if (typedArrayObtainStyledAttributes.hasValue(a.b.j.AppCompatTextView_autoSizeTextType)) {
            a0Var.f193a = typedArrayObtainStyledAttributes.getInt(a.b.j.AppCompatTextView_autoSizeTextType, 0);
        }
        float dimension = typedArrayObtainStyledAttributes.hasValue(a.b.j.AppCompatTextView_autoSizeStepGranularity) ? typedArrayObtainStyledAttributes.getDimension(a.b.j.AppCompatTextView_autoSizeStepGranularity, -1.0f) : -1.0f;
        float dimension2 = typedArrayObtainStyledAttributes.hasValue(a.b.j.AppCompatTextView_autoSizeMinTextSize) ? typedArrayObtainStyledAttributes.getDimension(a.b.j.AppCompatTextView_autoSizeMinTextSize, -1.0f) : -1.0f;
        float dimension3 = typedArrayObtainStyledAttributes.hasValue(a.b.j.AppCompatTextView_autoSizeMaxTextSize) ? typedArrayObtainStyledAttributes.getDimension(a.b.j.AppCompatTextView_autoSizeMaxTextSize, -1.0f) : -1.0f;
        if (typedArrayObtainStyledAttributes.hasValue(a.b.j.AppCompatTextView_autoSizePresetSizes) && (resourceId2 = typedArrayObtainStyledAttributes.getResourceId(a.b.j.AppCompatTextView_autoSizePresetSizes, 0)) > 0) {
            TypedArray typedArrayObtainTypedArray = typedArrayObtainStyledAttributes.getResources().obtainTypedArray(resourceId2);
            int length = typedArrayObtainTypedArray.length();
            int[] iArr = new int[length];
            if (length > 0) {
                for (int i2 = 0; i2 < length; i2++) {
                    iArr[i2] = typedArrayObtainTypedArray.getDimensionPixelSize(i2, -1);
                }
                a0Var.f = a0Var.b(iArr);
                a0Var.h();
            }
            typedArrayObtainTypedArray.recycle();
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!a0Var.i()) {
            a0Var.f193a = 0;
        } else if (a0Var.f193a == 1) {
            if (!a0Var.g) {
                DisplayMetrics displayMetrics = a0Var.j.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                a0Var.j(dimension2, dimension3, dimension);
            }
            a0Var.g();
        }
        if (a.g.k.b.f748a) {
            a0 a0Var2 = this.i;
            if (a0Var2.f193a != 0) {
                int[] iArr2 = a0Var2.f;
                if (iArr2.length > 0) {
                    if (this.f338a.getAutoSizeStepGranularity() != -1.0f) {
                        this.f338a.setAutoSizeTextTypeUniformWithConfiguration(Math.round(this.i.f196d), Math.round(this.i.f197e), Math.round(this.i.f195c), 0);
                    } else {
                        this.f338a.setAutoSizeTextTypeUniformWithPresetSizes(iArr2, 0);
                    }
                }
            }
        }
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, a.b.j.AppCompatTextView);
        int resourceId3 = typedArrayObtainStyledAttributes2.getResourceId(a.b.j.AppCompatTextView_drawableLeftCompat, -1);
        Drawable drawableB = resourceId3 != -1 ? jVarA.b(context, resourceId3) : null;
        int resourceId4 = typedArrayObtainStyledAttributes2.getResourceId(a.b.j.AppCompatTextView_drawableTopCompat, -1);
        Drawable drawableB2 = resourceId4 != -1 ? jVarA.b(context, resourceId4) : null;
        int resourceId5 = typedArrayObtainStyledAttributes2.getResourceId(a.b.j.AppCompatTextView_drawableRightCompat, -1);
        Drawable drawableB3 = resourceId5 != -1 ? jVarA.b(context, resourceId5) : null;
        int resourceId6 = typedArrayObtainStyledAttributes2.getResourceId(a.b.j.AppCompatTextView_drawableBottomCompat, -1);
        Drawable drawableB4 = resourceId6 != -1 ? jVarA.b(context, resourceId6) : null;
        int resourceId7 = typedArrayObtainStyledAttributes2.getResourceId(a.b.j.AppCompatTextView_drawableStartCompat, -1);
        Drawable drawableB5 = resourceId7 != -1 ? jVarA.b(context, resourceId7) : null;
        int resourceId8 = typedArrayObtainStyledAttributes2.getResourceId(a.b.j.AppCompatTextView_drawableEndCompat, -1);
        Drawable drawableB6 = resourceId8 != -1 ? jVarA.b(context, resourceId8) : null;
        if (drawableB5 != null || drawableB6 != null) {
            Drawable[] compoundDrawablesRelative = this.f338a.getCompoundDrawablesRelative();
            TextView textView3 = this.f338a;
            if (drawableB5 == null) {
                drawableB5 = compoundDrawablesRelative[0];
            }
            if (drawableB2 == null) {
                drawableB2 = compoundDrawablesRelative[1];
            }
            if (drawableB6 == null) {
                drawableB6 = compoundDrawablesRelative[2];
            }
            if (drawableB4 == null) {
                drawableB4 = compoundDrawablesRelative[3];
            }
            textView3.setCompoundDrawablesRelativeWithIntrinsicBounds(drawableB5, drawableB2, drawableB6, drawableB4);
        } else if (drawableB != null || drawableB2 != null || drawableB3 != null || drawableB4 != null) {
            Drawable[] compoundDrawablesRelative2 = this.f338a.getCompoundDrawablesRelative();
            if (compoundDrawablesRelative2[0] == null && compoundDrawablesRelative2[2] == null) {
                Drawable[] compoundDrawables = this.f338a.getCompoundDrawables();
                TextView textView4 = this.f338a;
                if (drawableB == null) {
                    drawableB = compoundDrawables[0];
                }
                if (drawableB2 == null) {
                    drawableB2 = compoundDrawables[1];
                }
                if (drawableB3 == null) {
                    drawableB3 = compoundDrawables[2];
                }
                if (drawableB4 == null) {
                    drawableB4 = compoundDrawables[3];
                }
                textView4.setCompoundDrawablesWithIntrinsicBounds(drawableB, drawableB2, drawableB3, drawableB4);
            } else {
                TextView textView5 = this.f338a;
                Drawable drawable = compoundDrawablesRelative2[0];
                if (drawableB2 == null) {
                    drawableB2 = compoundDrawablesRelative2[1];
                }
                Drawable drawable2 = compoundDrawablesRelative2[2];
                if (drawableB4 == null) {
                    drawableB4 = compoundDrawablesRelative2[3];
                }
                textView5.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawableB2, drawable2, drawableB4);
            }
        }
        if (typedArrayObtainStyledAttributes2.hasValue(a.b.j.AppCompatTextView_drawableTint)) {
            int i3 = a.b.j.AppCompatTextView_drawableTint;
            if (!typedArrayObtainStyledAttributes2.hasValue(i3) || (resourceId = typedArrayObtainStyledAttributes2.getResourceId(i3, 0)) == 0 || (colorStateList = a.b.l.a.a.a(context, resourceId)) == null) {
                colorStateList = typedArrayObtainStyledAttributes2.getColorStateList(i3);
            }
            TextView textView6 = this.f338a;
            if (textView6 == null) {
                throw null;
            }
            textView6.setCompoundDrawableTintList(colorStateList);
        }
        if (typedArrayObtainStyledAttributes2.hasValue(a.b.j.AppCompatTextView_drawableTintMode)) {
            PorterDuff.Mode modeC = e0.c(typedArrayObtainStyledAttributes2.getInt(a.b.j.AppCompatTextView_drawableTintMode, -1), null);
            TextView textView7 = this.f338a;
            if (textView7 == null) {
                throw null;
            }
            textView7.setCompoundDrawableTintMode(modeC);
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes2.getDimensionPixelSize(a.b.j.AppCompatTextView_firstBaselineToTopHeight, -1);
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes2.getDimensionPixelSize(a.b.j.AppCompatTextView_lastBaselineToBottomHeight, -1);
        int dimensionPixelSize3 = typedArrayObtainStyledAttributes2.getDimensionPixelSize(a.b.j.AppCompatTextView_lineHeight, -1);
        typedArrayObtainStyledAttributes2.recycle();
        if (dimensionPixelSize != -1) {
            h.i.R(this.f338a, dimensionPixelSize);
        }
        if (dimensionPixelSize2 != -1) {
            h.i.S(this.f338a, dimensionPixelSize2);
        }
        if (dimensionPixelSize3 != -1) {
            h.i.T(this.f338a, dimensionPixelSize3);
        }
    }

    public void f(Context context, int i) {
        String strK;
        x0 x0Var = new x0(context, context.obtainStyledAttributes(i, a.b.j.TextAppearance));
        if (x0Var.m(a.b.j.TextAppearance_textAllCaps)) {
            this.f338a.setAllCaps(x0Var.a(a.b.j.TextAppearance_textAllCaps, false));
        }
        if (x0Var.m(a.b.j.TextAppearance_android_textSize) && x0Var.d(a.b.j.TextAppearance_android_textSize, -1) == 0) {
            this.f338a.setTextSize(0, 0.0f);
        }
        l(context, x0Var);
        if (x0Var.m(a.b.j.TextAppearance_fontVariationSettings) && (strK = x0Var.k(a.b.j.TextAppearance_fontVariationSettings)) != null) {
            this.f338a.setFontVariationSettings(strK);
        }
        x0Var.f336b.recycle();
        Typeface typeface = this.l;
        if (typeface != null) {
            this.f338a.setTypeface(typeface, this.j);
        }
    }

    public void g(int i, int i2, int i3, int i4) {
        a0 a0Var = this.i;
        if (a0Var.i()) {
            DisplayMetrics displayMetrics = a0Var.j.getResources().getDisplayMetrics();
            a0Var.j(TypedValue.applyDimension(i4, i, displayMetrics), TypedValue.applyDimension(i4, i2, displayMetrics), TypedValue.applyDimension(i4, i3, displayMetrics));
            if (a0Var.g()) {
                a0Var.a();
            }
        }
    }

    public void h(int[] iArr, int i) {
        a0 a0Var = this.i;
        if (a0Var.i()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArrCopyOf = new int[length];
                if (i == 0) {
                    iArrCopyOf = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = a0Var.j.getResources().getDisplayMetrics();
                    for (int i2 = 0; i2 < length; i2++) {
                        iArrCopyOf[i2] = Math.round(TypedValue.applyDimension(i, iArr[i2], displayMetrics));
                    }
                }
                a0Var.f = a0Var.b(iArrCopyOf);
                if (!a0Var.h()) {
                    StringBuilder sbE = b.a.a.a.a.e("None of the preset sizes is valid: ");
                    sbE.append(Arrays.toString(iArr));
                    throw new IllegalArgumentException(sbE.toString());
                }
            } else {
                a0Var.g = false;
            }
            if (a0Var.g()) {
                a0Var.a();
            }
        }
    }

    public void i(int i) {
        a0 a0Var = this.i;
        if (a0Var.i()) {
            if (i == 0) {
                a0Var.f193a = 0;
                a0Var.f196d = -1.0f;
                a0Var.f197e = -1.0f;
                a0Var.f195c = -1.0f;
                a0Var.f = new int[0];
                a0Var.f194b = false;
                return;
            }
            if (i != 1) {
                throw new IllegalArgumentException(b.a.a.a.a.a("Unknown auto-size text type: ", i));
            }
            DisplayMetrics displayMetrics = a0Var.j.getResources().getDisplayMetrics();
            a0Var.j(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (a0Var.g()) {
                a0Var.a();
            }
        }
    }

    public void j(ColorStateList colorStateList) {
        if (this.h == null) {
            this.h = new v0();
        }
        v0 v0Var = this.h;
        v0Var.f313a = colorStateList;
        v0Var.f316d = colorStateList != null;
        v0 v0Var2 = this.h;
        this.f339b = v0Var2;
        this.f340c = v0Var2;
        this.f341d = v0Var2;
        this.f342e = v0Var2;
        this.f = v0Var2;
        this.g = v0Var2;
    }

    public void k(PorterDuff.Mode mode) {
        if (this.h == null) {
            this.h = new v0();
        }
        v0 v0Var = this.h;
        v0Var.f314b = mode;
        v0Var.f315c = mode != null;
        v0 v0Var2 = this.h;
        this.f339b = v0Var2;
        this.f340c = v0Var2;
        this.f341d = v0Var2;
        this.f342e = v0Var2;
        this.f = v0Var2;
        this.g = v0Var2;
    }

    public final void l(Context context, x0 x0Var) {
        String strK;
        Typeface typefaceCreate;
        Typeface typeface;
        this.j = x0Var.h(a.b.j.TextAppearance_android_textStyle, this.j);
        if (Build.VERSION.SDK_INT >= 28) {
            int iH = x0Var.h(a.b.j.TextAppearance_android_textFontWeight, -1);
            this.k = iH;
            if (iH != -1) {
                this.j = (this.j & 2) | 0;
            }
        }
        if (!x0Var.m(a.b.j.TextAppearance_android_fontFamily) && !x0Var.m(a.b.j.TextAppearance_fontFamily)) {
            if (x0Var.m(a.b.j.TextAppearance_android_typeface)) {
                this.m = false;
                int iH2 = x0Var.h(a.b.j.TextAppearance_android_typeface, 1);
                if (iH2 == 1) {
                    typeface = Typeface.SANS_SERIF;
                } else if (iH2 == 2) {
                    typeface = Typeface.SERIF;
                } else if (iH2 != 3) {
                    return;
                } else {
                    typeface = Typeface.MONOSPACE;
                }
                this.l = typeface;
                return;
            }
            return;
        }
        this.l = null;
        int i = x0Var.m(a.b.j.TextAppearance_fontFamily) ? a.b.j.TextAppearance_fontFamily : a.b.j.TextAppearance_android_fontFamily;
        int i2 = this.k;
        int i3 = this.j;
        if (!context.isRestricted()) {
            try {
                Typeface typefaceG = x0Var.g(i, this.j, new a(i2, i3, new WeakReference(this.f338a)));
                if (typefaceG != null) {
                    if (Build.VERSION.SDK_INT >= 28 && this.k != -1) {
                        typefaceG = Typeface.create(Typeface.create(typefaceG, 0), this.k, (this.j & 2) != 0);
                    }
                    this.l = typefaceG;
                }
                this.m = this.l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.l != null || (strK = x0Var.k(i)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.k == -1) {
            typefaceCreate = Typeface.create(strK, this.j);
        } else {
            typefaceCreate = Typeface.create(Typeface.create(strK, 0), this.k, (this.j & 2) != 0);
        }
        this.l = typefaceCreate;
    }
}
