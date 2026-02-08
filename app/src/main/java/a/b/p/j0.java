package a.b.p;

import android.view.View;
import android.widget.AdapterView;

/* loaded from: classes.dex */
public class j0 implements AdapterView.OnItemSelectedListener {

    /* renamed from: b */
    public final /* synthetic */ k0 f254b;

    public j0(k0 k0Var) {
        this.f254b = k0Var;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        f0 f0Var;
        if (i == -1 || (f0Var = this.f254b.f260d) == null) {
            return;
        }
        f0Var.setListSelectionHidden(false);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(AdapterView<?> adapterView) {
    }
}
