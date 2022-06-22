package org.koin.userapp

import android.app.Application

/**
 * Main Application
 */
class MainApplication : Application() {

    //TODO inject UserDatabase

    override fun onCreate() {
        super.onCreate()

        //TODO Start Koin + Logger + Context

        //TODO UserDatabase init()
    }
}
