package a.o;

import android.os.Parcel;
import android.util.SparseIntArray;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class b extends a {

    /* renamed from: d, reason: collision with root package name */
    public final SparseIntArray f900d;

    /* renamed from: e, reason: collision with root package name */
    public final Parcel f901e;
    public final int f;
    public final int g;
    public final String h;
    public int i;
    public int j;
    public int k;

    public b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new a.e.a(), new a.e.a(), new a.e.a());
    }

    public b(Parcel parcel, int i, int i2, String str, a.e.a<String, Method> aVar, a.e.a<String, Method> aVar2, a.e.a<String, Class> aVar3) {
        super(aVar, aVar2, aVar3);
        this.f900d = new SparseIntArray();
        this.i = -1;
        this.j = 0;
        this.k = -1;
        this.f901e = parcel;
        this.f = i;
        this.g = i2;
        this.j = i;
        this.h = str;
    }

    @Override // a.o.a
    public void a() {
        int i = this.i;
        if (i >= 0) {
            int i2 = this.f900d.get(i);
            int iDataPosition = this.f901e.dataPosition();
            this.f901e.setDataPosition(i2);
            this.f901e.writeInt(iDataPosition - i2);
            this.f901e.setDataPosition(iDataPosition);
        }
    }

    @Override // a.o.a
    public a b() {
        Parcel parcel = this.f901e;
        int iDataPosition = parcel.dataPosition();
        int i = this.j;
        if (i == this.f) {
            i = this.g;
        }
        return new b(parcel, iDataPosition, i, b.a.a.a.a.d(new StringBuilder(), this.h, "  "), this.f897a, this.f898b, this.f899c);
    }

    @Override // a.o.a
    public boolean h(int i) {
        while (this.j < this.g) {
            int i2 = this.k;
            if (i2 == i) {
                return true;
            }
            if (String.valueOf(i2).compareTo(String.valueOf(i)) > 0) {
                return false;
            }
            this.f901e.setDataPosition(this.j);
            int i3 = this.f901e.readInt();
            this.k = this.f901e.readInt();
            this.j += i3;
        }
        return this.k == i;
    }

    @Override // a.o.a
    public void l(int i) {
        a();
        this.i = i;
        this.f900d.put(i, this.f901e.dataPosition());
        this.f901e.writeInt(0);
        this.f901e.writeInt(i);
    }
}
