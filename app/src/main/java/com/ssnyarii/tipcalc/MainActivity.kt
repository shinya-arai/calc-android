package com.ssnyarii.tipcalc

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        infoTextView.visibility = View.INVISIBLE

        calcurateButton.setOnClickListener {
            // Bill
            val bill = billEditText.text.toString().toDouble()
            // Tip Percentage
            val tipPercentage = tipPercentageEditText.text.toString().toDouble()
            // Tip
            val tip = bill * tipPercentage / 100
            // Total
            val total = bill + tip

            infoTextView.visibility = View.VISIBLE
            // set info text
            infoTextView.text = "Tip: ${doubleToDollar(tip)} Total: ${doubleToDollar(total)}"
        }

    }

    private fun doubleToDollar(number: Double): String {
        return String.format("$ %.1f", number)
    }
}
