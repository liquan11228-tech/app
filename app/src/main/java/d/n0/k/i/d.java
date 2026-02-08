package d.n0.k.i;

import android.util.Log;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;

/* loaded from: classes.dex */
public final class d extends Handler {

    /* renamed from: a, reason: collision with root package name */
    public static final d f1652a = new d();

    @Override // java.util.logging.Handler
    public void close() {
    }

    @Override // java.util.logging.Handler
    public void flush() {
    }

    @Override // java.util.logging.Handler
    public void publish(LogRecord logRecord) {
        int iMin;
        c.j.b.d.d(logRecord, "record");
        c cVar = c.f1651c;
        String loggerName = logRecord.getLoggerName();
        c.j.b.d.c(loggerName, "record.loggerName");
        int i = logRecord.getLevel().intValue() > Level.INFO.intValue() ? 5 : logRecord.getLevel().intValue() == Level.INFO.intValue() ? 4 : 3;
        String message = logRecord.getMessage();
        c.j.b.d.c(message, "record.message");
        Throwable thrown = logRecord.getThrown();
        c.j.b.d.d(loggerName, "loggerName");
        c.j.b.d.d(message, "message");
        String strSubstring = c.f1650b.get(loggerName);
        if (strSubstring == null) {
            c.j.b.d.d(loggerName, "$this$take");
            int length = loggerName.length();
            strSubstring = loggerName.substring(0, 23 > length ? length : 23);
            c.j.b.d.c(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        }
        if (Log.isLoggable(strSubstring, i)) {
            if (thrown != null) {
                message = message + "\n" + Log.getStackTraceString(thrown);
            }
            int length2 = message.length();
            int i2 = 0;
            while (i2 < length2) {
                int iJ = c.m.e.j(message, '\n', i2, false, 4);
                if (iJ == -1) {
                    iJ = length2;
                }
                while (true) {
                    iMin = Math.min(iJ, i2 + 4000);
                    String strSubstring2 = message.substring(i2, iMin);
                    c.j.b.d.c(strSubstring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    Log.println(i, strSubstring, strSubstring2);
                    if (iMin >= iJ) {
                        break;
                    } else {
                        i2 = iMin;
                    }
                }
                i2 = iMin + 1;
            }
        }
    }
}
