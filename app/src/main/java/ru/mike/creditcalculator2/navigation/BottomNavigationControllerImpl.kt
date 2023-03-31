package ru.mike.creditcalculator2.navigation

import android.view.MenuItem
import com.google.android.material.bottomnavigation.BottomNavigationView
import ru.mike.creditcalculator2.di.ApplicationSingleton
import ru.mike.creditcalculator2.navigation.router.MainRouter
import java.lang.ref.WeakReference
import javax.inject.Inject

@ApplicationSingleton
class BottomNavigationControllerImpl @Inject constructor(
    private val router: MainRouter
) : BottomNavigationController {

    private var bottomView: WeakReference<BottomNavigationView>? = null

    override val selectedItem: Int
        get() = bottomView?.get()?.selectedItemId ?: throw IllegalStateException("Empty bottom selected item")

    fun setupView(view: BottomNavigationView) {
        bottomView = WeakReference(view)
//        bottomView?.get()?.setOnItemSelectedListener {
//
//        }
    }

}