package b.b.a;

import android.content.Context;
import android.nfc.NfcAdapter;
import android.nfc.tech.IsoDep;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes.dex */
public class i {

    /* renamed from: a */
    public static String f1086a;

    /* renamed from: b */
    public static String f1087b;

    static {
        new b.c.a.a.b.b.a("4f", b.c.a.a.a.b.BINARY, "Application Identifier (AID) - card", "Identifies the application as described in ISO/IEC 7816-5");
        f1086a = "http://192.168.1.71:6666";
        f1087b = "ws://192.168.1.71:7777/websocket";
    }

    public static String a(IsoDep isoDep, String str) {
        return "";
    }

    public static boolean b(Context context) {
        NfcAdapter defaultAdapter = NfcAdapter.getDefaultAdapter(context);
        return defaultAdapter != null && defaultAdapter.isEnabled();
    }

    public static String c(String str) {
        try {
            byte[] bArrDigest = MessageDigest.getInstance("MD5").digest(str.getBytes());
            StringBuilder sb = new StringBuilder();
            for (byte b2 : bArrDigest) {
                String hexString = Integer.toHexString(b2 & 255);
                if (hexString.length() == 1) {
                    sb.append('0');
                }
                sb.append(hexString);
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException e2) {
            e2.printStackTrace();
            return null;
        }
    }
}
