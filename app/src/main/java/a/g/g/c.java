package a.g.g;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public class c {

    /* renamed from: b, reason: collision with root package name */
    public HandlerThread f655b;

    /* renamed from: c, reason: collision with root package name */
    public Handler f656c;
    public final int f;
    public final int g;
    public final String h;

    /* renamed from: a, reason: collision with root package name */
    public final Object f654a = new Object();

    /* renamed from: e, reason: collision with root package name */
    public Handler.Callback f658e = new a();

    /* renamed from: d, reason: collision with root package name */
    public int f657d = 0;

    public class a implements Handler.Callback {
        public a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                c cVar = c.this;
                synchronized (cVar.f654a) {
                    if (!cVar.f656c.hasMessages(1)) {
                        cVar.f655b.quit();
                        cVar.f655b = null;
                        cVar.f656c = null;
                    }
                }
                return true;
            }
            if (i != 1) {
                return true;
            }
            c cVar2 = c.this;
            Runnable runnable = (Runnable) message.obj;
            if (cVar2 == null) {
                throw null;
            }
            runnable.run();
            synchronized (cVar2.f654a) {
                cVar2.f656c.removeMessages(0);
                cVar2.f656c.sendMessageDelayed(cVar2.f656c.obtainMessage(0), cVar2.f);
            }
            return true;
        }
    }

    public class b implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ AtomicReference f660b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Callable f661c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ ReentrantLock f662d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ AtomicBoolean f663e;
        public final /* synthetic */ Condition f;

        public b(c cVar, AtomicReference atomicReference, Callable callable, ReentrantLock reentrantLock, AtomicBoolean atomicBoolean, Condition condition) {
            this.f660b = atomicReference;
            this.f661c = callable;
            this.f662d = reentrantLock;
            this.f663e = atomicBoolean;
            this.f = condition;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f660b.set(this.f661c.call());
            } catch (Exception unused) {
            }
            this.f662d.lock();
            try {
                this.f663e.set(false);
                this.f.signal();
            } finally {
                this.f662d.unlock();
            }
        }
    }

    /* renamed from: a.g.g.c$c, reason: collision with other inner class name */
    public interface InterfaceC0013c<T> {
        void a(T t);
    }

    public c(String str, int i, int i2) {
        this.h = str;
        this.g = i;
        this.f = i2;
    }

    public final void a(Runnable runnable) {
        synchronized (this.f654a) {
            if (this.f655b == null) {
                HandlerThread handlerThread = new HandlerThread(this.h, this.g);
                this.f655b = handlerThread;
                handlerThread.start();
                this.f656c = new Handler(this.f655b.getLooper(), this.f658e);
                this.f657d++;
            }
            this.f656c.removeMessages(0);
            this.f656c.sendMessage(this.f656c.obtainMessage(1, runnable));
        }
    }

    public <T> T b(Callable<T> callable, int i) {
        ReentrantLock reentrantLock = new ReentrantLock();
        Condition conditionNewCondition = reentrantLock.newCondition();
        AtomicReference atomicReference = new AtomicReference();
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        a(new b(this, atomicReference, callable, reentrantLock, atomicBoolean, conditionNewCondition));
        reentrantLock.lock();
        try {
            if (!atomicBoolean.get()) {
                return (T) atomicReference.get();
            }
            long nanos = TimeUnit.MILLISECONDS.toNanos(i);
            do {
                try {
                    nanos = conditionNewCondition.awaitNanos(nanos);
                } catch (InterruptedException unused) {
                }
                if (!atomicBoolean.get()) {
                    return (T) atomicReference.get();
                }
            } while (nanos > 0);
            throw new InterruptedException("timeout");
        } finally {
            reentrantLock.unlock();
        }
    }
}
