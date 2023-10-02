package com.example.rescues

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SignupActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        val signupbutton = findViewById<Button>(R.id.signup_button)
        signupbutton.setOnClickListener{

            val intent1 = Intent(this, LoginActivity::class.java)
            startActivity(intent1)
        }
    }
}