package d.n0.k.i;

import d.c0;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final CopyOnWriteArraySet<Logger> f1649a = new CopyOnWriteArraySet<>();

    /* renamed from: b, reason: collision with root package name */
    public static final Map<String, String> f1650b;

    /* renamed from: c, reason: collision with root package name */
    public static final c f1651c = null;

    static {
        Map<String, String> mapSingletonMap;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Package r1 = c0.class.getPackage();
        String name = r1 != null ? r1.getName() : null;
        if (name != null) {
            linkedHashMap.put(name, "OkHttp");
        }
        String name2 = c0.class.getName();
        c.j.b.d.c(name2, "OkHttpClient::class.java.name");
        linkedHashMap.put(name2, "okhttp.OkHttpClient");
        String name3 = d.n0.j.e.class.getName();
        c.j.b.d.c(name3, "Http2::class.java.name");
        linkedHashMap.put(name3, "okhttp.Http2");
        String name4 = d.n0.f.d.class.getName();
        c.j.b.d.c(name4, "TaskRunner::class.java.name");
        linkedHashMap.put(name4, "okhttp.TaskRunner");
        linkedHashMap.put("okhttp3.mockwebserver.MockWebServer", "okhttp.MockWebServer");
        c.j.b.d.d(linkedHashMap, "$this$toMap");
        int size = linkedHashMap.size();
        if (size == 0) {
            mapSingletonMap = c.g.i.f1273b;
        } else if (size != 1) {
            c.j.b.d.d(linkedHashMap, "$this$toMutableMap");
            mapSingletonMap = new LinkedHashMap<>(linkedHashMap);
        } else {
            c.j.b.d.d(linkedHashMap, "$this$toSingletonMap");
            Map.Entry entry = (Map.Entry) linkedHashMap.entrySet().iterator().next();
            mapSingletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
            c.j.b.d.c(mapSingletonMap, "with(entries.iterator().…ingletonMap(key, value) }");
        }
        f1650b = mapSingletonMap;
    }
}
