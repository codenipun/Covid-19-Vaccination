package com.codenipun.covid_19_vaccine

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.widget.ImageButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button : ImageButton = findViewById(R.id.button)
        button.setOnClickListener() {
            intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }
    }
}