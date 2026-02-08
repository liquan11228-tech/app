package u3_8w.n5shm.t6lh5;

import a.b.k.e;
import android.app.AlertDialog;
import android.content.ComponentName;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.nfc.NfcAdapter;
import android.nfc.cardemulation.CardEmulation;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.cardview.widget.CardView;
import b.b.a.g;
import b.b.a.h;
import b.b.a.i;
import java.io.PrintStream;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/* loaded from: classes.dex */
public class CardLoadingActivity extends e {
    public static final List<String> A;
    public static String v;
    public static String w;
    public static boolean x;
    public static BlockingQueue<String> y = new ArrayBlockingQueue(20);
    public static BlockingQueue<String> z = new ArrayBlockingQueue(20);
    public CardEmulation p;
    public ComponentName q;
    public NfcAdapter r;
    public b.b.a.e s;
    public boolean t = true;
    public h u;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CardLoadingActivity.this.showExitDialog(view);
        }
    }

    public class b implements Thread.UncaughtExceptionHandler {
        public b(CardLoadingActivity cardLoadingActivity) {
        }

        @Override // java.lang.Thread.UncaughtExceptionHandler
        public void uncaughtException(Thread thread, Throwable th) {
            System.out.println("线程出现错误了");
        }
    }

    public class c implements DialogInterface.OnClickListener {
        public c(CardLoadingActivity cardLoadingActivity) {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
        }
    }

    public class d implements DialogInterface.OnClickListener {
        public d() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            g gVarA = g.a(CardLoadingActivity.this.getApplicationContext());
            gVarA.f1084b.putString("token", "");
            gVarA.f1084b.apply();
            g gVarA2 = g.a(CardLoadingActivity.this.getApplicationContext());
            gVarA2.f1084b.putString("type", "");
            gVarA2.f1084b.apply();
            CardLoadingActivity.this.stopService(new Intent(CardLoadingActivity.this.getApplicationContext(), (Class<?>) WebSocketService.class));
            CardLoadingActivity.this.finish();
            CardLoadingActivity.this.finishAndRemoveTask();
        }
    }

    static {
        ArrayList arrayList = new ArrayList();
        A = arrayList;
        arrayList.add("325041592E5359532E4444463031");
    }

    @Override // a.b.k.e, a.j.a.d, androidx.activity.ComponentActivity, a.g.c.d, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_card_loading);
        NfcAdapter defaultAdapter = NfcAdapter.getDefaultAdapter(this);
        this.r = defaultAdapter;
        if (defaultAdapter == null) {
            Toast.makeText(this, "NFC Hardware not available on Device", 1).show();
            return;
        }
        if (!i.b(this)) {
            Toast.makeText(this, "NFC is NOT Enabled, Please Enable NFC", 1).show();
            return;
        }
        TextView textView = (TextView) findViewById(R.id.title_text_view);
        TextView textView2 = (TextView) findViewById(R.id.content_text_view);
        CardView cardView = (CardView) findViewById(R.id.top_card_view);
        ImageView imageView = (ImageView) findViewById(R.id.card_view_bg);
        g.a(getApplicationContext()).f1083a.getString("token", "");
        g.a(getApplicationContext()).f1083a.getString("type", "");
        s();
        this.p = CardEmulation.getInstance(this.r);
        this.q = new ComponentName(this, (Class<?>) CardEmulationService.class);
        this.s = new b.b.a.e(cardView, textView, textView2, this.p, this.q, imageView);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("u3_8w.n5shm.t6lh5.MYRECEIVER");
        registerReceiver(this.s, intentFilter);
        this.u = new h((TextView) findViewById(R.id.myTextView));
        IntentFilter intentFilter2 = new IntentFilter();
        intentFilter2.addAction("u3_8w.n5shm.t6lh5.STATUSRECEIVER");
        registerReceiver(this.u, intentFilter2);
        if (!this.p.isDefaultServiceForCategory(this.q, "payment")) {
            Intent intent = new Intent("android.nfc.cardemulation.action.ACTION_CHANGE_DEFAULT");
            intent.putExtra("category", "payment");
            intent.putExtra("component", this.q);
            startActivityForResult(intent, 5);
        }
        new Timer().schedule(new b.b.a.b(this), 0L);
        ((ImageButton) findViewById(R.id.btn_exit)).setOnClickListener(new a());
        Thread.setDefaultUncaughtExceptionHandler(new b(this));
        this.t = false;
        PrintStream printStream = System.out;
        StringBuilder sbE = b.a.a.a.a.e("启动服务1:");
        sbE.append(this.t);
        printStream.println(sbE.toString());
    }

    @Override // a.b.k.e, a.j.a.d, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        unregisterReceiver(this.s);
        unregisterReceiver(this.u);
        stopService(new Intent(this, (Class<?>) WebSocketService.class));
    }

    @Override // a.j.a.d, android.app.Activity
    public void onPause() {
        System.out.println("onPause");
        super.onPause();
        this.p.removeAidsForService(this.q, "payment");
        this.p.unsetPreferredService(this);
    }

    @Override // a.j.a.d, android.app.Activity
    public void onResume() {
        System.out.println("onResume");
        super.onResume();
        if (this.r != null && i.b(this)) {
            String string = g.a(getApplicationContext()).f1083a.getString("token", "");
            String string2 = g.a(getApplicationContext()).f1083a.getString("type", "");
            PrintStream printStream = System.out;
            StringBuilder sbE = b.a.a.a.a.e("启动服务:");
            sbE.append(this.t);
            printStream.println(sbE.toString());
            if (WebSocketService.j.equals("closed")) {
                PrintStream printStream2 = System.out;
                StringBuilder sbE2 = b.a.a.a.a.e("resume:");
                sbE2.append(WebSocketService.j);
                printStream2.println(sbE2.toString());
                Intent intent = new Intent(getApplicationContext(), (Class<?>) WebSocketService.class);
                intent.putExtra("token", string);
                intent.putExtra("type", string2);
                getApplicationContext().startService(intent);
            }
            if (!this.p.isDefaultServiceForCategory(this.q, "payment")) {
                Intent intent2 = new Intent("android.nfc.cardemulation.action.ACTION_CHANGE_DEFAULT");
                intent2.putExtra("category", "payment");
                intent2.putExtra("component", this.q);
                startActivityForResult(intent2, 5);
            }
            this.p.registerAidsForService(this.q, "payment", A);
        }
    }

    public void s() {
        runOnUiThread(new b.b.a.a(this));
    }

    public void showExitDialog(View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("Are you sure you want to exit?").setPositiveButton("Yes", new d()).setNegativeButton("No", new c(this));
        builder.create().show();
    }
}
