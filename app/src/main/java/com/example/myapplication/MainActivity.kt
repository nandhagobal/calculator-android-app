package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import java.lang.ArithmeticException

class MainActivity : AppCompatActivity() {

    private lateinit var equal: Button
    private lateinit var textView: TextView
    private lateinit var delete : Button
    private lateinit var dot : Button
    private var isDot = false

    private var operation: Char? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textView = findViewById(R.id.textBox)
        equal = findViewById(R.id.equal)
        delete = findViewById(R.id.del)
        dot = findViewById(R.id.dot)



        delete.setOnClickListener{
            val expression = textView.text
            textView.text = expression.substring(0,expression.length-1)
        }

        equal.setOnClickListener {
            var result =0.0
//            (text,operation)
            when (operation) {
                '+' -> {
                    val operand = textView.text.split(operation.toString())
                    result = operand[0].toDouble() + operand[1].toDouble()
                    textView.text = result.toString()
                }
                '-' -> {
                    val operand = textView.text.split(operation.toString())
                    result = operand[0].toDouble() - operand[1].toDouble()
                    textView.text = result.toString()
                }
                '/' -> {
                    try {
                        val operand = textView.text.split(operation.toString())
                        result = operand[0].toDouble() / operand[1].toDouble()
                        textView.text = result.toString()
                    } catch (e: ArithmeticException) {
                        textView.text = "Infinity"
                    }
                }
                '*' -> {
                    val operand = textView.text.split(operation.toString())
                    result = operand[0].toDouble() * operand[1].toDouble()
                    textView.text = result.toString()
                }
            }
            if(textView.text.endsWith(".0")){
                val expression = textView.text
                textView.text = expression.substring(0,expression.length-2)
            }
            operation = null
        }

        dot.setOnClickListener{
            if(!isDot) {
                textView.append(".")
                isDot = true
            }
        }

    }



    fun onDigitButtonClicked(view: View) {
        textView.append((view as Button).text)
    }

    fun onClear(view: View) {
        textView.text = ""
    }

    fun onOperator(view: View) {
        val expression =textView.text
        if(expression.isNotEmpty()) {
            if (!expression.contains("*") && !expression.contains("/") && !expression.contains("+") && !expression.contains("-"))
            {
                textView.append((view as Button).text)
                operation = view.text[0]
                isDot = false
            }
        }
    }



}