package a.b.o.i;

import a.b.o.i.m;
import a.b.o.i.n;
import a.b.p.c.b;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActionMenuView;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class b implements m {

    /* renamed from: b */
    public Context f118b;

    /* renamed from: c */
    public Context f119c;

    /* renamed from: d */
    public g f120d;

    /* renamed from: e */
    public LayoutInflater f121e;
    public m.a f;
    public int g;
    public int h;
    public n i;

    public b(Context context, int i, int i2) {
        this.f118b = context;
        this.f121e = LayoutInflater.from(context);
        this.g = i;
        this.h = i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r4v4, types: [a.b.o.i.n$a] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    public View a(i iVar, View view, ViewGroup viewGroup) {
        ActionMenuItemView actionMenuItemView = view instanceof n.a ? (n.a) view : (n.a) this.f121e.inflate(this.h, viewGroup, false);
        a.b.p.c cVar = (a.b.p.c) this;
        actionMenuItemView.d(iVar, 0);
        ActionMenuItemView actionMenuItemView2 = actionMenuItemView;
        actionMenuItemView2.setItemInvoker((ActionMenuView) cVar.i);
        if (cVar.x == null) {
            cVar.x = cVar.new b();
        }
        actionMenuItemView2.setPopupCallback(cVar.x);
        return actionMenuItemView;
    }

    @Override // a.b.o.i.m
    public boolean c(g gVar, i iVar) {
        return false;
    }

    @Override // a.b.o.i.m
    public void d(m.a aVar) {
        this.f = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [a.b.o.i.g] */
    @Override // a.b.o.i.m
    public boolean f(r rVar) {
        m.a aVar = this.f;
        r rVar2 = rVar;
        if (aVar == null) {
            return false;
        }
        if (rVar == null) {
            rVar2 = this.f120d;
        }
        return aVar.c(rVar2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.b.o.i.m
    public void h(boolean z) {
        int i;
        boolean z2;
        ViewGroup viewGroup = (ViewGroup) this.i;
        if (viewGroup == null) {
            return;
        }
        g gVar = this.f120d;
        if (gVar != null) {
            gVar.i();
            ArrayList<i> arrayListL = this.f120d.l();
            int size = arrayListL.size();
            i = 0;
            for (int i2 = 0; i2 < size; i2++) {
                i iVar = arrayListL.get(i2);
                if (iVar.g()) {
                    View childAt = viewGroup.getChildAt(i);
                    i itemData = childAt instanceof n.a ? ((n.a) childAt).getItemData() : null;
                    View viewA = a(iVar, childAt, viewGroup);
                    if (iVar != itemData) {
                        viewA.setPressed(false);
                        viewA.jumpDrawablesToCurrentState();
                    }
                    if (viewA != childAt) {
                        ViewGroup viewGroup2 = (ViewGroup) viewA.getParent();
                        if (viewGroup2 != null) {
                            viewGroup2.removeView(viewA);
                        }
                        ((ViewGroup) this.i).addView(viewA, i);
                    }
                    i++;
                }
            }
        } else {
            i = 0;
        }
        while (i < viewGroup.getChildCount()) {
            if (viewGroup.getChildAt(i) == ((a.b.p.c) this).j) {
                z2 = false;
            } else {
                viewGroup.removeViewAt(i);
                z2 = true;
            }
            if (!z2) {
                i++;
            }
        }
    }

    @Override // a.b.o.i.m
    public boolean k(g gVar, i iVar) {
        return false;
    }
}
