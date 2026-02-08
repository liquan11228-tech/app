package a.b.o.i;

import a.b.o.i.m;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;

/* loaded from: classes.dex */
public class l {

    /* renamed from: a */
    public final Context f173a;

    /* renamed from: b */
    public final g f174b;

    /* renamed from: c */
    public final boolean f175c;

    /* renamed from: d */
    public final int f176d;

    /* renamed from: e */
    public final int f177e;
    public View f;
    public boolean h;
    public m.a i;
    public k j;
    public PopupWindow.OnDismissListener k;
    public int g = 8388611;
    public final PopupWindow.OnDismissListener l = new a();

    public class a implements PopupWindow.OnDismissListener {
        public a() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            l.this.c();
        }
    }

    public l(Context context, g gVar, View view, boolean z, int i, int i2) {
        this.f173a = context;
        this.f174b = gVar;
        this.f = view;
        this.f175c = z;
        this.f176d = i;
        this.f177e = i2;
    }

    public k a() {
        if (this.j == null) {
            Display defaultDisplay = ((WindowManager) this.f173a.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            k dVar = Math.min(point.x, point.y) >= this.f173a.getResources().getDimensionPixelSize(a.b.d.abc_cascading_menus_min_smallest_width) ? new d(this.f173a, this.f, this.f176d, this.f177e, this.f175c) : new q(this.f173a, this.f174b, this.f, this.f176d, this.f177e, this.f175c);
            dVar.l(this.f174b);
            dVar.s(this.l);
            dVar.o(this.f);
            dVar.d(this.i);
            dVar.p(this.h);
            dVar.q(this.g);
            this.j = dVar;
        }
        return this.j;
    }

    public boolean b() {
        k kVar = this.j;
        return kVar != null && kVar.a();
    }

    public void c() {
        this.j = null;
        PopupWindow.OnDismissListener onDismissListener = this.k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public void d(m.a aVar) {
        this.i = aVar;
        k kVar = this.j;
        if (kVar != null) {
            kVar.d(aVar);
        }
    }

    public final void e(int i, int i2, boolean z, boolean z2) {
        k kVarA = a();
        kVarA.t(z2);
        if (z) {
            if ((Gravity.getAbsoluteGravity(this.g, a.g.j.k.f(this.f)) & 7) == 5) {
                i -= this.f.getWidth();
            }
            kVarA.r(i);
            kVarA.u(i2);
            int i3 = (int) ((this.f173a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            kVarA.f172b = new Rect(i - i3, i2 - i3, i + i3, i2 + i3);
        }
        kVarA.i();
    }

    public boolean f() {
        if (b()) {
            return true;
        }
        if (this.f == null) {
            return false;
        }
        e(0, 0, false, false);
        return true;
    }
}
