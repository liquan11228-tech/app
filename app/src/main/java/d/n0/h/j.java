package d.n0.h;

import d.d0;
import java.net.ProtocolException;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final d0 f1510a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1511b;

    /* renamed from: c, reason: collision with root package name */
    public final String f1512c;

    public j(d0 d0Var, int i, String str) {
        c.j.b.d.d(d0Var, "protocol");
        c.j.b.d.d(str, "message");
        this.f1510a = d0Var;
        this.f1511b = i;
        this.f1512c = str;
    }

    public static final j a(String str) throws ProtocolException, NumberFormatException {
        String strSubstring;
        d0 d0Var = d0.HTTP_1_0;
        c.j.b.d.d(str, "statusLine");
        int i = 9;
        if (c.m.e.z(str, "HTTP/1.", false, 2)) {
            if (str.length() < 9 || str.charAt(8) != ' ') {
                throw new ProtocolException(b.a.a.a.a.b("Unexpected status line: ", str));
            }
            int iCharAt = str.charAt(7) - '0';
            if (iCharAt != 0) {
                if (iCharAt != 1) {
                    throw new ProtocolException(b.a.a.a.a.b("Unexpected status line: ", str));
                }
                d0Var = d0.HTTP_1_1;
            }
        } else {
            if (!c.m.e.z(str, "ICY ", false, 2)) {
                throw new ProtocolException(b.a.a.a.a.b("Unexpected status line: ", str));
            }
            i = 4;
        }
        int i2 = i + 3;
        if (str.length() < i2) {
            throw new ProtocolException(b.a.a.a.a.b("Unexpected status line: ", str));
        }
        try {
            String strSubstring2 = str.substring(i, i2);
            c.j.b.d.c(strSubstring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            int i3 = Integer.parseInt(strSubstring2);
            if (str.length() <= i2) {
                strSubstring = "";
            } else {
                if (str.charAt(i2) != ' ') {
                    throw new ProtocolException(b.a.a.a.a.b("Unexpected status line: ", str));
                }
                strSubstring = str.substring(i + 4);
                c.j.b.d.c(strSubstring, "(this as java.lang.String).substring(startIndex)");
            }
            return new j(d0Var, i3, strSubstring);
        } catch (NumberFormatException unused) {
            throw new ProtocolException(b.a.a.a.a.b("Unexpected status line: ", str));
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f1510a == d0.HTTP_1_0 ? "HTTP/1.0" : "HTTP/1.1");
        sb.append(' ');
        sb.append(this.f1511b);
        sb.append(' ');
        sb.append(this.f1512c);
        String string = sb.toString();
        c.j.b.d.c(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
