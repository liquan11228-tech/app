package a.b.p;

import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public TextView f333a;

    /* renamed from: b, reason: collision with root package name */
    public TextClassifier f334b;

    public x(TextView textView) {
        this.f333a = textView;
    }

    public TextClassifier a() {
        TextClassifier textClassifier = this.f334b;
        if (textClassifier != null) {
            return textClassifier;
        }
        TextClassificationManager textClassificationManager = (TextClassificationManager) this.f333a.getContext().getSystemService(TextClassificationManager.class);
        return textClassificationManager != null ? textClassificationManager.getTextClassifier() : TextClassifier.NO_OP;
    }
}
