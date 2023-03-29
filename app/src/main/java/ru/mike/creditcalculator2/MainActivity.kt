package ru.mike.creditcalculator2

import android.content.res.Resources
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import ru.mike.core.appProvider
import ru.mike.creditcalculator2.di.AppComponent
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var resTest: Resources

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        (appProvider.componentApi as AppComponent).inject(this)
        Thread.sleep(2000)
        installSplashScreen()
        setContentView(R.layout.activity_main)
    }
}