package a.j.a;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;

/* loaded from: classes.dex */
public class l extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f805a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f806b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Fragment f807c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j f808d;

    public l(j jVar, ViewGroup viewGroup, View view, Fragment fragment) {
        this.f808d = jVar;
        this.f805a = viewGroup;
        this.f806b = view;
        this.f807c = fragment;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) throws Resources.NotFoundException {
        this.f805a.endViewTransition(this.f806b);
        Animator animatorI = this.f807c.i();
        this.f807c.D(null);
        if (animatorI == null || this.f805a.indexOfChild(this.f806b) >= 0) {
            return;
        }
        j jVar = this.f808d;
        Fragment fragment = this.f807c;
        jVar.Z(fragment, fragment.q(), 0, 0, false);
    }
}
