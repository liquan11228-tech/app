package a.k;

import androidx.lifecycle.LiveData;

/* loaded from: classes.dex */
public class l<T> extends LiveData<T> {
    public void g(T t) {
        LiveData.a("setValue");
        this.f++;
        this.f1059d = t;
        c(null);
    }
}
