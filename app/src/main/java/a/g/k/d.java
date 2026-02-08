package a.g.k;

import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class d implements ActionMode.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final ActionMode.Callback f749a;

    /* renamed from: b, reason: collision with root package name */
    public final TextView f750b;

    /* renamed from: c, reason: collision with root package name */
    public Class<?> f751c;

    /* renamed from: d, reason: collision with root package name */
    public Method f752d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f753e;
    public boolean f = false;

    public d(ActionMode.Callback callback, TextView textView) {
        this.f749a = callback;
        this.f750b = textView;
    }

    @Override // android.view.ActionMode.Callback
    public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        return this.f749a.onActionItemClicked(actionMode, menuItem);
    }

    @Override // android.view.ActionMode.Callback
    public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        return this.f749a.onCreateActionMode(actionMode, menu);
    }

    @Override // android.view.ActionMode.Callback
    public void onDestroyActionMode(ActionMode actionMode) {
        this.f749a.onDestroyActionMode(actionMode);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00ce  */
    @Override // android.view.ActionMode.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onPrepareActionMode(android.view.ActionMode r13, android.view.Menu r14) throws java.lang.IllegalAccessException, java.lang.ClassNotFoundException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 304
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a.g.k.d.onPrepareActionMode(android.view.ActionMode, android.view.Menu):boolean");
    }
}
