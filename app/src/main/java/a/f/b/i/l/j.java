package a.f.b.i.l;

import a.f.b.i.d;
import a.f.b.i.l.f;

/* loaded from: classes.dex */
public class j extends m {
    public static int[] k = new int[2];

    public j(a.f.b.i.d dVar) {
        super(dVar);
        this.h.f505e = f.a.LEFT;
        this.i.f505e = f.a.RIGHT;
        this.f = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:304:0x027e, code lost:
    
        if (r15 != 1) goto L321;
     */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0167  */
    @Override // a.f.b.i.l.m, a.f.b.i.l.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(a.f.b.i.l.d r18) {
        /*
            Method dump skipped, instructions count: 997
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a.f.b.i.l.j.a(a.f.b.i.l.d):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:206:0x01db  */
    @Override // a.f.b.i.l.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void d() {
        /*
            Method dump skipped, instructions count: 991
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a.f.b.i.l.j.d():void");
    }

    @Override // a.f.b.i.l.m
    public void e() {
        f fVar = this.h;
        if (fVar.j) {
            this.f514b.P = fVar.g;
        }
    }

    @Override // a.f.b.i.l.m
    public void f() {
        this.f515c = null;
        this.h.b();
        this.i.b();
        this.f517e.b();
        this.g = false;
    }

    @Override // a.f.b.i.l.m
    public boolean k() {
        return this.f516d != d.a.MATCH_CONSTRAINT || this.f514b.j == 0;
    }

    public final void m(int[] iArr, int i, int i2, int i3, int i4, float f, int i5) {
        int i6 = i2 - i;
        int i7 = i4 - i3;
        if (i5 != -1) {
            if (i5 == 0) {
                iArr[0] = (int) ((i7 * f) + 0.5f);
                iArr[1] = i7;
                return;
            } else {
                if (i5 != 1) {
                    return;
                }
                iArr[0] = i6;
                iArr[1] = (int) ((i6 * f) + 0.5f);
                return;
            }
        }
        int i8 = (int) ((i7 * f) + 0.5f);
        int i9 = (int) ((i6 / f) + 0.5f);
        if (i8 <= i6 && i7 <= i7) {
            iArr[0] = i8;
            iArr[1] = i7;
        } else {
            if (i6 > i6 || i9 > i7) {
                return;
            }
            iArr[0] = i6;
            iArr[1] = i9;
        }
    }

    public void n() {
        this.g = false;
        this.h.b();
        this.h.j = false;
        this.i.b();
        this.i.j = false;
        this.f517e.j = false;
    }

    public String toString() {
        StringBuilder sbE = b.a.a.a.a.e("HorizontalRun ");
        sbE.append(this.f514b.Y);
        return sbE.toString();
    }
}
