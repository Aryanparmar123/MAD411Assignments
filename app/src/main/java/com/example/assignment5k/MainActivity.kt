package com.example.assignment5k

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val enterName: EditText = findViewById(R.id.enterName)
        val btnShowName: Button = findViewById(R.id.btnShowName)
        val Message: TextView = findViewById(R.id.Message)

        btnShowName.setOnClickListener {

            val name = enterName.text.toString()

            if (name.isNotEmpty()) {
                Message.text = "Hello, $name!"
            } else {
                Message.text = "Please enter your name."
            }
        }
    }
}