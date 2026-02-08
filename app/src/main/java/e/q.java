package e;

import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class q extends c.g.b<h> implements RandomAccess {

    /* renamed from: d */
    public static final a f1787d = new a(null);

    /* renamed from: b */
    public final h[] f1788b;

    /* renamed from: c */
    public final int[] f1789c;

    public static final class a {
        public a(c.j.b.c cVar) {
        }

        public final void a(long j, e eVar, int i, List<? extends h> list, int i2, int i3, List<Integer> list2) {
            int i4;
            int i5;
            int i6;
            int i7;
            e eVar2;
            int i8 = i;
            if (!(i2 < i3)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            for (int i9 = i2; i9 < i3; i9++) {
                if (!(list.get(i9).c() >= i8)) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
            }
            h hVar = list.get(i2);
            h hVar2 = list.get(i3 - 1);
            int i10 = -1;
            if (i8 == hVar.c()) {
                int iIntValue = list2.get(i2).intValue();
                int i11 = i2 + 1;
                h hVar3 = list.get(i11);
                i4 = i11;
                i5 = iIntValue;
                hVar = hVar3;
            } else {
                i4 = i2;
                i5 = -1;
            }
            if (hVar.f(i8) == hVar2.f(i8)) {
                int iMin = Math.min(hVar.c(), hVar2.c());
                int i12 = 0;
                for (int i13 = i8; i13 < iMin && hVar.f(i13) == hVar2.f(i13); i13++) {
                    i12++;
                }
                long jB = b(eVar) + j + 2 + i12 + 1;
                eVar.R(-i12);
                eVar.R(i5);
                int i14 = i8 + i12;
                while (i8 < i14) {
                    eVar.R(hVar.f(i8) & 255);
                    i8++;
                }
                if (i4 + 1 == i3) {
                    if (!(i14 == list.get(i4).c())) {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                    eVar.R(list2.get(i4).intValue());
                    return;
                } else {
                    e eVar3 = new e();
                    eVar.R(((int) (b(eVar3) + jB)) * (-1));
                    a(jB, eVar3, i14, list, i4, i3, list2);
                    eVar.O(eVar3);
                    return;
                }
            }
            int i15 = 1;
            for (int i16 = i4 + 1; i16 < i3; i16++) {
                if (list.get(i16 - 1).f(i8) != list.get(i16).f(i8)) {
                    i15++;
                }
            }
            long jB2 = b(eVar) + j + 2 + (i15 * 2);
            eVar.R(i15);
            eVar.R(i5);
            for (int i17 = i4; i17 < i3; i17++) {
                byte bF = list.get(i17).f(i8);
                if (i17 == i4 || bF != list.get(i17 - 1).f(i8)) {
                    eVar.R(bF & 255);
                }
            }
            e eVar4 = new e();
            while (i4 < i3) {
                byte bF2 = list.get(i4).f(i8);
                int i18 = i4 + 1;
                int i19 = i18;
                while (true) {
                    if (i19 >= i3) {
                        i6 = i3;
                        break;
                    } else {
                        if (bF2 != list.get(i19).f(i8)) {
                            i6 = i19;
                            break;
                        }
                        i19++;
                    }
                }
                if (i18 == i6 && i8 + 1 == list.get(i4).c()) {
                    eVar.R(list2.get(i4).intValue());
                    i7 = i6;
                    eVar2 = eVar4;
                } else {
                    eVar.R(((int) (b(eVar4) + jB2)) * i10);
                    i7 = i6;
                    eVar2 = eVar4;
                    a(jB2, eVar4, i8 + 1, list, i4, i6, list2);
                }
                eVar4 = eVar2;
                i4 = i7;
                i10 = -1;
            }
            eVar.O(eVar4);
        }

        public final long b(e eVar) {
            return eVar.f1761c / 4;
        }
    }

    public q(h[] hVarArr, int[] iArr, c.j.b.c cVar) {
        this.f1788b = hVarArr;
        this.f1789c = iArr;
    }

    @Override // c.g.a
    public int a() {
        return this.f1788b.length;
    }

    @Override // c.g.a, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof h) {
            return super.contains((h) obj);
        }
        return false;
    }

    @Override // c.g.b, java.util.List
    public Object get(int i) {
        return this.f1788b[i];
    }

    @Override // c.g.b, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof h) {
            return super.indexOf((h) obj);
        }
        return -1;
    }

    @Override // c.g.b, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof h) {
            return super.lastIndexOf((h) obj);
        }
        return -1;
    }
}
