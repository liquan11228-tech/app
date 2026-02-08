package b.d.a.c0;

import java.math.BigDecimal;

/* loaded from: classes.dex */
public final class r extends Number {

    /* renamed from: b, reason: collision with root package name */
    public final String f1142b;

    public r(String str) {
        this.f1142b = str;
    }

    @Override // java.lang.Number
    public double doubleValue() {
        return Double.parseDouble(this.f1142b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        String str = this.f1142b;
        String str2 = ((r) obj).f1142b;
        return str == str2 || str.equals(str2);
    }

    @Override // java.lang.Number
    public float floatValue() {
        return Float.parseFloat(this.f1142b);
    }

    public int hashCode() {
        return this.f1142b.hashCode();
    }

    @Override // java.lang.Number
    public int intValue() {
        try {
            try {
                return Integer.parseInt(this.f1142b);
            } catch (NumberFormatException unused) {
                return new BigDecimal(this.f1142b).intValue();
            }
        } catch (NumberFormatException unused2) {
            return (int) Long.parseLong(this.f1142b);
        }
    }

    @Override // java.lang.Number
    public long longValue() {
        try {
            return Long.parseLong(this.f1142b);
        } catch (NumberFormatException unused) {
            return new BigDecimal(this.f1142b).longValue();
        }
    }

    public String toString() {
        return this.f1142b;
    }
}
