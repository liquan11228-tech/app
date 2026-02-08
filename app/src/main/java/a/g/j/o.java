package a.g.j;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a */
    public WeakReference<View> f706a;

    /* renamed from: b */
    public Runnable f707b = null;

    /* renamed from: c */
    public Runnable f708c = null;

    /* renamed from: d */
    public int f709d = -1;

    public class a extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ p f710a;

        /* renamed from: b */
        public final /* synthetic */ View f711b;

        public a(o oVar, p pVar, View view) {
            this.f710a = pVar;
            this.f711b = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f710a.c(this.f711b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f710a.a(this.f711b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f710a.b(this.f711b);
        }
    }

    public class b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        public final /* synthetic */ r f712a;

        /* renamed from: b */
        public final /* synthetic */ View f713b;

        public b(o oVar, r rVar, View view) {
            this.f712a = rVar;
            this.f713b = view;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            ((View) a.b.k.r.this.f65d.getParent()).invalidate();
        }
    }

    public o(View view) {
        this.f706a = new WeakReference<>(view);
    }

    public o a(float f) {
        View view = this.f706a.get();
        if (view != null) {
            view.animate().alpha(f);
        }
        return this;
    }

    public void b() {
        View view = this.f706a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public o c(long j) {
        View view = this.f706a.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
        return this;
    }

    public o d(p pVar) {
        View view = this.f706a.get();
        if (view != null) {
            e(view, pVar);
        }
        return this;
    }

    public final void e(View view, p pVar) {
        if (pVar != null) {
            view.animate().setListener(new a(this, pVar, view));
        } else {
            view.animate().setListener(null);
        }
    }

    public o f(r rVar) {
        View view = this.f706a.get();
        if (view != null) {
            view.animate().setUpdateListener(rVar != null ? new b(this, rVar, view) : null);
        }
        return this;
    }

    public o g(float f) {
        View view = this.f706a.get();
        if (view != null) {
            view.animate().translationY(f);
        }
        return this;
    }
}
