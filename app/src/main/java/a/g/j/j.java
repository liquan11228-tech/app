package a.g.j;

import android.view.View;
import android.view.ViewTreeObserver;

/* loaded from: classes.dex */
public final class j implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: b, reason: collision with root package name */
    public final View f692b;

    /* renamed from: c, reason: collision with root package name */
    public ViewTreeObserver f693c;

    /* renamed from: d, reason: collision with root package name */
    public final Runnable f694d;

    public j(View view, Runnable runnable) {
        this.f692b = view;
        this.f693c = view.getViewTreeObserver();
        this.f694d = runnable;
    }

    public static j a(View view, Runnable runnable) {
        if (view == null) {
            throw new NullPointerException("view == null");
        }
        j jVar = new j(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(jVar);
        view.addOnAttachStateChangeListener(jVar);
        return jVar;
    }

    public void b() {
        (this.f693c.isAlive() ? this.f693c : this.f692b.getViewTreeObserver()).removeOnPreDrawListener(this);
        this.f692b.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        b();
        this.f694d.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        this.f693c = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        b();
    }
}
