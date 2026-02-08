package b.d.a;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLongArray;

/* loaded from: classes.dex */
public class i extends z<AtomicLongArray> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ z f1239a;

    public i(z zVar) {
        this.f1239a = zVar;
    }

    @Override // b.d.a.z
    public AtomicLongArray a(b.d.a.e0.a aVar) throws IOException {
        ArrayList arrayList = new ArrayList();
        aVar.y();
        while (aVar.G()) {
            arrayList.add(Long.valueOf(((Number) this.f1239a.a(aVar)).longValue()));
        }
        aVar.C();
        int size = arrayList.size();
        AtomicLongArray atomicLongArray = new AtomicLongArray(size);
        for (int i = 0; i < size; i++) {
            atomicLongArray.set(i, ((Long) arrayList.get(i)).longValue());
        }
        return atomicLongArray;
    }

    @Override // b.d.a.z
    public void b(b.d.a.e0.c cVar, AtomicLongArray atomicLongArray) throws IOException {
        AtomicLongArray atomicLongArray2 = atomicLongArray;
        cVar.z();
        int length = atomicLongArray2.length();
        for (int i = 0; i < length; i++) {
            this.f1239a.b(cVar, Long.valueOf(atomicLongArray2.get(i)));
        }
        cVar.C();
    }
}
