package a.g.e;

import a.b.k.h;
import a.g.g.b;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public class h {

    /* renamed from: a */
    public ConcurrentHashMap<Long, a.g.d.b.b> f627a = new ConcurrentHashMap<>();

    public class a implements b<b.f> {
        public a(h hVar) {
        }

        @Override // a.g.e.h.b
        public int a(b.f fVar) {
            return fVar.f649c;
        }

        @Override // a.g.e.h.b
        public boolean b(b.f fVar) {
            return fVar.f650d;
        }
    }

    public interface b<T> {
        int a(T t);

        boolean b(T t);
    }

    public static <T> T d(T[] tArr, int i, b<T> bVar) {
        int i2 = (i & 1) == 0 ? 400 : 700;
        boolean z = (i & 2) != 0;
        T t = null;
        int i3 = Integer.MAX_VALUE;
        for (T t2 : tArr) {
            int iAbs = (Math.abs(bVar.a(t2) - i2) * 2) + (bVar.b(t2) == z ? 0 : 1);
            if (t == null || i3 > iAbs) {
                t = t2;
                i3 = iAbs;
            }
        }
        return t;
    }

    public abstract Typeface a(Context context, a.g.d.b.b bVar, Resources resources, int i);

    public abstract Typeface b(Context context, CancellationSignal cancellationSignal, b.f[] fVarArr, int i);

    public Typeface c(Context context, Resources resources, int i, String str, int i2) throws IOException {
        File fileA = h.i.A(context);
        if (fileA == null) {
            return null;
        }
        try {
            if (h.i.s(fileA, resources, i)) {
                return Typeface.createFromFile(fileA.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileA.delete();
        }
    }

    public b.f e(b.f[] fVarArr, int i) {
        return (b.f) d(fVarArr, i, new a(this));
    }
}
