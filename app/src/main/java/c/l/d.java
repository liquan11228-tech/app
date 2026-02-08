package c.l;

import java.util.Iterator;

/* JADX INFO: Add missing generic type declarations: [T] */
/* loaded from: classes.dex */
public final class d<T> implements Iterable<T>, c.j.b.l.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f1298b;

    public d(c cVar) {
        this.f1298b = cVar;
    }

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        return this.f1298b.iterator();
    }
}
