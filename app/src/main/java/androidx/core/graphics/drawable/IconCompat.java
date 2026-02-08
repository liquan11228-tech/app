package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import androidx.versionedparcelable.CustomVersionedParcelable;
import b.a.a.a.a;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {
    public static final PorterDuff.Mode j = PorterDuff.Mode.SRC_IN;

    /* renamed from: b, reason: collision with root package name */
    public Object f1033b;

    /* renamed from: a, reason: collision with root package name */
    public int f1032a = -1;

    /* renamed from: c, reason: collision with root package name */
    public byte[] f1034c = null;

    /* renamed from: d, reason: collision with root package name */
    public Parcelable f1035d = null;

    /* renamed from: e, reason: collision with root package name */
    public int f1036e = 0;
    public int f = 0;
    public ColorStateList g = null;
    public PorterDuff.Mode h = j;
    public String i = null;

    public int a() {
        int i = this.f1032a;
        if (i == -1) {
            int i2 = Build.VERSION.SDK_INT;
            Icon icon = (Icon) this.f1033b;
            if (i2 >= 28) {
                return icon.getResId();
            }
            try {
                return ((Integer) icon.getClass().getMethod("getResId", new Class[0]).invoke(icon, new Object[0])).intValue();
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                return 0;
            }
        }
        if (i == 2) {
            return this.f1036e;
        }
        throw new IllegalStateException("called getResId() on " + this);
    }

    public String b() {
        int i = this.f1032a;
        if (i == -1) {
            int i2 = Build.VERSION.SDK_INT;
            Icon icon = (Icon) this.f1033b;
            if (i2 >= 28) {
                return icon.getResPackage();
            }
            try {
                return (String) icon.getClass().getMethod("getResPackage", new Class[0]).invoke(icon, new Object[0]);
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                return null;
            }
        }
        if (i == 2) {
            return ((String) this.f1033b).split(":", -1)[0];
        }
        throw new IllegalStateException("called getResPackage() on " + this);
    }

    public Uri c() {
        int i = this.f1032a;
        if (i == -1) {
            int i2 = Build.VERSION.SDK_INT;
            Icon icon = (Icon) this.f1033b;
            if (i2 >= 28) {
                return icon.getUri();
            }
            try {
                return (Uri) icon.getClass().getMethod("getUri", new Class[0]).invoke(icon, new Object[0]);
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                return null;
            }
        }
        if (i == 4 || i == 6) {
            return Uri.parse((String) this.f1033b);
        }
        throw new IllegalStateException("called getUri() on " + this);
    }

    @Deprecated
    public Icon d() {
        Icon iconCreateWithBitmap;
        switch (this.f1032a) {
            case -1:
                return (Icon) this.f1033b;
            case 0:
            default:
                throw new IllegalArgumentException("Unknown type");
            case 1:
                iconCreateWithBitmap = Icon.createWithBitmap((Bitmap) this.f1033b);
                break;
            case 2:
                iconCreateWithBitmap = Icon.createWithResource(b(), this.f1036e);
                break;
            case 3:
                iconCreateWithBitmap = Icon.createWithData((byte[]) this.f1033b, this.f1036e, this.f);
                break;
            case 4:
                iconCreateWithBitmap = Icon.createWithContentUri((String) this.f1033b);
                break;
            case 5:
                iconCreateWithBitmap = Icon.createWithAdaptiveBitmap((Bitmap) this.f1033b);
                break;
            case 6:
                StringBuilder sbE = a.e("Context is required to resolve the file uri of the icon: ");
                sbE.append(c());
                throw new IllegalArgumentException(sbE.toString());
        }
        ColorStateList colorStateList = this.g;
        if (colorStateList != null) {
            iconCreateWithBitmap.setTintList(colorStateList);
        }
        PorterDuff.Mode mode = this.h;
        if (mode == j) {
            return iconCreateWithBitmap;
        }
        iconCreateWithBitmap.setTintMode(mode);
        return iconCreateWithBitmap;
    }

    public String toString() {
        String str;
        int height;
        if (this.f1032a == -1) {
            return String.valueOf(this.f1033b);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        switch (this.f1032a) {
            case 1:
                str = "BITMAP";
                break;
            case 2:
                str = "RESOURCE";
                break;
            case 3:
                str = "DATA";
                break;
            case 4:
                str = "URI";
                break;
            case 5:
                str = "BITMAP_MASKABLE";
                break;
            case 6:
                str = "URI_MASKABLE";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        sb.append(str);
        switch (this.f1032a) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.f1033b).getWidth());
                sb.append("x");
                height = ((Bitmap) this.f1033b).getHeight();
                sb.append(height);
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(b());
                sb.append(" id=");
                sb.append(String.format("0x%08x", Integer.valueOf(a())));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.f1036e);
                if (this.f != 0) {
                    sb.append(" off=");
                    height = this.f;
                    sb.append(height);
                    break;
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.f1033b);
                break;
        }
        if (this.g != null) {
            sb.append(" tint=");
            sb.append(this.g);
        }
        if (this.h != j) {
            sb.append(" mode=");
            sb.append(this.h);
        }
        sb.append(")");
        return sb.toString();
    }
}
