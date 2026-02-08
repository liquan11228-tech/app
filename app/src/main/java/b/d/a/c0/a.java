package b.d.a.c0;

import a.b.k.h;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final Type[] f1109a = new Type[0];

    /* renamed from: b.d.a.c0.a$a, reason: collision with other inner class name */
    public static final class C0025a implements GenericArrayType, Serializable {

        /* renamed from: b, reason: collision with root package name */
        public final Type f1110b;

        public C0025a(Type type) {
            this.f1110b = a.a(type);
        }

        public boolean equals(Object obj) {
            return (obj instanceof GenericArrayType) && a.c(this, (GenericArrayType) obj);
        }

        @Override // java.lang.reflect.GenericArrayType
        public Type getGenericComponentType() {
            return this.f1110b;
        }

        public int hashCode() {
            return this.f1110b.hashCode();
        }

        public String toString() {
            return a.i(this.f1110b) + "[]";
        }
    }

    public static final class b implements ParameterizedType, Serializable {

        /* renamed from: b, reason: collision with root package name */
        public final Type f1111b;

        /* renamed from: c, reason: collision with root package name */
        public final Type f1112c;

        /* renamed from: d, reason: collision with root package name */
        public final Type[] f1113d;

        public b(Type type, Type type2, Type... typeArr) {
            if (type2 instanceof Class) {
                Class cls = (Class) type2;
                boolean z = true;
                boolean z2 = Modifier.isStatic(cls.getModifiers()) || cls.getEnclosingClass() == null;
                if (type == null && !z2) {
                    z = false;
                }
                h.i.j(z);
            }
            this.f1111b = type == null ? null : a.a(type);
            this.f1112c = a.a(type2);
            Type[] typeArr2 = (Type[]) typeArr.clone();
            this.f1113d = typeArr2;
            int length = typeArr2.length;
            for (int i = 0; i < length; i++) {
                h.i.m(this.f1113d[i]);
                a.b(this.f1113d[i]);
                Type[] typeArr3 = this.f1113d;
                typeArr3[i] = a.a(typeArr3[i]);
            }
        }

        public boolean equals(Object obj) {
            return (obj instanceof ParameterizedType) && a.c(this, (ParameterizedType) obj);
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type[] getActualTypeArguments() {
            return (Type[]) this.f1113d.clone();
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getOwnerType() {
            return this.f1111b;
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getRawType() {
            return this.f1112c;
        }

        public int hashCode() {
            int iHashCode = Arrays.hashCode(this.f1113d) ^ this.f1112c.hashCode();
            Type type = this.f1111b;
            return iHashCode ^ (type != null ? type.hashCode() : 0);
        }

        public String toString() {
            int length = this.f1113d.length;
            if (length == 0) {
                return a.i(this.f1112c);
            }
            StringBuilder sb = new StringBuilder((length + 1) * 30);
            sb.append(a.i(this.f1112c));
            sb.append("<");
            sb.append(a.i(this.f1113d[0]));
            for (int i = 1; i < length; i++) {
                sb.append(", ");
                sb.append(a.i(this.f1113d[i]));
            }
            sb.append(">");
            return sb.toString();
        }
    }

    public static final class c implements WildcardType, Serializable {

        /* renamed from: b, reason: collision with root package name */
        public final Type f1114b;

        /* renamed from: c, reason: collision with root package name */
        public final Type f1115c;

        public c(Type[] typeArr, Type[] typeArr2) {
            h.i.j(typeArr2.length <= 1);
            h.i.j(typeArr.length == 1);
            if (typeArr2.length != 1) {
                h.i.m(typeArr[0]);
                a.b(typeArr[0]);
                this.f1115c = null;
                this.f1114b = a.a(typeArr[0]);
                return;
            }
            h.i.m(typeArr2[0]);
            a.b(typeArr2[0]);
            h.i.j(typeArr[0] == Object.class);
            this.f1115c = a.a(typeArr2[0]);
            this.f1114b = Object.class;
        }

        public boolean equals(Object obj) {
            return (obj instanceof WildcardType) && a.c(this, (WildcardType) obj);
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getLowerBounds() {
            Type type = this.f1115c;
            return type != null ? new Type[]{type} : a.f1109a;
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getUpperBounds() {
            return new Type[]{this.f1114b};
        }

        public int hashCode() {
            Type type = this.f1115c;
            return (type != null ? type.hashCode() + 31 : 1) ^ (this.f1114b.hashCode() + 31);
        }

        public String toString() {
            StringBuilder sbE;
            Type type;
            if (this.f1115c != null) {
                sbE = b.a.a.a.a.e("? super ");
                type = this.f1115c;
            } else {
                if (this.f1114b == Object.class) {
                    return "?";
                }
                sbE = b.a.a.a.a.e("? extends ");
                type = this.f1114b;
            }
            sbE.append(a.i(type));
            return sbE.toString();
        }
    }

    public static Type a(Type type) {
        if (type instanceof Class) {
            Class cls = (Class) type;
            return cls.isArray() ? new C0025a(a(cls.getComponentType())) : cls;
        }
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            return new b(parameterizedType.getOwnerType(), parameterizedType.getRawType(), parameterizedType.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            return new C0025a(((GenericArrayType) type).getGenericComponentType());
        }
        if (!(type instanceof WildcardType)) {
            return type;
        }
        WildcardType wildcardType = (WildcardType) type;
        return new c(wildcardType.getUpperBounds(), wildcardType.getLowerBounds());
    }

    public static void b(Type type) {
        h.i.j(((type instanceof Class) && ((Class) type).isPrimitive()) ? false : true);
    }

    public static boolean c(Type type, Type type2) {
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            return type.equals(type2);
        }
        if (type instanceof ParameterizedType) {
            if (!(type2 instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            ParameterizedType parameterizedType2 = (ParameterizedType) type2;
            Type ownerType = parameterizedType.getOwnerType();
            Type ownerType2 = parameterizedType2.getOwnerType();
            return (ownerType == ownerType2 || (ownerType != null && ownerType.equals(ownerType2))) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            if (type2 instanceof GenericArrayType) {
                return c(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
            }
            return false;
        }
        if (type instanceof WildcardType) {
            if (!(type2 instanceof WildcardType)) {
                return false;
            }
            WildcardType wildcardType = (WildcardType) type;
            WildcardType wildcardType2 = (WildcardType) type2;
            return Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) && Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds());
        }
        if (!(type instanceof TypeVariable) || !(type2 instanceof TypeVariable)) {
            return false;
        }
        TypeVariable typeVariable = (TypeVariable) type;
        TypeVariable typeVariable2 = (TypeVariable) type2;
        return typeVariable.getGenericDeclaration() == typeVariable2.getGenericDeclaration() && typeVariable.getName().equals(typeVariable2.getName());
    }

    public static Type d(Type type, Class<?> cls, Class<?> cls2) {
        if (cls2 == cls) {
            return type;
        }
        if (cls2.isInterface()) {
            Class<?>[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            for (int i = 0; i < length; i++) {
                if (interfaces[i] == cls2) {
                    return cls.getGenericInterfaces()[i];
                }
                if (cls2.isAssignableFrom(interfaces[i])) {
                    return d(cls.getGenericInterfaces()[i], interfaces[i], cls2);
                }
            }
        }
        if (!cls.isInterface()) {
            while (cls != Object.class) {
                Class<? super Object> superclass = cls.getSuperclass();
                if (superclass == cls2) {
                    return cls.getGenericSuperclass();
                }
                if (cls2.isAssignableFrom(superclass)) {
                    return d(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    public static Class<?> e(Type type) {
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            h.i.j(rawType instanceof Class);
            return (Class) rawType;
        }
        if (type instanceof GenericArrayType) {
            return Array.newInstance(e(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        }
        if (type instanceof TypeVariable) {
            return Object.class;
        }
        if (type instanceof WildcardType) {
            return e(((WildcardType) type).getUpperBounds()[0]);
        }
        throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + (type == null ? "null" : type.getClass().getName()));
    }

    public static Type f(Type type, Class<?> cls, Class<?> cls2) {
        if (type instanceof WildcardType) {
            type = ((WildcardType) type).getUpperBounds()[0];
        }
        h.i.j(cls2.isAssignableFrom(cls));
        return g(type, cls, d(type, cls, cls2));
    }

    public static Type g(Type type, Class<?> cls, Type type2) {
        return h(type, cls, type2, new HashSet());
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.reflect.Type h(java.lang.reflect.Type r8, java.lang.Class<?> r9, java.lang.reflect.Type r10, java.util.Collection<java.lang.reflect.TypeVariable> r11) {
        /*
            Method dump skipped, instructions count: 288
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: b.d.a.c0.a.h(java.lang.reflect.Type, java.lang.Class, java.lang.reflect.Type, java.util.Collection):java.lang.reflect.Type");
    }

    public static String i(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }
}
