package ru.mike.creditcalculator2

import android.app.Application
import ru.mike.core.AppComponentApi
import ru.mike.core.AppProvider
import ru.mike.core.setAppProvider
import ru.mike.creditcalculator2.di.DaggerAppComponent

class App: Application(), AppProvider {

    override fun onCreate() {
        super.onCreate()

        setupDaggerComponent()
    }

    override lateinit var componentApi: AppComponentApi

    private fun setupDaggerComponent() {
        componentApi = DaggerAppComponent.factory().create(this)
        setAppProvider(this)
    }

}