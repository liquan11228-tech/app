package a.b.o.i;

import a.b.k.d;
import a.b.o.i.m;
import a.b.o.i.n;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.view.menu.ExpandedMenuView;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class e implements m, AdapterView.OnItemClickListener {

    /* renamed from: b, reason: collision with root package name */
    public Context f138b;

    /* renamed from: c, reason: collision with root package name */
    public LayoutInflater f139c;

    /* renamed from: d, reason: collision with root package name */
    public g f140d;

    /* renamed from: e, reason: collision with root package name */
    public ExpandedMenuView f141e;
    public int f;
    public int g = 0;
    public int h;
    public m.a i;
    public a j;

    public class a extends BaseAdapter {

        /* renamed from: b, reason: collision with root package name */
        public int f142b = -1;

        public a() {
            a();
        }

        public void a() {
            g gVar = e.this.f140d;
            i iVar = gVar.w;
            if (iVar != null) {
                gVar.i();
                ArrayList<i> arrayList = gVar.j;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    if (arrayList.get(i) == iVar) {
                        this.f142b = i;
                        return;
                    }
                }
            }
            this.f142b = -1;
        }

        @Override // android.widget.Adapter
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public i getItem(int i) {
            g gVar = e.this.f140d;
            gVar.i();
            ArrayList<i> arrayList = gVar.j;
            int i2 = i + e.this.f;
            int i3 = this.f142b;
            if (i3 >= 0 && i2 >= i3) {
                i2++;
            }
            return arrayList.get(i2);
        }

        @Override // android.widget.Adapter
        public int getCount() {
            g gVar = e.this.f140d;
            gVar.i();
            int size = gVar.j.size() - e.this.f;
            return this.f142b < 0 ? size : size - 1;
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                e eVar = e.this;
                view = eVar.f139c.inflate(eVar.h, viewGroup, false);
            }
            ((n.a) view).d(getItem(i), 0);
            return view;
        }

        @Override // android.widget.BaseAdapter
        public void notifyDataSetChanged() {
            a();
            super.notifyDataSetChanged();
        }
    }

    public e(Context context, int i) {
        this.h = i;
        this.f138b = context;
        this.f139c = LayoutInflater.from(context);
    }

    public ListAdapter a() {
        if (this.j == null) {
            this.j = new a();
        }
        return this.j;
    }

    @Override // a.b.o.i.m
    public void b(g gVar, boolean z) {
        m.a aVar = this.i;
        if (aVar != null) {
            aVar.b(gVar, z);
        }
    }

    @Override // a.b.o.i.m
    public boolean c(g gVar, i iVar) {
        return false;
    }

    @Override // a.b.o.i.m
    public void d(m.a aVar) {
        this.i = aVar;
    }

    @Override // a.b.o.i.m
    public boolean f(r rVar) {
        if (!rVar.hasVisibleItems()) {
            return false;
        }
        h hVar = new h(rVar);
        g gVar = hVar.f153b;
        d.a aVar = new d.a(gVar.f148a);
        e eVar = new e(aVar.f8a.f930a, a.b.g.abc_list_menu_item_layout);
        hVar.f155d = eVar;
        eVar.i = hVar;
        g gVar2 = hVar.f153b;
        gVar2.b(eVar, gVar2.f148a);
        ListAdapter listAdapterA = hVar.f155d.a();
        AlertController.b bVar = aVar.f8a;
        bVar.l = listAdapterA;
        bVar.m = hVar;
        View view = gVar.o;
        if (view != null) {
            bVar.g = view;
        } else {
            bVar.f933d = gVar.n;
            bVar.f = gVar.m;
        }
        aVar.f8a.k = hVar;
        a.b.k.d dVarA = aVar.a();
        hVar.f154c = dVarA;
        dVarA.setOnDismissListener(hVar);
        WindowManager.LayoutParams attributes = hVar.f154c.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        hVar.f154c.show();
        m.a aVar2 = this.i;
        if (aVar2 == null) {
            return true;
        }
        aVar2.c(rVar);
        return true;
    }

    @Override // a.b.o.i.m
    public boolean g() {
        return false;
    }

    @Override // a.b.o.i.m
    public void h(boolean z) {
        a aVar = this.j;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    @Override // a.b.o.i.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void j(android.content.Context r3, a.b.o.i.g r4) {
        /*
            r2 = this;
            int r0 = r2.g
            if (r0 == 0) goto L12
            android.view.ContextThemeWrapper r0 = new android.view.ContextThemeWrapper
            int r1 = r2.g
            r0.<init>(r3, r1)
            r2.f138b = r0
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r0)
            goto L20
        L12:
            android.content.Context r0 = r2.f138b
            if (r0 == 0) goto L22
            r2.f138b = r3
            android.view.LayoutInflater r0 = r2.f139c
            if (r0 != 0) goto L22
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r3)
        L20:
            r2.f139c = r3
        L22:
            r2.f140d = r4
            a.b.o.i.e$a r3 = r2.j
            if (r3 == 0) goto L2b
            r3.notifyDataSetChanged()
        L2b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a.b.o.i.e.j(android.content.Context, a.b.o.i.g):void");
    }

    @Override // a.b.o.i.m
    public boolean k(g gVar, i iVar) {
        return false;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.f140d.s(this.j.getItem(i), this, 0);
    }
}
