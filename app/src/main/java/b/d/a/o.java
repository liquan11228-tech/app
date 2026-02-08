package b.d.a;

import java.io.IOException;
import java.io.StringWriter;

/* loaded from: classes.dex */
public abstract class o {
    public t a() {
        if (this instanceof t) {
            return (t) this;
        }
        throw new IllegalStateException("Not a JSON Primitive: " + this);
    }

    public String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            b.d.a.e0.c cVar = new b.d.a.e0.c(stringWriter);
            cVar.g = true;
            b.d.a.c0.z.o.X.b(cVar, this);
            return stringWriter.toString();
        } catch (IOException e2) {
            throw new AssertionError(e2);
        }
    }
}
