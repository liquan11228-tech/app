package b.d.a;

import java.io.IOException;

/* loaded from: classes.dex */
public class f extends z<Number> {
    public f(j jVar) {
    }

    @Override // b.d.a.z
    public Number a(b.d.a.e0.a aVar) throws IOException {
        if (aVar.T() != b.d.a.e0.b.NULL) {
            return Float.valueOf((float) aVar.K());
        }
        aVar.P();
        return null;
    }

    @Override // b.d.a.z
    public void b(b.d.a.e0.c cVar, Number number) throws IOException {
        Number number2 = number;
        if (number2 == null) {
            cVar.G();
        } else {
            j.a(number2.floatValue());
            cVar.N(number2);
        }
    }
}
