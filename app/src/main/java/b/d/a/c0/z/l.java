package b.d.a.c0.z;

import b.d.a.a0;
import b.d.a.w;
import b.d.a.z;
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/* loaded from: classes.dex */
public final class l extends z<Time> {

    /* renamed from: b, reason: collision with root package name */
    public static final a0 f1192b = new a();

    /* renamed from: a, reason: collision with root package name */
    public final DateFormat f1193a = new SimpleDateFormat("hh:mm:ss a");

    public class a implements a0 {
        @Override // b.d.a.a0
        public <T> z<T> a(b.d.a.j jVar, b.d.a.d0.a<T> aVar) {
            if (aVar.f1223a == Time.class) {
                return new l();
            }
            return null;
        }
    }

    @Override // b.d.a.z
    public Time a(b.d.a.e0.a aVar) {
        synchronized (this) {
            if (aVar.T() == b.d.a.e0.b.NULL) {
                aVar.P();
                return null;
            }
            try {
                return new Time(this.f1193a.parse(aVar.R()).getTime());
            } catch (ParseException e2) {
                throw new w(e2);
            }
        }
    }

    @Override // b.d.a.z
    public void b(b.d.a.e0.c cVar, Time time) {
        Time time2 = time;
        synchronized (this) {
            cVar.O(time2 == null ? null : this.f1193a.format((Date) time2));
        }
    }
}
