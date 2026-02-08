package a.g.j;

import android.app.ActionBar;
import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Build;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f681a;

    /* renamed from: b, reason: collision with root package name */
    public static Method f682b;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f683c;

    /* renamed from: d, reason: collision with root package name */
    public static Field f684d;

    public interface a {
        boolean h(KeyEvent keyEvent);
    }

    public static boolean a(a aVar, View view, Window.Callback callback, KeyEvent keyEvent) throws NoSuchFieldException {
        DialogInterface.OnKeyListener onKeyListener;
        boolean zBooleanValue = false;
        if (aVar == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            return aVar.h(keyEvent);
        }
        if (callback instanceof Activity) {
            Activity activity = (Activity) callback;
            activity.onUserInteraction();
            Window window = activity.getWindow();
            if (window.hasFeature(8)) {
                ActionBar actionBar = activity.getActionBar();
                if (keyEvent.getKeyCode() == 82 && actionBar != null) {
                    if (!f681a) {
                        try {
                            f682b = actionBar.getClass().getMethod("onMenuKeyEvent", KeyEvent.class);
                        } catch (NoSuchMethodException unused) {
                        }
                        f681a = true;
                    }
                    Method method = f682b;
                    if (method != null) {
                        try {
                            zBooleanValue = ((Boolean) method.invoke(actionBar, keyEvent)).booleanValue();
                        } catch (IllegalAccessException | InvocationTargetException unused2) {
                        }
                    }
                    if (zBooleanValue) {
                        return true;
                    }
                }
            }
            if (window.superDispatchKeyEvent(keyEvent)) {
                return true;
            }
            View decorView = window.getDecorView();
            if (k.c(decorView, keyEvent)) {
                return true;
            }
            return keyEvent.dispatch(activity, decorView != null ? decorView.getKeyDispatcherState() : null, activity);
        }
        if (!(callback instanceof Dialog)) {
            return (view != null && k.c(view, keyEvent)) || aVar.h(keyEvent);
        }
        Dialog dialog = (Dialog) callback;
        if (!f683c) {
            try {
                Field declaredField = Dialog.class.getDeclaredField("mOnKeyListener");
                f684d = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused3) {
            }
            f683c = true;
        }
        Field field = f684d;
        if (field != null) {
            try {
                onKeyListener = (DialogInterface.OnKeyListener) field.get(dialog);
            } catch (IllegalAccessException unused4) {
            }
        } else {
            onKeyListener = null;
        }
        if (onKeyListener != null && onKeyListener.onKey(dialog, keyEvent.getKeyCode(), keyEvent)) {
            return true;
        }
        Window window2 = dialog.getWindow();
        if (window2.superDispatchKeyEvent(keyEvent)) {
            return true;
        }
        View decorView2 = window2.getDecorView();
        if (k.c(decorView2, keyEvent)) {
            return true;
        }
        return keyEvent.dispatch(dialog, decorView2 != null ? decorView2.getKeyDispatcherState() : null, dialog);
    }
}
