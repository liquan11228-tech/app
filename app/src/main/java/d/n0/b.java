package d.n0;

import java.util.concurrent.ThreadFactory;

/* loaded from: classes.dex */
public final class b implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f1409a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f1410b;

    public b(String str, boolean z) {
        this.f1409a = str;
        this.f1410b = z;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, this.f1409a);
        thread.setDaemon(this.f1410b);
        return thread;
    }
}
