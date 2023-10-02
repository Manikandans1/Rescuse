package com.example.rescues

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class UserPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.userpage)


        val enterbutton = findViewById<Button>(R.id.small_button)
        enterbutton.setOnClickListener{

            val intent1 = Intent(this, AgenceyManincontent::class.java)
            startActivity(intent1)
        }

    }
}