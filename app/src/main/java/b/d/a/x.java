package b.d.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public abstract class x {

    /* renamed from: b, reason: collision with root package name */
    public static final x f1250b = new a("DEFAULT", 0);

    /* renamed from: c, reason: collision with root package name */
    public static final x f1251c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ x[] f1252d;

    public enum a extends x {
        public a(String str, int i) {
            super(str, i, null);
        }
    }

    static {
        x xVar = new x("STRING", 1) { // from class: b.d.a.x.b
        };
        f1251c = xVar;
        f1252d = new x[]{f1250b, xVar};
    }

    public x(String str, int i, a aVar) {
    }

    public static x valueOf(String str) {
        return (x) Enum.valueOf(x.class, str);
    }

    public static x[] values() {
        return (x[]) f1252d.clone();
    }
}
