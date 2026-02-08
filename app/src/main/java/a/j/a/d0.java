package a.j.a;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@SuppressLint({"UnknownNullness"})
/* loaded from: classes.dex */
public abstract class d0 {
    public static boolean d(List<View> list, View view, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (list.get(i2) == view) {
                return true;
            }
        }
        return false;
    }

    public static boolean g(List list) {
        return list == null || list.isEmpty();
    }

    public abstract void a(Object obj, ArrayList<View> arrayList);

    public void b(ArrayList<View> arrayList, View view) {
        if (view.getVisibility() == 0) {
            boolean z = view instanceof ViewGroup;
            View view2 = view;
            if (z) {
                ViewGroup viewGroup = (ViewGroup) view;
                boolean zIsTransitionGroup = viewGroup.isTransitionGroup();
                view2 = viewGroup;
                if (!zIsTransitionGroup) {
                    int childCount = viewGroup.getChildCount();
                    for (int i = 0; i < childCount; i++) {
                        b(arrayList, viewGroup.getChildAt(i));
                    }
                    return;
                }
            }
            arrayList.add(view2);
        }
    }

    public abstract Object c(Object obj);

    public void e(Map<String, View> map, View view) {
        if (view.getVisibility() == 0) {
            String strI = a.g.j.k.i(view);
            if (strI != null) {
                map.put(strI, view);
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    e(map, viewGroup.getChildAt(i));
                }
            }
        }
    }

    public void f(View view, Rect rect) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        rect.set(iArr[0], iArr[1], view.getWidth() + iArr[0], view.getHeight() + iArr[1]);
    }

    public abstract void h(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    public abstract void i(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3);

    public abstract void j(Object obj, View view, ArrayList<View> arrayList);
}
