package b.d.a;

import java.io.IOException;

/* loaded from: classes.dex */
public class e extends z<Number> {
    public e(j jVar) {
    }

    @Override // b.d.a.z
    public Number a(b.d.a.e0.a aVar) throws IOException {
        if (aVar.T() != b.d.a.e0.b.NULL) {
            return Double.valueOf(aVar.K());
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
            j.a(number2.doubleValue());
            cVar.N(number2);
        }
    }
}
