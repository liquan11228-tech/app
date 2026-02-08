package b.a.a.a;

/* compiled from: outline */
/* loaded from: classes.dex */
public class a {
    public static String a(String str, int i) {
        return str + i;
    }

    public static String b(String str, String str2) {
        return str + str2;
    }

    public static String c(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static String d(StringBuilder sb, String str, String str2) {
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    public static StringBuilder e(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        return sb;
    }
}
