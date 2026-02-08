package a.j.a;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public class b0 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f771b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Map f772c;

    public b0(d0 d0Var, ArrayList arrayList, Map map) {
        this.f771b = arrayList;
        this.f772c = map;
    }

    @Override // java.lang.Runnable
    public void run() {
        String str;
        int size = this.f771b.size();
        for (int i = 0; i < size; i++) {
            View view = (View) this.f771b.get(i);
            String strI = a.g.j.k.i(view);
            if (strI != null) {
                Iterator it = this.f772c.entrySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        str = null;
                        break;
                    }
                    Map.Entry entry = (Map.Entry) it.next();
                    if (strI.equals(entry.getValue())) {
                        str = (String) entry.getKey();
                        break;
                    }
                }
                view.setTransitionName(str);
            }
        }
    }
}
