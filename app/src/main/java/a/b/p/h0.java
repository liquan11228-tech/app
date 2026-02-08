package a.b.p;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;

/* loaded from: classes.dex */
public abstract class h0 implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* renamed from: b, reason: collision with root package name */
    public final float f229b;

    /* renamed from: c, reason: collision with root package name */
    public final int f230c;

    /* renamed from: d, reason: collision with root package name */
    public final int f231d;

    /* renamed from: e, reason: collision with root package name */
    public final View f232e;
    public Runnable f;
    public Runnable g;
    public boolean h;
    public int i;
    public final int[] j = new int[2];

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewParent parent = h0.this.f232e.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            h0 h0Var = h0.this;
            h0Var.a();
            View view = h0Var.f232e;
            if (view.isEnabled() && !view.isLongClickable() && h0Var.c()) {
                view.getParent().requestDisallowInterceptTouchEvent(true);
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                view.onTouchEvent(motionEventObtain);
                motionEventObtain.recycle();
                h0Var.h = true;
            }
        }
    }

    public h0(View view) {
        this.f232e = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f229b = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f230c = tapTimeout;
        this.f231d = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    public final void a() {
        Runnable runnable = this.g;
        if (runnable != null) {
            this.f232e.removeCallbacks(runnable);
        }
        Runnable runnable2 = this.f;
        if (runnable2 != null) {
            this.f232e.removeCallbacks(runnable2);
        }
    }

    public abstract a.b.o.i.p b();

    public abstract boolean c();

    public boolean d() {
        a.b.o.i.p pVarB = b();
        if (pVarB == null || !pVarB.a()) {
            return true;
        }
        pVarB.dismiss();
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0113  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouch(android.view.View r12, android.view.MotionEvent r13) throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException {
        /*
            Method dump skipped, instructions count: 305
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a.b.p.h0.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        this.h = false;
        this.i = -1;
        Runnable runnable = this.f;
        if (runnable != null) {
            this.f232e.removeCallbacks(runnable);
        }
    }
}
