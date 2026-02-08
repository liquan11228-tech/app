package a.i.a;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public abstract class a implements Parcelable {

    /* renamed from: b, reason: collision with root package name */
    public final Parcelable f762b;

    /* renamed from: c, reason: collision with root package name */
    public static final a f761c = new C0018a();
    public static final Parcelable.Creator<a> CREATOR = new b();

    /* renamed from: a.i.a.a$a, reason: collision with other inner class name */
    public static class C0018a extends a {
        public C0018a() {
            super((C0018a) null);
        }
    }

    public static class b implements Parcelable.ClassLoaderCreator<a> {
        @Override // android.os.Parcelable.Creator
        public Object createFromParcel(Parcel parcel) {
            if (parcel.readParcelable(null) == null) {
                return a.f761c;
            }
            throw new IllegalStateException("superState must be null");
        }

        @Override // android.os.Parcelable.Creator
        public Object[] newArray(int i) {
            return new a[i];
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        public a createFromParcel(Parcel parcel, ClassLoader classLoader) {
            if (parcel.readParcelable(classLoader) == null) {
                return a.f761c;
            }
            throw new IllegalStateException("superState must be null");
        }
    }

    public a(C0018a c0018a) {
        this.f762b = null;
    }

    public a(Parcel parcel, ClassLoader classLoader) {
        Parcelable parcelable = parcel.readParcelable(classLoader);
        this.f762b = parcelable == null ? f761c : parcelable;
    }

    public a(Parcelable parcelable) {
        if (parcelable == null) {
            throw new IllegalArgumentException("superState must not be null");
        }
        this.f762b = parcelable == f761c ? null : parcelable;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f762b, i);
    }
}
