package a.b.o.i;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public class g implements a.g.f.a.a {
    public static final int[] z = {1, 4, 5, 3, 2, 0};

    /* renamed from: a */
    public final Context f148a;

    /* renamed from: b */
    public final Resources f149b;

    /* renamed from: c */
    public boolean f150c;

    /* renamed from: d */
    public boolean f151d;

    /* renamed from: e */
    public a f152e;
    public CharSequence m;
    public Drawable n;
    public View o;
    public i w;
    public boolean y;
    public int l = 0;
    public boolean p = false;
    public boolean q = false;
    public boolean r = false;
    public boolean s = false;
    public boolean t = false;
    public ArrayList<i> u = new ArrayList<>();
    public CopyOnWriteArrayList<WeakReference<m>> v = new CopyOnWriteArrayList<>();
    public boolean x = false;
    public ArrayList<i> f = new ArrayList<>();
    public ArrayList<i> g = new ArrayList<>();
    public boolean h = true;
    public ArrayList<i> i = new ArrayList<>();
    public ArrayList<i> j = new ArrayList<>();
    public boolean k = true;

    public interface a {
        void a(g gVar);

        boolean b(g gVar, MenuItem menuItem);
    }

    public interface b {
        boolean b(i iVar);
    }

    public g(Context context) {
        boolean zShouldShowMenuShortcutsWhenKeyboardPresent;
        boolean z2 = false;
        this.f148a = context;
        this.f149b = context.getResources();
        if (this.f149b.getConfiguration().keyboard != 1) {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(this.f148a);
            Context context2 = this.f148a;
            if (Build.VERSION.SDK_INT >= 28) {
                zShouldShowMenuShortcutsWhenKeyboardPresent = viewConfiguration.shouldShowMenuShortcutsWhenKeyboardPresent();
            } else {
                Resources resources = context2.getResources();
                int identifier = resources.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android");
                zShouldShowMenuShortcutsWhenKeyboardPresent = identifier != 0 && resources.getBoolean(identifier);
            }
            if (zShouldShowMenuShortcutsWhenKeyboardPresent) {
                z2 = true;
            }
        }
        this.f151d = z2;
    }

    public MenuItem a(int i, int i2, int i3, CharSequence charSequence) {
        int i4;
        int i5 = ((-65536) & i3) >> 16;
        if (i5 >= 0) {
            int[] iArr = z;
            if (i5 < iArr.length) {
                int i6 = (iArr[i5] << 16) | (65535 & i3);
                i iVar = new i(this, i, i2, i3, i6, charSequence, this.l);
                ArrayList<i> arrayList = this.f;
                int size = arrayList.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        i4 = 0;
                        break;
                    }
                    if (arrayList.get(size).f159d <= i6) {
                        i4 = size + 1;
                        break;
                    }
                }
                arrayList.add(i4, iVar);
                q(true);
                return iVar;
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    @Override // android.view.Menu
    public MenuItem add(int i) {
        return a(0, 0, 0, this.f149b.getString(i));
    }

    @Override // android.view.Menu
    public MenuItem add(int i, int i2, int i3, int i4) {
        return a(i, i2, i3, this.f149b.getString(i4));
    }

    @Override // android.view.Menu
    public MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return a(i, i2, i3, charSequence);
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        int i5;
        PackageManager packageManager = this.f148a.getPackageManager();
        List<ResolveInfo> listQueryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = listQueryIntentActivityOptions != null ? listQueryIntentActivityOptions.size() : 0;
        if ((i4 & 1) == 0) {
            removeGroup(i);
        }
        for (int i6 = 0; i6 < size; i6++) {
            ResolveInfo resolveInfo = listQueryIntentActivityOptions.get(i6);
            int i7 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i7 < 0 ? intent : intentArr[i7]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            i iVar = (i) a(i, i2, i3, resolveInfo.loadLabel(packageManager));
            iVar.setIcon(resolveInfo.loadIcon(packageManager));
            iVar.setIntent(intent2);
            if (menuItemArr != null && (i5 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i5] = iVar;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, this.f149b.getString(i));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return addSubMenu(i, i2, i3, this.f149b.getString(i4));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        i iVar = (i) a(i, i2, i3, charSequence);
        r rVar = new r(this.f148a, this, iVar);
        iVar.o = rVar;
        rVar.setHeaderTitle(iVar.f160e);
        return rVar;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public void b(m mVar, Context context) {
        this.v.add(new WeakReference<>(mVar));
        mVar.j(context, this);
        this.k = true;
    }

    public final void c(boolean z2) {
        if (this.t) {
            return;
        }
        this.t = true;
        Iterator<WeakReference<m>> it = this.v.iterator();
        while (it.hasNext()) {
            WeakReference<m> next = it.next();
            m mVar = next.get();
            if (mVar == null) {
                this.v.remove(next);
            } else {
                mVar.b(this, z2);
            }
        }
        this.t = false;
    }

    @Override // android.view.Menu
    public void clear() {
        i iVar = this.w;
        if (iVar != null) {
            d(iVar);
        }
        this.f.clear();
        q(true);
    }

    public void clearHeader() {
        this.n = null;
        this.m = null;
        this.o = null;
        q(false);
    }

    @Override // android.view.Menu
    public void close() {
        c(true);
    }

    public boolean d(i iVar) {
        boolean zK = false;
        if (!this.v.isEmpty() && this.w == iVar) {
            z();
            Iterator<WeakReference<m>> it = this.v.iterator();
            while (it.hasNext()) {
                WeakReference<m> next = it.next();
                m mVar = next.get();
                if (mVar == null) {
                    this.v.remove(next);
                } else {
                    zK = mVar.k(this, iVar);
                    if (zK) {
                        break;
                    }
                }
            }
            y();
            if (zK) {
                this.w = null;
            }
        }
        return zK;
    }

    public boolean e(g gVar, MenuItem menuItem) {
        a aVar = this.f152e;
        return aVar != null && aVar.b(gVar, menuItem);
    }

    public boolean f(i iVar) {
        boolean zC = false;
        if (this.v.isEmpty()) {
            return false;
        }
        z();
        Iterator<WeakReference<m>> it = this.v.iterator();
        while (it.hasNext()) {
            WeakReference<m> next = it.next();
            m mVar = next.get();
            if (mVar == null) {
                this.v.remove(next);
            } else {
                zC = mVar.c(this, iVar);
                if (zC) {
                    break;
                }
            }
        }
        y();
        if (zC) {
            this.w = iVar;
        }
        return zC;
    }

    @Override // android.view.Menu
    public MenuItem findItem(int i) {
        MenuItem menuItemFindItem;
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            i iVar = this.f.get(i2);
            if (iVar.f156a == i) {
                return iVar;
            }
            if (iVar.hasSubMenu() && (menuItemFindItem = iVar.o.findItem(i)) != null) {
                return menuItemFindItem;
            }
        }
        return null;
    }

    public i g(int i, KeyEvent keyEvent) {
        ArrayList<i> arrayList = this.u;
        arrayList.clear();
        h(arrayList, i, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return arrayList.get(0);
        }
        boolean zN = n();
        for (int i2 = 0; i2 < size; i2++) {
            i iVar = arrayList.get(i2);
            char c2 = zN ? iVar.j : iVar.h;
            if ((c2 == keyData.meta[0] && (metaState & 2) == 0) || ((c2 == keyData.meta[2] && (metaState & 2) != 0) || (zN && c2 == '\b' && i == 67))) {
                return iVar;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public MenuItem getItem(int i) {
        return this.f.get(i);
    }

    public void h(List<i> list, int i, KeyEvent keyEvent) {
        boolean zN = n();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i == 67) {
            int size = this.f.size();
            for (int i2 = 0; i2 < size; i2++) {
                i iVar = this.f.get(i2);
                if (iVar.hasSubMenu()) {
                    iVar.o.h(list, i, keyEvent);
                }
                char c2 = zN ? iVar.j : iVar.h;
                if (((modifiers & 69647) == ((zN ? iVar.k : iVar.i) & 69647)) && c2 != 0) {
                    char[] cArr = keyData.meta;
                    if ((c2 == cArr[0] || c2 == cArr[2] || (zN && c2 == '\b' && i == 67)) && iVar.isEnabled()) {
                        list.add(iVar);
                    }
                }
            }
        }
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        if (this.y) {
            return true;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.f.get(i).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public void i() {
        ArrayList<i> arrayListL = l();
        if (this.k) {
            Iterator<WeakReference<m>> it = this.v.iterator();
            boolean zG = false;
            while (it.hasNext()) {
                WeakReference<m> next = it.next();
                m mVar = next.get();
                if (mVar == null) {
                    this.v.remove(next);
                } else {
                    zG |= mVar.g();
                }
            }
            if (zG) {
                this.i.clear();
                this.j.clear();
                int size = arrayListL.size();
                for (int i = 0; i < size; i++) {
                    i iVar = arrayListL.get(i);
                    (iVar.g() ? this.i : this.j).add(iVar);
                }
            } else {
                this.i.clear();
                this.j.clear();
                this.j.addAll(l());
            }
            this.k = false;
        }
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return g(i, keyEvent) != null;
    }

    public String j() {
        return "android:menu:actionviewstates";
    }

    public g k() {
        return this;
    }

    public ArrayList<i> l() {
        if (!this.h) {
            return this.g;
        }
        this.g.clear();
        int size = this.f.size();
        for (int i = 0; i < size; i++) {
            i iVar = this.f.get(i);
            if (iVar.isVisible()) {
                this.g.add(iVar);
            }
        }
        this.h = false;
        this.k = true;
        return this.g;
    }

    public boolean m() {
        return this.x;
    }

    public boolean n() {
        return this.f150c;
    }

    public boolean o() {
        return this.f151d;
    }

    public void p() {
        this.k = true;
        q(true);
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i, int i2) {
        return r(findItem(i), i2);
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        i iVarG = g(i, keyEvent);
        boolean zS = iVarG != null ? s(iVarG, null, i2) : false;
        if ((i2 & 2) != 0) {
            c(true);
        }
        return zS;
    }

    public void q(boolean z2) {
        if (this.p) {
            this.q = true;
            if (z2) {
                this.r = true;
                return;
            }
            return;
        }
        if (z2) {
            this.h = true;
            this.k = true;
        }
        if (this.v.isEmpty()) {
            return;
        }
        z();
        Iterator<WeakReference<m>> it = this.v.iterator();
        while (it.hasNext()) {
            WeakReference<m> next = it.next();
            m mVar = next.get();
            if (mVar == null) {
                this.v.remove(next);
            } else {
                mVar.h(z2);
            }
        }
        y();
    }

    public boolean r(MenuItem menuItem, int i) {
        return s(menuItem, null, i);
    }

    @Override // android.view.Menu
    public void removeGroup(int i) {
        int size = size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (this.f.get(i2).f157b == i) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 >= 0) {
            int size2 = this.f.size() - i2;
            int i3 = 0;
            while (true) {
                int i4 = i3 + 1;
                if (i3 >= size2 || this.f.get(i2).f157b != i) {
                    break;
                }
                t(i2, false);
                i3 = i4;
            }
            q(true);
        }
    }

    @Override // android.view.Menu
    public void removeItem(int i) {
        int size = size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (this.f.get(i2).f156a == i) {
                break;
            } else {
                i2++;
            }
        }
        t(i2, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x00d3 A[PHI: r1
  0x00d3: PHI (r1v12 boolean) = (r1v11 boolean), (r1v10 boolean), (r1v14 boolean) binds: [B:147:0x00d1, B:122:0x006b, B:115:0x005c] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean s(android.view.MenuItem r7, a.b.o.i.m r8, int r9) {
        /*
            r6 = this;
            a.b.o.i.i r7 = (a.b.o.i.i) r7
            r0 = 0
            if (r7 == 0) goto Ld7
            boolean r1 = r7.isEnabled()
            if (r1 != 0) goto Ld
            goto Ld7
        Ld:
            android.view.MenuItem$OnMenuItemClickListener r1 = r7.p
            r2 = 1
            if (r1 == 0) goto L19
            boolean r1 = r1.onMenuItemClick(r7)
            if (r1 == 0) goto L19
            goto L3c
        L19:
            a.b.o.i.g r1 = r7.n
            boolean r1 = r1.e(r1, r7)
            if (r1 == 0) goto L22
            goto L3c
        L22:
            android.content.Intent r1 = r7.g
            if (r1 == 0) goto L2e
            a.b.o.i.g r3 = r7.n     // Catch: android.content.ActivityNotFoundException -> L2e
            android.content.Context r3 = r3.f148a     // Catch: android.content.ActivityNotFoundException -> L2e
            r3.startActivity(r1)     // Catch: android.content.ActivityNotFoundException -> L2e
            goto L3c
        L2e:
            a.g.j.b r1 = r7.A
            if (r1 == 0) goto L3e
            a.b.o.i.j$a r1 = (a.b.o.i.j.a) r1
            android.view.ActionProvider r1 = r1.f164b
            boolean r1 = r1.onPerformDefaultAction()
            if (r1 == 0) goto L3e
        L3c:
            r1 = r2
            goto L3f
        L3e:
            r1 = r0
        L3f:
            a.g.j.b r3 = r7.A
            if (r3 == 0) goto L50
            r4 = r3
            a.b.o.i.j$a r4 = (a.b.o.i.j.a) r4
            android.view.ActionProvider r4 = r4.f164b
            boolean r4 = r4.hasSubMenu()
            if (r4 == 0) goto L50
            r4 = r2
            goto L51
        L50:
            r4 = r0
        L51:
            boolean r5 = r7.f()
            if (r5 == 0) goto L60
            boolean r7 = r7.expandActionView()
            r1 = r1 | r7
            if (r1 == 0) goto Ld6
            goto Ld3
        L60:
            boolean r5 = r7.hasSubMenu()
            if (r5 != 0) goto L6e
            if (r4 == 0) goto L69
            goto L6e
        L69:
            r7 = r9 & 1
            if (r7 != 0) goto Ld6
            goto Ld3
        L6e:
            r9 = r9 & 4
            if (r9 != 0) goto L75
            r6.c(r0)
        L75:
            boolean r9 = r7.hasSubMenu()
            if (r9 != 0) goto L89
            a.b.o.i.r r9 = new a.b.o.i.r
            android.content.Context r5 = r6.f148a
            r9.<init>(r5, r6, r7)
            r7.o = r9
            java.lang.CharSequence r5 = r7.f160e
            r9.setHeaderTitle(r5)
        L89:
            a.b.o.i.r r7 = r7.o
            if (r4 == 0) goto L9a
            a.b.o.i.j$a r3 = (a.b.o.i.j.a) r3
            android.view.ActionProvider r9 = r3.f164b
            a.b.o.i.j r3 = a.b.o.i.j.this
            android.view.SubMenu r3 = r3.d(r7)
            r9.onPrepareSubMenu(r3)
        L9a:
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<a.b.o.i.m>> r9 = r6.v
            boolean r9 = r9.isEmpty()
            if (r9 == 0) goto La3
            goto Ld0
        La3:
            if (r8 == 0) goto La9
            boolean r0 = r8.f(r7)
        La9:
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<a.b.o.i.m>> r8 = r6.v
            java.util.Iterator r8 = r8.iterator()
        Laf:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto Ld0
            java.lang.Object r9 = r8.next()
            java.lang.ref.WeakReference r9 = (java.lang.ref.WeakReference) r9
            java.lang.Object r3 = r9.get()
            a.b.o.i.m r3 = (a.b.o.i.m) r3
            if (r3 != 0) goto Lc9
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<a.b.o.i.m>> r3 = r6.v
            r3.remove(r9)
            goto Laf
        Lc9:
            if (r0 != 0) goto Laf
            boolean r0 = r3.f(r7)
            goto Laf
        Ld0:
            r1 = r1 | r0
            if (r1 != 0) goto Ld6
        Ld3:
            r6.c(r2)
        Ld6:
            return r1
        Ld7:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a.b.o.i.g.s(android.view.MenuItem, a.b.o.i.m, int):boolean");
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i, boolean z2, boolean z3) {
        int size = this.f.size();
        for (int i2 = 0; i2 < size; i2++) {
            i iVar = this.f.get(i2);
            if (iVar.f157b == i) {
                iVar.x = (iVar.x & (-5)) | (z3 ? 4 : 0);
                iVar.setCheckable(z2);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z2) {
        this.x = z2;
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i, boolean z2) {
        int size = this.f.size();
        for (int i2 = 0; i2 < size; i2++) {
            i iVar = this.f.get(i2);
            if (iVar.f157b == i) {
                iVar.setEnabled(z2);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i, boolean z2) {
        int size = this.f.size();
        boolean z3 = false;
        for (int i2 = 0; i2 < size; i2++) {
            i iVar = this.f.get(i2);
            if (iVar.f157b == i && iVar.l(z2)) {
                z3 = true;
            }
        }
        if (z3) {
            q(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z2) {
        this.f150c = z2;
        q(false);
    }

    @Override // android.view.Menu
    public int size() {
        return this.f.size();
    }

    public final void t(int i, boolean z2) {
        if (i < 0 || i >= this.f.size()) {
            return;
        }
        this.f.remove(i);
        if (z2) {
            q(true);
        }
    }

    public void u(m mVar) {
        Iterator<WeakReference<m>> it = this.v.iterator();
        while (it.hasNext()) {
            WeakReference<m> next = it.next();
            m mVar2 = next.get();
            if (mVar2 == null || mVar2 == mVar) {
                this.v.remove(next);
            }
        }
    }

    public void v(Bundle bundle) {
        MenuItem menuItemFindItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(j());
        int size = size();
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((r) item.getSubMenu()).v(bundle);
            }
        }
        int i2 = bundle.getInt("android:menu:expandedactionview");
        if (i2 <= 0 || (menuItemFindItem = findItem(i2)) == null) {
            return;
        }
        menuItemFindItem.expandActionView();
    }

    public void w(Bundle bundle) {
        int size = size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((r) item.getSubMenu()).w(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(j(), sparseArray);
        }
    }

    public final void x(int i, CharSequence charSequence, int i2, Drawable drawable, View view) {
        Resources resources = this.f149b;
        if (view != null) {
            this.o = view;
            this.m = null;
            this.n = null;
        } else {
            if (i > 0) {
                this.m = resources.getText(i);
            } else if (charSequence != null) {
                this.m = charSequence;
            }
            if (i2 > 0) {
                this.n = a.g.d.a.b(this.f148a, i2);
            } else if (drawable != null) {
                this.n = drawable;
            }
            this.o = null;
        }
        q(false);
    }

    public void y() {
        this.p = false;
        if (this.q) {
            this.q = false;
            q(this.r);
        }
    }

    public void z() {
        if (this.p) {
            return;
        }
        this.p = true;
        this.q = false;
        this.r = false;
    }
}
