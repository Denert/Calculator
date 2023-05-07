package ru.mike.creditcalculator2.navigation

import android.view.MenuItem
import com.google.android.material.bottomnavigation.BottomNavigationView

interface BottomNavigationController {

    val selectedItem: Int

    fun setupView(view: BottomNavigationView)

}