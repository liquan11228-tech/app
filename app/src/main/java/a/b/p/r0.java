package a.b.p;

import android.R;
import android.annotation.SuppressLint;
import android.app.SearchableInfo;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.WeakHashMap;

@SuppressLint({"RestrictedAPI"})
/* loaded from: classes.dex */
public class r0 extends a.h.a.c implements View.OnClickListener {
    public final SearchView m;
    public final SearchableInfo n;
    public final Context o;
    public final WeakHashMap<String, Drawable.ConstantState> p;
    public final int q;
    public boolean r;
    public int s;
    public ColorStateList t;
    public int u;
    public int v;
    public int w;
    public int x;
    public int y;
    public int z;

    public static final class a {

        /* renamed from: a */
        public final TextView f298a;

        /* renamed from: b */
        public final TextView f299b;

        /* renamed from: c */
        public final ImageView f300c;

        /* renamed from: d */
        public final ImageView f301d;

        /* renamed from: e */
        public final ImageView f302e;

        public a(View view) {
            this.f298a = (TextView) view.findViewById(R.id.text1);
            this.f299b = (TextView) view.findViewById(R.id.text2);
            this.f300c = (ImageView) view.findViewById(R.id.icon1);
            this.f301d = (ImageView) view.findViewById(R.id.icon2);
            this.f302e = (ImageView) view.findViewById(a.b.f.edit_query);
        }
    }

    public r0(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap<String, Drawable.ConstantState> weakHashMap) {
        super(context, searchView.getSuggestionRowLayout(), null, true);
        this.r = false;
        this.s = 1;
        this.u = -1;
        this.v = -1;
        this.w = -1;
        this.x = -1;
        this.y = -1;
        this.z = -1;
        this.m = searchView;
        this.n = searchableInfo;
        this.q = searchView.getSuggestionCommitIconResId();
        this.o = context;
        this.p = weakHashMap;
    }

    public static String e(Cursor cursor, String str) {
        return i(cursor, cursor.getColumnIndex(str));
    }

    public static String i(Cursor cursor, int i) {
        if (i == -1) {
            return null;
        }
        try {
            return cursor.getString(i);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x012a  */
    @Override // a.h.a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(android.view.View r19, android.content.Context r20, android.database.Cursor r21) throws android.content.pm.PackageManager.NameNotFoundException, java.lang.NumberFormatException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 418
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a.b.p.r0.a(android.view.View, android.content.Context, android.database.Cursor):void");
    }

    @Override // a.h.a.a
    public void b(Cursor cursor) {
        if (this.r) {
            if (cursor != null) {
                cursor.close();
                return;
            }
            return;
        }
        try {
            super.b(cursor);
            if (cursor != null) {
                this.u = cursor.getColumnIndex("suggest_text_1");
                this.v = cursor.getColumnIndex("suggest_text_2");
                this.w = cursor.getColumnIndex("suggest_text_2_url");
                this.x = cursor.getColumnIndex("suggest_icon_1");
                this.y = cursor.getColumnIndex("suggest_icon_2");
                this.z = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception unused) {
        }
    }

    @Override // a.h.a.a
    public CharSequence c(Cursor cursor) {
        String strI;
        String strI2;
        if (cursor == null) {
            return null;
        }
        String strI3 = i(cursor, cursor.getColumnIndex("suggest_intent_query"));
        if (strI3 != null) {
            return strI3;
        }
        if (this.n.shouldRewriteQueryFromData() && (strI2 = i(cursor, cursor.getColumnIndex("suggest_intent_data"))) != null) {
            return strI2;
        }
        if (!this.n.shouldRewriteQueryFromText() || (strI = i(cursor, cursor.getColumnIndex("suggest_text_1"))) == null) {
            return null;
        }
        return strI;
    }

    @Override // a.h.a.c, a.h.a.a
    public View d(Context context, Cursor cursor, ViewGroup viewGroup) {
        View viewInflate = this.l.inflate(this.j, viewGroup, false);
        viewInflate.setTag(new a(viewInflate));
        ((ImageView) viewInflate.findViewById(a.b.f.edit_query)).setImageResource(this.q);
        return viewInflate;
    }

    public Drawable f(Uri uri) throws PackageManager.NameNotFoundException, NumberFormatException, FileNotFoundException {
        int identifier;
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            throw new FileNotFoundException("No authority: " + uri);
        }
        try {
            Resources resourcesForApplication = this.f757e.getPackageManager().getResourcesForApplication(authority);
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments == null) {
                throw new FileNotFoundException("No path: " + uri);
            }
            int size = pathSegments.size();
            if (size == 1) {
                try {
                    identifier = Integer.parseInt(pathSegments.get(0));
                } catch (NumberFormatException unused) {
                    throw new FileNotFoundException("Single path segment is not a resource ID: " + uri);
                }
            } else {
                if (size != 2) {
                    throw new FileNotFoundException("More than two path segments: " + uri);
                }
                identifier = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
            }
            if (identifier != 0) {
                return resourcesForApplication.getDrawable(identifier);
            }
            throw new FileNotFoundException("No resource found for: " + uri);
        } catch (PackageManager.NameNotFoundException unused2) {
            throw new FileNotFoundException("No package found for authority: " + uri);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x010c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.drawable.Drawable g(java.lang.String r6) throws android.content.pm.PackageManager.NameNotFoundException, java.lang.NumberFormatException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 278
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a.b.p.r0.g(java.lang.String):android.graphics.drawable.Drawable");
    }

    @Override // a.h.a.a, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i, view, viewGroup);
        } catch (RuntimeException e2) {
            View viewInflate = this.l.inflate(this.k, viewGroup, false);
            if (viewInflate != null) {
                ((a) viewInflate.getTag()).f298a.setText(e2.toString());
            }
            return viewInflate;
        }
    }

    @Override // a.h.a.a, android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i, view, viewGroup);
        } catch (RuntimeException e2) {
            View viewD = d(this.f757e, this.f756d, viewGroup);
            ((a) viewD.getTag()).f298a.setText(e2.toString());
            return viewD;
        }
    }

    public Cursor h(SearchableInfo searchableInfo, String str, int i) {
        String suggestAuthority;
        String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder builderFragment = new Uri.Builder().scheme("content").authority(suggestAuthority).query("").fragment("");
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            builderFragment.appendEncodedPath(suggestPath);
        }
        builderFragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            builderFragment.appendPath(str);
        }
        String[] strArr2 = strArr;
        if (i > 0) {
            builderFragment.appendQueryParameter("limit", String.valueOf(i));
        }
        return this.f757e.getContentResolver().query(builderFragment.build(), null, suggestSelection, strArr2, null);
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return false;
    }

    public final void j(Cursor cursor) {
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras == null || extras.getBoolean("in_progress")) {
        }
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        j(this.f756d);
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        j(this.f756d);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.m.x((CharSequence) tag);
        }
    }
}
