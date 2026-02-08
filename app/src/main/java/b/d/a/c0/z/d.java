package b.d.a.c0.z;

import b.d.a.a0;
import b.d.a.v;
import b.d.a.y;
import b.d.a.z;

/* loaded from: classes.dex */
public final class d implements a0 {

    /* renamed from: b, reason: collision with root package name */
    public final b.d.a.c0.g f1170b;

    public d(b.d.a.c0.g gVar) {
        this.f1170b = gVar;
    }

    @Override // b.d.a.a0
    public <T> z<T> a(b.d.a.j jVar, b.d.a.d0.a<T> aVar) {
        b.d.a.b0.a aVar2 = (b.d.a.b0.a) aVar.f1223a.getAnnotation(b.d.a.b0.a.class);
        if (aVar2 == null) {
            return null;
        }
        return (z<T>) b(this.f1170b, jVar, aVar, aVar2);
    }

    public z<?> b(b.d.a.c0.g gVar, b.d.a.j jVar, b.d.a.d0.a<?> aVar, b.d.a.b0.a aVar2) {
        z<?> mVar;
        Object objA = gVar.a(new b.d.a.d0.a(aVar2.value())).a();
        if (objA instanceof z) {
            mVar = (z) objA;
        } else if (objA instanceof a0) {
            mVar = ((a0) objA).a(jVar, aVar);
        } else {
            boolean z = objA instanceof v;
            if (!z && !(objA instanceof b.d.a.n)) {
                StringBuilder sbE = b.a.a.a.a.e("Invalid attempt to bind an instance of ");
                sbE.append(objA.getClass().getName());
                sbE.append(" as a @JsonAdapter for ");
                sbE.append(aVar.toString());
                sbE.append(". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
                throw new IllegalArgumentException(sbE.toString());
            }
            mVar = new m<>(z ? (v) objA : null, objA instanceof b.d.a.n ? (b.d.a.n) objA : null, jVar, aVar, null);
        }
        return (mVar == null || !aVar2.nullSafe()) ? mVar : new y(mVar);
    }
}
