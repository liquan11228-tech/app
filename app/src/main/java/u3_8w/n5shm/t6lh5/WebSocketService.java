package u3_8w.n5shm.t6lh5;

import a.b.k.h;
import a.g.c.f;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import b.b.a.i;
import b.d.a.j;
import c.g.e;
import c.j.b.d;
import d.c0;
import d.d0;
import d.e0;
import d.f0;
import d.g0;
import d.l0;
import d.m0;
import d.n0.c;
import d.u;
import d.y;
import d.z;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ArrayBlockingQueue;

/* loaded from: classes.dex */
public class WebSocketService extends Service {
    public static l0 f = null;
    public static String g = null;
    public static String h = null;
    public static boolean i = false;
    public static String j = "closed";
    public static String k = "0";
    public static Map<String, String> l = null;
    public static String m = "1";
    public static Map<String, String> n;
    public static boolean o;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1820b;

    /* renamed from: c, reason: collision with root package name */
    public String f1821c;

    /* renamed from: d, reason: collision with root package name */
    public Timer f1822d;

    /* renamed from: e, reason: collision with root package name */
    public TimerTask f1823e;

    public class a extends m0 {
        public a() {
        }

        @Override // d.m0
        public void a(l0 l0Var, int i, String str) {
            System.out.println("websocket close");
            super.a(l0Var, i, str);
            WebSocketService.i = false;
            WebSocketService.m = "0";
        }

        @Override // d.m0
        public void b(l0 l0Var, Throwable th, g0 g0Var) {
            WebSocketService.i = false;
            WebSocketService.m = "0";
            d.d(l0Var, "webSocket");
            d.d(th, "t");
            WebSocketService.this.f1821c = "1";
            Intent intent = new Intent("u3_8w.n5shm.t6lh5.STATUSRECEIVER");
            HashMap map = new HashMap();
            map.put("action", "session_connect");
            map.put("connect_status", "0");
            map.put("type", WebSocketService.h);
            intent.putExtra("data", new j().f(map));
            WebSocketService.this.getApplication().sendBroadcast(intent);
        }

        @Override // d.m0
        public void c(l0 l0Var, g0 g0Var) {
            d.d(l0Var, "webSocket");
            d.d(g0Var, "response");
            HashMap map = new HashMap();
            map.put("cmd", "init");
            map.put("token", WebSocketService.g);
            map.put("type", WebSocketService.h);
            l0Var.e(new j().f(map));
        }
    }

    static {
        new ArrayBlockingQueue(20);
        n = new HashMap();
        o = false;
    }

    public static void a(String str, String str2) {
        HashMap map = new HashMap();
        map.put("cmd", str);
        map.put("token", g);
        map.put("type", h);
        if (!TextUtils.isEmpty(str2)) {
            map.put("data", str2);
        }
        String strF = new j().f(map);
        l0 l0Var = f;
        if (l0Var != null) {
            l0Var.e(strF);
        } else {
            m = "0";
            j = "closed";
        }
    }

    public final void b() {
        LinkedHashMap linkedHashMap;
        c0 c0Var = new c0(new c0.a());
        e0.a aVar = new e0.a();
        aVar.e(i.f1087b);
        e0 e0VarA = aVar.a();
        a aVar2 = new a();
        d.d(e0VarA, "request");
        d.d(aVar2, "listener");
        d.n0.n.d dVar = new d.n0.n.d(d.n0.f.d.h, e0VarA, aVar2, new Random(), c0Var.C, null, c0Var.D);
        d.d(c0Var, "client");
        if (dVar.t.b("Sec-WebSocket-Extensions") != null) {
            dVar.i(new ProtocolException("Request header not permitted: 'Sec-WebSocket-Extensions'"), null);
        } else {
            d.d(c0Var, "okHttpClient");
            c0.a aVar3 = new c0.a();
            aVar3.f1336a = c0Var.f1332b;
            aVar3.f1337b = c0Var.f1333c;
            h.i.b(aVar3.f1338c, c0Var.f1334d);
            h.i.b(aVar3.f1339d, c0Var.f1335e);
            aVar3.f1340e = c0Var.f;
            aVar3.f = c0Var.g;
            aVar3.g = c0Var.h;
            aVar3.h = c0Var.i;
            aVar3.i = c0Var.j;
            aVar3.j = c0Var.k;
            aVar3.k = null;
            aVar3.l = c0Var.m;
            aVar3.m = c0Var.n;
            aVar3.n = c0Var.o;
            aVar3.o = c0Var.p;
            aVar3.p = c0Var.q;
            aVar3.q = c0Var.r;
            aVar3.r = c0Var.s;
            aVar3.s = c0Var.t;
            aVar3.t = c0Var.u;
            aVar3.u = c0Var.v;
            aVar3.v = c0Var.w;
            aVar3.w = c0Var.x;
            aVar3.x = c0Var.y;
            aVar3.y = c0Var.z;
            aVar3.z = c0Var.A;
            aVar3.A = c0Var.B;
            aVar3.B = c0Var.C;
            aVar3.C = c0Var.D;
            aVar3.D = c0Var.E;
            u uVar = u.f1722a;
            d.d(uVar, "eventListener");
            d.d(uVar, "$this$asFactory");
            aVar3.f1340e = new d.n0.a(uVar);
            List<d0> list = d.n0.n.d.z;
            d0 d0Var = d0.H2_PRIOR_KNOWLEDGE;
            d.d(list, "protocols");
            List listI = e.i(list);
            ArrayList arrayList = (ArrayList) listI;
            if (!(arrayList.contains(d0Var) || arrayList.contains(d0.HTTP_1_1))) {
                throw new IllegalArgumentException(("protocols must contain h2_prior_knowledge or http/1.1: " + listI).toString());
            }
            if (!(!arrayList.contains(d0Var) || arrayList.size() <= 1)) {
                throw new IllegalArgumentException(("protocols containing h2_prior_knowledge cannot use other protocols: " + listI).toString());
            }
            if (!(!arrayList.contains(d0.HTTP_1_0))) {
                throw new IllegalArgumentException(("protocols must not contain http/1.0: " + listI).toString());
            }
            if (!(!arrayList.contains(null))) {
                throw new IllegalArgumentException("protocols must not contain null".toString());
            }
            arrayList.remove(d0.SPDY_3);
            if (!d.a(listI, aVar3.t)) {
                aVar3.D = null;
            }
            List<? extends d0> listUnmodifiableList = Collections.unmodifiableList(listI);
            d.c(listUnmodifiableList, "Collections.unmodifiableList(protocolsCopy)");
            aVar3.t = listUnmodifiableList;
            c0 c0Var2 = new c0(aVar3);
            e0 e0Var = dVar.t;
            if (e0Var == null) {
                throw null;
            }
            d.d(e0Var, "request");
            new LinkedHashMap();
            z zVar = e0Var.f1351b;
            String str = e0Var.f1352c;
            f0 f0Var = e0Var.f1354e;
            if (e0Var.f.isEmpty()) {
                linkedHashMap = new LinkedHashMap();
            } else {
                Map<Class<?>, Object> map = e0Var.f;
                d.d(map, "$this$toMutableMap");
                linkedHashMap = new LinkedHashMap(map);
            }
            y.a aVarC = e0Var.f1353d.c();
            d.d("Upgrade", "name");
            d.d("websocket", "value");
            aVarC.d("Upgrade", "websocket");
            d.d("Connection", "name");
            d.d("Upgrade", "value");
            aVarC.d("Connection", "Upgrade");
            String str2 = dVar.f1679a;
            d.d("Sec-WebSocket-Key", "name");
            d.d(str2, "value");
            aVarC.d("Sec-WebSocket-Key", str2);
            d.d("Sec-WebSocket-Version", "name");
            d.d("13", "value");
            aVarC.d("Sec-WebSocket-Version", "13");
            d.d("Sec-WebSocket-Extensions", "name");
            d.d("permessage-deflate", "value");
            aVarC.d("Sec-WebSocket-Extensions", "permessage-deflate");
            if (zVar == null) {
                throw new IllegalStateException("url == null".toString());
            }
            e0 e0Var2 = new e0(zVar, str, aVarC.b(), f0Var, c.E(linkedHashMap));
            d.n0.g.e eVar = new d.n0.g.e(c0Var2, e0Var2, true);
            dVar.f1680b = eVar;
            d.b(eVar);
            eVar.d(new d.n0.n.e(dVar, e0Var2));
        }
        f = dVar;
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        System.out.println("关闭服务");
        TimerTask timerTask = this.f1823e;
        if (timerTask != null) {
            timerTask.cancel();
            this.f1823e = null;
        }
        Timer timer = this.f1822d;
        if (timer != null) {
            timer.cancel();
            this.f1822d.purge();
            this.f1822d = null;
        }
        l0 l0Var = f;
        if (l0Var != null) {
            m = "0";
            l0Var.a(1000, "User-initiated close");
            f = null;
        }
        j = "closed";
        super.onDestroy();
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i2, int i3) {
        Bundle bundle;
        if (intent == null || intent.getStringExtra("token") == null) {
            stopSelf();
            return 2;
        }
        j = "open";
        m = "2";
        String stringExtra = intent.getStringExtra("token");
        h = intent.getStringExtra("type");
        g = stringExtra;
        b();
        this.f1822d = new Timer();
        b.b.a.j jVar = new b.b.a.j(this);
        this.f1823e = jVar;
        this.f1822d.schedule(jVar, 0L, 3000L);
        NotificationChannel notificationChannel = new NotificationChannel("kim.hsl", "ForegroundService", 0);
        notificationChannel.setLightColor(-16776961);
        notificationChannel.setLockscreenVisibility(0);
        ((NotificationManager) getSystemService("notification")).createNotificationChannel(notificationChannel);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Notification notification = new Notification();
        notification.when = System.currentTimeMillis();
        notification.audioStreamType = -1;
        ArrayList arrayList3 = new ArrayList();
        notification.flags |= 2;
        notification.icon = R.drawable.listen;
        new ArrayList();
        Bundle bundle2 = new Bundle();
        Notification.Builder builder = new Notification.Builder(this, "kim.hsl");
        builder.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, null).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((2 & notification.flags) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(null).setContentText(null).setContentInfo(null).setContentIntent(null).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(null, (notification.flags & 128) != 0).setLargeIcon((Bitmap) null).setNumber(0).setProgress(0, 0, false);
        builder.setSubText(null).setUsesChronometer(false).setPriority(-2);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            IconCompat iconCompat = ((a.g.c.e) it.next()).f597a;
            Notification.Action.Builder builder2 = new Notification.Action.Builder(iconCompat != null ? iconCompat.d() : null, (CharSequence) null, (PendingIntent) null);
            Bundle bundle3 = new Bundle();
            bundle3.putBoolean("android.support.allowGeneratedReplies", false);
            builder2.setAllowGeneratedReplies(false);
            bundle3.putInt("android.support.action.semanticAction", 0);
            if (Build.VERSION.SDK_INT >= 28) {
                builder2.setSemanticAction(0);
            }
            if (Build.VERSION.SDK_INT >= 29) {
                builder2.setContextual(false);
            }
            bundle3.putBoolean("android.support.action.showsUserInterface", false);
            builder2.addExtras(bundle3);
            builder.addAction(builder2.build());
        }
        builder.setShowWhen(true);
        builder.setLocalOnly(false).setGroup(null).setGroupSummary(false).setSortKey(null);
        builder.setCategory("service").setColor(0).setVisibility(0).setPublicVersion(null).setSound(notification.sound, notification.audioAttributes);
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            builder.addPerson((String) it2.next());
        }
        if (arrayList2.size() > 0) {
            bundle = new Bundle();
            Bundle bundle4 = bundle.getBundle("android.car.EXTENSIONS");
            if (bundle4 == null) {
                bundle4 = new Bundle();
            }
            Bundle bundle5 = new Bundle();
            for (int i4 = 0; i4 < arrayList2.size(); i4++) {
                bundle5.putBundle(Integer.toString(i4), f.a((a.g.c.e) arrayList2.get(i4)));
            }
            bundle4.putBundle("invisible_actions", bundle5);
            bundle.putBundle("android.car.EXTENSIONS", bundle4);
            bundle2.putBundle("android.car.EXTENSIONS", bundle4);
        } else {
            bundle = null;
        }
        builder.setExtras(bundle).setRemoteInputHistory(null);
        builder.setBadgeIconType(0).setShortcutId(null).setTimeoutAfter(0L).setGroupAlertBehavior(0);
        if (!TextUtils.isEmpty("kim.hsl")) {
            builder.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
        }
        if (Build.VERSION.SDK_INT >= 29) {
            builder.setAllowSystemGeneratedContextualActions(true);
            builder.setBubbleMetadata(null);
        }
        startForeground(1, builder.build());
        return 1;
    }
}
