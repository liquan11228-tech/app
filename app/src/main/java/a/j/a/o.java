package a.j.a;

import androidx.fragment.app.Fragment;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public class o extends a.k.p {
    public static final a.k.q h = new a();

    /* renamed from: e, reason: collision with root package name */
    public final boolean f819e;

    /* renamed from: b, reason: collision with root package name */
    public final HashSet<Fragment> f816b = new HashSet<>();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap<String, o> f817c = new HashMap<>();

    /* renamed from: d, reason: collision with root package name */
    public final HashMap<String, a.k.s> f818d = new HashMap<>();
    public boolean f = false;
    public boolean g = false;

    public static class a implements a.k.q {
        public <T extends a.k.p> T a(Class<T> cls) {
            return new o(true);
        }
    }

    public o(boolean z) {
        this.f819e = z;
    }

    @Override // a.k.p
    public void a() {
        boolean z = j.G;
        this.f = true;
    }

    public boolean b(Fragment fragment) {
        if (this.f816b.contains(fragment)) {
            return this.f819e ? this.f : !this.g;
        }
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o.class != obj.getClass()) {
            return false;
        }
        o oVar = (o) obj;
        return this.f816b.equals(oVar.f816b) && this.f817c.equals(oVar.f817c) && this.f818d.equals(oVar.f818d);
    }

    public int hashCode() {
        return this.f818d.hashCode() + ((this.f817c.hashCode() + (this.f816b.hashCode() * 31)) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator<Fragment> it = this.f816b.iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator<String> it2 = this.f817c.keySet().iterator();
        while (it2.hasNext()) {
            sb.append(it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator<String> it3 = this.f818d.keySet().iterator();
        while (it3.hasNext()) {
            sb.append(it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
