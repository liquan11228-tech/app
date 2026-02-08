package a.j.a;

import android.transition.Transition;
import android.view.View;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class x implements Transition.TransitionListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f856a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f857b;

    public x(y yVar, View view, ArrayList arrayList) {
        this.f856a = view;
        this.f857b = arrayList;
    }

    @Override // android.transition.Transition.TransitionListener
    public void onTransitionCancel(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public void onTransitionEnd(Transition transition) {
        transition.removeListener(this);
        this.f856a.setVisibility(8);
        int size = this.f857b.size();
        for (int i = 0; i < size; i++) {
            ((View) this.f857b.get(i)).setVisibility(0);
        }
    }

    @Override // android.transition.Transition.TransitionListener
    public void onTransitionPause(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public void onTransitionResume(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public void onTransitionStart(Transition transition) {
    }
}
