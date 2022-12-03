package com.sameh.broadcastreceiver

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log

class MyBroadcastReceiver: BroadcastReceiver() {
    override fun onReceive(p0: Context?, p1: Intent?) {
        when (p1?.action) {
            Intent.ACTION_AIRPLANE_MODE_CHANGED -> {
                Log.d("myTAG", "action: ${p1.action}")

                p1.extras?.keySet()?.forEach {
                    Log.d("myTAG", "$it - ${p1.extras?.get(it)}")
                }
            }
        }
    }
}