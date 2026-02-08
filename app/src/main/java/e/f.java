package e;

import java.nio.channels.WritableByteChannel;

/* loaded from: classes.dex */
public interface f extends x, WritableByteChannel {
    e a();

    f c(byte[] bArr);

    f d(int i);

    f f(h hVar);

    @Override // e.x, java.io.Flushable
    void flush();

    f i();

    f j(long j);

    f n(String str);

    f r(int i);

    f s();

    f u(int i);
}
