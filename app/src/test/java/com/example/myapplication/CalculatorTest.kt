package com.example.myapplication

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class CalculatorTest {
    @Test
    fun shouldReturnSumOfTwoOperandsAsResultWhenTwoOperandsIsGivenToAddFunction() {
        val calculator = Calculator();

        val result = calculator.add(2.0, 2.0)

        assertEquals(4.0,result,0.0)
    }

    @Test
    fun shouldReturnDifferenceOfTwoOperandsAsResultWhenTwoOperandsIsGivenToSubtractFunction() {
        val calculator = Calculator()

        val result = calculator.subtract(3.0, 2.0)

        assertEquals(1.0,result,0.0)
    }


}