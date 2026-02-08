package a.j.a;

import android.transition.Transition;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class y extends d0 {

    public class a implements Transition.TransitionListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Object f858a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ArrayList f859b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Object f860c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ ArrayList f861d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Object f862e;
        public final /* synthetic */ ArrayList f;

        public a(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.f858a = obj;
            this.f859b = arrayList;
            this.f860c = obj2;
            this.f861d = arrayList2;
            this.f862e = obj3;
            this.f = arrayList3;
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionCancel(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
            transition.removeListener(this);
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionPause(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionResume(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
            Object obj = this.f858a;
            if (obj != null) {
                y.this.h(obj, this.f859b, null);
            }
            Object obj2 = this.f860c;
            if (obj2 != null) {
                y.this.h(obj2, this.f861d, null);
            }
            Object obj3 = this.f862e;
            if (obj3 != null) {
                y.this.h(obj3, this.f, null);
            }
        }
    }

    public static boolean k(Transition transition) {
        return (d0.g(transition.getTargetIds()) && d0.g(transition.getTargetNames()) && d0.g(transition.getTargetTypes())) ? false : true;
    }

    @Override // a.j.a.d0
    public void a(Object obj, ArrayList<View> arrayList) {
        Transition transition = (Transition) obj;
        if (transition == null) {
            return;
        }
        int i = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i < transitionCount) {
                a(transitionSet.getTransitionAt(i), arrayList);
                i++;
            }
            return;
        }
        if (k(transition) || !d0.g(transition.getTargets())) {
            return;
        }
        int size = arrayList.size();
        while (i < size) {
            transition.addTarget(arrayList.get(i));
            i++;
        }
    }

    @Override // a.j.a.d0
    public Object c(Object obj) {
        if (obj != null) {
            return ((Transition) obj).clone();
        }
        return null;
    }

    @Override // a.j.a.d0
    public void h(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        List<View> targets;
        Transition transition = (Transition) obj;
        int i = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i < transitionCount) {
                h(transitionSet.getTransitionAt(i), arrayList, arrayList2);
                i++;
            }
            return;
        }
        if (k(transition) || (targets = transition.getTargets()) == null || targets.size() != arrayList.size() || !targets.containsAll(arrayList)) {
            return;
        }
        int size = arrayList2 == null ? 0 : arrayList2.size();
        while (i < size) {
            transition.addTarget(arrayList2.get(i));
            i++;
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            transition.removeTarget(arrayList.get(size2));
        }
    }

    @Override // a.j.a.d0
    public void i(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3) {
        ((Transition) obj).addListener(new a(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    @Override // a.j.a.d0
    public void j(Object obj, View view, ArrayList<View> arrayList) {
        TransitionSet transitionSet = (TransitionSet) obj;
        List<View> targets = transitionSet.getTargets();
        targets.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            View view2 = arrayList.get(i);
            int size2 = targets.size();
            if (!d0.d(targets, view2, size2)) {
                targets.add(view2);
                for (int i2 = size2; i2 < targets.size(); i2++) {
                    View view3 = targets.get(i2);
                    if (view3 instanceof ViewGroup) {
                        ViewGroup viewGroup = (ViewGroup) view3;
                        int childCount = viewGroup.getChildCount();
                        for (int i3 = 0; i3 < childCount; i3++) {
                            View childAt = viewGroup.getChildAt(i3);
                            if (!d0.d(targets, childAt, size2)) {
                                targets.add(childAt);
                            }
                        }
                    }
                }
            }
        }
        targets.add(view);
        arrayList.add(view);
        a(transitionSet, arrayList);
    }
}
