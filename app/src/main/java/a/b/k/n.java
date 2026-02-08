package a.b.k;

import a.b.o.a;
import a.g.j.d;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public class n extends Dialog implements f {

    /* renamed from: b */
    public g f40b;

    /* renamed from: c */
    public final d.a f41c;

    public class a implements d.a {
        public a() {
        }

        @Override // a.g.j.d.a
        public boolean h(KeyEvent keyEvent) {
            return n.this.c(keyEvent);
        }
    }

    public n(Context context, int i) {
        int i2;
        if (i == 0) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(a.b.a.dialogTheme, typedValue, true);
            i2 = typedValue.resourceId;
        } else {
            i2 = i;
        }
        super(context, i2);
        this.f41c = new a();
        g gVarA = a();
        if (i == 0) {
            TypedValue typedValue2 = new TypedValue();
            context.getTheme().resolveAttribute(a.b.a.dialogTheme, typedValue2, true);
            i = typedValue2.resourceId;
        }
        ((h) gVarA).O = i;
        gVarA.h(null);
    }

    public g a() {
        if (this.f40b == null) {
            this.f40b = g.e(this, this);
        }
        return this.f40b;
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        a().c(view, layoutParams);
    }

    @Override // a.b.k.f
    public void b(a.b.o.a aVar) {
    }

    public boolean c(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        a().i();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return a.g.j.d.a(this.f41c, getWindow().getDecorView(), this, keyEvent);
    }

    @Override // a.b.k.f
    public void f(a.b.o.a aVar) {
    }

    @Override // android.app.Dialog
    public <T extends View> T findViewById(int i) {
        h hVar = (h) a();
        hVar.z();
        return (T) hVar.f.findViewById(i);
    }

    @Override // a.b.k.f
    public a.b.o.a g(a.InterfaceC0002a interfaceC0002a) {
        return null;
    }

    @Override // android.app.Dialog
    public void invalidateOptionsMenu() {
        a().g();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        a().f();
        super.onCreate(bundle);
        a().h(bundle);
    }

    @Override // android.app.Dialog
    public void onStop() {
        super.onStop();
        h hVar = (h) a();
        hVar.L = false;
        hVar.F();
        a.b.k.a aVar = hVar.i;
        if (aVar != null) {
            aVar.h(false);
        }
    }

    @Override // android.app.Dialog
    public void setContentView(int i) {
        a().l(i);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        a().m(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        a().n(view, layoutParams);
    }

    @Override // android.app.Dialog
    public void setTitle(int i) {
        super.setTitle(i);
        a().o(getContext().getString(i));
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        a().o(charSequence);
    }
}
