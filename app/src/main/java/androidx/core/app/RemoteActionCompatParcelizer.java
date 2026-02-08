package androidx.core.app;

import a.o.a;
import a.o.b;
import android.app.PendingIntent;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(a aVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        Object objK = remoteActionCompat.f1027a;
        if (aVar.h(1)) {
            objK = aVar.k();
        }
        remoteActionCompat.f1027a = (IconCompat) objK;
        remoteActionCompat.f1028b = aVar.g(remoteActionCompat.f1028b, 2);
        remoteActionCompat.f1029c = aVar.g(remoteActionCompat.f1029c, 3);
        remoteActionCompat.f1030d = (PendingIntent) aVar.j(remoteActionCompat.f1030d, 4);
        remoteActionCompat.f1031e = aVar.f(remoteActionCompat.f1031e, 5);
        remoteActionCompat.f = aVar.f(remoteActionCompat.f, 6);
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, a aVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (aVar == null) {
            throw null;
        }
        IconCompat iconCompat = remoteActionCompat.f1027a;
        aVar.l(1);
        aVar.o(iconCompat);
        CharSequence charSequence = remoteActionCompat.f1028b;
        aVar.l(2);
        b bVar = (b) aVar;
        TextUtils.writeToParcel(charSequence, bVar.f901e, 0);
        CharSequence charSequence2 = remoteActionCompat.f1029c;
        aVar.l(3);
        TextUtils.writeToParcel(charSequence2, bVar.f901e, 0);
        aVar.n(remoteActionCompat.f1030d, 4);
        boolean z = remoteActionCompat.f1031e;
        aVar.l(5);
        bVar.f901e.writeInt(z ? 1 : 0);
        boolean z2 = remoteActionCompat.f;
        aVar.l(6);
        bVar.f901e.writeInt(z2 ? 1 : 0);
    }
}
