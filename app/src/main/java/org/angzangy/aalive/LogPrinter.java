package org.angzangy.aalive;

import android.util.Log;

public class LogPrinter {
    private static String TAG = "AALog";
    public static void d(String message){
        Log.d(TAG, message);
    }
}
