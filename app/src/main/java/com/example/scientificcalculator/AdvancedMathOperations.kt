package com.example.scientificcalculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlin.math.sqrt
import kotlin.math.ln


class AdvancedMathOperations : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_advanced_math_operations)

        val btn5: Button = findViewById(R.id.button5)

        btn5.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        val num1: EditText = findViewById(R.id.editTextNumber2)
        val btn1: Button = findViewById(R.id.button1)
        val btn2: Button = findViewById(R.id.button2)
        val btn3: Button = findViewById(R.id.button3)
        val resetbtn: Button = findViewById(R.id.button)
        val sol: TextView = findViewById(R.id.textView4)

        btn1.setOnClickListener {
            val x = num1.text.toString().toInt()
            val res = x*x
            sol.text = res.toString()
        }
        btn2.setOnClickListener {
            val x = num1.text.toString().toInt().toDouble()
            val res = sqrt(x)
            sol.text = res.toString()
        }
        btn3.setOnClickListener {
            val x = num1.text.toString().toInt().toDouble()
            val res = ln(x)
            sol.text = res.toString()
        }
        resetbtn.setOnClickListener {
            sol.text = ""
        }

    }
}