package a.f.b.i.l;

import java.util.ArrayList;

/* loaded from: classes.dex */
public class k {

    /* renamed from: c */
    public static int f510c;

    /* renamed from: a */
    public m f511a;

    /* renamed from: b */
    public ArrayList<m> f512b = new ArrayList<>();

    public k(m mVar, int i) {
        this.f511a = null;
        f510c++;
        this.f511a = mVar;
    }

    public final long a(f fVar, long j) {
        m mVar = fVar.f504d;
        if (mVar instanceof i) {
            return j;
        }
        int size = fVar.k.size();
        long jMin = j;
        for (int i = 0; i < size; i++) {
            d dVar = fVar.k.get(i);
            if (dVar instanceof f) {
                f fVar2 = (f) dVar;
                if (fVar2.f504d != mVar) {
                    jMin = Math.min(jMin, a(fVar2, fVar2.f + j));
                }
            }
        }
        if (fVar != mVar.i) {
            return jMin;
        }
        long j2 = j - mVar.j();
        return Math.min(Math.min(jMin, a(mVar.h, j2)), j2 - mVar.h.f);
    }

    public final long b(f fVar, long j) {
        m mVar = fVar.f504d;
        if (mVar instanceof i) {
            return j;
        }
        int size = fVar.k.size();
        long jMax = j;
        for (int i = 0; i < size; i++) {
            d dVar = fVar.k.get(i);
            if (dVar instanceof f) {
                f fVar2 = (f) dVar;
                if (fVar2.f504d != mVar) {
                    jMax = Math.max(jMax, b(fVar2, fVar2.f + j));
                }
            }
        }
        if (fVar != mVar.h) {
            return jMax;
        }
        long j2 = j + mVar.j();
        return Math.max(Math.max(jMax, b(mVar.i, j2)), j2 - mVar.i.f);
    }
}
