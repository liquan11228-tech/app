package c.h;

import c.j.b.d;
import java.util.Comparator;

/* loaded from: classes.dex */
public final class b implements Comparator<Comparable<? super Object>> {

    /* renamed from: b, reason: collision with root package name */
    public static final b f1276b = new b();

    @Override // java.util.Comparator
    public int compare(Comparable<? super Object> comparable, Comparable<? super Object> comparable2) {
        Comparable<? super Object> comparable3 = comparable;
        Comparable<? super Object> comparable4 = comparable2;
        d.d(comparable3, "a");
        d.d(comparable4, "b");
        return comparable4.compareTo(comparable3);
    }

    @Override // java.util.Comparator
    public final Comparator<Comparable<? super Object>> reversed() {
        return a.f1275b;
    }
}
