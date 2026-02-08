package a.g.d.b;

import a.b.p.y;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;

/* loaded from: classes.dex */
public abstract class e {

    public class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Typeface f609b;

        public a(Typeface typeface) {
            this.f609b = typeface;
        }

        @Override // java.lang.Runnable
        public void run() {
            e.this.c(this.f609b);
        }
    }

    public class b implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f611b;

        public b(int i) {
            this.f611b = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (((y.a) e.this) == null) {
                throw null;
            }
        }
    }

    public final void a(int i, Handler handler) {
        if (handler == null) {
            handler = new Handler(Looper.getMainLooper());
        }
        handler.post(new b(i));
    }

    public final void b(Typeface typeface, Handler handler) {
        if (handler == null) {
            handler = new Handler(Looper.getMainLooper());
        }
        handler.post(new a(typeface));
    }

    public abstract void c(Typeface typeface);
}
