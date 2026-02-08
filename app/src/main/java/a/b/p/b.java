package a.b.p;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.ActionBarContainer;

/* loaded from: classes.dex */
public class b extends Drawable {

    /* renamed from: a */
    public final ActionBarContainer f198a;

    public b(ActionBarContainer actionBarContainer) {
        this.f198a = actionBarContainer;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        ActionBarContainer actionBarContainer = this.f198a;
        if (actionBarContainer.i) {
            Drawable drawable = actionBarContainer.h;
            if (drawable != null) {
                drawable.draw(canvas);
                return;
            }
            return;
        }
        Drawable drawable2 = actionBarContainer.f;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        ActionBarContainer actionBarContainer2 = this.f198a;
        Drawable drawable3 = actionBarContainer2.g;
        if (drawable3 == null || !actionBarContainer2.j) {
            return;
        }
        drawable3.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        Drawable drawable;
        ActionBarContainer actionBarContainer = this.f198a;
        if (actionBarContainer.i) {
            drawable = actionBarContainer.h;
            if (drawable == null) {
                return;
            }
        } else {
            drawable = actionBarContainer.f;
            if (drawable == null) {
                return;
            }
        }
        drawable.getOutline(outline);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}
