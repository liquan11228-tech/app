package c.j.b;

/* JADX WARN: Unexpected interfaces in signature: [java.io.Serializable] */
/* loaded from: classes.dex */
public abstract class e<R> implements Object<R> {
    public e(int i) {
    }

    @Override // java.lang.Object
    public String toString() {
        if (i.f1285a == null) {
            throw null;
        }
        String string = getClass().getGenericInterfaces()[0].toString();
        if (string.startsWith("kotlin.jvm.functions.")) {
            string = string.substring(21);
        }
        d.c(string, "Reflection.renderLambdaToString(this)");
        return string;
    }
}
