package b.c.a.a.b.b;

import b.c.a.a.a.b;
import b.c.a.a.b.a;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class a implements b.c.a.a.b.a {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f1100a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1101b;

    /* renamed from: c, reason: collision with root package name */
    public final b f1102c;

    /* renamed from: d, reason: collision with root package name */
    public final a.EnumC0023a f1103d;

    /* renamed from: e, reason: collision with root package name */
    public final b.c.a.a.a.a f1104e;

    public a(String str, b bVar, String str2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        int i = 0;
        for (int i2 = 0; i2 < sb.length(); i2++) {
            if (!Character.isWhitespace(sb.charAt(i2))) {
                sb.setCharAt(i, sb.charAt(i2));
                i++;
            }
        }
        sb.delete(i, sb.length());
        if (sb.length() % 2 != 0) {
            throw new IllegalArgumentException(b.a.a.a.a.b("Hex binary needs to be even-length :", str));
        }
        int length = sb.length() / 2;
        byte[] bArr = new byte[length];
        int i3 = 0;
        int i4 = 0;
        while (i3 < sb.length()) {
            bArr[i4] = (byte) (Character.digit(sb.charAt(i3 + 1), 16) + (Character.digit(sb.charAt(i3), 16) << 4));
            i3 += 2;
            i4++;
        }
        if (length == 0) {
            throw new IllegalArgumentException("Param id cannot be empty");
        }
        this.f1100a = bArr;
        this.f1101b = str2;
        this.f1102c = bVar;
        this.f1104e = (bArr[0] & 32) != 0 ? b.c.a.a.a.a.CONSTRUCTED : b.c.a.a.a.a.PRIMITIVE;
        byte b2 = (byte) ((this.f1100a[0] >>> 6) & 3);
        this.f1103d = b2 != 1 ? b2 != 2 ? b2 != 3 ? a.EnumC0023a.UNIVERSAL : a.EnumC0023a.PRIVATE : a.EnumC0023a.CONTEXT_SPECIFIC : a.EnumC0023a.APPLICATION;
    }

    @Override // b.c.a.a.b.a
    public byte[] a() {
        return this.f1100a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof b.c.a.a.b.a)) {
            return false;
        }
        b.c.a.a.b.a aVar = (b.c.a.a.b.a) obj;
        if (this.f1100a.length != aVar.a().length) {
            return false;
        }
        return Arrays.equals(this.f1100a, aVar.a());
    }

    public int hashCode() {
        return Arrays.hashCode(this.f1100a) + 177;
    }

    public String toString() {
        String str;
        StringBuilder sbE = b.a.a.a.a.e("Tag[");
        byte[] bArr = this.f1100a;
        if (bArr != null && bArr.length > 0) {
            int length = (bArr.length - 0) * 3;
            char[] cArr = new char[length];
            int i = 0;
            int i2 = 0;
            while (i < bArr.length) {
                byte b2 = (byte) ((bArr[i] & 240) >> 4);
                cArr[i2] = (char) (b2 > 9 ? b2 + 55 : b2 + 48);
                byte b3 = (byte) (bArr[i] & 15);
                int i3 = i2 + 1;
                cArr[i3] = (char) (b3 > 9 ? b3 + 55 : b3 + 48);
                int i4 = i3 + 1;
                cArr[i4] = ' ';
                i++;
                i2 = i4 + 1;
            }
            str = new String(cArr, 0, length - 1);
        } else {
            str = "";
        }
        sbE.append(str);
        sbE.append("] Name=");
        sbE.append(this.f1101b);
        sbE.append(", TagType=");
        sbE.append(this.f1104e);
        sbE.append(", ValueType=");
        sbE.append(this.f1102c);
        sbE.append(", Class=");
        sbE.append(this.f1103d);
        return sbE.toString();
    }
}
