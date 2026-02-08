package a.g.g;

import android.util.Base64;
import java.util.List;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f628a;

    /* renamed from: b, reason: collision with root package name */
    public final String f629b;

    /* renamed from: c, reason: collision with root package name */
    public final String f630c;

    /* renamed from: d, reason: collision with root package name */
    public final List<List<byte[]>> f631d;

    /* renamed from: e, reason: collision with root package name */
    public final int f632e;
    public final String f;

    public a(String str, String str2, String str3, List<List<byte[]>> list) {
        this.f628a = str;
        this.f629b = str2;
        this.f630c = str3;
        if (list == null) {
            throw null;
        }
        this.f631d = list;
        this.f632e = 0;
        this.f = str + "-" + this.f629b + "-" + this.f630c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        StringBuilder sbE = b.a.a.a.a.e("FontRequest {mProviderAuthority: ");
        sbE.append(this.f628a);
        sbE.append(", mProviderPackage: ");
        sbE.append(this.f629b);
        sbE.append(", mQuery: ");
        sbE.append(this.f630c);
        sbE.append(", mCertificates:");
        sb.append(sbE.toString());
        for (int i = 0; i < this.f631d.size(); i++) {
            sb.append(" [");
            List<byte[]> list = this.f631d.get(i);
            for (int i2 = 0; i2 < list.size(); i2++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString(list.get(i2), 0));
                sb.append("\"");
            }
            sb.append(" ]");
        }
        sb.append("}");
        sb.append("mCertificatesArray: " + this.f632e);
        return sb.toString();
    }
}
