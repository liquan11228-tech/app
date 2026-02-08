package c.m;

import java.nio.charset.Charset;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f1303a;

    /* renamed from: b, reason: collision with root package name */
    public static Charset f1304b;

    /* renamed from: c, reason: collision with root package name */
    public static Charset f1305c;

    /* renamed from: d, reason: collision with root package name */
    public static final a f1306d = null;

    static {
        Charset charsetForName = Charset.forName("UTF-8");
        c.j.b.d.c(charsetForName, "Charset.forName(\"UTF-8\")");
        f1303a = charsetForName;
        c.j.b.d.c(Charset.forName("UTF-16"), "Charset.forName(\"UTF-16\")");
        c.j.b.d.c(Charset.forName("UTF-16BE"), "Charset.forName(\"UTF-16BE\")");
        c.j.b.d.c(Charset.forName("UTF-16LE"), "Charset.forName(\"UTF-16LE\")");
        c.j.b.d.c(Charset.forName("US-ASCII"), "Charset.forName(\"US-ASCII\")");
        c.j.b.d.c(Charset.forName("ISO-8859-1"), "Charset.forName(\"ISO-8859-1\")");
    }
}
