package a.j.a;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;

/* loaded from: classes.dex */
public class m extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f809a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f810b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Fragment f811c;

    public m(j jVar, ViewGroup viewGroup, View view, Fragment fragment) {
        this.f809a = viewGroup;
        this.f810b = view;
        this.f811c = fragment;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        this.f809a.endViewTransition(this.f810b);
        animator.removeListener(this);
        Fragment fragment = this.f811c;
        View view = fragment.G;
        if (view == null || !fragment.z) {
            return;
        }
        view.setVisibility(8);
    }
}
