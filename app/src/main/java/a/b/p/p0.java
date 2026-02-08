package a.b.p;

/* loaded from: classes.dex */
public class p0 {

    /* renamed from: a, reason: collision with root package name */
    public int f281a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f282b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f283c = Integer.MIN_VALUE;

    /* renamed from: d, reason: collision with root package name */
    public int f284d = Integer.MIN_VALUE;

    /* renamed from: e, reason: collision with root package name */
    public int f285e = 0;
    public int f = 0;
    public boolean g = false;
    public boolean h = false;

    public void a(int i, int i2) {
        this.f283c = i;
        this.f284d = i2;
        this.h = true;
        if (this.g) {
            if (i2 != Integer.MIN_VALUE) {
                this.f281a = i2;
            }
            if (i != Integer.MIN_VALUE) {
                this.f282b = i;
                return;
            }
            return;
        }
        if (i != Integer.MIN_VALUE) {
            this.f281a = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f282b = i2;
        }
    }
}
