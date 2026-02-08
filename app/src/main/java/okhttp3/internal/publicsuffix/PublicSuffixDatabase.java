package okhttp3.internal.publicsuffix;

import a.b.k.h;
import c.g.f;
import c.j.b.c;
import c.j.b.d;
import c.l.b;
import c.m.e;
import d.n0.k.h;
import e.g;
import e.m;
import e.p;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class PublicSuffixDatabase {

    /* renamed from: a */
    public final AtomicBoolean f1808a = new AtomicBoolean(false);

    /* renamed from: b */
    public final CountDownLatch f1809b = new CountDownLatch(1);

    /* renamed from: c */
    public byte[] f1810c;

    /* renamed from: d */
    public byte[] f1811d;
    public static final a h = new a(null);

    /* renamed from: e */
    public static final byte[] f1807e = {(byte) 42};
    public static final List<String> f = h.i.E("*");
    public static final PublicSuffixDatabase g = new PublicSuffixDatabase();

    public static final class a {
        public a(c cVar) {
        }

        public static final String a(a aVar, byte[] bArr, byte[][] bArr2, int i) {
            int i2;
            boolean z;
            int iA;
            int iA2;
            int length = bArr.length;
            int i3 = 0;
            while (i3 < length) {
                int i4 = (i3 + length) / 2;
                while (i4 > -1 && bArr[i4] != ((byte) 10)) {
                    i4--;
                }
                int i5 = i4 + 1;
                int i6 = 1;
                while (true) {
                    i2 = i5 + i6;
                    if (bArr[i2] == ((byte) 10)) {
                        break;
                    }
                    i6++;
                }
                int i7 = i2 - i5;
                int i8 = i;
                boolean z2 = false;
                int i9 = 0;
                int i10 = 0;
                while (true) {
                    if (z2) {
                        iA = 46;
                        z = false;
                    } else {
                        z = z2;
                        iA = d.n0.c.a(bArr2[i8][i9], 255);
                    }
                    iA2 = iA - d.n0.c.a(bArr[i5 + i10], 255);
                    if (iA2 != 0) {
                        break;
                    }
                    i10++;
                    i9++;
                    if (i10 == i7) {
                        break;
                    }
                    if (bArr2[i8].length != i9) {
                        z2 = z;
                    } else {
                        if (i8 == bArr2.length - 1) {
                            break;
                        }
                        i8++;
                        i9 = -1;
                        z2 = true;
                    }
                }
                if (iA2 >= 0) {
                    if (iA2 <= 0) {
                        int i11 = i7 - i10;
                        int length2 = bArr2[i8].length - i9;
                        int length3 = bArr2.length;
                        for (int i12 = i8 + 1; i12 < length3; i12++) {
                            length2 += bArr2[i12].length;
                        }
                        if (length2 >= i11) {
                            if (length2 <= i11) {
                                Charset charset = StandardCharsets.UTF_8;
                                d.c(charset, "UTF_8");
                                return new String(bArr, i5, i7, charset);
                            }
                        }
                    }
                    i3 = i2 + 1;
                }
                length = i5 - 1;
            }
            return null;
        }
    }

    public final String a(String str) throws InterruptedException {
        String strA;
        String strA2;
        String strA3;
        List<String> listT;
        c.l.c aVar;
        d.d(str, "domain");
        String unicode = IDN.toUnicode(str);
        d.c(unicode, "unicodeDomain");
        List<String> listC = c(unicode);
        if (this.f1808a.get() || !this.f1808a.compareAndSet(false, true)) {
            try {
                this.f1809b.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        } else {
            boolean z = false;
            while (true) {
                try {
                    try {
                        b();
                        break;
                    } catch (InterruptedIOException unused2) {
                        Thread.interrupted();
                        z = true;
                    } catch (IOException e2) {
                        h.a aVar2 = d.n0.k.h.f1646c;
                        d.n0.k.h.f1644a.i("Failed to read public suffix list", 5, e2);
                        if (z) {
                        }
                    }
                } catch (Throwable th) {
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
        }
        if (!(this.f1810c != null)) {
            throw new IllegalStateException("Unable to load publicsuffixes.gz resource from the classpath.".toString());
        }
        int size = listC.size();
        byte[][] bArr = new byte[size][];
        for (int i = 0; i < size; i++) {
            String str2 = listC.get(i);
            Charset charset = StandardCharsets.UTF_8;
            d.c(charset, "UTF_8");
            if (str2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            byte[] bytes = str2.getBytes(charset);
            d.c(bytes, "(this as java.lang.String).getBytes(charset)");
            bArr[i] = bytes;
        }
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                strA = null;
                break;
            }
            a aVar3 = h;
            byte[] bArr2 = this.f1810c;
            if (bArr2 == null) {
                d.h("publicSuffixListBytes");
                throw null;
            }
            strA = a.a(aVar3, bArr2, bArr, i2);
            if (strA != null) {
                break;
            }
            i2++;
        }
        if (size > 1) {
            byte[][] bArr3 = (byte[][]) bArr.clone();
            int length = bArr3.length - 1;
            for (int i3 = 0; i3 < length; i3++) {
                bArr3[i3] = f1807e;
                a aVar4 = h;
                byte[] bArr4 = this.f1810c;
                if (bArr4 == null) {
                    d.h("publicSuffixListBytes");
                    throw null;
                }
                strA2 = a.a(aVar4, bArr4, bArr3, i3);
                if (strA2 != null) {
                    break;
                }
            }
            strA2 = null;
        } else {
            strA2 = null;
        }
        if (strA2 != null) {
            int i4 = size - 1;
            for (int i5 = 0; i5 < i4; i5++) {
                a aVar5 = h;
                byte[] bArr5 = this.f1811d;
                if (bArr5 == null) {
                    d.h("publicSuffixExceptionListBytes");
                    throw null;
                }
                strA3 = a.a(aVar5, bArr5, bArr, i5);
                if (strA3 != null) {
                    break;
                }
            }
            strA3 = null;
        } else {
            strA3 = null;
        }
        if (strA3 != null) {
            listT = e.t('!' + strA3, new char[]{'.'}, false, 0, 6);
        } else if (strA == null && strA2 == null) {
            listT = f;
        } else {
            List<String> listT2 = strA != null ? e.t(strA, new char[]{'.'}, false, 0, 6) : c.g.h.f1272b;
            listT = strA2 != null ? e.t(strA2, new char[]{'.'}, false, 0, 6) : c.g.h.f1272b;
            if (listT2.size() > listT.size()) {
                listT = listT2;
            }
        }
        if (listC.size() == listT.size() && listT.get(0).charAt(0) != '!') {
            return null;
        }
        char cCharAt = listT.get(0).charAt(0);
        int size2 = listC.size();
        int size3 = listT.size();
        if (cCharAt != '!') {
            size3++;
        }
        int i6 = size2 - size3;
        List<String> listC2 = c(str);
        d.d(listC2, "$this$asSequence");
        c.l.c fVar = new f(listC2);
        d.d(fVar, "$this$drop");
        if (!(i6 >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i6 + " is less than zero.").toString());
        }
        if (i6 == 0) {
            aVar = fVar;
        } else if (fVar instanceof b) {
            fVar = ((b) fVar).a(i6);
            aVar = fVar;
        } else {
            aVar = new c.l.a(fVar, i6);
        }
        return h.i.D(aVar, ".", null, null, 0, null, null, 62);
    }

    public final void b() {
        InputStream resourceAsStream = PublicSuffixDatabase.class.getResourceAsStream("publicsuffixes.gz");
        if (resourceAsStream == null) {
            return;
        }
        g gVarH = h.i.h(new m(p.c(resourceAsStream)));
        try {
            byte[] bArrT = gVarH.t(gVarH.readInt());
            byte[] bArrT2 = gVarH.t(gVarH.readInt());
            h.i.q(gVarH, null);
            synchronized (this) {
                d.b(bArrT);
                this.f1810c = bArrT;
                d.b(bArrT2);
                this.f1811d = bArrT2;
            }
            this.f1809b.countDown();
        } finally {
        }
    }

    public final List<String> c(String str) {
        int i = 0;
        List<String> listT = e.t(str, new char[]{'.'}, false, 0, 6);
        d.d(listT, "$this$last");
        if (listT.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        d.d(listT, "$this$lastIndex");
        if (!d.a(listT.get(listT.size() - 1), "")) {
            return listT;
        }
        d.d(listT, "$this$dropLast");
        int size = listT.size() - 1;
        if (size < 0) {
            size = 0;
        }
        d.d(listT, "$this$take");
        if (!(size >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + size + " is less than zero.").toString());
        }
        if (size == 0) {
            return c.g.h.f1272b;
        }
        if (size >= listT.size()) {
            return c.g.e.h(listT);
        }
        if (size == 1) {
            d.d(listT, "$this$first");
            return h.i.E(c.g.e.e(listT));
        }
        ArrayList arrayList = new ArrayList(size);
        Iterator<T> it = listT.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
            i++;
            if (i == size) {
                break;
            }
        }
        return h.i.N(arrayList);
    }
}
