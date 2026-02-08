package androidx.appcompat.view.menu;

import a.b.l.a.a;
import a.b.o.i.g;
import a.b.o.i.i;
import a.b.o.i.n;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

/* loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements g.b, n, AdapterView.OnItemClickListener {

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f936c = {R.attr.background, R.attr.divider};

    /* renamed from: b, reason: collision with root package name */
    public g f937b;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        int resourceId;
        int resourceId2;
        super(context, attributeSet);
        setOnItemClickListener(this);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f936c, R.attr.listViewStyle, 0);
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            setBackgroundDrawable((!typedArrayObtainStyledAttributes.hasValue(0) || (resourceId2 = typedArrayObtainStyledAttributes.getResourceId(0, 0)) == 0) ? typedArrayObtainStyledAttributes.getDrawable(0) : a.b(context, resourceId2));
        }
        if (typedArrayObtainStyledAttributes.hasValue(1)) {
            setDivider((!typedArrayObtainStyledAttributes.hasValue(1) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(1, 0)) == 0) ? typedArrayObtainStyledAttributes.getDrawable(1) : a.b(context, resourceId));
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // a.b.o.i.g.b
    public boolean b(i iVar) {
        return this.f937b.s(iVar, null, 0);
    }

    @Override // a.b.o.i.n
    public void c(g gVar) {
        this.f937b = gVar;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        b((i) getAdapter().getItem(i));
    }
}
