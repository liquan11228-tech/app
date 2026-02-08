package b.d.a.c0.z;

import b.d.a.a0;
import b.d.a.z;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
public final class c extends z<Date> {

    /* renamed from: b, reason: collision with root package name */
    public static final a0 f1168b = new a();

    /* renamed from: a, reason: collision with root package name */
    public final List<DateFormat> f1169a;

    public class a implements a0 {
        @Override // b.d.a.a0
        public <T> z<T> a(b.d.a.j jVar, b.d.a.d0.a<T> aVar) {
            if (aVar.f1223a == Date.class) {
                return new c();
            }
            return null;
        }
    }

    public c() {
        ArrayList arrayList = new ArrayList();
        this.f1169a = arrayList;
        arrayList.add(DateFormat.getDateTimeInstance(2, 2, Locale.US));
        if (!Locale.getDefault().equals(Locale.US)) {
            this.f1169a.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if (b.d.a.c0.p.f1140a >= 9) {
            this.f1169a.add(new SimpleDateFormat("MMM d, yyyy h:mm:ss a", Locale.US));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0029, code lost:
    
        r3 = b.d.a.c0.z.t.a.b(r3, new java.text.ParsePosition(0));
     */
    @Override // b.d.a.z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.Date a(b.d.a.e0.a r3) throws java.io.IOException {
        /*
            r2 = this;
            b.d.a.e0.b r0 = r3.T()
            b.d.a.e0.b r1 = b.d.a.e0.b.NULL
            if (r0 != r1) goto Ld
            r3.P()
            r3 = 0
            goto L34
        Ld:
            java.lang.String r3 = r3.R()
            monitor-enter(r2)
            java.util.List<java.text.DateFormat> r0 = r2.f1169a     // Catch: java.lang.Throwable -> L3c
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L3c
        L18:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L3c
            if (r1 == 0) goto L29
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L3c
            java.text.DateFormat r1 = (java.text.DateFormat) r1     // Catch: java.lang.Throwable -> L3c
            java.util.Date r3 = r1.parse(r3)     // Catch: java.text.ParseException -> L18 java.lang.Throwable -> L3c
            goto L33
        L29:
            java.text.ParsePosition r0 = new java.text.ParsePosition     // Catch: java.text.ParseException -> L35 java.lang.Throwable -> L3c
            r1 = 0
            r0.<init>(r1)     // Catch: java.text.ParseException -> L35 java.lang.Throwable -> L3c
            java.util.Date r3 = b.d.a.c0.z.t.a.b(r3, r0)     // Catch: java.text.ParseException -> L35 java.lang.Throwable -> L3c
        L33:
            monitor-exit(r2)
        L34:
            return r3
        L35:
            r0 = move-exception
            b.d.a.w r1 = new b.d.a.w     // Catch: java.lang.Throwable -> L3c
            r1.<init>(r3, r0)     // Catch: java.lang.Throwable -> L3c
            throw r1     // Catch: java.lang.Throwable -> L3c
        L3c:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: b.d.a.c0.z.c.a(b.d.a.e0.a):java.lang.Object");
    }

    @Override // b.d.a.z
    public void b(b.d.a.e0.c cVar, Date date) {
        Date date2 = date;
        synchronized (this) {
            if (date2 == null) {
                cVar.G();
            } else {
                cVar.O(this.f1169a.get(0).format(date2));
            }
        }
    }
}
