package c.k;

import c.g.k;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class b extends k {

    /* renamed from: b, reason: collision with root package name */
    public final int f1289b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1290c;

    /* renamed from: d, reason: collision with root package name */
    public int f1291d;

    /* renamed from: e, reason: collision with root package name */
    public final int f1292e;

    public b(int i, int i2, int i3) {
        this.f1292e = i3;
        this.f1289b = i2;
        boolean z = true;
        if (i3 <= 0 ? i < i2 : i > i2) {
            z = false;
        }
        this.f1290c = z;
        this.f1291d = z ? i : this.f1289b;
    }

    @Override // c.g.k
    public int a() {
        int i = this.f1291d;
        if (i != this.f1289b) {
            this.f1291d = this.f1292e + i;
        } else {
            if (!this.f1290c) {
                throw new NoSuchElementException();
            }
            this.f1290c = false;
        }
        return i;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f1290c;
    }
}
