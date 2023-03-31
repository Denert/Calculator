package ru.mike.creditcalculator2.di.modules

import dagger.Binds
import dagger.Module
import ru.mike.creditcalculator2.navigation.BottomNavigationController
import ru.mike.creditcalculator2.navigation.BottomNavigationControllerImpl
import ru.mike.creditcalculator2.navigation.router.MainRouter
import ru.mike.creditcalculator2.navigation.router.MainRouterImpl

@Module
interface RouterModule {

    @Binds
    fun bindMainRouter(routerImpl: MainRouterImpl): MainRouter

    @Binds
    fun bindBottomNavigation(
        bottomNavigation: BottomNavigationControllerImpl
    ): BottomNavigationController

}