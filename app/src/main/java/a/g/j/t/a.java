package a.g.j.t;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* loaded from: classes.dex */
public final class a extends ClickableSpan {

    /* renamed from: b */
    public final int f726b;

    /* renamed from: c */
    public final b f727c;

    /* renamed from: d */
    public final int f728d;

    public a(int i, b bVar, int i2) {
        this.f726b = i;
        this.f727c = bVar;
        this.f728d = i2;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f726b);
        b bVar = this.f727c;
        bVar.f729a.performAction(this.f728d, bundle);
    }
}
