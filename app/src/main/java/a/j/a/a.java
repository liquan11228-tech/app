package a.j.a;

import a.j.a.q;
import androidx.fragment.app.Fragment;
import java.io.PrintWriter;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class a extends q {
    public final j r;
    public int s = -1;

    public a(j jVar) {
        this.r = jVar;
    }

    public static boolean g(q.a aVar) {
        Fragment fragment = aVar.f830b;
        if (fragment == null || !fragment.l || fragment.G == null || fragment.A || fragment.z) {
            return false;
        }
        Fragment.b bVar = fragment.K;
        return bVar == null ? false : bVar.q;
    }

    public void a(int i) {
        if (this.h) {
            boolean z = j.G;
            int size = this.f824a.size();
            for (int i2 = 0; i2 < size; i2++) {
                Fragment fragment = this.f824a.get(i2).f830b;
                if (fragment != null) {
                    fragment.r += i;
                    boolean z2 = j.G;
                }
            }
        }
    }

    public void b(String str, PrintWriter printWriter, boolean z) {
        String string;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.i);
            printWriter.print(" mIndex=");
            printWriter.print(this.s);
            printWriter.print(" mCommitted=");
            printWriter.println(false);
            if (this.f != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f));
                printWriter.print(" mTransitionStyle=#");
                printWriter.println(Integer.toHexString(this.g));
            }
            if (this.f825b != 0 || this.f826c != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f825b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f826c));
            }
            if (this.f827d != 0 || this.f828e != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f827d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f828e));
            }
            if (this.j != 0 || this.k != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.j));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.k);
            }
            if (this.l != 0 || this.m != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.l));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.m);
            }
        }
        if (this.f824a.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = this.f824a.size();
        for (int i = 0; i < size; i++) {
            q.a aVar = this.f824a.get(i);
            switch (aVar.f829a) {
                case 0:
                    string = "NULL";
                    break;
                case 1:
                    string = "ADD";
                    break;
                case 2:
                    string = "REPLACE";
                    break;
                case 3:
                    string = "REMOVE";
                    break;
                case 4:
                    string = "HIDE";
                    break;
                case 5:
                    string = "SHOW";
                    break;
                case 6:
                    string = "DETACH";
                    break;
                case 7:
                    string = "ATTACH";
                    break;
                case 8:
                    string = "SET_PRIMARY_NAV";
                    break;
                case 9:
                    string = "UNSET_PRIMARY_NAV";
                    break;
                case 10:
                    string = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    StringBuilder sbE = b.a.a.a.a.e("cmd=");
                    sbE.append(aVar.f829a);
                    string = sbE.toString();
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i);
            printWriter.print(": ");
            printWriter.print(string);
            printWriter.print(" ");
            printWriter.println(aVar.f830b);
            if (z) {
                if (aVar.f831c != 0 || aVar.f832d != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.f831c));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.f832d));
                }
                if (aVar.f833e != 0 || aVar.f != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.f833e));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.f));
                }
            }
        }
    }

    public void c() {
        int size = this.f824a.size();
        for (int i = 0; i < size; i++) {
            q.a aVar = this.f824a.get(i);
            Fragment fragment = aVar.f830b;
            if (fragment != null) {
                int i2 = this.f;
                int i3 = this.g;
                if (fragment.K != null || i2 != 0 || i3 != 0) {
                    fragment.f();
                    Fragment.b bVar = fragment.K;
                    bVar.f1052e = i2;
                    bVar.f = i3;
                }
            }
            switch (aVar.f829a) {
                case 1:
                    fragment.G(aVar.f831c);
                    this.r.d(fragment, false);
                    break;
                case 2:
                default:
                    StringBuilder sbE = b.a.a.a.a.e("Unknown cmd: ");
                    sbE.append(aVar.f829a);
                    throw new IllegalArgumentException(sbE.toString());
                case 3:
                    fragment.G(aVar.f832d);
                    this.r.b0(fragment);
                    break;
                case 4:
                    fragment.G(aVar.f832d);
                    if (this.r == null) {
                        throw null;
                    }
                    if (!fragment.z) {
                        fragment.z = true;
                        fragment.M = !fragment.M;
                        break;
                    }
                    break;
                case 5:
                    fragment.G(aVar.f831c);
                    if (this.r == null) {
                        throw null;
                    }
                    if (fragment.z) {
                        fragment.z = false;
                        fragment.M = !fragment.M;
                        break;
                    }
                    break;
                case 6:
                    fragment.G(aVar.f832d);
                    this.r.i(fragment);
                    break;
                case 7:
                    fragment.G(aVar.f831c);
                    this.r.f(fragment);
                    break;
                case 8:
                    this.r.i0(fragment);
                    break;
                case 9:
                    this.r.i0(null);
                    break;
                case 10:
                    this.r.h0(fragment, aVar.h);
                    break;
            }
            if (!this.p && aVar.f829a != 1 && fragment != null) {
                this.r.X(fragment);
            }
        }
        if (this.p) {
            return;
        }
        j jVar = this.r;
        jVar.Y(jVar.o, true);
    }

    public void d(boolean z) {
        for (int size = this.f824a.size() - 1; size >= 0; size--) {
            q.a aVar = this.f824a.get(size);
            Fragment fragment = aVar.f830b;
            if (fragment != null) {
                int iE0 = j.e0(this.f);
                int i = this.g;
                if (fragment.K != null || iE0 != 0 || i != 0) {
                    fragment.f();
                    Fragment.b bVar = fragment.K;
                    bVar.f1052e = iE0;
                    bVar.f = i;
                }
            }
            switch (aVar.f829a) {
                case 1:
                    fragment.G(aVar.f);
                    this.r.b0(fragment);
                    break;
                case 2:
                default:
                    StringBuilder sbE = b.a.a.a.a.e("Unknown cmd: ");
                    sbE.append(aVar.f829a);
                    throw new IllegalArgumentException(sbE.toString());
                case 3:
                    fragment.G(aVar.f833e);
                    this.r.d(fragment, false);
                    break;
                case 4:
                    fragment.G(aVar.f833e);
                    if (this.r == null) {
                        throw null;
                    }
                    if (fragment.z) {
                        fragment.z = false;
                        fragment.M = !fragment.M;
                        break;
                    }
                    break;
                case 5:
                    fragment.G(aVar.f);
                    if (this.r == null) {
                        throw null;
                    }
                    if (!fragment.z) {
                        fragment.z = true;
                        fragment.M = !fragment.M;
                        break;
                    }
                    break;
                case 6:
                    fragment.G(aVar.f833e);
                    this.r.f(fragment);
                    break;
                case 7:
                    fragment.G(aVar.f);
                    this.r.i(fragment);
                    break;
                case 8:
                    this.r.i0(null);
                    break;
                case 9:
                    this.r.i0(fragment);
                    break;
                case 10:
                    this.r.h0(fragment, aVar.g);
                    break;
            }
            if (!this.p && aVar.f829a != 3 && fragment != null) {
                this.r.X(fragment);
            }
        }
        if (this.p || !z) {
            return;
        }
        j jVar = this.r;
        jVar.Y(jVar.o, true);
    }

    public boolean e(int i) {
        int size = this.f824a.size();
        for (int i2 = 0; i2 < size; i2++) {
            Fragment fragment = this.f824a.get(i2).f830b;
            int i3 = fragment != null ? fragment.x : 0;
            if (i3 != 0 && i3 == i) {
                return true;
            }
        }
        return false;
    }

    public boolean f(ArrayList<a> arrayList, int i, int i2) {
        if (i2 == i) {
            return false;
        }
        int size = this.f824a.size();
        int i3 = -1;
        for (int i4 = 0; i4 < size; i4++) {
            Fragment fragment = this.f824a.get(i4).f830b;
            int i5 = fragment != null ? fragment.x : 0;
            if (i5 != 0 && i5 != i3) {
                for (int i6 = i; i6 < i2; i6++) {
                    a aVar = arrayList.get(i6);
                    int size2 = aVar.f824a.size();
                    for (int i7 = 0; i7 < size2; i7++) {
                        Fragment fragment2 = aVar.f824a.get(i7).f830b;
                        if ((fragment2 != null ? fragment2.x : 0) == i5) {
                            return true;
                        }
                    }
                }
                i3 = i5;
            }
        }
        return false;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.s >= 0) {
            sb.append(" #");
            sb.append(this.s);
        }
        if (this.i != null) {
            sb.append(" ");
            sb.append(this.i);
        }
        sb.append("}");
        return sb.toString();
    }
}
