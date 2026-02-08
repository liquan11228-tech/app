package b.b.a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.TextView;
import java.util.Map;
import u3_8w.n5shm.t6lh5.WebSocketService;

/* loaded from: classes.dex */
public class h extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public TextView f1085a;

    public h(TextView textView) {
        this.f1085a = textView;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if ("u3_8w.n5shm.t6lh5.STATUSRECEIVER".equals(intent.getAction())) {
            Map map = (Map) new b.d.a.j().b(intent.getStringExtra("data"), Map.class);
            String str = (String) map.get("action");
            if ("connect_status".equals(str)) {
                String str2 = (String) map.get("connect_status");
                if ("0".equals(str2)) {
                    this.f1085a.setText("正在配对....");
                    this.f1085a.setTextColor(-65536);
                }
                if ("3".equals(str2)) {
                    this.f1085a.setText("Pairing failed, session expired");
                    this.f1085a.setTextColor(-65536);
                }
                if ("1".equals(str2)) {
                    String str3 = WebSocketService.k;
                    this.f1085a.setText("配对成功-请等待传卡");
                    this.f1085a.setTextColor(-16711936);
                }
            }
            if ("session_connect".equals(str)) {
                String str4 = (String) map.get("connect_status");
                if ("2".equals(str4)) {
                    this.f1085a.setText("Reconnecting");
                    this.f1085a.setTextColor(-65536);
                }
                if ("1".equals(str4)) {
                    this.f1085a.setText("connection succeeded");
                    this.f1085a.setTextColor(-16711936);
                }
                if ("0".equals(str4)) {
                    this.f1085a.setText("Connection failed");
                    this.f1085a.setTextColor(-65536);
                }
            }
        }
    }
}
