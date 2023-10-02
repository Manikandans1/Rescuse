package com.example.rescues

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class AgencyActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.agencypage)

        val agencybutton = findViewById<Button>(R.id.agency_button)
        agencybutton.setOnClickListener{

            val intent1 = Intent(this, AgenceyManincontent::class.java)
            startActivity(intent1)
        }


    }
}