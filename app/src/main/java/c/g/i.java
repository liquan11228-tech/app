package c.g;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class i implements Map, Serializable, c.j.b.l.a {

    /* renamed from: b, reason: collision with root package name */
    public static final i f1273b = new i();

    @Override // java.util.Map
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return false;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        if (obj instanceof Void) {
            c.j.b.d.d((Void) obj, "value");
        }
        return false;
    }

    @Override // java.util.Map
    public final Set<Map.Entry> entrySet() {
        return j.f1274b;
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        return (obj instanceof Map) && ((Map) obj).isEmpty();
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        return null;
    }

    @Override // java.util.Map
    public int hashCode() {
        return 0;
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return true;
    }

    @Override // java.util.Map
    public final Set<Object> keySet() {
        return j.f1274b;
    }

    @Override // java.util.Map
    public /* synthetic */ Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public void putAll(Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public Object remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final int size() {
        return 0;
    }

    public String toString() {
        return "{}";
    }

    @Override // java.util.Map
    public final Collection values() {
        return h.f1272b;
    }
}
