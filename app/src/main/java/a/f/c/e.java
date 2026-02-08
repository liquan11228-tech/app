package a.f.c;

import a.f.c.f;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class e {

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f546d = {0, 4, 8};

    /* renamed from: e, reason: collision with root package name */
    public static SparseIntArray f547e;

    /* renamed from: a, reason: collision with root package name */
    public HashMap<String, a.f.c.b> f548a = new HashMap<>();

    /* renamed from: b, reason: collision with root package name */
    public boolean f549b = true;

    /* renamed from: c, reason: collision with root package name */
    public HashMap<Integer, a> f550c = new HashMap<>();

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public int f551a;

        /* renamed from: b, reason: collision with root package name */
        public final d f552b = new d();

        /* renamed from: c, reason: collision with root package name */
        public final c f553c = new c();

        /* renamed from: d, reason: collision with root package name */
        public final b f554d = new b();

        /* renamed from: e, reason: collision with root package name */
        public final C0009e f555e = new C0009e();
        public HashMap<String, a.f.c.b> f = new HashMap<>();

        public void a(ConstraintLayout.a aVar) {
            b bVar = this.f554d;
            aVar.f1019d = bVar.h;
            aVar.f1020e = bVar.i;
            aVar.f = bVar.j;
            aVar.g = bVar.k;
            aVar.h = bVar.l;
            aVar.i = bVar.m;
            aVar.j = bVar.n;
            aVar.k = bVar.o;
            aVar.l = bVar.p;
            aVar.p = bVar.q;
            aVar.q = bVar.r;
            aVar.r = bVar.s;
            aVar.s = bVar.t;
            ((ViewGroup.MarginLayoutParams) aVar).leftMargin = bVar.D;
            ((ViewGroup.MarginLayoutParams) aVar).rightMargin = bVar.E;
            ((ViewGroup.MarginLayoutParams) aVar).topMargin = bVar.F;
            ((ViewGroup.MarginLayoutParams) aVar).bottomMargin = bVar.G;
            aVar.x = bVar.O;
            aVar.y = bVar.N;
            aVar.u = bVar.K;
            aVar.w = bVar.M;
            aVar.z = bVar.u;
            aVar.A = bVar.v;
            aVar.m = bVar.x;
            aVar.n = bVar.y;
            aVar.o = bVar.z;
            aVar.B = bVar.w;
            aVar.P = bVar.A;
            aVar.Q = bVar.B;
            aVar.E = bVar.P;
            aVar.D = bVar.Q;
            aVar.G = bVar.S;
            aVar.F = bVar.R;
            aVar.S = bVar.h0;
            aVar.T = bVar.i0;
            aVar.H = bVar.T;
            aVar.I = bVar.U;
            aVar.L = bVar.V;
            aVar.M = bVar.W;
            aVar.J = bVar.X;
            aVar.K = bVar.Y;
            aVar.N = bVar.Z;
            aVar.O = bVar.a0;
            aVar.R = bVar.C;
            aVar.f1018c = bVar.g;
            aVar.f1016a = bVar.f560e;
            aVar.f1017b = bVar.f;
            ((ViewGroup.MarginLayoutParams) aVar).width = bVar.f558c;
            ((ViewGroup.MarginLayoutParams) aVar).height = bVar.f559d;
            String str = bVar.g0;
            if (str != null) {
                aVar.U = str;
            }
            aVar.setMarginStart(this.f554d.I);
            aVar.setMarginEnd(this.f554d.H);
            aVar.a();
        }

        public final void b(int i, ConstraintLayout.a aVar) {
            this.f551a = i;
            b bVar = this.f554d;
            bVar.h = aVar.f1019d;
            bVar.i = aVar.f1020e;
            bVar.j = aVar.f;
            bVar.k = aVar.g;
            bVar.l = aVar.h;
            bVar.m = aVar.i;
            bVar.n = aVar.j;
            bVar.o = aVar.k;
            bVar.p = aVar.l;
            bVar.q = aVar.p;
            bVar.r = aVar.q;
            bVar.s = aVar.r;
            bVar.t = aVar.s;
            bVar.u = aVar.z;
            bVar.v = aVar.A;
            bVar.w = aVar.B;
            bVar.x = aVar.m;
            bVar.y = aVar.n;
            bVar.z = aVar.o;
            bVar.A = aVar.P;
            bVar.B = aVar.Q;
            bVar.C = aVar.R;
            bVar.g = aVar.f1018c;
            bVar.f560e = aVar.f1016a;
            bVar.f = aVar.f1017b;
            bVar.f558c = ((ViewGroup.MarginLayoutParams) aVar).width;
            bVar.f559d = ((ViewGroup.MarginLayoutParams) aVar).height;
            bVar.D = ((ViewGroup.MarginLayoutParams) aVar).leftMargin;
            bVar.E = ((ViewGroup.MarginLayoutParams) aVar).rightMargin;
            bVar.F = ((ViewGroup.MarginLayoutParams) aVar).topMargin;
            bVar.G = ((ViewGroup.MarginLayoutParams) aVar).bottomMargin;
            bVar.P = aVar.E;
            bVar.Q = aVar.D;
            bVar.S = aVar.G;
            bVar.R = aVar.F;
            bVar.h0 = aVar.S;
            bVar.i0 = aVar.T;
            bVar.T = aVar.H;
            bVar.U = aVar.I;
            bVar.V = aVar.L;
            bVar.W = aVar.M;
            bVar.X = aVar.J;
            bVar.Y = aVar.K;
            bVar.Z = aVar.N;
            bVar.a0 = aVar.O;
            bVar.g0 = aVar.U;
            bVar.K = aVar.u;
            bVar.M = aVar.w;
            bVar.J = aVar.t;
            bVar.L = aVar.v;
            bVar.O = aVar.x;
            bVar.N = aVar.y;
            bVar.H = aVar.getMarginEnd();
            this.f554d.I = aVar.getMarginStart();
        }

        public final void c(int i, f.a aVar) {
            b(i, aVar);
            this.f552b.f569d = aVar.n0;
            C0009e c0009e = this.f555e;
            c0009e.f572b = aVar.q0;
            c0009e.f573c = aVar.r0;
            c0009e.f574d = aVar.s0;
            c0009e.f575e = aVar.t0;
            c0009e.f = aVar.u0;
            c0009e.g = aVar.v0;
            c0009e.h = aVar.w0;
            c0009e.i = aVar.x0;
            c0009e.j = aVar.y0;
            c0009e.k = aVar.z0;
            c0009e.m = aVar.p0;
            c0009e.l = aVar.o0;
        }

        public Object clone() {
            a aVar = new a();
            b bVar = aVar.f554d;
            b bVar2 = this.f554d;
            if (bVar == null) {
                throw null;
            }
            bVar.f556a = bVar2.f556a;
            bVar.f558c = bVar2.f558c;
            bVar.f557b = bVar2.f557b;
            bVar.f559d = bVar2.f559d;
            bVar.f560e = bVar2.f560e;
            bVar.f = bVar2.f;
            bVar.g = bVar2.g;
            bVar.h = bVar2.h;
            bVar.i = bVar2.i;
            bVar.j = bVar2.j;
            bVar.k = bVar2.k;
            bVar.l = bVar2.l;
            bVar.m = bVar2.m;
            bVar.n = bVar2.n;
            bVar.o = bVar2.o;
            bVar.p = bVar2.p;
            bVar.q = bVar2.q;
            bVar.r = bVar2.r;
            bVar.s = bVar2.s;
            bVar.t = bVar2.t;
            bVar.u = bVar2.u;
            bVar.v = bVar2.v;
            bVar.w = bVar2.w;
            bVar.x = bVar2.x;
            bVar.y = bVar2.y;
            bVar.z = bVar2.z;
            bVar.A = bVar2.A;
            bVar.B = bVar2.B;
            bVar.C = bVar2.C;
            bVar.D = bVar2.D;
            bVar.E = bVar2.E;
            bVar.F = bVar2.F;
            bVar.G = bVar2.G;
            bVar.H = bVar2.H;
            bVar.I = bVar2.I;
            bVar.J = bVar2.J;
            bVar.K = bVar2.K;
            bVar.L = bVar2.L;
            bVar.M = bVar2.M;
            bVar.N = bVar2.N;
            bVar.O = bVar2.O;
            bVar.P = bVar2.P;
            bVar.Q = bVar2.Q;
            bVar.R = bVar2.R;
            bVar.S = bVar2.S;
            bVar.T = bVar2.T;
            bVar.U = bVar2.U;
            bVar.V = bVar2.V;
            bVar.W = bVar2.W;
            bVar.X = bVar2.X;
            bVar.Y = bVar2.Y;
            bVar.Z = bVar2.Z;
            bVar.a0 = bVar2.a0;
            bVar.b0 = bVar2.b0;
            bVar.c0 = bVar2.c0;
            bVar.d0 = bVar2.d0;
            bVar.g0 = bVar2.g0;
            int[] iArr = bVar2.e0;
            if (iArr != null) {
                bVar.e0 = Arrays.copyOf(iArr, iArr.length);
            } else {
                bVar.e0 = null;
            }
            bVar.f0 = bVar2.f0;
            bVar.h0 = bVar2.h0;
            bVar.i0 = bVar2.i0;
            bVar.j0 = bVar2.j0;
            c cVar = aVar.f553c;
            c cVar2 = this.f553c;
            if (cVar == null) {
                throw null;
            }
            cVar.f561a = cVar2.f561a;
            cVar.f562b = cVar2.f562b;
            cVar.f563c = cVar2.f563c;
            cVar.f564d = cVar2.f564d;
            cVar.f565e = cVar2.f565e;
            cVar.g = cVar2.g;
            cVar.f = cVar2.f;
            d dVar = aVar.f552b;
            d dVar2 = this.f552b;
            if (dVar == null) {
                throw null;
            }
            dVar.f566a = dVar2.f566a;
            dVar.f567b = dVar2.f567b;
            dVar.f569d = dVar2.f569d;
            dVar.f570e = dVar2.f570e;
            dVar.f568c = dVar2.f568c;
            C0009e c0009e = aVar.f555e;
            C0009e c0009e2 = this.f555e;
            if (c0009e == null) {
                throw null;
            }
            c0009e.f571a = c0009e2.f571a;
            c0009e.f572b = c0009e2.f572b;
            c0009e.f573c = c0009e2.f573c;
            c0009e.f574d = c0009e2.f574d;
            c0009e.f575e = c0009e2.f575e;
            c0009e.f = c0009e2.f;
            c0009e.g = c0009e2.g;
            c0009e.h = c0009e2.h;
            c0009e.i = c0009e2.i;
            c0009e.j = c0009e2.j;
            c0009e.k = c0009e2.k;
            c0009e.l = c0009e2.l;
            c0009e.m = c0009e2.m;
            aVar.f551a = this.f551a;
            return aVar;
        }
    }

    public static class b {
        public static SparseIntArray k0;

        /* renamed from: c, reason: collision with root package name */
        public int f558c;

        /* renamed from: d, reason: collision with root package name */
        public int f559d;
        public int[] e0;
        public String f0;
        public String g0;

        /* renamed from: a, reason: collision with root package name */
        public boolean f556a = false;

        /* renamed from: b, reason: collision with root package name */
        public boolean f557b = false;

        /* renamed from: e, reason: collision with root package name */
        public int f560e = -1;
        public int f = -1;
        public float g = -1.0f;
        public int h = -1;
        public int i = -1;
        public int j = -1;
        public int k = -1;
        public int l = -1;
        public int m = -1;
        public int n = -1;
        public int o = -1;
        public int p = -1;
        public int q = -1;
        public int r = -1;
        public int s = -1;
        public int t = -1;
        public float u = 0.5f;
        public float v = 0.5f;
        public String w = null;
        public int x = -1;
        public int y = 0;
        public float z = 0.0f;
        public int A = -1;
        public int B = -1;
        public int C = -1;
        public int D = -1;
        public int E = -1;
        public int F = -1;
        public int G = -1;
        public int H = -1;
        public int I = -1;
        public int J = -1;
        public int K = -1;
        public int L = -1;
        public int M = -1;
        public int N = -1;
        public int O = -1;
        public float P = -1.0f;
        public float Q = -1.0f;
        public int R = 0;
        public int S = 0;
        public int T = 0;
        public int U = 0;
        public int V = -1;
        public int W = -1;
        public int X = -1;
        public int Y = -1;
        public float Z = 1.0f;
        public float a0 = 1.0f;
        public int b0 = -1;
        public int c0 = 0;
        public int d0 = -1;
        public boolean h0 = false;
        public boolean i0 = false;
        public boolean j0 = true;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            k0 = sparseIntArray;
            sparseIntArray.append(k.Layout_layout_constraintLeft_toLeftOf, 24);
            k0.append(k.Layout_layout_constraintLeft_toRightOf, 25);
            k0.append(k.Layout_layout_constraintRight_toLeftOf, 28);
            k0.append(k.Layout_layout_constraintRight_toRightOf, 29);
            k0.append(k.Layout_layout_constraintTop_toTopOf, 35);
            k0.append(k.Layout_layout_constraintTop_toBottomOf, 34);
            k0.append(k.Layout_layout_constraintBottom_toTopOf, 4);
            k0.append(k.Layout_layout_constraintBottom_toBottomOf, 3);
            k0.append(k.Layout_layout_constraintBaseline_toBaselineOf, 1);
            k0.append(k.Layout_layout_editor_absoluteX, 6);
            k0.append(k.Layout_layout_editor_absoluteY, 7);
            k0.append(k.Layout_layout_constraintGuide_begin, 17);
            k0.append(k.Layout_layout_constraintGuide_end, 18);
            k0.append(k.Layout_layout_constraintGuide_percent, 19);
            k0.append(k.Layout_android_orientation, 26);
            k0.append(k.Layout_layout_constraintStart_toEndOf, 31);
            k0.append(k.Layout_layout_constraintStart_toStartOf, 32);
            k0.append(k.Layout_layout_constraintEnd_toStartOf, 10);
            k0.append(k.Layout_layout_constraintEnd_toEndOf, 9);
            k0.append(k.Layout_layout_goneMarginLeft, 13);
            k0.append(k.Layout_layout_goneMarginTop, 16);
            k0.append(k.Layout_layout_goneMarginRight, 14);
            k0.append(k.Layout_layout_goneMarginBottom, 11);
            k0.append(k.Layout_layout_goneMarginStart, 15);
            k0.append(k.Layout_layout_goneMarginEnd, 12);
            k0.append(k.Layout_layout_constraintVertical_weight, 38);
            k0.append(k.Layout_layout_constraintHorizontal_weight, 37);
            k0.append(k.Layout_layout_constraintHorizontal_chainStyle, 39);
            k0.append(k.Layout_layout_constraintVertical_chainStyle, 40);
            k0.append(k.Layout_layout_constraintHorizontal_bias, 20);
            k0.append(k.Layout_layout_constraintVertical_bias, 36);
            k0.append(k.Layout_layout_constraintDimensionRatio, 5);
            k0.append(k.Layout_layout_constraintLeft_creator, 76);
            k0.append(k.Layout_layout_constraintTop_creator, 76);
            k0.append(k.Layout_layout_constraintRight_creator, 76);
            k0.append(k.Layout_layout_constraintBottom_creator, 76);
            k0.append(k.Layout_layout_constraintBaseline_creator, 76);
            k0.append(k.Layout_android_layout_marginLeft, 23);
            k0.append(k.Layout_android_layout_marginRight, 27);
            k0.append(k.Layout_android_layout_marginStart, 30);
            k0.append(k.Layout_android_layout_marginEnd, 8);
            k0.append(k.Layout_android_layout_marginTop, 33);
            k0.append(k.Layout_android_layout_marginBottom, 2);
            k0.append(k.Layout_android_layout_width, 22);
            k0.append(k.Layout_android_layout_height, 21);
            k0.append(k.Layout_layout_constraintCircle, 61);
            k0.append(k.Layout_layout_constraintCircleRadius, 62);
            k0.append(k.Layout_layout_constraintCircleAngle, 63);
            k0.append(k.Layout_layout_constraintWidth_percent, 69);
            k0.append(k.Layout_layout_constraintHeight_percent, 70);
            k0.append(k.Layout_chainUseRtl, 71);
            k0.append(k.Layout_barrierDirection, 72);
            k0.append(k.Layout_barrierMargin, 73);
            k0.append(k.Layout_constraint_referenced_ids, 74);
            k0.append(k.Layout_barrierAllowsGoneWidgets, 75);
        }

        public void a(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.Layout);
            this.f557b = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                int i2 = k0.get(index);
                if (i2 == 80) {
                    this.h0 = typedArrayObtainStyledAttributes.getBoolean(index, this.h0);
                } else if (i2 != 81) {
                    switch (i2) {
                        case 1:
                            this.p = e.a(typedArrayObtainStyledAttributes, index, this.p);
                            break;
                        case 2:
                            this.G = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.G);
                            break;
                        case 3:
                            this.o = e.a(typedArrayObtainStyledAttributes, index, this.o);
                            break;
                        case 4:
                            this.n = e.a(typedArrayObtainStyledAttributes, index, this.n);
                            break;
                        case 5:
                            this.w = typedArrayObtainStyledAttributes.getString(index);
                            break;
                        case 6:
                            this.A = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.A);
                            break;
                        case 7:
                            this.B = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.B);
                            break;
                        case 8:
                            this.H = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.H);
                            break;
                        case 9:
                            this.t = e.a(typedArrayObtainStyledAttributes, index, this.t);
                            break;
                        case 10:
                            this.s = e.a(typedArrayObtainStyledAttributes, index, this.s);
                            break;
                        case 11:
                            this.M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.M);
                            break;
                        case 12:
                            this.N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.N);
                            break;
                        case 13:
                            this.J = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.J);
                            break;
                        case 14:
                            this.L = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.L);
                            break;
                        case 15:
                            this.O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.O);
                            break;
                        case 16:
                            this.K = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.K);
                            break;
                        case 17:
                            this.f560e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f560e);
                            break;
                        case 18:
                            this.f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f);
                            break;
                        case 19:
                            this.g = typedArrayObtainStyledAttributes.getFloat(index, this.g);
                            break;
                        case 20:
                            this.u = typedArrayObtainStyledAttributes.getFloat(index, this.u);
                            break;
                        case 21:
                            this.f559d = typedArrayObtainStyledAttributes.getLayoutDimension(index, this.f559d);
                            break;
                        case 22:
                            this.f558c = typedArrayObtainStyledAttributes.getLayoutDimension(index, this.f558c);
                            break;
                        case 23:
                            this.D = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.D);
                            break;
                        case 24:
                            this.h = e.a(typedArrayObtainStyledAttributes, index, this.h);
                            break;
                        case 25:
                            this.i = e.a(typedArrayObtainStyledAttributes, index, this.i);
                            break;
                        case 26:
                            this.C = typedArrayObtainStyledAttributes.getInt(index, this.C);
                            break;
                        case 27:
                            this.E = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.E);
                            break;
                        case 28:
                            this.j = e.a(typedArrayObtainStyledAttributes, index, this.j);
                            break;
                        case 29:
                            this.k = e.a(typedArrayObtainStyledAttributes, index, this.k);
                            break;
                        case 30:
                            this.I = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.I);
                            break;
                        case 31:
                            this.q = e.a(typedArrayObtainStyledAttributes, index, this.q);
                            break;
                        case 32:
                            this.r = e.a(typedArrayObtainStyledAttributes, index, this.r);
                            break;
                        case 33:
                            this.F = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.F);
                            break;
                        case 34:
                            this.m = e.a(typedArrayObtainStyledAttributes, index, this.m);
                            break;
                        case 35:
                            this.l = e.a(typedArrayObtainStyledAttributes, index, this.l);
                            break;
                        case 36:
                            this.v = typedArrayObtainStyledAttributes.getFloat(index, this.v);
                            break;
                        case 37:
                            this.Q = typedArrayObtainStyledAttributes.getFloat(index, this.Q);
                            break;
                        case 38:
                            this.P = typedArrayObtainStyledAttributes.getFloat(index, this.P);
                            break;
                        case 39:
                            this.R = typedArrayObtainStyledAttributes.getInt(index, this.R);
                            break;
                        case 40:
                            this.S = typedArrayObtainStyledAttributes.getInt(index, this.S);
                            break;
                        default:
                            switch (i2) {
                                case 54:
                                    this.T = typedArrayObtainStyledAttributes.getInt(index, this.T);
                                    break;
                                case 55:
                                    this.U = typedArrayObtainStyledAttributes.getInt(index, this.U);
                                    break;
                                case 56:
                                    this.V = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.V);
                                    break;
                                case 57:
                                    this.W = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.W);
                                    break;
                                case 58:
                                    this.X = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.X);
                                    break;
                                case 59:
                                    this.Y = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.Y);
                                    break;
                                default:
                                    switch (i2) {
                                        case 61:
                                            this.x = e.a(typedArrayObtainStyledAttributes, index, this.x);
                                            break;
                                        case 62:
                                            this.y = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.y);
                                            break;
                                        case 63:
                                            this.z = typedArrayObtainStyledAttributes.getFloat(index, this.z);
                                            break;
                                        default:
                                            switch (i2) {
                                                case 69:
                                                    this.Z = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                                                    break;
                                                case 70:
                                                    this.a0 = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                                                    break;
                                                case 71:
                                                    break;
                                                case 72:
                                                    this.b0 = typedArrayObtainStyledAttributes.getInt(index, this.b0);
                                                    break;
                                                case 73:
                                                    this.c0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.c0);
                                                    break;
                                                case 74:
                                                    this.f0 = typedArrayObtainStyledAttributes.getString(index);
                                                    break;
                                                case 75:
                                                    this.j0 = typedArrayObtainStyledAttributes.getBoolean(index, this.j0);
                                                    break;
                                                case 76:
                                                default:
                                                    Integer.toHexString(index);
                                                    k0.get(index);
                                                    break;
                                                case 77:
                                                    this.g0 = typedArrayObtainStyledAttributes.getString(index);
                                                    break;
                                            }
                                    }
                            }
                    }
                } else {
                    this.i0 = typedArrayObtainStyledAttributes.getBoolean(index, this.i0);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static class c {
        public static SparseIntArray h;

        /* renamed from: a, reason: collision with root package name */
        public boolean f561a = false;

        /* renamed from: b, reason: collision with root package name */
        public int f562b = -1;

        /* renamed from: c, reason: collision with root package name */
        public String f563c = null;

        /* renamed from: d, reason: collision with root package name */
        public int f564d = -1;

        /* renamed from: e, reason: collision with root package name */
        public int f565e = 0;
        public float f = Float.NaN;
        public float g = Float.NaN;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            h = sparseIntArray;
            sparseIntArray.append(k.Motion_motionPathRotate, 1);
            h.append(k.Motion_pathMotionArc, 2);
            h.append(k.Motion_transitionEasing, 3);
            h.append(k.Motion_drawPath, 4);
            h.append(k.Motion_animate_relativeTo, 5);
            h.append(k.Motion_motionStagger, 6);
        }

        public void a(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.Motion);
            this.f561a = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                switch (h.get(index)) {
                    case 1:
                        this.g = typedArrayObtainStyledAttributes.getFloat(index, this.g);
                        break;
                    case 2:
                        this.f564d = typedArrayObtainStyledAttributes.getInt(index, this.f564d);
                        break;
                    case 3:
                        this.f563c = typedArrayObtainStyledAttributes.peekValue(index).type == 3 ? typedArrayObtainStyledAttributes.getString(index) : a.f.a.a.a.f426a[typedArrayObtainStyledAttributes.getInteger(index, 0)];
                        break;
                    case 4:
                        this.f565e = typedArrayObtainStyledAttributes.getInt(index, 0);
                        break;
                    case 5:
                        this.f562b = e.a(typedArrayObtainStyledAttributes, index, this.f562b);
                        break;
                    case 6:
                        this.f = typedArrayObtainStyledAttributes.getFloat(index, this.f);
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static class d {

        /* renamed from: a, reason: collision with root package name */
        public boolean f566a = false;

        /* renamed from: b, reason: collision with root package name */
        public int f567b = 0;

        /* renamed from: c, reason: collision with root package name */
        public int f568c = 0;

        /* renamed from: d, reason: collision with root package name */
        public float f569d = 1.0f;

        /* renamed from: e, reason: collision with root package name */
        public float f570e = Float.NaN;

        public void a(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.PropertySet);
            this.f566a = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == k.PropertySet_android_alpha) {
                    this.f569d = typedArrayObtainStyledAttributes.getFloat(index, this.f569d);
                } else if (index == k.PropertySet_android_visibility) {
                    int i2 = typedArrayObtainStyledAttributes.getInt(index, this.f567b);
                    this.f567b = i2;
                    this.f567b = e.f546d[i2];
                } else if (index == k.PropertySet_visibilityMode) {
                    this.f568c = typedArrayObtainStyledAttributes.getInt(index, this.f568c);
                } else if (index == k.PropertySet_motionProgress) {
                    this.f570e = typedArrayObtainStyledAttributes.getFloat(index, this.f570e);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* renamed from: a.f.c.e$e, reason: collision with other inner class name */
    public static class C0009e {
        public static SparseIntArray n;

        /* renamed from: a, reason: collision with root package name */
        public boolean f571a = false;

        /* renamed from: b, reason: collision with root package name */
        public float f572b = 0.0f;

        /* renamed from: c, reason: collision with root package name */
        public float f573c = 0.0f;

        /* renamed from: d, reason: collision with root package name */
        public float f574d = 0.0f;

        /* renamed from: e, reason: collision with root package name */
        public float f575e = 1.0f;
        public float f = 1.0f;
        public float g = Float.NaN;
        public float h = Float.NaN;
        public float i = 0.0f;
        public float j = 0.0f;
        public float k = 0.0f;
        public boolean l = false;
        public float m = 0.0f;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            n = sparseIntArray;
            sparseIntArray.append(k.Transform_android_rotation, 1);
            n.append(k.Transform_android_rotationX, 2);
            n.append(k.Transform_android_rotationY, 3);
            n.append(k.Transform_android_scaleX, 4);
            n.append(k.Transform_android_scaleY, 5);
            n.append(k.Transform_android_transformPivotX, 6);
            n.append(k.Transform_android_transformPivotY, 7);
            n.append(k.Transform_android_translationX, 8);
            n.append(k.Transform_android_translationY, 9);
            n.append(k.Transform_android_translationZ, 10);
            n.append(k.Transform_android_elevation, 11);
        }

        public void a(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.Transform);
            this.f571a = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                switch (n.get(index)) {
                    case 1:
                        this.f572b = typedArrayObtainStyledAttributes.getFloat(index, this.f572b);
                        break;
                    case 2:
                        this.f573c = typedArrayObtainStyledAttributes.getFloat(index, this.f573c);
                        break;
                    case 3:
                        this.f574d = typedArrayObtainStyledAttributes.getFloat(index, this.f574d);
                        break;
                    case 4:
                        this.f575e = typedArrayObtainStyledAttributes.getFloat(index, this.f575e);
                        break;
                    case 5:
                        this.f = typedArrayObtainStyledAttributes.getFloat(index, this.f);
                        break;
                    case 6:
                        this.g = typedArrayObtainStyledAttributes.getDimension(index, this.g);
                        break;
                    case 7:
                        this.h = typedArrayObtainStyledAttributes.getDimension(index, this.h);
                        break;
                    case 8:
                        this.i = typedArrayObtainStyledAttributes.getDimension(index, this.i);
                        break;
                    case 9:
                        this.j = typedArrayObtainStyledAttributes.getDimension(index, this.j);
                        break;
                    case 10:
                        this.k = typedArrayObtainStyledAttributes.getDimension(index, this.k);
                        break;
                    case 11:
                        this.l = true;
                        this.m = typedArrayObtainStyledAttributes.getDimension(index, this.m);
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f547e = sparseIntArray;
        sparseIntArray.append(k.Constraint_layout_constraintLeft_toLeftOf, 25);
        f547e.append(k.Constraint_layout_constraintLeft_toRightOf, 26);
        f547e.append(k.Constraint_layout_constraintRight_toLeftOf, 29);
        f547e.append(k.Constraint_layout_constraintRight_toRightOf, 30);
        f547e.append(k.Constraint_layout_constraintTop_toTopOf, 36);
        f547e.append(k.Constraint_layout_constraintTop_toBottomOf, 35);
        f547e.append(k.Constraint_layout_constraintBottom_toTopOf, 4);
        f547e.append(k.Constraint_layout_constraintBottom_toBottomOf, 3);
        f547e.append(k.Constraint_layout_constraintBaseline_toBaselineOf, 1);
        f547e.append(k.Constraint_layout_editor_absoluteX, 6);
        f547e.append(k.Constraint_layout_editor_absoluteY, 7);
        f547e.append(k.Constraint_layout_constraintGuide_begin, 17);
        f547e.append(k.Constraint_layout_constraintGuide_end, 18);
        f547e.append(k.Constraint_layout_constraintGuide_percent, 19);
        f547e.append(k.Constraint_android_orientation, 27);
        f547e.append(k.Constraint_layout_constraintStart_toEndOf, 32);
        f547e.append(k.Constraint_layout_constraintStart_toStartOf, 33);
        f547e.append(k.Constraint_layout_constraintEnd_toStartOf, 10);
        f547e.append(k.Constraint_layout_constraintEnd_toEndOf, 9);
        f547e.append(k.Constraint_layout_goneMarginLeft, 13);
        f547e.append(k.Constraint_layout_goneMarginTop, 16);
        f547e.append(k.Constraint_layout_goneMarginRight, 14);
        f547e.append(k.Constraint_layout_goneMarginBottom, 11);
        f547e.append(k.Constraint_layout_goneMarginStart, 15);
        f547e.append(k.Constraint_layout_goneMarginEnd, 12);
        f547e.append(k.Constraint_layout_constraintVertical_weight, 40);
        f547e.append(k.Constraint_layout_constraintHorizontal_weight, 39);
        f547e.append(k.Constraint_layout_constraintHorizontal_chainStyle, 41);
        f547e.append(k.Constraint_layout_constraintVertical_chainStyle, 42);
        f547e.append(k.Constraint_layout_constraintHorizontal_bias, 20);
        f547e.append(k.Constraint_layout_constraintVertical_bias, 37);
        f547e.append(k.Constraint_layout_constraintDimensionRatio, 5);
        f547e.append(k.Constraint_layout_constraintLeft_creator, 82);
        f547e.append(k.Constraint_layout_constraintTop_creator, 82);
        f547e.append(k.Constraint_layout_constraintRight_creator, 82);
        f547e.append(k.Constraint_layout_constraintBottom_creator, 82);
        f547e.append(k.Constraint_layout_constraintBaseline_creator, 82);
        f547e.append(k.Constraint_android_layout_marginLeft, 24);
        f547e.append(k.Constraint_android_layout_marginRight, 28);
        f547e.append(k.Constraint_android_layout_marginStart, 31);
        f547e.append(k.Constraint_android_layout_marginEnd, 8);
        f547e.append(k.Constraint_android_layout_marginTop, 34);
        f547e.append(k.Constraint_android_layout_marginBottom, 2);
        f547e.append(k.Constraint_android_layout_width, 23);
        f547e.append(k.Constraint_android_layout_height, 21);
        f547e.append(k.Constraint_android_visibility, 22);
        f547e.append(k.Constraint_android_alpha, 43);
        f547e.append(k.Constraint_android_elevation, 44);
        f547e.append(k.Constraint_android_rotationX, 45);
        f547e.append(k.Constraint_android_rotationY, 46);
        f547e.append(k.Constraint_android_rotation, 60);
        f547e.append(k.Constraint_android_scaleX, 47);
        f547e.append(k.Constraint_android_scaleY, 48);
        f547e.append(k.Constraint_android_transformPivotX, 49);
        f547e.append(k.Constraint_android_transformPivotY, 50);
        f547e.append(k.Constraint_android_translationX, 51);
        f547e.append(k.Constraint_android_translationY, 52);
        f547e.append(k.Constraint_android_translationZ, 53);
        f547e.append(k.Constraint_layout_constraintWidth_default, 54);
        f547e.append(k.Constraint_layout_constraintHeight_default, 55);
        f547e.append(k.Constraint_layout_constraintWidth_max, 56);
        f547e.append(k.Constraint_layout_constraintHeight_max, 57);
        f547e.append(k.Constraint_layout_constraintWidth_min, 58);
        f547e.append(k.Constraint_layout_constraintHeight_min, 59);
        f547e.append(k.Constraint_layout_constraintCircle, 61);
        f547e.append(k.Constraint_layout_constraintCircleRadius, 62);
        f547e.append(k.Constraint_layout_constraintCircleAngle, 63);
        f547e.append(k.Constraint_animate_relativeTo, 64);
        f547e.append(k.Constraint_transitionEasing, 65);
        f547e.append(k.Constraint_drawPath, 66);
        f547e.append(k.Constraint_transitionPathRotate, 67);
        f547e.append(k.Constraint_motionStagger, 79);
        f547e.append(k.Constraint_android_id, 38);
        f547e.append(k.Constraint_motionProgress, 68);
        f547e.append(k.Constraint_layout_constraintWidth_percent, 69);
        f547e.append(k.Constraint_layout_constraintHeight_percent, 70);
        f547e.append(k.Constraint_chainUseRtl, 71);
        f547e.append(k.Constraint_barrierDirection, 72);
        f547e.append(k.Constraint_barrierMargin, 73);
        f547e.append(k.Constraint_constraint_referenced_ids, 74);
        f547e.append(k.Constraint_barrierAllowsGoneWidgets, 75);
        f547e.append(k.Constraint_pathMotionArc, 76);
        f547e.append(k.Constraint_layout_constraintTag, 77);
        f547e.append(k.Constraint_visibilityMode, 78);
        f547e.append(k.Constraint_layout_constrainedWidth, 80);
        f547e.append(k.Constraint_layout_constrainedHeight, 81);
    }

    public static int a(TypedArray typedArray, int i, int i2) {
        int resourceId = typedArray.getResourceId(i, i2);
        return resourceId == -1 ? typedArray.getInt(i, -1) : resourceId;
    }

    public void b(Context context, int i) {
        a.f.c.b bVar;
        e eVar = this;
        ConstraintLayout constraintLayout = (ConstraintLayout) LayoutInflater.from(context).inflate(i, (ViewGroup) null);
        int childCount = constraintLayout.getChildCount();
        eVar.f550c.clear();
        int i2 = 0;
        while (i2 < childCount) {
            View childAt = constraintLayout.getChildAt(i2);
            ConstraintLayout.a aVar = (ConstraintLayout.a) childAt.getLayoutParams();
            int id = childAt.getId();
            if (eVar.f549b && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!eVar.f550c.containsKey(Integer.valueOf(id))) {
                eVar.f550c.put(Integer.valueOf(id), new a());
            }
            a aVar2 = eVar.f550c.get(Integer.valueOf(id));
            HashMap<String, a.f.c.b> map = eVar.f548a;
            HashMap<String, a.f.c.b> map2 = new HashMap<>();
            Class<?> cls = childAt.getClass();
            for (String str : map.keySet()) {
                a.f.c.b bVar2 = map.get(str);
                try {
                    if (str.equals("BackgroundColor")) {
                        bVar = new a.f.c.b(bVar2, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor()));
                    } else {
                        try {
                            bVar = new a.f.c.b(bVar2, cls.getMethod("getMap" + str, new Class[0]).invoke(childAt, new Object[0]));
                        } catch (IllegalAccessException e2) {
                            e = e2;
                            e.printStackTrace();
                        } catch (NoSuchMethodException e3) {
                            e = e3;
                            e.printStackTrace();
                        } catch (InvocationTargetException e4) {
                            e = e4;
                            e.printStackTrace();
                        }
                    }
                    map2.put(str, bVar);
                } catch (IllegalAccessException e5) {
                    e = e5;
                } catch (NoSuchMethodException e6) {
                    e = e6;
                } catch (InvocationTargetException e7) {
                    e = e7;
                }
            }
            aVar2.f = map2;
            aVar2.b(id, aVar);
            aVar2.f552b.f567b = childAt.getVisibility();
            aVar2.f552b.f569d = childAt.getAlpha();
            aVar2.f555e.f572b = childAt.getRotation();
            aVar2.f555e.f573c = childAt.getRotationX();
            aVar2.f555e.f574d = childAt.getRotationY();
            aVar2.f555e.f575e = childAt.getScaleX();
            aVar2.f555e.f = childAt.getScaleY();
            float pivotX = childAt.getPivotX();
            float pivotY = childAt.getPivotY();
            if (pivotX != 0.0d || pivotY != 0.0d) {
                C0009e c0009e = aVar2.f555e;
                c0009e.g = pivotX;
                c0009e.h = pivotY;
            }
            aVar2.f555e.i = childAt.getTranslationX();
            aVar2.f555e.j = childAt.getTranslationY();
            aVar2.f555e.k = childAt.getTranslationZ();
            C0009e c0009e2 = aVar2.f555e;
            if (c0009e2.l) {
                c0009e2.m = childAt.getElevation();
            }
            if (childAt instanceof a.f.c.a) {
                a.f.c.a aVar3 = (a.f.c.a) childAt;
                b bVar3 = aVar2.f554d;
                bVar3.j0 = aVar3.k.i0;
                bVar3.e0 = aVar3.getReferencedIds();
                aVar2.f554d.b0 = aVar3.getType();
                aVar2.f554d.c0 = aVar3.getMargin();
            }
            i2++;
            eVar = this;
        }
    }

    public final int[] c(View view, String str) throws IllegalAccessException, IllegalArgumentException {
        int iIntValue;
        Object objC;
        String[] strArrSplit = str.split(",");
        Context context = view.getContext();
        int[] iArr = new int[strArrSplit.length];
        int i = 0;
        int i2 = 0;
        while (i < strArrSplit.length) {
            String strTrim = strArrSplit[i].trim();
            try {
                iIntValue = j.class.getField(strTrim).getInt(null);
            } catch (Exception unused) {
                iIntValue = 0;
            }
            if (iIntValue == 0) {
                iIntValue = context.getResources().getIdentifier(strTrim, "id", context.getPackageName());
            }
            if (iIntValue == 0 && view.isInEditMode() && (view.getParent() instanceof ConstraintLayout) && (objC = ((ConstraintLayout) view.getParent()).c(0, strTrim)) != null && (objC instanceof Integer)) {
                iIntValue = ((Integer) objC).intValue();
            }
            iArr[i2] = iIntValue;
            i++;
            i2++;
        }
        return i2 != strArrSplit.length ? Arrays.copyOf(iArr, i2) : iArr;
    }

    public final a d(Context context, AttributeSet attributeSet) {
        c cVar;
        String string;
        a aVar = new a();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.Constraint);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index != k.Constraint_android_id && k.Constraint_android_layout_marginStart != index && k.Constraint_android_layout_marginEnd != index) {
                aVar.f553c.f561a = true;
                aVar.f554d.f557b = true;
                aVar.f552b.f566a = true;
                aVar.f555e.f571a = true;
            }
            switch (f547e.get(index)) {
                case 1:
                    b bVar = aVar.f554d;
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, bVar.p);
                    if (resourceId == -1) {
                        resourceId = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    bVar.p = resourceId;
                    break;
                case 2:
                    b bVar2 = aVar.f554d;
                    bVar2.G = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar2.G);
                    break;
                case 3:
                    b bVar3 = aVar.f554d;
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, bVar3.o);
                    if (resourceId2 == -1) {
                        resourceId2 = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    bVar3.o = resourceId2;
                    break;
                case 4:
                    b bVar4 = aVar.f554d;
                    int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(index, bVar4.n);
                    if (resourceId3 == -1) {
                        resourceId3 = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    bVar4.n = resourceId3;
                    break;
                case 5:
                    aVar.f554d.w = typedArrayObtainStyledAttributes.getString(index);
                    break;
                case 6:
                    b bVar5 = aVar.f554d;
                    bVar5.A = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, bVar5.A);
                    break;
                case 7:
                    b bVar6 = aVar.f554d;
                    bVar6.B = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, bVar6.B);
                    break;
                case 8:
                    b bVar7 = aVar.f554d;
                    bVar7.H = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar7.H);
                    break;
                case 9:
                    b bVar8 = aVar.f554d;
                    int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(index, bVar8.t);
                    if (resourceId4 == -1) {
                        resourceId4 = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    bVar8.t = resourceId4;
                    break;
                case 10:
                    b bVar9 = aVar.f554d;
                    int resourceId5 = typedArrayObtainStyledAttributes.getResourceId(index, bVar9.s);
                    if (resourceId5 == -1) {
                        resourceId5 = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    bVar9.s = resourceId5;
                    break;
                case 11:
                    b bVar10 = aVar.f554d;
                    bVar10.M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar10.M);
                    break;
                case 12:
                    b bVar11 = aVar.f554d;
                    bVar11.N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar11.N);
                    break;
                case 13:
                    b bVar12 = aVar.f554d;
                    bVar12.J = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar12.J);
                    break;
                case 14:
                    b bVar13 = aVar.f554d;
                    bVar13.L = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar13.L);
                    break;
                case 15:
                    b bVar14 = aVar.f554d;
                    bVar14.O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar14.O);
                    break;
                case 16:
                    b bVar15 = aVar.f554d;
                    bVar15.K = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar15.K);
                    break;
                case 17:
                    b bVar16 = aVar.f554d;
                    bVar16.f560e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, bVar16.f560e);
                    break;
                case 18:
                    b bVar17 = aVar.f554d;
                    bVar17.f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, bVar17.f);
                    break;
                case 19:
                    b bVar18 = aVar.f554d;
                    bVar18.g = typedArrayObtainStyledAttributes.getFloat(index, bVar18.g);
                    break;
                case 20:
                    b bVar19 = aVar.f554d;
                    bVar19.u = typedArrayObtainStyledAttributes.getFloat(index, bVar19.u);
                    break;
                case 21:
                    b bVar20 = aVar.f554d;
                    bVar20.f559d = typedArrayObtainStyledAttributes.getLayoutDimension(index, bVar20.f559d);
                    break;
                case 22:
                    d dVar = aVar.f552b;
                    dVar.f567b = typedArrayObtainStyledAttributes.getInt(index, dVar.f567b);
                    d dVar2 = aVar.f552b;
                    dVar2.f567b = f546d[dVar2.f567b];
                    break;
                case 23:
                    b bVar21 = aVar.f554d;
                    bVar21.f558c = typedArrayObtainStyledAttributes.getLayoutDimension(index, bVar21.f558c);
                    break;
                case 24:
                    b bVar22 = aVar.f554d;
                    bVar22.D = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar22.D);
                    break;
                case 25:
                    b bVar23 = aVar.f554d;
                    int resourceId6 = typedArrayObtainStyledAttributes.getResourceId(index, bVar23.h);
                    if (resourceId6 == -1) {
                        resourceId6 = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    bVar23.h = resourceId6;
                    break;
                case 26:
                    b bVar24 = aVar.f554d;
                    int resourceId7 = typedArrayObtainStyledAttributes.getResourceId(index, bVar24.i);
                    if (resourceId7 == -1) {
                        resourceId7 = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    bVar24.i = resourceId7;
                    break;
                case 27:
                    b bVar25 = aVar.f554d;
                    bVar25.C = typedArrayObtainStyledAttributes.getInt(index, bVar25.C);
                    break;
                case 28:
                    b bVar26 = aVar.f554d;
                    bVar26.E = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar26.E);
                    break;
                case 29:
                    b bVar27 = aVar.f554d;
                    int resourceId8 = typedArrayObtainStyledAttributes.getResourceId(index, bVar27.j);
                    if (resourceId8 == -1) {
                        resourceId8 = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    bVar27.j = resourceId8;
                    break;
                case 30:
                    b bVar28 = aVar.f554d;
                    int resourceId9 = typedArrayObtainStyledAttributes.getResourceId(index, bVar28.k);
                    if (resourceId9 == -1) {
                        resourceId9 = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    bVar28.k = resourceId9;
                    break;
                case 31:
                    b bVar29 = aVar.f554d;
                    bVar29.I = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar29.I);
                    break;
                case 32:
                    b bVar30 = aVar.f554d;
                    int resourceId10 = typedArrayObtainStyledAttributes.getResourceId(index, bVar30.q);
                    if (resourceId10 == -1) {
                        resourceId10 = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    bVar30.q = resourceId10;
                    break;
                case 33:
                    b bVar31 = aVar.f554d;
                    int resourceId11 = typedArrayObtainStyledAttributes.getResourceId(index, bVar31.r);
                    if (resourceId11 == -1) {
                        resourceId11 = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    bVar31.r = resourceId11;
                    break;
                case 34:
                    b bVar32 = aVar.f554d;
                    bVar32.F = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar32.F);
                    break;
                case 35:
                    b bVar33 = aVar.f554d;
                    int resourceId12 = typedArrayObtainStyledAttributes.getResourceId(index, bVar33.m);
                    if (resourceId12 == -1) {
                        resourceId12 = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    bVar33.m = resourceId12;
                    break;
                case 36:
                    b bVar34 = aVar.f554d;
                    int resourceId13 = typedArrayObtainStyledAttributes.getResourceId(index, bVar34.l);
                    if (resourceId13 == -1) {
                        resourceId13 = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    bVar34.l = resourceId13;
                    break;
                case 37:
                    b bVar35 = aVar.f554d;
                    bVar35.v = typedArrayObtainStyledAttributes.getFloat(index, bVar35.v);
                    break;
                case 38:
                    aVar.f551a = typedArrayObtainStyledAttributes.getResourceId(index, aVar.f551a);
                    break;
                case 39:
                    b bVar36 = aVar.f554d;
                    bVar36.Q = typedArrayObtainStyledAttributes.getFloat(index, bVar36.Q);
                    break;
                case 40:
                    b bVar37 = aVar.f554d;
                    bVar37.P = typedArrayObtainStyledAttributes.getFloat(index, bVar37.P);
                    break;
                case 41:
                    b bVar38 = aVar.f554d;
                    bVar38.R = typedArrayObtainStyledAttributes.getInt(index, bVar38.R);
                    break;
                case 42:
                    b bVar39 = aVar.f554d;
                    bVar39.S = typedArrayObtainStyledAttributes.getInt(index, bVar39.S);
                    break;
                case 43:
                    d dVar3 = aVar.f552b;
                    dVar3.f569d = typedArrayObtainStyledAttributes.getFloat(index, dVar3.f569d);
                    break;
                case 44:
                    C0009e c0009e = aVar.f555e;
                    c0009e.l = true;
                    c0009e.m = typedArrayObtainStyledAttributes.getDimension(index, c0009e.m);
                    break;
                case 45:
                    C0009e c0009e2 = aVar.f555e;
                    c0009e2.f573c = typedArrayObtainStyledAttributes.getFloat(index, c0009e2.f573c);
                    break;
                case 46:
                    C0009e c0009e3 = aVar.f555e;
                    c0009e3.f574d = typedArrayObtainStyledAttributes.getFloat(index, c0009e3.f574d);
                    break;
                case 47:
                    C0009e c0009e4 = aVar.f555e;
                    c0009e4.f575e = typedArrayObtainStyledAttributes.getFloat(index, c0009e4.f575e);
                    break;
                case 48:
                    C0009e c0009e5 = aVar.f555e;
                    c0009e5.f = typedArrayObtainStyledAttributes.getFloat(index, c0009e5.f);
                    break;
                case 49:
                    C0009e c0009e6 = aVar.f555e;
                    c0009e6.g = typedArrayObtainStyledAttributes.getDimension(index, c0009e6.g);
                    break;
                case 50:
                    C0009e c0009e7 = aVar.f555e;
                    c0009e7.h = typedArrayObtainStyledAttributes.getDimension(index, c0009e7.h);
                    break;
                case 51:
                    C0009e c0009e8 = aVar.f555e;
                    c0009e8.i = typedArrayObtainStyledAttributes.getDimension(index, c0009e8.i);
                    break;
                case 52:
                    C0009e c0009e9 = aVar.f555e;
                    c0009e9.j = typedArrayObtainStyledAttributes.getDimension(index, c0009e9.j);
                    break;
                case 53:
                    C0009e c0009e10 = aVar.f555e;
                    c0009e10.k = typedArrayObtainStyledAttributes.getDimension(index, c0009e10.k);
                    break;
                case 54:
                    b bVar40 = aVar.f554d;
                    bVar40.T = typedArrayObtainStyledAttributes.getInt(index, bVar40.T);
                    break;
                case 55:
                    b bVar41 = aVar.f554d;
                    bVar41.U = typedArrayObtainStyledAttributes.getInt(index, bVar41.U);
                    break;
                case 56:
                    b bVar42 = aVar.f554d;
                    bVar42.V = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar42.V);
                    break;
                case 57:
                    b bVar43 = aVar.f554d;
                    bVar43.W = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar43.W);
                    break;
                case 58:
                    b bVar44 = aVar.f554d;
                    bVar44.X = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar44.X);
                    break;
                case 59:
                    b bVar45 = aVar.f554d;
                    bVar45.Y = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar45.Y);
                    break;
                case 60:
                    C0009e c0009e11 = aVar.f555e;
                    c0009e11.f572b = typedArrayObtainStyledAttributes.getFloat(index, c0009e11.f572b);
                    break;
                case 61:
                    b bVar46 = aVar.f554d;
                    int resourceId14 = typedArrayObtainStyledAttributes.getResourceId(index, bVar46.x);
                    if (resourceId14 == -1) {
                        resourceId14 = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    bVar46.x = resourceId14;
                    break;
                case 62:
                    b bVar47 = aVar.f554d;
                    bVar47.y = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar47.y);
                    break;
                case 63:
                    b bVar48 = aVar.f554d;
                    bVar48.z = typedArrayObtainStyledAttributes.getFloat(index, bVar48.z);
                    break;
                case 64:
                    c cVar2 = aVar.f553c;
                    int resourceId15 = typedArrayObtainStyledAttributes.getResourceId(index, cVar2.f562b);
                    if (resourceId15 == -1) {
                        resourceId15 = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    cVar2.f562b = resourceId15;
                    break;
                case 65:
                    if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                        cVar = aVar.f553c;
                        string = typedArrayObtainStyledAttributes.getString(index);
                    } else {
                        cVar = aVar.f553c;
                        string = a.f.a.a.a.f426a[typedArrayObtainStyledAttributes.getInteger(index, 0)];
                    }
                    cVar.f563c = string;
                    break;
                case 66:
                    aVar.f553c.f565e = typedArrayObtainStyledAttributes.getInt(index, 0);
                    break;
                case 67:
                    c cVar3 = aVar.f553c;
                    cVar3.g = typedArrayObtainStyledAttributes.getFloat(index, cVar3.g);
                    break;
                case 68:
                    d dVar4 = aVar.f552b;
                    dVar4.f570e = typedArrayObtainStyledAttributes.getFloat(index, dVar4.f570e);
                    break;
                case 69:
                    aVar.f554d.Z = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                    break;
                case 70:
                    aVar.f554d.a0 = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                    break;
                case 71:
                    break;
                case 72:
                    b bVar49 = aVar.f554d;
                    bVar49.b0 = typedArrayObtainStyledAttributes.getInt(index, bVar49.b0);
                    break;
                case 73:
                    b bVar50 = aVar.f554d;
                    bVar50.c0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar50.c0);
                    break;
                case 74:
                    aVar.f554d.f0 = typedArrayObtainStyledAttributes.getString(index);
                    break;
                case 75:
                    b bVar51 = aVar.f554d;
                    bVar51.j0 = typedArrayObtainStyledAttributes.getBoolean(index, bVar51.j0);
                    break;
                case 76:
                    c cVar4 = aVar.f553c;
                    cVar4.f564d = typedArrayObtainStyledAttributes.getInt(index, cVar4.f564d);
                    break;
                case 77:
                    aVar.f554d.g0 = typedArrayObtainStyledAttributes.getString(index);
                    break;
                case 78:
                    d dVar5 = aVar.f552b;
                    dVar5.f568c = typedArrayObtainStyledAttributes.getInt(index, dVar5.f568c);
                    break;
                case 79:
                    c cVar5 = aVar.f553c;
                    cVar5.f = typedArrayObtainStyledAttributes.getFloat(index, cVar5.f);
                    break;
                case 80:
                    b bVar52 = aVar.f554d;
                    bVar52.h0 = typedArrayObtainStyledAttributes.getBoolean(index, bVar52.h0);
                    break;
                case 81:
                    b bVar53 = aVar.f554d;
                    bVar53.i0 = typedArrayObtainStyledAttributes.getBoolean(index, bVar53.i0);
                    break;
                default:
                    Integer.toHexString(index);
                    f547e.get(index);
                    break;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        return aVar;
    }

    public void e(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    a aVarD = d(context, Xml.asAttributeSet(xml));
                    if (name.equalsIgnoreCase("Guideline")) {
                        aVarD.f554d.f556a = true;
                    }
                    this.f550c.put(Integer.valueOf(aVarD.f551a), aVarD);
                }
            }
        } catch (IOException e2) {
            e2.printStackTrace();
        } catch (XmlPullParserException e3) {
            e3.printStackTrace();
        }
    }
}
