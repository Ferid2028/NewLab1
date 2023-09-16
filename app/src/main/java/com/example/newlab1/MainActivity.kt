package com.example.newlab1

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.graphics.Color
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonChangeText = findViewById<Button>(R.id.buttonChangeText)
        val buttonChangeColor = findViewById<Button>(R.id.buttonChangeColor)
        val textView = findViewById<TextView>(R.id.textView)

        buttonChangeText.setOnClickListener {

            textView.text = "Text has been changed!"
        }

        buttonChangeColor.setOnClickListener {
            textView.setTextColor(Color.RED)
        }
    }


    }

