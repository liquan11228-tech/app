package androidx.appcompat.widget;

import a.b.k.h;
import a.b.k.k;
import a.b.o.i.g;
import a.b.p.c0;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;

/* loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {

    /* renamed from: b, reason: collision with root package name */
    public TypedValue f962b;

    /* renamed from: c, reason: collision with root package name */
    public TypedValue f963c;

    /* renamed from: d, reason: collision with root package name */
    public TypedValue f964d;

    /* renamed from: e, reason: collision with root package name */
    public TypedValue f965e;
    public TypedValue f;
    public TypedValue g;
    public final Rect h;
    public a i;

    public interface a {
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.h = new Rect();
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f == null) {
            this.f = new TypedValue();
        }
        return this.f;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.g == null) {
            this.g = new TypedValue();
        }
        return this.g;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f964d == null) {
            this.f964d = new TypedValue();
        }
        return this.f964d;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f965e == null) {
            this.f965e = new TypedValue();
        }
        return this.f965e;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f962b == null) {
            this.f962b = new TypedValue();
        }
        return this.f962b;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f963c == null) {
            this.f963c = new TypedValue();
        }
        return this.f963c;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        a aVar = this.i;
        if (aVar != null && ((k) aVar) == null) {
            throw null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a aVar = this.i;
        if (aVar != null) {
            h hVar = ((k) aVar).f36a;
            c0 c0Var = hVar.l;
            if (c0Var != null) {
                c0Var.j();
            }
            if (hVar.q != null) {
                hVar.f.getDecorView().removeCallbacks(hVar.r);
                if (hVar.q.isShowing()) {
                    try {
                        hVar.q.dismiss();
                    } catch (IllegalArgumentException unused) {
                    }
                }
                hVar.q = null;
            }
            hVar.y();
            g gVar = hVar.D(0).h;
            if (gVar != null) {
                gVar.c(true);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00db  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r14, int r15) {
        /*
            Method dump skipped, instructions count: 226
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ContentFrameLayout.onMeasure(int, int):void");
    }

    public void setAttachListener(a aVar) {
        this.i = aVar;
    }
}
