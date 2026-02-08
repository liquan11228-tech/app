package androidx.core.graphics.drawable;

import a.o.a;
import a.o.b;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcelable;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static IconCompat read(a aVar) {
        Parcelable parcelable;
        IconCompat iconCompat = new IconCompat();
        iconCompat.f1032a = aVar.i(iconCompat.f1032a, 1);
        byte[] bArr = iconCompat.f1034c;
        if (aVar.h(2)) {
            b bVar = (b) aVar;
            int i = bVar.f901e.readInt();
            if (i < 0) {
                bArr = null;
            } else {
                byte[] bArr2 = new byte[i];
                bVar.f901e.readByteArray(bArr2);
                bArr = bArr2;
            }
        }
        iconCompat.f1034c = bArr;
        iconCompat.f1035d = aVar.j(iconCompat.f1035d, 3);
        iconCompat.f1036e = aVar.i(iconCompat.f1036e, 4);
        iconCompat.f = aVar.i(iconCompat.f, 5);
        iconCompat.g = (ColorStateList) aVar.j(iconCompat.g, 6);
        String string = iconCompat.i;
        if (aVar.h(7)) {
            string = ((b) aVar).f901e.readString();
        }
        iconCompat.i = string;
        iconCompat.h = PorterDuff.Mode.valueOf(string);
        switch (iconCompat.f1032a) {
            case -1:
                parcelable = iconCompat.f1035d;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                iconCompat.f1033b = parcelable;
                return iconCompat;
            case 0:
            default:
                return iconCompat;
            case 1:
            case 5:
                parcelable = iconCompat.f1035d;
                if (parcelable != null) {
                    iconCompat.f1033b = parcelable;
                } else {
                    byte[] bArr3 = iconCompat.f1034c;
                    iconCompat.f1033b = bArr3;
                    iconCompat.f1032a = 3;
                    iconCompat.f1036e = 0;
                    iconCompat.f = bArr3.length;
                }
                return iconCompat;
            case 2:
            case 4:
            case 6:
                iconCompat.f1033b = new String(iconCompat.f1034c, Charset.forName("UTF-16"));
                return iconCompat;
            case 3:
                iconCompat.f1033b = iconCompat.f1034c;
                return iconCompat;
        }
    }

    public static void write(IconCompat iconCompat, a aVar) {
        if (aVar == null) {
            throw null;
        }
        iconCompat.i = iconCompat.h.name();
        switch (iconCompat.f1032a) {
            case -1:
            case 1:
            case 5:
                iconCompat.f1035d = (Parcelable) iconCompat.f1033b;
                break;
            case 2:
                iconCompat.f1034c = ((String) iconCompat.f1033b).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.f1034c = (byte[]) iconCompat.f1033b;
                break;
            case 4:
            case 6:
                iconCompat.f1034c = iconCompat.f1033b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i = iconCompat.f1032a;
        if (-1 != i) {
            aVar.m(i, 1);
        }
        byte[] bArr = iconCompat.f1034c;
        if (bArr != null) {
            aVar.l(2);
            b bVar = (b) aVar;
            bVar.f901e.writeInt(bArr.length);
            bVar.f901e.writeByteArray(bArr);
        }
        Parcelable parcelable = iconCompat.f1035d;
        if (parcelable != null) {
            aVar.l(3);
            ((b) aVar).f901e.writeParcelable(parcelable, 0);
        }
        int i2 = iconCompat.f1036e;
        if (i2 != 0) {
            aVar.m(i2, 4);
        }
        int i3 = iconCompat.f;
        if (i3 != 0) {
            aVar.m(i3, 5);
        }
        ColorStateList colorStateList = iconCompat.g;
        if (colorStateList != null) {
            aVar.l(6);
            ((b) aVar).f901e.writeParcelable(colorStateList, 0);
        }
        String str = iconCompat.i;
        if (str != null) {
            aVar.l(7);
            ((b) aVar).f901e.writeString(str);
        }
    }
}
