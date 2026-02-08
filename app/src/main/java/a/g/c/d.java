package a.g.c;

import a.g.j.d;
import a.g.j.k;
import a.k.d;
import a.k.o;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;

/* loaded from: classes.dex */
public class d extends Activity implements a.k.g, d.a {

    /* renamed from: b, reason: collision with root package name */
    public a.k.h f596b = new a.k.h(this);

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !k.d(decorView, keyEvent)) {
            return a.g.j.d.a(this, decorView, this, keyEvent);
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !k.d(decorView, keyEvent)) {
            return super.dispatchKeyShortcutEvent(keyEvent);
        }
        return true;
    }

    @Override // a.g.j.d.a
    public boolean h(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    @SuppressLint({"RestrictedApi"})
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        o.b(this);
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        this.f596b.f(d.b.CREATED);
        super.onSaveInstanceState(bundle);
    }
}
