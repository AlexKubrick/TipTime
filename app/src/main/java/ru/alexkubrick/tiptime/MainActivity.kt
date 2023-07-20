package ru.alexkubrick.tiptime

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import ru.alexkubrick.tiptime.databinding.ActivityMainBinding
import java.text.NumberFormat

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.tipResult.setVisibility(View.GONE)

        binding.calculateButton.setOnClickListener{ calculateTip() }
    }


    private fun calculateTip() {
       
    }

    private fun displayTip(tip : Double) {
        val formattedTip = NumberFormat.getCurrencyInstance().format(tip)
        binding.tipResult.text = getString(R.string.tip_amount, formattedTip)
    }
}