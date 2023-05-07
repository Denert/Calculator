package ru.mike.creditcalculator2.navigation

import android.view.MenuItem
import com.google.android.material.bottomnavigation.BottomNavigationView
import ru.mike.creditcalculator2.R
import ru.mike.creditcalculator2.di.ApplicationSingleton
import ru.mike.creditcalculator2.navigation.router.MainRouter
import ru.mike.creditcalculator2.screens.ScreenCreditCalculation
import ru.mike.creditcalculator2.screens.TestScreen1
import ru.mike.creditcalculator2.screens.TestScreen2
import java.lang.ref.WeakReference
import javax.inject.Inject

@ApplicationSingleton
class BottomNavigationControllerImpl @Inject constructor(
    private val router: MainRouter
) : BottomNavigationController {

     private var bottomView: WeakReference<BottomNavigationView>? = null

    override val selectedItem: Int
        get() = bottomView?.get()?.selectedItemId ?: throw IllegalStateException("Empty bottom selected item")

    override fun setupView(view: BottomNavigationView) {
        bottomView = WeakReference(view)

        bottomView?.get()?.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.hamburger -> {
                    router.showScreen(ScreenCreditCalculation::class.java) { ScreenCreditCalculation.newInstance() }
                    true
                }
                R.id.bank -> {
                    router.showScreen(TestScreen1::class.java) { TestScreen1.newInstance() }
                    true
                }
                R.id.percent -> {
                    router.showScreen(TestScreen2::class.java) { TestScreen2.newInstance() }
                    true
                }
                else -> false
            }
        }
        bottomView?.get()?.selectedItemId = R.id.hamburger
    }
}