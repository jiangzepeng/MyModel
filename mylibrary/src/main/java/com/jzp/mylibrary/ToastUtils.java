package com.jzp.mylibrary;

import android.content.Context;
import android.widget.Toast;

public class ToastUtils
{

    public static Toast toast;

    public ToastUtils() {
    }

    public static void showToast(Context context, String text) {
        Toast.makeText(context, text, Toast.LENGTH_LONG).show();
    }

    public static void showToast(Context context, int resID) {
        showToast(context, context.getString(resID));
    }


}
