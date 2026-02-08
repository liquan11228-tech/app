package a.g.e;

import a.g.g.b;
import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Map;

/* loaded from: classes.dex */
public class e extends d {
    public final Class<?> g;
    public final Constructor<?> h;
    public final Method i;
    public final Method j;
    public final Method k;
    public final Method l;
    public final Method m;

    public e() throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        Method methodP;
        Method method;
        Constructor<?> constructor;
        Method methodN;
        Method methodO;
        Method method2;
        Class<?> cls = null;
        try {
            Class<?> cls2 = Class.forName("android.graphics.FontFamily");
            constructor = cls2.getConstructor(new Class[0]);
            methodN = n(cls2);
            methodO = o(cls2);
            method2 = cls2.getMethod("freeze", new Class[0]);
            method = cls2.getMethod("abortCreation", new Class[0]);
            methodP = p(cls2);
            cls = cls2;
        } catch (ClassNotFoundException | NoSuchMethodException e2) {
            e2.getClass().getName();
            methodP = null;
            method = null;
            constructor = null;
            methodN = null;
            methodO = null;
            method2 = null;
        }
        this.g = cls;
        this.h = constructor;
        this.i = methodN;
        this.j = methodO;
        this.k = method2;
        this.l = method;
        this.m = methodP;
    }

    private Object m() {
        try {
            return this.h.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override // a.g.e.d, a.g.e.h
    public Typeface a(Context context, a.g.d.b.b bVar, Resources resources, int i) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (!l()) {
            return super.a(context, bVar, resources, i);
        }
        Object objM = m();
        if (objM == null) {
            return null;
        }
        for (a.g.d.b.c cVar : bVar.f600a) {
            if (!i(context, objM, cVar.f601a, cVar.f605e, cVar.f602b, cVar.f603c ? 1 : 0, FontVariationAxis.fromFontVariationSettings(cVar.f604d))) {
                h(objM);
                return null;
            }
        }
        if (k(objM)) {
            return j(objM);
        }
        return null;
    }

    @Override // a.g.e.h
    public Typeface b(Context context, CancellationSignal cancellationSignal, b.f[] fVarArr, int i) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        Typeface typefaceJ;
        boolean zBooleanValue;
        if (fVarArr.length < 1) {
            return null;
        }
        if (!l()) {
            b.f fVarE = e(fVarArr, i);
            try {
                ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(fVarE.f647a, "r", cancellationSignal);
                if (parcelFileDescriptorOpenFileDescriptor == null) {
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        parcelFileDescriptorOpenFileDescriptor.close();
                    }
                    return null;
                }
                try {
                    Typeface typefaceBuild = new Typeface.Builder(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor()).setWeight(fVarE.f649c).setItalic(fVarE.f650d).build();
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return typefaceBuild;
                } finally {
                }
            } catch (IOException unused) {
                return null;
            }
        }
        Map<Uri, ByteBuffer> mapD = a.g.g.b.d(context, fVarArr, cancellationSignal);
        Object objM = m();
        if (objM == null) {
            return null;
        }
        int length = fVarArr.length;
        int i2 = 0;
        boolean z = false;
        while (i2 < length) {
            b.f fVar = fVarArr[i2];
            ByteBuffer byteBuffer = mapD.get(fVar.f647a);
            if (byteBuffer != null) {
                try {
                    zBooleanValue = ((Boolean) this.j.invoke(objM, byteBuffer, Integer.valueOf(fVar.f648b), null, Integer.valueOf(fVar.f649c), Integer.valueOf(fVar.f650d ? 1 : 0))).booleanValue();
                } catch (IllegalAccessException | InvocationTargetException unused2) {
                    zBooleanValue = false;
                }
                if (!zBooleanValue) {
                    h(objM);
                    return null;
                }
                z = true;
            }
            i2++;
            z = z;
        }
        if (!z) {
            h(objM);
            return null;
        }
        if (k(objM) && (typefaceJ = j(objM)) != null) {
            return Typeface.create(typefaceJ, i);
        }
        return null;
    }

    @Override // a.g.e.h
    public Typeface c(Context context, Resources resources, int i, String str, int i2) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (!l()) {
            return super.c(context, resources, i, str, i2);
        }
        Object objM = m();
        if (objM == null) {
            return null;
        }
        if (!i(context, objM, str, 0, -1, -1, null)) {
            h(objM);
            return null;
        }
        if (k(objM)) {
            return j(objM);
        }
        return null;
    }

    public final void h(Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            this.l.invoke(obj, new Object[0]);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    public final boolean i(Context context, Object obj, String str, int i, int i2, int i3, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.i.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Typeface j(Object obj) throws ArrayIndexOutOfBoundsException, IllegalArgumentException, NegativeArraySizeException {
        try {
            Object objNewInstance = Array.newInstance(this.g, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) this.m.invoke(null, objNewInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean k(Object obj) {
        try {
            return ((Boolean) this.k.invoke(obj, new Object[0])).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public final boolean l() {
        Method method = this.i;
        return this.i != null;
    }

    public Method n(Class<?> cls) {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, Integer.TYPE, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    public Method o(Class<?> cls) {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromBuffer", ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2);
    }

    public Method p(Class<?> cls) throws NoSuchMethodException, SecurityException {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass(), cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
