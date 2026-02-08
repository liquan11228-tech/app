package a.g.g;

import a.b.k.h;
import a.e.h;
import a.g.g.c;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.Handler;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a */
    public static final a.e.f<String, Typeface> f633a = new a.e.f<>(16);

    /* renamed from: b */
    public static final a.g.g.c f634b = new a.g.g.c("fonts", 10, 10000);

    /* renamed from: c */
    public static final Object f635c = new Object();

    /* renamed from: d */
    public static final h<String, ArrayList<c.InterfaceC0013c<g>>> f636d = new h<>();

    /* renamed from: e */
    public static final Comparator<byte[]> f637e = new d();

    public class a implements Callable<g> {

        /* renamed from: a */
        public final /* synthetic */ Context f638a;

        /* renamed from: b */
        public final /* synthetic */ a.g.g.a f639b;

        /* renamed from: c */
        public final /* synthetic */ int f640c;

        /* renamed from: d */
        public final /* synthetic */ String f641d;

        public a(Context context, a.g.g.a aVar, int i, String str) {
            this.f638a = context;
            this.f639b = aVar;
            this.f640c = i;
            this.f641d = str;
        }

        @Override // java.util.concurrent.Callable
        public g call() throws Resources.NotFoundException {
            g gVarB = b.b(this.f638a, this.f639b, this.f640c);
            Typeface typeface = gVarB.f652a;
            if (typeface != null) {
                b.f633a.b(this.f641d, typeface);
            }
            return gVarB;
        }
    }

    /* renamed from: a.g.g.b$b */
    public class C0012b implements c.InterfaceC0013c<g> {

        /* renamed from: a */
        public final /* synthetic */ a.g.d.b.e f642a;

        /* renamed from: b */
        public final /* synthetic */ Handler f643b;

        public C0012b(a.g.d.b.e eVar, Handler handler) {
            this.f642a = eVar;
            this.f643b = handler;
        }

        @Override // a.g.g.c.InterfaceC0013c
        public void a(g gVar) {
            int i;
            a.g.d.b.e eVar;
            g gVar2 = gVar;
            if (gVar2 == null) {
                eVar = this.f642a;
                i = 1;
            } else {
                i = gVar2.f653b;
                if (i == 0) {
                    this.f642a.b(gVar2.f652a, this.f643b);
                    return;
                }
                eVar = this.f642a;
            }
            eVar.a(i, this.f643b);
        }
    }

    public class c implements c.InterfaceC0013c<g> {

        /* renamed from: a */
        public final /* synthetic */ String f644a;

        public c(String str) {
            this.f644a = str;
        }

        @Override // a.g.g.c.InterfaceC0013c
        /* renamed from: b */
        public void a(g gVar) {
            synchronized (b.f635c) {
                ArrayList<c.InterfaceC0013c<g>> arrayList = b.f636d.get(this.f644a);
                if (arrayList == null) {
                    return;
                }
                b.f636d.remove(this.f644a);
                for (int i = 0; i < arrayList.size(); i++) {
                    arrayList.get(i).a(gVar);
                }
            }
        }
    }

    public class d implements Comparator<byte[]> {
        @Override // java.util.Comparator
        public int compare(byte[] bArr, byte[] bArr2) {
            int length;
            int length2;
            byte[] bArr3 = bArr;
            byte[] bArr4 = bArr2;
            if (bArr3.length == bArr4.length) {
                for (int i = 0; i < bArr3.length; i++) {
                    if (bArr3[i] != bArr4[i]) {
                        length = bArr3[i];
                        length2 = bArr4[i];
                    }
                }
                return 0;
            }
            length = bArr3.length;
            length2 = bArr4.length;
            return length - length2;
        }
    }

    public static class e {

        /* renamed from: a */
        public final int f645a;

        /* renamed from: b */
        public final f[] f646b;

        public e(int i, f[] fVarArr) {
            this.f645a = i;
            this.f646b = fVarArr;
        }
    }

    public static class f {

        /* renamed from: a */
        public final Uri f647a;

        /* renamed from: b */
        public final int f648b;

        /* renamed from: c */
        public final int f649c;

        /* renamed from: d */
        public final boolean f650d;

        /* renamed from: e */
        public final int f651e;

        public f(Uri uri, int i, int i2, boolean z, int i3) {
            if (uri == null) {
                throw null;
            }
            this.f647a = uri;
            this.f648b = i;
            this.f649c = i2;
            this.f650d = z;
            this.f651e = i3;
        }
    }

    public static final class g {

        /* renamed from: a */
        public final Typeface f652a;

        /* renamed from: b */
        public final int f653b;

        public g(Typeface typeface, int i) {
            this.f652a = typeface;
            this.f653b = i;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x0092 A[LOOP:1: B:102:0x004d->B:117:0x0092, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0096 A[EDGE_INSN: B:168:0x0096->B:119:0x0096 BREAK  A[LOOP:1: B:102:0x004d->B:117:0x0092], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static a.g.g.b.e a(android.content.Context r20, android.os.CancellationSignal r21, a.g.g.a r22) throws android.content.res.Resources.NotFoundException, android.content.pm.PackageManager.NameNotFoundException {
        /*
            Method dump skipped, instructions count: 447
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a.g.g.b.a(android.content.Context, android.os.CancellationSignal, a.g.g.a):a.g.g.b$e");
    }

    public static g b(Context context, a.g.g.a aVar, int i) throws Resources.NotFoundException {
        try {
            e eVarA = a(context, null, aVar);
            int i2 = eVarA.f645a;
            if (i2 != 0) {
                return new g(null, i2 == 1 ? -2 : -3);
            }
            Typeface typefaceB = a.g.e.c.f621a.b(context, null, eVarA.f646b, i);
            return new g(typefaceB, typefaceB != null ? 0 : -3);
        } catch (PackageManager.NameNotFoundException unused) {
            return new g(null, -1);
        }
    }

    public static Typeface c(Context context, a.g.g.a aVar, a.g.d.b.e eVar, Handler handler, boolean z, int i, int i2) throws Resources.NotFoundException {
        String str = aVar.f + "-" + i2;
        Typeface typefaceA = f633a.a(str);
        if (typefaceA != null) {
            if (eVar != null) {
                eVar.c(typefaceA);
            }
            return typefaceA;
        }
        if (z && i == -1) {
            g gVarB = b(context, aVar, i2);
            if (eVar != null) {
                int i3 = gVarB.f653b;
                if (i3 == 0) {
                    eVar.b(gVarB.f652a, handler);
                } else {
                    eVar.a(i3, handler);
                }
            }
            return gVarB.f652a;
        }
        a aVar2 = new a(context, aVar, i2, str);
        if (z) {
            try {
                return ((g) f634b.b(aVar2, i)).f652a;
            } catch (InterruptedException unused) {
                return null;
            }
        }
        C0012b c0012b = eVar == null ? null : new C0012b(eVar, handler);
        synchronized (f635c) {
            ArrayList<c.InterfaceC0013c<g>> orDefault = f636d.getOrDefault(str, null);
            if (orDefault != null) {
                if (c0012b != null) {
                    orDefault.add(c0012b);
                }
                return null;
            }
            if (c0012b != null) {
                ArrayList<c.InterfaceC0013c<g>> arrayList = new ArrayList<>();
                arrayList.add(c0012b);
                f636d.put(str, arrayList);
            }
            a.g.g.c cVar = f634b;
            c cVar2 = new c(str);
            if (cVar == null) {
                throw null;
            }
            cVar.a(new a.g.g.d(cVar, aVar2, new Handler(), cVar2));
            return null;
        }
    }

    public static Map<Uri, ByteBuffer> d(Context context, f[] fVarArr, CancellationSignal cancellationSignal) {
        HashMap map = new HashMap();
        for (f fVar : fVarArr) {
            if (fVar.f651e == 0) {
                Uri uri = fVar.f647a;
                if (!map.containsKey(uri)) {
                    map.put(uri, h.i.G(context, cancellationSignal, uri));
                }
            }
        }
        return Collections.unmodifiableMap(map);
    }
}
