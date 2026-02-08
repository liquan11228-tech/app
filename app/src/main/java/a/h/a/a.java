package a.h.a;

import a.h.a.b;
import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;

/* loaded from: classes.dex */
public abstract class a extends BaseAdapter implements Filterable, b.a {

    /* renamed from: b, reason: collision with root package name */
    public boolean f754b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f755c;

    /* renamed from: d, reason: collision with root package name */
    public Cursor f756d;

    /* renamed from: e, reason: collision with root package name */
    public Context f757e;
    public int f;
    public C0017a g;
    public DataSetObserver h;
    public a.h.a.b i;

    /* renamed from: a.h.a.a$a, reason: collision with other inner class name */
    public class C0017a extends ContentObserver {
        public C0017a() {
            super(new Handler());
        }

        @Override // android.database.ContentObserver
        public boolean deliverSelfNotifications() {
            return true;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z) {
            Cursor cursor;
            a aVar = a.this;
            if (!aVar.f755c || (cursor = aVar.f756d) == null || cursor.isClosed()) {
                return;
            }
            aVar.f754b = aVar.f756d.requery();
        }
    }

    public class b extends DataSetObserver {
        public b() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            a aVar = a.this;
            aVar.f754b = true;
            aVar.notifyDataSetChanged();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            a aVar = a.this;
            aVar.f754b = false;
            aVar.notifyDataSetInvalidated();
        }
    }

    public a(Context context, Cursor cursor, boolean z) {
        b bVar;
        int i = z ? 1 : 2;
        if ((i & 1) == 1) {
            i |= 2;
            this.f755c = true;
        } else {
            this.f755c = false;
        }
        boolean z2 = cursor != null;
        this.f756d = cursor;
        this.f754b = z2;
        this.f757e = context;
        this.f = z2 ? cursor.getColumnIndexOrThrow("_id") : -1;
        if ((i & 2) == 2) {
            this.g = new C0017a();
            bVar = new b();
        } else {
            bVar = null;
            this.g = null;
        }
        this.h = bVar;
        if (z2) {
            C0017a c0017a = this.g;
            if (c0017a != null) {
                cursor.registerContentObserver(c0017a);
            }
            DataSetObserver dataSetObserver = this.h;
            if (dataSetObserver != null) {
                cursor.registerDataSetObserver(dataSetObserver);
            }
        }
    }

    public abstract void a(View view, Context context, Cursor cursor);

    public void b(Cursor cursor) {
        Cursor cursor2 = this.f756d;
        if (cursor == cursor2) {
            cursor2 = null;
        } else {
            if (cursor2 != null) {
                C0017a c0017a = this.g;
                if (c0017a != null) {
                    cursor2.unregisterContentObserver(c0017a);
                }
                DataSetObserver dataSetObserver = this.h;
                if (dataSetObserver != null) {
                    cursor2.unregisterDataSetObserver(dataSetObserver);
                }
            }
            this.f756d = cursor;
            if (cursor != null) {
                C0017a c0017a2 = this.g;
                if (c0017a2 != null) {
                    cursor.registerContentObserver(c0017a2);
                }
                DataSetObserver dataSetObserver2 = this.h;
                if (dataSetObserver2 != null) {
                    cursor.registerDataSetObserver(dataSetObserver2);
                }
                this.f = cursor.getColumnIndexOrThrow("_id");
                this.f754b = true;
                notifyDataSetChanged();
            } else {
                this.f = -1;
                this.f754b = false;
                notifyDataSetInvalidated();
            }
        }
        if (cursor2 != null) {
            cursor2.close();
        }
    }

    public abstract CharSequence c(Cursor cursor);

    public abstract View d(Context context, Cursor cursor, ViewGroup viewGroup);

    @Override // android.widget.Adapter
    public int getCount() {
        Cursor cursor;
        if (!this.f754b || (cursor = this.f756d) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (!this.f754b) {
            return null;
        }
        this.f756d.moveToPosition(i);
        if (view == null) {
            c cVar = (c) this;
            view = cVar.l.inflate(cVar.k, viewGroup, false);
        }
        a(view, this.f757e, this.f756d);
        return view;
    }

    @Override // android.widget.Filterable
    public Filter getFilter() {
        if (this.i == null) {
            this.i = new a.h.a.b(this);
        }
        return this.i;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        Cursor cursor;
        if (!this.f754b || (cursor = this.f756d) == null) {
            return null;
        }
        cursor.moveToPosition(i);
        return this.f756d;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        Cursor cursor;
        if (this.f754b && (cursor = this.f756d) != null && cursor.moveToPosition(i)) {
            return this.f756d.getLong(this.f);
        }
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (!this.f754b) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        }
        if (!this.f756d.moveToPosition(i)) {
            throw new IllegalStateException(b.a.a.a.a.a("couldn't move cursor to position ", i));
        }
        if (view == null) {
            view = d(this.f757e, this.f756d, viewGroup);
        }
        a(view, this.f757e, this.f756d);
        return view;
    }
}
