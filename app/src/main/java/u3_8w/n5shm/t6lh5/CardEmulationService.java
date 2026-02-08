package u3_8w.n5shm.t6lh5;

import android.nfc.cardemulation.HostApduService;

/* loaded from: classes.dex */
public class CardEmulationService extends HostApduService {
    static {
        a("9000");
        a("0000");
    }

    public static byte[] a(String str) {
        int length = str.length();
        if (length % 2 == 1) {
            throw new IllegalArgumentException("Hex string must have even number of characters");
        }
        byte[] bArr = new byte[length / 2];
        for (int i = 0; i < length; i += 2) {
            bArr[i / 2] = (byte) (Character.digit(str.charAt(i + 1), 16) + (Character.digit(str.charAt(i), 16) << 4));
        }
        return bArr;
    }

    @Override // android.nfc.cardemulation.HostApduService
    public void onDeactivated(int i) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0078, code lost:
    
        r6 = r0.toLowerCase();
        java.lang.System.out.println("接收数据:" + r6);
     */
    @Override // android.nfc.cardemulation.HostApduService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public byte[] processCommandApdu(byte[] r6, android.os.Bundle r7) throws java.lang.InterruptedException {
        /*
            r5 = this;
            r7 = 16
            char[] r7 = new char[r7]
            r7 = {x00ac: FILL_ARRAY_DATA , data: [48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70} // fill-array
            int r0 = r6.length
            int r0 = r0 * 2
            char[] r0 = new char[r0]
            r1 = 0
        Ld:
            int r2 = r6.length
            if (r1 >= r2) goto L27
            r2 = r6[r1]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r3 = r1 * 2
            int r4 = r2 >>> 4
            char r4 = r7[r4]
            r0[r3] = r4
            int r3 = r3 + 1
            r2 = r2 & 15
            char r2 = r7[r2]
            r0[r3] = r2
            int r1 = r1 + 1
            goto Ld
        L27:
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0)
            java.io.PrintStream r7 = java.lang.System.out
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "发送指令:"
            r0.append(r1)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            r7.println(r0)
            java.util.concurrent.BlockingQueue<java.lang.String> r7 = u3_8w.n5shm.t6lh5.CardLoadingActivity.z
            r7.clear()
            java.util.concurrent.BlockingQueue<java.lang.String> r7 = u3_8w.n5shm.t6lh5.CardLoadingActivity.y
            r7.offer(r6)
            long r6 = java.lang.System.currentTimeMillis()
            java.util.concurrent.BlockingQueue<java.lang.String> r0 = u3_8w.n5shm.t6lh5.CardLoadingActivity.z
            if (r0 == 0) goto La4
        L54:
            long r0 = java.lang.System.currentTimeMillis()
            long r0 = r0 - r6
            r2 = 5000(0x1388, double:2.4703E-320)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L62
            java.lang.String r6 = "FFF2"
            goto L92
        L62:
            java.util.concurrent.BlockingQueue<java.lang.String> r0 = u3_8w.n5shm.t6lh5.CardLoadingActivity.z
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L54
            java.util.concurrent.BlockingQueue<java.lang.String> r0 = u3_8w.n5shm.t6lh5.CardLoadingActivity.z     // Catch: java.lang.InterruptedException -> L9d
            java.lang.Object r0 = r0.take()     // Catch: java.lang.InterruptedException -> L9d
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.InterruptedException -> L9d
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.InterruptedException -> L9d
            if (r1 != 0) goto L54
            java.lang.String r6 = r0.toLowerCase()     // Catch: java.lang.InterruptedException -> L9d
            java.io.PrintStream r7 = java.lang.System.out     // Catch: java.lang.InterruptedException -> L9d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.InterruptedException -> L9d
            r0.<init>()     // Catch: java.lang.InterruptedException -> L9d
            java.lang.String r1 = "接收数据:"
            r0.append(r1)     // Catch: java.lang.InterruptedException -> L9d
            r0.append(r6)     // Catch: java.lang.InterruptedException -> L9d
            java.lang.String r0 = r0.toString()     // Catch: java.lang.InterruptedException -> L9d
            r7.println(r0)     // Catch: java.lang.InterruptedException -> L9d
        L92:
            boolean r7 = android.text.TextUtils.isEmpty(r6)
            if (r7 != 0) goto La4
            byte[] r6 = a(r6)
            return r6
        L9d:
            r6 = move-exception
            java.lang.RuntimeException r7 = new java.lang.RuntimeException
            r7.<init>(r6)
            throw r7
        La4:
            java.lang.String r6 = "FFF1"
            byte[] r6 = a(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: u3_8w.n5shm.t6lh5.CardEmulationService.processCommandApdu(byte[], android.os.Bundle):byte[]");
    }
}
