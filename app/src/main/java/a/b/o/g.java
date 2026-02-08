package a.b.o;

import a.g.j.o;
import a.g.j.p;
import a.g.j.q;
import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class g {

    /* renamed from: c, reason: collision with root package name */
    public Interpolator f106c;

    /* renamed from: d, reason: collision with root package name */
    public p f107d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f108e;

    /* renamed from: b, reason: collision with root package name */
    public long f105b = -1;
    public final q f = new a();

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList<o> f104a = new ArrayList<>();

    public class a extends q {

        /* renamed from: a, reason: collision with root package name */
        public boolean f109a = false;

        /* renamed from: b, reason: collision with root package name */
        public int f110b = 0;

        public a() {
        }

        @Override // a.g.j.p
        public void a(View view) {
            int i = this.f110b + 1;
            this.f110b = i;
            if (i == g.this.f104a.size()) {
                p pVar = g.this.f107d;
                if (pVar != null) {
                    pVar.a(null);
                }
                this.f110b = 0;
                this.f109a = false;
                g.this.f108e = false;
            }
        }

        @Override // a.g.j.q, a.g.j.p
        public void b(View view) {
            if (this.f109a) {
                return;
            }
            this.f109a = true;
            p pVar = g.this.f107d;
            if (pVar != null) {
                pVar.b(null);
            }
        }
    }

    public void a() {
        if (this.f108e) {
            Iterator<o> it = this.f104a.iterator();
            while (it.hasNext()) {
                it.next().b();
            }
            this.f108e = false;
        }
    }

    public void b() {
        View view;
        if (this.f108e) {
            return;
        }
        Iterator<o> it = this.f104a.iterator();
        while (it.hasNext()) {
            o next = it.next();
            long j = this.f105b;
            if (j >= 0) {
                next.c(j);
            }
            Interpolator interpolator = this.f106c;
            if (interpolator != null && (view = next.f706a.get()) != null) {
                view.animate().setInterpolator(interpolator);
            }
            if (this.f107d != null) {
                next.d(this.f);
            }
            View view2 = next.f706a.get();
            if (view2 != null) {
                view2.animate().start();
            }
        }
        this.f108e = true;
    }
}
