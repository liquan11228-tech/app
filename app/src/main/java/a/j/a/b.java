package a.j.a;

import a.j.a.q;
import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final int[] f767b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList<String> f768c;

    /* renamed from: d, reason: collision with root package name */
    public final int[] f769d;

    /* renamed from: e, reason: collision with root package name */
    public final int[] f770e;
    public final int f;
    public final int g;
    public final String h;
    public final int i;
    public final int j;
    public final CharSequence k;
    public final int l;
    public final CharSequence m;
    public final ArrayList<String> n;
    public final ArrayList<String> o;
    public final boolean p;

    public static class a implements Parcelable.Creator<b> {
        @Override // android.os.Parcelable.Creator
        public b createFromParcel(Parcel parcel) {
            return new b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public b[] newArray(int i) {
            return new b[i];
        }
    }

    public b(a.j.a.a aVar) {
        int size = aVar.f824a.size();
        this.f767b = new int[size * 5];
        if (!aVar.h) {
            throw new IllegalStateException("Not on back stack");
        }
        this.f768c = new ArrayList<>(size);
        this.f769d = new int[size];
        this.f770e = new int[size];
        int i = 0;
        int i2 = 0;
        while (i < size) {
            q.a aVar2 = aVar.f824a.get(i);
            int i3 = i2 + 1;
            this.f767b[i2] = aVar2.f829a;
            ArrayList<String> arrayList = this.f768c;
            Fragment fragment = aVar2.f830b;
            arrayList.add(fragment != null ? fragment.f : null);
            int[] iArr = this.f767b;
            int i4 = i3 + 1;
            iArr[i3] = aVar2.f831c;
            int i5 = i4 + 1;
            iArr[i4] = aVar2.f832d;
            int i6 = i5 + 1;
            iArr[i5] = aVar2.f833e;
            iArr[i6] = aVar2.f;
            this.f769d[i] = aVar2.g.ordinal();
            this.f770e[i] = aVar2.h.ordinal();
            i++;
            i2 = i6 + 1;
        }
        this.f = aVar.f;
        this.g = aVar.g;
        this.h = aVar.i;
        this.i = aVar.s;
        this.j = aVar.j;
        this.k = aVar.k;
        this.l = aVar.l;
        this.m = aVar.m;
        this.n = aVar.n;
        this.o = aVar.o;
        this.p = aVar.p;
    }

    public b(Parcel parcel) {
        this.f767b = parcel.createIntArray();
        this.f768c = parcel.createStringArrayList();
        this.f769d = parcel.createIntArray();
        this.f770e = parcel.createIntArray();
        this.f = parcel.readInt();
        this.g = parcel.readInt();
        this.h = parcel.readString();
        this.i = parcel.readInt();
        this.j = parcel.readInt();
        this.k = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.l = parcel.readInt();
        this.m = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.n = parcel.createStringArrayList();
        this.o = parcel.createStringArrayList();
        this.p = parcel.readInt() != 0;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.f767b);
        parcel.writeStringList(this.f768c);
        parcel.writeIntArray(this.f769d);
        parcel.writeIntArray(this.f770e);
        parcel.writeInt(this.f);
        parcel.writeInt(this.g);
        parcel.writeString(this.h);
        parcel.writeInt(this.i);
        parcel.writeInt(this.j);
        TextUtils.writeToParcel(this.k, parcel, 0);
        parcel.writeInt(this.l);
        TextUtils.writeToParcel(this.m, parcel, 0);
        parcel.writeStringList(this.n);
        parcel.writeStringList(this.o);
        parcel.writeInt(this.p ? 1 : 0);
    }
}
