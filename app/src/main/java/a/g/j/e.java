package a.g.j;

import a.b.k.h;
import android.view.View;
import android.view.ViewParent;

/* loaded from: classes.dex */
public class e {

    /* renamed from: a */
    public ViewParent f685a;

    /* renamed from: b */
    public ViewParent f686b;

    /* renamed from: c */
    public final View f687c;

    /* renamed from: d */
    public boolean f688d;

    /* renamed from: e */
    public int[] f689e;

    public e(View view) {
        this.f687c = view;
    }

    public final boolean a(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        ViewParent viewParentB;
        int i6;
        int i7;
        int[] iArr3;
        if (!this.f688d || (viewParentB = b(i5)) == null) {
            return false;
        }
        if (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
            }
            return false;
        }
        if (iArr != null) {
            this.f687c.getLocationInWindow(iArr);
            i6 = iArr[0];
            i7 = iArr[1];
        } else {
            i6 = 0;
            i7 = 0;
        }
        if (iArr2 == null) {
            if (this.f689e == null) {
                this.f689e = new int[2];
            }
            int[] iArr4 = this.f689e;
            iArr4[0] = 0;
            iArr4[1] = 0;
            iArr3 = iArr4;
        } else {
            iArr3 = iArr2;
        }
        h.i.M(viewParentB, this.f687c, i, i2, i3, i4, i5, iArr3);
        if (iArr != null) {
            this.f687c.getLocationInWindow(iArr);
            iArr[0] = iArr[0] - i6;
            iArr[1] = iArr[1] - i7;
        }
        return true;
    }

    public final ViewParent b(int i) {
        if (i == 0) {
            return this.f685a;
        }
        if (i != 1) {
            return null;
        }
        return this.f686b;
    }
}
