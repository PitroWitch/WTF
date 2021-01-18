package com.example.probnick

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val b1 = findViewById<Button>(R.id.Butt1)
        b1.setOnClickListener {
            Log.e("Сработала", "Кнопка 1")
        }

        val b2 = findViewById<Button>(R.id.Butt2)
        b2.setOnClickListener {
            Log.e("Сработала", "Кнопка 2")
        }

        val b3 = findViewById<Button>(R.id.Butt3)
        b3.setOnClickListener {
           Log.e("Сработала", "Кнопка 3")
        }

    }
}