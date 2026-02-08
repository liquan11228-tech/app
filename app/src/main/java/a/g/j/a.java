package a.g.j;

import a.g.j.t.b;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class a {

    /* renamed from: c */
    public static final View.AccessibilityDelegate f675c = new View.AccessibilityDelegate();

    /* renamed from: a */
    public final View.AccessibilityDelegate f676a = f675c;

    /* renamed from: b */
    public final View.AccessibilityDelegate f677b = new C0015a(this);

    /* renamed from: a.g.j.a$a */
    public static final class C0015a extends View.AccessibilityDelegate {

        /* renamed from: a */
        public final a f678a;

        public C0015a(a aVar) {
            this.f678a = aVar;
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.f678a.f676a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
            AccessibilityNodeProvider accessibilityNodeProvider = this.f678a.f676a.getAccessibilityNodeProvider(view);
            a.g.j.t.c cVar = accessibilityNodeProvider != null ? new a.g.j.t.c(accessibilityNodeProvider) : null;
            if (cVar != null) {
                return (AccessibilityNodeProvider) cVar.f737a;
            }
            return null;
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f678a.a(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            a.g.j.t.b bVar = new a.g.j.t.b(accessibilityNodeInfo);
            boolean zN = k.n(view);
            if (Build.VERSION.SDK_INT >= 28) {
                bVar.f729a.setScreenReaderFocusable(zN);
            } else {
                bVar.f(1, zN);
            }
            Boolean boolB = new n(a.g.a.tag_accessibility_heading, Boolean.class, 28).b(view);
            boolean zBooleanValue = boolB == null ? false : boolB.booleanValue();
            if (Build.VERSION.SDK_INT >= 28) {
                bVar.f729a.setHeading(zBooleanValue);
            } else {
                bVar.f(2, zBooleanValue);
            }
            CharSequence charSequenceB = new m(a.g.a.tag_accessibility_pane_title, CharSequence.class, 8, 28).b(view);
            if (Build.VERSION.SDK_INT >= 28) {
                bVar.f729a.setPaneTitle(charSequenceB);
            } else {
                bVar.f729a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequenceB);
            }
            this.f678a.b(view, bVar);
            accessibilityNodeInfo.getText();
            List listEmptyList = (List) view.getTag(a.g.a.tag_accessibility_actions);
            if (listEmptyList == null) {
                listEmptyList = Collections.emptyList();
            }
            for (int i = 0; i < listEmptyList.size(); i++) {
                bVar.a((b.a) listEmptyList.get(i));
            }
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f678a.f676a.onPopulateAccessibilityEvent(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return this.f678a.f676a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            return this.f678a.c(view, i, bundle);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void sendAccessibilityEvent(View view, int i) {
            this.f678a.f676a.sendAccessibilityEvent(view, i);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            this.f678a.f676a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
        }
    }

    public void a(View view, AccessibilityEvent accessibilityEvent) {
        this.f676a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void b(View view, a.g.j.t.b bVar) {
        this.f676a.onInitializeAccessibilityNodeInfo(view, bVar.f729a);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x009f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean c(android.view.View r6, int r7, android.os.Bundle r8) throws java.lang.IllegalAccessException, java.lang.InstantiationException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            r5 = this;
            int r0 = a.g.a.tag_accessibility_actions
            java.lang.Object r0 = r6.getTag(r0)
            java.util.List r0 = (java.util.List) r0
            if (r0 != 0) goto Le
            java.util.List r0 = java.util.Collections.emptyList()
        Le:
            r1 = 0
            r2 = r1
        L10:
            int r3 = r0.size()
            if (r2 >= r3) goto L4c
            java.lang.Object r3 = r0.get(r2)
            a.g.j.t.b$a r3 = (a.g.j.t.b.a) r3
            java.lang.Object r4 = r3.f734a
            android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction r4 = (android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction) r4
            int r4 = r4.getId()
            if (r4 != r7) goto L49
            a.g.j.t.d r0 = r3.f736c
            if (r0 == 0) goto L4c
            java.lang.Class<? extends a.g.j.t.d$a> r0 = r3.f735b
            r2 = 0
            if (r0 == 0) goto L42
            java.lang.Class[] r4 = new java.lang.Class[r1]     // Catch: java.lang.Exception -> L42
            java.lang.reflect.Constructor r0 = r0.getDeclaredConstructor(r4)     // Catch: java.lang.Exception -> L42
            java.lang.Object[] r4 = new java.lang.Object[r1]     // Catch: java.lang.Exception -> L42
            java.lang.Object r0 = r0.newInstance(r4)     // Catch: java.lang.Exception -> L42
            a.g.j.t.d$a r0 = (a.g.j.t.d.a) r0     // Catch: java.lang.Exception -> L42
            if (r0 == 0) goto L41
        L3f:
            r2 = r0
            goto L42
        L41:
            throw r2     // Catch: java.lang.Exception -> L3f
        L42:
            a.g.j.t.d r0 = r3.f736c
            boolean r0 = r0.a(r6, r2)
            goto L4d
        L49:
            int r2 = r2 + 1
            goto L10
        L4c:
            r0 = r1
        L4d:
            if (r0 != 0) goto L55
            android.view.View$AccessibilityDelegate r0 = r5.f676a
            boolean r0 = r0.performAccessibilityAction(r6, r7, r8)
        L55:
            if (r0 != 0) goto La4
            int r2 = a.g.a.accessibility_action_clickable_span
            if (r7 != r2) goto La4
            r7 = -1
            java.lang.String r0 = "ACCESSIBILITY_CLICKABLE_SPAN_ID"
            int r7 = r8.getInt(r0, r7)
            int r8 = a.g.a.tag_accessibility_clickable_spans
            java.lang.Object r8 = r6.getTag(r8)
            android.util.SparseArray r8 = (android.util.SparseArray) r8
            r0 = 1
            if (r8 == 0) goto La3
            java.lang.Object r7 = r8.get(r7)
            java.lang.ref.WeakReference r7 = (java.lang.ref.WeakReference) r7
            if (r7 == 0) goto La3
            java.lang.Object r7 = r7.get()
            android.text.style.ClickableSpan r7 = (android.text.style.ClickableSpan) r7
            if (r7 == 0) goto L9c
            android.view.accessibility.AccessibilityNodeInfo r8 = r6.createAccessibilityNodeInfo()
            java.lang.CharSequence r8 = r8.getText()
            android.text.style.ClickableSpan[] r8 = a.g.j.t.b.d(r8)
            r2 = r1
        L8a:
            if (r8 == 0) goto L9c
            int r3 = r8.length
            if (r2 >= r3) goto L9c
            r3 = r8[r2]
            boolean r3 = r7.equals(r3)
            if (r3 == 0) goto L99
            r8 = r0
            goto L9d
        L99:
            int r2 = r2 + 1
            goto L8a
        L9c:
            r8 = r1
        L9d:
            if (r8 == 0) goto La3
            r7.onClick(r6)
            r1 = r0
        La3:
            r0 = r1
        La4:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a.g.j.a.c(android.view.View, int, android.os.Bundle):boolean");
    }
}
