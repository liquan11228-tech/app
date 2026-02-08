package d.n0.n;

import e.n;
import e.z;
import java.io.Closeable;
import java.util.zip.Inflater;

/* loaded from: classes.dex */
public final class c implements Closeable {

    /* renamed from: b, reason: collision with root package name */
    public final e.e f1675b = new e.e();

    /* renamed from: c, reason: collision with root package name */
    public final Inflater f1676c;

    /* renamed from: d, reason: collision with root package name */
    public final n f1677d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f1678e;

    public c(boolean z) {
        this.f1678e = z;
        Inflater inflater = new Inflater(true);
        this.f1676c = inflater;
        this.f1677d = new n((z) this.f1675b, inflater);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f1677d.close();
    }
}
