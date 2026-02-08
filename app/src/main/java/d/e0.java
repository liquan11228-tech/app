package d;

import a.b.k.h;
import d.y;
import d.z;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class e0 {

    /* renamed from: a */
    public e f1350a;

    /* renamed from: b */
    public final z f1351b;

    /* renamed from: c */
    public final String f1352c;

    /* renamed from: d */
    public final y f1353d;

    /* renamed from: e */
    public final f0 f1354e;
    public final Map<Class<?>, Object> f;

    public static class a {

        /* renamed from: a */
        public z f1355a;

        /* renamed from: b */
        public String f1356b;

        /* renamed from: c */
        public y.a f1357c;

        /* renamed from: d */
        public f0 f1358d;

        /* renamed from: e */
        public Map<Class<?>, Object> f1359e;

        public a() {
            this.f1359e = new LinkedHashMap();
            this.f1356b = "GET";
            this.f1357c = new y.a();
        }

        public a(e0 e0Var) {
            LinkedHashMap linkedHashMap;
            c.j.b.d.d(e0Var, "request");
            this.f1359e = new LinkedHashMap();
            this.f1355a = e0Var.f1351b;
            this.f1356b = e0Var.f1352c;
            this.f1358d = e0Var.f1354e;
            if (e0Var.f.isEmpty()) {
                linkedHashMap = new LinkedHashMap();
            } else {
                Map<Class<?>, Object> map = e0Var.f;
                c.j.b.d.d(map, "$this$toMutableMap");
                linkedHashMap = new LinkedHashMap(map);
            }
            this.f1359e = linkedHashMap;
            this.f1357c = e0Var.f1353d.c();
        }

        public e0 a() {
            z zVar = this.f1355a;
            if (zVar != null) {
                return new e0(zVar, this.f1356b, this.f1357c.b(), this.f1358d, d.n0.c.E(this.f1359e));
            }
            throw new IllegalStateException("url == null".toString());
        }

        public a b(String str, String str2) {
            c.j.b.d.d(str, "name");
            c.j.b.d.d(str2, "value");
            this.f1357c.d(str, str2);
            return this;
        }

        public a c(String str, f0 f0Var) {
            c.j.b.d.d(str, "method");
            boolean z = true;
            if (!(str.length() > 0)) {
                throw new IllegalArgumentException("method.isEmpty() == true".toString());
            }
            if (f0Var == null) {
                c.j.b.d.d(str, "method");
                if (!c.j.b.d.a(str, "POST") && !c.j.b.d.a(str, "PUT") && !c.j.b.d.a(str, "PATCH") && !c.j.b.d.a(str, "PROPPATCH") && !c.j.b.d.a(str, "REPORT")) {
                    z = false;
                }
                if (!(!z)) {
                    throw new IllegalArgumentException(b.a.a.a.a.c("method ", str, " must have a request body.").toString());
                }
            } else if (!d.n0.h.f.a(str)) {
                throw new IllegalArgumentException(b.a.a.a.a.c("method ", str, " must not have a request body.").toString());
            }
            this.f1356b = str;
            this.f1358d = f0Var;
            return this;
        }

        public a d(String str) {
            c.j.b.d.d(str, "name");
            this.f1357c.c(str);
            return this;
        }

        public a e(String str) {
            StringBuilder sbE;
            int i;
            c.j.b.d.d(str, "url");
            if (!c.m.e.w(str, "ws:", true)) {
                if (c.m.e.w(str, "wss:", true)) {
                    sbE = b.a.a.a.a.e("https:");
                    i = 4;
                }
                c.j.b.d.d(str, "$this$toHttpUrl");
                z.a aVar = new z.a();
                aVar.d(null, str);
                f(aVar.a());
                return this;
            }
            sbE = b.a.a.a.a.e("http:");
            i = 3;
            String strSubstring = str.substring(i);
            c.j.b.d.c(strSubstring, "(this as java.lang.String).substring(startIndex)");
            sbE.append(strSubstring);
            str = sbE.toString();
            c.j.b.d.d(str, "$this$toHttpUrl");
            z.a aVar2 = new z.a();
            aVar2.d(null, str);
            f(aVar2.a());
            return this;
        }

        public a f(z zVar) {
            c.j.b.d.d(zVar, "url");
            this.f1355a = zVar;
            return this;
        }
    }

    public e0(z zVar, String str, y yVar, f0 f0Var, Map<Class<?>, ? extends Object> map) {
        c.j.b.d.d(zVar, "url");
        c.j.b.d.d(str, "method");
        c.j.b.d.d(yVar, "headers");
        c.j.b.d.d(map, "tags");
        this.f1351b = zVar;
        this.f1352c = str;
        this.f1353d = yVar;
        this.f1354e = f0Var;
        this.f = map;
    }

    public final e a() {
        e eVar = this.f1350a;
        if (eVar != null) {
            return eVar;
        }
        e eVarB = e.n.b(this.f1353d);
        this.f1350a = eVarB;
        return eVarB;
    }

    public final String b(String str) {
        c.j.b.d.d(str, "name");
        return this.f1353d.a(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String toString() {
        StringBuilder sbE = b.a.a.a.a.e("Request{method=");
        sbE.append(this.f1352c);
        sbE.append(", url=");
        sbE.append(this.f1351b);
        if (this.f1353d.size() != 0) {
            sbE.append(", headers=[");
            int i = 0;
            Iterator<c.b<? extends String, ? extends String>> it = this.f1353d.iterator();
            while (true) {
                c.j.b.a aVar = (c.j.b.a) it;
                if (!aVar.hasNext()) {
                    sbE.append(']');
                    break;
                }
                Object next = aVar.next();
                int i2 = i + 1;
                if (i < 0) {
                    h.i.X();
                    throw null;
                }
                c.b bVar = (c.b) next;
                String str = (String) bVar.f1254b;
                String str2 = (String) bVar.f1255c;
                if (i > 0) {
                    sbE.append(", ");
                }
                sbE.append(str);
                sbE.append(':');
                sbE.append(str2);
                i = i2;
            }
        }
        if (!this.f.isEmpty()) {
            sbE.append(", tags=");
            sbE.append(this.f);
        }
        sbE.append('}');
        String string = sbE.toString();
        c.j.b.d.c(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
