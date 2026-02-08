package a.g.j.t;

import a.g.j.t.d;
import android.R;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public final AccessibilityNodeInfo f729a;

    /* renamed from: b, reason: collision with root package name */
    public int f730b = -1;

    /* renamed from: c, reason: collision with root package name */
    public int f731c = -1;

    public static class a {

        /* renamed from: d, reason: collision with root package name */
        public static final a f732d;

        /* renamed from: e, reason: collision with root package name */
        public static final a f733e;
        public static final a f;
        public static final a g;

        /* renamed from: a, reason: collision with root package name */
        public final Object f734a;

        /* renamed from: b, reason: collision with root package name */
        public final Class<? extends d.a> f735b;

        /* renamed from: c, reason: collision with root package name */
        public final d f736c;

        static {
            new AccessibilityNodeInfo.AccessibilityAction(1, null);
            new AccessibilityNodeInfo.AccessibilityAction(2, null);
            new AccessibilityNodeInfo.AccessibilityAction(4, null);
            new AccessibilityNodeInfo.AccessibilityAction(8, null);
            new AccessibilityNodeInfo.AccessibilityAction(16, null);
            new AccessibilityNodeInfo.AccessibilityAction(32, null);
            new AccessibilityNodeInfo.AccessibilityAction(64, null);
            new AccessibilityNodeInfo.AccessibilityAction(128, null);
            new AccessibilityNodeInfo.AccessibilityAction(256, null);
            new AccessibilityNodeInfo.AccessibilityAction(512, null);
            new AccessibilityNodeInfo.AccessibilityAction(1024, null);
            new AccessibilityNodeInfo.AccessibilityAction(2048, null);
            f732d = new a(4096, null);
            f733e = new a(8192, null);
            new AccessibilityNodeInfo.AccessibilityAction(16384, null);
            new AccessibilityNodeInfo.AccessibilityAction(32768, null);
            new AccessibilityNodeInfo.AccessibilityAction(65536, null);
            new AccessibilityNodeInfo.AccessibilityAction(131072, null);
            new AccessibilityNodeInfo.AccessibilityAction(262144, null);
            new AccessibilityNodeInfo.AccessibilityAction(524288, null);
            new AccessibilityNodeInfo.AccessibilityAction(1048576, null);
            new AccessibilityNodeInfo.AccessibilityAction(2097152, null);
            if (AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN == null) {
                new AccessibilityNodeInfo.AccessibilityAction(R.id.accessibilityActionShowOnScreen, null);
            }
            if (AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION == null) {
                new AccessibilityNodeInfo.AccessibilityAction(R.id.accessibilityActionScrollToPosition, null);
            }
            f = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, R.id.accessibilityActionScrollUp, null, null, null);
            if (AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT == null) {
                new AccessibilityNodeInfo.AccessibilityAction(R.id.accessibilityActionScrollLeft, null);
            }
            g = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, R.id.accessibilityActionScrollDown, null, null, null);
            if (AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT == null) {
                new AccessibilityNodeInfo.AccessibilityAction(R.id.accessibilityActionScrollRight, null);
            }
            if ((Build.VERSION.SDK_INT >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null) == null) {
                new AccessibilityNodeInfo.AccessibilityAction(R.id.accessibilityActionPageUp, null);
            }
            if ((Build.VERSION.SDK_INT >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN : null) == null) {
                new AccessibilityNodeInfo.AccessibilityAction(R.id.accessibilityActionPageDown, null);
            }
            if ((Build.VERSION.SDK_INT >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null) == null) {
                new AccessibilityNodeInfo.AccessibilityAction(R.id.accessibilityActionPageLeft, null);
            }
            if ((Build.VERSION.SDK_INT >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT : null) == null) {
                new AccessibilityNodeInfo.AccessibilityAction(R.id.accessibilityActionPageRight, null);
            }
            if (AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK == null) {
                new AccessibilityNodeInfo.AccessibilityAction(R.id.accessibilityActionContextClick, null);
            }
            if (AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS == null) {
                new AccessibilityNodeInfo.AccessibilityAction(R.id.accessibilityActionSetProgress, null);
            }
            if (AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW == null) {
                new AccessibilityNodeInfo.AccessibilityAction(R.id.accessibilityActionMoveWindow, null);
            }
            if ((Build.VERSION.SDK_INT >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null) == null) {
                new AccessibilityNodeInfo.AccessibilityAction(R.id.accessibilityActionShowTooltip, null);
            }
            if ((Build.VERSION.SDK_INT >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP : null) == null) {
                new AccessibilityNodeInfo.AccessibilityAction(R.id.accessibilityActionHideTooltip, null);
            }
        }

        public a(int i, CharSequence charSequence) {
            this(null, i, null, null, null);
        }

        public a(Object obj, int i, CharSequence charSequence, d dVar, Class<? extends d.a> cls) {
            this.f736c = null;
            this.f734a = obj == null ? new AccessibilityNodeInfo.AccessibilityAction(i, charSequence) : obj;
            this.f735b = cls;
        }

        public boolean equals(Object obj) {
            if (obj == null || !(obj instanceof a)) {
                return false;
            }
            Object obj2 = this.f734a;
            Object obj3 = ((a) obj).f734a;
            return obj2 == null ? obj3 == null : obj2.equals(obj3);
        }

        public int hashCode() {
            Object obj = this.f734a;
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }
    }

    public b(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f729a = accessibilityNodeInfo;
    }

    public static String c(int i) {
        if (i == 1) {
            return "ACTION_FOCUS";
        }
        if (i == 2) {
            return "ACTION_CLEAR_FOCUS";
        }
        switch (i) {
            case 4:
                return "ACTION_SELECT";
            case 8:
                return "ACTION_CLEAR_SELECTION";
            case 16:
                return "ACTION_CLICK";
            case 32:
                return "ACTION_LONG_CLICK";
            case 64:
                return "ACTION_ACCESSIBILITY_FOCUS";
            case 128:
                return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            case 256:
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            case 512:
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            case 1024:
                return "ACTION_NEXT_HTML_ELEMENT";
            case 2048:
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            case 4096:
                return "ACTION_SCROLL_FORWARD";
            case 8192:
                return "ACTION_SCROLL_BACKWARD";
            case 16384:
                return "ACTION_COPY";
            case 32768:
                return "ACTION_PASTE";
            case 65536:
                return "ACTION_CUT";
            case 131072:
                return "ACTION_SET_SELECTION";
            case 262144:
                return "ACTION_EXPAND";
            case 524288:
                return "ACTION_COLLAPSE";
            case 2097152:
                return "ACTION_SET_TEXT";
            case R.id.accessibilityActionMoveWindow:
                return "ACTION_MOVE_WINDOW";
            default:
                switch (i) {
                    case R.id.accessibilityActionShowOnScreen:
                        return "ACTION_SHOW_ON_SCREEN";
                    case R.id.accessibilityActionScrollToPosition:
                        return "ACTION_SCROLL_TO_POSITION";
                    case R.id.accessibilityActionScrollUp:
                        return "ACTION_SCROLL_UP";
                    case R.id.accessibilityActionScrollLeft:
                        return "ACTION_SCROLL_LEFT";
                    case R.id.accessibilityActionScrollDown:
                        return "ACTION_SCROLL_DOWN";
                    case R.id.accessibilityActionScrollRight:
                        return "ACTION_SCROLL_RIGHT";
                    case R.id.accessibilityActionContextClick:
                        return "ACTION_CONTEXT_CLICK";
                    case R.id.accessibilityActionSetProgress:
                        return "ACTION_SET_PROGRESS";
                    default:
                        switch (i) {
                            case R.id.accessibilityActionShowTooltip:
                                return "ACTION_SHOW_TOOLTIP";
                            case R.id.accessibilityActionHideTooltip:
                                return "ACTION_HIDE_TOOLTIP";
                            case R.id.accessibilityActionPageUp:
                                return "ACTION_PAGE_UP";
                            case R.id.accessibilityActionPageDown:
                                return "ACTION_PAGE_DOWN";
                            case R.id.accessibilityActionPageLeft:
                                return "ACTION_PAGE_LEFT";
                            case R.id.accessibilityActionPageRight:
                                return "ACTION_PAGE_RIGHT";
                            default:
                                return "ACTION_UNKNOWN";
                        }
                }
        }
    }

    public static ClickableSpan[] d(CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            return (ClickableSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), ClickableSpan.class);
        }
        return null;
    }

    public void a(a aVar) {
        this.f729a.addAction((AccessibilityNodeInfo.AccessibilityAction) aVar.f734a);
    }

    public final List<Integer> b(String str) {
        ArrayList<Integer> integerArrayList = this.f729a.getExtras().getIntegerArrayList(str);
        if (integerArrayList != null) {
            return integerArrayList;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        this.f729a.getExtras().putIntegerArrayList(str, arrayList);
        return arrayList;
    }

    public Bundle e() {
        return this.f729a.getExtras();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f729a;
        if (accessibilityNodeInfo == null) {
            if (bVar.f729a != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo.equals(bVar.f729a)) {
            return false;
        }
        return this.f731c == bVar.f731c && this.f730b == bVar.f730b;
    }

    public final void f(int i, boolean z) {
        Bundle bundleE = e();
        if (bundleE != null) {
            int i2 = bundleE.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (~i);
            if (!z) {
                i = 0;
            }
            bundleE.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i | i2);
        }
    }

    public int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f729a;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r6v3, types: [android.text.SpannableString] */
    public String toString() {
        ?? text;
        ?? EmptyList;
        ?? sb = new StringBuilder();
        sb.append(super.toString());
        Rect rect = new Rect();
        this.f729a.getBoundsInParent(rect);
        sb.append("; boundsInParent: " + rect);
        this.f729a.getBoundsInScreen(rect);
        sb.append("; boundsInScreen: " + rect);
        sb.append("; packageName: ");
        sb.append(this.f729a.getPackageName());
        sb.append("; className: ");
        sb.append(this.f729a.getClassName());
        sb.append("; text: ");
        if (!b("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty()) {
            List<Integer> listB = b("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
            List<Integer> listB2 = b("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
            List<Integer> listB3 = b("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
            List<Integer> listB4 = b("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
            text = new SpannableString(TextUtils.substring(this.f729a.getText(), 0, this.f729a.getText().length()));
            for (int i = 0; i < listB.size(); i++) {
                text.setSpan(new a.g.j.t.a(listB4.get(i).intValue(), this, e().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), listB.get(i).intValue(), listB2.get(i).intValue(), listB3.get(i).intValue());
            }
        } else {
            text = this.f729a.getText();
        }
        sb.append(text);
        sb.append("; contentDescription: ");
        sb.append(this.f729a.getContentDescription());
        sb.append("; viewId: ");
        sb.append(this.f729a.getViewIdResourceName());
        sb.append("; checkable: ");
        sb.append(this.f729a.isCheckable());
        sb.append("; checked: ");
        sb.append(this.f729a.isChecked());
        sb.append("; focusable: ");
        sb.append(this.f729a.isFocusable());
        sb.append("; focused: ");
        sb.append(this.f729a.isFocused());
        sb.append("; selected: ");
        sb.append(this.f729a.isSelected());
        sb.append("; clickable: ");
        sb.append(this.f729a.isClickable());
        sb.append("; longClickable: ");
        sb.append(this.f729a.isLongClickable());
        sb.append("; enabled: ");
        sb.append(this.f729a.isEnabled());
        sb.append("; password: ");
        sb.append(this.f729a.isPassword());
        sb.append("; scrollable: " + this.f729a.isScrollable());
        sb.append("; [");
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = this.f729a.getActionList();
        if (actionList != null) {
            EmptyList = new ArrayList();
            int size = actionList.size();
            for (int i2 = 0; i2 < size; i2++) {
                EmptyList.add(new a(actionList.get(i2), 0, null, null, null));
            }
        } else {
            EmptyList = Collections.emptyList();
        }
        for (int i3 = 0; i3 < EmptyList.size(); i3++) {
            a aVar = (a) EmptyList.get(i3);
            String strC = c(((AccessibilityNodeInfo.AccessibilityAction) aVar.f734a).getId());
            if (strC.equals("ACTION_UNKNOWN") && ((AccessibilityNodeInfo.AccessibilityAction) aVar.f734a).getLabel() != null) {
                strC = ((AccessibilityNodeInfo.AccessibilityAction) aVar.f734a).getLabel().toString();
            }
            sb.append(strC);
            if (i3 != EmptyList.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
