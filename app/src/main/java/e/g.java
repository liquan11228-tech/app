package e;

import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public interface g extends z, ReadableByteChannel {
    e a();

    void g(e eVar, long j);

    String h();

    void k(long j);

    h m(long j);

    String o(long j);

    void p(long j);

    boolean q();

    byte readByte();

    void readFully(byte[] bArr);

    int readInt();

    long readLong();

    short readShort();

    byte[] t(long j);

    long v();

    String w(Charset charset);

    int x(q qVar);
}
