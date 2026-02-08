package b.d.a.c0.z;

import b.d.a.a0;
import b.d.a.w;
import b.d.a.z;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/* loaded from: classes.dex */
public final class k extends z<Date> {

    /* renamed from: b, reason: collision with root package name */
    public static final a0 f1190b = new a();

    /* renamed from: a, reason: collision with root package name */
    public final DateFormat f1191a = new SimpleDateFormat("MMM d, yyyy");

    public class a implements a0 {
        @Override // b.d.a.a0
        public <T> z<T> a(b.d.a.j jVar, b.d.a.d0.a<T> aVar) {
            if (aVar.f1223a == Date.class) {
                return new k();
            }
            return null;
        }
    }

    @Override // b.d.a.z
    public Date a(b.d.a.e0.a aVar) {
        Date date;
        synchronized (this) {
            if (aVar.T() == b.d.a.e0.b.NULL) {
                aVar.P();
                date = null;
            } else {
                try {
                    date = new Date(this.f1191a.parse(aVar.R()).getTime());
                } catch (ParseException e2) {
                    throw new w(e2);
                }
            }
        }
        return date;
    }

    @Override // b.d.a.z
    public void b(b.d.a.e0.c cVar, Date date) {
        Date date2 = date;
        synchronized (this) {
            cVar.O(date2 == null ? null : this.f1191a.format((java.util.Date) date2));
        }
    }
}
