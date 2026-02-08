package a.b.p;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public class a0 {
    public static final RectF l = new RectF();
    public static ConcurrentHashMap<String, Method> m = new ConcurrentHashMap<>();
    public static ConcurrentHashMap<String, Field> n = new ConcurrentHashMap<>();

    /* renamed from: a, reason: collision with root package name */
    public int f193a = 0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f194b = false;

    /* renamed from: c, reason: collision with root package name */
    public float f195c = -1.0f;

    /* renamed from: d, reason: collision with root package name */
    public float f196d = -1.0f;

    /* renamed from: e, reason: collision with root package name */
    public float f197e = -1.0f;
    public int[] f = new int[0];
    public boolean g = false;
    public TextPaint h;
    public final TextView i;
    public final Context j;
    public final c k;

    public static class a extends c {
        @Override // a.b.p.a0.c
        public void a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection((TextDirectionHeuristic) a0.e(textView, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR));
        }
    }

    public static class b extends a {
        @Override // a.b.p.a0.a, a.b.p.a0.c
        public void a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection(textView.getTextDirectionHeuristic());
        }

        @Override // a.b.p.a0.c
        public boolean b(TextView textView) {
            return textView.isHorizontallyScrollable();
        }
    }

    public static class c {
        public abstract void a(StaticLayout.Builder builder, TextView textView);

        public boolean b(TextView textView) {
            return ((Boolean) a0.e(textView, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue();
        }
    }

    public a0(TextView textView) {
        this.i = textView;
        this.j = textView.getContext();
        this.k = Build.VERSION.SDK_INT >= 29 ? new b() : new a();
    }

    public static Method d(String str) {
        try {
            Method declaredMethod = m.get(str);
            if (declaredMethod == null && (declaredMethod = TextView.class.getDeclaredMethod(str, new Class[0])) != null) {
                declaredMethod.setAccessible(true);
                m.put(str, declaredMethod);
            }
            return declaredMethod;
        } catch (Exception unused) {
            return null;
        }
    }

    public static <T> T e(Object obj, String str, T t) {
        try {
            return (T) d(str).invoke(obj, new Object[0]);
        } catch (Exception unused) {
            return t;
        }
    }

    public void a() {
        if (i() && this.f193a != 0) {
            if (this.f194b) {
                if (this.i.getMeasuredHeight() <= 0 || this.i.getMeasuredWidth() <= 0) {
                    return;
                }
                int measuredWidth = this.k.b(this.i) ? 1048576 : (this.i.getMeasuredWidth() - this.i.getTotalPaddingLeft()) - this.i.getTotalPaddingRight();
                int height = (this.i.getHeight() - this.i.getCompoundPaddingBottom()) - this.i.getCompoundPaddingTop();
                if (measuredWidth <= 0 || height <= 0) {
                    return;
                }
                synchronized (l) {
                    l.setEmpty();
                    l.right = measuredWidth;
                    l.bottom = height;
                    float fC = c(l);
                    if (fC != this.i.getTextSize()) {
                        f(0, fC);
                    }
                }
            }
            this.f194b = true;
        }
    }

    public final int[] b(int[] iArr) {
        int length = iArr.length;
        if (length == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i : iArr) {
            if (i > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i)) < 0) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        if (length == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr2[i2] = ((Integer) arrayList.get(i2)).intValue();
        }
        return iArr2;
    }

    public final int c(RectF rectF) {
        CharSequence transformation;
        int length = this.f.length;
        if (length == 0) {
            throw new IllegalStateException("No available text sizes to choose from.");
        }
        int i = length - 1;
        int i2 = 1;
        int i3 = 0;
        while (i2 <= i) {
            int i4 = (i2 + i) / 2;
            int i5 = this.f[i4];
            CharSequence text = this.i.getText();
            TransformationMethod transformationMethod = this.i.getTransformationMethod();
            if (transformationMethod != null && (transformation = transformationMethod.getTransformation(text, this.i)) != null) {
                text = transformation;
            }
            int maxLines = this.i.getMaxLines();
            TextPaint textPaint = this.h;
            if (textPaint == null) {
                this.h = new TextPaint();
            } else {
                textPaint.reset();
            }
            this.h.set(this.i.getPaint());
            this.h.setTextSize(i5);
            Layout.Alignment alignment = (Layout.Alignment) e(this.i, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL);
            StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(text, 0, text.length(), this.h, Math.round(rectF.right));
            builderObtain.setAlignment(alignment).setLineSpacing(this.i.getLineSpacingExtra(), this.i.getLineSpacingMultiplier()).setIncludePad(this.i.getIncludeFontPadding()).setBreakStrategy(this.i.getBreakStrategy()).setHyphenationFrequency(this.i.getHyphenationFrequency()).setMaxLines(maxLines == -1 ? Integer.MAX_VALUE : maxLines);
            try {
                this.k.a(builderObtain, this.i);
            } catch (ClassCastException unused) {
            }
            StaticLayout staticLayoutBuild = builderObtain.build();
            if ((maxLines == -1 || (staticLayoutBuild.getLineCount() <= maxLines && staticLayoutBuild.getLineEnd(staticLayoutBuild.getLineCount() - 1) == text.length())) && ((float) staticLayoutBuild.getHeight()) <= rectF.bottom) {
                int i6 = i4 + 1;
                i3 = i2;
                i2 = i6;
            } else {
                i3 = i4 - 1;
                i = i3;
            }
        }
        return this.f[i3];
    }

    public void f(int i, float f) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Context context = this.j;
        float fApplyDimension = TypedValue.applyDimension(i, f, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics());
        if (fApplyDimension != this.i.getPaint().getTextSize()) {
            this.i.getPaint().setTextSize(fApplyDimension);
            boolean zIsInLayout = this.i.isInLayout();
            if (this.i.getLayout() != null) {
                this.f194b = false;
                try {
                    Method methodD = d("nullLayouts");
                    if (methodD != null) {
                        methodD.invoke(this.i, new Object[0]);
                    }
                } catch (Exception unused) {
                }
                if (zIsInLayout) {
                    this.i.forceLayout();
                } else {
                    this.i.requestLayout();
                }
                this.i.invalidate();
            }
        }
    }

    public final boolean g() {
        if (i() && this.f193a == 1) {
            if (!this.g || this.f.length == 0) {
                int iFloor = ((int) Math.floor((this.f197e - this.f196d) / this.f195c)) + 1;
                int[] iArr = new int[iFloor];
                for (int i = 0; i < iFloor; i++) {
                    iArr[i] = Math.round((i * this.f195c) + this.f196d);
                }
                this.f = b(iArr);
            }
            this.f194b = true;
        } else {
            this.f194b = false;
        }
        return this.f194b;
    }

    public final boolean h() {
        boolean z = this.f.length > 0;
        this.g = z;
        if (z) {
            this.f193a = 1;
            int[] iArr = this.f;
            this.f196d = iArr[0];
            this.f197e = iArr[r0 - 1];
            this.f195c = -1.0f;
        }
        return this.g;
    }

    public final boolean i() {
        return !(this.i instanceof k);
    }

    public final void j(float f, float f2, float f3) {
        if (f <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f + "px) is less or equal to (0px)");
        }
        if (f2 <= f) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f2 + "px) is less or equal to minimum auto-size text size (" + f + "px)");
        }
        if (f3 <= 0.0f) {
            throw new IllegalArgumentException("The auto-size step granularity (" + f3 + "px) is less or equal to (0px)");
        }
        this.f193a = 1;
        this.f196d = f;
        this.f197e = f2;
        this.f195c = f3;
        this.g = false;
    }
}
