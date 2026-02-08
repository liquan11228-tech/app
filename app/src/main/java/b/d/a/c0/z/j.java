package b.d.a.c0.z;

import b.d.a.a0;
import b.d.a.c0.t;
import b.d.a.w;
import b.d.a.z;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class j implements a0 {

    /* renamed from: b */
    public final b.d.a.c0.g f1181b;

    /* renamed from: c */
    public final b.d.a.d f1182c;

    /* renamed from: d */
    public final b.d.a.c0.o f1183d;

    /* renamed from: e */
    public final d f1184e;
    public final b.d.a.c0.a0.b f = b.d.a.c0.a0.b.f1116a;

    public static final class a<T> extends z<T> {

        /* renamed from: a */
        public final t<T> f1185a;

        /* renamed from: b */
        public final Map<String, b> f1186b;

        public a(t<T> tVar, Map<String, b> map) {
            this.f1185a = tVar;
            this.f1186b = map;
        }

        @Override // b.d.a.z
        public T a(b.d.a.e0.a aVar) throws IllegalAccessException, IOException, IllegalArgumentException {
            if (aVar.T() == b.d.a.e0.b.NULL) {
                aVar.P();
                return null;
            }
            T tA = this.f1185a.a();
            try {
                aVar.z();
                while (aVar.G()) {
                    b bVar = this.f1186b.get(aVar.N());
                    if (bVar == null || !bVar.f1189c) {
                        aVar.Y();
                    } else {
                        i iVar = (i) bVar;
                        Object objA = iVar.f.a(aVar);
                        if (objA != null || !iVar.i) {
                            iVar.f1179d.set(tA, objA);
                        }
                    }
                }
                aVar.D();
                return tA;
            } catch (IllegalAccessException e2) {
                throw new AssertionError(e2);
            } catch (IllegalStateException e3) {
                throw new w(e3);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // b.d.a.z
        public void b(b.d.a.e0.c cVar, T t) throws IllegalAccessException, IOException, IllegalArgumentException {
            if (t == null) {
                cVar.G();
                return;
            }
            cVar.A();
            try {
                for (b bVar : this.f1186b.values()) {
                    i iVar = (i) bVar;
                    boolean z = false;
                    if (iVar.f1188b && iVar.f1179d.get(t) != t) {
                        z = true;
                    }
                    if (z) {
                        cVar.E(bVar.f1187a);
                        i iVar2 = (i) bVar;
                        (iVar2.f1180e ? iVar2.f : new n(iVar2.g, iVar2.f, iVar2.h.f1224b)).b(cVar, iVar2.f1179d.get(t));
                    }
                }
                cVar.D();
            } catch (IllegalAccessException e2) {
                throw new AssertionError(e2);
            }
        }
    }

    public static abstract class b {

        /* renamed from: a */
        public final String f1187a;

        /* renamed from: b */
        public final boolean f1188b;

        /* renamed from: c */
        public final boolean f1189c;

        public b(String str, boolean z, boolean z2) {
            this.f1187a = str;
            this.f1188b = z;
            this.f1189c = z2;
        }
    }

    public j(b.d.a.c0.g gVar, b.d.a.d dVar, b.d.a.c0.o oVar, d dVar2) {
        this.f1181b = gVar;
        this.f1182c = dVar;
        this.f1183d = oVar;
        this.f1184e = dVar2;
    }

    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.sameRegAndSVar(jadx.core.dex.instructions.args.InsnArg)" because "resultArg" is null
        	at jadx.core.dex.visitors.MoveInlineVisitor.processMove(MoveInlineVisitor.java:52)
        	at jadx.core.dex.visitors.MoveInlineVisitor.moveInline(MoveInlineVisitor.java:41)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:43)
        */
    @Override // b.d.a.a0
    public <T> b.d.a.z<T> a(
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r35v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:224)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:169)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:405)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:301)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(Unknown Source)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(Unknown Source)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Unknown Source)
        	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(Unknown Source)
        	at java.base/java.util.stream.AbstractPipeline.copyInto(Unknown Source)
        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(Unknown Source)
        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(Unknown Source)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(Unknown Source)
        	at java.base/java.util.stream.AbstractPipeline.evaluate(Unknown Source)
        	at java.base/java.util.stream.ReferencePipeline.forEach(Unknown Source)
        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:297)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:286)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:270)
        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:161)
        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:103)
        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
        	at jadx.core.ProcessClass.process(ProcessClass.java:79)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:401)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:389)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:339)
        */
    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.sameRegAndSVar(jadx.core.dex.instructions.args.InsnArg)" because "resultArg" is null
        	at jadx.core.dex.visitors.MoveInlineVisitor.processMove(MoveInlineVisitor.java:52)
        	at jadx.core.dex.visitors.MoveInlineVisitor.moveInline(MoveInlineVisitor.java:41)
        */

    public boolean b(Field field, boolean z) {
        boolean z2;
        b.d.a.c0.o oVar = this.f1183d;
        Class<?> type = field.getType();
        if (oVar.b(type) || oVar.c(type, z)) {
            return false;
        }
        if ((oVar.f1132c & field.getModifiers()) != 0 || ((oVar.f1131b != -1.0d && !oVar.f((b.d.a.b0.c) field.getAnnotation(b.d.a.b0.c.class), (b.d.a.b0.d) field.getAnnotation(b.d.a.b0.d.class))) || field.isSynthetic() || ((!oVar.f1133d && oVar.e(field.getType())) || oVar.d(field.getType())))) {
            z2 = true;
            break;
        }
        List<b.d.a.a> list = z ? oVar.f1134e : oVar.f;
        if (!list.isEmpty()) {
            b.d.a.b bVar = new b.d.a.b(field);
            Iterator<b.d.a.a> it = list.iterator();
            while (it.hasNext()) {
                if (it.next().b(bVar)) {
                    z2 = true;
                    break;
                }
            }
        }
        z2 = false;
        return !z2;
    }
}
