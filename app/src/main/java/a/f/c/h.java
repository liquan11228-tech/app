package a.f.c;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes.dex */
public class h extends View {
    public h(Context context) {
        super(context);
        super.setVisibility(8);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setGuidelineBegin(int i) {
        ConstraintLayout.a aVar = (ConstraintLayout.a) getLayoutParams();
        aVar.f1016a = i;
        setLayoutParams(aVar);
    }

    public void setGuidelineEnd(int i) {
        ConstraintLayout.a aVar = (ConstraintLayout.a) getLayoutParams();
        aVar.f1017b = i;
        setLayoutParams(aVar);
    }

    public void setGuidelinePercent(float f) {
        ConstraintLayout.a aVar = (ConstraintLayout.a) getLayoutParams();
        aVar.f1018c = f;
        setLayoutParams(aVar);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
    }
}
