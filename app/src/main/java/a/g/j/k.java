package a.g.j;

import a.g.j.s;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class k {

    /* renamed from: a */
    public static WeakHashMap<View, o> f695a;

    /* renamed from: b */
    public static Field f696b;

    /* renamed from: c */
    public static boolean f697c;

    public class a implements View.OnApplyWindowInsetsListener {

        /* renamed from: a */
        public final /* synthetic */ i f698a;

        public a(i iVar) {
            this.f698a = iVar;
        }

        @Override // android.view.View.OnApplyWindowInsetsListener
        public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            if (windowInsets == null) {
                throw null;
            }
            s sVar = new s(windowInsets);
            a.b.k.i iVar = (a.b.k.i) this.f698a;
            if (iVar == null) {
                throw null;
            }
            int iD = sVar.d();
            int iN = iVar.f34a.N(sVar, null);
            if (iD != iN) {
                int iB = sVar.b();
                int iC = sVar.c();
                int iA = sVar.a();
                s.c bVar = Build.VERSION.SDK_INT >= 29 ? new s.b(sVar) : new s.a(sVar);
                bVar.c(a.g.e.b.a(iB, iN, iC, iA));
                sVar = bVar.a();
            }
            return k.o(view, sVar).g();
        }
    }

    public static abstract class b<T> {

        /* renamed from: a */
        public final int f699a;

        /* renamed from: b */
        public final Class<T> f700b;

        /* renamed from: c */
        public final int f701c;

        public b(int i, Class<T> cls, int i2) {
            this.f699a = i;
            this.f700b = cls;
            this.f701c = i2;
        }

        public b(int i, Class<T> cls, int i2, int i3) {
            this.f699a = i;
            this.f700b = cls;
            this.f701c = i3;
        }

        public abstract T a(View view);

        public T b(View view) {
            if (Build.VERSION.SDK_INT >= this.f701c) {
                return a(view);
            }
            T t = (T) view.getTag(this.f699a);
            if (this.f700b.isInstance(t)) {
                return t;
            }
            return null;
        }
    }

    public interface c {
        boolean a(View view, KeyEvent keyEvent);
    }

    public static class d {

        /* renamed from: d */
        public static final ArrayList<WeakReference<View>> f702d = new ArrayList<>();

        /* renamed from: a */
        public WeakHashMap<View, Boolean> f703a = null;

        /* renamed from: b */
        public SparseArray<WeakReference<View>> f704b = null;

        /* renamed from: c */
        public WeakReference<KeyEvent> f705c = null;

        public static d a(View view) {
            d dVar = (d) view.getTag(a.g.a.tag_unhandled_key_event_manager);
            if (dVar != null) {
                return dVar;
            }
            d dVar2 = new d();
            view.setTag(a.g.a.tag_unhandled_key_event_manager, dVar2);
            return dVar2;
        }

        public final View b(View view, KeyEvent keyEvent) {
            WeakHashMap<View, Boolean> weakHashMap = this.f703a;
            if (weakHashMap != null && weakHashMap.containsKey(view)) {
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                        View viewB = b(viewGroup.getChildAt(childCount), keyEvent);
                        if (viewB != null) {
                            return viewB;
                        }
                    }
                }
                if (c(view, keyEvent)) {
                    return view;
                }
            }
            return null;
        }

        public final boolean c(View view, KeyEvent keyEvent) {
            ArrayList arrayList = (ArrayList) view.getTag(a.g.a.tag_unhandled_key_listeners);
            if (arrayList == null) {
                return false;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (((c) arrayList.get(size)).a(view, keyEvent)) {
                    return true;
                }
            }
            return false;
        }
    }

    static {
        new AtomicInteger(1);
        f695a = null;
        f697c = false;
        new WeakHashMap();
    }

    public static void A(View view) {
        view.stopNestedScroll();
    }

    public static o a(View view) {
        if (f695a == null) {
            f695a = new WeakHashMap<>();
        }
        o oVar = f695a.get(view);
        if (oVar != null) {
            return oVar;
        }
        o oVar2 = new o(view);
        f695a.put(view, oVar2);
        return oVar2;
    }

    public static s b(View view, s sVar, Rect rect) {
        WindowInsets windowInsetsG = sVar.g();
        if (windowInsetsG != null) {
            return s.h(view.computeSystemWindowInsets(windowInsetsG, rect));
        }
        rect.setEmpty();
        return sVar;
    }

    public static boolean c(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        d dVarA = d.a(view);
        if (keyEvent.getAction() == 0) {
            WeakHashMap<View, Boolean> weakHashMap = dVarA.f703a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            if (!d.f702d.isEmpty()) {
                synchronized (d.f702d) {
                    if (dVarA.f703a == null) {
                        dVarA.f703a = new WeakHashMap<>();
                    }
                    int size = d.f702d.size();
                    while (true) {
                        size--;
                        if (size < 0) {
                            break;
                        }
                        View view2 = d.f702d.get(size).get();
                        if (view2 == null) {
                            d.f702d.remove(size);
                        } else {
                            dVarA.f703a.put(view2, Boolean.TRUE);
                            for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                dVarA.f703a.put((View) parent, Boolean.TRUE);
                            }
                        }
                    }
                }
            }
        }
        View viewB = dVarA.b(view, keyEvent);
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (viewB != null && !KeyEvent.isModifierKey(keyCode)) {
                if (dVarA.f704b == null) {
                    dVarA.f704b = new SparseArray<>();
                }
                dVarA.f704b.put(keyCode, new WeakReference<>(viewB));
            }
        }
        return viewB != null;
    }

    public static boolean d(View view, KeyEvent keyEvent) {
        int iIndexOfKey;
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        d dVarA = d.a(view);
        WeakReference<KeyEvent> weakReference = dVarA.f705c;
        if (weakReference != null && weakReference.get() == keyEvent) {
            return false;
        }
        dVarA.f705c = new WeakReference<>(keyEvent);
        WeakReference<View> weakReferenceValueAt = null;
        if (dVarA.f704b == null) {
            dVarA.f704b = new SparseArray<>();
        }
        SparseArray<WeakReference<View>> sparseArray = dVarA.f704b;
        if (keyEvent.getAction() == 1 && (iIndexOfKey = sparseArray.indexOfKey(keyEvent.getKeyCode())) >= 0) {
            weakReferenceValueAt = sparseArray.valueAt(iIndexOfKey);
            sparseArray.removeAt(iIndexOfKey);
        }
        if (weakReferenceValueAt == null) {
            weakReferenceValueAt = sparseArray.get(keyEvent.getKeyCode());
        }
        if (weakReferenceValueAt == null) {
            return false;
        }
        View view2 = weakReferenceValueAt.get();
        if (view2 != null && view2.isAttachedToWindow()) {
            dVarA.c(view2, keyEvent);
        }
        return true;
    }

    public static ColorStateList e(View view) {
        return view.getBackgroundTintList();
    }

    public static int f(View view) {
        return view.getLayoutDirection();
    }

    public static int g(View view) {
        return view.getMinimumHeight();
    }

    public static s h(View view) {
        return s.h(view.getRootWindowInsets());
    }

    public static String i(View view) {
        return view.getTransitionName();
    }

    public static int j(View view) {
        return view.getWindowSystemUiVisibility();
    }

    public static boolean k(View view) {
        return view.hasOnClickListeners();
    }

    public static boolean l(View view) {
        return view.isAttachedToWindow();
    }

    public static boolean m(View view) {
        return view.isLaidOut();
    }

    public static boolean n(View view) {
        Boolean boolB = new l(a.g.a.tag_screen_reader_focusable, Boolean.class, 28).b(view);
        if (boolB == null) {
            return false;
        }
        return boolB.booleanValue();
    }

    public static s o(View view, s sVar) {
        WindowInsets windowInsetsG = sVar.g();
        if (windowInsetsG == null) {
            return sVar;
        }
        WindowInsets windowInsetsOnApplyWindowInsets = view.onApplyWindowInsets(windowInsetsG);
        return !windowInsetsOnApplyWindowInsets.equals(windowInsetsG) ? new s(windowInsetsOnApplyWindowInsets) : sVar;
    }

    public static void p(View view) {
        view.postInvalidateOnAnimation();
    }

    public static void q(View view, Runnable runnable) {
        view.postOnAnimation(runnable);
    }

    public static void r(View view, Runnable runnable, long j) {
        view.postOnAnimationDelayed(runnable, j);
    }

    public static void s(View view) {
        view.requestApplyInsets();
    }

    public static void t(View view, @SuppressLint({"ContextFirst"}) Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i, int i2) {
        if (Build.VERSION.SDK_INT >= 29) {
            view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void u(android.view.View r4, a.g.j.a r5) {
        /*
            r0 = 0
            if (r5 != 0) goto L3e
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 29
            if (r1 < r2) goto Le
            android.view.View$AccessibilityDelegate r1 = r4.getAccessibilityDelegate()
            goto L35
        Le:
            boolean r1 = a.g.j.k.f697c
            if (r1 == 0) goto L13
            goto L34
        L13:
            java.lang.reflect.Field r1 = a.g.j.k.f696b
            r2 = 1
            if (r1 != 0) goto L25
            java.lang.Class<android.view.View> r1 = android.view.View.class
            java.lang.String r3 = "mAccessibilityDelegate"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r3)     // Catch: java.lang.Throwable -> L32
            a.g.j.k.f696b = r1     // Catch: java.lang.Throwable -> L32
            r1.setAccessible(r2)     // Catch: java.lang.Throwable -> L32
        L25:
            java.lang.reflect.Field r1 = a.g.j.k.f696b     // Catch: java.lang.Throwable -> L32
            java.lang.Object r1 = r1.get(r4)     // Catch: java.lang.Throwable -> L32
            boolean r3 = r1 instanceof android.view.View.AccessibilityDelegate     // Catch: java.lang.Throwable -> L32
            if (r3 == 0) goto L34
            android.view.View$AccessibilityDelegate r1 = (android.view.View.AccessibilityDelegate) r1     // Catch: java.lang.Throwable -> L32
            goto L35
        L32:
            a.g.j.k.f697c = r2
        L34:
            r1 = r0
        L35:
            boolean r1 = r1 instanceof a.g.j.a.C0015a
            if (r1 == 0) goto L3e
            a.g.j.a r5 = new a.g.j.a
            r5.<init>()
        L3e:
            if (r5 != 0) goto L41
            goto L43
        L41:
            android.view.View$AccessibilityDelegate r0 = r5.f677b
        L43:
            r4.setAccessibilityDelegate(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a.g.j.k.u(android.view.View, a.g.j.a):void");
    }

    public static void v(View view, Drawable drawable) {
        view.setBackground(drawable);
    }

    public static void w(View view, float f) {
        view.setElevation(f);
    }

    public static void x(View view, i iVar) {
        view.setOnApplyWindowInsetsListener(new a(iVar));
    }

    public static void y(View view, int i, int i2) {
        view.setScrollIndicators(i, i2);
    }

    public static void z(View view, String str) {
        view.setTransitionName(str);
    }
}
