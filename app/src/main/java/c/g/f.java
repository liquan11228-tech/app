package c.g;

import java.util.Iterator;

/* JADX INFO: Add missing generic type declarations: [T] */
/* loaded from: classes.dex */
public final class f<T> implements c.l.c<T> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Iterable f1270a;

    public f(Iterable iterable) {
        this.f1270a = iterable;
    }

    @Override // c.l.c
    public Iterator<T> iterator() {
        return this.f1270a.iterator();
    }
}
