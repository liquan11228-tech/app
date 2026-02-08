package b.b.a;

import java.util.TimerTask;
import u3_8w.n5shm.t6lh5.CardLoadingActivity;
import u3_8w.n5shm.t6lh5.WebSocketService;

/* loaded from: classes.dex */
public class b extends TimerTask {
    public b(CardLoadingActivity cardLoadingActivity) {
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public void run() {
        while (true) {
            if (!CardLoadingActivity.y.isEmpty()) {
                try {
                    WebSocketService.a("execute", CardLoadingActivity.y.take());
                } catch (InterruptedException e2) {
                    throw new RuntimeException(e2);
                }
            }
        }
    }
}
