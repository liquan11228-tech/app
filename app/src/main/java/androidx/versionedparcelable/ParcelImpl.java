package androidx.versionedparcelable;

import a.o.b;
import a.o.c;
import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final c f1071b;

    public static class a implements Parcelable.Creator<ParcelImpl> {
        @Override // android.os.Parcelable.Creator
        public ParcelImpl createFromParcel(Parcel parcel) {
            return new ParcelImpl(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public ParcelImpl[] newArray(int i) {
            return new ParcelImpl[i];
        }
    }

    public ParcelImpl(Parcel parcel) {
        this.f1071b = new b(parcel).k();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        new b(parcel).o(this.f1071b);
    }
}
