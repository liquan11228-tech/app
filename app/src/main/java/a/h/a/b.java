package a.h.a;

import a.b.p.r0;
import android.database.Cursor;
import android.widget.Filter;

/* loaded from: classes.dex */
public class b extends Filter {

    /* renamed from: a */
    public a f760a;

    public interface a {
    }

    public b(a aVar) {
        this.f760a = aVar;
    }

    @Override // android.widget.Filter
    public CharSequence convertResultToString(Object obj) {
        return ((r0) this.f760a).c((Cursor) obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x002f  */
    @Override // android.widget.Filter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.widget.Filter.FilterResults performFiltering(java.lang.CharSequence r5) {
        /*
            r4 = this;
            a.h.a.b$a r0 = r4.f760a
            a.b.p.r0 r0 = (a.b.p.r0) r0
            r1 = 0
            if (r0 == 0) goto L46
            if (r5 != 0) goto Lc
            java.lang.String r5 = ""
            goto L10
        Lc:
            java.lang.String r5 = r5.toString()
        L10:
            androidx.appcompat.widget.SearchView r2 = r0.m
            int r2 = r2.getVisibility()
            if (r2 != 0) goto L2f
            androidx.appcompat.widget.SearchView r2 = r0.m
            int r2 = r2.getWindowVisibility()
            if (r2 == 0) goto L21
            goto L2f
        L21:
            android.app.SearchableInfo r2 = r0.n     // Catch: java.lang.RuntimeException -> L2f
            r3 = 50
            android.database.Cursor r5 = r0.h(r2, r5, r3)     // Catch: java.lang.RuntimeException -> L2f
            if (r5 == 0) goto L2f
            r5.getCount()     // Catch: java.lang.RuntimeException -> L2f
            goto L30
        L2f:
            r5 = r1
        L30:
            android.widget.Filter$FilterResults r0 = new android.widget.Filter$FilterResults
            r0.<init>()
            if (r5 == 0) goto L40
            int r1 = r5.getCount()
            r0.count = r1
            r0.values = r5
            goto L45
        L40:
            r5 = 0
            r0.count = r5
            r0.values = r1
        L45:
            return r0
        L46:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: a.h.a.b.performFiltering(java.lang.CharSequence):android.widget.Filter$FilterResults");
    }

    @Override // android.widget.Filter
    public void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        a aVar = this.f760a;
        Cursor cursor = ((a.h.a.a) aVar).f756d;
        Object obj = filterResults.values;
        if (obj == null || obj == cursor) {
            return;
        }
        ((r0) aVar).b((Cursor) obj);
    }
}
