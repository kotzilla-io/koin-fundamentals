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

        startKoin {
            modules(userAppModule)
            androidLogger()
            androidContext(this@MainApplication)
        }

        userDatabase.init()
    }
}
