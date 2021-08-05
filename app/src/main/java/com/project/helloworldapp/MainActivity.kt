package com.project.helloworldapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tvHello: TextView = findViewById(R.id.tv_hello)
        tvHello.text = "Hello Kedua"
    }
}