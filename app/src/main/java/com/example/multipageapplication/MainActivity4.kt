package com.example.multipageapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)

        val coffeeType = intent.getStringExtra("coffee_type")
        val quantity = intent.getIntExtra("quantity", 1)
        val size = intent.getStringExtra("size")

        val addSugarButton: Button = findViewById(R.id.button)
        val noSugarButton: Button = findViewById(R.id.button2)
        val backButton: Button = findViewById(R.id.button4)

        addSugarButton.setOnClickListener {
            navigateToNextActivity(coffeeType, quantity, size, "Add Sugar")
        }

        noSugarButton.setOnClickListener {
            navigateToNextActivity(coffeeType, quantity, size, "No Sugar")
        }

        backButton.setOnClickListener {
            finish() // Go back to the previous activity
        }
    }

    private fun navigateToNextActivity(coffeeType: String?, quantity: Int, size: String?, sugar: String?) {
        val intent = Intent(this, MainActivity5::class.java)
        intent.putExtra("coffee_type", coffeeType)
        intent.putExtra("quantity", quantity)
        intent.putExtra("size", size)
        intent.putExtra("sugar", sugar)
        startActivity(intent)
    }
}