package com.example.multipageapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)

        val coffeeType = intent.getStringExtra("coffee_type")
        val quantity = intent.getIntExtra("quantity", 1)
        val size = intent.getStringExtra("size")
        val sugar = intent.getStringExtra("sugar")

        val addMilkButton: Button = findViewById(R.id.button)
        val noMilkButton: Button = findViewById(R.id.button2)
        val backButton: Button = findViewById(R.id.button4)

        addMilkButton.setOnClickListener {
            navigateToNextActivity(coffeeType, quantity, size, sugar, "Add Milk")
        }

        noMilkButton.setOnClickListener {
            navigateToNextActivity(coffeeType, quantity, size, sugar, "No Milk")
        }

        backButton.setOnClickListener {
            finish()
        }
    }

    private fun navigateToNextActivity(coffeeType: String?, quantity: Int, size: String?, sugar: String?, milk: String) {
        val intent = Intent(this, MainActivity6::class.java)
        intent.putExtra("coffee_type", coffeeType)
        intent.putExtra("quantity", quantity)
        intent.putExtra("size", size)
        intent.putExtra("sugar", sugar)
        intent.putExtra("milk", milk)
        startActivity(intent)
    }
}