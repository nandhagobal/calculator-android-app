package com.example.myapplication

import java.lang.ArithmeticException

class Calculator {
    fun add(num1: Double, num2: Double): Double {
        return num1 + num2;
    }

    fun subtract(num1: Double, num2: Double): Double {
        return num1 - num2
    }

    fun multiply(num1: Double, num2: Double) :Double {
        return num1*num2
    }

    fun divide(num1: Double, num2: Double): Double{
            return num1/num2
    }

    fun calculateMultipleOperation(operands: Array<Double>, operators: Array<Char>) : Double {
        var result =0.0
        result = operands[0]
        for(i in 1 until operands.size){
            var operator = operators[i-1]
            when (operator){
                '+' -> result = add(result,operands[i])
                '-' -> result = subtract(result,operands[i])
                '*' -> result = multiply(result,operands[i])
                '/' -> result = divide(result,operands[i])
            }

        }
        return result
    }


}
