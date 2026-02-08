package a.g.c;

import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;

/* loaded from: classes.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f598a = new Object();

    public static Bundle a(e eVar) {
        Bundle bundle = new Bundle();
        IconCompat iconCompat = eVar.f597a;
        bundle.putInt("icon", iconCompat != null ? iconCompat.a() : 0);
        bundle.putCharSequence("title", null);
        bundle.putParcelable("actionIntent", null);
        Bundle bundle2 = new Bundle();
        bundle2.putBoolean("android.support.allowGeneratedReplies", false);
        bundle.putBundle("extras", bundle2);
        bundle.putParcelableArray("remoteInputs", b(null));
        bundle.putBoolean("showsUserInterface", false);
        bundle.putInt("semanticAction", 0);
        return bundle;
    }

    public static Bundle[] b(g[] gVarArr) {
        return null;
    }
}
