package a.f.b;

/* JADX WARN: Unexpected interfaces in signature: [a.f.b.e<T>] */
/* loaded from: classes.dex */
public class e<T> {

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f446a;

    /* renamed from: b, reason: collision with root package name */
    public int f447b;

    public e(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.f446a = new Object[i];
    }

    public T a() {
        int i = this.f447b;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        Object[] objArr = this.f446a;
        T t = (T) objArr[i2];
        objArr[i2] = null;
        this.f447b = i - 1;
        return t;
    }

    public boolean b(T t) {
        int i = this.f447b;
        Object[] objArr = this.f446a;
        if (i >= objArr.length) {
            return false;
        }
        objArr[i] = t;
        this.f447b = i + 1;
        return true;
    }
}
