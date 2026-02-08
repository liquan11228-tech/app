package b.d.a.c0.z;

import b.d.a.t;
import java.io.Reader;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class e extends b.d.a.e0.a {
    public static final Object v;
    public Object[] r;
    public int s;
    public String[] t;
    public int[] u;

    public class a extends Reader {
        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            throw new AssertionError();
        }

        @Override // java.io.Reader
        public int read(char[] cArr, int i, int i2) {
            throw new AssertionError();
        }
    }

    static {
        new a();
        v = new Object();
    }

    private String I() {
        StringBuilder sbE = b.a.a.a.a.e(" at path ");
        sbE.append(F());
        return sbE.toString();
    }

    @Override // b.d.a.e0.a
    public void C() {
        a0(b.d.a.e0.b.END_ARRAY);
        c0();
        c0();
        int i = this.s;
        if (i > 0) {
            int[] iArr = this.u;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    @Override // b.d.a.e0.a
    public void D() {
        a0(b.d.a.e0.b.END_OBJECT);
        c0();
        c0();
        int i = this.s;
        if (i > 0) {
            int[] iArr = this.u;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    @Override // b.d.a.e0.a
    public String F() {
        StringBuilder sb = new StringBuilder();
        sb.append('$');
        int i = 0;
        while (i < this.s) {
            Object[] objArr = this.r;
            if (objArr[i] instanceof b.d.a.l) {
                i++;
                if (objArr[i] instanceof Iterator) {
                    sb.append('[');
                    sb.append(this.u[i]);
                    sb.append(']');
                }
            } else if (objArr[i] instanceof b.d.a.r) {
                i++;
                if (objArr[i] instanceof Iterator) {
                    sb.append('.');
                    String[] strArr = this.t;
                    if (strArr[i] != null) {
                        sb.append(strArr[i]);
                    }
                }
            }
            i++;
        }
        return sb.toString();
    }

    @Override // b.d.a.e0.a
    public boolean G() {
        b.d.a.e0.b bVarT = T();
        return (bVarT == b.d.a.e0.b.END_OBJECT || bVarT == b.d.a.e0.b.END_ARRAY) ? false : true;
    }

    @Override // b.d.a.e0.a
    public boolean J() {
        a0(b.d.a.e0.b.BOOLEAN);
        boolean zB = ((t) c0()).b();
        int i = this.s;
        if (i > 0) {
            int[] iArr = this.u;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return zB;
    }

    @Override // b.d.a.e0.a
    public double K() {
        b.d.a.e0.b bVar = b.d.a.e0.b.NUMBER;
        b.d.a.e0.b bVarT = T();
        if (bVarT != bVar && bVarT != b.d.a.e0.b.STRING) {
            throw new IllegalStateException("Expected " + bVar + " but was " + bVarT + I());
        }
        t tVar = (t) b0();
        double dDoubleValue = tVar.f1249a instanceof Number ? tVar.c().doubleValue() : Double.parseDouble(tVar.d());
        if (!this.f1227c && (Double.isNaN(dDoubleValue) || Double.isInfinite(dDoubleValue))) {
            throw new NumberFormatException("JSON forbids NaN and infinities: " + dDoubleValue);
        }
        c0();
        int i = this.s;
        if (i > 0) {
            int[] iArr = this.u;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return dDoubleValue;
    }

    @Override // b.d.a.e0.a
    public int L() {
        b.d.a.e0.b bVar = b.d.a.e0.b.NUMBER;
        b.d.a.e0.b bVarT = T();
        if (bVarT != bVar && bVarT != b.d.a.e0.b.STRING) {
            throw new IllegalStateException("Expected " + bVar + " but was " + bVarT + I());
        }
        t tVar = (t) b0();
        int iIntValue = tVar.f1249a instanceof Number ? tVar.c().intValue() : Integer.parseInt(tVar.d());
        c0();
        int i = this.s;
        if (i > 0) {
            int[] iArr = this.u;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return iIntValue;
    }

    @Override // b.d.a.e0.a
    public long M() {
        b.d.a.e0.b bVar = b.d.a.e0.b.NUMBER;
        b.d.a.e0.b bVarT = T();
        if (bVarT != bVar && bVarT != b.d.a.e0.b.STRING) {
            throw new IllegalStateException("Expected " + bVar + " but was " + bVarT + I());
        }
        t tVar = (t) b0();
        long jLongValue = tVar.f1249a instanceof Number ? tVar.c().longValue() : Long.parseLong(tVar.d());
        c0();
        int i = this.s;
        if (i > 0) {
            int[] iArr = this.u;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return jLongValue;
    }

    @Override // b.d.a.e0.a
    public String N() {
        a0(b.d.a.e0.b.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) b0()).next();
        String str = (String) entry.getKey();
        this.t[this.s - 1] = str;
        d0(entry.getValue());
        return str;
    }

    @Override // b.d.a.e0.a
    public void P() {
        a0(b.d.a.e0.b.NULL);
        c0();
        int i = this.s;
        if (i > 0) {
            int[] iArr = this.u;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    @Override // b.d.a.e0.a
    public String R() {
        b.d.a.e0.b bVar = b.d.a.e0.b.STRING;
        b.d.a.e0.b bVarT = T();
        if (bVarT == bVar || bVarT == b.d.a.e0.b.NUMBER) {
            String strD = ((t) c0()).d();
            int i = this.s;
            if (i > 0) {
                int[] iArr = this.u;
                int i2 = i - 1;
                iArr[i2] = iArr[i2] + 1;
            }
            return strD;
        }
        throw new IllegalStateException("Expected " + bVar + " but was " + bVarT + I());
    }

    @Override // b.d.a.e0.a
    public b.d.a.e0.b T() {
        if (this.s == 0) {
            return b.d.a.e0.b.END_DOCUMENT;
        }
        Object objB0 = b0();
        if (objB0 instanceof Iterator) {
            boolean z = this.r[this.s - 2] instanceof b.d.a.r;
            Iterator it = (Iterator) objB0;
            if (!it.hasNext()) {
                return z ? b.d.a.e0.b.END_OBJECT : b.d.a.e0.b.END_ARRAY;
            }
            if (z) {
                return b.d.a.e0.b.NAME;
            }
            d0(it.next());
            return T();
        }
        if (objB0 instanceof b.d.a.r) {
            return b.d.a.e0.b.BEGIN_OBJECT;
        }
        if (objB0 instanceof b.d.a.l) {
            return b.d.a.e0.b.BEGIN_ARRAY;
        }
        if (!(objB0 instanceof t)) {
            if (objB0 instanceof b.d.a.q) {
                return b.d.a.e0.b.NULL;
            }
            if (objB0 == v) {
                throw new IllegalStateException("JsonReader is closed");
            }
            throw new AssertionError();
        }
        Object obj = ((t) objB0).f1249a;
        if (obj instanceof String) {
            return b.d.a.e0.b.STRING;
        }
        if (obj instanceof Boolean) {
            return b.d.a.e0.b.BOOLEAN;
        }
        if (obj instanceof Number) {
            return b.d.a.e0.b.NUMBER;
        }
        throw new AssertionError();
    }

    @Override // b.d.a.e0.a
    public void Y() {
        if (T() == b.d.a.e0.b.NAME) {
            N();
            this.t[this.s - 2] = "null";
        } else {
            c0();
            int i = this.s;
            if (i > 0) {
                this.t[i - 1] = "null";
            }
        }
        int i2 = this.s;
        if (i2 > 0) {
            int[] iArr = this.u;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
    }

    public final void a0(b.d.a.e0.b bVar) {
        if (T() == bVar) {
            return;
        }
        throw new IllegalStateException("Expected " + bVar + " but was " + T() + I());
    }

    public final Object b0() {
        return this.r[this.s - 1];
    }

    public final Object c0() {
        Object[] objArr = this.r;
        int i = this.s - 1;
        this.s = i;
        Object obj = objArr[i];
        objArr[i] = null;
        return obj;
    }

    @Override // b.d.a.e0.a, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.r = new Object[]{v};
        this.s = 1;
    }

    public final void d0(Object obj) {
        int i = this.s;
        Object[] objArr = this.r;
        if (i == objArr.length) {
            int i2 = i * 2;
            this.r = Arrays.copyOf(objArr, i2);
            this.u = Arrays.copyOf(this.u, i2);
            this.t = (String[]) Arrays.copyOf(this.t, i2);
        }
        Object[] objArr2 = this.r;
        int i3 = this.s;
        this.s = i3 + 1;
        objArr2[i3] = obj;
    }

    @Override // b.d.a.e0.a
    public String toString() {
        return e.class.getSimpleName();
    }

    @Override // b.d.a.e0.a
    public void y() {
        a0(b.d.a.e0.b.BEGIN_ARRAY);
        d0(((b.d.a.l) b0()).iterator());
        this.u[this.s - 1] = 0;
    }

    @Override // b.d.a.e0.a
    public void z() {
        a0(b.d.a.e0.b.BEGIN_OBJECT);
        d0(((b.d.a.r) b0()).f1248a.entrySet().iterator());
    }
}
