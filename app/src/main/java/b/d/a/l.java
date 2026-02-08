package b.d.a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class l extends o implements Iterable<o> {

    /* renamed from: b, reason: collision with root package name */
    public final List<o> f1246b = new ArrayList();

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof l) && ((l) obj).f1246b.equals(this.f1246b));
    }

    public int hashCode() {
        return this.f1246b.hashCode();
    }

    @Override // java.lang.Iterable
    public Iterator<o> iterator() {
        return this.f1246b.iterator();
    }
}
