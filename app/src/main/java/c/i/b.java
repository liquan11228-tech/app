package c.i;

import c.j.b.d;
import c.m.e;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final a f1278a;

    static {
        a aVar;
        String property = System.getProperty("java.specification.version");
        int i = 65542;
        if (property != null) {
            int iJ = e.j(property, '.', 0, false, 6);
            try {
                if (iJ < 0) {
                    i = Integer.parseInt(property) * 65536;
                } else {
                    int i2 = iJ + 1;
                    int iJ2 = e.j(property, '.', i2, false, 4);
                    if (iJ2 < 0) {
                        iJ2 = property.length();
                    }
                    String strSubstring = property.substring(0, iJ);
                    d.c(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    String strSubstring2 = property.substring(i2, iJ2);
                    d.c(strSubstring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    i = (Integer.parseInt(strSubstring) * 65536) + Integer.parseInt(strSubstring2);
                }
            } catch (NumberFormatException unused) {
            }
        }
        if (i >= 65544) {
            try {
                Object objNewInstance = Class.forName("kotlin.internal.jdk8.JDK8PlatformImplementations").newInstance();
                d.c(objNewInstance, "Class.forName(\"kotlin.in…entations\").newInstance()");
                try {
                    try {
                        aVar = (a) objNewInstance;
                    } catch (ClassNotFoundException unused2) {
                    }
                } catch (ClassCastException e2) {
                    Throwable thInitCause = new ClassCastException("Instance classloader: " + objNewInstance.getClass().getClassLoader() + ", base type classloader: " + a.class.getClassLoader()).initCause(e2);
                    d.c(thInitCause, "ClassCastException(\"Inst…baseTypeCL\").initCause(e)");
                    throw thInitCause;
                }
            } catch (ClassNotFoundException unused3) {
                Object objNewInstance2 = Class.forName("kotlin.internal.JRE8PlatformImplementations").newInstance();
                d.c(objNewInstance2, "Class.forName(\"kotlin.in…entations\").newInstance()");
                try {
                    aVar = (a) objNewInstance2;
                } catch (ClassCastException e3) {
                    Throwable thInitCause2 = new ClassCastException("Instance classloader: " + objNewInstance2.getClass().getClassLoader() + ", base type classloader: " + a.class.getClassLoader()).initCause(e3);
                    d.c(thInitCause2, "ClassCastException(\"Inst…baseTypeCL\").initCause(e)");
                    throw thInitCause2;
                }
            }
        } else if (i >= 65543) {
            try {
                try {
                    Object objNewInstance3 = Class.forName("kotlin.internal.jdk7.JDK7PlatformImplementations").newInstance();
                    d.c(objNewInstance3, "Class.forName(\"kotlin.in…entations\").newInstance()");
                    try {
                        aVar = (a) objNewInstance3;
                    } catch (ClassCastException e4) {
                        Throwable thInitCause3 = new ClassCastException("Instance classloader: " + objNewInstance3.getClass().getClassLoader() + ", base type classloader: " + a.class.getClassLoader()).initCause(e4);
                        d.c(thInitCause3, "ClassCastException(\"Inst…baseTypeCL\").initCause(e)");
                        throw thInitCause3;
                    }
                } catch (ClassNotFoundException unused4) {
                    Object objNewInstance4 = Class.forName("kotlin.internal.JRE7PlatformImplementations").newInstance();
                    d.c(objNewInstance4, "Class.forName(\"kotlin.in…entations\").newInstance()");
                    try {
                        aVar = (a) objNewInstance4;
                    } catch (ClassCastException e5) {
                        Throwable thInitCause4 = new ClassCastException("Instance classloader: " + objNewInstance4.getClass().getClassLoader() + ", base type classloader: " + a.class.getClassLoader()).initCause(e5);
                        d.c(thInitCause4, "ClassCastException(\"Inst…baseTypeCL\").initCause(e)");
                        throw thInitCause4;
                    }
                }
            } catch (ClassNotFoundException unused5) {
            }
        } else {
            aVar = new a();
        }
        f1278a = aVar;
    }
}
