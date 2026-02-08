package a.f.b.i.l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class f implements d {

    /* renamed from: d */
    public m f504d;
    public int f;
    public int g;

    /* renamed from: a */
    public d f501a = null;

    /* renamed from: b */
    public boolean f502b = false;

    /* renamed from: c */
    public boolean f503c = false;

    /* renamed from: e */
    public a f505e = a.UNKNOWN;
    public int h = 1;
    public g i = null;
    public boolean j = false;
    public List<d> k = new ArrayList();
    public List<f> l = new ArrayList();

    public enum a {
        UNKNOWN,
        HORIZONTAL_DIMENSION,
        VERTICAL_DIMENSION,
        LEFT,
        RIGHT,
        TOP,
        BOTTOM,
        BASELINE
    }

    public f(m mVar) {
        this.f504d = mVar;
    }

    @Override // a.f.b.i.l.d
    public void a(d dVar) {
        Iterator<f> it = this.l.iterator();
        while (it.hasNext()) {
            if (!it.next().j) {
                return;
            }
        }
        this.f503c = true;
        d dVar2 = this.f501a;
        if (dVar2 != null) {
            dVar2.a(this);
        }
        if (this.f502b) {
            this.f504d.a(this);
            return;
        }
        f fVar = null;
        int i = 0;
        for (f fVar2 : this.l) {
            if (!(fVar2 instanceof g)) {
                i++;
                fVar = fVar2;
            }
        }
        if (fVar != null && i == 1 && fVar.j) {
            g gVar = this.i;
            if (gVar != null) {
                if (!gVar.j) {
                    return;
                } else {
                    this.f = this.h * gVar.g;
                }
            }
            c(fVar.g + this.f);
        }
        d dVar3 = this.f501a;
        if (dVar3 != null) {
            dVar3.a(this);
        }
    }

    public void b() {
        this.l.clear();
        this.k.clear();
        this.j = false;
        this.g = 0;
        this.f503c = false;
        this.f502b = false;
    }

    public void c(int i) {
        if (this.j) {
            return;
        }
        this.j = true;
        this.g = i;
        for (d dVar : this.k) {
            dVar.a(dVar);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f504d.f514b.Y);
        sb.append(":");
        sb.append(this.f505e);
        sb.append("(");
        sb.append(this.j ? Integer.valueOf(this.g) : "unresolved");
        sb.append(") <t=");
        sb.append(this.l.size());
        sb.append(":d=");
        sb.append(this.k.size());
        sb.append(">");
        return sb.toString();
    }
}
