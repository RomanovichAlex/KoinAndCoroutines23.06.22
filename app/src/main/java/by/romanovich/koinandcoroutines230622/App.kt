package by.romanovich.koinandcoroutines230622

import android.app.Application
import by.romanovich.koinandcoroutines230622.di.Di
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin
import org.koin.dsl.module


class App: Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@App)
            modules(Di.mainModule)

        }
    }
}