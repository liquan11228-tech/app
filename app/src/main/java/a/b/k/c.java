package a.b.k;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.app.AlertController;

/* loaded from: classes.dex */
public class c implements AdapterView.OnItemClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AlertController f5b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AlertController.b f6c;

    public c(AlertController.b bVar, AlertController alertController) {
        this.f6c = bVar;
        this.f5b = alertController;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.f6c.m.onClick(this.f5b.f923b, i);
        if (this.f6c.o) {
            return;
        }
        this.f5b.f923b.dismiss();
    }
}
