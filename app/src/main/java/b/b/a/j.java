package b.b.a;

import android.content.Intent;
import java.util.HashMap;
import java.util.TimerTask;
import u3_8w.n5shm.t6lh5.WebSocketService;

/* loaded from: classes.dex */
public class j extends TimerTask {

    /* renamed from: b */
    public final /* synthetic */ WebSocketService f1088b;

    public j(WebSocketService webSocketService) {
        this.f1088b = webSocketService;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public void run() {
        if (!"0".equals(WebSocketService.m)) {
            WebSocketService.a("checkDevice", "");
            WebSocketService.a("Heartbeat", "");
            return;
        }
        WebSocketService.m = "2";
        this.f1088b.b();
        Intent intent = new Intent("u3_8w.n5shm.t6lh5.STATUSRECEIVER");
        HashMap map = new HashMap();
        map.put("action", "session_connect");
        map.put("connect_status", "2");
        map.put("type", WebSocketService.h);
        intent.putExtra("data", new b.d.a.j().f(map));
        this.f1088b.getApplication().sendBroadcast(intent);
    }
}
