package a.j.a;

import android.graphics.Rect;
import android.transition.Transition;

/* loaded from: classes.dex */
public class w extends Transition.EpicenterCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Rect f855a;

    public w(y yVar, Rect rect) {
        this.f855a = rect;
    }

    @Override // android.transition.Transition.EpicenterCallback
    public Rect onGetEpicenter(Transition transition) {
        return this.f855a;
    }
}
