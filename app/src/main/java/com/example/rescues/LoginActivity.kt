package com.example.rescues

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val loginbutton = findViewById<Button>(R.id.login_button)
        loginbutton.setOnClickListener{

            val intent = Intent(this, AgencyActivity::class.java)
            startActivity(intent)
        }


    }
}