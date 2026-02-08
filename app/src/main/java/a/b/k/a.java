package a.b.k;

import a.b.o.a;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a.b.k.a$a, reason: collision with other inner class name */
    public static class C0000a extends ViewGroup.MarginLayoutParams {

        /* renamed from: a, reason: collision with root package name */
        public int f2a;

        public C0000a(int i, int i2) {
            super(i, i2);
            this.f2a = 0;
            this.f2a = 8388627;
        }

        public C0000a(C0000a c0000a) {
            super((ViewGroup.MarginLayoutParams) c0000a);
            this.f2a = 0;
            this.f2a = c0000a.f2a;
        }

        public C0000a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f2a = 0;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.b.j.ActionBarLayout);
            this.f2a = typedArrayObtainStyledAttributes.getInt(a.b.j.ActionBarLayout_android_layout_gravity, 0);
            typedArrayObtainStyledAttributes.recycle();
        }

        public C0000a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f2a = 0;
        }
    }

    public interface b {
        void a(boolean z);
    }

    @Deprecated
    public static abstract class c {
        public abstract void a();
    }

    public abstract boolean a();

    public abstract void b(boolean z);

    public abstract int c();

    public abstract Context d();

    public abstract void e(Configuration configuration);

    public abstract boolean f(int i, KeyEvent keyEvent);

    public abstract void g(boolean z);

    public abstract void h(boolean z);

    public abstract void i(CharSequence charSequence);

    public abstract a.b.o.a j(a.InterfaceC0002a interfaceC0002a);
}
