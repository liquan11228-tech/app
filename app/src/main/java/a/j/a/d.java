package a.j.a;

import a.b.k.h;
import a.k.d;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedDispatcher;
import androidx.fragment.app.Fragment;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class d extends ComponentActivity {
    public final f g;
    public final a.k.h h;
    public boolean i;
    public boolean j;
    public boolean k;
    public int l;
    public a.e.i<String> m;

    public class a extends h<d> implements a.k.t, a.a.c {
        public a() {
            super(d.this);
        }

        @Override // a.k.g
        public a.k.d a() {
            return d.this.h;
        }

        @Override // a.j.a.e
        public View b(int i) {
            return d.this.findViewById(i);
        }

        @Override // a.a.c
        public OnBackPressedDispatcher c() {
            return d.this.f;
        }

        @Override // a.k.t
        public a.k.s e() {
            return d.this.e();
        }

        @Override // a.j.a.e
        public boolean f() {
            Window window = d.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }
    }

    public d() {
        a aVar = new a();
        h.i.l(aVar, "callbacks == null");
        this.g = new f(aVar);
        this.h = new a.k.h(this);
        this.k = true;
    }

    public static void k(int i) {
        if ((i & (-65536)) != 0) {
            throw new IllegalArgumentException("Can only use lower 16 bits for requestCode");
        }
    }

    public static boolean l(i iVar, d.b bVar) {
        List<Fragment> listEmptyList;
        j jVar = (j) iVar;
        if (jVar.f.isEmpty()) {
            listEmptyList = Collections.emptyList();
        } else {
            synchronized (jVar.f) {
                listEmptyList = (List) jVar.f.clone();
            }
        }
        boolean zL = false;
        for (Fragment fragment : listEmptyList) {
            if (fragment != null) {
                if (fragment.R.f876b.compareTo(d.b.STARTED) >= 0) {
                    fragment.R.f(bVar);
                    zL = true;
                }
                h hVar = fragment.t;
                if ((hVar == null ? null : d.this) != null) {
                    zL |= l(fragment.j(), bVar);
                }
            }
        }
        return zL;
    }

    @Override // android.app.Activity
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String str2 = str + "  ";
        printWriter.print(str2);
        printWriter.print("mCreated=");
        printWriter.print(this.i);
        printWriter.print(" mResumed=");
        printWriter.print(this.j);
        printWriter.print(" mStopped=");
        printWriter.print(this.k);
        if (getApplication() != null) {
            a.l.a.a.b(this).a(str2, fileDescriptor, printWriter, strArr);
        }
        this.g.f777a.f.a(str, fileDescriptor, printWriter, strArr);
    }

    public void m() {
    }

    @Deprecated
    public void n() {
        invalidateOptionsMenu();
    }

    @Override // android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        this.g.a();
        int i3 = i >> 16;
        if (i3 == 0) {
            a.g.c.a.e();
            super.onActivityResult(i, i2, intent);
            return;
        }
        int i4 = i3 - 1;
        String strD = this.m.d(i4);
        this.m.h(i4);
        if (strD == null) {
            return;
        }
        this.g.f777a.f.P(strD);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.g.a();
        this.g.f777a.f.j(configuration);
    }

    @Override // androidx.activity.ComponentActivity, a.g.c.d, android.app.Activity
    public void onCreate(Bundle bundle) throws Resources.NotFoundException {
        h<?> hVar = this.g.f777a;
        hVar.f.e(hVar, hVar, null);
        if (bundle != null) {
            Parcelable parcelable = bundle.getParcelable("android:support:fragments");
            h<?> hVar2 = this.g.f777a;
            if (!(hVar2 instanceof a.k.t)) {
                throw new IllegalStateException("Your FragmentHostCallback must implement ViewModelStoreOwner to call restoreSaveState(). Call restoreAllState()  if you're still using retainNestedNonConfig().");
            }
            hVar2.f.d0(parcelable);
            if (bundle.containsKey("android:support:next_request_index")) {
                this.l = bundle.getInt("android:support:next_request_index");
                int[] intArray = bundle.getIntArray("android:support:request_indicies");
                String[] stringArray = bundle.getStringArray("android:support:request_fragment_who");
                if (intArray != null && stringArray != null && intArray.length == stringArray.length) {
                    this.m = new a.e.i<>(intArray.length);
                    for (int i = 0; i < intArray.length; i++) {
                        this.m.g(intArray[i], stringArray[i]);
                    }
                }
            }
        }
        if (this.m == null) {
            this.m = new a.e.i<>(10);
            this.l = 0;
        }
        super.onCreate(bundle);
        this.h.d(d.a.ON_CREATE);
        this.g.f777a.f.l();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0) {
            return super.onCreatePanelMenu(i, menu);
        }
        boolean zOnCreatePanelMenu = super.onCreatePanelMenu(i, menu);
        f fVar = this.g;
        return zOnCreatePanelMenu | fVar.f777a.f.m(menu, getMenuInflater());
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        View viewOnCreateView = this.g.f777a.f.onCreateView(view, str, context, attributeSet);
        return viewOnCreateView == null ? super.onCreateView(view, str, context, attributeSet) : viewOnCreateView;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.g.f777a.f.n();
        this.h.d(d.a.ON_DESTROY);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onLowMemory() {
        super.onLowMemory();
        this.g.f777a.f.o();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 0) {
            return this.g.f777a.f.E(menuItem);
        }
        if (i != 6) {
            return false;
        }
        return this.g.f777a.f.k(menuItem);
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z) {
        this.g.f777a.f.p(z);
    }

    @Override // android.app.Activity
    public void onNewIntent(@SuppressLint({"UnknownNullness"}) Intent intent) {
        super.onNewIntent(intent);
        this.g.a();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        if (i == 0) {
            this.g.f777a.f.F(menu);
        }
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.j = false;
        this.g.f777a.f.J(3);
        this.h.d(d.a.ON_PAUSE);
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z) {
        this.g.f777a.f.H(z);
    }

    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        this.h.d(d.a.ON_RESUME);
        j jVar = this.g.f777a.f;
        jVar.u = false;
        jVar.v = false;
        jVar.J(4);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i, View view, Menu menu) {
        return i == 0 ? super.onPreparePanel(0, view, menu) | this.g.f777a.f.I(menu) : super.onPreparePanel(i, view, menu);
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.g.a();
        int i2 = (i >> 16) & 65535;
        if (i2 != 0) {
            int i3 = i2 - 1;
            String strD = this.m.d(i3);
            this.m.h(i3);
            if (strD == null) {
                return;
            }
            this.g.f777a.f.P(strD);
        }
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        this.j = true;
        this.g.a();
        this.g.f777a.f.L();
    }

    @Override // androidx.activity.ComponentActivity, a.g.c.d, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        while (l(this.g.f777a.f, d.b.CREATED)) {
        }
        this.h.d(d.a.ON_STOP);
        Parcelable parcelableF0 = this.g.f777a.f.f0();
        if (parcelableF0 != null) {
            bundle.putParcelable("android:support:fragments", parcelableF0);
        }
        if (this.m.i() > 0) {
            bundle.putInt("android:support:next_request_index", this.l);
            int[] iArr = new int[this.m.i()];
            String[] strArr = new String[this.m.i()];
            for (int i = 0; i < this.m.i(); i++) {
                iArr[i] = this.m.f(i);
                strArr[i] = this.m.j(i);
            }
            bundle.putIntArray("android:support:request_indicies", iArr);
            bundle.putStringArray("android:support:request_fragment_who", strArr);
        }
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
        this.k = false;
        if (!this.i) {
            this.i = true;
            j jVar = this.g.f777a.f;
            jVar.u = false;
            jVar.v = false;
            jVar.J(2);
        }
        this.g.a();
        this.g.f777a.f.L();
        this.h.d(d.a.ON_START);
        j jVar2 = this.g.f777a.f;
        jVar2.u = false;
        jVar2.v = false;
        jVar2.J(3);
    }

    @Override // android.app.Activity
    public void onStateNotSaved() {
        this.g.a();
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        this.k = true;
        while (l(this.g.f777a.f, d.b.CREATED)) {
        }
        j jVar = this.g.f777a.f;
        jVar.v = true;
        jVar.J(2);
        this.h.d(d.a.ON_STOP);
    }

    @Override // android.app.Activity
    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i) {
        if (i != -1) {
            k(i);
        }
        super.startActivityForResult(intent, i);
    }

    @Override // android.app.Activity
    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i, Bundle bundle) {
        if (i != -1) {
            k(i);
        }
        super.startActivityForResult(intent, i, bundle);
    }

    @Override // android.app.Activity
    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) throws IntentSender.SendIntentException {
        if (i != -1) {
            k(i);
        }
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    @Override // android.app.Activity
    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
        if (i != -1) {
            k(i);
        }
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        View viewOnCreateView = this.g.f777a.f.onCreateView(null, str, context, attributeSet);
        return viewOnCreateView == null ? super.onCreateView(str, context, attributeSet) : viewOnCreateView;
    }
}
