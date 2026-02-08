package c.m;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class b implements c.l.c<c.k.c> {

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f1307a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1308b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1309c;

    /* renamed from: d, reason: collision with root package name */
    public final c.j.a.c<CharSequence, Integer, c.b<Integer, Integer>> f1310d;

    public static final class a implements Iterator<c.k.c>, c.j.b.l.a {

        /* renamed from: b, reason: collision with root package name */
        public int f1311b = -1;

        /* renamed from: c, reason: collision with root package name */
        public int f1312c;

        /* renamed from: d, reason: collision with root package name */
        public int f1313d;

        /* renamed from: e, reason: collision with root package name */
        public c.k.c f1314e;
        public int f;

        public a() {
            int i = b.this.f1308b;
            int length = b.this.f1307a.length();
            if (length >= 0) {
                if (i < 0) {
                    i = 0;
                } else if (i > length) {
                    i = length;
                }
                this.f1312c = i;
                this.f1313d = i;
                return;
            }
            throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + length + " is less than minimum 0.");
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0027  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x001b  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void a() {
            /*
                r6 = this;
                int r0 = r6.f1313d
                r1 = 0
                if (r0 >= 0) goto Lc
                r6.f1311b = r1
                r0 = 0
                r6.f1314e = r0
                goto L80
            Lc:
                c.m.b r0 = c.m.b.this
                int r0 = r0.f1309c
                r2 = -1
                r3 = 1
                if (r0 <= 0) goto L1b
                int r4 = r6.f
                int r4 = r4 + r3
                r6.f = r4
                if (r4 >= r0) goto L27
            L1b:
                int r0 = r6.f1313d
                c.m.b r4 = c.m.b.this
                java.lang.CharSequence r4 = r4.f1307a
                int r4 = r4.length()
                if (r0 <= r4) goto L37
            L27:
                int r0 = r6.f1312c
                c.k.c r1 = new c.k.c
                c.m.b r4 = c.m.b.this
                java.lang.CharSequence r4 = r4.f1307a
                int r4 = c.m.e.f(r4)
                r1.<init>(r0, r4)
                goto L5a
            L37:
                c.m.b r0 = c.m.b.this
                c.j.a.c<java.lang.CharSequence, java.lang.Integer, c.b<java.lang.Integer, java.lang.Integer>> r4 = r0.f1310d
                java.lang.CharSequence r0 = r0.f1307a
                int r5 = r6.f1313d
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                java.lang.Object r0 = r4.a(r0, r5)
                c.b r0 = (c.b) r0
                if (r0 != 0) goto L5d
                int r0 = r6.f1312c
                c.k.c r1 = new c.k.c
                c.m.b r4 = c.m.b.this
                java.lang.CharSequence r4 = r4.f1307a
                int r4 = c.m.e.f(r4)
                r1.<init>(r0, r4)
            L5a:
                r6.f1314e = r1
                goto L7c
            L5d:
                A r2 = r0.f1254b
                java.lang.Number r2 = (java.lang.Number) r2
                int r2 = r2.intValue()
                B r0 = r0.f1255c
                java.lang.Number r0 = (java.lang.Number) r0
                int r0 = r0.intValue()
                int r4 = r6.f1312c
                c.k.c r4 = c.k.d.c(r4, r2)
                r6.f1314e = r4
                int r2 = r2 + r0
                r6.f1312c = r2
                if (r0 != 0) goto L7b
                r1 = r3
            L7b:
                int r2 = r2 + r1
            L7c:
                r6.f1313d = r2
                r6.f1311b = r3
            L80:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: c.m.b.a.a():void");
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f1311b == -1) {
                a();
            }
            return this.f1311b == 1;
        }

        @Override // java.util.Iterator
        public c.k.c next() {
            if (this.f1311b == -1) {
                a();
            }
            if (this.f1311b == 0) {
                throw new NoSuchElementException();
            }
            c.k.c cVar = this.f1314e;
            if (cVar == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.ranges.IntRange");
            }
            this.f1314e = null;
            this.f1311b = -1;
            return cVar;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(CharSequence charSequence, int i, int i2, c.j.a.c<? super CharSequence, ? super Integer, c.b<Integer, Integer>> cVar) {
        c.j.b.d.d(charSequence, "input");
        c.j.b.d.d(cVar, "getNextMatch");
        this.f1307a = charSequence;
        this.f1308b = i;
        this.f1309c = i2;
        this.f1310d = cVar;
    }

    @Override // c.l.c
    public Iterator<c.k.c> iterator() {
        return new a();
    }
}
