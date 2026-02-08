package a.l.a;

import a.b.k.h;
import a.e.i;
import a.k.g;
import a.k.l;
import a.k.m;
import a.k.p;
import a.k.q;
import a.k.r;
import a.k.s;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* loaded from: classes.dex */
public class b extends a.l.a.a {

    /* renamed from: a, reason: collision with root package name */
    public final g f887a;

    /* renamed from: b, reason: collision with root package name */
    public final c f888b;

    /* JADX WARN: Unexpected interfaces in signature: [java.lang.Object<D>] */
    public static class a<D> extends l<D> {
        public g j;
        public C0020b<D> k;

        @Override // androidx.lifecycle.LiveData
        public void d() {
            throw null;
        }

        @Override // androidx.lifecycle.LiveData
        public void e() {
            throw null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.lifecycle.LiveData
        public void f(m<? super D> mVar) {
            super.f(mVar);
            this.j = null;
            this.k = null;
        }

        @Override // a.k.l
        public void g(D d2) {
            super.g(d2);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(64);
            sb.append("LoaderInfo{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" #");
            sb.append(0);
            sb.append(" : ");
            h.i.i(null, sb);
            sb.append("}}");
            return sb.toString();
        }
    }

    /* renamed from: a.l.a.b$b, reason: collision with other inner class name */
    public static class C0020b<D> implements m<D> {
    }

    public static class c extends p {

        /* renamed from: c, reason: collision with root package name */
        public static final q f889c = new a();

        /* renamed from: b, reason: collision with root package name */
        public i<a> f890b = new i<>(10);

        public static class a implements q {
            public <T extends p> T a(Class<T> cls) {
                return new c();
            }
        }

        @Override // a.k.p
        public void a() {
            if (this.f890b.i() > 0) {
                this.f890b.j(0);
                throw null;
            }
            i<a> iVar = this.f890b;
            int i = iVar.f425e;
            Object[] objArr = iVar.f424d;
            for (int i2 = 0; i2 < i; i2++) {
                objArr[i2] = null;
            }
            iVar.f425e = 0;
            iVar.f422b = false;
        }
    }

    public b(g gVar, s sVar) {
        this.f887a = gVar;
        q qVar = c.f889c;
        String canonicalName = c.class.getCanonicalName();
        if (canonicalName == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        String strB = b.a.a.a.a.b("androidx.lifecycle.ViewModelProvider.DefaultKey:", canonicalName);
        p pVarA = sVar.f886a.get(strB);
        if (!c.class.isInstance(pVarA)) {
            pVarA = qVar instanceof r ? ((r) qVar).a(strB, c.class) : ((c.a) qVar).a(c.class);
            p pVarPut = sVar.f886a.put(strB, pVarA);
            if (pVarPut != null) {
                pVarPut.a();
            }
        }
        this.f888b = (c) pVarA;
    }

    @Override // a.l.a.a
    @Deprecated
    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        c cVar = this.f888b;
        if (cVar.f890b.i() > 0) {
            printWriter.print(str);
            printWriter.println("Loaders:");
            String str2 = str + "    ";
            if (cVar.f890b.i() <= 0) {
                return;
            }
            a aVarJ = cVar.f890b.j(0);
            printWriter.print(str);
            printWriter.print("  #");
            printWriter.print(cVar.f890b.f(0));
            printWriter.print(": ");
            printWriter.println(aVarJ.toString());
            printWriter.print(str2);
            printWriter.print("mId=");
            printWriter.print(0);
            printWriter.print(" mArgs=");
            printWriter.println((Object) null);
            printWriter.print(str2);
            printWriter.print("mLoader=");
            printWriter.println((Object) null);
            throw null;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        h.i.i(this.f887a, sb);
        sb.append("}}");
        return sb.toString();
    }
}
