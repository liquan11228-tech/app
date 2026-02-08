package d;

import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class e {
    public static final a n = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f1345a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f1346b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1347c;

    /* renamed from: d, reason: collision with root package name */
    public final int f1348d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f1349e;
    public final boolean f;
    public final boolean g;
    public final int h;
    public final int i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public String m;

    public static final class a {
        public a(c.j.b.c cVar) {
        }

        public final int a(String str, String str2, int i) {
            int length = str.length();
            while (i < length) {
                if (c.m.e.a(str2, str.charAt(i), false, 2)) {
                    return i;
                }
                i++;
            }
            return str.length();
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x004a  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00cd  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00d1  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final d.e b(d.y r27) {
            /*
                Method dump skipped, instructions count: 385
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: d.e.a.b(d.y):d.e");
        }
    }

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        c.j.b.d.d(timeUnit, "timeUnit");
        long j = Integer.MAX_VALUE;
        int i = (timeUnit.toSeconds(j) > j ? 1 : (timeUnit.toSeconds(j) == j ? 0 : -1));
    }

    public e(boolean z, boolean z2, int i, int i2, boolean z3, boolean z4, boolean z5, int i3, int i4, boolean z6, boolean z7, boolean z8, String str, c.j.b.c cVar) {
        this.f1345a = z;
        this.f1346b = z2;
        this.f1347c = i;
        this.f1348d = i2;
        this.f1349e = z3;
        this.f = z4;
        this.g = z5;
        this.h = i3;
        this.i = i4;
        this.j = z6;
        this.k = z7;
        this.l = z8;
        this.m = str;
    }

    public String toString() {
        String str = this.m;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        if (this.f1345a) {
            sb.append("no-cache, ");
        }
        if (this.f1346b) {
            sb.append("no-store, ");
        }
        if (this.f1347c != -1) {
            sb.append("max-age=");
            sb.append(this.f1347c);
            sb.append(", ");
        }
        if (this.f1348d != -1) {
            sb.append("s-maxage=");
            sb.append(this.f1348d);
            sb.append(", ");
        }
        if (this.f1349e) {
            sb.append("private, ");
        }
        if (this.f) {
            sb.append("public, ");
        }
        if (this.g) {
            sb.append("must-revalidate, ");
        }
        if (this.h != -1) {
            sb.append("max-stale=");
            sb.append(this.h);
            sb.append(", ");
        }
        if (this.i != -1) {
            sb.append("min-fresh=");
            sb.append(this.i);
            sb.append(", ");
        }
        if (this.j) {
            sb.append("only-if-cached, ");
        }
        if (this.k) {
            sb.append("no-transform, ");
        }
        if (this.l) {
            sb.append("immutable, ");
        }
        if (sb.length() == 0) {
            return "";
        }
        sb.delete(sb.length() - 2, sb.length());
        String string = sb.toString();
        c.j.b.d.c(string, "StringBuilder().apply(builderAction).toString()");
        this.m = string;
        return string;
    }
}
