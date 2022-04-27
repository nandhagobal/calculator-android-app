package com.example.myapplication.Activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.example.myapplication.R
import com.example.myapplication.utility.Calculator
import com.example.myapplication.utility.OperandParser

class MainActivity : AppCompatActivity() {

    private lateinit var equalButton: Button
    private lateinit var displayTextView: TextView
    private lateinit var deleteButton : Button
    private lateinit var decimalButton : Button
    private var isDot = false
    private val calculator = Calculator()
    private val operandParser = OperandParser()

    private var operations= ArrayList<Char>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        displayTextView = findViewById(R.id.textBox)
        equalButton = findViewById(R.id.equal)
        deleteButton = findViewById(R.id.del)
        decimalButton = findViewById(R.id.dot)



        deleteButton.setOnClickListener{
            val expression = displayTextView.text
            displayTextView.text = expression.substring(0,expression.length-1)
        }

        equalButton.setOnClickListener {
            val expression  = displayTextView.text
            val operands = operandParser.parse(expression.toString())
            var result = calculator.calculateMultipleOperation(operands, operations).toString()
            operations.removeAll(operations)
            if(result.endsWith(".0")) result = result.substring(0,result.length-2)
            displayTextView.text = result
        }

        decimalButton.setOnClickListener{
            if(!isDot) {
                displayTextView.append(".")
                isDot = true
            }
        }

    }



    fun onDigitButtonClicked(view: View) {
        displayTextView.append((view as Button).text)
    }

    fun onClear(view: View) {
        displayTextView.text = ""
    }

    fun onOperatorButtonClicked(view: View) {
        val expression =displayTextView.text

        if(expression.isNotEmpty()) {
            if (!expression.endsWith("*") && !expression.endsWith("/") && !expression.endsWith("+") && !expression.endsWith("-") && !expression.endsWith("."))
            {
                displayTextView.append((view as Button).text)
                operations.add(view.text[0])
                isDot = false
            }
        }
    }



}