package a.j.a;

import a.b.k.h;
import a.j.a.o;
import a.j.a.q;
import a.k.d;
import android.R;
import android.animation.Animator;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.ScaleAnimation;
import android.view.animation.Transformation;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.OnBackPressedDispatcher.LifecycleOnBackPressedCancellable;
import androidx.fragment.app.Fragment;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class j extends i implements LayoutInflater.Factory2 {
    public static boolean G;
    public static final Interpolator H = new DecelerateInterpolator(2.5f);
    public static final Interpolator I = new DecelerateInterpolator(1.5f);
    public ArrayList<Fragment> A;
    public ArrayList<h> D;
    public o E;

    /* renamed from: d */
    public boolean f785d;
    public ArrayList<a.j.a.a> h;
    public ArrayList<Fragment> i;
    public OnBackPressedDispatcher j;
    public ArrayList<a.j.a.a> l;
    public ArrayList<Integer> m;
    public a.j.a.h p;
    public a.j.a.e q;
    public Fragment r;
    public Fragment s;
    public boolean t;
    public boolean u;
    public boolean v;
    public boolean w;
    public boolean x;
    public ArrayList<a.j.a.a> y;
    public ArrayList<Boolean> z;

    /* renamed from: e */
    public int f786e = 0;
    public final ArrayList<Fragment> f = new ArrayList<>();
    public final HashMap<String, Fragment> g = new HashMap<>();
    public final a.a.b k = new a(false);
    public final CopyOnWriteArrayList<f> n = new CopyOnWriteArrayList<>();
    public int o = 0;
    public Bundle B = null;
    public SparseArray<Parcelable> C = null;
    public Runnable F = new b();

    public class a extends a.a.b {
        public a(boolean z) {
            super(z);
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() throws Resources.NotFoundException {
            j.this.L();
        }
    }

    public class c extends a.j.a.g {
        public c() {
        }

        @Override // a.j.a.g
        public Fragment a(ClassLoader classLoader, String str) {
            a.j.a.h hVar = j.this.p;
            Context context = hVar.f780c;
            if (hVar != null) {
                return Fragment.s(context, str, null);
            }
            throw null;
        }
    }

    public static class d {

        /* renamed from: a */
        public final Animation f790a;

        /* renamed from: b */
        public final Animator f791b;

        public d(Animator animator) {
            this.f790a = null;
            this.f791b = animator;
        }

        public d(Animation animation) {
            this.f790a = animation;
            this.f791b = null;
        }
    }

    public static class e extends AnimationSet implements Runnable {

        /* renamed from: b */
        public final ViewGroup f792b;

        /* renamed from: c */
        public final View f793c;

        /* renamed from: d */
        public boolean f794d;

        /* renamed from: e */
        public boolean f795e;
        public boolean f;

        public e(Animation animation, ViewGroup viewGroup, View view) {
            super(false);
            this.f = true;
            this.f792b = viewGroup;
            this.f793c = view;
            addAnimation(animation);
            this.f792b.post(this);
        }

        @Override // android.view.animation.AnimationSet, android.view.animation.Animation
        public boolean getTransformation(long j, Transformation transformation) {
            this.f = true;
            if (this.f794d) {
                return !this.f795e;
            }
            if (!super.getTransformation(j, transformation)) {
                this.f794d = true;
                a.g.j.j.a(this.f792b, this);
            }
            return true;
        }

        @Override // android.view.animation.Animation
        public boolean getTransformation(long j, Transformation transformation, float f) {
            this.f = true;
            if (this.f794d) {
                return !this.f795e;
            }
            if (!super.getTransformation(j, transformation, f)) {
                this.f794d = true;
                a.g.j.j.a(this.f792b, this);
            }
            return true;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f794d || !this.f) {
                this.f792b.endViewTransition(this.f793c);
                this.f795e = true;
            } else {
                this.f = false;
                this.f792b.post(this);
            }
        }
    }

    public static final class f {

        /* renamed from: a */
        public final boolean f796a;
    }

    public static class g {

        /* renamed from: a */
        public static final int[] f797a = {R.attr.name, R.attr.id, R.attr.tag};
    }

    public static class h implements Fragment.d {

        /* renamed from: a */
        public final boolean f798a;

        /* renamed from: b */
        public final a.j.a.a f799b;

        /* renamed from: c */
        public int f800c;

        public h(a.j.a.a aVar, boolean z) {
            this.f798a = z;
            this.f799b = aVar;
        }

        public void a() {
            boolean z = this.f800c > 0;
            j jVar = this.f799b.r;
            int size = jVar.f.size();
            for (int i = 0; i < size; i++) {
                Fragment fragment = jVar.f.get(i);
                fragment.H(null);
                if (z) {
                    Fragment.b bVar = fragment.K;
                    if (bVar == null ? false : bVar.q) {
                        fragment.I();
                    }
                }
            }
            a.j.a.a aVar = this.f799b;
            aVar.r.h(aVar, this.f798a, !z, true);
        }
    }

    public static d W(float f2, float f3, float f4, float f5) {
        AnimationSet animationSet = new AnimationSet(false);
        ScaleAnimation scaleAnimation = new ScaleAnimation(f2, f3, f2, f3, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setInterpolator(H);
        scaleAnimation.setDuration(220L);
        animationSet.addAnimation(scaleAnimation);
        AlphaAnimation alphaAnimation = new AlphaAnimation(f4, f5);
        alphaAnimation.setInterpolator(I);
        alphaAnimation.setDuration(220L);
        animationSet.addAnimation(alphaAnimation);
        return new d(animationSet);
    }

    public static int e0(int i) {
        if (i == 4097) {
            return 8194;
        }
        if (i != 4099) {
            return i != 8194 ? 0 : 4097;
        }
        return 4099;
    }

    public void A(Fragment fragment, boolean z) {
        Fragment fragment2 = this.r;
        if (fragment2 != null) {
            j jVar = fragment2.s;
            if (jVar instanceof j) {
                jVar.A(fragment, true);
            }
        }
        Iterator<f> it = this.n.iterator();
        while (it.hasNext()) {
            f next = it.next();
            if (!z || next.f796a) {
                throw null;
            }
        }
    }

    public void B(Fragment fragment, boolean z) {
        Fragment fragment2 = this.r;
        if (fragment2 != null) {
            j jVar = fragment2.s;
            if (jVar instanceof j) {
                jVar.B(fragment, true);
            }
        }
        Iterator<f> it = this.n.iterator();
        while (it.hasNext()) {
            f next = it.next();
            if (!z || next.f796a) {
                throw null;
            }
        }
    }

    public void C(Fragment fragment, View view, Bundle bundle, boolean z) {
        Fragment fragment2 = this.r;
        if (fragment2 != null) {
            j jVar = fragment2.s;
            if (jVar instanceof j) {
                jVar.C(fragment, view, bundle, true);
            }
        }
        Iterator<f> it = this.n.iterator();
        while (it.hasNext()) {
            f next = it.next();
            if (!z || next.f796a) {
                throw null;
            }
        }
    }

    public void D(Fragment fragment, boolean z) {
        Fragment fragment2 = this.r;
        if (fragment2 != null) {
            j jVar = fragment2.s;
            if (jVar instanceof j) {
                jVar.D(fragment, true);
            }
        }
        Iterator<f> it = this.n.iterator();
        while (it.hasNext()) {
            f next = it.next();
            if (!z || next.f796a) {
                throw null;
            }
        }
    }

    public boolean E(MenuItem menuItem) {
        if (this.o < 1) {
            return false;
        }
        for (int i = 0; i < this.f.size(); i++) {
            Fragment fragment = this.f.get(i);
            if (fragment != null) {
                if (!fragment.z && fragment.u.E(menuItem)) {
                    return true;
                }
            }
        }
        return false;
    }

    public void F(Menu menu) {
        if (this.o < 1) {
            return;
        }
        for (int i = 0; i < this.f.size(); i++) {
            Fragment fragment = this.f.get(i);
            if (fragment != null && !fragment.z) {
                fragment.u.F(menu);
            }
        }
    }

    public final void G(Fragment fragment) {
        if (fragment == null || this.g.get(fragment.f) != fragment) {
            return;
        }
        boolean zS = fragment.s.S(fragment);
        Boolean bool = fragment.k;
        if (bool == null || bool.booleanValue() != zS) {
            fragment.k = Boolean.valueOf(zS);
            j jVar = fragment.u;
            jVar.l0();
            jVar.G(jVar.s);
        }
    }

    public void H(boolean z) {
        int size = this.f.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            Fragment fragment = this.f.get(size);
            if (fragment != null) {
                fragment.u.H(z);
            }
        }
    }

    public boolean I(Menu menu) {
        if (this.o < 1) {
            return false;
        }
        boolean z = false;
        for (int i = 0; i < this.f.size(); i++) {
            Fragment fragment = this.f.get(i);
            if (fragment != null && fragment.A(menu)) {
                z = true;
            }
        }
        return z;
    }

    public final void J(int i) {
        try {
            this.f785d = true;
            Y(i, false);
            this.f785d = false;
            L();
        } catch (Throwable th) {
            this.f785d = false;
            throw th;
        }
    }

    public final void K(boolean z) {
        if (this.f785d) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.p == null) {
            throw new IllegalStateException("Fragment host has been destroyed");
        }
        if (Looper.myLooper() != this.p.f781d.getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z && T()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        if (this.y == null) {
            this.y = new ArrayList<>();
            this.z = new ArrayList<>();
        }
        this.f785d = true;
        try {
            N(null, null);
        } finally {
            this.f785d = false;
        }
    }

    public boolean L() throws Resources.NotFoundException {
        K(true);
        synchronized (this) {
        }
        l0();
        if (this.x) {
            this.x = false;
            j0();
        }
        this.g.values().removeAll(Collections.singleton(null));
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:260:0x014a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void M(java.util.ArrayList<a.j.a.a> r20, java.util.ArrayList<java.lang.Boolean> r21, int r22, int r23) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 766
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a.j.a.j.M(java.util.ArrayList, java.util.ArrayList, int, int):void");
    }

    public final void N(ArrayList<a.j.a.a> arrayList, ArrayList<Boolean> arrayList2) {
        int iIndexOf;
        int iIndexOf2;
        ArrayList<h> arrayList3 = this.D;
        int size = arrayList3 == null ? 0 : arrayList3.size();
        int i = 0;
        while (i < size) {
            h hVar = this.D.get(i);
            if (arrayList == null || hVar.f798a || (iIndexOf2 = arrayList.indexOf(hVar.f799b)) == -1 || !arrayList2.get(iIndexOf2).booleanValue()) {
                if ((hVar.f800c == 0) || (arrayList != null && hVar.f799b.f(arrayList, 0, arrayList.size()))) {
                    this.D.remove(i);
                    i--;
                    size--;
                    if (arrayList == null || hVar.f798a || (iIndexOf = arrayList.indexOf(hVar.f799b)) == -1 || !arrayList2.get(iIndexOf).booleanValue()) {
                        hVar.a();
                    }
                }
                i++;
            } else {
                this.D.remove(i);
                i--;
                size--;
            }
            a.j.a.a aVar = hVar.f799b;
            aVar.r.h(aVar, hVar.f798a, false, false);
            i++;
        }
    }

    public Fragment O(int i) {
        for (int size = this.f.size() - 1; size >= 0; size--) {
            Fragment fragment = this.f.get(size);
            if (fragment != null && fragment.w == i) {
                return fragment;
            }
        }
        for (Fragment fragment2 : this.g.values()) {
            if (fragment2 != null && fragment2.w == i) {
                return fragment2;
            }
        }
        return null;
    }

    public Fragment P(String str) {
        Fragment fragmentG;
        for (Fragment fragment : this.g.values()) {
            if (fragment != null && (fragmentG = fragment.g(str)) != null) {
                return fragmentG;
            }
        }
        return null;
    }

    public a.j.a.g Q() {
        if (this.f784b == null) {
            this.f784b = i.f783c;
        }
        if (this.f784b == i.f783c) {
            Fragment fragment = this.r;
            if (fragment != null) {
                return fragment.s.Q();
            }
            this.f784b = new c();
        }
        if (this.f784b == null) {
            this.f784b = i.f783c;
        }
        return this.f784b;
    }

    public final boolean R(Fragment fragment) {
        boolean z;
        j jVar = fragment.u;
        Iterator<Fragment> it = jVar.g.values().iterator();
        boolean zR = false;
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            }
            Fragment next = it.next();
            if (next != null) {
                zR = jVar.R(next);
            }
            if (zR) {
                z = true;
                break;
            }
        }
        return z;
    }

    public boolean S(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        j jVar = fragment.s;
        return fragment == jVar.s && S(jVar.r);
    }

    public boolean T() {
        return this.u || this.v;
    }

    /* JADX WARN: Removed duplicated region for block: B:158:0x0042 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public a.j.a.j.d U(androidx.fragment.app.Fragment r7, int r8, boolean r9, int r10) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 268
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a.j.a.j.U(androidx.fragment.app.Fragment, int, boolean, int):a.j.a.j$d");
    }

    public void V(Fragment fragment) {
        if (this.g.get(fragment.f) != null) {
            return;
        }
        this.g.put(fragment.f, fragment);
        if (fragment.C) {
            if (fragment.B) {
                if (!T()) {
                    this.E.f816b.add(fragment);
                }
            } else if (!T()) {
                this.E.f816b.remove(fragment);
            }
            fragment.C = false;
        }
    }

    public void X(Fragment fragment) {
        Animator animator;
        if (fragment != null && this.g.containsKey(fragment.f)) {
            int iMin = this.o;
            if (fragment.m) {
                iMin = fragment.u() ? Math.min(iMin, 1) : Math.min(iMin, 0);
            }
            Z(fragment, iMin, fragment.n(), fragment.o(), false);
            View view = fragment.G;
            if (view != null) {
                ViewGroup viewGroup = fragment.F;
                Fragment fragment2 = null;
                if (viewGroup != null && view != null) {
                    int iIndexOf = this.f.indexOf(fragment);
                    while (true) {
                        iIndexOf--;
                        if (iIndexOf < 0) {
                            break;
                        }
                        Fragment fragment3 = this.f.get(iIndexOf);
                        if (fragment3.F == viewGroup && fragment3.G != null) {
                            fragment2 = fragment3;
                            break;
                        }
                    }
                }
                if (fragment2 != null) {
                    View view2 = fragment2.G;
                    ViewGroup viewGroup2 = fragment.F;
                    int iIndexOfChild = viewGroup2.indexOfChild(view2);
                    int iIndexOfChild2 = viewGroup2.indexOfChild(fragment.G);
                    if (iIndexOfChild2 < iIndexOfChild) {
                        viewGroup2.removeViewAt(iIndexOfChild2);
                        viewGroup2.addView(fragment.G, iIndexOfChild);
                    }
                }
                if (fragment.L && fragment.F != null) {
                    float f2 = fragment.N;
                    if (f2 > 0.0f) {
                        fragment.G.setAlpha(f2);
                    }
                    fragment.N = 0.0f;
                    fragment.L = false;
                    d dVarU = U(fragment, fragment.n(), true, fragment.o());
                    if (dVarU != null) {
                        Animation animation = dVarU.f790a;
                        if (animation != null) {
                            fragment.G.startAnimation(animation);
                        } else {
                            dVarU.f791b.setTarget(fragment.G);
                            dVarU.f791b.start();
                        }
                    }
                }
            }
            if (fragment.M) {
                if (fragment.G != null) {
                    d dVarU2 = U(fragment, fragment.n(), !fragment.z, fragment.o());
                    if (dVarU2 == null || (animator = dVarU2.f791b) == null) {
                        if (dVarU2 != null) {
                            fragment.G.startAnimation(dVarU2.f790a);
                            dVarU2.f790a.start();
                        }
                        fragment.G.setVisibility((!fragment.z || fragment.t()) ? 0 : 8);
                        if (fragment.t()) {
                            fragment.F(false);
                        }
                    } else {
                        animator.setTarget(fragment.G);
                        if (!fragment.z) {
                            fragment.G.setVisibility(0);
                        } else if (fragment.t()) {
                            fragment.F(false);
                        } else {
                            ViewGroup viewGroup3 = fragment.F;
                            View view3 = fragment.G;
                            viewGroup3.startViewTransition(view3);
                            dVarU2.f791b.addListener(new m(this, viewGroup3, view3, fragment));
                        }
                        dVarU2.f791b.start();
                    }
                }
                if (fragment.l && R(fragment)) {
                    this.t = true;
                }
                fragment.M = false;
            }
        }
    }

    public void Y(int i, boolean z) {
        a.j.a.h hVar;
        if (this.p == null && i != 0) {
            throw new IllegalStateException("No activity");
        }
        if (z || i != this.o) {
            this.o = i;
            int size = this.f.size();
            for (int i2 = 0; i2 < size; i2++) {
                X(this.f.get(i2));
            }
            for (Fragment fragment : this.g.values()) {
                if (fragment != null && (fragment.m || fragment.A)) {
                    if (!fragment.L) {
                        X(fragment);
                    }
                }
            }
            j0();
            if (this.t && (hVar = this.p) != null && this.o == 4) {
                a.j.a.d.this.n();
                this.t = false;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:551:0x03c3  */
    /* JADX WARN: Removed duplicated region for block: B:555:0x03f6  */
    /* JADX WARN: Removed duplicated region for block: B:557:0x03f9  */
    /* JADX WARN: Removed duplicated region for block: B:620:0x0579  */
    /* JADX WARN: Removed duplicated region for block: B:702:0x0700  */
    /* JADX WARN: Removed duplicated region for block: B:713:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void Z(androidx.fragment.app.Fragment r17, int r18, int r19, int r20, boolean r21) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 1829
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a.j.a.j.Z(androidx.fragment.app.Fragment, int, int, int, boolean):void");
    }

    @Override // a.j.a.i
    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        int size3;
        String str2;
        String strB = b.a.a.a.a.b(str, "    ");
        if (!this.g.isEmpty()) {
            printWriter.print(str);
            printWriter.print("Active Fragments in ");
            printWriter.print(Integer.toHexString(System.identityHashCode(this)));
            printWriter.println(":");
            for (Fragment fragment : this.g.values()) {
                printWriter.print(str);
                printWriter.println(fragment);
                if (fragment != null) {
                    printWriter.print(strB);
                    printWriter.print("mFragmentId=#");
                    printWriter.print(Integer.toHexString(fragment.w));
                    printWriter.print(" mContainerId=#");
                    printWriter.print(Integer.toHexString(fragment.x));
                    printWriter.print(" mTag=");
                    printWriter.println(fragment.y);
                    printWriter.print(strB);
                    printWriter.print("mState=");
                    printWriter.print(fragment.f1042b);
                    printWriter.print(" mWho=");
                    printWriter.print(fragment.f);
                    printWriter.print(" mBackStackNesting=");
                    printWriter.println(fragment.r);
                    printWriter.print(strB);
                    printWriter.print("mAdded=");
                    printWriter.print(fragment.l);
                    printWriter.print(" mRemoving=");
                    printWriter.print(fragment.m);
                    printWriter.print(" mFromLayout=");
                    printWriter.print(fragment.n);
                    printWriter.print(" mInLayout=");
                    printWriter.println(fragment.o);
                    printWriter.print(strB);
                    printWriter.print("mHidden=");
                    printWriter.print(fragment.z);
                    printWriter.print(" mDetached=");
                    printWriter.print(fragment.A);
                    printWriter.print(" mMenuVisible=");
                    printWriter.print(fragment.D);
                    printWriter.print(" mHasMenu=");
                    printWriter.println(false);
                    printWriter.print(strB);
                    printWriter.print("mRetainInstance=");
                    printWriter.print(fragment.B);
                    printWriter.print(" mUserVisibleHint=");
                    printWriter.println(fragment.J);
                    if (fragment.s != null) {
                        printWriter.print(strB);
                        printWriter.print("mFragmentManager=");
                        printWriter.println(fragment.s);
                    }
                    if (fragment.t != null) {
                        printWriter.print(strB);
                        printWriter.print("mHost=");
                        printWriter.println(fragment.t);
                    }
                    if (fragment.v != null) {
                        printWriter.print(strB);
                        printWriter.print("mParentFragment=");
                        printWriter.println(fragment.v);
                    }
                    if (fragment.g != null) {
                        printWriter.print(strB);
                        printWriter.print("mArguments=");
                        printWriter.println(fragment.g);
                    }
                    if (fragment.f1043c != null) {
                        printWriter.print(strB);
                        printWriter.print("mSavedFragmentState=");
                        printWriter.println(fragment.f1043c);
                    }
                    if (fragment.f1044d != null) {
                        printWriter.print(strB);
                        printWriter.print("mSavedViewState=");
                        printWriter.println(fragment.f1044d);
                    }
                    Object obj = fragment.h;
                    if (obj == null) {
                        j jVar = fragment.s;
                        obj = (jVar == null || (str2 = fragment.i) == null) ? null : (Fragment) jVar.g.get(str2);
                    }
                    if (obj != null) {
                        printWriter.print(strB);
                        printWriter.print("mTarget=");
                        printWriter.print(obj);
                        printWriter.print(" mTargetRequestCode=");
                        printWriter.println(fragment.j);
                    }
                    if (fragment.m() != 0) {
                        printWriter.print(strB);
                        printWriter.print("mNextAnim=");
                        printWriter.println(fragment.m());
                    }
                    if (fragment.F != null) {
                        printWriter.print(strB);
                        printWriter.print("mContainer=");
                        printWriter.println(fragment.F);
                    }
                    if (fragment.G != null) {
                        printWriter.print(strB);
                        printWriter.print("mView=");
                        printWriter.println(fragment.G);
                    }
                    if (fragment.H != null) {
                        printWriter.print(strB);
                        printWriter.print("mInnerView=");
                        printWriter.println(fragment.G);
                    }
                    if (fragment.h() != null) {
                        printWriter.print(strB);
                        printWriter.print("mAnimatingAway=");
                        printWriter.println(fragment.h());
                        printWriter.print(strB);
                        printWriter.print("mStateAfterAnimating=");
                        printWriter.println(fragment.q());
                    }
                    a.j.a.h hVar = fragment.t;
                    if ((hVar != null ? hVar.f780c : null) != null) {
                        a.l.a.a.b(fragment).a(strB, fileDescriptor, printWriter, strArr);
                    }
                    printWriter.print(strB);
                    printWriter.println("Child " + fragment.u + ":");
                    fragment.u.a(b.a.a.a.a.b(strB, "  "), fileDescriptor, printWriter, strArr);
                }
            }
        }
        int size4 = this.f.size();
        if (size4 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i = 0; i < size4; i++) {
                Fragment fragment2 = this.f.get(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(fragment2.toString());
            }
        }
        ArrayList<Fragment> arrayList = this.i;
        if (arrayList != null && (size3 = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i2 = 0; i2 < size3; i2++) {
                Fragment fragment3 = this.i.get(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(fragment3.toString());
            }
        }
        ArrayList<a.j.a.a> arrayList2 = this.h;
        if (arrayList2 != null && (size2 = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i3 = 0; i3 < size2; i3++) {
                a.j.a.a aVar = this.h.get(i3);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(aVar.toString());
                aVar.b(strB, printWriter, true);
            }
        }
        synchronized (this) {
            if (this.l != null && (size = this.l.size()) > 0) {
                printWriter.print(str);
                printWriter.println("Back Stack Indices:");
                for (int i4 = 0; i4 < size; i4++) {
                    Object obj2 = (a.j.a.a) this.l.get(i4);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i4);
                    printWriter.print(": ");
                    printWriter.println(obj2);
                }
            }
            if (this.m != null && this.m.size() > 0) {
                printWriter.print(str);
                printWriter.print("mAvailBackStackIndices: ");
                printWriter.println(Arrays.toString(this.m.toArray()));
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.p);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.q);
        if (this.r != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.r);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.o);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.u);
        printWriter.print(" mStopped=");
        printWriter.print(this.v);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.w);
        if (this.t) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.t);
        }
    }

    public void a0() {
        this.u = false;
        this.v = false;
        int size = this.f.size();
        for (int i = 0; i < size; i++) {
            Fragment fragment = this.f.get(i);
            if (fragment != null) {
                fragment.u.a0();
            }
        }
    }

    @Override // a.j.a.i
    public boolean b() throws Resources.NotFoundException {
        boolean z;
        int size;
        if (T()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        L();
        K(true);
        Fragment fragment = this.s;
        if (fragment != null && fragment.j().b()) {
            return true;
        }
        ArrayList<a.j.a.a> arrayList = this.y;
        ArrayList<Boolean> arrayList2 = this.z;
        ArrayList<a.j.a.a> arrayList3 = this.h;
        if (arrayList3 != null && (size = arrayList3.size() - 1) >= 0) {
            arrayList.add(this.h.remove(size));
            arrayList2.add(Boolean.TRUE);
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f785d = true;
            try {
                c0(this.y, this.z);
            } finally {
                g();
            }
        }
        l0();
        if (this.x) {
            this.x = false;
            j0();
        }
        this.g.values().removeAll(Collections.singleton(null));
        return z;
    }

    public void b0(Fragment fragment) {
        boolean z = !fragment.u();
        if (!fragment.A || z) {
            synchronized (this.f) {
                this.f.remove(fragment);
            }
            if (R(fragment)) {
                this.t = true;
            }
            fragment.l = false;
            fragment.m = true;
        }
    }

    public final void c(a.e.c<Fragment> cVar) throws Resources.NotFoundException {
        int i = this.o;
        if (i < 1) {
            return;
        }
        int iMin = Math.min(i, 3);
        int size = this.f.size();
        for (int i2 = 0; i2 < size; i2++) {
            Fragment fragment = this.f.get(i2);
            if (fragment.f1042b < iMin) {
                Z(fragment, iMin, fragment.m(), fragment.n(), false);
                if (fragment.G != null && !fragment.z && fragment.L) {
                    cVar.add(fragment);
                }
            }
        }
    }

    public final void c0(ArrayList<a.j.a.a> arrayList, ArrayList<Boolean> arrayList2) throws Resources.NotFoundException {
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        if (arrayList2 == null || arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        N(arrayList, arrayList2);
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i < size) {
            if (!arrayList.get(i).p) {
                if (i2 != i) {
                    M(arrayList, arrayList2, i2, i);
                }
                i2 = i + 1;
                if (arrayList2.get(i).booleanValue()) {
                    while (i2 < size && arrayList2.get(i2).booleanValue() && !arrayList.get(i2).p) {
                        i2++;
                    }
                }
                M(arrayList, arrayList2, i, i2);
                i = i2 - 1;
            }
            i++;
        }
        if (i2 != size) {
            M(arrayList, arrayList2, i2, size);
        }
    }

    public void d(Fragment fragment, boolean z) {
        V(fragment);
        if (fragment.A) {
            return;
        }
        if (this.f.contains(fragment)) {
            throw new IllegalStateException("Fragment already added: " + fragment);
        }
        synchronized (this.f) {
            this.f.add(fragment);
        }
        fragment.l = true;
        fragment.m = false;
        if (fragment.G == null) {
            fragment.M = false;
        }
        if (R(fragment)) {
            this.t = true;
        }
        if (z) {
            Z(fragment, this.o, 0, 0, false);
        }
    }

    public void d0(Parcelable parcelable) throws Resources.NotFoundException {
        Fragment fragment;
        Bundle bundle;
        p next;
        if (parcelable == null) {
            return;
        }
        n nVar = (n) parcelable;
        if (nVar.f812b == null) {
            return;
        }
        for (Fragment fragment2 : this.E.f816b) {
            Iterator<p> it = nVar.f812b.iterator();
            while (true) {
                if (it.hasNext()) {
                    next = it.next();
                    if (next.f821c.equals(fragment2.f)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            if (next == null) {
                Z(fragment2, 1, 0, 0, false);
                fragment2.m = true;
                Z(fragment2, 0, 0, 0, false);
            } else {
                next.o = fragment2;
                fragment2.f1044d = null;
                fragment2.r = 0;
                fragment2.o = false;
                fragment2.l = false;
                Fragment fragment3 = fragment2.h;
                fragment2.i = fragment3 != null ? fragment3.f : null;
                fragment2.h = null;
                Bundle bundle2 = next.n;
                if (bundle2 != null) {
                    bundle2.setClassLoader(this.p.f780c.getClassLoader());
                    fragment2.f1044d = next.n.getSparseParcelableArray("android:view_state");
                    fragment2.f1043c = next.n;
                }
            }
        }
        this.g.clear();
        Iterator<p> it2 = nVar.f812b.iterator();
        while (it2.hasNext()) {
            p next2 = it2.next();
            if (next2 != null) {
                ClassLoader classLoader = this.p.f780c.getClassLoader();
                a.j.a.g gVarQ = Q();
                if (next2.o == null) {
                    Bundle bundle3 = next2.k;
                    if (bundle3 != null) {
                        bundle3.setClassLoader(classLoader);
                    }
                    Fragment fragmentA = gVarQ.a(classLoader, next2.f820b);
                    next2.o = fragmentA;
                    fragmentA.E(next2.k);
                    Bundle bundle4 = next2.n;
                    if (bundle4 != null) {
                        bundle4.setClassLoader(classLoader);
                        fragment = next2.o;
                        bundle = next2.n;
                    } else {
                        fragment = next2.o;
                        bundle = new Bundle();
                    }
                    fragment.f1043c = bundle;
                    Fragment fragment4 = next2.o;
                    fragment4.f = next2.f821c;
                    fragment4.n = next2.f822d;
                    fragment4.p = true;
                    fragment4.w = next2.f823e;
                    fragment4.x = next2.f;
                    fragment4.y = next2.g;
                    fragment4.B = next2.h;
                    fragment4.m = next2.i;
                    fragment4.A = next2.j;
                    fragment4.z = next2.l;
                    fragment4.Q = d.b.values()[next2.m];
                }
                Fragment fragment5 = next2.o;
                fragment5.s = this;
                this.g.put(fragment5.f, fragment5);
                next2.o = null;
            }
        }
        this.f.clear();
        ArrayList<String> arrayList = nVar.f813c;
        if (arrayList != null) {
            Iterator<String> it3 = arrayList.iterator();
            while (it3.hasNext()) {
                String next3 = it3.next();
                Fragment fragment6 = this.g.get(next3);
                if (fragment6 == null) {
                    k0(new IllegalStateException(b.a.a.a.a.c("No instantiated fragment for (", next3, ")")));
                    throw null;
                }
                fragment6.l = true;
                if (this.f.contains(fragment6)) {
                    throw new IllegalStateException("Already added " + fragment6);
                }
                synchronized (this.f) {
                    this.f.add(fragment6);
                }
            }
        }
        if (nVar.f814d != null) {
            this.h = new ArrayList<>(nVar.f814d.length);
            int i = 0;
            while (true) {
                a.j.a.b[] bVarArr = nVar.f814d;
                if (i >= bVarArr.length) {
                    break;
                }
                a.j.a.b bVar = bVarArr[i];
                if (bVar == null) {
                    throw null;
                }
                a.j.a.a aVar = new a.j.a.a(this);
                int i2 = 0;
                int i3 = 0;
                while (i2 < bVar.f767b.length) {
                    q.a aVar2 = new q.a();
                    int i4 = i2 + 1;
                    aVar2.f829a = bVar.f767b[i2];
                    String str = bVar.f768c.get(i3);
                    aVar2.f830b = str != null ? this.g.get(str) : null;
                    aVar2.g = d.b.values()[bVar.f769d[i3]];
                    aVar2.h = d.b.values()[bVar.f770e[i3]];
                    int[] iArr = bVar.f767b;
                    int i5 = i4 + 1;
                    int i6 = iArr[i4];
                    aVar2.f831c = i6;
                    int i7 = i5 + 1;
                    int i8 = iArr[i5];
                    aVar2.f832d = i8;
                    int i9 = i7 + 1;
                    int i10 = iArr[i7];
                    aVar2.f833e = i10;
                    int i11 = iArr[i9];
                    aVar2.f = i11;
                    aVar.f825b = i6;
                    aVar.f826c = i8;
                    aVar.f827d = i10;
                    aVar.f828e = i11;
                    aVar.f824a.add(aVar2);
                    aVar2.f831c = aVar.f825b;
                    aVar2.f832d = aVar.f826c;
                    aVar2.f833e = aVar.f827d;
                    aVar2.f = aVar.f828e;
                    i3++;
                    i2 = i9 + 1;
                }
                aVar.f = bVar.f;
                aVar.g = bVar.g;
                aVar.i = bVar.h;
                aVar.s = bVar.i;
                aVar.h = true;
                aVar.j = bVar.j;
                aVar.k = bVar.k;
                aVar.l = bVar.l;
                aVar.m = bVar.m;
                aVar.n = bVar.n;
                aVar.o = bVar.o;
                aVar.p = bVar.p;
                aVar.a(1);
                this.h.add(aVar);
                int i12 = aVar.s;
                if (i12 >= 0) {
                    synchronized (this) {
                        if (this.l == null) {
                            this.l = new ArrayList<>();
                        }
                        int size = this.l.size();
                        if (i12 < size) {
                            this.l.set(i12, aVar);
                        } else {
                            while (size < i12) {
                                this.l.add(null);
                                if (this.m == null) {
                                    this.m = new ArrayList<>();
                                }
                                this.m.add(Integer.valueOf(size));
                                size++;
                            }
                            this.l.add(aVar);
                        }
                    }
                }
                i++;
            }
        } else {
            this.h = null;
        }
        String str2 = nVar.f815e;
        if (str2 != null) {
            Fragment fragment7 = this.g.get(str2);
            this.s = fragment7;
            G(fragment7);
        }
        this.f786e = nVar.f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void e(a.j.a.h hVar, a.j.a.e eVar, Fragment fragment) {
        if (this.p != null) {
            throw new IllegalStateException("Already attached");
        }
        this.p = hVar;
        this.q = eVar;
        this.r = fragment;
        if (fragment != null) {
            l0();
        }
        if (hVar instanceof a.a.c) {
            a.a.c cVar = (a.a.c) hVar;
            this.j = cVar.c();
            Fragment fragment2 = cVar;
            if (fragment != null) {
                fragment2 = fragment;
            }
            OnBackPressedDispatcher onBackPressedDispatcher = this.j;
            a.a.b bVar = this.k;
            if (onBackPressedDispatcher == null) {
                throw null;
            }
            a.k.d dVarA = fragment2.a();
            if (((a.k.h) dVarA).f876b != d.b.DESTROYED) {
                bVar.f1b.add(onBackPressedDispatcher.new LifecycleOnBackPressedCancellable(dVarA, bVar));
            }
        }
        if (fragment != null) {
            o oVar = fragment.s.E;
            o oVar2 = oVar.f817c.get(fragment.f);
            if (oVar2 == null) {
                oVar2 = new o(oVar.f819e);
                oVar.f817c.put(fragment.f, oVar2);
            }
            this.E = oVar2;
            return;
        }
        if (!(hVar instanceof a.k.t)) {
            this.E = new o(false);
            return;
        }
        a.k.s sVarE = ((a.k.t) hVar).e();
        a.k.q qVar = o.h;
        String canonicalName = o.class.getCanonicalName();
        if (canonicalName == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        String strB = b.a.a.a.a.b("androidx.lifecycle.ViewModelProvider.DefaultKey:", canonicalName);
        a.k.p pVarA = sVarE.f886a.get(strB);
        if (!o.class.isInstance(pVarA)) {
            pVarA = qVar instanceof a.k.r ? ((a.k.r) qVar).a(strB, o.class) : ((o.a) qVar).a(o.class);
            a.k.p pVarPut = sVarE.f886a.put(strB, pVarA);
            if (pVarPut != null) {
                pVarPut.a();
            }
        }
        this.E = (o) pVarA;
    }

    public void f(Fragment fragment) {
        if (fragment.A) {
            fragment.A = false;
            if (fragment.l) {
                return;
            }
            if (this.f.contains(fragment)) {
                throw new IllegalStateException("Fragment already added: " + fragment);
            }
            synchronized (this.f) {
                this.f.add(fragment);
            }
            fragment.l = true;
            if (R(fragment)) {
                this.t = true;
            }
        }
    }

    public Parcelable f0() throws Resources.NotFoundException {
        a.j.a.b[] bVarArr;
        ArrayList<String> arrayList;
        int size;
        Bundle bundle;
        if (this.D != null) {
            while (!this.D.isEmpty()) {
                this.D.remove(0).a();
            }
        }
        Iterator<Fragment> it = this.g.values().iterator();
        while (true) {
            bVarArr = null;
            if (!it.hasNext()) {
                break;
            }
            Fragment next = it.next();
            if (next != null) {
                if (next.h() != null) {
                    int iQ = next.q();
                    View viewH = next.h();
                    Animation animation = viewH.getAnimation();
                    if (animation != null) {
                        animation.cancel();
                        viewH.clearAnimation();
                    }
                    next.C(null);
                    Z(next, iQ, 0, 0, false);
                } else if (next.i() != null) {
                    next.i().end();
                }
            }
        }
        L();
        this.u = true;
        if (this.g.isEmpty()) {
            return null;
        }
        ArrayList<p> arrayList2 = new ArrayList<>(this.g.size());
        boolean z = false;
        for (Fragment fragment : this.g.values()) {
            if (fragment != null) {
                if (fragment.s != this) {
                    k0(new IllegalStateException("Failure saving state: active " + fragment + " was removed from the FragmentManager"));
                    throw null;
                }
                p pVar = new p(fragment);
                arrayList2.add(pVar);
                if (fragment.f1042b <= 0 || pVar.n != null) {
                    pVar.n = fragment.f1043c;
                } else {
                    if (this.B == null) {
                        this.B = new Bundle();
                    }
                    Bundle bundle2 = this.B;
                    fragment.U.b(bundle2);
                    Parcelable parcelableF0 = fragment.u.f0();
                    if (parcelableF0 != null) {
                        bundle2.putParcelable("android:support:fragments", parcelableF0);
                    }
                    z(fragment, this.B, false);
                    if (this.B.isEmpty()) {
                        bundle = null;
                    } else {
                        bundle = this.B;
                        this.B = null;
                    }
                    if (fragment.G != null) {
                        g0(fragment);
                    }
                    if (fragment.f1044d != null) {
                        if (bundle == null) {
                            bundle = new Bundle();
                        }
                        bundle.putSparseParcelableArray("android:view_state", fragment.f1044d);
                    }
                    if (!fragment.J) {
                        if (bundle == null) {
                            bundle = new Bundle();
                        }
                        bundle.putBoolean("android:user_visible_hint", fragment.J);
                    }
                    pVar.n = bundle;
                    String str = fragment.i;
                    if (str != null) {
                        Fragment fragment2 = this.g.get(str);
                        if (fragment2 == null) {
                            k0(new IllegalStateException("Failure saving state: " + fragment + " has target not in fragment manager: " + fragment.i));
                            throw null;
                        }
                        if (pVar.n == null) {
                            pVar.n = new Bundle();
                        }
                        Bundle bundle3 = pVar.n;
                        if (fragment2.s != this) {
                            k0(new IllegalStateException("Fragment " + fragment2 + " is not currently in the FragmentManager"));
                            throw null;
                        }
                        bundle3.putString("android:target_state", fragment2.f);
                        int i = fragment.j;
                        if (i != 0) {
                            pVar.n.putInt("android:target_req_state", i);
                        }
                    }
                }
                z = true;
            }
        }
        if (!z) {
            return null;
        }
        int size2 = this.f.size();
        if (size2 > 0) {
            arrayList = new ArrayList<>(size2);
            Iterator<Fragment> it2 = this.f.iterator();
            while (it2.hasNext()) {
                Fragment next2 = it2.next();
                arrayList.add(next2.f);
                if (next2.s != this) {
                    k0(new IllegalStateException("Failure saving state: active " + next2 + " was removed from the FragmentManager"));
                    throw null;
                }
            }
        } else {
            arrayList = null;
        }
        ArrayList<a.j.a.a> arrayList3 = this.h;
        if (arrayList3 != null && (size = arrayList3.size()) > 0) {
            bVarArr = new a.j.a.b[size];
            for (int i2 = 0; i2 < size; i2++) {
                bVarArr[i2] = new a.j.a.b(this.h.get(i2));
            }
        }
        n nVar = new n();
        nVar.f812b = arrayList2;
        nVar.f813c = arrayList;
        nVar.f814d = bVarArr;
        Fragment fragment3 = this.s;
        if (fragment3 != null) {
            nVar.f815e = fragment3.f;
        }
        nVar.f = this.f786e;
        return nVar;
    }

    public final void g() {
        this.f785d = false;
        this.z.clear();
        this.y.clear();
    }

    public void g0(Fragment fragment) {
        if (fragment.H == null) {
            return;
        }
        SparseArray<Parcelable> sparseArray = this.C;
        if (sparseArray == null) {
            this.C = new SparseArray<>();
        } else {
            sparseArray.clear();
        }
        fragment.H.saveHierarchyState(this.C);
        if (this.C.size() > 0) {
            fragment.f1044d = this.C;
            this.C = null;
        }
    }

    public void h(a.j.a.a aVar, boolean z, boolean z2, boolean z3) {
        if (z) {
            aVar.d(z3);
        } else {
            aVar.c();
        }
        ArrayList arrayList = new ArrayList(1);
        ArrayList arrayList2 = new ArrayList(1);
        arrayList.add(aVar);
        arrayList2.add(Boolean.valueOf(z));
        if (z2) {
            v.p(this, arrayList, arrayList2, 0, 1, true);
        }
        if (z3) {
            Y(this.o, true);
        }
        for (Fragment fragment : this.g.values()) {
            if (fragment != null && fragment.G != null && fragment.L && aVar.e(fragment.x)) {
                float f2 = fragment.N;
                if (f2 > 0.0f) {
                    fragment.G.setAlpha(f2);
                }
                if (z3) {
                    fragment.N = 0.0f;
                } else {
                    fragment.N = -1.0f;
                    fragment.L = false;
                }
            }
        }
    }

    public void h0(Fragment fragment, d.b bVar) {
        if (this.g.get(fragment.f) == fragment && (fragment.t == null || fragment.s == this)) {
            fragment.Q = bVar;
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    public void i(Fragment fragment) {
        if (fragment.A) {
            return;
        }
        fragment.A = true;
        if (fragment.l) {
            synchronized (this.f) {
                this.f.remove(fragment);
            }
            if (R(fragment)) {
                this.t = true;
            }
            fragment.l = false;
        }
    }

    public void i0(Fragment fragment) {
        if (fragment == null || (this.g.get(fragment.f) == fragment && (fragment.t == null || fragment.s == this))) {
            Fragment fragment2 = this.s;
            this.s = fragment;
            G(fragment2);
            G(this.s);
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    public void j(Configuration configuration) {
        for (int i = 0; i < this.f.size(); i++) {
            Fragment fragment = this.f.get(i);
            if (fragment != null) {
                fragment.E = true;
                fragment.u.j(configuration);
            }
        }
    }

    public void j0() throws Resources.NotFoundException {
        for (Fragment fragment : this.g.values()) {
            if (fragment != null && fragment.I) {
                if (this.f785d) {
                    this.x = true;
                } else {
                    fragment.I = false;
                    Z(fragment, this.o, 0, 0, false);
                }
            }
        }
    }

    public boolean k(MenuItem menuItem) {
        if (this.o < 1) {
            return false;
        }
        for (int i = 0; i < this.f.size(); i++) {
            Fragment fragment = this.f.get(i);
            if (fragment != null) {
                if (!fragment.z && fragment.u.k(menuItem)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void k0(RuntimeException runtimeException) {
        runtimeException.getMessage();
        PrintWriter printWriter = new PrintWriter(new a.g.i.a("FragmentManager"));
        a.j.a.h hVar = this.p;
        try {
            if (hVar != null) {
                a.j.a.d.this.dump("  ", null, printWriter, new String[0]);
            } else {
                a("  ", null, printWriter, new String[0]);
            }
            throw runtimeException;
        } catch (Exception unused) {
            throw runtimeException;
        }
    }

    public void l() {
        this.u = false;
        this.v = false;
        J(1);
    }

    public final void l0() {
        a.a.b bVar = this.k;
        ArrayList<a.j.a.a> arrayList = this.h;
        boolean z = false;
        if ((arrayList != null ? arrayList.size() : 0) > 0 && S(this.r)) {
            z = true;
        }
        bVar.f0a = z;
    }

    public boolean m(Menu menu, MenuInflater menuInflater) {
        if (this.o < 1) {
            return false;
        }
        ArrayList<Fragment> arrayList = null;
        boolean z = false;
        for (int i = 0; i < this.f.size(); i++) {
            Fragment fragment = this.f.get(i);
            if (fragment != null && fragment.w(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(fragment);
                z = true;
            }
        }
        if (this.i != null) {
            for (int i2 = 0; i2 < this.i.size(); i2++) {
                Fragment fragment2 = this.i.get(i2);
                if ((arrayList == null || !arrayList.contains(fragment2)) && fragment2 == null) {
                    throw null;
                }
            }
        }
        this.i = arrayList;
        return z;
    }

    public void n() {
        this.w = true;
        L();
        J(0);
        this.p = null;
        this.q = null;
        this.r = null;
        if (this.j != null) {
            Iterator<a.a.a> it = this.k.f1b.iterator();
            while (it.hasNext()) {
                it.next().cancel();
            }
            this.j = null;
        }
    }

    public void o() {
        for (int i = 0; i < this.f.size(); i++) {
            Fragment fragment = this.f.get(i);
            if (fragment != null) {
                fragment.z();
            }
        }
    }

    @Override // android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        Fragment next;
        Fragment fragment = null;
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue(null, "class");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.f797a);
        if (attributeValue == null) {
            attributeValue = typedArrayObtainStyledAttributes.getString(0);
        }
        String str2 = attributeValue;
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(1, -1);
        String string = typedArrayObtainStyledAttributes.getString(2);
        typedArrayObtainStyledAttributes.recycle();
        if (str2 == null || !a.j.a.g.b(context.getClassLoader(), str2)) {
            return null;
        }
        int id = view != null ? view.getId() : 0;
        if (id == -1 && resourceId == -1 && string == null) {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + str2);
        }
        Fragment fragmentO = resourceId != -1 ? O(resourceId) : null;
        if (fragmentO == null && string != null) {
            int size = this.f.size() - 1;
            while (true) {
                if (size >= 0) {
                    next = this.f.get(size);
                    if (next != null && string.equals(next.y)) {
                        break;
                    }
                    size--;
                } else {
                    Iterator<Fragment> it = this.g.values().iterator();
                    while (it.hasNext()) {
                        next = it.next();
                        if (next == null || !string.equals(next.y)) {
                        }
                    }
                }
            }
            fragment = next;
            fragmentO = fragment;
        }
        if (fragmentO == null && id != -1) {
            fragmentO = O(id);
        }
        if (fragmentO == null) {
            fragmentO = Q().a(context.getClassLoader(), str2);
            fragmentO.n = true;
            fragmentO.w = resourceId != 0 ? resourceId : id;
            fragmentO.x = id;
            fragmentO.y = string;
            fragmentO.o = true;
            fragmentO.s = this;
            a.j.a.h hVar = this.p;
            fragmentO.t = hVar;
            Context context2 = hVar.f780c;
            fragmentO.v(attributeSet, fragmentO.f1043c);
            d(fragmentO, true);
        } else {
            if (fragmentO.o) {
                throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + str2);
            }
            fragmentO.o = true;
            a.j.a.h hVar2 = this.p;
            fragmentO.t = hVar2;
            Context context3 = hVar2.f780c;
            fragmentO.v(attributeSet, fragmentO.f1043c);
        }
        Fragment fragment2 = fragmentO;
        if (this.o >= 1 || !fragment2.n) {
            Z(fragment2, this.o, 0, 0, false);
        } else {
            Z(fragment2, 1, 0, 0, false);
        }
        View view2 = fragment2.G;
        if (view2 == null) {
            throw new IllegalStateException(b.a.a.a.a.c("Fragment ", str2, " did not create a view."));
        }
        if (resourceId != 0) {
            view2.setId(resourceId);
        }
        if (fragment2.G.getTag() == null) {
            fragment2.G.setTag(string);
        }
        return fragment2.G;
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    public void p(boolean z) {
        int size = this.f.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            Fragment fragment = this.f.get(size);
            if (fragment != null) {
                fragment.u.p(z);
            }
        }
    }

    public void q(Fragment fragment, Bundle bundle, boolean z) {
        Fragment fragment2 = this.r;
        if (fragment2 != null) {
            j jVar = fragment2.s;
            if (jVar instanceof j) {
                jVar.q(fragment, bundle, true);
            }
        }
        Iterator<f> it = this.n.iterator();
        while (it.hasNext()) {
            f next = it.next();
            if (!z || next.f796a) {
                throw null;
            }
        }
    }

    public void r(Fragment fragment, Context context, boolean z) {
        Fragment fragment2 = this.r;
        if (fragment2 != null) {
            j jVar = fragment2.s;
            if (jVar instanceof j) {
                jVar.r(fragment, context, true);
            }
        }
        Iterator<f> it = this.n.iterator();
        while (it.hasNext()) {
            f next = it.next();
            if (!z || next.f796a) {
                throw null;
            }
        }
    }

    public void s(Fragment fragment, Bundle bundle, boolean z) {
        Fragment fragment2 = this.r;
        if (fragment2 != null) {
            j jVar = fragment2.s;
            if (jVar instanceof j) {
                jVar.s(fragment, bundle, true);
            }
        }
        Iterator<f> it = this.n.iterator();
        while (it.hasNext()) {
            f next = it.next();
            if (!z || next.f796a) {
                throw null;
            }
        }
    }

    public void t(Fragment fragment, boolean z) {
        Fragment fragment2 = this.r;
        if (fragment2 != null) {
            j jVar = fragment2.s;
            if (jVar instanceof j) {
                jVar.t(fragment, true);
            }
        }
        Iterator<f> it = this.n.iterator();
        while (it.hasNext()) {
            f next = it.next();
            if (!z || next.f796a) {
                throw null;
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        Object obj = this.r;
        if (obj == null) {
            obj = this.p;
        }
        h.i.i(obj, sb);
        sb.append("}}");
        return sb.toString();
    }

    public void u(Fragment fragment, boolean z) {
        Fragment fragment2 = this.r;
        if (fragment2 != null) {
            j jVar = fragment2.s;
            if (jVar instanceof j) {
                jVar.u(fragment, true);
            }
        }
        Iterator<f> it = this.n.iterator();
        while (it.hasNext()) {
            f next = it.next();
            if (!z || next.f796a) {
                throw null;
            }
        }
    }

    public void v(Fragment fragment, boolean z) {
        Fragment fragment2 = this.r;
        if (fragment2 != null) {
            j jVar = fragment2.s;
            if (jVar instanceof j) {
                jVar.v(fragment, true);
            }
        }
        Iterator<f> it = this.n.iterator();
        while (it.hasNext()) {
            f next = it.next();
            if (!z || next.f796a) {
                throw null;
            }
        }
    }

    public void w(Fragment fragment, Context context, boolean z) {
        Fragment fragment2 = this.r;
        if (fragment2 != null) {
            j jVar = fragment2.s;
            if (jVar instanceof j) {
                jVar.w(fragment, context, true);
            }
        }
        Iterator<f> it = this.n.iterator();
        while (it.hasNext()) {
            f next = it.next();
            if (!z || next.f796a) {
                throw null;
            }
        }
    }

    public void x(Fragment fragment, Bundle bundle, boolean z) {
        Fragment fragment2 = this.r;
        if (fragment2 != null) {
            j jVar = fragment2.s;
            if (jVar instanceof j) {
                jVar.x(fragment, bundle, true);
            }
        }
        Iterator<f> it = this.n.iterator();
        while (it.hasNext()) {
            f next = it.next();
            if (!z || next.f796a) {
                throw null;
            }
        }
    }

    public void y(Fragment fragment, boolean z) {
        Fragment fragment2 = this.r;
        if (fragment2 != null) {
            j jVar = fragment2.s;
            if (jVar instanceof j) {
                jVar.y(fragment, true);
            }
        }
        Iterator<f> it = this.n.iterator();
        while (it.hasNext()) {
            f next = it.next();
            if (!z || next.f796a) {
                throw null;
            }
        }
    }

    public void z(Fragment fragment, Bundle bundle, boolean z) {
        Fragment fragment2 = this.r;
        if (fragment2 != null) {
            j jVar = fragment2.s;
            if (jVar instanceof j) {
                jVar.z(fragment, bundle, true);
            }
        }
        Iterator<f> it = this.n.iterator();
        while (it.hasNext()) {
            f next = it.next();
            if (!z || next.f796a) {
                throw null;
            }
        }
    }
}
