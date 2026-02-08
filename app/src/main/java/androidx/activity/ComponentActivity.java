package androidx.activity;

import a.g.c.d;
import a.k.d;
import a.k.e;
import a.k.g;
import a.k.h;
import a.k.o;
import a.k.s;
import a.k.t;
import a.m.c;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.Window;

/* loaded from: classes.dex */
public class ComponentActivity extends d implements g, t, c, a.a.c {

    /* renamed from: e, reason: collision with root package name */
    public s f904e;

    /* renamed from: c, reason: collision with root package name */
    public final h f902c = new h(this);

    /* renamed from: d, reason: collision with root package name */
    public final a.m.b f903d = new a.m.b(this);
    public final OnBackPressedDispatcher f = new OnBackPressedDispatcher(new a());

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ComponentActivity.super.onBackPressed();
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public s f908a;
    }

    public ComponentActivity() {
        h hVar = this.f902c;
        if (hVar == null) {
            throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
        }
        hVar.a(new e() { // from class: androidx.activity.ComponentActivity.2
            @Override // a.k.e
            public void g(g gVar, d.a aVar) {
                if (aVar == d.a.ON_STOP) {
                    Window window = ComponentActivity.this.getWindow();
                    View viewPeekDecorView = window != null ? window.peekDecorView() : null;
                    if (viewPeekDecorView != null) {
                        viewPeekDecorView.cancelPendingInputEvents();
                    }
                }
            }
        });
        this.f902c.a(new e() { // from class: androidx.activity.ComponentActivity.3
            @Override // a.k.e
            public void g(g gVar, d.a aVar) {
                if (aVar != d.a.ON_DESTROY || ComponentActivity.this.isChangingConfigurations()) {
                    return;
                }
                ComponentActivity.this.e().a();
            }
        });
    }

    @Override // a.k.g
    public a.k.d a() {
        return this.f902c;
    }

    @Override // a.a.c
    public final OnBackPressedDispatcher c() {
        return this.f;
    }

    @Override // a.m.c
    public final a.m.a d() {
        return this.f903d.f896b;
    }

    @Override // a.k.t
    public s e() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        if (this.f904e == null) {
            b bVar = (b) getLastNonConfigurationInstance();
            if (bVar != null) {
                this.f904e = bVar.f908a;
            }
            if (this.f904e == null) {
                this.f904e = new s();
            }
        }
        return this.f904e;
    }

    @Override // android.app.Activity
    public void onBackPressed() throws Resources.NotFoundException {
        this.f.a();
    }

    @Override // a.g.c.d, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f903d.a(bundle);
        o.b(this);
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        b bVar;
        s sVar = this.f904e;
        if (sVar == null && (bVar = (b) getLastNonConfigurationInstance()) != null) {
            sVar = bVar.f908a;
        }
        if (sVar == null) {
            return null;
        }
        b bVar2 = new b();
        bVar2.f908a = sVar;
        return bVar2;
    }

    @Override // a.g.c.d, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        h hVar = this.f902c;
        if (hVar instanceof h) {
            hVar.f(d.b.CREATED);
        }
        super.onSaveInstanceState(bundle);
        this.f903d.b(bundle);
    }
}
