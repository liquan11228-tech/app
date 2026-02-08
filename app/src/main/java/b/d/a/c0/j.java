package b.d.a.c0;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.EnumSet;

/* loaded from: classes.dex */
public class j<T> implements t<T> {

    /* renamed from: a */
    public final /* synthetic */ Type f1130a;

    public j(g gVar, Type type) {
        this.f1130a = type;
    }

    @Override // b.d.a.c0.t
    public T a() {
        Type type = this.f1130a;
        if (!(type instanceof ParameterizedType)) {
            StringBuilder sbE = b.a.a.a.a.e("Invalid EnumSet type: ");
            sbE.append(this.f1130a.toString());
            throw new b.d.a.p(sbE.toString());
        }
        Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
        if (type2 instanceof Class) {
            return (T) EnumSet.noneOf((Class) type2);
        }
        StringBuilder sbE2 = b.a.a.a.a.e("Invalid EnumSet type: ");
        sbE2.append(this.f1130a.toString());
        throw new b.d.a.p(sbE2.toString());
    }
}
