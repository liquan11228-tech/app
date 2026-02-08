package androidx.activity;

import a.k.d;
import a.k.e;
import a.k.g;
import android.app.Activity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public final class ImmLeaksCleaner implements e {

    /* renamed from: b, reason: collision with root package name */
    public static int f909b;

    /* renamed from: c, reason: collision with root package name */
    public static Field f910c;

    /* renamed from: d, reason: collision with root package name */
    public static Field f911d;

    /* renamed from: e, reason: collision with root package name */
    public static Field f912e;

    /* renamed from: a, reason: collision with root package name */
    public Activity f913a;

    @Override // a.k.e
    public void g(g gVar, d.a aVar) throws IllegalAccessException, NoSuchFieldException, IllegalArgumentException {
        if (aVar != d.a.ON_DESTROY) {
            return;
        }
        if (f909b == 0) {
            try {
                f909b = 2;
                Field declaredField = InputMethodManager.class.getDeclaredField("mServedView");
                f911d = declaredField;
                declaredField.setAccessible(true);
                Field declaredField2 = InputMethodManager.class.getDeclaredField("mNextServedView");
                f912e = declaredField2;
                declaredField2.setAccessible(true);
                Field declaredField3 = InputMethodManager.class.getDeclaredField("mH");
                f910c = declaredField3;
                declaredField3.setAccessible(true);
                f909b = 1;
            } catch (NoSuchFieldException unused) {
            }
        }
        if (f909b == 1) {
            InputMethodManager inputMethodManager = (InputMethodManager) this.f913a.getSystemService("input_method");
            try {
                Object obj = f910c.get(inputMethodManager);
                if (obj == null) {
                    return;
                }
                synchronized (obj) {
                    try {
                        try {
                            View view = (View) f911d.get(inputMethodManager);
                            if (view == null) {
                                return;
                            }
                            if (view.isAttachedToWindow()) {
                                return;
                            }
                            try {
                                f912e.set(inputMethodManager, null);
                                inputMethodManager.isActive();
                            } catch (IllegalAccessException unused2) {
                            }
                        } catch (ClassCastException unused3) {
                        } catch (IllegalAccessException unused4) {
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (IllegalAccessException unused5) {
            }
        }
    }
}
