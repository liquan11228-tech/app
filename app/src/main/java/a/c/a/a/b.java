package a.c.a.a;

import android.os.Looper;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class b extends c {

    /* renamed from: a, reason: collision with root package name */
    public final Object f364a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final ExecutorService f365b = Executors.newFixedThreadPool(2, new a(this));

    public class a implements ThreadFactory {

        /* renamed from: a, reason: collision with root package name */
        public final AtomicInteger f366a = new AtomicInteger(0);

        public a(b bVar) {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName(String.format("arch_disk_io_%d", Integer.valueOf(this.f366a.getAndIncrement())));
            return thread;
        }
    }

    @Override // a.c.a.a.c
    public boolean a() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }
}
