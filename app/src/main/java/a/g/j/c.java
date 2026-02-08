package a.g.j;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final Object f680a;

    public c(Object obj) {
        this.f680a = obj;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        Object obj2 = this.f680a;
        Object obj3 = ((c) obj).f680a;
        return obj2 == null ? obj3 == null : obj2.equals(obj3);
    }

    public int hashCode() {
        Object obj = this.f680a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public String toString() {
        StringBuilder sbE = b.a.a.a.a.e("DisplayCutoutCompat{");
        sbE.append(this.f680a);
        sbE.append("}");
        return sbE.toString();
    }
}
