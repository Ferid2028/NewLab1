package com.example.newlab1

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonChangeText = findViewById<Button>(R.id.buttonChangeText)
        val textView = findViewById<TextView>(R.id.textView)

        buttonChangeText.setOnClickListener {
            // Change the TextView's text when the Button is clicked
            textView.text = "Text has been changed!"
        }


    }
}
