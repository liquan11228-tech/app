package b.d.a;

import java.math.BigInteger;

/* loaded from: classes.dex */
public final class t extends o {

    /* renamed from: a, reason: collision with root package name */
    public final Object f1249a;

    public t(Boolean bool) {
        if (bool == null) {
            throw null;
        }
        this.f1249a = bool;
    }

    public static boolean e(t tVar) {
        Object obj = tVar.f1249a;
        if (obj instanceof Number) {
            Number number = (Number) obj;
            if ((number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
                return true;
            }
        }
        return false;
    }

    public boolean b() {
        Object obj = this.f1249a;
        return obj instanceof Boolean ? ((Boolean) obj).booleanValue() : Boolean.parseBoolean(d());
    }

    public Number c() {
        Object obj = this.f1249a;
        return obj instanceof String ? new b.d.a.c0.r((String) this.f1249a) : (Number) obj;
    }

    public String d() {
        Object obj = this.f1249a;
        return obj instanceof Number ? c().toString() : obj instanceof Boolean ? ((Boolean) obj).toString() : (String) obj;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || t.class != obj.getClass()) {
            return false;
        }
        t tVar = (t) obj;
        if (this.f1249a == null) {
            return tVar.f1249a == null;
        }
        if (e(this) && e(tVar)) {
            return c().longValue() == tVar.c().longValue();
        }
        if (!(this.f1249a instanceof Number) || !(tVar.f1249a instanceof Number)) {
            return this.f1249a.equals(tVar.f1249a);
        }
        double dDoubleValue = c().doubleValue();
        double dDoubleValue2 = tVar.c().doubleValue();
        if (dDoubleValue != dDoubleValue2) {
            return Double.isNaN(dDoubleValue) && Double.isNaN(dDoubleValue2);
        }
        return true;
    }

    public int hashCode() {
        long jDoubleToLongBits;
        if (this.f1249a == null) {
            return 31;
        }
        if (e(this)) {
            jDoubleToLongBits = c().longValue();
        } else {
            Object obj = this.f1249a;
            if (!(obj instanceof Number)) {
                return obj.hashCode();
            }
            jDoubleToLongBits = Double.doubleToLongBits(c().doubleValue());
        }
        return (int) ((jDoubleToLongBits >>> 32) ^ jDoubleToLongBits);
    }

    public t(Number number) {
        if (number == null) {
            throw null;
        }
        this.f1249a = number;
    }

    public t(String str) {
        if (str == null) {
            throw null;
        }
        this.f1249a = str;
    }
}
