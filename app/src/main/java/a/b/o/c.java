package a.b.o;

import a.b.i;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.LayoutInflater;

/* loaded from: classes.dex */
public class c extends ContextWrapper {

    /* renamed from: a, reason: collision with root package name */
    public int f78a;

    /* renamed from: b, reason: collision with root package name */
    public Resources.Theme f79b;

    /* renamed from: c, reason: collision with root package name */
    public LayoutInflater f80c;

    /* renamed from: d, reason: collision with root package name */
    public Configuration f81d;

    /* renamed from: e, reason: collision with root package name */
    public Resources f82e;

    public c() {
        super(null);
    }

    public c(Context context, int i) {
        super(context);
        this.f78a = i;
    }

    public void a(Configuration configuration) {
        if (this.f82e != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        }
        if (this.f81d != null) {
            throw new IllegalStateException("Override configuration has already been set");
        }
        this.f81d = new Configuration(configuration);
    }

    @Override // android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public final void b() {
        if (this.f79b == null) {
            this.f79b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f79b.setTo(theme);
            }
        }
        this.f79b.applyStyle(this.f78a, true);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return getResources().getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        if (this.f82e == null) {
            Configuration configuration = this.f81d;
            this.f82e = configuration == null ? super.getResources() : createConfigurationContext(configuration).getResources();
        }
        return this.f82e;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f80c == null) {
            this.f80c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f80c;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f79b;
        if (theme != null) {
            return theme;
        }
        if (this.f78a == 0) {
            this.f78a = i.Theme_AppCompat_Light;
        }
        b();
        return this.f79b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i) {
        if (this.f78a != i) {
            this.f78a = i;
            b();
        }
    }
}
