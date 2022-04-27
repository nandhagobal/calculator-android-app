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

//    @Throws(ArithmeticException::class)
    fun divide(num1: Double, num2: Double): Double{
            return num1/num2
    }


    }
