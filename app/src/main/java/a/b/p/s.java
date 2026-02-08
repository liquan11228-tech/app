package a.b.p;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;

/* loaded from: classes.dex */
public class s extends RatingBar {

    /* renamed from: b, reason: collision with root package name */
    public final q f303b;

    /* JADX WARN: Illegal instructions before constructor call */
    public s(Context context, AttributeSet attributeSet) {
        int i = a.b.a.ratingBarStyle;
        super(context, attributeSet, i);
        s0.a(this, getContext());
        q qVar = new q(this);
        this.f303b = qVar;
        qVar.a(attributeSet, i);
    }

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public synchronized void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Bitmap bitmap = this.f303b.f288b;
        if (bitmap != null) {
            setMeasuredDimension(View.resolveSizeAndState(bitmap.getWidth() * getNumStars(), i, 0), getMeasuredHeight());
        }
    }
}
