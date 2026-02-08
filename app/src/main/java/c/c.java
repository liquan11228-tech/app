package c;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class c<T> implements a<T>, Serializable {

    /* renamed from: b, reason: collision with root package name */
    public c.j.a.a<? extends T> f1256b;

    /* renamed from: c, reason: collision with root package name */
    public volatile Object f1257c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f1258d;

    public c(c.j.a.a aVar, Object obj, int i) {
        int i2 = i & 2;
        c.j.b.d.d(aVar, "initializer");
        this.f1256b = aVar;
        this.f1257c = d.f1259a;
        this.f1258d = this;
    }

    @Override // c.a
    public T getValue() {
        T tC;
        T t = (T) this.f1257c;
        if (t != d.f1259a) {
            return t;
        }
        synchronized (this.f1258d) {
            tC = (T) this.f1257c;
            if (tC == d.f1259a) {
                c.j.a.a<? extends T> aVar = this.f1256b;
                c.j.b.d.b(aVar);
                tC = aVar.c();
                this.f1257c = tC;
                this.f1256b = null;
            }
        }
        return tC;
    }

    public String toString() {
        return this.f1257c != d.f1259a ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
