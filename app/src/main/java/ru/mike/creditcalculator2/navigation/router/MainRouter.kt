package ru.mike.creditcalculator2.navigation.router

import androidx.annotation.IdRes
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import ru.mike.creditcalculator2.navigation.BottomNavigationFragment

interface MainRouter {

    fun applyContainer(@IdRes containerId: Int, fragmentManager: FragmentManager)

    fun showScreen(screenClass: Class<out BottomNavigationFragment>, creator: () -> BottomNavigationFragment)

}