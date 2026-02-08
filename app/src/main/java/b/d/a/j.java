package b.d.a;

import java.io.EOFException;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

/* loaded from: classes.dex */
public final class j {
    public static final b.d.a.d0.a<?> k = new b.d.a.d0.a<>(Object.class);

    /* renamed from: a */
    public final ThreadLocal<Map<b.d.a.d0.a<?>, a<?>>> f1240a;

    /* renamed from: b */
    public final Map<b.d.a.d0.a<?>, z<?>> f1241b;

    /* renamed from: c */
    public final b.d.a.c0.g f1242c;

    /* renamed from: d */
    public final b.d.a.c0.z.d f1243d;

    /* renamed from: e */
    public final List<a0> f1244e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;

    public static class a<T> extends z<T> {

        /* renamed from: a */
        public z<T> f1245a;

        @Override // b.d.a.z
        public T a(b.d.a.e0.a aVar) {
            z<T> zVar = this.f1245a;
            if (zVar != null) {
                return zVar.a(aVar);
            }
            throw new IllegalStateException();
        }

        @Override // b.d.a.z
        public void b(b.d.a.e0.c cVar, T t) {
            z<T> zVar = this.f1245a;
            if (zVar == null) {
                throw new IllegalStateException();
            }
            zVar.b(cVar, t);
        }
    }

    public j() {
        b.d.a.c0.o oVar = b.d.a.c0.o.g;
        c cVar = c.f1105b;
        Map mapEmptyMap = Collections.emptyMap();
        x xVar = x.f1250b;
        Collections.emptyList();
        Collections.emptyList();
        List listEmptyList = Collections.emptyList();
        this.f1240a = new ThreadLocal<>();
        this.f1241b = new ConcurrentHashMap();
        this.f1242c = new b.d.a.c0.g(mapEmptyMap);
        this.f = false;
        this.g = false;
        this.h = true;
        this.i = false;
        this.j = false;
        ArrayList arrayList = new ArrayList();
        arrayList.add(b.d.a.c0.z.o.Y);
        arrayList.add(b.d.a.c0.z.h.f1177b);
        arrayList.add(oVar);
        arrayList.addAll(listEmptyList);
        arrayList.add(b.d.a.c0.z.o.D);
        arrayList.add(b.d.a.c0.z.o.m);
        arrayList.add(b.d.a.c0.z.o.g);
        arrayList.add(b.d.a.c0.z.o.i);
        arrayList.add(b.d.a.c0.z.o.k);
        z gVar = xVar == x.f1250b ? b.d.a.c0.z.o.t : new g();
        arrayList.add(new b.d.a.c0.z.q(Long.TYPE, Long.class, gVar));
        arrayList.add(new b.d.a.c0.z.q(Double.TYPE, Double.class, new e(this)));
        arrayList.add(new b.d.a.c0.z.q(Float.TYPE, Float.class, new f(this)));
        arrayList.add(b.d.a.c0.z.o.x);
        arrayList.add(b.d.a.c0.z.o.o);
        arrayList.add(b.d.a.c0.z.o.q);
        arrayList.add(new b.d.a.c0.z.p(AtomicLong.class, new y(new h(gVar))));
        arrayList.add(new b.d.a.c0.z.p(AtomicLongArray.class, new y(new i(gVar))));
        arrayList.add(b.d.a.c0.z.o.s);
        arrayList.add(b.d.a.c0.z.o.z);
        arrayList.add(b.d.a.c0.z.o.F);
        arrayList.add(b.d.a.c0.z.o.H);
        arrayList.add(new b.d.a.c0.z.p(BigDecimal.class, b.d.a.c0.z.o.B));
        arrayList.add(new b.d.a.c0.z.p(BigInteger.class, b.d.a.c0.z.o.C));
        arrayList.add(b.d.a.c0.z.o.J);
        arrayList.add(b.d.a.c0.z.o.L);
        arrayList.add(b.d.a.c0.z.o.P);
        arrayList.add(b.d.a.c0.z.o.R);
        arrayList.add(b.d.a.c0.z.o.W);
        arrayList.add(b.d.a.c0.z.o.N);
        arrayList.add(b.d.a.c0.z.o.f1205d);
        arrayList.add(b.d.a.c0.z.c.f1168b);
        arrayList.add(b.d.a.c0.z.o.U);
        arrayList.add(b.d.a.c0.z.l.f1192b);
        arrayList.add(b.d.a.c0.z.k.f1190b);
        arrayList.add(b.d.a.c0.z.o.S);
        arrayList.add(b.d.a.c0.z.a.f1162c);
        arrayList.add(b.d.a.c0.z.o.f1203b);
        arrayList.add(new b.d.a.c0.z.b(this.f1242c));
        arrayList.add(new b.d.a.c0.z.g(this.f1242c, false));
        b.d.a.c0.z.d dVar = new b.d.a.c0.z.d(this.f1242c);
        this.f1243d = dVar;
        arrayList.add(dVar);
        arrayList.add(b.d.a.c0.z.o.Z);
        arrayList.add(new b.d.a.c0.z.j(this.f1242c, cVar, oVar, this.f1243d));
        this.f1244e = Collections.unmodifiableList(arrayList);
    }

    public static void a(double d2) {
        if (Double.isNaN(d2) || Double.isInfinite(d2)) {
            throw new IllegalArgumentException(d2 + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    /* JADX WARN: Finally extract failed */
    public <T> T b(String str, Class<T> cls) {
        Class cls2;
        T tA = null;
        if (str != null) {
            b.d.a.e0.a aVar = new b.d.a.e0.a(new StringReader(str));
            boolean z = this.j;
            aVar.f1227c = z;
            boolean z2 = true;
            aVar.f1227c = true;
            try {
                try {
                    try {
                        aVar.T();
                        z2 = false;
                        tA = c(new b.d.a.d0.a<>(cls)).a(aVar);
                    } catch (EOFException e2) {
                        if (!z2) {
                            throw new w(e2);
                        }
                    } catch (IllegalStateException e3) {
                        throw new w(e3);
                    }
                    aVar.f1227c = z;
                    if (tA != null) {
                        try {
                            if (aVar.T() != b.d.a.e0.b.END_DOCUMENT) {
                                throw new p("JSON document was not fully consumed.");
                            }
                        } catch (b.d.a.e0.d e4) {
                            throw new w(e4);
                        } catch (IOException e5) {
                            throw new p(e5);
                        }
                    }
                } catch (IOException e6) {
                    throw new w(e6);
                } catch (AssertionError e7) {
                    AssertionError assertionError = new AssertionError("AssertionError (GSON 2.8.6): " + e7.getMessage());
                    assertionError.initCause(e7);
                    throw assertionError;
                }
            } catch (Throwable th) {
                aVar.f1227c = z;
                throw th;
            }
        }
        if (cls == Integer.TYPE) {
            cls2 = Integer.class;
        } else if (cls == Float.TYPE) {
            cls2 = Float.class;
        } else if (cls == Byte.TYPE) {
            cls2 = Byte.class;
        } else if (cls == Double.TYPE) {
            cls2 = Double.class;
        } else if (cls == Long.TYPE) {
            cls2 = Long.class;
        } else if (cls == Character.TYPE) {
            cls2 = Character.class;
        } else if (cls == Boolean.TYPE) {
            cls2 = Boolean.class;
        } else if (cls == Short.TYPE) {
            cls2 = Short.class;
        } else {
            if (cls == Void.TYPE) {
                cls = (Class<T>) Void.class;
            }
            cls2 = cls;
        }
        return (T) cls2.cast(tA);
    }

    public <T> z<T> c(b.d.a.d0.a<T> aVar) {
        z<T> zVar = (z) this.f1241b.get(aVar);
        if (zVar != null) {
            return zVar;
        }
        Map<b.d.a.d0.a<?>, a<?>> map = this.f1240a.get();
        boolean z = false;
        if (map == null) {
            map = new HashMap<>();
            this.f1240a.set(map);
            z = true;
        }
        a<?> aVar2 = map.get(aVar);
        if (aVar2 != null) {
            return aVar2;
        }
        try {
            a<?> aVar3 = new a<>();
            map.put(aVar, aVar3);
            Iterator<a0> it = this.f1244e.iterator();
            while (it.hasNext()) {
                z<T> zVarA = it.next().a(this, aVar);
                if (zVarA != null) {
                    if (aVar3.f1245a != null) {
                        throw new AssertionError();
                    }
                    aVar3.f1245a = zVarA;
                    this.f1241b.put(aVar, zVarA);
                    return zVarA;
                }
            }
            throw new IllegalArgumentException("GSON (2.8.6) cannot handle " + aVar);
        } finally {
            map.remove(aVar);
            if (z) {
                this.f1240a.remove();
            }
        }
    }

    public <T> z<T> d(a0 a0Var, b.d.a.d0.a<T> aVar) {
        if (!this.f1244e.contains(a0Var)) {
            a0Var = this.f1243d;
        }
        boolean z = false;
        for (a0 a0Var2 : this.f1244e) {
            if (z) {
                z<T> zVarA = a0Var2.a(this, aVar);
                if (zVarA != null) {
                    return zVarA;
                }
            } else if (a0Var2 == a0Var) {
                z = true;
            }
        }
        throw new IllegalArgumentException("GSON cannot serialize " + aVar);
    }

    public b.d.a.e0.c e(Writer writer) throws IOException {
        if (this.g) {
            writer.write(")]}'\n");
        }
        b.d.a.e0.c cVar = new b.d.a.e0.c(writer);
        if (this.i) {
            cVar.f1237e = "  ";
            cVar.f = ": ";
        }
        cVar.j = this.f;
        return cVar;
    }

    public String f(Object obj) {
        Type type = obj.getClass();
        StringWriter stringWriter = new StringWriter();
        try {
            g(obj, type, e(stringWriter));
            return stringWriter.toString();
        } catch (IOException e2) {
            throw new p(e2);
        }
    }

    public void g(Object obj, Type type, b.d.a.e0.c cVar) {
        z zVarC = c(new b.d.a.d0.a(type));
        boolean z = cVar.g;
        cVar.g = true;
        boolean z2 = cVar.h;
        cVar.h = this.h;
        boolean z3 = cVar.j;
        cVar.j = this.f;
        try {
            try {
                zVarC.b(cVar, obj);
            } catch (IOException e2) {
                throw new p(e2);
            } catch (AssertionError e3) {
                AssertionError assertionError = new AssertionError("AssertionError (GSON 2.8.6): " + e3.getMessage());
                assertionError.initCause(e3);
                throw assertionError;
            }
        } finally {
            cVar.g = z;
            cVar.h = z2;
            cVar.j = z3;
        }
    }

    public String toString() {
        return "{serializeNulls:" + this.f + ",factories:" + this.f1244e + ",instanceCreators:" + this.f1242c + "}";
    }
}
