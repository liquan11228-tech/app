package b.b.a;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.nfc.cardemulation.CardEmulation;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import u3_8w.n5shm.t6lh5.R;
import u3_8w.n5shm.t6lh5.WebSocketService;

/* loaded from: classes.dex */
public class e extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public CardView f1075a;

    /* renamed from: b, reason: collision with root package name */
    public TextView f1076b;

    /* renamed from: c, reason: collision with root package name */
    public TextView f1077c;

    /* renamed from: d, reason: collision with root package name */
    public CardEmulation f1078d;

    /* renamed from: e, reason: collision with root package name */
    public ComponentName f1079e;
    public ImageView f;

    public e(CardView cardView, TextView textView, TextView textView2, CardEmulation cardEmulation, ComponentName componentName, ImageView imageView) {
        this.f1075a = cardView;
        this.f1076b = textView;
        this.f1077c = textView2;
        this.f1078d = cardEmulation;
        this.f1079e = componentName;
        this.f = imageView;
    }

    public void a(Context context) throws Resources.NotFoundException {
        Map<String, String> map = WebSocketService.l;
        if (map != null) {
            map.get("cardNum");
            String str = WebSocketService.l.get("type");
            String strSubstring = WebSocketService.l.get("aids");
            this.f1075a.setVisibility(0);
            String strReplace = strSubstring.replace(",", "\n");
            Drawable drawable = strSubstring.contains("A0000000031010") ? context.getResources().getDrawable(R.drawable.visa) : null;
            if (strSubstring.contains("A0000001524010") || strSubstring.contains("A000000152401006") || strSubstring.contains("A0000003241010") || strSubstring.contains("A00000015230100100000001") || strSubstring.contains("A0000001523010010000000106")) {
                drawable = context.getResources().getDrawable(R.drawable.discover);
            }
            if (strSubstring.contains("A0000000041010") || strSubstring.contains("A0000000042203")) {
                drawable = context.getResources().getDrawable(R.drawable.mastercard);
            }
            if (strSubstring.contains("A000000025010901") || strSubstring.contains("A000000025021001") || strSubstring.contains("A00000002502100104") || strSubstring.contains("A000000025011001") || strSubstring.contains("A00000002501100104")) {
                drawable = context.getResources().getDrawable(R.drawable.american);
            }
            if (drawable != null) {
                this.f.setImageDrawable(drawable);
            } else {
                this.f1075a.setCardBackgroundColor(-16777216);
            }
            this.f1076b.setText(strReplace);
            this.f1076b.setTextSize(13.0f);
            this.f1076b.setTextColor(-1);
            this.f1077c.setText(str);
            if (strSubstring.indexOf(",") > 0 && strSubstring.indexOf(",") == strSubstring.length() - 1) {
                strSubstring = strSubstring.substring(0, strSubstring.length() - 1);
            }
            String[] strArrSplit = strSubstring.split(",");
            ArrayList arrayList = new ArrayList();
            arrayList.add("325041592E5359532E4444463031");
            PrintStream printStream = System.out;
            StringBuilder sbE = b.a.a.a.a.e("aid size");
            sbE.append(strArrSplit.length);
            printStream.println(sbE.toString());
            Collections.addAll(arrayList, strArrSplit);
            this.f1078d.registerAidsForService(this.f1079e, "payment", arrayList);
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        System.out.println("接收到广播通知了....");
        if ("u3_8w.n5shm.t6lh5.MYRECEIVER".equals(intent.getAction())) {
            try {
                String stringExtra = intent.getStringExtra("data");
                if (!TextUtils.isEmpty(stringExtra)) {
                    Map map = (Map) new b.d.a.j().b(stringExtra, Map.class);
                    String str = (String) map.get("action");
                    System.out.println("获取到action 操作:" + str);
                    if (map.get("action") == null) {
                        WebSocketService.l = (Map) new b.d.a.j().b(stringExtra, Map.class);
                        a(context);
                    } else if ("nfc_closed".equals(str)) {
                        this.f.setImageDrawable(null);
                        this.f1075a.setCardBackgroundColor(0);
                    }
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }
}
