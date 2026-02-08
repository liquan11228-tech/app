package a.g.c;

import android.app.Activity;
import android.app.Application;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a */
    public static final Class<?> f580a;

    /* renamed from: b */
    public static final Field f581b;

    /* renamed from: c */
    public static final Field f582c;

    /* renamed from: d */
    public static final Method f583d;

    /* renamed from: e */
    public static final Method f584e;
    public static final Method f;
    public static final Handler g = new Handler(Looper.getMainLooper());

    public class a implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ c f585b;

        /* renamed from: c */
        public final /* synthetic */ Object f586c;

        public a(c cVar, Object obj) {
            this.f585b = cVar;
            this.f586c = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f585b.f589a = this.f586c;
        }
    }

    /* renamed from: a.g.c.b$b */
    public class RunnableC0011b implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ Application f587b;

        /* renamed from: c */
        public final /* synthetic */ c f588c;

        public RunnableC0011b(Application application, c cVar) {
            this.f587b = application;
            this.f588c = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f587b.unregisterActivityLifecycleCallbacks(this.f588c);
        }
    }

    public static final class c implements Application.ActivityLifecycleCallbacks {

        /* renamed from: a */
        public Object f589a;

        /* renamed from: b */
        public Activity f590b;

        /* renamed from: c */
        public boolean f591c = false;

        /* renamed from: d */
        public boolean f592d = false;

        /* renamed from: e */
        public boolean f593e = false;

        public c(Activity activity) {
            this.f590b = activity;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            if (this.f590b == activity) {
                this.f590b = null;
                this.f592d = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            if (!this.f592d || this.f593e || this.f591c) {
                return;
            }
            Object obj = this.f589a;
            boolean z = false;
            try {
                Object obj2 = b.f582c.get(activity);
                if (obj2 == obj) {
                    b.g.postAtFrontOfQueue(new a.g.c.c(b.f581b.get(activity), obj2));
                    z = true;
                }
            } catch (Throwable unused) {
            }
            if (z) {
                this.f593e = true;
                this.f589a = null;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            if (this.f590b == activity) {
                this.f591c = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }
    }

    static {
        Class<?> cls;
        Field declaredField;
        Field declaredField2;
        Method declaredMethod;
        Method declaredMethod2;
        Method method = null;
        try {
            cls = Class.forName("android.app.ActivityThread");
        } catch (Throwable unused) {
            cls = null;
        }
        f580a = cls;
        try {
            declaredField = Activity.class.getDeclaredField("mMainThread");
            declaredField.setAccessible(true);
        } catch (Throwable unused2) {
            declaredField = null;
        }
        f581b = declaredField;
        try {
            declaredField2 = Activity.class.getDeclaredField("mToken");
            declaredField2.setAccessible(true);
        } catch (Throwable unused3) {
            declaredField2 = null;
        }
        f582c = declaredField2;
        Class<?> cls2 = f580a;
        if (cls2 == null) {
            declaredMethod = null;
        } else {
            try {
                declaredMethod = cls2.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE, String.class);
                declaredMethod.setAccessible(true);
            } catch (Throwable unused4) {
            }
        }
        f583d = declaredMethod;
        Class<?> cls3 = f580a;
        if (cls3 == null) {
            declaredMethod2 = null;
        } else {
            try {
                declaredMethod2 = cls3.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE);
                declaredMethod2.setAccessible(true);
            } catch (Throwable unused5) {
            }
        }
        f584e = declaredMethod2;
        Class<?> cls4 = f580a;
        if (a() && cls4 != null) {
            try {
                Method declaredMethod3 = cls4.getDeclaredMethod("requestRelaunchActivity", IBinder.class, List.class, List.class, Integer.TYPE, Boolean.TYPE, Configuration.class, Configuration.class, Boolean.TYPE, Boolean.TYPE);
                declaredMethod3.setAccessible(true);
                method = declaredMethod3;
            } catch (Throwable unused6) {
            }
        }
        f = method;
    }

    public static boolean a() {
        int i = Build.VERSION.SDK_INT;
        return i == 26 || i == 27;
    }

    public static boolean b(Activity activity) {
        Object obj;
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
            return true;
        }
        if (a() && f == null) {
            return false;
        }
        if (f584e == null && f583d == null) {
            return false;
        }
        try {
            Object obj2 = f582c.get(activity);
            if (obj2 == null || (obj = f581b.get(activity)) == null) {
                return false;
            }
            Application application = activity.getApplication();
            c cVar = new c(activity);
            application.registerActivityLifecycleCallbacks(cVar);
            g.post(new a(cVar, obj2));
            try {
                if (a()) {
                    f.invoke(obj, obj2, null, null, 0, Boolean.FALSE, null, null, Boolean.FALSE, Boolean.FALSE);
                } else {
                    activity.recreate();
                }
                return true;
            } finally {
                g.post(new RunnableC0011b(application, cVar));
            }
        } catch (Throwable unused) {
            return false;
        }
    }
}
