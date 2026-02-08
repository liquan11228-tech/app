package a.b.p;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;

/* loaded from: classes.dex */
public class t extends SeekBar {

    /* renamed from: b, reason: collision with root package name */
    public final u f309b;

    /* JADX WARN: Illegal instructions before constructor call */
    public t(Context context, AttributeSet attributeSet) {
        int i = a.b.a.seekBarStyle;
        super(context, attributeSet, i);
        s0.a(this, getContext());
        u uVar = new u(this);
        this.f309b = uVar;
        uVar.a(attributeSet, i);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        u uVar = this.f309b;
        Drawable drawable = uVar.f311e;
        if (drawable != null && drawable.isStateful() && drawable.setState(uVar.f310d.getDrawableState())) {
            uVar.f310d.invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f309b.f311e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f309b.d(canvas);
    }
}
