package b.d.a.c0;

import b.d.a.a0;
import b.d.a.z;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class o implements a0, Cloneable {
    public static final o g = new o();

    /* renamed from: b, reason: collision with root package name */
    public double f1131b = -1.0d;

    /* renamed from: c, reason: collision with root package name */
    public int f1132c = 136;

    /* renamed from: d, reason: collision with root package name */
    public boolean f1133d = true;

    /* renamed from: e, reason: collision with root package name */
    public List<b.d.a.a> f1134e = Collections.emptyList();
    public List<b.d.a.a> f = Collections.emptyList();

    /* JADX INFO: Add missing generic type declarations: [T] */
    public class a<T> extends z<T> {

        /* renamed from: a, reason: collision with root package name */
        public z<T> f1135a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f1136b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f1137c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ b.d.a.j f1138d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ b.d.a.d0.a f1139e;

        public a(boolean z, boolean z2, b.d.a.j jVar, b.d.a.d0.a aVar) {
            this.f1136b = z;
            this.f1137c = z2;
            this.f1138d = jVar;
            this.f1139e = aVar;
        }

        @Override // b.d.a.z
        public T a(b.d.a.e0.a aVar) throws IOException {
            if (this.f1136b) {
                aVar.Y();
                return null;
            }
            z<T> zVarD = this.f1135a;
            if (zVarD == null) {
                zVarD = this.f1138d.d(o.this, this.f1139e);
                this.f1135a = zVarD;
            }
            return zVarD.a(aVar);
        }

        @Override // b.d.a.z
        public void b(b.d.a.e0.c cVar, T t) throws IOException {
            if (this.f1137c) {
                cVar.G();
                return;
            }
            z<T> zVarD = this.f1135a;
            if (zVarD == null) {
                zVarD = this.f1138d.d(o.this, this.f1139e);
                this.f1135a = zVarD;
            }
            zVarD.b(cVar, t);
        }
    }

    @Override // b.d.a.a0
    public <T> z<T> a(b.d.a.j jVar, b.d.a.d0.a<T> aVar) {
        Class<? super T> cls = aVar.f1223a;
        boolean zB = b(cls);
        boolean z = zB || c(cls, true);
        boolean z2 = zB || c(cls, false);
        if (z || z2) {
            return new a(z2, z, jVar, aVar);
        }
        return null;
    }

    public final boolean b(Class<?> cls) {
        if (this.f1131b == -1.0d || f((b.d.a.b0.c) cls.getAnnotation(b.d.a.b0.c.class), (b.d.a.b0.d) cls.getAnnotation(b.d.a.b0.d.class))) {
            return (!this.f1133d && e(cls)) || d(cls);
        }
        return true;
    }

    public final boolean c(Class<?> cls, boolean z) {
        Iterator<b.d.a.a> it = (z ? this.f1134e : this.f).iterator();
        while (it.hasNext()) {
            if (it.next().a(cls)) {
                return true;
            }
        }
        return false;
    }

    public Object clone() {
        try {
            return (o) super.clone();
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }

    public final boolean d(Class<?> cls) {
        return !Enum.class.isAssignableFrom(cls) && (cls.isAnonymousClass() || cls.isLocalClass());
    }

    public final boolean e(Class<?> cls) {
        if (cls.isMemberClass()) {
            if (!((cls.getModifiers() & 8) != 0)) {
                return true;
            }
        }
        return false;
    }

    public final boolean f(b.d.a.b0.c cVar, b.d.a.b0.d dVar) {
        if (cVar == null || cVar.value() <= this.f1131b) {
            return dVar == null || (dVar.value() > this.f1131b ? 1 : (dVar.value() == this.f1131b ? 0 : -1)) > 0;
        }
        return false;
    }
}
