package com.example.scientificcalculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlin.math.pow

class ArithmeticOperations : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_arithmetic_oprations)

        val num1: EditText = findViewById(R.id.editTextNumber2)
        val num2: EditText = findViewById(R.id.editTextNumber3)
        val btn1: Button = findViewById(R.id.button1)
        val btn2: Button = findViewById(R.id.button2)
        val btn3: Button = findViewById(R.id.button3)
        val btn4: Button = findViewById(R.id.button4)
        val btn6: Button = findViewById(R.id.button6)
        val btn7: Button = findViewById(R.id.button7)
        val resetbtn: Button = findViewById(R.id.button)
        val sol: TextView = findViewById(R.id.textView4)

        btn1.setOnClickListener {
            val x = num1.text.toString().toInt()
            val y = num2.text.toString().toInt()
            val res = x + y
            sol.text = res.toString()
        }
        btn2.setOnClickListener {
            val x = num1.text.toString().toInt()
            val y = num2.text.toString().toInt()
            val res = x - y
            sol.text = res.toString()
        }
        btn3.setOnClickListener {
            val x = num1.text.toString().toInt()
            val y = num2.text.toString().toInt()
            val res = x * y
            sol.text = res.toString()
        }
        btn4.setOnClickListener {
            val x = num1.text.toString().toInt()
            val y = num2.text.toString().toInt()
            val res = x / y
            sol.text = res.toString()
        }
        btn6.setOnClickListener {
            val x = num1.text.toString().toInt()
            val y = num2.text.toString().toInt()
            val res = x % y
            sol.text = res.toString()
        }
        btn7.setOnClickListener {
            val x = num1.text.toString().toDouble()
            val y = num2.text.toString().toInt()
            val res = x.pow(y)
            sol.text = res.toString()
        }
        resetbtn.setOnClickListener {
            sol.text = ""
        }

        val btn5: Button = findViewById(R.id.button5)

        btn5.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}