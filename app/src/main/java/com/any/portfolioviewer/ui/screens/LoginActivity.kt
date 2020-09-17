package com.any.portfolioviewer.ui.screens

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.any.portfolioviewer.R
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }

    fun openSignUp(view: View) {
        val intent = Intent (this@LoginActivity, Signup::class.java)
        startActivity(intent)
    }


}