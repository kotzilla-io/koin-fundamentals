package org.koin.userapp

import android.app.Application
import org.koin.android.ext.android.inject
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.userapp.components.UserDatabase
import org.koin.userapp.di.userAppModule

/**
 * Main Application
 */
class MainApplication : Application() {

    private val userDatabase: UserDatabase by inject()

    override fun onCreate() {
        super.onCreate()

        // Start Koin
        startKoin {
            // Use Koin logger in Android
            androidLogger()
            // Reference Android context
            androidContext(this@MainApplication)
            // Load modules
            modules(userAppModule)
        }

        userDatabase.init()
    }
}
