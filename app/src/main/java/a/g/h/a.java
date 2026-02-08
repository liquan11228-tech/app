package a.g.h;

import android.annotation.SuppressLint;
import android.os.Build;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;
import java.util.Objects;

/* loaded from: classes.dex */
public class a implements Spannable {

    /* renamed from: a.g.h.a$a, reason: collision with other inner class name */
    public static final class C0014a {

        /* renamed from: a, reason: collision with root package name */
        public final TextPaint f669a;

        /* renamed from: b, reason: collision with root package name */
        public final TextDirectionHeuristic f670b;

        /* renamed from: c, reason: collision with root package name */
        public final int f671c;

        /* renamed from: d, reason: collision with root package name */
        public final int f672d;

        public C0014a(PrecomputedText.Params params) {
            this.f669a = params.getTextPaint();
            this.f670b = params.getTextDirection();
            this.f671c = params.getBreakStrategy();
            this.f672d = params.getHyphenationFrequency();
            int i = Build.VERSION.SDK_INT;
        }

        @SuppressLint({"NewApi"})
        public C0014a(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i, int i2) {
            if (Build.VERSION.SDK_INT >= 29) {
                new PrecomputedText.Params.Builder(textPaint).setBreakStrategy(i).setHyphenationFrequency(i2).setTextDirection(textDirectionHeuristic).build();
            }
            this.f669a = textPaint;
            this.f670b = textDirectionHeuristic;
            this.f671c = i;
            this.f672d = i2;
        }

        public boolean a(C0014a c0014a) {
            if (this.f671c == c0014a.f671c && this.f672d == c0014a.f672d && this.f669a.getTextSize() == c0014a.f669a.getTextSize() && this.f669a.getTextScaleX() == c0014a.f669a.getTextScaleX() && this.f669a.getTextSkewX() == c0014a.f669a.getTextSkewX() && this.f669a.getLetterSpacing() == c0014a.f669a.getLetterSpacing() && TextUtils.equals(this.f669a.getFontFeatureSettings(), c0014a.f669a.getFontFeatureSettings()) && this.f669a.getFlags() == c0014a.f669a.getFlags() && this.f669a.getTextLocales().equals(c0014a.f669a.getTextLocales())) {
                return this.f669a.getTypeface() == null ? c0014a.f669a.getTypeface() == null : this.f669a.getTypeface().equals(c0014a.f669a.getTypeface());
            }
            return false;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C0014a)) {
                return false;
            }
            C0014a c0014a = (C0014a) obj;
            return a(c0014a) && this.f670b == c0014a.f670b;
        }

        public int hashCode() {
            return Objects.hash(Float.valueOf(this.f669a.getTextSize()), Float.valueOf(this.f669a.getTextScaleX()), Float.valueOf(this.f669a.getTextSkewX()), Float.valueOf(this.f669a.getLetterSpacing()), Integer.valueOf(this.f669a.getFlags()), this.f669a.getTextLocales(), this.f669a.getTypeface(), Boolean.valueOf(this.f669a.isElegantTextHeight()), this.f670b, Integer.valueOf(this.f671c), Integer.valueOf(this.f672d));
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("{");
            StringBuilder sbE = b.a.a.a.a.e("textSize=");
            sbE.append(this.f669a.getTextSize());
            sb.append(sbE.toString());
            sb.append(", textScaleX=" + this.f669a.getTextScaleX());
            sb.append(", textSkewX=" + this.f669a.getTextSkewX());
            sb.append(", letterSpacing=" + this.f669a.getLetterSpacing());
            sb.append(", elegantTextHeight=" + this.f669a.isElegantTextHeight());
            sb.append(", textLocale=" + this.f669a.getTextLocales());
            sb.append(", typeface=" + this.f669a.getTypeface());
            sb.append(", variationSettings=" + this.f669a.getFontVariationSettings());
            sb.append(", textDir=" + this.f670b);
            sb.append(", breakStrategy=" + this.f671c);
            sb.append(", hyphenationFrequency=" + this.f672d);
            sb.append("}");
            return sb.toString();
        }
    }

    @Override // java.lang.CharSequence
    public char charAt(int i) {
        throw null;
    }

    @Override // android.text.Spanned
    public int getSpanEnd(Object obj) {
        throw null;
    }

    @Override // android.text.Spanned
    public int getSpanFlags(Object obj) {
        throw null;
    }

    @Override // android.text.Spanned
    public int getSpanStart(Object obj) {
        throw null;
    }

    @Override // android.text.Spanned
    @SuppressLint({"NewApi"})
    public <T> T[] getSpans(int i, int i2, Class<T> cls) {
        int i3 = Build.VERSION.SDK_INT;
        throw null;
    }

    @Override // java.lang.CharSequence
    public int length() {
        throw null;
    }

    @Override // android.text.Spanned
    public int nextSpanTransition(int i, int i2, Class cls) {
        throw null;
    }

    @Override // android.text.Spannable
    @SuppressLint({"NewApi"})
    public void removeSpan(Object obj) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be removed from PrecomputedText.");
        }
        int i = Build.VERSION.SDK_INT;
        throw null;
    }

    @Override // android.text.Spannable
    @SuppressLint({"NewApi"})
    public void setSpan(Object obj, int i, int i2, int i3) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be set to PrecomputedText.");
        }
        int i4 = Build.VERSION.SDK_INT;
        throw null;
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i, int i2) {
        throw null;
    }

    @Override // java.lang.CharSequence
    public String toString() {
        throw null;
    }
}
