package c.m;

import java.io.Serializable;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class c implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    public final Pattern f1315b;

    public c(String str) {
        c.j.b.d.d(str, "pattern");
        Pattern patternCompile = Pattern.compile(str);
        c.j.b.d.c(patternCompile, "Pattern.compile(pattern)");
        c.j.b.d.d(patternCompile, "nativePattern");
        this.f1315b = patternCompile;
    }

    public final boolean a(CharSequence charSequence) {
        c.j.b.d.d(charSequence, "input");
        return this.f1315b.matcher(charSequence).matches();
    }

    public String toString() {
        String string = this.f1315b.toString();
        c.j.b.d.c(string, "nativePattern.toString()");
        return string;
    }
}
