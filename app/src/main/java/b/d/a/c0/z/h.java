package b.d.a.c0.z;

import b.d.a.a0;
import b.d.a.z;
import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class h extends z<Object> {

    /* renamed from: b, reason: collision with root package name */
    public static final a0 f1177b = new a();

    /* renamed from: a, reason: collision with root package name */
    public final b.d.a.j f1178a;

    public class a implements a0 {
        @Override // b.d.a.a0
        public <T> z<T> a(b.d.a.j jVar, b.d.a.d0.a<T> aVar) {
            if (aVar.f1223a == Object.class) {
                return new h(jVar);
            }
            return null;
        }
    }

    public h(b.d.a.j jVar) {
        this.f1178a = jVar;
    }

    @Override // b.d.a.z
    public Object a(b.d.a.e0.a aVar) throws IOException {
        int iOrdinal = aVar.T().ordinal();
        if (iOrdinal == 0) {
            ArrayList arrayList = new ArrayList();
            aVar.y();
            while (aVar.G()) {
                arrayList.add(a(aVar));
            }
            aVar.C();
            return arrayList;
        }
        if (iOrdinal == 2) {
            b.d.a.c0.s sVar = new b.d.a.c0.s();
            aVar.z();
            while (aVar.G()) {
                sVar.put(aVar.N(), a(aVar));
            }
            aVar.D();
            return sVar;
        }
        if (iOrdinal == 5) {
            return aVar.R();
        }
        if (iOrdinal == 6) {
            return Double.valueOf(aVar.K());
        }
        if (iOrdinal == 7) {
            return Boolean.valueOf(aVar.J());
        }
        if (iOrdinal != 8) {
            throw new IllegalStateException();
        }
        aVar.P();
        return null;
    }

    @Override // b.d.a.z
    public void b(b.d.a.e0.c cVar, Object obj) throws IOException {
        if (obj == null) {
            cVar.G();
            return;
        }
        b.d.a.j jVar = this.f1178a;
        Class<?> cls = obj.getClass();
        if (jVar == null) {
            throw null;
        }
        z zVarC = jVar.c(new b.d.a.d0.a(cls));
        if (!(zVarC instanceof h)) {
            zVarC.b(cVar, obj);
        } else {
            cVar.A();
            cVar.D();
        }
    }
}
