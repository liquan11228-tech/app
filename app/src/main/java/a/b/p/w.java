package a.b.p;

import a.b.k.d;
import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import androidx.appcompat.app.AlertController;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public class w extends Spinner {
    public static final int[] j = {R.attr.spinnerMode};

    /* renamed from: b, reason: collision with root package name */
    public final a.b.p.e f317b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f318c;

    /* renamed from: d, reason: collision with root package name */
    public h0 f319d;

    /* renamed from: e, reason: collision with root package name */
    public SpinnerAdapter f320e;
    public final boolean f;
    public f g;
    public int h;
    public final Rect i;

    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!w.this.getInternalPopup().a()) {
                w.this.b();
            }
            ViewTreeObserver viewTreeObserver = w.this.getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.removeOnGlobalLayoutListener(this);
            }
        }
    }

    public class b implements f, DialogInterface.OnClickListener {

        /* renamed from: b, reason: collision with root package name */
        public a.b.k.d f322b;

        /* renamed from: c, reason: collision with root package name */
        public ListAdapter f323c;

        /* renamed from: d, reason: collision with root package name */
        public CharSequence f324d;

        public b() {
        }

        @Override // a.b.p.w.f
        public boolean a() {
            a.b.k.d dVar = this.f322b;
            if (dVar != null) {
                return dVar.isShowing();
            }
            return false;
        }

        @Override // a.b.p.w.f
        public CharSequence b() {
            return this.f324d;
        }

        @Override // a.b.p.w.f
        public void c(int i) {
        }

        @Override // a.b.p.w.f
        public int d() {
            return 0;
        }

        @Override // a.b.p.w.f
        public void dismiss() {
            a.b.k.d dVar = this.f322b;
            if (dVar != null) {
                dVar.dismiss();
                this.f322b = null;
            }
        }

        @Override // a.b.p.w.f
        public void f(int i, int i2) {
            if (this.f323c == null) {
                return;
            }
            d.a aVar = new d.a(w.this.getPopupContext());
            CharSequence charSequence = this.f324d;
            if (charSequence != null) {
                aVar.f8a.f = charSequence;
            }
            ListAdapter listAdapter = this.f323c;
            int selectedItemPosition = w.this.getSelectedItemPosition();
            AlertController.b bVar = aVar.f8a;
            bVar.l = listAdapter;
            bVar.m = this;
            bVar.p = selectedItemPosition;
            bVar.o = true;
            a.b.k.d dVarA = aVar.a();
            this.f322b = dVarA;
            ListView listView = dVarA.f7d.g;
            listView.setTextDirection(i);
            listView.setTextAlignment(i2);
            this.f322b.show();
        }

        @Override // a.b.p.w.f
        public void h(CharSequence charSequence) {
            this.f324d = charSequence;
        }

        @Override // a.b.p.w.f
        public int j() {
            return 0;
        }

        @Override // a.b.p.w.f
        public void l(Drawable drawable) {
        }

        @Override // a.b.p.w.f
        public void m(int i) {
        }

        @Override // a.b.p.w.f
        public Drawable n() {
            return null;
        }

        @Override // a.b.p.w.f
        public void o(ListAdapter listAdapter) {
            this.f323c = listAdapter;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            w.this.setSelection(i);
            if (w.this.getOnItemClickListener() != null) {
                w.this.performItemClick(null, i, this.f323c.getItemId(i));
            }
            a.b.k.d dVar = this.f322b;
            if (dVar != null) {
                dVar.dismiss();
                this.f322b = null;
            }
        }

        @Override // a.b.p.w.f
        public void p(int i) {
        }
    }

    public static class c implements ListAdapter, SpinnerAdapter {

        /* renamed from: b, reason: collision with root package name */
        public SpinnerAdapter f326b;

        /* renamed from: c, reason: collision with root package name */
        public ListAdapter f327c;

        public c(SpinnerAdapter spinnerAdapter, Resources.Theme theme) {
            this.f326b = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                this.f327c = (ListAdapter) spinnerAdapter;
            }
            if (theme != null) {
                if (spinnerAdapter instanceof ThemedSpinnerAdapter) {
                    ThemedSpinnerAdapter themedSpinnerAdapter = (ThemedSpinnerAdapter) spinnerAdapter;
                    if (themedSpinnerAdapter.getDropDownViewTheme() != theme) {
                        themedSpinnerAdapter.setDropDownViewTheme(theme);
                        return;
                    }
                    return;
                }
                if (spinnerAdapter instanceof t0) {
                    t0 t0Var = (t0) spinnerAdapter;
                    if (t0Var.getDropDownViewTheme() == null) {
                        t0Var.setDropDownViewTheme(theme);
                    }
                }
            }
        }

        @Override // android.widget.ListAdapter
        public boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.f327c;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            SpinnerAdapter spinnerAdapter = this.f326b;
            if (spinnerAdapter == null) {
                return 0;
            }
            return spinnerAdapter.getCount();
        }

        @Override // android.widget.SpinnerAdapter
        public View getDropDownView(int i, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.f326b;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            SpinnerAdapter spinnerAdapter = this.f326b;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getItem(i);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            SpinnerAdapter spinnerAdapter = this.f326b;
            if (spinnerAdapter == null) {
                return -1L;
            }
            return spinnerAdapter.getItemId(i);
        }

        @Override // android.widget.Adapter
        public int getItemViewType(int i) {
            return 0;
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.f326b;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public int getViewTypeCount() {
            return 1;
        }

        @Override // android.widget.Adapter
        public boolean hasStableIds() {
            SpinnerAdapter spinnerAdapter = this.f326b;
            return spinnerAdapter != null && spinnerAdapter.hasStableIds();
        }

        @Override // android.widget.Adapter
        public boolean isEmpty() {
            return getCount() == 0;
        }

        @Override // android.widget.ListAdapter
        public boolean isEnabled(int i) {
            ListAdapter listAdapter = this.f327c;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i);
            }
            return true;
        }

        @Override // android.widget.Adapter
        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f326b;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(dataSetObserver);
            }
        }

        @Override // android.widget.Adapter
        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f326b;
            if (spinnerAdapter != null) {
                spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }

    public class d extends k0 implements f {
        public CharSequence F;
        public ListAdapter G;
        public final Rect H;
        public int I;

        public class a implements AdapterView.OnItemClickListener {
            public a(w wVar) {
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                w.this.setSelection(i);
                if (w.this.getOnItemClickListener() != null) {
                    d dVar = d.this;
                    w.this.performItemClick(view, i, dVar.G.getItemId(i));
                }
                d.this.dismiss();
            }
        }

        public class b implements ViewTreeObserver.OnGlobalLayoutListener {
            public b() {
            }

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
                d dVar = d.this;
                w wVar = w.this;
                if (dVar == null) {
                    throw null;
                }
                if (!(a.g.j.k.l(wVar) && wVar.getGlobalVisibleRect(dVar.H))) {
                    d.this.dismiss();
                } else {
                    d.this.u();
                    d.super.i();
                }
            }
        }

        public class c implements PopupWindow.OnDismissListener {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener f330b;

            public c(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
                this.f330b = onGlobalLayoutListener;
            }

            @Override // android.widget.PopupWindow.OnDismissListener
            public void onDismiss() {
                ViewTreeObserver viewTreeObserver = w.this.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeGlobalOnLayoutListener(this.f330b);
                }
            }
        }

        public d(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i, 0);
            this.H = new Rect();
            this.s = w.this;
            s(true);
            this.q = 0;
            this.t = new a(w.this);
        }

        @Override // a.b.p.w.f
        public CharSequence b() {
            return this.F;
        }

        @Override // a.b.p.w.f
        public void f(int i, int i2) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            ViewTreeObserver viewTreeObserver;
            boolean zA = a();
            u();
            this.C.setInputMethodMode(2);
            super.i();
            f0 f0Var = this.f260d;
            f0Var.setChoiceMode(1);
            f0Var.setTextDirection(i);
            f0Var.setTextAlignment(i2);
            int selectedItemPosition = w.this.getSelectedItemPosition();
            f0 f0Var2 = this.f260d;
            if (a() && f0Var2 != null) {
                f0Var2.setListSelectionHidden(false);
                f0Var2.setSelection(selectedItemPosition);
                if (f0Var2.getChoiceMode() != 0) {
                    f0Var2.setItemChecked(selectedItemPosition, true);
                }
            }
            if (zA || (viewTreeObserver = w.this.getViewTreeObserver()) == null) {
                return;
            }
            b bVar = new b();
            viewTreeObserver.addOnGlobalLayoutListener(bVar);
            this.C.setOnDismissListener(new c(bVar));
        }

        @Override // a.b.p.w.f
        public void h(CharSequence charSequence) {
            this.F = charSequence;
        }

        @Override // a.b.p.k0, a.b.p.w.f
        public void o(ListAdapter listAdapter) {
            super.o(listAdapter);
            this.G = listAdapter;
        }

        @Override // a.b.p.w.f
        public void p(int i) {
            this.I = i;
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x008d  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0096  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void u() {
            /*
                r8 = this;
                android.graphics.drawable.Drawable r0 = r8.n()
                r1 = 0
                if (r0 == 0) goto L26
                a.b.p.w r1 = a.b.p.w.this
                android.graphics.Rect r1 = r1.i
                r0.getPadding(r1)
                a.b.p.w r0 = a.b.p.w.this
                boolean r0 = a.b.p.b1.a(r0)
                if (r0 == 0) goto L1d
                a.b.p.w r0 = a.b.p.w.this
                android.graphics.Rect r0 = r0.i
                int r0 = r0.right
                goto L24
            L1d:
                a.b.p.w r0 = a.b.p.w.this
                android.graphics.Rect r0 = r0.i
                int r0 = r0.left
                int r0 = -r0
            L24:
                r1 = r0
                goto L2e
            L26:
                a.b.p.w r0 = a.b.p.w.this
                android.graphics.Rect r0 = r0.i
                r0.right = r1
                r0.left = r1
            L2e:
                a.b.p.w r0 = a.b.p.w.this
                int r0 = r0.getPaddingLeft()
                a.b.p.w r2 = a.b.p.w.this
                int r2 = r2.getPaddingRight()
                a.b.p.w r3 = a.b.p.w.this
                int r3 = r3.getWidth()
                a.b.p.w r4 = a.b.p.w.this
                int r5 = r4.h
                r6 = -2
                if (r5 != r6) goto L78
                android.widget.ListAdapter r5 = r8.G
                android.widget.SpinnerAdapter r5 = (android.widget.SpinnerAdapter) r5
                android.graphics.drawable.Drawable r6 = r8.n()
                int r4 = r4.a(r5, r6)
                a.b.p.w r5 = a.b.p.w.this
                android.content.Context r5 = r5.getContext()
                android.content.res.Resources r5 = r5.getResources()
                android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
                int r5 = r5.widthPixels
                a.b.p.w r6 = a.b.p.w.this
                android.graphics.Rect r6 = r6.i
                int r7 = r6.left
                int r5 = r5 - r7
                int r6 = r6.right
                int r5 = r5 - r6
                if (r4 <= r5) goto L70
                r4 = r5
            L70:
                int r5 = r3 - r0
                int r5 = r5 - r2
                int r4 = java.lang.Math.max(r4, r5)
                goto L7e
            L78:
                r4 = -1
                if (r5 != r4) goto L82
                int r4 = r3 - r0
                int r4 = r4 - r2
            L7e:
                r8.r(r4)
                goto L85
            L82:
                r8.r(r5)
            L85:
                a.b.p.w r4 = a.b.p.w.this
                boolean r4 = a.b.p.b1.a(r4)
                if (r4 == 0) goto L96
                int r3 = r3 - r2
                int r0 = r8.f
                int r3 = r3 - r0
                int r0 = r8.I
                int r3 = r3 - r0
                int r3 = r3 + r1
                goto L9b
            L96:
                int r2 = r8.I
                int r0 = r0 + r2
                int r3 = r0 + r1
            L9b:
                r8.g = r3
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: a.b.p.w.d.u():void");
        }
    }

    public static class e extends View.BaseSavedState {
        public static final Parcelable.Creator<e> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        public boolean f332b;

        public class a implements Parcelable.Creator<e> {
            @Override // android.os.Parcelable.Creator
            public e createFromParcel(Parcel parcel) {
                return new e(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public e[] newArray(int i) {
                return new e[i];
            }
        }

        public e(Parcel parcel) {
            super(parcel);
            this.f332b = parcel.readByte() != 0;
        }

        public e(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeByte(this.f332b ? (byte) 1 : (byte) 0);
        }
    }

    public interface f {
        boolean a();

        CharSequence b();

        void c(int i);

        int d();

        void dismiss();

        void f(int i, int i2);

        void h(CharSequence charSequence);

        int j();

        void l(Drawable drawable);

        void m(int i);

        Drawable n();

        void o(ListAdapter listAdapter);

        void p(int i);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public w(android.content.Context r8, android.util.AttributeSet r9, int r10) throws java.lang.Throwable {
        /*
            r7 = this;
            r7.<init>(r8, r9, r10)
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r7.i = r0
            android.content.Context r0 = r7.getContext()
            a.b.p.s0.a(r7, r0)
            int[] r0 = a.b.j.Spinner
            r1 = 0
            android.content.res.TypedArray r0 = r8.obtainStyledAttributes(r9, r0, r10, r1)
            a.b.p.e r2 = new a.b.p.e
            r2.<init>(r7)
            r7.f317b = r2
            int r2 = a.b.j.Spinner_popupTheme
            int r2 = r0.getResourceId(r2, r1)
            if (r2 == 0) goto L2f
            a.b.o.c r3 = new a.b.o.c
            r3.<init>(r8, r2)
            r7.f318c = r3
            goto L31
        L2f:
            r7.f318c = r8
        L31:
            r2 = 0
            r3 = -1
            int[] r4 = a.b.p.w.j     // Catch: java.lang.Throwable -> L47 java.lang.Exception -> L4e
            android.content.res.TypedArray r4 = r8.obtainStyledAttributes(r9, r4, r10, r1)     // Catch: java.lang.Throwable -> L47 java.lang.Exception -> L4e
            boolean r5 = r4.hasValue(r1)     // Catch: java.lang.Throwable -> L44 java.lang.Exception -> L4f
            if (r5 == 0) goto L51
            int r3 = r4.getInt(r1, r1)     // Catch: java.lang.Throwable -> L44 java.lang.Exception -> L4f
            goto L51
        L44:
            r8 = move-exception
            r2 = r4
            goto L48
        L47:
            r8 = move-exception
        L48:
            if (r2 == 0) goto L4d
            r2.recycle()
        L4d:
            throw r8
        L4e:
            r4 = r2
        L4f:
            if (r4 == 0) goto L54
        L51:
            r4.recycle()
        L54:
            r4 = 1
            if (r3 == 0) goto L94
            if (r3 == r4) goto L5a
            goto La4
        L5a:
            a.b.p.w$d r3 = new a.b.p.w$d
            android.content.Context r5 = r7.f318c
            r3.<init>(r5, r9, r10)
            android.content.Context r5 = r7.f318c
            int[] r6 = a.b.j.Spinner
            a.b.p.x0 r1 = a.b.p.x0.o(r5, r9, r6, r10, r1)
            int r5 = a.b.j.Spinner_android_dropDownWidth
            r6 = -2
            int r5 = r1.i(r5, r6)
            r7.h = r5
            int r5 = a.b.j.Spinner_android_popupBackground
            android.graphics.drawable.Drawable r5 = r1.e(r5)
            android.widget.PopupWindow r6 = r3.C
            r6.setBackgroundDrawable(r5)
            int r5 = a.b.j.Spinner_android_prompt
            java.lang.String r5 = r0.getString(r5)
            r3.F = r5
            android.content.res.TypedArray r1 = r1.f336b
            r1.recycle()
            r7.g = r3
            a.b.p.v r1 = new a.b.p.v
            r1.<init>(r7, r7, r3)
            r7.f319d = r1
            goto La4
        L94:
            a.b.p.w$b r1 = new a.b.p.w$b
            r1.<init>()
            r7.g = r1
            int r3 = a.b.j.Spinner_android_prompt
            java.lang.String r3 = r0.getString(r3)
            r1.h(r3)
        La4:
            int r1 = a.b.j.Spinner_android_entries
            java.lang.CharSequence[] r1 = r0.getTextArray(r1)
            if (r1 == 0) goto Lbc
            android.widget.ArrayAdapter r3 = new android.widget.ArrayAdapter
            r5 = 17367048(0x1090008, float:2.5162948E-38)
            r3.<init>(r8, r5, r1)
            int r8 = a.b.g.support_simple_spinner_dropdown_item
            r3.setDropDownViewResource(r8)
            r7.setAdapter(r3)
        Lbc:
            r0.recycle()
            r7.f = r4
            android.widget.SpinnerAdapter r8 = r7.f320e
            if (r8 == 0) goto Lca
            r7.setAdapter(r8)
            r7.f320e = r2
        Lca:
            a.b.p.e r8 = r7.f317b
            r8.d(r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a.b.p.w.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int iMax = Math.max(0, getSelectedItemPosition());
        int iMin = Math.min(spinnerAdapter.getCount(), iMax + 15);
        View view = null;
        int iMax2 = 0;
        for (int iMax3 = Math.max(0, iMax - (15 - (iMin - iMax))); iMax3 < iMin; iMax3++) {
            int itemViewType = spinnerAdapter.getItemViewType(iMax3);
            if (itemViewType != i) {
                view = null;
                i = itemViewType;
            }
            view = spinnerAdapter.getView(iMax3, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            iMax2 = Math.max(iMax2, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return iMax2;
        }
        drawable.getPadding(this.i);
        Rect rect = this.i;
        return iMax2 + rect.left + rect.right;
    }

    public void b() {
        this.g.f(getTextDirection(), getTextAlignment());
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        a.b.p.e eVar = this.f317b;
        if (eVar != null) {
            eVar.a();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        f fVar = this.g;
        return fVar != null ? fVar.d() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        f fVar = this.g;
        return fVar != null ? fVar.j() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.g != null ? this.h : super.getDropDownWidth();
    }

    public final f getInternalPopup() {
        return this.g;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        f fVar = this.g;
        return fVar != null ? fVar.n() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.f318c;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        f fVar = this.g;
        return fVar != null ? fVar.b() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        a.b.p.e eVar = this.f317b;
        if (eVar != null) {
            return eVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        a.b.p.e eVar = this.f317b;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        f fVar = this.g;
        if (fVar == null || !fVar.a()) {
            return;
        }
        this.g.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.g == null || View.MeasureSpec.getMode(i) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        e eVar = (e) parcelable;
        super.onRestoreInstanceState(eVar.getSuperState());
        if (!eVar.f332b || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new a());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public Parcelable onSaveInstanceState() {
        e eVar = new e(super.onSaveInstanceState());
        f fVar = this.g;
        eVar.f332b = fVar != null && fVar.a();
        return eVar;
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        h0 h0Var = this.f319d;
        if (h0Var == null || !h0Var.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean performClick() {
        f fVar = this.g;
        if (fVar == null) {
            return super.performClick();
        }
        if (fVar.a()) {
            return true;
        }
        b();
        return true;
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f) {
            this.f320e = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.g != null) {
            Context context = this.f318c;
            if (context == null) {
                context = getContext();
            }
            this.g.o(new c(spinnerAdapter, context.getTheme()));
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        a.b.p.e eVar = this.f317b;
        if (eVar != null) {
            eVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        a.b.p.e eVar = this.f317b;
        if (eVar != null) {
            eVar.f(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i) {
        f fVar = this.g;
        if (fVar == null) {
            super.setDropDownHorizontalOffset(i);
        } else {
            fVar.p(i);
            this.g.c(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i) {
        f fVar = this.g;
        if (fVar != null) {
            fVar.m(i);
        } else {
            super.setDropDownVerticalOffset(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i) {
        if (this.g != null) {
            this.h = i;
        } else {
            super.setDropDownWidth(i);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        f fVar = this.g;
        if (fVar != null) {
            fVar.l(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i) {
        setPopupBackgroundDrawable(a.b.l.a.a.b(getPopupContext(), i));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        f fVar = this.g;
        if (fVar != null) {
            fVar.h(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        a.b.p.e eVar = this.f317b;
        if (eVar != null) {
            eVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        a.b.p.e eVar = this.f317b;
        if (eVar != null) {
            eVar.i(mode);
        }
    }
}
