package com.example.multipageapplication

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val frenchPressButton: ImageButton = findViewById(R.id.imageButton)
        val espressoButton: ImageButton = findViewById(R.id.imageButton3)
        val latteButton: ImageButton = findViewById(R.id.imageButton2)
        val chemexButton: ImageButton = findViewById(R.id.imageButton4)

        frenchPressButton.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            intent.putExtra("coffee_type", "French Press")
            startActivity(intent)
        }

        espressoButton.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            intent.putExtra("coffee_type", "Espresso")
            startActivity(intent)
        }

        latteButton.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            intent.putExtra("coffee_type", "Latte")
            startActivity(intent)
        }

        chemexButton.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            intent.putExtra("coffee_type", "Chemex")
            startActivity(intent)
        }
    }
}