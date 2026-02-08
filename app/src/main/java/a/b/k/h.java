package a.b.k;

import a.b.o.a;
import a.b.o.i.g;
import a.b.o.i.m;
import a.b.p.b1;
import a.b.p.c0;
import a.b.p.c1;
import a.b.p.x0;
import android.R;
import android.app.Activity;
import android.app.AppOpsManager;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.os.PowerManager;
import android.os.Process;
import android.os.StrictMode;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Base64;
import android.util.TypedValue;
import android.util.Xml;
import android.view.ActionMode;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ContentFrameLayout;
import c.i.a;
import d.n0.f.d;
import e.s;
import e.t;
import e.w;
import e.x;
import e.z;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.Thread;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.IDN;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.logging.Logger;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class h extends a.b.k.g implements g.a, LayoutInflater.Factory2 {
    public static final boolean b0 = false;
    public static boolean f0;
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;
    public boolean F;
    public k[] G;
    public k H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public boolean M;
    public int N;
    public int O;
    public boolean P;
    public boolean Q;
    public g R;
    public g S;
    public boolean T;
    public int U;
    public boolean W;
    public Rect X;
    public Rect Y;
    public o Z;

    /* renamed from: d */
    public final Object f12d;

    /* renamed from: e */
    public final Context f13e;
    public Window f;
    public e g;
    public final a.b.k.f h;
    public a.b.k.a i;
    public MenuInflater j;
    public CharSequence k;
    public c0 l;
    public c m;
    public l n;
    public a.b.o.a o;
    public ActionBarContextView p;
    public PopupWindow q;
    public Runnable r;
    public boolean u;
    public ViewGroup v;
    public TextView w;
    public View x;
    public boolean y;
    public boolean z;
    public static final a.e.h<String, Integer> a0 = new a.e.h<>();
    public static final int[] c0 = {R.attr.windowBackground};
    public static final boolean d0 = !"robolectric".equals(Build.FINGERPRINT);
    public static final boolean e0 = true;
    public a.g.j.o s = null;
    public boolean t = true;
    public final Runnable V = new b();

    public class a implements Thread.UncaughtExceptionHandler {

        /* renamed from: a */
        public final /* synthetic */ Thread.UncaughtExceptionHandler f14a;

        public a(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
            this.f14a = uncaughtExceptionHandler;
        }

        @Override // java.lang.Thread.UncaughtExceptionHandler
        public void uncaughtException(Thread thread, Throwable th) {
            String message;
            boolean z = false;
            if ((th instanceof Resources.NotFoundException) && (message = th.getMessage()) != null && (message.contains("drawable") || message.contains("Drawable"))) {
                z = true;
            }
            if (!z) {
                this.f14a.uncaughtException(thread, th);
                return;
            }
            Resources.NotFoundException notFoundException = new Resources.NotFoundException(th.getMessage() + ". If the resource you are trying to use is a vector resource, you may be referencing it in an unsupported way. See AppCompatDelegate.setCompatVectorFromResourcesEnabled() for more info.");
            notFoundException.initCause(th.getCause());
            notFoundException.setStackTrace(th.getStackTrace());
            this.f14a.uncaughtException(thread, notFoundException);
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            h hVar = h.this;
            if ((hVar.U & 1) != 0) {
                hVar.x(0);
            }
            h hVar2 = h.this;
            if ((hVar2.U & 4096) != 0) {
                hVar2.x(108);
            }
            h hVar3 = h.this;
            hVar3.T = false;
            hVar3.U = 0;
        }
    }

    public final class c implements m.a {
        public c() {
        }

        @Override // a.b.o.i.m.a
        public void b(a.b.o.i.g gVar, boolean z) {
            h.this.t(gVar);
        }

        @Override // a.b.o.i.m.a
        public boolean c(a.b.o.i.g gVar) {
            Window.Callback callbackE = h.this.E();
            if (callbackE == null) {
                return true;
            }
            callbackE.onMenuOpened(108, gVar);
            return true;
        }
    }

    public class d implements a.InterfaceC0002a {

        /* renamed from: a */
        public a.InterfaceC0002a f17a;

        public class a extends a.g.j.q {
            public a() {
            }

            @Override // a.g.j.p
            public void a(View view) {
                h.this.p.setVisibility(8);
                h hVar = h.this;
                PopupWindow popupWindow = hVar.q;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (hVar.p.getParent() instanceof View) {
                    a.g.j.k.s((View) h.this.p.getParent());
                }
                h.this.p.removeAllViews();
                h.this.s.d(null);
                h hVar2 = h.this;
                hVar2.s = null;
                a.g.j.k.s(hVar2.v);
            }
        }

        public d(a.InterfaceC0002a interfaceC0002a) {
            this.f17a = interfaceC0002a;
        }

        @Override // a.b.o.a.InterfaceC0002a
        public boolean a(a.b.o.a aVar, Menu menu) {
            a.g.j.k.s(h.this.v);
            return this.f17a.a(aVar, menu);
        }

        @Override // a.b.o.a.InterfaceC0002a
        public void b(a.b.o.a aVar) {
            this.f17a.b(aVar);
            h hVar = h.this;
            if (hVar.q != null) {
                hVar.f.getDecorView().removeCallbacks(h.this.r);
            }
            h hVar2 = h.this;
            if (hVar2.p != null) {
                hVar2.y();
                h hVar3 = h.this;
                a.g.j.o oVarA = a.g.j.k.a(hVar3.p);
                oVarA.a(0.0f);
                hVar3.s = oVarA;
                a.g.j.o oVar = h.this.s;
                a aVar2 = new a();
                View view = oVar.f706a.get();
                if (view != null) {
                    oVar.e(view, aVar2);
                }
            }
            h hVar4 = h.this;
            a.b.k.f fVar = hVar4.h;
            if (fVar != null) {
                fVar.f(hVar4.o);
            }
            h hVar5 = h.this;
            hVar5.o = null;
            a.g.j.k.s(hVar5.v);
        }

        @Override // a.b.o.a.InterfaceC0002a
        public boolean c(a.b.o.a aVar, MenuItem menuItem) {
            return this.f17a.c(aVar, menuItem);
        }

        @Override // a.b.o.a.InterfaceC0002a
        public boolean d(a.b.o.a aVar, Menu menu) {
            return this.f17a.d(aVar, menu);
        }
    }

    public class e extends a.b.o.h {
        public e(Window.Callback callback) {
            super(callback);
        }

        /* JADX WARN: Removed duplicated region for block: B:108:0x004e  */
        /* JADX WARN: Removed duplicated region for block: B:109:0x0052  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final android.view.ActionMode a(android.view.ActionMode.Callback r10) {
            /*
                Method dump skipped, instructions count: 441
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: a.b.k.h.e.a(android.view.ActionMode$Callback):android.view.ActionMode");
        }

        @Override // android.view.Window.Callback
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return h.this.w(keyEvent) || this.f112b.dispatchKeyEvent(keyEvent);
        }

        /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
        @Override // android.view.Window.Callback
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean dispatchKeyShortcutEvent(android.view.KeyEvent r6) {
            /*
                r5 = this;
                android.view.Window$Callback r0 = r5.f112b
                boolean r0 = r0.dispatchKeyShortcutEvent(r6)
                r1 = 0
                r2 = 1
                if (r0 != 0) goto L4f
                a.b.k.h r0 = a.b.k.h.this
                int r3 = r6.getKeyCode()
                r0.F()
                a.b.k.a r4 = r0.i
                if (r4 == 0) goto L1f
                boolean r3 = r4.f(r3, r6)
                if (r3 == 0) goto L1f
            L1d:
                r6 = r2
                goto L4d
            L1f:
                a.b.k.h$k r3 = r0.H
                if (r3 == 0) goto L34
                int r4 = r6.getKeyCode()
                boolean r3 = r0.J(r3, r4, r6, r2)
                if (r3 == 0) goto L34
                a.b.k.h$k r6 = r0.H
                if (r6 == 0) goto L1d
                r6.l = r2
                goto L1d
            L34:
                a.b.k.h$k r3 = r0.H
                if (r3 != 0) goto L4c
                a.b.k.h$k r3 = r0.D(r1)
                r0.K(r3, r6)
                int r4 = r6.getKeyCode()
                boolean r6 = r0.J(r3, r4, r6, r2)
                r3.k = r1
                if (r6 == 0) goto L4c
                goto L1d
            L4c:
                r6 = r1
            L4d:
                if (r6 == 0) goto L50
            L4f:
                r1 = r2
            L50:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: a.b.k.h.e.dispatchKeyShortcutEvent(android.view.KeyEvent):boolean");
        }

        @Override // android.view.Window.Callback
        public void onContentChanged() {
        }

        @Override // android.view.Window.Callback
        public boolean onCreatePanelMenu(int i, Menu menu) {
            if (i != 0 || (menu instanceof a.b.o.i.g)) {
                return this.f112b.onCreatePanelMenu(i, menu);
            }
            return false;
        }

        @Override // android.view.Window.Callback
        public boolean onMenuOpened(int i, Menu menu) {
            this.f112b.onMenuOpened(i, menu);
            h hVar = h.this;
            if (hVar == null) {
                throw null;
            }
            if (i == 108) {
                hVar.F();
                a.b.k.a aVar = hVar.i;
                if (aVar != null) {
                    aVar.b(true);
                }
            }
            return true;
        }

        @Override // android.view.Window.Callback
        public void onPanelClosed(int i, Menu menu) {
            this.f112b.onPanelClosed(i, menu);
            h hVar = h.this;
            if (hVar == null) {
                throw null;
            }
            if (i == 108) {
                hVar.F();
                a.b.k.a aVar = hVar.i;
                if (aVar != null) {
                    aVar.b(false);
                    return;
                }
                return;
            }
            if (i == 0) {
                k kVarD = hVar.D(i);
                if (kVarD.m) {
                    hVar.u(kVarD, false);
                }
            }
        }

        @Override // android.view.Window.Callback
        public boolean onPreparePanel(int i, View view, Menu menu) {
            a.b.o.i.g gVar = menu instanceof a.b.o.i.g ? (a.b.o.i.g) menu : null;
            if (i == 0 && gVar == null) {
                return false;
            }
            if (gVar != null) {
                gVar.y = true;
            }
            boolean zOnPreparePanel = this.f112b.onPreparePanel(i, view, menu);
            if (gVar != null) {
                gVar.y = false;
            }
            return zOnPreparePanel;
        }

        @Override // android.view.Window.Callback
        public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i) {
            a.b.o.i.g gVar = h.this.D(0).h;
            if (gVar != null) {
                this.f112b.onProvideKeyboardShortcuts(list, gVar, i);
            } else {
                this.f112b.onProvideKeyboardShortcuts(list, menu, i);
            }
        }

        @Override // android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            return null;
        }

        @Override // android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
            return (h.this.t && i == 0) ? a(callback) : this.f112b.onWindowStartingActionMode(callback, i);
        }
    }

    public class f extends g {

        /* renamed from: c */
        public final PowerManager f21c;

        public f(Context context) {
            super();
            this.f21c = (PowerManager) context.getApplicationContext().getSystemService("power");
        }

        @Override // a.b.k.h.g
        public IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            return intentFilter;
        }

        @Override // a.b.k.h.g
        public int c() {
            return this.f21c.isPowerSaveMode() ? 2 : 1;
        }

        @Override // a.b.k.h.g
        public void d() {
            h.this.p();
        }
    }

    public abstract class g {

        /* renamed from: a */
        public BroadcastReceiver f23a;

        public class a extends BroadcastReceiver {
            public a() {
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                g.this.d();
            }
        }

        public g() {
        }

        public void a() {
            BroadcastReceiver broadcastReceiver = this.f23a;
            if (broadcastReceiver != null) {
                try {
                    h.this.f13e.unregisterReceiver(broadcastReceiver);
                } catch (IllegalArgumentException unused) {
                }
                this.f23a = null;
            }
        }

        public abstract IntentFilter b();

        public abstract int c();

        public abstract void d();

        public void e() {
            a();
            IntentFilter intentFilterB = b();
            if (intentFilterB == null || intentFilterB.countActions() == 0) {
                return;
            }
            if (this.f23a == null) {
                this.f23a = new a();
            }
            h.this.f13e.registerReceiver(this.f23a, intentFilterB);
        }
    }

    /* renamed from: a.b.k.h$h */
    public class C0001h extends g {

        /* renamed from: c */
        public final q f26c;

        public C0001h(q qVar) {
            super();
            this.f26c = qVar;
        }

        @Override // a.b.k.h.g
        public IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_TICK");
            return intentFilter;
        }

        /* JADX WARN: Removed duplicated region for block: B:85:0x0036  */
        @Override // a.b.k.h.g
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public int c() {
            /*
                Method dump skipped, instructions count: 251
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: a.b.k.h.C0001h.c():int");
        }

        @Override // a.b.k.h.g
        public void d() {
            h.this.p();
        }
    }

    public static class i {
        public static File A(Context context) throws IOException {
            File cacheDir = context.getCacheDir();
            if (cacheDir == null) {
                return null;
            }
            StringBuilder sbE = b.a.a.a.a.e(".font");
            sbE.append(Process.myPid());
            sbE.append("-");
            sbE.append(Process.myTid());
            sbE.append("-");
            String string = sbE.toString();
            for (int i = 0; i < 100; i++) {
                File file = new File(cacheDir, b.a.a.a.a.a(string, i));
                if (file.createNewFile()) {
                    return file;
                }
            }
            return null;
        }

        /* JADX WARN: Removed duplicated region for block: B:39:0x002b  */
        /* JADX WARN: Removed duplicated region for block: B:55:0x0069  */
        /* JADX WARN: Removed duplicated region for block: B:57:0x006f  */
        /* JADX WARN: Removed duplicated region for block: B:59:0x0075  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static a.g.h.a.C0014a B(android.widget.TextView r7) {
            /*
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 28
                if (r0 < r1) goto L10
                a.g.h.a$a r0 = new a.g.h.a$a
                android.text.PrecomputedText$Params r7 = r7.getTextMetricsParams()
                r0.<init>(r7)
                return r0
            L10:
                android.text.TextPaint r0 = new android.text.TextPaint
                android.text.TextPaint r2 = r7.getPaint()
                r0.<init>(r2)
                android.text.TextDirectionHeuristic r2 = android.text.TextDirectionHeuristics.FIRSTSTRONG_LTR
                int r2 = r7.getBreakStrategy()
                int r3 = r7.getHyphenationFrequency()
                android.text.method.TransformationMethod r4 = r7.getTransformationMethod()
                boolean r4 = r4 instanceof android.text.method.PasswordTransformationMethod
                if (r4 == 0) goto L2e
            L2b:
                android.text.TextDirectionHeuristic r7 = android.text.TextDirectionHeuristics.LTR
                goto L77
            L2e:
                int r4 = android.os.Build.VERSION.SDK_INT
                r5 = 0
                r6 = 1
                if (r4 < r1) goto L59
                int r1 = r7.getInputType()
                r1 = r1 & 15
                r4 = 3
                if (r1 != r4) goto L59
                java.util.Locale r7 = r7.getTextLocale()
                android.icu.text.DecimalFormatSymbols r7 = android.icu.text.DecimalFormatSymbols.getInstance(r7)
                java.lang.String[] r7 = r7.getDigitStrings()
                r7 = r7[r5]
                int r7 = r7.codePointAt(r5)
                byte r7 = java.lang.Character.getDirectionality(r7)
                if (r7 == r6) goto L6f
                r1 = 2
                if (r7 != r1) goto L2b
                goto L6f
            L59:
                int r1 = r7.getLayoutDirection()
                if (r1 != r6) goto L60
                r5 = r6
            L60:
                int r7 = r7.getTextDirection()
                switch(r7) {
                    case 2: goto L72;
                    case 3: goto L2b;
                    case 4: goto L6f;
                    case 5: goto L6c;
                    case 6: goto L75;
                    case 7: goto L69;
                    default: goto L67;
                }
            L67:
                if (r5 == 0) goto L75
            L69:
                android.text.TextDirectionHeuristic r7 = android.text.TextDirectionHeuristics.FIRSTSTRONG_RTL
                goto L77
            L6c:
                android.text.TextDirectionHeuristic r7 = android.text.TextDirectionHeuristics.LOCALE
                goto L77
            L6f:
                android.text.TextDirectionHeuristic r7 = android.text.TextDirectionHeuristics.RTL
                goto L77
            L72:
                android.text.TextDirectionHeuristic r7 = android.text.TextDirectionHeuristics.ANYRTL_LTR
                goto L77
            L75:
                android.text.TextDirectionHeuristic r7 = android.text.TextDirectionHeuristics.FIRSTSTRONG_LTR
            L77:
                a.g.h.a$a r1 = new a.g.h.a$a
                r1.<init>(r0, r7, r2, r3)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: a.b.k.h.i.B(android.widget.TextView):a.g.h.a$a");
        }

        public static final boolean C(char c2) {
            return Character.isWhitespace(c2) || Character.isSpaceChar(c2);
        }

        public static String D(c.l.c cVar, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, c.j.a.b bVar, int i2) throws IOException {
            if ((i2 & 1) != 0) {
                charSequence = ", ";
            }
            CharSequence charSequence5 = (i2 & 2) != 0 ? "" : null;
            String str = (i2 & 4) == 0 ? null : "";
            if ((i2 & 8) != 0) {
                i = -1;
            }
            String str2 = (i2 & 16) != 0 ? "..." : null;
            int i3 = i2 & 32;
            c.j.b.d.d(cVar, "$this$joinToString");
            c.j.b.d.d(charSequence, "separator");
            c.j.b.d.d(charSequence5, "prefix");
            c.j.b.d.d(str, "postfix");
            c.j.b.d.d(str2, "truncated");
            StringBuilder sb = new StringBuilder();
            c.j.b.d.d(cVar, "$this$joinTo");
            c.j.b.d.d(sb, "buffer");
            c.j.b.d.d(charSequence, "separator");
            c.j.b.d.d(charSequence5, "prefix");
            c.j.b.d.d(str, "postfix");
            c.j.b.d.d(str2, "truncated");
            sb.append(charSequence5);
            int i4 = 0;
            for (Object obj : cVar) {
                i4++;
                if (i4 > 1) {
                    sb.append(charSequence);
                }
                if (i >= 0 && i4 > i) {
                    break;
                }
                d(sb, obj, null);
            }
            if (i >= 0 && i4 > i) {
                sb.append((CharSequence) str2);
            }
            sb.append((CharSequence) str);
            String string = sb.toString();
            c.j.b.d.c(string, "joinTo(StringBuilder(), …ed, transform).toString()");
            return string;
        }

        public static final <T> List<T> E(T t) {
            List<T> listSingletonList = Collections.singletonList(t);
            c.j.b.d.c(listSingletonList, "java.util.Collections.singletonList(element)");
            return listSingletonList;
        }

        public static final <T> List<T> F(T... tArr) {
            c.j.b.d.d(tArr, "elements");
            c.j.b.d.d(tArr, "$this$filterNotNull");
            ArrayList arrayList = new ArrayList();
            c.j.b.d.d(tArr, "$this$filterNotNullTo");
            c.j.b.d.d(arrayList, "destination");
            for (T t : tArr) {
                if (t != null) {
                    arrayList.add(t);
                }
            }
            return arrayList;
        }

        public static ByteBuffer G(Context context, CancellationSignal cancellationSignal, Uri uri) throws IOException {
            try {
                ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r", cancellationSignal);
                if (parcelFileDescriptorOpenFileDescriptor == null) {
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        parcelFileDescriptorOpenFileDescriptor.close();
                    }
                    return null;
                }
                try {
                    FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                    try {
                        FileChannel channel = fileInputStream.getChannel();
                        MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                        fileInputStream.close();
                        parcelFileDescriptorOpenFileDescriptor.close();
                        return map;
                    } finally {
                    }
                } finally {
                }
            } catch (IOException unused) {
                return null;
            }
        }

        public static final int H(int i, int i2) {
            int i3 = i % i2;
            return i3 >= 0 ? i3 : i3 + i2;
        }

        public static InputConnection I(InputConnection inputConnection, EditorInfo editorInfo, View view) {
            if (inputConnection != null && editorInfo.hintText == null) {
                ViewParent parent = view.getParent();
                while (true) {
                    if (!(parent instanceof View)) {
                        break;
                    }
                    if (parent instanceof c1) {
                        editorInfo.hintText = ((c1) parent).a();
                        break;
                    }
                    parent = parent.getParent();
                }
            }
            return inputConnection;
        }

        public static boolean J(ViewParent viewParent, View view, float f, float f2, boolean z) {
            try {
                return viewParent.onNestedFling(view, f, f2, z);
            } catch (AbstractMethodError unused) {
                String str = "ViewParent " + viewParent + " does not implement interface method onNestedFling";
                return false;
            }
        }

        public static boolean K(ViewParent viewParent, View view, float f, float f2) {
            try {
                return viewParent.onNestedPreFling(view, f, f2);
            } catch (AbstractMethodError unused) {
                String str = "ViewParent " + viewParent + " does not implement interface method onNestedPreFling";
                return false;
            }
        }

        public static void L(ViewParent viewParent, View view, int i, int i2, int[] iArr, int i3) {
            if (viewParent instanceof a.g.j.f) {
                ((a.g.j.f) viewParent).n(view, i, i2, iArr, i3);
                return;
            }
            if (i3 == 0) {
                try {
                    viewParent.onNestedPreScroll(view, i, i2, iArr);
                } catch (AbstractMethodError unused) {
                    String str = "ViewParent " + viewParent + " does not implement interface method onNestedPreScroll";
                }
            }
        }

        public static void M(ViewParent viewParent, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
            if (viewParent instanceof a.g.j.g) {
                ((a.g.j.g) viewParent).k(view, i, i2, i3, i4, i5, iArr);
                return;
            }
            iArr[0] = iArr[0] + i3;
            iArr[1] = iArr[1] + i4;
            if (viewParent instanceof a.g.j.f) {
                ((a.g.j.f) viewParent).l(view, i, i2, i3, i4, i5);
                return;
            }
            if (i5 == 0) {
                try {
                    viewParent.onNestedScroll(view, i, i2, i3, i4);
                } catch (AbstractMethodError unused) {
                    String str = "ViewParent " + viewParent + " does not implement interface method onNestedScroll";
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static final <T> List<T> N(List<? extends T> list) {
            c.j.b.d.d(list, "$this$optimizeReadOnlyList");
            int size = list.size();
            return size != 0 ? size != 1 ? list : E(list.get(0)) : c.g.h.f1272b;
        }

        public static a.g.d.b.a O(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, Resources.NotFoundException, IOException {
            int next;
            do {
                next = xmlPullParser.next();
                if (next == 2) {
                    break;
                }
            } while (next != 1);
            if (next != 2) {
                throw new XmlPullParserException("No start tag found");
            }
            xmlPullParser.require(2, null, "font-family");
            if (!xmlPullParser.getName().equals("font-family")) {
                W(xmlPullParser);
                return null;
            }
            TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), a.g.b.FontFamily);
            String string = typedArrayObtainAttributes.getString(a.g.b.FontFamily_fontProviderAuthority);
            String string2 = typedArrayObtainAttributes.getString(a.g.b.FontFamily_fontProviderPackage);
            String string3 = typedArrayObtainAttributes.getString(a.g.b.FontFamily_fontProviderQuery);
            int resourceId = typedArrayObtainAttributes.getResourceId(a.g.b.FontFamily_fontProviderCerts, 0);
            int integer = typedArrayObtainAttributes.getInteger(a.g.b.FontFamily_fontProviderFetchStrategy, 1);
            int integer2 = typedArrayObtainAttributes.getInteger(a.g.b.FontFamily_fontProviderFetchTimeout, 500);
            typedArrayObtainAttributes.recycle();
            if (string != null && string2 != null && string3 != null) {
                while (xmlPullParser.next() != 3) {
                    W(xmlPullParser);
                }
                return new a.g.d.b.d(new a.g.g.a(string, string2, string3, P(resources, resourceId)), integer, integer2);
            }
            ArrayList arrayList = new ArrayList();
            while (xmlPullParser.next() != 3) {
                if (xmlPullParser.getEventType() == 2) {
                    if (xmlPullParser.getName().equals("font")) {
                        TypedArray typedArrayObtainAttributes2 = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), a.g.b.FontFamilyFont);
                        int i = typedArrayObtainAttributes2.getInt(typedArrayObtainAttributes2.hasValue(a.g.b.FontFamilyFont_fontWeight) ? a.g.b.FontFamilyFont_fontWeight : a.g.b.FontFamilyFont_android_fontWeight, 400);
                        boolean z = 1 == typedArrayObtainAttributes2.getInt(typedArrayObtainAttributes2.hasValue(a.g.b.FontFamilyFont_fontStyle) ? a.g.b.FontFamilyFont_fontStyle : a.g.b.FontFamilyFont_android_fontStyle, 0);
                        int i2 = typedArrayObtainAttributes2.hasValue(a.g.b.FontFamilyFont_ttcIndex) ? a.g.b.FontFamilyFont_ttcIndex : a.g.b.FontFamilyFont_android_ttcIndex;
                        String string4 = typedArrayObtainAttributes2.getString(typedArrayObtainAttributes2.hasValue(a.g.b.FontFamilyFont_fontVariationSettings) ? a.g.b.FontFamilyFont_fontVariationSettings : a.g.b.FontFamilyFont_android_fontVariationSettings);
                        int i3 = typedArrayObtainAttributes2.getInt(i2, 0);
                        int i4 = typedArrayObtainAttributes2.hasValue(a.g.b.FontFamilyFont_font) ? a.g.b.FontFamilyFont_font : a.g.b.FontFamilyFont_android_font;
                        int resourceId2 = typedArrayObtainAttributes2.getResourceId(i4, 0);
                        String string5 = typedArrayObtainAttributes2.getString(i4);
                        typedArrayObtainAttributes2.recycle();
                        while (xmlPullParser.next() != 3) {
                            W(xmlPullParser);
                        }
                        arrayList.add(new a.g.d.b.c(string5, i, z, string4, i3, resourceId2));
                    } else {
                        W(xmlPullParser);
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            return new a.g.d.b.b((a.g.d.b.c[]) arrayList.toArray(new a.g.d.b.c[arrayList.size()]));
        }

        public static List<List<byte[]>> P(Resources resources, int i) throws Resources.NotFoundException {
            if (i == 0) {
                return Collections.emptyList();
            }
            TypedArray typedArrayObtainTypedArray = resources.obtainTypedArray(i);
            try {
                if (typedArrayObtainTypedArray.length() == 0) {
                    return Collections.emptyList();
                }
                ArrayList arrayList = new ArrayList();
                if (typedArrayObtainTypedArray.getType(0) == 1) {
                    for (int i2 = 0; i2 < typedArrayObtainTypedArray.length(); i2++) {
                        int resourceId = typedArrayObtainTypedArray.getResourceId(i2, 0);
                        if (resourceId != 0) {
                            arrayList.add(Y(resources.getStringArray(resourceId)));
                        }
                    }
                } else {
                    arrayList.add(Y(resources.getStringArray(i)));
                }
                return arrayList;
            } finally {
                typedArrayObtainTypedArray.recycle();
            }
        }

        public static final int Q(w wVar, int i) {
            int i2;
            c.j.b.d.d(wVar, "$this$segment");
            int[] iArr = wVar.h;
            int i3 = i + 1;
            int length = wVar.g.length;
            c.j.b.d.d(iArr, "$this$binarySearch");
            int i4 = length - 1;
            int i5 = 0;
            while (true) {
                if (i5 <= i4) {
                    i2 = (i5 + i4) >>> 1;
                    int i6 = iArr[i2];
                    if (i6 >= i3) {
                        if (i6 <= i3) {
                            break;
                        }
                        i4 = i2 - 1;
                    } else {
                        i5 = i2 + 1;
                    }
                } else {
                    i2 = (-i5) - 1;
                    break;
                }
            }
            return i2 >= 0 ? i2 : ~i2;
        }

        public static void R(TextView textView, int i) {
            k(i);
            if (Build.VERSION.SDK_INT >= 28) {
                textView.setFirstBaselineToTopHeight(i);
                return;
            }
            Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
            int i2 = textView.getIncludeFontPadding() ? fontMetricsInt.top : fontMetricsInt.ascent;
            if (i > Math.abs(i2)) {
                textView.setPadding(textView.getPaddingLeft(), i + i2, textView.getPaddingRight(), textView.getPaddingBottom());
            }
        }

        public static void S(TextView textView, int i) {
            k(i);
            Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
            int i2 = textView.getIncludeFontPadding() ? fontMetricsInt.bottom : fontMetricsInt.descent;
            if (i > Math.abs(i2)) {
                textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i - i2);
            }
        }

        public static void T(TextView textView, int i) {
            k(i);
            if (i != textView.getPaint().getFontMetricsInt(null)) {
                textView.setLineSpacing(i - r0, 1.0f);
            }
        }

        public static void U(TextView textView, a.g.h.a aVar) {
            if (Build.VERSION.SDK_INT >= 29) {
                if (aVar == null) {
                    throw null;
                }
                textView.setText((CharSequence) null);
            } else {
                B(textView);
                if (aVar == null) {
                    throw null;
                }
                throw null;
            }
        }

        public static final char V(char[] cArr) {
            c.j.b.d.d(cArr, "$this$single");
            int length = cArr.length;
            if (length == 0) {
                throw new NoSuchElementException("Array is empty.");
            }
            if (length == 1) {
                return cArr[0];
            }
            throw new IllegalArgumentException("Array has more than one element.");
        }

        public static void W(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
            int i = 1;
            while (i > 0) {
                int next = xmlPullParser.next();
                if (next == 2) {
                    i++;
                } else if (next == 3) {
                    i--;
                }
            }
        }

        public static final void X() {
            throw new ArithmeticException("Index overflow has happened.");
        }

        public static List<byte[]> Y(String[] strArr) {
            ArrayList arrayList = new ArrayList();
            for (String str : strArr) {
                arrayList.add(Base64.decode(str, 0));
            }
            return arrayList;
        }

        public static final String Z(String str) throws UnknownHostException {
            c.j.b.d.d(str, "$this$toCanonicalHost");
            int i = 0;
            int i2 = -1;
            if (!c.m.e.b(str, ":", false, 2)) {
                try {
                    String ascii = IDN.toASCII(str);
                    c.j.b.d.c(ascii, "IDN.toASCII(host)");
                    Locale locale = Locale.US;
                    c.j.b.d.c(locale, "Locale.US");
                    String lowerCase = ascii.toLowerCase(locale);
                    c.j.b.d.c(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                    if (lowerCase.length() == 0) {
                        return null;
                    }
                    int length = lowerCase.length();
                    for (int i3 = 0; i3 < length; i3++) {
                        char cCharAt = lowerCase.charAt(i3);
                        if (c.j.b.d.e(cCharAt, 31) > 0 && c.j.b.d.e(cCharAt, 127) < 0 && c.m.e.j(" #%/:?@[\\]", cCharAt, 0, false, 6) == -1) {
                        }
                        i = 1;
                        break;
                    }
                    if (i != 0) {
                        return null;
                    }
                    return lowerCase;
                } catch (IllegalArgumentException unused) {
                    return null;
                }
            }
            InetAddress inetAddressU = (c.m.e.z(str, "[", false, 2) && c.m.e.d(str, "]", false, 2)) ? u(str, 1, str.length() - 1) : u(str, 0, str.length());
            if (inetAddressU == null) {
                return null;
            }
            byte[] address = inetAddressU.getAddress();
            if (address.length != 16) {
                if (address.length == 4) {
                    return inetAddressU.getHostAddress();
                }
                throw new AssertionError("Invalid IPv6 address: '" + str + '\'');
            }
            c.j.b.d.c(address, "address");
            int i4 = 0;
            int i5 = 0;
            while (i4 < address.length) {
                int i6 = i4;
                while (i6 < 16 && address[i6] == 0 && address[i6 + 1] == 0) {
                    i6 += 2;
                }
                int i7 = i6 - i4;
                if (i7 > i5 && i7 >= 4) {
                    i2 = i4;
                    i5 = i7;
                }
                i4 = i6 + 2;
            }
            e.e eVar = new e.e();
            while (i < address.length) {
                if (i == i2) {
                    eVar.P(58);
                    i += i5;
                    if (i == 16) {
                        eVar.P(58);
                    }
                } else {
                    if (i > 0) {
                        eVar.P(58);
                    }
                    eVar.j((d.n0.c.a(address[i], 255) << 8) | (255 & address[i + 1]));
                    i += 2;
                }
            }
            return eVar.H();
        }

        public static final void a(d.n0.f.a aVar, d.n0.f.c cVar, String str) {
            d.b bVar = d.n0.f.d.j;
            Logger logger = d.n0.f.d.i;
            StringBuilder sb = new StringBuilder();
            sb.append(cVar.f);
            sb.append(' ');
            String str2 = String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1));
            c.j.b.d.c(str2, "java.lang.String.format(format, *args)");
            sb.append(str2);
            sb.append(": ");
            sb.append(aVar.f1424c);
            logger.fine(sb.toString());
        }

        public static ActionMode.Callback a0(TextView textView, ActionMode.Callback callback) {
            return (Build.VERSION.SDK_INT > 27 || (callback instanceof a.g.k.d)) ? callback : new a.g.k.d(callback, textView);
        }

        public static final <T> boolean b(Collection<? super T> collection, Iterable<? extends T> iterable) {
            c.j.b.d.d(collection, "$this$addAll");
            c.j.b.d.d(iterable, "elements");
            if (iterable instanceof Collection) {
                return collection.addAll((Collection) iterable);
            }
            boolean z = false;
            Iterator<? extends T> it = iterable.iterator();
            while (it.hasNext()) {
                if (collection.add(it.next())) {
                    z = true;
                }
            }
            return z;
        }

        public static final void c(Throwable th, Throwable th2) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            c.j.b.d.d(th, "$this$addSuppressed");
            c.j.b.d.d(th2, "exception");
            if (th != th2) {
                if (c.i.b.f1278a == null) {
                    throw null;
                }
                c.j.b.d.d(th, "cause");
                c.j.b.d.d(th2, "exception");
                Method method = a.C0031a.f1277a;
                if (method != null) {
                    method.invoke(th, th2);
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v0, types: [T, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r2v5 */
        /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object] */
        public static final <T> void d(Appendable appendable, T t, c.j.a.b<? super T, ? extends CharSequence> bVar) throws IOException {
            CharSequence charSequenceValueOf;
            c.j.b.d.d(appendable, "$this$appendElement");
            if (bVar == null) {
                if (!(t != 0 ? t instanceof CharSequence : true)) {
                    if (t instanceof Character) {
                        appendable.append(((Character) t).charValue());
                        return;
                    }
                    charSequenceValueOf = String.valueOf((Object) t);
                }
                appendable.append(charSequenceValueOf);
            }
            t = (T) bVar.b(t);
            charSequenceValueOf = (CharSequence) t;
            appendable.append(charSequenceValueOf);
        }

        /* JADX WARN: Removed duplicated region for block: B:492:0x00e9  */
        /* JADX WARN: Removed duplicated region for block: B:494:0x00ec  */
        /* JADX WARN: Removed duplicated region for block: B:504:0x010c  */
        /* JADX WARN: Removed duplicated region for block: B:507:0x0112  */
        /* JADX WARN: Removed duplicated region for block: B:518:0x0140  */
        /* JADX WARN: Removed duplicated region for block: B:619:0x02bf  */
        /* JADX WARN: Removed duplicated region for block: B:639:0x0311  */
        /* JADX WARN: Removed duplicated region for block: B:644:0x0328  */
        /* JADX WARN: Removed duplicated region for block: B:646:0x033d  */
        /* JADX WARN: Removed duplicated region for block: B:669:0x03a9  */
        /* JADX WARN: Removed duplicated region for block: B:671:0x03c8  */
        /* JADX WARN: Removed duplicated region for block: B:733:0x0516  */
        /* JADX WARN: Removed duplicated region for block: B:749:0x055c  */
        /* JADX WARN: Removed duplicated region for block: B:750:0x0569  */
        /* JADX WARN: Removed duplicated region for block: B:757:0x0582  */
        /* JADX WARN: Removed duplicated region for block: B:760:0x058c  */
        /* JADX WARN: Removed duplicated region for block: B:813:0x0656  */
        /* JADX WARN: Removed duplicated region for block: B:814:0x065e  */
        /* JADX WARN: Removed duplicated region for block: B:817:0x066b  */
        /* JADX WARN: Removed duplicated region for block: B:818:0x066e  */
        /* JADX WARN: Removed duplicated region for block: B:824:0x068f  */
        /* JADX WARN: Removed duplicated region for block: B:847:0x0718  */
        /* JADX WARN: Removed duplicated region for block: B:848:0x071b  */
        /* JADX WARN: Removed duplicated region for block: B:851:0x0721  */
        /* JADX WARN: Removed duplicated region for block: B:852:0x0724  */
        /* JADX WARN: Removed duplicated region for block: B:854:0x0728  */
        /* JADX WARN: Removed duplicated region for block: B:858:0x0737  */
        /* JADX WARN: Removed duplicated region for block: B:860:0x073a  */
        /* JADX WARN: Removed duplicated region for block: B:862:0x0747 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:871:0x0761 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static void e(a.f.b.i.e r37, a.f.b.d r38, int r39) {
            /*
                Method dump skipped, instructions count: 1904
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: a.b.k.h.i.e(a.f.b.i.e, a.f.b.d, int):void");
        }

        public static final boolean f(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
            c.j.b.d.d(bArr, "a");
            c.j.b.d.d(bArr2, "b");
            for (int i4 = 0; i4 < i3; i4++) {
                if (bArr[i4 + i] != bArr2[i4 + i2]) {
                    return false;
                }
            }
            return true;
        }

        public static final e.f g(x xVar) {
            c.j.b.d.d(xVar, "$this$buffer");
            return new s(xVar);
        }

        public static final e.g h(z zVar) {
            c.j.b.d.d(zVar, "$this$buffer");
            return new t(zVar);
        }

        public static void i(Object obj, StringBuilder sb) {
            String hexString;
            int iLastIndexOf;
            if (obj == null) {
                hexString = "null";
            } else {
                String simpleName = obj.getClass().getSimpleName();
                if (simpleName.length() <= 0 && (iLastIndexOf = (simpleName = obj.getClass().getName()).lastIndexOf(46)) > 0) {
                    simpleName = simpleName.substring(iLastIndexOf + 1);
                }
                sb.append(simpleName);
                sb.append('{');
                hexString = Integer.toHexString(System.identityHashCode(obj));
            }
            sb.append(hexString);
        }

        public static void j(boolean z) {
            if (!z) {
                throw new IllegalArgumentException();
            }
        }

        public static int k(int i) {
            if (i >= 0) {
                return i;
            }
            throw new IllegalArgumentException();
        }

        public static <T> T l(T t, Object obj) {
            if (t != null) {
                return t;
            }
            throw new NullPointerException(String.valueOf(obj));
        }

        public static <T> T m(T t) {
            if (t != null) {
                return t;
            }
            throw null;
        }

        public static final void n(long j, long j2, long j3) {
            if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
                throw new ArrayIndexOutOfBoundsException("size=" + j + " offset=" + j2 + " byteCount=" + j3);
            }
        }

        public static final int o(int i) {
            if (2 <= i && 36 >= i) {
                return i;
            }
            throw new IllegalArgumentException("radix " + i + " was not in valid range " + new c.k.c(2, 36));
        }

        public static int p(Context context, String str) {
            int iMyPid = Process.myPid();
            int iMyUid = Process.myUid();
            String packageName = context.getPackageName();
            if (context.checkPermission(str, iMyPid, iMyUid) == -1) {
                return -1;
            }
            String strPermissionToOp = AppOpsManager.permissionToOp(str);
            if (strPermissionToOp != null) {
                if (packageName == null) {
                    String[] packagesForUid = context.getPackageManager().getPackagesForUid(iMyUid);
                    if (packagesForUid == null || packagesForUid.length <= 0) {
                        return -1;
                    }
                    packageName = packagesForUid[0];
                }
                if (((AppOpsManager) context.getSystemService(AppOpsManager.class)).noteProxyOpNoThrow(strPermissionToOp, packageName) != 0) {
                    return -2;
                }
            }
            return 0;
        }

        public static final void q(Closeable closeable, Throwable th) {
            if (closeable == null) {
                return;
            }
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                c(th, th2);
            }
        }

        public static final <T> int r(Iterable<? extends T> iterable, int i) {
            c.j.b.d.d(iterable, "$this$collectionSizeOrDefault");
            return iterable instanceof Collection ? ((Collection) iterable).size() : i;
        }

        public static boolean s(File file, Resources resources, int i) throws Throwable {
            InputStream inputStreamOpenRawResource;
            try {
                inputStreamOpenRawResource = resources.openRawResource(i);
                try {
                    boolean zT = t(file, inputStreamOpenRawResource);
                    if (inputStreamOpenRawResource != null) {
                        try {
                            inputStreamOpenRawResource.close();
                        } catch (IOException unused) {
                        }
                    }
                    return zT;
                } catch (Throwable th) {
                    th = th;
                    if (inputStreamOpenRawResource != null) {
                        try {
                            inputStreamOpenRawResource.close();
                        } catch (IOException unused2) {
                        }
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                inputStreamOpenRawResource = null;
            }
        }

        public static boolean t(File file, InputStream inputStream) throws Throwable {
            StrictMode.ThreadPolicy threadPolicyAllowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
            FileOutputStream fileOutputStream = null;
            try {
                try {
                    FileOutputStream fileOutputStream2 = new FileOutputStream(file, false);
                    try {
                        byte[] bArr = new byte[1024];
                        while (true) {
                            int i = inputStream.read(bArr);
                            if (i == -1) {
                                break;
                            }
                            fileOutputStream2.write(bArr, 0, i);
                        }
                        try {
                            fileOutputStream2.close();
                        } catch (IOException unused) {
                        }
                        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                        return true;
                    } catch (IOException e2) {
                        e = e2;
                        fileOutputStream = fileOutputStream2;
                        e.getMessage();
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException unused2) {
                            }
                        }
                        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                        return false;
                    } catch (Throwable th) {
                        th = th;
                        fileOutputStream = fileOutputStream2;
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException unused3) {
                            }
                        }
                        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (IOException e3) {
                e = e3;
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:150:0x00a1, code lost:
        
            r0 = false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:167:0x00de, code lost:
        
            return null;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:158:0x00b0  */
        /* JADX WARN: Type inference failed for: r15v0 */
        /* JADX WARN: Type inference failed for: r15v1, types: [int] */
        /* JADX WARN: Type inference failed for: r15v5 */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static final java.net.InetAddress u(java.lang.String r17, int r18, int r19) throws java.net.UnknownHostException {
            /*
                Method dump skipped, instructions count: 250
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: a.b.k.h.i.u(java.lang.String, int, int):java.net.InetAddress");
        }

        public static final boolean v(char c2, char c3, boolean z) {
            if (c2 == c3) {
                return true;
            }
            if (z) {
                return Character.toUpperCase(c2) == Character.toUpperCase(c3) || Character.toLowerCase(c2) == Character.toLowerCase(c3);
            }
            return false;
        }

        public static final String w(long j) {
            StringBuilder sb;
            long j2;
            long j3;
            long j4;
            if (j > -999500000) {
                if (j > -999500) {
                    if (j <= 0) {
                        sb = new StringBuilder();
                        j4 = j - 500;
                    } else if (j < 999500) {
                        sb = new StringBuilder();
                        j4 = j + 500;
                    } else if (j < 999500000) {
                        sb = new StringBuilder();
                        j3 = j + 500000;
                    } else {
                        sb = new StringBuilder();
                        j2 = j + 500000000;
                    }
                    sb.append(j4 / 1000);
                    sb.append(" µs");
                    String str = String.format("%6s", Arrays.copyOf(new Object[]{sb.toString()}, 1));
                    c.j.b.d.c(str, "java.lang.String.format(format, *args)");
                    return str;
                }
                sb = new StringBuilder();
                j3 = j - 500000;
                sb.append(j3 / 1000000);
                sb.append(" ms");
                String str2 = String.format("%6s", Arrays.copyOf(new Object[]{sb.toString()}, 1));
                c.j.b.d.c(str2, "java.lang.String.format(format, *args)");
                return str2;
            }
            sb = new StringBuilder();
            j2 = j - 500000000;
            sb.append(j2 / 1000000000);
            sb.append(" s ");
            String str22 = String.format("%6s", Arrays.copyOf(new Object[]{sb.toString()}, 1));
            c.j.b.d.c(str22, "java.lang.String.format(format, *args)");
            return str22;
        }

        public static Intent x(Activity activity) {
            Intent parentActivityIntent = activity.getParentActivityIntent();
            if (parentActivityIntent != null) {
                return parentActivityIntent;
            }
            try {
                String strZ = z(activity, activity.getComponentName());
                if (strZ == null) {
                    return null;
                }
                ComponentName componentName = new ComponentName(activity, strZ);
                try {
                    return z(activity, componentName) == null ? Intent.makeMainActivity(componentName) : new Intent().setComponent(componentName);
                } catch (PackageManager.NameNotFoundException unused) {
                    return null;
                }
            } catch (PackageManager.NameNotFoundException e2) {
                throw new IllegalArgumentException(e2);
            }
        }

        public static Intent y(Context context, ComponentName componentName) {
            String strZ = z(context, componentName);
            if (strZ == null) {
                return null;
            }
            ComponentName componentName2 = new ComponentName(componentName.getPackageName(), strZ);
            return z(context, componentName2) == null ? Intent.makeMainActivity(componentName2) : new Intent().setComponent(componentName2);
        }

        public static String z(Context context, ComponentName componentName) throws PackageManager.NameNotFoundException {
            String string;
            ActivityInfo activityInfo = context.getPackageManager().getActivityInfo(componentName, Build.VERSION.SDK_INT >= 29 ? 269222528 : 787072);
            String str = activityInfo.parentActivityName;
            if (str != null) {
                return str;
            }
            Bundle bundle = activityInfo.metaData;
            if (bundle == null || (string = bundle.getString("android.support.PARENT_ACTIVITY")) == null) {
                return null;
            }
            if (string.charAt(0) != '.') {
                return string;
            }
            return context.getPackageName() + string;
        }
    }

    public class j extends ContentFrameLayout {
        public j(Context context) {
            super(context, null);
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return h.this.w(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0) {
                int x = (int) motionEvent.getX();
                int y = (int) motionEvent.getY();
                if (x < -5 || y < -5 || x > getWidth() + 5 || y > getHeight() + 5) {
                    h hVar = h.this;
                    hVar.u(hVar.D(0), true);
                    return true;
                }
            }
            return super.onInterceptTouchEvent(motionEvent);
        }

        @Override // android.view.View
        public void setBackgroundResource(int i) {
            setBackgroundDrawable(a.b.l.a.a.b(getContext(), i));
        }
    }

    public static final class k {

        /* renamed from: a */
        public int f28a;

        /* renamed from: b */
        public int f29b;

        /* renamed from: c */
        public int f30c;

        /* renamed from: d */
        public int f31d;

        /* renamed from: e */
        public ViewGroup f32e;
        public View f;
        public View g;
        public a.b.o.i.g h;
        public a.b.o.i.e i;
        public Context j;
        public boolean k;
        public boolean l;
        public boolean m;
        public boolean n;
        public boolean o = false;
        public boolean p;
        public Bundle q;

        public k(int i) {
            this.f28a = i;
        }

        public void a(a.b.o.i.g gVar) {
            a.b.o.i.e eVar;
            a.b.o.i.g gVar2 = this.h;
            if (gVar == gVar2) {
                return;
            }
            if (gVar2 != null) {
                gVar2.u(this.i);
            }
            this.h = gVar;
            if (gVar == null || (eVar = this.i) == null) {
                return;
            }
            gVar.b(eVar, gVar.f148a);
        }
    }

    public final class l implements m.a {
        public l() {
        }

        @Override // a.b.o.i.m.a
        public void b(a.b.o.i.g gVar, boolean z) {
            a.b.o.i.g gVarK = gVar.k();
            boolean z2 = gVarK != gVar;
            h hVar = h.this;
            if (z2) {
                gVar = gVarK;
            }
            k kVarB = hVar.B(gVar);
            if (kVarB != null) {
                if (!z2) {
                    h.this.u(kVarB, z);
                } else {
                    h.this.s(kVarB.f28a, kVarB, gVarK);
                    h.this.u(kVarB, true);
                }
            }
        }

        @Override // a.b.o.i.m.a
        public boolean c(a.b.o.i.g gVar) {
            Window.Callback callbackE;
            if (gVar != gVar.k()) {
                return true;
            }
            h hVar = h.this;
            if (!hVar.A || (callbackE = hVar.E()) == null || h.this.M) {
                return true;
            }
            callbackE.onMenuOpened(108, gVar);
            return true;
        }
    }

    static {
        if (!b0 || f0) {
            return;
        }
        Thread.setDefaultUncaughtExceptionHandler(new a(Thread.getDefaultUncaughtExceptionHandler()));
        f0 = true;
    }

    public h(Context context, Window window, a.b.k.f fVar, Object obj) {
        Integer orDefault;
        a.b.k.e eVar;
        this.N = -100;
        this.f13e = context;
        this.h = fVar;
        this.f12d = obj;
        if (this.N == -100 && (obj instanceof Dialog)) {
            while (context != null) {
                if (!(context instanceof a.b.k.e)) {
                    if (!(context instanceof ContextWrapper)) {
                        break;
                    } else {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                } else {
                    eVar = (a.b.k.e) context;
                    break;
                }
            }
            eVar = null;
            if (eVar != null) {
                this.N = ((h) eVar.o()).N;
            }
        }
        if (this.N == -100 && (orDefault = a0.getOrDefault(this.f12d.getClass().getName(), null)) != null) {
            this.N = orDefault.intValue();
            a0.remove(this.f12d.getClass().getName());
        }
        if (window != null) {
            r(window);
        }
        a.b.p.j.d();
    }

    public final void A() {
        if (this.f == null) {
            Object obj = this.f12d;
            if (obj instanceof Activity) {
                r(((Activity) obj).getWindow());
            }
        }
        if (this.f == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    public k B(Menu menu) {
        k[] kVarArr = this.G;
        int length = kVarArr != null ? kVarArr.length : 0;
        for (int i2 = 0; i2 < length; i2++) {
            k kVar = kVarArr[i2];
            if (kVar != null && kVar.h == menu) {
                return kVar;
            }
        }
        return null;
    }

    public final g C(Context context) {
        if (this.R == null) {
            if (q.f56d == null) {
                Context applicationContext = context.getApplicationContext();
                q.f56d = new q(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.R = new C0001h(q.f56d);
        }
        return this.R;
    }

    public k D(int i2) {
        k[] kVarArr = this.G;
        if (kVarArr == null || kVarArr.length <= i2) {
            k[] kVarArr2 = new k[i2 + 1];
            if (kVarArr != null) {
                System.arraycopy(kVarArr, 0, kVarArr2, 0, kVarArr.length);
            }
            this.G = kVarArr2;
            kVarArr = kVarArr2;
        }
        k kVar = kVarArr[i2];
        if (kVar != null) {
            return kVar;
        }
        k kVar2 = new k(i2);
        kVarArr[i2] = kVar2;
        return kVar2;
    }

    public final Window.Callback E() {
        return this.f.getCallback();
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void F() {
        /*
            r3 = this;
            r3.z()
            boolean r0 = r3.A
            if (r0 == 0) goto L37
            a.b.k.a r0 = r3.i
            if (r0 == 0) goto Lc
            goto L37
        Lc:
            java.lang.Object r0 = r3.f12d
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L20
            a.b.k.r r0 = new a.b.k.r
            java.lang.Object r1 = r3.f12d
            android.app.Activity r1 = (android.app.Activity) r1
            boolean r2 = r3.B
            r0.<init>(r1, r2)
        L1d:
            r3.i = r0
            goto L2e
        L20:
            boolean r0 = r0 instanceof android.app.Dialog
            if (r0 == 0) goto L2e
            a.b.k.r r0 = new a.b.k.r
            java.lang.Object r1 = r3.f12d
            android.app.Dialog r1 = (android.app.Dialog) r1
            r0.<init>(r1)
            goto L1d
        L2e:
            a.b.k.a r0 = r3.i
            if (r0 == 0) goto L37
            boolean r1 = r3.W
            r0.g(r1)
        L37:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a.b.k.h.F():void");
    }

    public final void G(int i2) {
        this.U = (1 << i2) | this.U;
        if (this.T) {
            return;
        }
        a.g.j.k.q(this.f.getDecorView(), this.V);
        this.T = true;
    }

    public int H(Context context, int i2) {
        g gVarC;
        if (i2 == -100) {
            return -1;
        }
        if (i2 != -1) {
            if (i2 != 0) {
                if (i2 != 1 && i2 != 2) {
                    if (i2 != 3) {
                        throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                    }
                    if (this.S == null) {
                        this.S = new f(context);
                    }
                    gVarC = this.S;
                }
            } else {
                if (((UiModeManager) context.getApplicationContext().getSystemService(UiModeManager.class)).getNightMode() == 0) {
                    return -1;
                }
                gVarC = C(context);
            }
            return gVarC.c();
        }
        return i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:202:0x0160  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void I(a.b.k.h.k r14, android.view.KeyEvent r15) {
        /*
            Method dump skipped, instructions count: 475
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a.b.k.h.I(a.b.k.h$k, android.view.KeyEvent):void");
    }

    public final boolean J(k kVar, int i2, KeyEvent keyEvent, int i3) {
        a.b.o.i.g gVar;
        boolean zPerformShortcut = false;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((kVar.k || K(kVar, keyEvent)) && (gVar = kVar.h) != null) {
            zPerformShortcut = gVar.performShortcut(i2, keyEvent, i3);
        }
        if (zPerformShortcut && (i3 & 1) == 0 && this.l == null) {
            u(kVar, true);
        }
        return zPerformShortcut;
    }

    public final boolean K(k kVar, KeyEvent keyEvent) {
        c0 c0Var;
        Resources.Theme themeNewTheme;
        c0 c0Var2;
        c0 c0Var3;
        if (this.M) {
            return false;
        }
        if (kVar.k) {
            return true;
        }
        k kVar2 = this.H;
        if (kVar2 != null && kVar2 != kVar) {
            u(kVar2, false);
        }
        Window.Callback callbackE = E();
        if (callbackE != null) {
            kVar.g = callbackE.onCreatePanelView(kVar.f28a);
        }
        int i2 = kVar.f28a;
        boolean z = i2 == 0 || i2 == 108;
        if (z && (c0Var3 = this.l) != null) {
            c0Var3.d();
        }
        if (kVar.g == null) {
            if (kVar.h == null || kVar.p) {
                if (kVar.h == null) {
                    Context context = this.f13e;
                    int i3 = kVar.f28a;
                    if ((i3 == 0 || i3 == 108) && this.l != null) {
                        TypedValue typedValue = new TypedValue();
                        Resources.Theme theme = context.getTheme();
                        theme.resolveAttribute(a.b.a.actionBarTheme, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            themeNewTheme = context.getResources().newTheme();
                            themeNewTheme.setTo(theme);
                            themeNewTheme.applyStyle(typedValue.resourceId, true);
                            themeNewTheme.resolveAttribute(a.b.a.actionBarWidgetTheme, typedValue, true);
                        } else {
                            theme.resolveAttribute(a.b.a.actionBarWidgetTheme, typedValue, true);
                            themeNewTheme = null;
                        }
                        if (typedValue.resourceId != 0) {
                            if (themeNewTheme == null) {
                                themeNewTheme = context.getResources().newTheme();
                                themeNewTheme.setTo(theme);
                            }
                            themeNewTheme.applyStyle(typedValue.resourceId, true);
                        }
                        if (themeNewTheme != null) {
                            a.b.o.c cVar = new a.b.o.c(context, 0);
                            cVar.getTheme().setTo(themeNewTheme);
                            context = cVar;
                        }
                    }
                    a.b.o.i.g gVar = new a.b.o.i.g(context);
                    gVar.f152e = this;
                    kVar.a(gVar);
                    if (kVar.h == null) {
                        return false;
                    }
                }
                if (z && this.l != null) {
                    if (this.m == null) {
                        this.m = new c();
                    }
                    this.l.b(kVar.h, this.m);
                }
                kVar.h.z();
                if (!callbackE.onCreatePanelMenu(kVar.f28a, kVar.h)) {
                    kVar.a(null);
                    if (z && (c0Var = this.l) != null) {
                        c0Var.b(null, this.m);
                    }
                    return false;
                }
                kVar.p = false;
            }
            kVar.h.z();
            Bundle bundle = kVar.q;
            if (bundle != null) {
                kVar.h.v(bundle);
                kVar.q = null;
            }
            if (!callbackE.onPreparePanel(0, kVar.g, kVar.h)) {
                if (z && (c0Var2 = this.l) != null) {
                    c0Var2.b(null, this.m);
                }
                kVar.h.y();
                return false;
            }
            boolean z2 = KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1;
            kVar.n = z2;
            kVar.h.setQwertyMode(z2);
            kVar.h.y();
        }
        kVar.k = true;
        kVar.l = false;
        this.H = kVar;
        return true;
    }

    public final boolean L() {
        ViewGroup viewGroup;
        return this.u && (viewGroup = this.v) != null && a.g.j.k.m(viewGroup);
    }

    public final void M() {
        if (this.u) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    public final int N(a.g.j.s sVar, Rect rect) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        boolean z;
        boolean z2;
        Context context;
        int i2;
        int iD = sVar != null ? sVar.d() : rect != null ? rect.top : 0;
        ActionBarContextView actionBarContextView = this.p;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.p.getLayoutParams();
            if (this.p.isShown()) {
                if (this.X == null) {
                    this.X = new Rect();
                    this.Y = new Rect();
                }
                Rect rect2 = this.X;
                Rect rect3 = this.Y;
                if (sVar == null) {
                    rect2.set(rect);
                } else {
                    rect2.set(sVar.b(), sVar.d(), sVar.c(), sVar.a());
                }
                ViewGroup viewGroup = this.v;
                Method method = b1.f200a;
                if (method != null) {
                    try {
                        method.invoke(viewGroup, rect2, rect3);
                    } catch (Exception unused) {
                    }
                }
                int i3 = rect2.top;
                int i4 = rect2.left;
                int i5 = rect2.right;
                a.g.j.s sVarH = a.g.j.k.h(this.v);
                int iB = sVarH.b();
                int iC = sVarH.c();
                if (marginLayoutParams.topMargin == i3 && marginLayoutParams.leftMargin == i4 && marginLayoutParams.rightMargin == i5) {
                    z2 = false;
                } else {
                    marginLayoutParams.topMargin = i3;
                    marginLayoutParams.leftMargin = i4;
                    marginLayoutParams.rightMargin = i5;
                    z2 = true;
                }
                if (i3 <= 0 || this.x != null) {
                    View view = this.x;
                    if (view != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                        if (marginLayoutParams2.height != marginLayoutParams.topMargin || marginLayoutParams2.leftMargin != iB || marginLayoutParams2.rightMargin != iC) {
                            marginLayoutParams2.height = marginLayoutParams.topMargin;
                            marginLayoutParams2.leftMargin = iB;
                            marginLayoutParams2.rightMargin = iC;
                            this.x.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view2 = new View(this.f13e);
                    this.x = view2;
                    view2.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = iB;
                    layoutParams.rightMargin = iC;
                    this.v.addView(this.x, -1, layoutParams);
                }
                z = this.x != null;
                if (z && this.x.getVisibility() != 0) {
                    View view3 = this.x;
                    if ((view3.getWindowSystemUiVisibility() & 8192) != 0) {
                        context = this.f13e;
                        i2 = a.b.c.abc_decor_view_status_guard_light;
                    } else {
                        context = this.f13e;
                        i2 = a.b.c.abc_decor_view_status_guard;
                    }
                    view3.setBackgroundColor(a.g.d.a.a(context, i2));
                }
                if (!this.C && z) {
                    iD = 0;
                }
                z = z2;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z = false;
            } else {
                z = false;
                z = false;
            }
            if (z) {
                this.p.setLayoutParams(marginLayoutParams);
            }
        }
        View view4 = this.x;
        if (view4 != null) {
            view4.setVisibility(z ? 0 : 8);
        }
        return iD;
    }

    @Override // a.b.o.i.g.a
    public void a(a.b.o.i.g gVar) {
        c0 c0Var = this.l;
        if (c0Var == null || !c0Var.f() || (ViewConfiguration.get(this.f13e).hasPermanentMenuKey() && !this.l.c())) {
            k kVarD = D(0);
            kVarD.o = true;
            u(kVarD, false);
            I(kVarD, null);
            return;
        }
        Window.Callback callbackE = E();
        if (this.l.e()) {
            this.l.g();
            if (this.M) {
                return;
            }
            callbackE.onPanelClosed(108, D(0).h);
            return;
        }
        if (callbackE == null || this.M) {
            return;
        }
        if (this.T && (1 & this.U) != 0) {
            this.f.getDecorView().removeCallbacks(this.V);
            this.V.run();
        }
        k kVarD2 = D(0);
        a.b.o.i.g gVar2 = kVarD2.h;
        if (gVar2 == null || kVarD2.p || !callbackE.onPreparePanel(0, kVarD2.g, gVar2)) {
            return;
        }
        callbackE.onMenuOpened(108, kVarD2.h);
        this.l.a();
    }

    @Override // a.b.o.i.g.a
    public boolean b(a.b.o.i.g gVar, MenuItem menuItem) {
        k kVarB;
        Window.Callback callbackE = E();
        if (callbackE == null || this.M || (kVarB = B(gVar.k())) == null) {
            return false;
        }
        return callbackE.onMenuItemSelected(kVarB.f28a, menuItem);
    }

    @Override // a.b.k.g
    public void c(View view, ViewGroup.LayoutParams layoutParams) {
        z();
        ((ViewGroup) this.v.findViewById(R.id.content)).addView(view, layoutParams);
        this.g.f112b.onContentChanged();
    }

    @Override // a.b.k.g
    public void f() {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f13e);
        if (layoutInflaterFrom.getFactory() == null) {
            layoutInflaterFrom.setFactory2(this);
        } else {
            boolean z = layoutInflaterFrom.getFactory2() instanceof h;
        }
    }

    @Override // a.b.k.g
    public void g() {
        F();
        a.b.k.a aVar = this.i;
        G(0);
    }

    @Override // a.b.k.g
    public void h(Bundle bundle) {
        this.J = true;
        q(false);
        A();
        Object obj = this.f12d;
        if (obj instanceof Activity) {
            String strZ = null;
            try {
                Activity activity = (Activity) obj;
                try {
                    strZ = i.z(activity, activity.getComponentName());
                } catch (PackageManager.NameNotFoundException e2) {
                    throw new IllegalArgumentException(e2);
                }
            } catch (IllegalArgumentException unused) {
            }
            if (strZ != null) {
                a.b.k.a aVar = this.i;
                if (aVar == null) {
                    this.W = true;
                } else {
                    aVar.g(true);
                }
            }
            synchronized (a.b.k.g.f11c) {
                a.b.k.g.j(this);
                a.b.k.g.f10b.add(new WeakReference<>(this));
            }
        }
        this.K = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x0050  */
    @Override // a.b.k.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void i() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f12d
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L11
            java.lang.Object r0 = a.b.k.g.f11c
            monitor-enter(r0)
            a.b.k.g.j(r3)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            goto L11
        Le:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r1
        L11:
            boolean r0 = r3.T
            if (r0 == 0) goto L20
            android.view.Window r0 = r3.f
            android.view.View r0 = r0.getDecorView()
            java.lang.Runnable r1 = r3.V
            r0.removeCallbacks(r1)
        L20:
            r0 = 0
            r3.L = r0
            r0 = 1
            r3.M = r0
            int r0 = r3.N
            r1 = -100
            if (r0 == r1) goto L50
            java.lang.Object r0 = r3.f12d
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L50
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isChangingConfigurations()
            if (r0 == 0) goto L50
            a.e.h<java.lang.String, java.lang.Integer> r0 = a.b.k.h.a0
            java.lang.Object r1 = r3.f12d
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            int r2 = r3.N
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            goto L5f
        L50:
            a.e.h<java.lang.String, java.lang.Integer> r0 = a.b.k.h.a0
            java.lang.Object r1 = r3.f12d
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.remove(r1)
        L5f:
            a.b.k.a r0 = r3.i
            if (r0 == 0) goto L68
            if (r0 == 0) goto L66
            goto L68
        L66:
            r0 = 0
            throw r0
        L68:
            a.b.k.h$g r0 = r3.R
            if (r0 == 0) goto L6f
            r0.a()
        L6f:
            a.b.k.h$g r0 = r3.S
            if (r0 == 0) goto L76
            r0.a()
        L76:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a.b.k.h.i():void");
    }

    @Override // a.b.k.g
    public boolean k(int i2) {
        if (i2 == 8) {
            i2 = 108;
        } else if (i2 == 9) {
            i2 = 109;
        }
        if (this.E && i2 == 108) {
            return false;
        }
        if (this.A && i2 == 1) {
            this.A = false;
        }
        if (i2 == 1) {
            M();
            this.E = true;
            return true;
        }
        if (i2 == 2) {
            M();
            this.y = true;
            return true;
        }
        if (i2 == 5) {
            M();
            this.z = true;
            return true;
        }
        if (i2 == 10) {
            M();
            this.C = true;
            return true;
        }
        if (i2 == 108) {
            M();
            this.A = true;
            return true;
        }
        if (i2 != 109) {
            return this.f.requestFeature(i2);
        }
        M();
        this.B = true;
        return true;
    }

    @Override // a.b.k.g
    public void l(int i2) {
        z();
        ViewGroup viewGroup = (ViewGroup) this.v.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f13e).inflate(i2, viewGroup);
        this.g.f112b.onContentChanged();
    }

    @Override // a.b.k.g
    public void m(View view) {
        z();
        ViewGroup viewGroup = (ViewGroup) this.v.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.g.f112b.onContentChanged();
    }

    @Override // a.b.k.g
    public void n(View view, ViewGroup.LayoutParams layoutParams) {
        z();
        ViewGroup viewGroup = (ViewGroup) this.v.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.g.f112b.onContentChanged();
    }

    @Override // a.b.k.g
    public final void o(CharSequence charSequence) {
        this.k = charSequence;
        c0 c0Var = this.l;
        if (c0Var != null) {
            c0Var.setWindowTitle(charSequence);
            return;
        }
        a.b.k.a aVar = this.i;
        if (aVar != null) {
            aVar.i(charSequence);
            return;
        }
        TextView textView = this.w;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0104  */
    @Override // android.view.LayoutInflater.Factory2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View onCreateView(android.view.View r8, java.lang.String r9, android.content.Context r10, android.util.AttributeSet r11) {
        /*
            Method dump skipped, instructions count: 584
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a.b.k.h.onCreateView(android.view.View, java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    public boolean p() {
        return q(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:131:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x00fa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean q(boolean r11) {
        /*
            Method dump skipped, instructions count: 317
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a.b.k.h.q(boolean):boolean");
    }

    public final void r(Window window) {
        if (this.f != null) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof e) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        e eVar = new e(callback);
        this.g = eVar;
        window.setCallback(eVar);
        x0 x0VarN = x0.n(this.f13e, null, c0);
        Drawable drawableF = x0VarN.f(0);
        if (drawableF != null) {
            window.setBackgroundDrawable(drawableF);
        }
        x0VarN.f336b.recycle();
        this.f = window;
    }

    public void s(int i2, k kVar, Menu menu) {
        if (menu == null && kVar != null) {
            menu = kVar.h;
        }
        if ((kVar == null || kVar.m) && !this.M) {
            this.g.f112b.onPanelClosed(i2, menu);
        }
    }

    public void t(a.b.o.i.g gVar) {
        if (this.F) {
            return;
        }
        this.F = true;
        this.l.j();
        Window.Callback callbackE = E();
        if (callbackE != null && !this.M) {
            callbackE.onPanelClosed(108, gVar);
        }
        this.F = false;
    }

    public void u(k kVar, boolean z) {
        ViewGroup viewGroup;
        c0 c0Var;
        if (z && kVar.f28a == 0 && (c0Var = this.l) != null && c0Var.e()) {
            t(kVar.h);
            return;
        }
        WindowManager windowManager = (WindowManager) this.f13e.getSystemService("window");
        if (windowManager != null && kVar.m && (viewGroup = kVar.f32e) != null) {
            windowManager.removeView(viewGroup);
            if (z) {
                s(kVar.f28a, kVar, null);
            }
        }
        kVar.k = false;
        kVar.l = false;
        kVar.m = false;
        kVar.f = null;
        kVar.o = true;
        if (this.H == kVar) {
            this.H = null;
        }
    }

    public final Configuration v(Context context, int i2, Configuration configuration) {
        int i3 = i2 != 1 ? i2 != 2 ? context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32 : 16;
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i3 | (configuration2.uiMode & (-49));
        return configuration2;
    }

    /* JADX WARN: Removed duplicated region for block: B:169:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:198:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean w(android.view.KeyEvent r7) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a.b.k.h.w(android.view.KeyEvent):boolean");
    }

    public void x(int i2) {
        k kVarD = D(i2);
        if (kVarD.h != null) {
            Bundle bundle = new Bundle();
            kVarD.h.w(bundle);
            if (bundle.size() > 0) {
                kVarD.q = bundle;
            }
            kVarD.h.z();
            kVarD.h.clear();
        }
        kVarD.p = true;
        kVarD.o = true;
        if ((i2 == 108 || i2 == 0) && this.l != null) {
            k kVarD2 = D(0);
            kVarD2.k = false;
            K(kVarD2, null);
        }
    }

    public void y() {
        a.g.j.o oVar = this.s;
        if (oVar != null) {
            oVar.b();
        }
    }

    public final void z() {
        ViewGroup viewGroup;
        if (this.u) {
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = this.f13e.obtainStyledAttributes(a.b.j.AppCompatTheme);
        if (!typedArrayObtainStyledAttributes.hasValue(a.b.j.AppCompatTheme_windowActionBar)) {
            typedArrayObtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (typedArrayObtainStyledAttributes.getBoolean(a.b.j.AppCompatTheme_windowNoTitle, false)) {
            k(1);
        } else if (typedArrayObtainStyledAttributes.getBoolean(a.b.j.AppCompatTheme_windowActionBar, false)) {
            k(108);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(a.b.j.AppCompatTheme_windowActionBarOverlay, false)) {
            k(109);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(a.b.j.AppCompatTheme_windowActionModeOverlay, false)) {
            k(10);
        }
        this.D = typedArrayObtainStyledAttributes.getBoolean(a.b.j.AppCompatTheme_android_windowIsFloating, false);
        typedArrayObtainStyledAttributes.recycle();
        A();
        this.f.getDecorView();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f13e);
        if (this.E) {
            viewGroup = (ViewGroup) layoutInflaterFrom.inflate(this.C ? a.b.g.abc_screen_simple_overlay_action_mode : a.b.g.abc_screen_simple, (ViewGroup) null);
        } else if (this.D) {
            viewGroup = (ViewGroup) layoutInflaterFrom.inflate(a.b.g.abc_dialog_title_material, (ViewGroup) null);
            this.B = false;
            this.A = false;
        } else if (this.A) {
            TypedValue typedValue = new TypedValue();
            this.f13e.getTheme().resolveAttribute(a.b.a.actionBarTheme, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new a.b.o.c(this.f13e, typedValue.resourceId) : this.f13e).inflate(a.b.g.abc_screen_toolbar, (ViewGroup) null);
            c0 c0Var = (c0) viewGroup.findViewById(a.b.f.decor_content_parent);
            this.l = c0Var;
            c0Var.setWindowCallback(E());
            if (this.B) {
                this.l.h(109);
            }
            if (this.y) {
                this.l.h(2);
            }
            if (this.z) {
                this.l.h(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            StringBuilder sbE = b.a.a.a.a.e("AppCompat does not support the current theme features: { windowActionBar: ");
            sbE.append(this.A);
            sbE.append(", windowActionBarOverlay: ");
            sbE.append(this.B);
            sbE.append(", android:windowIsFloating: ");
            sbE.append(this.D);
            sbE.append(", windowActionModeOverlay: ");
            sbE.append(this.C);
            sbE.append(", windowNoTitle: ");
            sbE.append(this.E);
            sbE.append(" }");
            throw new IllegalArgumentException(sbE.toString());
        }
        a.g.j.k.x(viewGroup, new a.b.k.i(this));
        if (this.l == null) {
            this.w = (TextView) viewGroup.findViewById(a.b.f.title);
        }
        b1.b(viewGroup);
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(a.b.f.action_bar_activity_content);
        ViewGroup viewGroup2 = (ViewGroup) this.f.findViewById(R.id.content);
        if (viewGroup2 != null) {
            while (viewGroup2.getChildCount() > 0) {
                View childAt = viewGroup2.getChildAt(0);
                viewGroup2.removeViewAt(0);
                contentFrameLayout.addView(childAt);
            }
            viewGroup2.setId(-1);
            contentFrameLayout.setId(R.id.content);
            if (viewGroup2 instanceof FrameLayout) {
                ((FrameLayout) viewGroup2).setForeground(null);
            }
        }
        this.f.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new a.b.k.k(this));
        this.v = viewGroup;
        Object obj = this.f12d;
        CharSequence title = obj instanceof Activity ? ((Activity) obj).getTitle() : this.k;
        if (!TextUtils.isEmpty(title)) {
            c0 c0Var2 = this.l;
            if (c0Var2 != null) {
                c0Var2.setWindowTitle(title);
            } else {
                a.b.k.a aVar = this.i;
                if (aVar != null) {
                    aVar.i(title);
                } else {
                    TextView textView = this.w;
                    if (textView != null) {
                        textView.setText(title);
                    }
                }
            }
        }
        ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.v.findViewById(R.id.content);
        View decorView = this.f.getDecorView();
        contentFrameLayout2.h.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        if (a.g.j.k.m(contentFrameLayout2)) {
            contentFrameLayout2.requestLayout();
        }
        TypedArray typedArrayObtainStyledAttributes2 = this.f13e.obtainStyledAttributes(a.b.j.AppCompatTheme);
        typedArrayObtainStyledAttributes2.getValue(a.b.j.AppCompatTheme_windowMinWidthMajor, contentFrameLayout2.getMinWidthMajor());
        typedArrayObtainStyledAttributes2.getValue(a.b.j.AppCompatTheme_windowMinWidthMinor, contentFrameLayout2.getMinWidthMinor());
        if (typedArrayObtainStyledAttributes2.hasValue(a.b.j.AppCompatTheme_windowFixedWidthMajor)) {
            typedArrayObtainStyledAttributes2.getValue(a.b.j.AppCompatTheme_windowFixedWidthMajor, contentFrameLayout2.getFixedWidthMajor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(a.b.j.AppCompatTheme_windowFixedWidthMinor)) {
            typedArrayObtainStyledAttributes2.getValue(a.b.j.AppCompatTheme_windowFixedWidthMinor, contentFrameLayout2.getFixedWidthMinor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(a.b.j.AppCompatTheme_windowFixedHeightMajor)) {
            typedArrayObtainStyledAttributes2.getValue(a.b.j.AppCompatTheme_windowFixedHeightMajor, contentFrameLayout2.getFixedHeightMajor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(a.b.j.AppCompatTheme_windowFixedHeightMinor)) {
            typedArrayObtainStyledAttributes2.getValue(a.b.j.AppCompatTheme_windowFixedHeightMinor, contentFrameLayout2.getFixedHeightMinor());
        }
        typedArrayObtainStyledAttributes2.recycle();
        contentFrameLayout2.requestLayout();
        this.u = true;
        k kVarD = D(0);
        if (this.M || kVarD.h != null) {
            return;
        }
        G(108);
    }
}
