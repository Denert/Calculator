package ru.mike.core

interface AppProvider {
    val componentApi: AppComponentApi
}

lateinit var appProvider: AppProvider
private set

fun setAppProvider(provider: AppProvider) {
    appProvider = provider
}
