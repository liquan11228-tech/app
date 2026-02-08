package d.n0.n;

import java.io.Closeable;
import java.util.zip.Deflater;

/* loaded from: classes.dex */
public final class a implements Closeable {

    /* renamed from: b, reason: collision with root package name */
    public final e.e f1670b = new e.e();

    /* renamed from: c, reason: collision with root package name */
    public final Deflater f1671c;

    /* renamed from: d, reason: collision with root package name */
    public final e.i f1672d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f1673e;

    public a(boolean z) {
        this.f1673e = z;
        Deflater deflater = new Deflater(-1, true);
        this.f1671c = deflater;
        this.f1672d = new e.i(this.f1670b, deflater);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        this.f1672d.close();
    }
}
