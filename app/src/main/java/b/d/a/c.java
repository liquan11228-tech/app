package b.d.a;

import java.lang.reflect.Field;
import java.util.Locale;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public abstract class c implements b.d.a.d {

    /* renamed from: b, reason: collision with root package name */
    public static final c f1105b = new a("IDENTITY", 0);

    /* renamed from: c, reason: collision with root package name */
    public static final c f1106c = new c("UPPER_CAMEL_CASE", 1) { // from class: b.d.a.c.b
        @Override // b.d.a.d
        public String a(Field field) {
            return c.c(field.getName());
        }
    };

    /* renamed from: d, reason: collision with root package name */
    public static final c f1107d = new c("UPPER_CAMEL_CASE_WITH_SPACES", 2) { // from class: b.d.a.c.c
        @Override // b.d.a.d
        public String a(Field field) {
            return c.c(c.b(field.getName(), " "));
        }
    };

    /* renamed from: e, reason: collision with root package name */
    public static final c f1108e = new c("LOWER_CASE_WITH_UNDERSCORES", 3) { // from class: b.d.a.c.d
        @Override // b.d.a.d
        public String a(Field field) {
            return c.b(field.getName(), "_").toLowerCase(Locale.ENGLISH);
        }
    };
    public static final c f = new c("LOWER_CASE_WITH_DASHES", 4) { // from class: b.d.a.c.e
        @Override // b.d.a.d
        public String a(Field field) {
            return c.b(field.getName(), "-").toLowerCase(Locale.ENGLISH);
        }
    };
    public static final c g;
    public static final /* synthetic */ c[] h;

    public enum a extends c {
        public a(String str, int i) {
            super(str, i, null);
        }

        @Override // b.d.a.d
        public String a(Field field) {
            return field.getName();
        }
    }

    static {
        c cVar = new c("LOWER_CASE_WITH_DOTS", 5) { // from class: b.d.a.c.f
            @Override // b.d.a.d
            public String a(Field field) {
                return c.b(field.getName(), ".").toLowerCase(Locale.ENGLISH);
            }
        };
        g = cVar;
        h = new c[]{f1105b, f1106c, f1107d, f1108e, f, cVar};
    }

    public c(String str, int i, a aVar) {
    }

    public static String b(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (Character.isUpperCase(cCharAt) && sb.length() != 0) {
                sb.append(str2);
            }
            sb.append(cCharAt);
        }
        return sb.toString();
    }

    public static String c(String str) {
        int length = str.length() - 1;
        int i = 0;
        while (!Character.isLetter(str.charAt(i)) && i < length) {
            i++;
        }
        char cCharAt = str.charAt(i);
        if (Character.isUpperCase(cCharAt)) {
            return str;
        }
        char upperCase = Character.toUpperCase(cCharAt);
        if (i == 0) {
            return upperCase + str.substring(1);
        }
        return str.substring(0, i) + upperCase + str.substring(i + 1);
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) h.clone();
    }
}
