package com.any.portfolioviewer.ui.screens

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.lifecycleScope
import com.any.portfolioviewer.MainActivity
import com.any.portfolioviewer.R
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        lifecycleScope.launch(Dispatchers.Main) {
            delay(2000)
            val intent = Intent(this@SplashScreen, LoginActivity::class.java)
            startActivity(intent)

        }



    }

    override fun onPause() {
        super.onPause()
        finish()
    }
}