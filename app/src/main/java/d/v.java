package d;

import d.z;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class v extends f0 {

    /* renamed from: d */
    public static final b0 f1723d;

    /* renamed from: b */
    public final List<String> f1724b;

    /* renamed from: c */
    public final List<String> f1725c;

    public static final class a {

        /* renamed from: c */
        public final Charset f1728c = null;

        /* renamed from: a */
        public final List<String> f1726a = new ArrayList();

        /* renamed from: b */
        public final List<String> f1727b = new ArrayList();

        public final a a(String str, String str2) {
            c.j.b.d.d(str, "name");
            c.j.b.d.d(str2, "value");
            this.f1726a.add(z.b.a(z.k, str, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, false, this.f1728c, 91));
            this.f1727b.add(z.b.a(z.k, str2, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, false, this.f1728c, 91));
            return this;
        }
    }

    static {
        b0 b0Var = b0.f1328e;
        f1723d = b0.a("application/x-www-form-urlencoded");
    }

    public v(List<String> list, List<String> list2) {
        c.j.b.d.d(list, "encodedNames");
        c.j.b.d.d(list2, "encodedValues");
        this.f1724b = d.n0.c.D(list);
        this.f1725c = d.n0.c.D(list2);
    }

    @Override // d.f0
    public long a() {
        return d(null, true);
    }

    @Override // d.f0
    public b0 b() {
        return f1723d;
    }

    @Override // d.f0
    public void c(e.f fVar) {
        c.j.b.d.d(fVar, "sink");
        d(fVar, false);
    }

    public final long d(e.f fVar, boolean z) {
        e.e eVarA;
        if (z) {
            eVarA = new e.e();
        } else {
            c.j.b.d.b(fVar);
            eVarA = fVar.a();
        }
        int size = this.f1724b.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                eVarA.P(38);
            }
            eVarA.T(this.f1724b.get(i));
            eVarA.P(61);
            eVarA.T(this.f1725c.get(i));
        }
        if (!z) {
            return 0L;
        }
        long j = eVarA.f1761c;
        eVarA.p(j);
        return j;
    }
}
