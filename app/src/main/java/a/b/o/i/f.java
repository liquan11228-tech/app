package a.b.o.i;

import a.b.o.i.n;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class f extends BaseAdapter {

    /* renamed from: b, reason: collision with root package name */
    public g f144b;

    /* renamed from: c, reason: collision with root package name */
    public int f145c = -1;

    /* renamed from: d, reason: collision with root package name */
    public boolean f146d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f147e;
    public final LayoutInflater f;
    public final int g;

    public f(g gVar, LayoutInflater layoutInflater, boolean z, int i) {
        this.f147e = z;
        this.f = layoutInflater;
        this.f144b = gVar;
        this.g = i;
        a();
    }

    public void a() {
        g gVar = this.f144b;
        i iVar = gVar.w;
        if (iVar != null) {
            gVar.i();
            ArrayList<i> arrayList = gVar.j;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (arrayList.get(i) == iVar) {
                    this.f145c = i;
                    return;
                }
            }
        }
        this.f145c = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public i getItem(int i) {
        ArrayList<i> arrayListL;
        if (this.f147e) {
            g gVar = this.f144b;
            gVar.i();
            arrayListL = gVar.j;
        } else {
            arrayListL = this.f144b.l();
        }
        int i2 = this.f145c;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return arrayListL.get(i);
    }

    @Override // android.widget.Adapter
    public int getCount() {
        ArrayList<i> arrayListL;
        if (this.f147e) {
            g gVar = this.f144b;
            gVar.i();
            arrayListL = gVar.j;
        } else {
            arrayListL = this.f144b.l();
        }
        int i = this.f145c;
        int size = arrayListL.size();
        return i < 0 ? size : size - 1;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f.inflate(this.g, viewGroup, false);
        }
        int i2 = getItem(i).f157b;
        int i3 = i - 1;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        listMenuItemView.setGroupDividerEnabled(this.f144b.m() && i2 != (i3 >= 0 ? getItem(i3).f157b : i2));
        n.a aVar = (n.a) view;
        if (this.f146d) {
            listMenuItemView.setForceShowIcon(true);
        }
        aVar.d(getItem(i), 0);
        return view;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
