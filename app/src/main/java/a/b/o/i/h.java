package a.b.o.i;

import a.b.o.i.e;
import a.b.o.i.m;
import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;

/* loaded from: classes.dex */
public class h implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, m.a {

    /* renamed from: b */
    public g f153b;

    /* renamed from: c */
    public a.b.k.d f154c;

    /* renamed from: d */
    public e f155d;

    public h(g gVar) {
        this.f153b = gVar;
    }

    @Override // a.b.o.i.m.a
    public void b(g gVar, boolean z) {
        a.b.k.d dVar;
        if ((z || gVar == this.f153b) && (dVar = this.f154c) != null) {
            dVar.dismiss();
        }
    }

    @Override // a.b.o.i.m.a
    public boolean c(g gVar) {
        return false;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        this.f153b.r(((e.a) this.f155d.a()).getItem(i), 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        e eVar = this.f155d;
        g gVar = this.f153b;
        m.a aVar = eVar.i;
        if (aVar != null) {
            aVar.b(gVar, true);
        }
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f154c.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f154c.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                this.f153b.c(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return this.f153b.performShortcut(i, keyEvent, 0);
    }
}
