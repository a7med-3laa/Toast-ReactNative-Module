package com.to;
;import android.widget.Toast;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by ahmed on 16/10/2017.
 */

public class ToastModule extends ReactContextBaseJavaModule {
    @ReactMethod
    public void login() {
        Toast.makeText(getReactApplicationContext(), "Login", Toast.LENGTH_SHORT).show();
    }
    @ReactMethod
    public void logOut() {
        Toast.makeText(getReactApplicationContext(), "LogOut", Toast.LENGTH_SHORT).show();
    }
    public ToastModule(ReactApplicationContext reactContext) {
        super(reactContext);
    }

    @Override
    public String getName() {
        return "ToastAndroid2";
    }

}
