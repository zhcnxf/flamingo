package org.taosha.flamingo

import android.os.Bundle
import androidx.core.app.NotificationCompat
import androidx.core.app.NotificationManagerCompat
import io.flutter.app.FlutterActivity
import io.flutter.plugins.GeneratedPluginRegistrant

class MainActivity : FlutterActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        GeneratedPluginRegistrant.registerWith(this)
        sendNotification()
    }

    private fun sendNotification() {
        val n = NotificationCompat.Builder(this, NOTIFICATION_CHANNEL_GENERIC)
                .setContentTitle("Hi, flamingo")
                .setContentText("This is a flamingo wallpaper notification.")
                .setSmallIcon(R.drawable.ic_notification_small)
                .setPriority(NotificationCompat.PRIORITY_DEFAULT)
                .build()

        NotificationManagerCompat.from(this).notify(0, n)
    }
}
