package org.taosha.flamingo

import io.flutter.app.FlutterApplication

class FlamingoApplication : FlutterApplication() {

    override fun onCreate() {
        super.onCreate()
        createNotificationChannels(this)
    }
    
}