package a.g.e;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;

@SuppressLint({"NewApi"})
/* loaded from: classes.dex */
public class c {

    /* renamed from: a */
    public static final h f621a;

    /* renamed from: b */
    public static final a.e.f<String, Typeface> f622b;

    static {
        int i = Build.VERSION.SDK_INT;
        f621a = i >= 29 ? new g() : i >= 28 ? new f() : new e();
        f622b = new a.e.f<>(16);
    }

    public static Typeface a(Context context, Typeface typeface, int i) {
        if (context != null) {
            return Typeface.create(typeface, i);
        }
        throw new IllegalArgumentException("Context cannot be null");
    }

    public static Typeface b(Context context, a.g.d.b.a aVar, Resources resources, int i, int i2, a.g.d.b.e eVar, Handler handler, boolean z) throws Resources.NotFoundException {
        Typeface typefaceA;
        if (aVar instanceof a.g.d.b.d) {
            a.g.d.b.d dVar = (a.g.d.b.d) aVar;
            boolean z2 = false;
            if (!z ? eVar == null : dVar.f608c == 0) {
                z2 = true;
            }
            typefaceA = a.g.g.b.c(context, dVar.f606a, eVar, handler, z2, z ? dVar.f607b : -1, i2);
        } else {
            typefaceA = f621a.a(context, (a.g.d.b.b) aVar, resources, i2);
            if (eVar != null) {
                if (typefaceA != null) {
                    eVar.b(typefaceA, handler);
                } else {
                    eVar.a(-3, handler);
                }
            }
        }
        if (typefaceA != null) {
            f622b.b(d(resources, i, i2), typefaceA);
        }
        return typefaceA;
    }

    public static Typeface c(Context context, Resources resources, int i, String str, int i2) {
        Typeface typefaceC = f621a.c(context, resources, i, str, i2);
        if (typefaceC != null) {
            f622b.b(d(resources, i, i2), typefaceC);
        }
        return typefaceC;
    }

    public static String d(Resources resources, int i, int i2) {
        return resources.getResourcePackageName(i) + "-" + i + "-" + i2;
    }
}
