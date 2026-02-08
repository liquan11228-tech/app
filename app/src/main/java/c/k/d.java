package c.k;

/* loaded from: classes.dex */
public class d {
    public static final a a(int i, int i2) {
        return new a(i, i2, -1);
    }

    public static final a b(a aVar, int i) {
        c.j.b.d.d(aVar, "$this$step");
        boolean z = i > 0;
        Integer numValueOf = Integer.valueOf(i);
        c.j.b.d.d(numValueOf, "step");
        if (z) {
            int i2 = aVar.f1286b;
            int i3 = aVar.f1287c;
            if (aVar.f1288d <= 0) {
                i = -i;
            }
            return new a(i2, i3, i);
        }
        throw new IllegalArgumentException("Step must be positive, was: " + numValueOf + '.');
    }

    public static final c c(int i, int i2) {
        if (i2 > Integer.MIN_VALUE) {
            return new c(i, i2 - 1);
        }
        c cVar = c.f;
        return c.f1293e;
    }
}
