package a.f.c;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.SparseArray;
import android.util.Xml;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public SparseArray<a> f535a = new SparseArray<>();

    /* renamed from: b, reason: collision with root package name */
    public SparseArray<e> f536b = new SparseArray<>();

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public int f537a;

        /* renamed from: b, reason: collision with root package name */
        public ArrayList<b> f538b = new ArrayList<>();

        /* renamed from: c, reason: collision with root package name */
        public int f539c;

        /* renamed from: d, reason: collision with root package name */
        public e f540d;

        public a(Context context, XmlPullParser xmlPullParser) throws Resources.NotFoundException {
            this.f539c = -1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), k.State);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == k.State_android_id) {
                    this.f537a = typedArrayObtainStyledAttributes.getResourceId(index, this.f537a);
                } else if (index == k.State_constraints) {
                    this.f539c = typedArrayObtainStyledAttributes.getResourceId(index, this.f539c);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f539c);
                    context.getResources().getResourceName(this.f539c);
                    if ("layout".equals(resourceTypeName)) {
                        e eVar = new e();
                        this.f540d = eVar;
                        eVar.b(context, this.f539c);
                    }
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public float f541a;

        /* renamed from: b, reason: collision with root package name */
        public float f542b;

        /* renamed from: c, reason: collision with root package name */
        public float f543c;

        /* renamed from: d, reason: collision with root package name */
        public float f544d;

        /* renamed from: e, reason: collision with root package name */
        public int f545e;
        public e f;

        public b(Context context, XmlPullParser xmlPullParser) throws Resources.NotFoundException {
            this.f541a = Float.NaN;
            this.f542b = Float.NaN;
            this.f543c = Float.NaN;
            this.f544d = Float.NaN;
            this.f545e = -1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), k.Variant);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == k.Variant_constraints) {
                    this.f545e = typedArrayObtainStyledAttributes.getResourceId(index, this.f545e);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f545e);
                    context.getResources().getResourceName(this.f545e);
                    if ("layout".equals(resourceTypeName)) {
                        e eVar = new e();
                        this.f = eVar;
                        eVar.b(context, this.f545e);
                    }
                } else if (index == k.Variant_region_heightLessThan) {
                    this.f544d = typedArrayObtainStyledAttributes.getDimension(index, this.f544d);
                } else if (index == k.Variant_region_heightMoreThan) {
                    this.f542b = typedArrayObtainStyledAttributes.getDimension(index, this.f542b);
                } else if (index == k.Variant_region_widthLessThan) {
                    this.f543c = typedArrayObtainStyledAttributes.getDimension(index, this.f543c);
                } else if (index == k.Variant_region_widthMoreThan) {
                    this.f541a = typedArrayObtainStyledAttributes.getDimension(index, this.f541a);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public d(Context context, ConstraintLayout constraintLayout, int i) throws XmlPullParserException, Resources.NotFoundException, IOException, NumberFormatException {
        XmlResourceParser xml = context.getResources().getXml(i);
        a aVar = null;
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    char c2 = 65535;
                    switch (name.hashCode()) {
                        case -1349929691:
                            if (name.equals("ConstraintSet")) {
                                c2 = 4;
                                break;
                            }
                            break;
                        case 80204913:
                            if (name.equals("State")) {
                                c2 = 2;
                                break;
                            }
                            break;
                        case 1382829617:
                            if (name.equals("StateSet")) {
                                c2 = 1;
                                break;
                            }
                            break;
                        case 1657696882:
                            if (name.equals("layoutDescription")) {
                                c2 = 0;
                                break;
                            }
                            break;
                        case 1901439077:
                            if (name.equals("Variant")) {
                                c2 = 3;
                                break;
                            }
                            break;
                    }
                    if (c2 != 0 && c2 != 1) {
                        if (c2 == 2) {
                            aVar = new a(context, xml);
                            this.f535a.put(aVar.f537a, aVar);
                        } else if (c2 == 3) {
                            b bVar = new b(context, xml);
                            if (aVar != null) {
                                aVar.f538b.add(bVar);
                            }
                        } else if (c2 == 4) {
                            a(context, xml);
                        }
                    }
                }
            }
        } catch (IOException e2) {
            e2.printStackTrace();
        } catch (XmlPullParserException e3) {
            e3.printStackTrace();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:113:0x01ca, code lost:
    
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00df  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(android.content.Context r13, org.xmlpull.v1.XmlPullParser r14) throws org.xmlpull.v1.XmlPullParserException, java.lang.NumberFormatException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 538
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a.f.c.d.a(android.content.Context, org.xmlpull.v1.XmlPullParser):void");
    }
}
