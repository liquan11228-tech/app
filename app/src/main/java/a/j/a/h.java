package a.j.a;

import a.b.k.h;
import android.app.Activity;
import android.content.Context;
import android.os.Handler;

/* loaded from: classes.dex */
public abstract class h<E> extends e {

    /* renamed from: b */
    public final Activity f779b;

    /* renamed from: c */
    public final Context f780c;

    /* renamed from: d */
    public final Handler f781d;

    /* renamed from: e */
    public final int f782e;
    public final j f;

    public h(d dVar) {
        Handler handler = new Handler();
        this.f = new j();
        this.f779b = dVar;
        h.i.l(dVar, "context == null");
        this.f780c = dVar;
        h.i.l(handler, "handler == null");
        this.f781d = handler;
        this.f782e = 0;
    }
}
