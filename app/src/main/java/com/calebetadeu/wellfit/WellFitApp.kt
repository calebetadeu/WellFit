package com.calebetadeu.wellfit

import android.app.Application
import com.calebetadeu.wellfit.login.di.loginModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.GlobalContext.startKoin


class WellFitApp : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@WellFitApp)
            androidLogger()
            modules(loginModule)
        }

    }
}