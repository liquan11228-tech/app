package a.b.o;

import a.b.o.i.i;
import a.b.o.i.j;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class f extends MenuInflater {

    /* renamed from: e, reason: collision with root package name */
    public static final Class<?>[] f91e;
    public static final Class<?>[] f;

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f92a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f93b;

    /* renamed from: c, reason: collision with root package name */
    public Context f94c;

    /* renamed from: d, reason: collision with root package name */
    public Object f95d;

    public static class a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: c, reason: collision with root package name */
        public static final Class<?>[] f96c = {MenuItem.class};

        /* renamed from: a, reason: collision with root package name */
        public Object f97a;

        /* renamed from: b, reason: collision with root package name */
        public Method f98b;

        public a(Object obj, String str) {
            this.f97a = obj;
            Class<?> cls = obj.getClass();
            try {
                this.f98b = cls.getMethod(str, f96c);
            } catch (Exception e2) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
                inflateException.initCause(e2);
                throw inflateException;
            }
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            try {
                if (this.f98b.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.f98b.invoke(this.f97a, menuItem)).booleanValue();
                }
                this.f98b.invoke(this.f97a, menuItem);
                return true;
            } catch (Exception e2) {
                throw new RuntimeException(e2);
            }
        }
    }

    public class b {
        public a.g.j.b A;
        public CharSequence B;
        public CharSequence C;

        /* renamed from: a, reason: collision with root package name */
        public Menu f99a;
        public boolean h;
        public int i;
        public int j;
        public CharSequence k;
        public CharSequence l;
        public int m;
        public char n;
        public int o;
        public char p;
        public int q;
        public int r;
        public boolean s;
        public boolean t;
        public boolean u;
        public int v;
        public int w;
        public String x;
        public String y;
        public String z;
        public ColorStateList D = null;
        public PorterDuff.Mode E = null;

        /* renamed from: b, reason: collision with root package name */
        public int f100b = 0;

        /* renamed from: c, reason: collision with root package name */
        public int f101c = 0;

        /* renamed from: d, reason: collision with root package name */
        public int f102d = 0;

        /* renamed from: e, reason: collision with root package name */
        public int f103e = 0;
        public boolean f = true;
        public boolean g = true;

        public b(Menu menu) {
            this.f99a = menu;
        }

        public SubMenu a() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            this.h = true;
            SubMenu subMenuAddSubMenu = this.f99a.addSubMenu(this.f100b, this.i, this.j, this.k);
            c(subMenuAddSubMenu.getItem());
            return subMenuAddSubMenu;
        }

        public final <T> T b(String str, Class<?>[] clsArr, Object[] objArr) throws NoSuchMethodException, SecurityException {
            try {
                Constructor<?> constructor = Class.forName(str, false, f.this.f94c.getClassLoader()).getConstructor(clsArr);
                constructor.setAccessible(true);
                return (T) constructor.newInstance(objArr);
            } catch (Exception unused) {
                return null;
            }
        }

        public final void c(MenuItem menuItem) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            boolean z = false;
            menuItem.setChecked(this.s).setVisible(this.t).setEnabled(this.u).setCheckable(this.r >= 1).setTitleCondensed(this.l).setIcon(this.m);
            int i = this.v;
            if (i >= 0) {
                menuItem.setShowAsAction(i);
            }
            if (this.z != null) {
                if (f.this.f94c.isRestricted()) {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
                f fVar = f.this;
                if (fVar.f95d == null) {
                    fVar.f95d = fVar.a(fVar.f94c);
                }
                menuItem.setOnMenuItemClickListener(new a(fVar.f95d, this.z));
            }
            if (this.r >= 2) {
                if (menuItem instanceof i) {
                    i iVar = (i) menuItem;
                    iVar.x = (iVar.x & (-5)) | 4;
                } else if (menuItem instanceof j) {
                    j jVar = (j) menuItem;
                    try {
                        if (jVar.f163e == null) {
                            jVar.f163e = jVar.f162d.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                        }
                        jVar.f163e.invoke(jVar.f162d, Boolean.TRUE);
                    } catch (Exception unused) {
                    }
                }
            }
            String str = this.x;
            if (str != null) {
                menuItem.setActionView((View) b(str, f.f91e, f.this.f92a));
                z = true;
            }
            int i2 = this.w;
            if (i2 > 0 && !z) {
                menuItem.setActionView(i2);
            }
            a.g.j.b bVar = this.A;
            if (bVar != null && (menuItem instanceof a.g.f.a.b)) {
                ((a.g.f.a.b) menuItem).b(bVar);
            }
            CharSequence charSequence = this.B;
            boolean z2 = menuItem instanceof a.g.f.a.b;
            if (z2) {
                ((a.g.f.a.b) menuItem).setContentDescription(charSequence);
            } else {
                menuItem.setContentDescription(charSequence);
            }
            CharSequence charSequence2 = this.C;
            if (z2) {
                ((a.g.f.a.b) menuItem).setTooltipText(charSequence2);
            } else {
                menuItem.setTooltipText(charSequence2);
            }
            char c2 = this.n;
            int i3 = this.o;
            if (z2) {
                ((a.g.f.a.b) menuItem).setAlphabeticShortcut(c2, i3);
            } else {
                menuItem.setAlphabeticShortcut(c2, i3);
            }
            char c3 = this.p;
            int i4 = this.q;
            if (z2) {
                ((a.g.f.a.b) menuItem).setNumericShortcut(c3, i4);
            } else {
                menuItem.setNumericShortcut(c3, i4);
            }
            PorterDuff.Mode mode = this.E;
            if (mode != null) {
                if (z2) {
                    ((a.g.f.a.b) menuItem).setIconTintMode(mode);
                } else {
                    menuItem.setIconTintMode(mode);
                }
            }
            ColorStateList colorStateList = this.D;
            if (colorStateList != null) {
                if (z2) {
                    ((a.g.f.a.b) menuItem).setIconTintList(colorStateList);
                } else {
                    menuItem.setIconTintList(colorStateList);
                }
            }
        }
    }

    static {
        Class<?>[] clsArr = {Context.class};
        f91e = clsArr;
        f = clsArr;
    }

    public f(Context context) {
        super(context);
        this.f94c = context;
        Object[] objArr = {context};
        this.f92a = objArr;
        this.f93b = objArr;
    }

    public final Object a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0233  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(org.xmlpull.v1.XmlPullParser r17, android.util.AttributeSet r18, android.view.Menu r19) throws org.xmlpull.v1.XmlPullParserException, java.lang.IllegalAccessException, java.io.IOException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 605
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a.b.o.f.b(org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.view.Menu):void");
    }

    @Override // android.view.MenuInflater
    public void inflate(int i, Menu menu) {
        if (!(menu instanceof a.g.f.a.a)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser layout = null;
        try {
            try {
                try {
                    layout = this.f94c.getResources().getLayout(i);
                    b(layout, Xml.asAttributeSet(layout), menu);
                    layout.close();
                } catch (IOException e2) {
                    throw new InflateException("Error inflating menu XML", e2);
                }
            } catch (XmlPullParserException e3) {
                throw new InflateException("Error inflating menu XML", e3);
            }
        } catch (Throwable th) {
            if (layout != null) {
                layout.close();
            }
            throw th;
        }
    }
}
