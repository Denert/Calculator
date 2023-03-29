package ru.mike.creditcalculator2.di.modules

import android.content.Context
import dagger.Module
import dagger.Provides

@Module
object AndroidModule {

    @Provides
    fun provideResources(context: Context) = context.resources

}