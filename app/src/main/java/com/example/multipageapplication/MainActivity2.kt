package com.example.multipageapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val coffeeType = intent.getStringExtra("coffee_type")

        val oneOrderButton: Button = findViewById(R.id.button)
        val twoOrdersButton: Button = findViewById(R.id.button2)
        val threeOrdersButton: Button = findViewById(R.id.button3)
        val backButton: Button = findViewById(R.id.button4)

        oneOrderButton.setOnClickListener {
            val intent = Intent(this, MainActivity3::class.java)
            intent.putExtra("coffee_type", coffeeType)
            intent.putExtra("quantity", 1)
            startActivity(intent)
        }

        twoOrdersButton.setOnClickListener {
            val intent = Intent(this, MainActivity3::class.java)
            intent.putExtra("coffee_type", coffeeType)
            intent.putExtra("quantity", 2)
            startActivity(intent)
        }

        threeOrdersButton.setOnClickListener {
            val intent = Intent(this, MainActivity3::class.java)
            intent.putExtra("coffee_type", coffeeType)
            intent.putExtra("quantity", 3)
            startActivity(intent)
        }

        backButton.setOnClickListener {
            finish()
        }
    }
}