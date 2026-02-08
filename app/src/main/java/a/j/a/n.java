package a.j.a;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class n implements Parcelable {
    public static final Parcelable.Creator<n> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public ArrayList<p> f812b;

    /* renamed from: c, reason: collision with root package name */
    public ArrayList<String> f813c;

    /* renamed from: d, reason: collision with root package name */
    public b[] f814d;

    /* renamed from: e, reason: collision with root package name */
    public String f815e;
    public int f;

    public static class a implements Parcelable.Creator<n> {
        @Override // android.os.Parcelable.Creator
        public n createFromParcel(Parcel parcel) {
            return new n(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public n[] newArray(int i) {
            return new n[i];
        }
    }

    public n() {
        this.f815e = null;
    }

    public n(Parcel parcel) {
        this.f815e = null;
        this.f812b = parcel.createTypedArrayList(p.CREATOR);
        this.f813c = parcel.createStringArrayList();
        this.f814d = (b[]) parcel.createTypedArray(b.CREATOR);
        this.f815e = parcel.readString();
        this.f = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.f812b);
        parcel.writeStringList(this.f813c);
        parcel.writeTypedArray(this.f814d, i);
        parcel.writeString(this.f815e);
        parcel.writeInt(this.f);
    }
}
