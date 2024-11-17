package com.azim.lab04

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.azim.lab04.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Step is used to link the UI created in XML to our Kotlin file
        // 3 step
        // Enable {viewBinding} in gradle.kts (module:app)
        // Initialize binding object
        // set content view to binding root
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        // btnSum function
        binding.btnSum.setOnClickListener {
            // Get input editText1 dan editText2 = binding.editText1.text.toString()
            // Convert data ke Integer = .toInt()
            val num1 = binding.editText1.text.toString().toInt()    // editText1
            val num2 = binding.editText2.text.toString().toInt()    // editText2
            // calculation process num 1 and num 2
            val sum = num1 + num2
            // Display result txtResult
            binding.txtResult.text = "Result : $sum"
        }

        // btnMinus function
        binding.btnMinus.setOnClickListener {
            val num1 = binding.editText1.text.toString().toInt()    // editText1
            val num2 = binding.editText2.text.toString().toInt()    // editText2
            val minus = num1 - num2
            binding.txtResult.text = "Result : $minus"
        }

        // btnProduct function
        binding.btnProduct.setOnClickListener {
            val num1 = binding.editText1.text.toString().toInt()    // editText1
            val num2 = binding.editText2.text.toString().toInt()    // editText2
            val product = num1 * num2
            binding.txtResult.text = "Result : $product"
        }

        // btnDivision function
        binding.btnDivision.setOnClickListener {
            val num1 = binding.editText1.text.toString().toDouble()    // editText1
            val num2 = binding.editText2.text.toString().toDouble()    // editText2
            val division = num1 / num2
            binding.txtResult.text = "Result : $division"
        }
    }
}