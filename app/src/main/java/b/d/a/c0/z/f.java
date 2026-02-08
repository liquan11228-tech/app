package b.d.a.c0.z;

import b.d.a.t;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class f extends b.d.a.e0.c {
    public static final Writer p = new a();
    public static final t q = new t("closed");
    public final List<b.d.a.o> m;
    public String n;
    public b.d.a.o o;

    public class a extends Writer {
        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            throw new AssertionError();
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() {
            throw new AssertionError();
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i, int i2) {
            throw new AssertionError();
        }
    }

    public f() {
        super(p);
        this.m = new ArrayList();
        this.o = b.d.a.q.f1247a;
    }

    @Override // b.d.a.e0.c
    public b.d.a.e0.c A() {
        b.d.a.r rVar = new b.d.a.r();
        S(rVar);
        this.m.add(rVar);
        return this;
    }

    @Override // b.d.a.e0.c
    public b.d.a.e0.c C() {
        if (this.m.isEmpty() || this.n != null) {
            throw new IllegalStateException();
        }
        if (!(R() instanceof b.d.a.l)) {
            throw new IllegalStateException();
        }
        this.m.remove(r0.size() - 1);
        return this;
    }

    @Override // b.d.a.e0.c
    public b.d.a.e0.c D() {
        if (this.m.isEmpty() || this.n != null) {
            throw new IllegalStateException();
        }
        if (!(R() instanceof b.d.a.r)) {
            throw new IllegalStateException();
        }
        this.m.remove(r0.size() - 1);
        return this;
    }

    @Override // b.d.a.e0.c
    public b.d.a.e0.c E(String str) {
        if (this.m.isEmpty() || this.n != null) {
            throw new IllegalStateException();
        }
        if (!(R() instanceof b.d.a.r)) {
            throw new IllegalStateException();
        }
        this.n = str;
        return this;
    }

    @Override // b.d.a.e0.c
    public b.d.a.e0.c G() {
        S(b.d.a.q.f1247a);
        return this;
    }

    @Override // b.d.a.e0.c
    public b.d.a.e0.c L(long j) {
        S(new t(Long.valueOf(j)));
        return this;
    }

    @Override // b.d.a.e0.c
    public b.d.a.e0.c M(Boolean bool) {
        if (bool == null) {
            S(b.d.a.q.f1247a);
            return this;
        }
        S(new t(bool));
        return this;
    }

    @Override // b.d.a.e0.c
    public b.d.a.e0.c N(Number number) {
        if (number == null) {
            S(b.d.a.q.f1247a);
            return this;
        }
        if (!this.g) {
            double dDoubleValue = number.doubleValue();
            if (Double.isNaN(dDoubleValue) || Double.isInfinite(dDoubleValue)) {
                throw new IllegalArgumentException("JSON forbids NaN and infinities: " + number);
            }
        }
        S(new t(number));
        return this;
    }

    @Override // b.d.a.e0.c
    public b.d.a.e0.c O(String str) {
        if (str == null) {
            S(b.d.a.q.f1247a);
            return this;
        }
        S(new t(str));
        return this;
    }

    @Override // b.d.a.e0.c
    public b.d.a.e0.c P(boolean z) {
        S(new t(Boolean.valueOf(z)));
        return this;
    }

    public final b.d.a.o R() {
        return this.m.get(r0.size() - 1);
    }

    public final void S(b.d.a.o oVar) {
        if (this.n != null) {
            if (!(oVar instanceof b.d.a.q) || this.j) {
                b.d.a.r rVar = (b.d.a.r) R();
                rVar.f1248a.put(this.n, oVar);
            }
            this.n = null;
            return;
        }
        if (this.m.isEmpty()) {
            this.o = oVar;
            return;
        }
        b.d.a.o oVarR = R();
        if (!(oVarR instanceof b.d.a.l)) {
            throw new IllegalStateException();
        }
        ((b.d.a.l) oVarR).f1246b.add(oVar);
    }

    @Override // b.d.a.e0.c, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (!this.m.isEmpty()) {
            throw new IOException("Incomplete document");
        }
        this.m.add(q);
    }

    @Override // b.d.a.e0.c, java.io.Flushable
    public void flush() {
    }

    @Override // b.d.a.e0.c
    public b.d.a.e0.c z() {
        b.d.a.l lVar = new b.d.a.l();
        S(lVar);
        this.m.add(lVar);
        return this;
    }
}
