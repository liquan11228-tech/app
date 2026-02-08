package a.b.p;

import a.b.k.h;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class x0 {

    /* renamed from: a */
    public final Context f335a;

    /* renamed from: b */
    public final TypedArray f336b;

    /* renamed from: c */
    public TypedValue f337c;

    public x0(Context context, TypedArray typedArray) {
        this.f335a = context;
        this.f336b = typedArray;
    }

    public static x0 n(Context context, AttributeSet attributeSet, int[] iArr) {
        return new x0(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    public static x0 o(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2) {
        return new x0(context, context.obtainStyledAttributes(attributeSet, iArr, i, i2));
    }

    public boolean a(int i, boolean z) {
        return this.f336b.getBoolean(i, z);
    }

    public ColorStateList b(int i) {
        int resourceId;
        ColorStateList colorStateListA;
        return (!this.f336b.hasValue(i) || (resourceId = this.f336b.getResourceId(i, 0)) == 0 || (colorStateListA = a.b.l.a.a.a(this.f335a, resourceId)) == null) ? this.f336b.getColorStateList(i) : colorStateListA;
    }

    public int c(int i, int i2) {
        return this.f336b.getDimensionPixelOffset(i, i2);
    }

    public int d(int i, int i2) {
        return this.f336b.getDimensionPixelSize(i, i2);
    }

    public Drawable e(int i) {
        int resourceId;
        return (!this.f336b.hasValue(i) || (resourceId = this.f336b.getResourceId(i, 0)) == 0) ? this.f336b.getDrawable(i) : a.b.l.a.a.b(this.f335a, resourceId);
    }

    public Drawable f(int i) {
        int resourceId;
        Drawable drawableF;
        if (!this.f336b.hasValue(i) || (resourceId = this.f336b.getResourceId(i, 0)) == 0) {
            return null;
        }
        j jVarA = j.a();
        Context context = this.f335a;
        synchronized (jVarA) {
            drawableF = jVarA.f248a.f(context, resourceId, true);
        }
        return drawableF;
    }

    public Typeface g(int i, int i2, a.g.d.b.e eVar) throws Resources.NotFoundException {
        int resourceId = this.f336b.getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.f337c == null) {
            this.f337c = new TypedValue();
        }
        Context context = this.f335a;
        TypedValue typedValue = this.f337c;
        if (context.isRestricted()) {
            return null;
        }
        Resources resources = context.getResources();
        resources.getValue(resourceId, typedValue, true);
        CharSequence charSequence = typedValue.string;
        if (charSequence == null) {
            StringBuilder sbE = b.a.a.a.a.e("Resource \"");
            sbE.append(resources.getResourceName(resourceId));
            sbE.append("\" (");
            sbE.append(Integer.toHexString(resourceId));
            sbE.append(") is not a Font: ");
            sbE.append(typedValue);
            throw new Resources.NotFoundException(sbE.toString());
        }
        String string = charSequence.toString();
        if (string.startsWith("res/")) {
            Typeface typefaceA = a.g.e.c.f622b.a(a.g.e.c.d(resources, resourceId, i2));
            if (typefaceA != null) {
                eVar.b(typefaceA, null);
                return typefaceA;
            }
            try {
                if (string.toLowerCase().endsWith(".xml")) {
                    a.g.d.b.a aVarO = h.i.O(resources.getXml(resourceId), resources);
                    if (aVarO != null) {
                        return a.g.e.c.b(context, aVarO, resources, resourceId, i2, eVar, null, true);
                    }
                    eVar.a(-3, null);
                    return null;
                }
                Typeface typefaceC = a.g.e.c.c(context, resources, resourceId, string, i2);
                if (typefaceC != null) {
                    eVar.b(typefaceC, null);
                } else {
                    eVar.a(-3, null);
                }
                return typefaceC;
            } catch (IOException | XmlPullParserException unused) {
            }
        }
        eVar.a(-3, null);
        return null;
    }

    public int h(int i, int i2) {
        return this.f336b.getInt(i, i2);
    }

    public int i(int i, int i2) {
        return this.f336b.getLayoutDimension(i, i2);
    }

    public int j(int i, int i2) {
        return this.f336b.getResourceId(i, i2);
    }

    public String k(int i) {
        return this.f336b.getString(i);
    }

    public CharSequence l(int i) {
        return this.f336b.getText(i);
    }

    public boolean m(int i) {
        return this.f336b.hasValue(i);
    }
}
