package ru.mike.creditcalculator2

import android.content.res.Resources
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import ru.mike.core.appProvider
import ru.mike.creditcalculator2.databinding.ActivityMainBinding
import ru.mike.creditcalculator2.di.AppComponent
import ru.mike.creditcalculator2.navigation.BottomNavigationController
import ru.mike.creditcalculator2.navigation.router.MainRouter
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var resTest: Resources

    @Inject
    lateinit var bottomNavigationController: BottomNavigationController

    @Inject
    lateinit var router: MainRouter

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        (appProvider.componentApi as AppComponent).inject(this)
        Thread.sleep(500) //TODO: убрать, нужна для демонстрации сплеша
        installSplashScreen()
        binding = ActivityMainBinding.inflate(layoutInflater, null, false)
        router.applyContainer(R.id.screenContainer, supportFragmentManager)
        bottomNavigationController.setupView(binding.navigation)
        setContentView(binding.root)
    }
}