package a.f.c;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes.dex */
public abstract class l extends c {
    public boolean i;
    public boolean j;

    @Override // a.f.c.c
    public void e(AttributeSet attributeSet) throws IllegalAccessException, Resources.NotFoundException, IllegalArgumentException {
        super.e(attributeSet);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, k.ConstraintLayout_Layout);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == k.ConstraintLayout_Layout_android_visibility) {
                    this.i = true;
                } else if (index == k.ConstraintLayout_Layout_android_elevation) {
                    this.j = true;
                }
            }
        }
    }

    public void j() {
    }

    @Override // a.f.c.c, android.view.View
    public void onAttachedToWindow() throws IllegalAccessException, Resources.NotFoundException, IllegalArgumentException {
        ViewParent parent;
        super.onAttachedToWindow();
        if ((this.i || this.j) && (parent = getParent()) != null && (parent instanceof ConstraintLayout)) {
            ConstraintLayout constraintLayout = (ConstraintLayout) parent;
            int visibility = getVisibility();
            float elevation = getElevation();
            for (int i = 0; i < this.f532c; i++) {
                View viewD = constraintLayout.d(this.f531b[i]);
                if (viewD != null) {
                    if (this.i) {
                        viewD.setVisibility(visibility);
                    }
                    if (this.j && elevation > 0.0f) {
                        viewD.setTranslationZ(viewD.getTranslationZ() + elevation);
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        c();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        c();
    }
}
