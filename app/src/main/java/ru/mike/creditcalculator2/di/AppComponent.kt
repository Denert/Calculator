package ru.mike.creditcalculator2.di

import android.content.Context
import dagger.BindsInstance
import dagger.Component
import ru.mike.core.AppComponentApi
import ru.mike.creditcalculator2.MainActivity
import ru.mike.creditcalculator2.di.modules.AndroidModule
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        AndroidModule::class
    ]
)
interface AppComponent : AppComponentApi {

    fun inject(activity: MainActivity)

    @Component.Factory
    interface Factory {
        fun create(
            @BindsInstance context: Context
        ): AppComponent
    }
}