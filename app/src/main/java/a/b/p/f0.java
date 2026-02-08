package a.b.p;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public class f0 extends ListView {

    /* renamed from: b, reason: collision with root package name */
    public final Rect f218b;

    /* renamed from: c, reason: collision with root package name */
    public int f219c;

    /* renamed from: d, reason: collision with root package name */
    public int f220d;

    /* renamed from: e, reason: collision with root package name */
    public int f221e;
    public int f;
    public int g;
    public Field h;
    public a i;
    public boolean j;
    public boolean k;
    public boolean l;
    public a.g.j.o m;
    public a.g.k.c n;
    public b o;

    public static class a extends a.b.m.a.a {

        /* renamed from: c, reason: collision with root package name */
        public boolean f222c;

        public a(Drawable drawable) {
            super(drawable);
            this.f222c = true;
        }

        @Override // a.b.m.a.a, android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            if (this.f222c) {
                this.f75b.draw(canvas);
            }
        }

        @Override // a.b.m.a.a, android.graphics.drawable.Drawable
        public void setHotspot(float f, float f2) {
            if (this.f222c) {
                this.f75b.setHotspot(f, f2);
            }
        }

        @Override // a.b.m.a.a, android.graphics.drawable.Drawable
        public void setHotspotBounds(int i, int i2, int i3, int i4) {
            if (this.f222c) {
                this.f75b.setHotspotBounds(i, i2, i3, i4);
            }
        }

        @Override // a.b.m.a.a, android.graphics.drawable.Drawable
        public boolean setState(int[] iArr) {
            if (this.f222c) {
                return this.f75b.setState(iArr);
            }
            return false;
        }

        @Override // a.b.m.a.a, android.graphics.drawable.Drawable
        public boolean setVisible(boolean z, boolean z2) {
            if (this.f222c) {
                return super.setVisible(z, z2);
            }
            return false;
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            f0 f0Var = f0.this;
            f0Var.o = null;
            f0Var.drawableStateChanged();
        }
    }

    public f0(Context context, boolean z) throws NoSuchFieldException {
        super(context, null, a.b.a.dropDownListViewStyle);
        this.f218b = new Rect();
        this.f219c = 0;
        this.f220d = 0;
        this.f221e = 0;
        this.f = 0;
        this.k = z;
        setCacheColorHint(0);
        try {
            Field declaredField = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            this.h = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException e2) {
            e2.printStackTrace();
        }
    }

    private void setSelectorEnabled(boolean z) {
        a aVar = this.i;
        if (aVar != null) {
            aVar.f222c = z;
        }
    }

    public int a(int i, int i2, int i3) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        int measuredHeight = listPaddingTop + listPaddingBottom;
        if (adapter == null) {
            return measuredHeight;
        }
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        View view = null;
        while (i4 < count) {
            int itemViewType = adapter.getItemViewType(i4);
            if (itemViewType != i5) {
                view = null;
                i5 = itemViewType;
            }
            view = adapter.getView(i4, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i7 = layoutParams.height;
            view.measure(i, i7 > 0 ? View.MeasureSpec.makeMeasureSpec(i7, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i4 > 0) {
                measuredHeight += dividerHeight;
            }
            measuredHeight += view.getMeasuredHeight();
            if (measuredHeight >= i2) {
                return (i3 < 0 || i4 <= i3 || i6 <= 0 || measuredHeight == i2) ? i2 : i6;
            }
            if (i3 >= 0 && i4 >= i3) {
                i6 = measuredHeight;
            }
            i4++;
        }
        return measuredHeight;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0164  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean b(android.view.MotionEvent r17, int r18) throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException {
        /*
            Method dump skipped, instructions count: 370
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a.b.p.f0.b(android.view.MotionEvent, int):boolean");
    }

    public final void c() {
        Drawable selector = getSelector();
        if (selector != null && this.l && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        Drawable selector;
        if (!this.f218b.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(this.f218b);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        if (this.o != null) {
            return;
        }
        super.drawableStateChanged();
        setSelectorEnabled(true);
        c();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean hasFocus() {
        return this.k || super.hasFocus();
    }

    @Override // android.view.View
    public boolean hasWindowFocus() {
        return this.k || super.hasWindowFocus();
    }

    @Override // android.view.View
    public boolean isFocused() {
        return this.k || super.isFocused();
    }

    @Override // android.view.View
    public boolean isInTouchMode() {
        return (this.k && this.j) || super.isInTouchMode();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.o = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.o == null) {
            b bVar = new b();
            this.o = bVar;
            f0.this.post(bVar);
        }
        boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked == 9 || actionMasked == 7) {
            int iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (iPointToPosition != -1 && iPointToPosition != getSelectedItemPosition()) {
                View childAt = getChildAt(iPointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    setSelectionFromTop(iPointToPosition, childAt.getTop() - getTop());
                }
                c();
            }
        } else {
            setSelection(-1);
        }
        return zOnHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.g = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        b bVar = this.o;
        if (bVar != null) {
            f0 f0Var = f0.this;
            f0Var.o = null;
            f0Var.removeCallbacks(bVar);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z) {
        this.j = z;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        a aVar = drawable != null ? new a(drawable) : null;
        this.i = aVar;
        super.setSelector(aVar);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f219c = rect.left;
        this.f220d = rect.top;
        this.f221e = rect.right;
        this.f = rect.bottom;
    }
}
