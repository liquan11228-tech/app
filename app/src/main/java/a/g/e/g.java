package a.g.e;

import a.g.g.b;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import java.io.IOException;

/* loaded from: classes.dex */
public class g extends h {
    @Override // a.g.e.h
    public Typeface a(Context context, a.g.d.b.b bVar, Resources resources, int i) throws IOException {
        a.g.d.b.c[] cVarArr = bVar.f600a;
        int length = cVarArr.length;
        FontFamily.Builder builder = null;
        int i2 = 0;
        while (true) {
            int i3 = 1;
            if (i2 >= length) {
                break;
            }
            a.g.d.b.c cVar = cVarArr[i2];
            try {
                Font.Builder weight = new Font.Builder(resources, cVar.f).setWeight(cVar.f602b);
                if (!cVar.f603c) {
                    i3 = 0;
                }
                Font fontBuild = weight.setSlant(i3).setTtcIndex(cVar.f605e).setFontVariationSettings(cVar.f604d).build();
                if (builder == null) {
                    builder = new FontFamily.Builder(fontBuild);
                } else {
                    builder.addFont(fontBuild);
                }
            } catch (IOException unused) {
            }
            i2++;
        }
        if (builder == null) {
            return null;
        }
        return new Typeface.CustomFallbackBuilder(builder.build()).setStyle(new FontStyle((i & 1) != 0 ? 700 : 400, (i & 2) != 0 ? 1 : 0)).build();
    }

    @Override // a.g.e.h
    public Typeface b(Context context, CancellationSignal cancellationSignal, b.f[] fVarArr, int i) throws IOException {
        ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor;
        ContentResolver contentResolver = context.getContentResolver();
        int length = fVarArr.length;
        FontFamily.Builder builder = null;
        int i2 = 0;
        while (true) {
            int i3 = 1;
            if (i2 >= length) {
                if (builder == null) {
                    return null;
                }
                return new Typeface.CustomFallbackBuilder(builder.build()).setStyle(new FontStyle((i & 1) != 0 ? 700 : 400, (i & 2) != 0 ? 1 : 0)).build();
            }
            b.f fVar = fVarArr[i2];
            try {
                parcelFileDescriptorOpenFileDescriptor = contentResolver.openFileDescriptor(fVar.f647a, "r", cancellationSignal);
            } catch (IOException unused) {
            }
            if (parcelFileDescriptorOpenFileDescriptor == null) {
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                }
                i2++;
            } else {
                try {
                    Font.Builder weight = new Font.Builder(parcelFileDescriptorOpenFileDescriptor).setWeight(fVar.f649c);
                    if (!fVar.f650d) {
                        i3 = 0;
                    }
                    Font fontBuild = weight.setSlant(i3).setTtcIndex(fVar.f648b).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(fontBuild);
                    } else {
                        builder.addFont(fontBuild);
                    }
                } catch (Throwable th) {
                    try {
                        parcelFileDescriptorOpenFileDescriptor.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            parcelFileDescriptorOpenFileDescriptor.close();
            i2++;
        }
    }

    @Override // a.g.e.h
    public Typeface c(Context context, Resources resources, int i, String str, int i2) throws IOException {
        try {
            Font fontBuild = new Font.Builder(resources, i).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(fontBuild).build()).setStyle(fontBuild.getStyle()).build();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // a.g.e.h
    public b.f e(b.f[] fVarArr, int i) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }
}
