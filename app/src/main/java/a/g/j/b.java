package a.g.j;

import a.b.o.i.j;
import android.content.Context;
import android.view.MenuItem;
import android.view.View;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public a f679a;

    public interface a {
    }

    public b(Context context) {
    }

    public boolean a() {
        return true;
    }

    public View b(MenuItem menuItem) {
        return ((j.a) this).f164b.onCreateActionView();
    }

    public boolean c() {
        return false;
    }

    public void d(a aVar) {
        if (this.f679a != null) {
            getClass().getSimpleName();
        }
        this.f679a = aVar;
    }
}
