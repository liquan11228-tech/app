package a.j.a;

import android.content.res.Resources;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.fragment.app.Fragment;

/* loaded from: classes.dex */
public class k implements Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f801a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Fragment f802b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j f803c;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() throws Resources.NotFoundException {
            if (k.this.f802b.h() != null) {
                k.this.f802b.C(null);
                k kVar = k.this;
                j jVar = kVar.f803c;
                Fragment fragment = kVar.f802b;
                jVar.Z(fragment, fragment.q(), 0, 0, false);
            }
        }
    }

    public k(j jVar, ViewGroup viewGroup, Fragment fragment) {
        this.f803c = jVar;
        this.f801a = viewGroup;
        this.f802b = fragment;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(Animation animation) {
        this.f801a.post(new a());
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(Animation animation) {
    }
}
