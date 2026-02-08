package a.g.d;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f599a = new Object();

    public static int a(Context context, int i) {
        return context.getColor(i);
    }

    public static Drawable b(Context context, int i) {
        return context.getDrawable(i);
    }

    public static boolean c(Context context, Intent[] intentArr, Bundle bundle) {
        context.startActivities(intentArr, bundle);
        return true;
    }
}
