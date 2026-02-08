package b.d.a.c0.z;

import b.d.a.a0;
import b.d.a.u;
import b.d.a.v;
import b.d.a.z;
import java.io.IOException;

/* loaded from: classes.dex */
public final class m<T> extends z<T> {

    /* renamed from: a, reason: collision with root package name */
    public final v<T> f1194a;

    /* renamed from: b, reason: collision with root package name */
    public final b.d.a.n<T> f1195b;

    /* renamed from: c, reason: collision with root package name */
    public final b.d.a.j f1196c;

    /* renamed from: d, reason: collision with root package name */
    public final b.d.a.d0.a<T> f1197d;
    public z<T> g;
    public final m<T>.b f = new b(this, null);

    /* renamed from: e, reason: collision with root package name */
    public final a0 f1198e = null;

    public final class b implements u, b.d.a.m {
        public b(m mVar, a aVar) {
        }
    }

    public m(v<T> vVar, b.d.a.n<T> nVar, b.d.a.j jVar, b.d.a.d0.a<T> aVar, a0 a0Var) {
        this.f1194a = vVar;
        this.f1195b = nVar;
        this.f1196c = jVar;
        this.f1197d = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0059  */
    @Override // b.d.a.z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public T a(b.d.a.e0.a r4) {
        /*
            r3 = this;
            b.d.a.n<T> r0 = r3.f1195b
            if (r0 != 0) goto L1a
            b.d.a.z<T> r0 = r3.g
            if (r0 == 0) goto L9
            goto L15
        L9:
            b.d.a.j r0 = r3.f1196c
            b.d.a.a0 r1 = r3.f1198e
            b.d.a.d0.a<T> r2 = r3.f1197d
            b.d.a.z r0 = r0.d(r1, r2)
            r3.g = r0
        L15:
            java.lang.Object r4 = r0.a(r4)
            return r4
        L1a:
            r4.T()     // Catch: java.lang.NumberFormatException -> L29 java.io.IOException -> L30 b.d.a.e0.d -> L37 java.io.EOFException -> L3e
            r0 = 0
            b.d.a.z<b.d.a.o> r1 = b.d.a.c0.z.o.X     // Catch: java.io.EOFException -> L27 java.lang.NumberFormatException -> L29 java.io.IOException -> L30 b.d.a.e0.d -> L37
            java.lang.Object r4 = r1.a(r4)     // Catch: java.io.EOFException -> L27 java.lang.NumberFormatException -> L29 java.io.IOException -> L30 b.d.a.e0.d -> L37
            b.d.a.o r4 = (b.d.a.o) r4     // Catch: java.io.EOFException -> L27 java.lang.NumberFormatException -> L29 java.io.IOException -> L30 b.d.a.e0.d -> L37
            goto L44
        L27:
            r4 = move-exception
            goto L40
        L29:
            r4 = move-exception
            b.d.a.w r0 = new b.d.a.w
            r0.<init>(r4)
            throw r0
        L30:
            r4 = move-exception
            b.d.a.p r0 = new b.d.a.p
            r0.<init>(r4)
            throw r0
        L37:
            r4 = move-exception
            b.d.a.w r0 = new b.d.a.w
            r0.<init>(r4)
            throw r0
        L3e:
            r4 = move-exception
            r0 = 1
        L40:
            if (r0 == 0) goto L5a
            b.d.a.q r4 = b.d.a.q.f1247a
        L44:
            r0 = 0
            if (r4 == 0) goto L59
            boolean r1 = r4 instanceof b.d.a.q
            if (r1 == 0) goto L4c
            return r0
        L4c:
            b.d.a.n<T> r0 = r3.f1195b
            b.d.a.d0.a<T> r1 = r3.f1197d
            java.lang.reflect.Type r1 = r1.f1224b
            b.d.a.c0.z.m<T>$b r2 = r3.f
            java.lang.Object r4 = r0.a(r4, r1, r2)
            return r4
        L59:
            throw r0
        L5a:
            b.d.a.w r0 = new b.d.a.w
            r0.<init>(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b.d.a.c0.z.m.a(b.d.a.e0.a):java.lang.Object");
    }

    @Override // b.d.a.z
    public void b(b.d.a.e0.c cVar, T t) throws IOException {
        v<T> vVar = this.f1194a;
        if (vVar == null) {
            z<T> zVarD = this.g;
            if (zVarD == null) {
                zVarD = this.f1196c.d(this.f1198e, this.f1197d);
                this.g = zVarD;
            }
            zVarD.b(cVar, t);
            return;
        }
        if (t == null) {
            cVar.G();
        } else {
            o.X.b(cVar, vVar.a(t, this.f1197d.f1224b, this.f));
        }
    }
}
