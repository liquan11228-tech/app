package a.b.p;

import a.b.k.a;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.widget.AdapterView;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;

/* loaded from: classes.dex */
public class q0 extends HorizontalScrollView implements AdapterView.OnItemSelectedListener {

    /* renamed from: b */
    public Runnable f289b;

    /* renamed from: c */
    public boolean f290c;

    /* renamed from: d */
    public int f291d;

    /* renamed from: e */
    public int f292e;
    public int f;
    public int g;

    public class a extends LinearLayout {

        /* renamed from: b */
        public a.c f293b;

        /* renamed from: c */
        public final /* synthetic */ q0 f294c;

        @Override // android.view.View
        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        @Override // android.view.View
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            if (this.f294c.f291d > 0) {
                int measuredWidth = getMeasuredWidth();
                int i3 = this.f294c.f291d;
                if (measuredWidth > i3) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), i2);
                }
            }
        }

        @Override // android.view.View
        public void setSelected(boolean z) {
            boolean z2 = isSelected() != z;
            super.setSelected(z);
            if (z2 && z) {
                sendAccessibilityEvent(4);
            }
        }
    }

    static {
        new DecelerateInterpolator();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Runnable runnable = this.f289b;
        if (runnable != null) {
            post(runnable);
        }
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Context context = getContext();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, a.b.j.ActionBar, a.b.a.actionBarStyle, 0);
        int layoutDimension = typedArrayObtainStyledAttributes.getLayoutDimension(a.b.j.ActionBar_height, 0);
        Resources resources = context.getResources();
        if (!context.getResources().getBoolean(a.b.b.abc_action_bar_embed_tabs)) {
            layoutDimension = Math.min(layoutDimension, resources.getDimensionPixelSize(a.b.d.abc_action_bar_stacked_max_height));
        }
        typedArrayObtainStyledAttributes.recycle();
        setContentHeight(layoutDimension);
        this.f292e = context.getResources().getDimensionPixelSize(a.b.d.abc_action_bar_stacked_tab_max_width);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.f289b;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        ((a) view).f293b.a();
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        setFillViewport(View.MeasureSpec.getMode(i) == 1073741824);
        throw null;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(AdapterView<?> adapterView) {
    }

    public void setAllowCollapse(boolean z) {
        this.f290c = z;
    }

    public void setContentHeight(int i) {
        this.f = i;
        requestLayout();
    }

    public void setTabSelected(int i) {
        this.g = i;
        throw null;
    }
}
