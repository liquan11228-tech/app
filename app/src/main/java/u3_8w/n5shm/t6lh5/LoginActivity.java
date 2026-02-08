package u3_8w.n5shm.t6lh5;

import a.b.k.e;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.PopupWindow;
import b.b.a.c;
import b.b.a.d;
import b.b.a.f;
import b.b.a.g;
import b.b.a.i;
import b.d.a.j;
import d.v;
import java.io.IOException;
import java.util.Map;

/* loaded from: classes.dex */
public class LoginActivity extends e {
    public Button p;
    public c q = null;

    public class a implements f.b {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f1814a;

        public a(Context context) {
            this.f1814a = context;
        }

        @Override // b.b.a.f.b
        public void a(String str) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            if ("1".equals((String) ((Map) new j().b(str, Map.class)).get("code"))) {
                LoginActivity.this.startActivity(new Intent(this.f1814a, (Class<?>) CardLoadingActivity.class));
                return;
            }
            c cVar = LoginActivity.this.q;
            PopupWindow popupWindow = cVar.f1072a;
            if (popupWindow == null || !popupWindow.isShowing()) {
                return;
            }
            cVar.f1072a.dismiss();
        }

        @Override // b.b.a.f.b
        public void b(IOException iOException) {
            LoginActivity loginActivity = LoginActivity.this;
            StringBuilder sbE = b.a.a.a.a.e("network error :");
            sbE.append(iOException.getMessage());
            LoginActivity.s(loginActivity, sbE.toString());
        }
    }

    public class b implements View.OnClickListener {

        public class a implements f.b {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Context f1817a;

            /* renamed from: u3_8w.n5shm.t6lh5.LoginActivity$b$a$a, reason: collision with other inner class name */
            public class RunnableC0041a implements Runnable {
                public RunnableC0041a() {
                }

                @Override // java.lang.Runnable
                public void run() {
                    c cVar = LoginActivity.this.q;
                    PopupWindow popupWindow = cVar.f1072a;
                    if (popupWindow == null || !popupWindow.isShowing()) {
                        return;
                    }
                    cVar.f1072a.dismiss();
                }
            }

            public a(Context context) {
                this.f1817a = context;
            }

            @Override // b.b.a.f.b
            public void a(String str) {
                System.out.println("成功了");
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                LoginActivity.this.runOnUiThread(new RunnableC0041a());
                Map map = (Map) new j().b(str, Map.class);
                if ("0".equals((String) map.get("code"))) {
                    LoginActivity.s(LoginActivity.this, (String) map.get("message"));
                    return;
                }
                LoginActivity.s(LoginActivity.this, "登录成功");
                String str2 = (String) map.get("token");
                g gVarA = g.a(this.f1817a);
                gVarA.f1084b.putString("token", str2);
                gVarA.f1084b.apply();
                g gVarA2 = g.a(this.f1817a);
                gVarA2.f1084b.putString("type", "scan");
                gVarA2.f1084b.apply();
                LoginActivity.this.startActivity(new Intent(this.f1817a, (Class<?>) CardLoadingActivity.class));
            }

            @Override // b.b.a.f.b
            public void b(IOException iOException) {
                System.out.println(iOException.getMessage());
            }
        }

        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            String string = ((EditText) LoginActivity.this.findViewById(R.id.editTextUsername)).getText().toString();
            String string2 = ((EditText) LoginActivity.this.findViewById(R.id.editTextPassword)).getText().toString();
            g gVarA = g.a(LoginActivity.this.getApplicationContext());
            gVarA.f1084b.putString("username", string);
            gVarA.f1084b.apply();
            g gVarA2 = g.a(LoginActivity.this.getApplicationContext());
            gVarA2.f1084b.putString("password", string2);
            gVarA2.f1084b.apply();
            LoginActivity loginActivity = LoginActivity.this;
            c cVar = loginActivity.q;
            View rootView = loginActivity.getWindow().getDecorView().getRootView();
            PopupWindow popupWindow = cVar.f1072a;
            if (popupWindow != null && !popupWindow.isShowing()) {
                cVar.f1072a.showAtLocation(rootView, 17, 0, 0);
            }
            String strC = i.c(string2);
            v.a aVar = new v.a();
            aVar.a("username", string);
            aVar.a("pwd", strC);
            aVar.a("type", "scan");
            f.a(b.a.a.a.a.d(new StringBuilder(), i.f1086a, "/app/maike/api/index/loginsub?uniacid=103&platform=h5"), aVar, new a(LoginActivity.this.getApplicationContext()));
        }
    }

    public static void s(LoginActivity loginActivity, String str) {
        loginActivity.runOnUiThread(new d(loginActivity, str));
    }

    @Override // a.b.k.e, a.j.a.d, androidx.activity.ComponentActivity, a.g.c.d, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_login);
        this.q = new c(this);
        this.p = (Button) findViewById(R.id.buttonLogin);
        EditText editText = (EditText) findViewById(R.id.editTextUsername);
        String string = g.a(getApplicationContext()).f1083a.getString("username", "");
        if (!TextUtils.isEmpty(string)) {
            editText.setText(string);
        }
        editText.setText("123");
        EditText editText2 = (EditText) findViewById(R.id.editTextPassword);
        String string2 = g.a(getApplicationContext()).f1083a.getString("password", "");
        if (!TextUtils.isEmpty(string2)) {
            editText2.setText(string2);
        }
        editText2.setText("123");
        String string3 = g.a(getApplicationContext()).f1083a.getString("token", "");
        if (!TextUtils.isEmpty(string3)) {
            v.a aVar = new v.a();
            aVar.a("token", string3);
            f.a(b.a.a.a.a.d(new StringBuilder(), i.f1086a, "/app/maike/api/index/logingetInfo?uniacid=103&platform=h5"), aVar, new a(getApplicationContext()));
        }
        this.p.setOnClickListener(new b());
    }
}
