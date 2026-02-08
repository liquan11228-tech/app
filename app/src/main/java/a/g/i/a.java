package a.g.i;

import java.io.Writer;

@Deprecated
/* loaded from: classes.dex */
public class a extends Writer {

    /* renamed from: b, reason: collision with root package name */
    public final String f673b;

    /* renamed from: c, reason: collision with root package name */
    public StringBuilder f674c = new StringBuilder(128);

    public a(String str) {
        this.f673b = str;
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        y();
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
        y();
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c2 = cArr[i + i3];
            if (c2 == '\n') {
                y();
            } else {
                this.f674c.append(c2);
            }
        }
    }

    public final void y() {
        if (this.f674c.length() > 0) {
            this.f674c.toString();
            StringBuilder sb = this.f674c;
            sb.delete(0, sb.length());
        }
    }
}
