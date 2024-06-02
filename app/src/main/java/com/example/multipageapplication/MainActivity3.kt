package com.example.multipageapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        val coffeeType = intent.getStringExtra("coffee_type")
        val quantity = intent.getIntExtra("quantity", 1)

        val shortButton: Button = findViewById(R.id.button)
        val tallButton: Button = findViewById(R.id.button2)
        val grandeButton: Button = findViewById(R.id.button3)
        val backButton: Button = findViewById(R.id.button4)

        shortButton.setOnClickListener {
            navigateToNextActivity(coffeeType, quantity, "Short")
        }

        tallButton.setOnClickListener {
            navigateToNextActivity(coffeeType, quantity, "Tall")
        }

        grandeButton.setOnClickListener {
            navigateToNextActivity(coffeeType, quantity, "Grande")
        }

        backButton.setOnClickListener {
            finish()
        }
    }

    private fun navigateToNextActivity(coffeeType: String?, quantity: Int, size: String) {
        val intent = Intent(this, MainActivity4::class.java)
        intent.putExtra("coffee_type", coffeeType)
        intent.putExtra("quantity", quantity)
        intent.putExtra("size", size)
        startActivity(intent)
    }
}