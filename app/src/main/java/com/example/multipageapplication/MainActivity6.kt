package com.example.multipageapplication

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity6 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main6)

        val coffeeType = intent.getStringExtra("coffee_type")
        val quantity = intent.getIntExtra("quantity", 1)
        val size = intent.getStringExtra("size")
        val sugar = intent.getStringExtra("sugar")
        val milk = intent.getStringExtra("milk")

        // Set the text of the TextView elements
        val textView7: TextView = findViewById(R.id.textView7)
        val textView8: TextView = findViewById(R.id.textView8)
        val textView9: TextView = findViewById(R.id.textView9)
        val textView10: TextView = findViewById(R.id.textView10)
        val textView11: TextView = findViewById(R.id.textView11)

        textView7.text = coffeeType
        textView8.text = "$quantity Orders"
        textView9.text = size
        textView10.text = sugar
        textView11.text = milk

        // Set up the buttons
        val backButton: Button = findViewById(R.id.button4)
        val confirmButton: Button = findViewById(R.id.button5)

        backButton.setOnClickListener {
            finish() // Go back to the previous activity
        }

        confirmButton.setOnClickListener {
            // Show the order placed dialog
            showOrderPlacedDialog()
        }
    }

    private fun showOrderPlacedDialog() {
        val dialog = OrderPlacedDialogFragment()
        dialog.show(supportFragmentManager, "OrderPlacedDialog")
    }
}