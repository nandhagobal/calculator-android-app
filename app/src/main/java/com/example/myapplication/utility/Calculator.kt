package com.example.myapplication.utility

import com.example.myapplication.Exception.InSufficientOperatorException


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

    fun calculateMultipleOperation(operands: ArrayList<Double>, operators: ArrayList<Char>) : Double {
        var result =0.0
        if(operands.size > operators?.size+1) throw InSufficientOperatorException()
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
