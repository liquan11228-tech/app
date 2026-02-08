package a.g.c;

/* loaded from: classes.dex */
public class c implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f594b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f595c;

    public c(Object obj, Object obj2) {
        this.f594b = obj;
        this.f595c = obj2;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            if (b.f583d != null) {
                b.f583d.invoke(this.f594b, this.f595c, Boolean.FALSE, "AppCompat recreation");
            } else {
                b.f584e.invoke(this.f594b, this.f595c, Boolean.FALSE);
            }
        } catch (RuntimeException e2) {
            if (e2.getClass() == RuntimeException.class && e2.getMessage() != null && e2.getMessage().startsWith("Unable to stop")) {
                throw e2;
            }
        } catch (Throwable unused) {
        }
    }
}
