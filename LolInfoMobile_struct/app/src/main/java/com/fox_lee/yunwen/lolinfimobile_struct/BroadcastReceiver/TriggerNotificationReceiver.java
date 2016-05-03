//package com.fox_lee.yunwen.lolinfimobile_struct.Services;
//
//import android.content.BroadcastReceiver;
//import android.content.Context;
//import android.content.Intent;
//import android.util.Log;
//
//import java.util.ArrayList;
//
///**
// * Created by Yunwen on 4/29/2016.
// */
//public class TriggerNotificationReceiver extends BroadcastReceiver {
//
//    private static final String TAG = "TriggerNotificationReceiver";
//
//    @Override
//    public void onReceive(Context context, Intent intent) {
//        String action = intent.getAction();
//        Log.v(TAG, "Broadcast received: " + action);
//
//        if (TriggerFramework.ACTION_TRIGGER_NOTIFICATION.equals(action)) {
//            ArrayList<String> surveys = intent.getStringArrayListExtra(Notifier.EXTRA_SURVEYS);
//            Log.d(TAG, "do something for " + surveys.toString());
//        }
//    }
//}
