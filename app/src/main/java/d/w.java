package d;

import java.security.cert.Certificate;
import java.util.List;

/* loaded from: classes.dex */
public final class w extends c.j.b.e implements c.j.a.a<List<? extends Certificate>> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f1729b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(List list) {
        super(0);
        this.f1729b = list;
    }

    @Override // c.j.a.a
    public List<? extends Certificate> c() {
        return this.f1729b;
    }
}
