package b.d.a.c0;

import java.lang.reflect.Type;
import java.util.Map;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final Map<Type, b.d.a.k<?>> f1123a;

    /* renamed from: b, reason: collision with root package name */
    public final b.d.a.c0.a0.b f1124b = b.d.a.c0.a0.b.f1116a;

    /* JADX INFO: Add missing generic type declarations: [T] */
    public class a<T> implements t<T> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b.d.a.k f1125a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Type f1126b;

        public a(g gVar, b.d.a.k kVar, Type type) {
            this.f1125a = kVar;
            this.f1126b = type;
        }

        @Override // b.d.a.c0.t
        public T a() {
            return (T) this.f1125a.a(this.f1126b);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public class b<T> implements t<T> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b.d.a.k f1127a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Type f1128b;

        public b(g gVar, b.d.a.k kVar, Type type) {
            this.f1127a = kVar;
            this.f1128b = type;
        }

        @Override // b.d.a.c0.t
        public T a() {
            return (T) this.f1127a.a(this.f1128b);
        }
    }

    public g(Map<Type, b.d.a.k<?>> map) {
        this.f1123a = map;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00e5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public <T> b.d.a.c0.t<T> a(b.d.a.d0.a<T> r6) throws java.lang.NoSuchMethodException, java.lang.SecurityException {
        /*
            Method dump skipped, instructions count: 243
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: b.d.a.c0.g.a(b.d.a.d0.a):b.d.a.c0.t");
    }

    public String toString() {
        return this.f1123a.toString();
    }
}
