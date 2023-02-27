package de.jensklingenberg.jetpackcomposeplayground

import android.app.Application
import timber.log.Timber

class MainApp:Application() {
    override fun onCreate() {
        super.onCreate()
        Timber.plant(Timber.DebugTree())
    }
}