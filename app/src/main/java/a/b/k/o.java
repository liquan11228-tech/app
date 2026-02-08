package a.b.k;

import android.R;
import android.content.Context;
import android.content.ContextWrapper;
import android.util.AttributeSet;
import android.view.View;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class o {

    /* renamed from: b, reason: collision with root package name */
    public static final Class<?>[] f43b = {Context.class, AttributeSet.class};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f44c = {R.attr.onClick};

    /* renamed from: d, reason: collision with root package name */
    public static final String[] f45d = {"android.widget.", "android.view.", "android.webkit."};

    /* renamed from: e, reason: collision with root package name */
    public static final a.e.h<String, Constructor<? extends View>> f46e = new a.e.h<>();

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f47a = new Object[2];

    public static class a implements View.OnClickListener {

        /* renamed from: b, reason: collision with root package name */
        public final View f48b;

        /* renamed from: c, reason: collision with root package name */
        public final String f49c;

        /* renamed from: d, reason: collision with root package name */
        public Method f50d;

        /* renamed from: e, reason: collision with root package name */
        public Context f51e;

        public a(View view, String str) {
            this.f48b = view;
            this.f49c = str;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            String string;
            Method method;
            if (this.f50d == null) {
                Context context = this.f48b.getContext();
                while (context != null) {
                    try {
                        if (!context.isRestricted() && (method = context.getClass().getMethod(this.f49c, View.class)) != null) {
                            this.f50d = method;
                            this.f51e = context;
                        }
                    } catch (NoSuchMethodException unused) {
                    }
                    context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
                }
                int id = this.f48b.getId();
                if (id == -1) {
                    string = "";
                } else {
                    StringBuilder sbE = b.a.a.a.a.e(" with id '");
                    sbE.append(this.f48b.getContext().getResources().getResourceEntryName(id));
                    sbE.append("'");
                    string = sbE.toString();
                }
                StringBuilder sbE2 = b.a.a.a.a.e("Could not find method ");
                sbE2.append(this.f49c);
                sbE2.append("(View) in a parent or ancestor Context for android:onClick attribute defined on view ");
                sbE2.append(this.f48b.getClass());
                sbE2.append(string);
                throw new IllegalStateException(sbE2.toString());
            }
            try {
                this.f50d.invoke(this.f51e, view);
            } catch (IllegalAccessException e2) {
                throw new IllegalStateException("Could not execute non-public method for android:onClick", e2);
            } catch (InvocationTargetException e3) {
                throw new IllegalStateException("Could not execute method for android:onClick", e3);
            }
        }
    }

    public final View a(Context context, String str, String str2) throws NoSuchMethodException, SecurityException {
        String str3;
        Constructor<? extends View> orDefault = f46e.getOrDefault(str, null);
        if (orDefault == null) {
            if (str2 != null) {
                try {
                    str3 = str2 + str;
                } catch (Exception unused) {
                    return null;
                }
            } else {
                str3 = str;
            }
            orDefault = Class.forName(str3, false, context.getClassLoader()).asSubclass(View.class).getConstructor(f43b);
            f46e.put(str, orDefault);
        }
        orDefault.setAccessible(true);
        return orDefault.newInstance(this.f47a);
    }

    public final void b(View view, String str) {
    }
}
