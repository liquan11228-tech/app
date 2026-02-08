package a.j.a;

import android.graphics.Rect;
import android.transition.Transition;

/* loaded from: classes.dex */
public class z extends Transition.EpicenterCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Rect f863a;

    public z(y yVar, Rect rect) {
        this.f863a = rect;
    }

    @Override // android.transition.Transition.EpicenterCallback
    public Rect onGetEpicenter(Transition transition) {
        Rect rect = this.f863a;
        if (rect == null || rect.isEmpty()) {
            return null;
        }
        return this.f863a;
    }
}
