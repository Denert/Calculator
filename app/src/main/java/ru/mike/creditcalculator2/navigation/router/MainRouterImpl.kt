package ru.mike.creditcalculator2.navigation.router

import androidx.annotation.IdRes
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import ru.mike.creditcalculator2.di.ApplicationSingleton
import ru.mike.creditcalculator2.navigation.BottomNavigationFragment
import javax.inject.Inject

@ApplicationSingleton
class MainRouterImpl @Inject constructor() : MainRouter {

    private val bottomNavigationScreens: MutableSet<Fragment> = mutableSetOf()

    private var fragmentManager: FragmentManager? = null
    private var containerId: Int? = null

    override fun applyContainer(@IdRes containerId: Int, fragmentManager: FragmentManager) {
        this.containerId = containerId
        this.fragmentManager = fragmentManager
    }

    override fun showScreen(screenClass: Class<BottomNavigationFragment>, creator: () -> Fragment) {
        val screen: Fragment = bottomNavigationScreens.find {
            it::class.java == screenClass
        } ?: creator.invoke()

        val manager = fragmentManager
            ?: throw NullPointerException("You need to instantiate router with applyContainer")
        val container = containerId
            ?: throw NullPointerException("You need to instantiate router with applyContainer")

        manager
            .beginTransaction()
            .replace(container, screen)
            .commit()
    }

}