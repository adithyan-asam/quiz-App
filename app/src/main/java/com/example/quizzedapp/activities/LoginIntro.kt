package com.example.quizzedapp.activities

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.quizzedapp.R
import com.google.firebase.auth.FirebaseAuth
import com.example.quizzedapp.adapters.LoginIntroAdapter

class LoginIntro : AppCompatActivity() {
    private lateinit var adapter: LoginIntroAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        adapter = LoginIntroAdapter(this)
        adapter.checkCurrentUser()
        setContentView(R.layout.activity_login_intro)

        val btnGetStarted = findViewById<Button>(R.id.btnGetStarted)
        btnGetStarted.setOnClickListener {
            adapter.redirectToLogin()
        }
    }
}

