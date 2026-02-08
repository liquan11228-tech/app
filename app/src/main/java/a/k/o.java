package a.k;

import a.k.d;
import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.content.ComponentCallbacks2;
import android.os.Bundle;

/* loaded from: classes.dex */
public class o extends Fragment {

    /* renamed from: b, reason: collision with root package name */
    public a f884b;

    public interface a {
        void a();

        void b();

        void c();
    }

    public static void b(Activity activity) {
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new o(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }

    public final void a(d.a aVar) {
        ComponentCallbacks2 activity = getActivity();
        if (activity instanceof i) {
            ((i) activity).a().d(aVar);
        } else if (activity instanceof g) {
            d dVarA = ((g) activity).a();
            if (dVarA instanceof h) {
                ((h) dVarA).d(aVar);
            }
        }
    }

    @Override // android.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        a aVar = this.f884b;
        if (aVar != null) {
            aVar.a();
        }
        a(d.a.ON_CREATE);
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        a(d.a.ON_DESTROY);
        this.f884b = null;
    }

    @Override // android.app.Fragment
    public void onPause() {
        super.onPause();
        a(d.a.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public void onResume() {
        super.onResume();
        a aVar = this.f884b;
        if (aVar != null) {
            aVar.b();
        }
        a(d.a.ON_RESUME);
    }

    @Override // android.app.Fragment
    public void onStart() {
        super.onStart();
        a aVar = this.f884b;
        if (aVar != null) {
            aVar.c();
        }
        a(d.a.ON_START);
    }

    @Override // android.app.Fragment
    public void onStop() {
        super.onStop();
        a(d.a.ON_STOP);
    }
}
