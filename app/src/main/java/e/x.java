package e;

import java.io.Closeable;
import java.io.Flushable;

/* loaded from: classes.dex */
public interface x extends Closeable, Flushable {
    a0 b();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    void e(e eVar, long j);

    void flush();
}
