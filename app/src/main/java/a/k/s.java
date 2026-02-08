package a.k;

import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class s {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap<String, p> f886a = new HashMap<>();

    public final void a() {
        for (p pVar : this.f886a.values()) {
            Map<String, Object> map = pVar.f885a;
            if (map != null) {
                synchronized (map) {
                    for (Object obj : pVar.f885a.values()) {
                        if (obj instanceof Closeable) {
                            try {
                                ((Closeable) obj).close();
                            } catch (IOException e2) {
                                throw new RuntimeException(e2);
                            }
                        }
                    }
                }
            }
            pVar.a();
        }
        this.f886a.clear();
    }
}
