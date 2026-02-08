package a.o;

import android.os.Parcelable;
import android.text.TextUtils;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a */
    public final a.e.a<String, Method> f897a;

    /* renamed from: b */
    public final a.e.a<String, Method> f898b;

    /* renamed from: c */
    public final a.e.a<String, Class> f899c;

    public a(a.e.a<String, Method> aVar, a.e.a<String, Method> aVar2, a.e.a<String, Class> aVar3) {
        this.f897a = aVar;
        this.f898b = aVar2;
        this.f899c = aVar3;
    }

    public abstract void a();

    public abstract a b();

    public final Class c(Class<? extends c> cls) throws ClassNotFoundException {
        Class orDefault = this.f899c.getOrDefault(cls.getName(), null);
        if (orDefault != null) {
            return orDefault;
        }
        Class<?> cls2 = Class.forName(String.format("%s.%sParcelizer", cls.getPackage().getName(), cls.getSimpleName()), false, cls.getClassLoader());
        this.f899c.put(cls.getName(), cls2);
        return cls2;
    }

    public final Method d(String str) throws NoSuchMethodException, SecurityException {
        Method orDefault = this.f897a.getOrDefault(str, null);
        if (orDefault != null) {
            return orDefault;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, a.class.getClassLoader()).getDeclaredMethod("read", a.class);
        this.f897a.put(str, declaredMethod);
        return declaredMethod;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Method e(Class cls) throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        Method orDefault = this.f898b.getOrDefault(cls.getName(), null);
        if (orDefault != null) {
            return orDefault;
        }
        Class clsC = c(cls);
        System.currentTimeMillis();
        Method declaredMethod = clsC.getDeclaredMethod("write", cls, a.class);
        this.f898b.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    public boolean f(boolean z, int i) {
        return !h(i) ? z : ((b) this).f901e.readInt() != 0;
    }

    public CharSequence g(CharSequence charSequence, int i) {
        return !h(i) ? charSequence : (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((b) this).f901e);
    }

    public abstract boolean h(int i);

    public int i(int i, int i2) {
        return !h(i2) ? i : ((b) this).f901e.readInt();
    }

    public <T extends Parcelable> T j(T t, int i) {
        return !h(i) ? t : (T) ((b) this).f901e.readParcelable(b.class.getClassLoader());
    }

    public <T extends c> T k() {
        String string = ((b) this).f901e.readString();
        if (string == null) {
            return null;
        }
        try {
            return (T) d(string).invoke(null, b());
        } catch (ClassNotFoundException e2) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e2);
        } catch (IllegalAccessException e3) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e3);
        } catch (NoSuchMethodException e4) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e4);
        } catch (InvocationTargetException e5) {
            if (e5.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e5.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e5);
        }
    }

    public abstract void l(int i);

    public void m(int i, int i2) {
        l(i2);
        ((b) this).f901e.writeInt(i);
    }

    public void n(Parcelable parcelable, int i) {
        l(i);
        ((b) this).f901e.writeParcelable(parcelable, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void o(c cVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (cVar == null) {
            ((b) this).f901e.writeString(null);
            return;
        }
        try {
            ((b) this).f901e.writeString(c(cVar.getClass()).getName());
            a aVarB = b();
            try {
                e(cVar.getClass()).invoke(null, cVar, aVarB);
                aVarB.a();
            } catch (ClassNotFoundException e2) {
                throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e2);
            } catch (IllegalAccessException e3) {
                throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e3);
            } catch (NoSuchMethodException e4) {
                throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e4);
            } catch (InvocationTargetException e5) {
                if (!(e5.getCause() instanceof RuntimeException)) {
                    throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e5);
                }
                throw ((RuntimeException) e5.getCause());
            }
        } catch (ClassNotFoundException e6) {
            throw new RuntimeException(cVar.getClass().getSimpleName() + " does not have a Parcelizer", e6);
        }
    }
}
