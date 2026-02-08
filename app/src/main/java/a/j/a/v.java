package a.j.a;

import android.graphics.Rect;
import android.transition.Transition;
import android.transition.TransitionSet;
import android.view.View;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes.dex */
public class v {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f847a = {0, 3, 0, 1, 5, 4, 7, 6, 9, 8, 10};

    /* renamed from: b, reason: collision with root package name */
    public static final d0 f848b = new y();

    /* renamed from: c, reason: collision with root package name */
    public static final d0 f849c;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public Fragment f850a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f851b;

        /* renamed from: c, reason: collision with root package name */
        public a.j.a.a f852c;

        /* renamed from: d, reason: collision with root package name */
        public Fragment f853d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f854e;
        public a.j.a.a f;
    }

    static {
        d0 d0Var;
        try {
            d0Var = (d0) Class.forName("androidx.transition.FragmentTransitionSupport").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            d0Var = null;
        }
        f849c = d0Var;
    }

    public static void a(ArrayList<View> arrayList, a.e.a<String, View> aVar, Collection<String> collection) {
        for (int i = aVar.f421d - 1; i >= 0; i--) {
            View viewJ = aVar.j(i);
            if (collection.contains(a.g.j.k.i(viewJ))) {
                arrayList.add(viewJ);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0093  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void b(a.j.a.a r16, a.j.a.q.a r17, android.util.SparseArray<a.j.a.v.a> r18, boolean r19, boolean r20) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 254
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a.j.a.v.b(a.j.a.a, a.j.a.q$a, android.util.SparseArray, boolean, boolean):void");
    }

    public static void c(Fragment fragment, Fragment fragment2, boolean z, a.e.a<String, View> aVar, boolean z2) {
        if (z) {
            Fragment.b bVar = fragment2.K;
        } else {
            Fragment.b bVar2 = fragment.K;
        }
    }

    public static boolean d(d0 d0Var, List<Object> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Object obj = list.get(i);
            if (((y) d0Var) == null) {
                throw null;
            }
            if (!(obj instanceof Transition)) {
                return false;
            }
        }
        return true;
    }

    public static a.e.a<String, View> e(d0 d0Var, a.e.a<String, String> aVar, Object obj, a aVar2) {
        View view = aVar2.f850a.G;
        if (aVar.isEmpty() || obj == null || view == null) {
            aVar.clear();
            return null;
        }
        a.e.a<String, View> aVar3 = new a.e.a<>();
        d0Var.e(aVar3, view);
        a.j.a.a aVar4 = aVar2.f852c;
        ArrayList<String> arrayList = aVar2.f851b ? aVar4.n : aVar4.o;
        if (arrayList != null) {
            a.e.g.k(aVar3, arrayList);
            a.e.g.k(aVar3, aVar.values());
        }
        int i = aVar.f421d;
        while (true) {
            i--;
            if (i < 0) {
                return aVar3;
            }
            if (!aVar3.containsKey(aVar.j(i))) {
                aVar.h(i);
            }
        }
    }

    public static a.e.a<String, View> f(d0 d0Var, a.e.a<String, String> aVar, Object obj, a aVar2) {
        if (aVar.isEmpty() || obj == null) {
            aVar.clear();
            return null;
        }
        Fragment fragment = aVar2.f853d;
        a.e.a<String, View> aVar3 = new a.e.a<>();
        d0Var.e(aVar3, fragment.B());
        a.j.a.a aVar4 = aVar2.f;
        a.e.g.k(aVar3, aVar2.f854e ? aVar4.o : aVar4.n);
        a.e.g.k(aVar, aVar3.keySet());
        return aVar3;
    }

    public static d0 g(Fragment fragment, Fragment fragment2) {
        Object objL;
        Object objK;
        Object objP;
        ArrayList arrayList = new ArrayList();
        if (fragment != null) {
            Object objL2 = fragment.l();
            if (objL2 != null) {
                arrayList.add(objL2);
            }
            Fragment.b bVar = fragment.K;
            if (bVar == null) {
                objK = null;
            } else {
                objK = bVar.h;
                if (objK == Fragment.V) {
                    objK = fragment.k();
                }
            }
            if (objK != null) {
                arrayList.add(objK);
            }
            Fragment.b bVar2 = fragment.K;
            if (bVar2 == null) {
                objP = null;
            } else {
                objP = bVar2.l;
                if (objP == Fragment.V) {
                    objP = fragment.p();
                }
            }
            if (objP != null) {
                arrayList.add(objP);
            }
        }
        if (fragment2 != null) {
            Object objK2 = fragment2.k();
            if (objK2 != null) {
                arrayList.add(objK2);
            }
            Fragment.b bVar3 = fragment2.K;
            if (bVar3 == null) {
                objL = null;
            } else {
                objL = bVar3.j;
                if (objL == Fragment.V) {
                    objL = fragment2.l();
                }
            }
            if (objL != null) {
                arrayList.add(objL);
            }
            Object objP2 = fragment2.p();
            if (objP2 != null) {
                arrayList.add(objP2);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        if (d(f848b, arrayList)) {
            return f848b;
        }
        d0 d0Var = f849c;
        if (d0Var == null || !d(d0Var, arrayList)) {
            throw new IllegalArgumentException("Invalid Transition types");
        }
        return f849c;
    }

    public static ArrayList<View> h(d0 d0Var, Object obj, Fragment fragment, ArrayList<View> arrayList, View view) {
        if (obj == null) {
            return null;
        }
        ArrayList<View> arrayList2 = new ArrayList<>();
        View view2 = fragment.G;
        if (view2 != null) {
            d0Var.b(arrayList2, view2);
        }
        if (arrayList != null) {
            arrayList2.removeAll(arrayList);
        }
        if (arrayList2.isEmpty()) {
            return arrayList2;
        }
        arrayList2.add(view);
        d0Var.a(obj, arrayList2);
        return arrayList2;
    }

    public static Object i(d0 d0Var, Fragment fragment, boolean z) {
        Object objK = null;
        if (fragment == null) {
            return null;
        }
        if (z) {
            Fragment.b bVar = fragment.K;
            if (bVar != null && (objK = bVar.j) == Fragment.V) {
                objK = fragment.l();
            }
        } else {
            objK = fragment.k();
        }
        return d0Var.c(objK);
    }

    public static Object j(d0 d0Var, Fragment fragment, boolean z) {
        Object objL = null;
        if (fragment == null) {
            return null;
        }
        if (z) {
            Fragment.b bVar = fragment.K;
            if (bVar != null && (objL = bVar.h) == Fragment.V) {
                objL = fragment.k();
            }
        } else {
            objL = fragment.l();
        }
        return d0Var.c(objL);
    }

    public static View k(a.e.a<String, View> aVar, a aVar2, Object obj, boolean z) {
        ArrayList<String> arrayList;
        a.j.a.a aVar3 = aVar2.f852c;
        if (obj == null || aVar == null || (arrayList = aVar3.n) == null || arrayList.isEmpty()) {
            return null;
        }
        return aVar.get((z ? aVar3.n : aVar3.o).get(0));
    }

    public static Object l(d0 d0Var, Fragment fragment, Fragment fragment2, boolean z) {
        Object objP;
        if (z) {
            Fragment.b bVar = fragment2.K;
            if (bVar == null) {
                objP = null;
            } else {
                objP = bVar.l;
                if (objP == Fragment.V) {
                    objP = fragment2.p();
                }
            }
        } else {
            objP = fragment.p();
        }
        Object objC = d0Var.c(objP);
        if (objC == null) {
            return null;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition((Transition) objC);
        return transitionSet;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object m(a.j.a.d0 r1, java.lang.Object r2, java.lang.Object r3, java.lang.Object r4, androidx.fragment.app.Fragment r5, boolean r6) {
        /*
            r0 = 1
            if (r2 == 0) goto L25
            if (r3 == 0) goto L25
            if (r5 == 0) goto L25
            if (r6 == 0) goto L17
            androidx.fragment.app.Fragment$b r5 = r5.K
            if (r5 == 0) goto L25
            java.lang.Boolean r5 = r5.m
            if (r5 != 0) goto L12
            goto L25
        L12:
            boolean r5 = r5.booleanValue()
            goto L26
        L17:
            androidx.fragment.app.Fragment$b r5 = r5.K
            if (r5 == 0) goto L25
            java.lang.Boolean r5 = r5.n
            if (r5 != 0) goto L20
            goto L25
        L20:
            boolean r5 = r5.booleanValue()
            goto L26
        L25:
            r5 = r0
        L26:
            r6 = 0
            a.j.a.y r1 = (a.j.a.y) r1
            if (r5 == 0) goto L46
            android.transition.TransitionSet r1 = new android.transition.TransitionSet
            r1.<init>()
            if (r3 == 0) goto L37
            android.transition.Transition r3 = (android.transition.Transition) r3
            r1.addTransition(r3)
        L37:
            if (r2 == 0) goto L3e
            android.transition.Transition r2 = (android.transition.Transition) r2
            r1.addTransition(r2)
        L3e:
            if (r4 == 0) goto L7a
            android.transition.Transition r4 = (android.transition.Transition) r4
            r1.addTransition(r4)
            goto L7a
        L46:
            android.transition.Transition r3 = (android.transition.Transition) r3
            android.transition.Transition r2 = (android.transition.Transition) r2
            android.transition.Transition r4 = (android.transition.Transition) r4
            if (r3 == 0) goto L62
            if (r2 == 0) goto L62
            android.transition.TransitionSet r1 = new android.transition.TransitionSet
            r1.<init>()
            android.transition.TransitionSet r1 = r1.addTransition(r3)
            android.transition.TransitionSet r1 = r1.addTransition(r2)
            android.transition.TransitionSet r6 = r1.setOrdering(r0)
            goto L69
        L62:
            if (r3 == 0) goto L66
            r6 = r3
            goto L69
        L66:
            if (r2 == 0) goto L69
            r6 = r2
        L69:
            if (r4 == 0) goto L79
            android.transition.TransitionSet r1 = new android.transition.TransitionSet
            r1.<init>()
            if (r6 == 0) goto L75
            r1.addTransition(r6)
        L75:
            r1.addTransition(r4)
            goto L7a
        L79:
            r1 = r6
        L7a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: a.j.a.v.m(a.j.a.d0, java.lang.Object, java.lang.Object, java.lang.Object, androidx.fragment.app.Fragment, boolean):java.lang.Object");
    }

    public static void n(d0 d0Var, Object obj, Object obj2, a.e.a<String, View> aVar, boolean z, a.j.a.a aVar2) {
        ArrayList<String> arrayList = aVar2.n;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        View view = aVar.get((z ? aVar2.o : aVar2.n).get(0));
        y yVar = (y) d0Var;
        if (view != null) {
            Rect rect = new Rect();
            yVar.f(view, rect);
            ((Transition) obj).setEpicenterCallback(new w(yVar, rect));
        }
        if (obj2 == null || view == null) {
            return;
        }
        Rect rect2 = new Rect();
        yVar.f(view, rect2);
        ((Transition) obj2).setEpicenterCallback(new w(yVar, rect2));
    }

    public static void o(ArrayList<View> arrayList, int i) {
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            arrayList.get(size).setVisibility(i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0409  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0423  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0438  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0450  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0490 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0233  */
    /* JADX WARN: Type inference failed for: r13v3, types: [a.e.h] */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void p(a.j.a.j r39, java.util.ArrayList<a.j.a.a> r40, java.util.ArrayList<java.lang.Boolean> r41, int r42, int r43, boolean r44) {
        /*
            Method dump skipped, instructions count: 1189
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a.j.a.v.p(a.j.a.j, java.util.ArrayList, java.util.ArrayList, int, int, boolean):void");
    }
}
