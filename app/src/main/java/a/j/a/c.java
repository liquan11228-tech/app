package a.j.a;

import android.view.View;
import androidx.fragment.app.Fragment;

/* loaded from: classes.dex */
public class c extends e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Fragment f773a;

    public c(Fragment fragment) {
        this.f773a = fragment;
    }

    @Override // a.j.a.e
    public View b(int i) {
        View view = this.f773a.G;
        if (view != null) {
            return view.findViewById(i);
        }
        throw new IllegalStateException("Fragment " + this + " does not have a view");
    }

    @Override // a.j.a.e
    public boolean f() {
        return this.f773a.G != null;
    }
}
