package a.b.k;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController;
import androidx.core.widget.NestedScrollView;

/* loaded from: classes.dex */
public class d extends n implements DialogInterface {

    /* renamed from: d */
    public final AlertController f7d;

    public static class a {

        /* renamed from: a */
        public final AlertController.b f8a;

        /* renamed from: b */
        public final int f9b;

        public a(Context context) {
            int iD = d.d(context, 0);
            this.f8a = new AlertController.b(new ContextThemeWrapper(context, d.d(context, iD)));
            this.f9b = iD;
        }

        public d a() {
            d dVar = new d(this.f8a.f930a, this.f9b);
            AlertController.b bVar = this.f8a;
            AlertController alertController = dVar.f7d;
            View view = bVar.g;
            if (view != null) {
                alertController.G = view;
            } else {
                CharSequence charSequence = bVar.f;
                if (charSequence != null) {
                    alertController.f926e = charSequence;
                    TextView textView = alertController.E;
                    if (textView != null) {
                        textView.setText(charSequence);
                    }
                }
                Drawable drawable = bVar.f933d;
                if (drawable != null) {
                    alertController.C = drawable;
                    alertController.B = 0;
                    ImageView imageView = alertController.D;
                    if (imageView != null) {
                        imageView.setVisibility(0);
                        alertController.D.setImageDrawable(drawable);
                    }
                }
                int i = bVar.f932c;
                if (i != 0) {
                    alertController.e(i);
                }
                int i2 = bVar.f934e;
                if (i2 != 0) {
                    if (alertController == null) {
                        throw null;
                    }
                    TypedValue typedValue = new TypedValue();
                    alertController.f922a.getTheme().resolveAttribute(i2, typedValue, true);
                    alertController.e(typedValue.resourceId);
                }
            }
            if (bVar.l != null) {
                AlertController.RecycleListView recycleListView = (AlertController.RecycleListView) bVar.f931b.inflate(alertController.L, (ViewGroup) null);
                int i3 = bVar.o ? alertController.N : alertController.O;
                ListAdapter dVar2 = bVar.l;
                if (dVar2 == null) {
                    dVar2 = new AlertController.d(bVar.f930a, i3, R.id.text1, null);
                }
                alertController.H = dVar2;
                alertController.I = bVar.p;
                if (bVar.m != null) {
                    recycleListView.setOnItemClickListener(new c(bVar, alertController));
                }
                if (bVar.o) {
                    recycleListView.setChoiceMode(1);
                }
                alertController.g = recycleListView;
            }
            dVar.setCancelable(this.f8a.h);
            if (this.f8a.h) {
                dVar.setCanceledOnTouchOutside(true);
            }
            dVar.setOnCancelListener(this.f8a.i);
            dVar.setOnDismissListener(this.f8a.j);
            DialogInterface.OnKeyListener onKeyListener = this.f8a.k;
            if (onKeyListener != null) {
                dVar.setOnKeyListener(onKeyListener);
            }
            return dVar;
        }
    }

    public d(Context context, int i) {
        super(context, d(context, i));
        this.f7d = new AlertController(getContext(), this, getWindow());
    }

    public static int d(Context context, int i) {
        if (((i >>> 24) & 255) >= 1) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(a.b.a.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    /* JADX WARN: Removed duplicated region for block: B:311:0x02ea A[PHI: r4
  0x02ea: PHI (r4v7 android.view.View) = (r4v6 android.view.View), (r4v13 android.view.View) binds: [B:310:0x02e8, B:307:0x02df] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // a.b.k.n, android.app.Dialog
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onCreate(android.os.Bundle r17) {
        /*
            Method dump skipped, instructions count: 862
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a.b.k.d.onCreate(android.os.Bundle):void");
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f7d.A;
        if (nestedScrollView != null && nestedScrollView.h(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f7d.A;
        if (nestedScrollView != null && nestedScrollView.h(keyEvent)) {
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }

    @Override // a.b.k.n, android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        AlertController alertController = this.f7d;
        alertController.f926e = charSequence;
        TextView textView = alertController.E;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }
}
