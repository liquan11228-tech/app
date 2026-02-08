package e;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class y extends b {
    public final Socket l;

    public y(Socket socket) {
        c.j.b.d.d(socket, "socket");
        this.l = socket;
    }

    @Override // e.b
    public IOException k(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e.b
    public void l() throws IOException {
        Level level;
        StringBuilder sb;
        Logger logger;
        Exception exc;
        try {
            this.l.close();
        } catch (AssertionError e2) {
            if (!p.a(e2)) {
                throw e2;
            }
            Logger logger2 = p.f1786a;
            level = Level.WARNING;
            sb = new StringBuilder();
            exc = e2;
            logger = logger2;
            sb.append("Failed to close timed out socket ");
            sb.append(this.l);
            logger.log(level, sb.toString(), (Throwable) exc);
        } catch (Exception e3) {
            Logger logger3 = p.f1786a;
            level = Level.WARNING;
            sb = new StringBuilder();
            exc = e3;
            logger = logger3;
            sb.append("Failed to close timed out socket ");
            sb.append(this.l);
            logger.log(level, sb.toString(), (Throwable) exc);
        }
    }
}
