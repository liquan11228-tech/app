package e;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final /* synthetic */ class p {

    /* renamed from: a, reason: collision with root package name */
    public static final Logger f1786a = Logger.getLogger("okio.Okio");

    public static final boolean a(AssertionError assertionError) {
        c.j.b.d.d(assertionError, "$this$isAndroidGetsocknameError");
        if (assertionError.getCause() == null) {
            return false;
        }
        String message = assertionError.getMessage();
        return message != null ? c.m.e.b(message, "getsockname failed", false, 2) : false;
    }

    public static final x b(Socket socket) throws IOException {
        c.j.b.d.d(socket, "$this$sink");
        y yVar = new y(socket);
        OutputStream outputStream = socket.getOutputStream();
        c.j.b.d.c(outputStream, "getOutputStream()");
        r rVar = new r(outputStream, yVar);
        c.j.b.d.d(rVar, "sink");
        return new c(yVar, rVar);
    }

    public static final z c(InputStream inputStream) {
        c.j.b.d.d(inputStream, "$this$source");
        return new o(inputStream, new a0());
    }

    public static final z d(Socket socket) throws IOException {
        c.j.b.d.d(socket, "$this$source");
        y yVar = new y(socket);
        InputStream inputStream = socket.getInputStream();
        c.j.b.d.c(inputStream, "getInputStream()");
        o oVar = new o(inputStream, yVar);
        c.j.b.d.d(oVar, "source");
        return new d(yVar, oVar);
    }
}
