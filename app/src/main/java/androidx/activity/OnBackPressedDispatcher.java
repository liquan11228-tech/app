package androidx.activity;

import a.a.b;
import a.j.a.j;
import a.k.d;
import a.k.e;
import a.k.g;
import a.k.h;
import android.content.res.Resources;
import java.util.ArrayDeque;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class OnBackPressedDispatcher {

    /* renamed from: a, reason: collision with root package name */
    public final Runnable f914a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayDeque<b> f915b = new ArrayDeque<>();

    public class LifecycleOnBackPressedCancellable implements e, a.a.a {

        /* renamed from: a, reason: collision with root package name */
        public final d f916a;

        /* renamed from: b, reason: collision with root package name */
        public final b f917b;

        /* renamed from: c, reason: collision with root package name */
        public a.a.a f918c;

        public LifecycleOnBackPressedCancellable(d dVar, b bVar) {
            this.f916a = dVar;
            this.f917b = bVar;
            dVar.a(this);
        }

        @Override // a.a.a
        public void cancel() {
            ((h) this.f916a).f875a.d(this);
            this.f917b.f1b.remove(this);
            a.a.a aVar = this.f918c;
            if (aVar != null) {
                aVar.cancel();
                this.f918c = null;
            }
        }

        @Override // a.k.e
        public void g(g gVar, d.a aVar) {
            if (aVar == d.a.ON_START) {
                OnBackPressedDispatcher onBackPressedDispatcher = OnBackPressedDispatcher.this;
                b bVar = this.f917b;
                onBackPressedDispatcher.f915b.add(bVar);
                a aVar2 = onBackPressedDispatcher.new a(bVar);
                bVar.f1b.add(aVar2);
                this.f918c = aVar2;
                return;
            }
            if (aVar != d.a.ON_STOP) {
                if (aVar == d.a.ON_DESTROY) {
                    cancel();
                }
            } else {
                a.a.a aVar3 = this.f918c;
                if (aVar3 != null) {
                    aVar3.cancel();
                }
            }
        }
    }

    public class a implements a.a.a {

        /* renamed from: a, reason: collision with root package name */
        public final b f920a;

        public a(b bVar) {
            this.f920a = bVar;
        }

        @Override // a.a.a
        public void cancel() {
            OnBackPressedDispatcher.this.f915b.remove(this.f920a);
            this.f920a.f1b.remove(this);
        }
    }

    public OnBackPressedDispatcher(Runnable runnable) {
        this.f914a = runnable;
    }

    public void a() throws Resources.NotFoundException {
        Iterator<b> itDescendingIterator = this.f915b.descendingIterator();
        while (itDescendingIterator.hasNext()) {
            b next = itDescendingIterator.next();
            if (next.f0a) {
                j jVar = j.this;
                jVar.L();
                if (jVar.k.f0a) {
                    jVar.b();
                    return;
                } else {
                    jVar.j.a();
                    return;
                }
            }
        }
        Runnable runnable = this.f914a;
        if (runnable != null) {
            runnable.run();
        }
    }
}
