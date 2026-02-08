package a.b.k;

import a.b.k.h;
import a.b.o.a;
import a.b.p.a1;
import a.b.p.n0;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class e extends a.j.a.d implements f, a.g.c.i {
    public g n;
    public Resources o;

    @Override // android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        o().c(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        Configuration configuration;
        h hVar = (h) o();
        hVar.J = true;
        int i = hVar.N;
        if (i == -100) {
            i = -100;
        }
        int iH = hVar.H(context, i);
        if (h.e0 && (context instanceof ContextThemeWrapper)) {
            try {
                ((ContextThemeWrapper) context).applyOverrideConfiguration(hVar.v(context, iH, null));
            } catch (IllegalStateException unused) {
            }
        } else if (context instanceof a.b.o.c) {
            try {
                ((a.b.o.c) context).a(hVar.v(context, iH, null));
            } catch (IllegalStateException unused2) {
            }
        } else if (h.d0) {
            try {
                Configuration configuration2 = context.getPackageManager().getResourcesForApplication(context.getApplicationInfo()).getConfiguration();
                Configuration configuration3 = context.getResources().getConfiguration();
                if (configuration2.equals(configuration3)) {
                    configuration = null;
                } else {
                    configuration = new Configuration();
                    configuration.fontScale = 0.0f;
                    if (configuration3 != null && configuration2.diff(configuration3) != 0) {
                        float f = configuration2.fontScale;
                        float f2 = configuration3.fontScale;
                        if (f != f2) {
                            configuration.fontScale = f2;
                        }
                        int i2 = configuration2.mcc;
                        int i3 = configuration3.mcc;
                        if (i2 != i3) {
                            configuration.mcc = i3;
                        }
                        int i4 = configuration2.mnc;
                        int i5 = configuration3.mnc;
                        if (i4 != i5) {
                            configuration.mnc = i5;
                        }
                        LocaleList locales = configuration2.getLocales();
                        LocaleList locales2 = configuration3.getLocales();
                        if (!locales.equals(locales2)) {
                            configuration.setLocales(locales2);
                            configuration.locale = configuration3.locale;
                        }
                        int i6 = configuration2.touchscreen;
                        int i7 = configuration3.touchscreen;
                        if (i6 != i7) {
                            configuration.touchscreen = i7;
                        }
                        int i8 = configuration2.keyboard;
                        int i9 = configuration3.keyboard;
                        if (i8 != i9) {
                            configuration.keyboard = i9;
                        }
                        int i10 = configuration2.keyboardHidden;
                        int i11 = configuration3.keyboardHidden;
                        if (i10 != i11) {
                            configuration.keyboardHidden = i11;
                        }
                        int i12 = configuration2.navigation;
                        int i13 = configuration3.navigation;
                        if (i12 != i13) {
                            configuration.navigation = i13;
                        }
                        int i14 = configuration2.navigationHidden;
                        int i15 = configuration3.navigationHidden;
                        if (i14 != i15) {
                            configuration.navigationHidden = i15;
                        }
                        int i16 = configuration2.orientation;
                        int i17 = configuration3.orientation;
                        if (i16 != i17) {
                            configuration.orientation = i17;
                        }
                        int i18 = configuration2.screenLayout & 15;
                        int i19 = configuration3.screenLayout & 15;
                        if (i18 != i19) {
                            configuration.screenLayout |= i19;
                        }
                        int i20 = configuration2.screenLayout & 192;
                        int i21 = configuration3.screenLayout & 192;
                        if (i20 != i21) {
                            configuration.screenLayout |= i21;
                        }
                        int i22 = configuration2.screenLayout & 48;
                        int i23 = configuration3.screenLayout & 48;
                        if (i22 != i23) {
                            configuration.screenLayout |= i23;
                        }
                        int i24 = configuration2.screenLayout & 768;
                        int i25 = configuration3.screenLayout & 768;
                        if (i24 != i25) {
                            configuration.screenLayout |= i25;
                        }
                        int i26 = configuration2.colorMode & 3;
                        int i27 = configuration3.colorMode & 3;
                        if (i26 != i27) {
                            configuration.colorMode |= i27;
                        }
                        int i28 = configuration2.colorMode & 12;
                        int i29 = configuration3.colorMode & 12;
                        if (i28 != i29) {
                            configuration.colorMode |= i29;
                        }
                        int i30 = configuration2.uiMode & 15;
                        int i31 = configuration3.uiMode & 15;
                        if (i30 != i31) {
                            configuration.uiMode |= i31;
                        }
                        int i32 = configuration2.uiMode & 48;
                        int i33 = configuration3.uiMode & 48;
                        if (i32 != i33) {
                            configuration.uiMode |= i33;
                        }
                        int i34 = configuration2.screenWidthDp;
                        int i35 = configuration3.screenWidthDp;
                        if (i34 != i35) {
                            configuration.screenWidthDp = i35;
                        }
                        int i36 = configuration2.screenHeightDp;
                        int i37 = configuration3.screenHeightDp;
                        if (i36 != i37) {
                            configuration.screenHeightDp = i37;
                        }
                        int i38 = configuration2.smallestScreenWidthDp;
                        int i39 = configuration3.smallestScreenWidthDp;
                        if (i38 != i39) {
                            configuration.smallestScreenWidthDp = i39;
                        }
                        int i40 = configuration2.densityDpi;
                        int i41 = configuration3.densityDpi;
                        if (i40 != i41) {
                            configuration.densityDpi = i41;
                        }
                    }
                }
                Configuration configurationV = hVar.v(context, iH, configuration);
                a.b.o.c cVar = new a.b.o.c(context, a.b.i.Theme_AppCompat_Empty);
                cVar.a(configurationV);
                boolean z = context.getTheme() != null;
                if (z) {
                    Resources.Theme theme = cVar.getTheme();
                    if (Build.VERSION.SDK_INT >= 29) {
                        theme.rebase();
                    } else {
                        synchronized (a.g.d.b.f.f613a) {
                            if (!a.g.d.b.f.f615c) {
                                try {
                                    Method declaredMethod = Resources.Theme.class.getDeclaredMethod("rebase", new Class[0]);
                                    a.g.d.b.f.f614b = declaredMethod;
                                    declaredMethod.setAccessible(true);
                                } catch (NoSuchMethodException unused3) {
                                }
                                a.g.d.b.f.f615c = true;
                            }
                            if (a.g.d.b.f.f614b != null) {
                                try {
                                    a.g.d.b.f.f614b.invoke(theme, new Object[0]);
                                } catch (IllegalAccessException | InvocationTargetException unused4) {
                                    a.g.d.b.f.f614b = null;
                                }
                            }
                        }
                    }
                }
                context = cVar;
            } catch (PackageManager.NameNotFoundException e2) {
                throw new RuntimeException("Application failed to obtain resources from itself", e2);
            }
        }
        super.attachBaseContext(context);
    }

    @Override // a.b.k.f
    public void b(a.b.o.a aVar) {
    }

    @Override // android.app.Activity
    public void closeOptionsMenu() {
        p();
        if (getWindow().hasFeature(0)) {
            super.closeOptionsMenu();
        }
    }

    @Override // a.g.c.d, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        keyEvent.getKeyCode();
        p();
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // a.b.k.f
    public void f(a.b.o.a aVar) {
    }

    @Override // android.app.Activity
    public <T extends View> T findViewById(int i) {
        h hVar = (h) o();
        hVar.z();
        return (T) hVar.f.findViewById(i);
    }

    @Override // a.b.k.f
    public a.b.o.a g(a.InterfaceC0002a interfaceC0002a) {
        return null;
    }

    @Override // android.app.Activity
    public MenuInflater getMenuInflater() {
        h hVar = (h) o();
        if (hVar.j == null) {
            hVar.F();
            a aVar = hVar.i;
            hVar.j = new a.b.o.f(aVar != null ? aVar.d() : hVar.f13e);
        }
        return hVar.j;
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        if (this.o == null) {
            a1.a();
        }
        Resources resources = this.o;
        return resources == null ? super.getResources() : resources;
    }

    @Override // a.g.c.i
    public Intent i() {
        return h.i.x(this);
    }

    @Override // android.app.Activity
    public void invalidateOptionsMenu() {
        o().g();
    }

    @Override // a.j.a.d
    public void n() {
        o().g();
    }

    public g o() {
        if (this.n == null) {
            this.n = g.d(this, this);
        }
        return this.n;
    }

    @Override // a.j.a.d, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.o != null) {
            this.o.updateConfiguration(configuration, super.getResources().getDisplayMetrics());
        }
        h hVar = (h) o();
        if (hVar.A && hVar.u) {
            hVar.F();
            a aVar = hVar.i;
            if (aVar != null) {
                aVar.e(configuration);
            }
        }
        a.b.p.j jVarA = a.b.p.j.a();
        Context context = hVar.f13e;
        synchronized (jVarA) {
            n0 n0Var = jVarA.f248a;
            synchronized (n0Var) {
                a.e.e<WeakReference<Drawable.ConstantState>> eVar = n0Var.f276d.get(context);
                if (eVar != null) {
                    int i = eVar.f398e;
                    Object[] objArr = eVar.f397d;
                    for (int i2 = 0; i2 < i; i2++) {
                        objArr[i2] = null;
                    }
                    eVar.f398e = 0;
                    eVar.f395b = false;
                }
            }
        }
        hVar.q(false);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onContentChanged() {
    }

    @Override // a.j.a.d, androidx.activity.ComponentActivity, a.g.c.d, android.app.Activity
    public void onCreate(Bundle bundle) {
        g gVarO = o();
        gVarO.f();
        gVarO.h(bundle);
        super.onCreate(bundle);
    }

    @Override // a.j.a.d, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        o().i();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        return super.onKeyDown(i, keyEvent);
    }

    @Override // a.j.a.d, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        Intent intentX;
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        a aVarP = p();
        if (menuItem.getItemId() == 16908332 && aVarP != null && (aVarP.c() & 4) != 0 && (intentX = h.i.x(this)) != null) {
            if (!shouldUpRecreateTask(intentX)) {
                navigateUpTo(intentX);
                return true;
            }
            ArrayList arrayList = new ArrayList();
            Intent intentI = i();
            if (intentI == null) {
                intentI = h.i.x(this);
            }
            if (intentI != null) {
                ComponentName component = intentI.getComponent();
                if (component == null) {
                    component = intentI.resolveActivity(getPackageManager());
                }
                int size = arrayList.size();
                while (true) {
                    try {
                        Intent intentY = h.i.y(this, component);
                        if (intentY == null) {
                            break;
                        }
                        arrayList.add(size, intentY);
                        component = intentY.getComponent();
                    } catch (PackageManager.NameNotFoundException e2) {
                        throw new IllegalArgumentException(e2);
                    }
                }
                arrayList.add(intentI);
            }
            r();
            if (arrayList.isEmpty()) {
                throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
            }
            Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[arrayList.size()]);
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            a.g.d.a.c(this, intentArr, null);
            try {
                a.g.c.a.d(this);
                return true;
            } catch (IllegalStateException unused) {
                finish();
                return true;
            }
        }
        return false;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuOpened(int i, Menu menu) {
        return super.onMenuOpened(i, menu);
    }

    @Override // a.j.a.d, android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        ((h) o()).z();
    }

    @Override // a.j.a.d, android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        h hVar = (h) o();
        hVar.F();
        a aVar = hVar.i;
        if (aVar != null) {
            aVar.h(true);
        }
    }

    @Override // a.j.a.d, androidx.activity.ComponentActivity, a.g.c.d, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (((h) o()) == null) {
            throw null;
        }
    }

    @Override // a.j.a.d, android.app.Activity
    public void onStart() {
        super.onStart();
        h hVar = (h) o();
        hVar.L = true;
        hVar.p();
    }

    @Override // a.j.a.d, android.app.Activity
    public void onStop() {
        super.onStop();
        h hVar = (h) o();
        hVar.L = false;
        hVar.F();
        a aVar = hVar.i;
        if (aVar != null) {
            aVar.h(false);
        }
    }

    @Override // android.app.Activity
    public void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        o().o(charSequence);
    }

    @Override // android.app.Activity
    public void openOptionsMenu() {
        p();
        if (getWindow().hasFeature(0)) {
            super.openOptionsMenu();
        }
    }

    public a p() {
        h hVar = (h) o();
        hVar.F();
        return hVar.i;
    }

    public void q() {
    }

    public void r() {
    }

    @Override // android.app.Activity
    public void setContentView(int i) {
        o().l(i);
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        o().m(view);
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        o().n(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public void setTheme(int i) {
        super.setTheme(i);
        ((h) o()).O = i;
    }
}
