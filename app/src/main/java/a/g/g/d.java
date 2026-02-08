package a.g.g;

import a.g.g.c;
import android.os.Handler;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public class d implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Callable f664b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Handler f665c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c.InterfaceC0013c f666d;

    public class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Object f667b;

        public a(Object obj) {
            this.f667b = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            d.this.f666d.a(this.f667b);
        }
    }

    public d(c cVar, Callable callable, Handler handler, c.InterfaceC0013c interfaceC0013c) {
        this.f664b = callable;
        this.f665c = handler;
        this.f666d = interfaceC0013c;
    }

    @Override // java.lang.Runnable
    public void run() throws Exception {
        Object objCall;
        try {
            objCall = this.f664b.call();
        } catch (Exception unused) {
            objCall = null;
        }
        this.f665c.post(new a(objCall));
    }
}
