package c.m;

/* loaded from: classes.dex */
public final class f extends c.j.b.e implements c.j.a.c<CharSequence, Integer, c.b<? extends Integer, ? extends Integer>> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ char[] f1316b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f1317c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(char[] cArr, boolean z) {
        super(2);
        this.f1316b = cArr;
        this.f1317c = z;
    }

    @Override // c.j.a.c
    public c.b<? extends Integer, ? extends Integer> a(CharSequence charSequence, Integer num) {
        CharSequence charSequence2 = charSequence;
        int iIntValue = num.intValue();
        c.j.b.d.d(charSequence2, "$receiver");
        int iL = e.l(charSequence2, this.f1316b, iIntValue, this.f1317c);
        if (iL < 0) {
            return null;
        }
        return new c.b<>(Integer.valueOf(iL), 1);
    }
}
