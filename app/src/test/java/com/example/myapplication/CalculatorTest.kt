package com.example.myapplication

import org.junit.Test

import org.junit.Assert.*
import java.util.function.Predicate.isEqual

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class CalculatorTest {
    @Test
    fun shouldReturnSumOfTwoOperandsAsResultWhenTwoOperandsIsGivenToAdditionFunction() {
        val calculator = Calculator();

        val result = calculator.Addition(2.0, 2.0)

        assertEquals(4.0,result,0.0)
    }

    @Test
    fun shouldReturnDifferenceOfTwoOperandsAsResultWhenTwoOperandsIsGivenToSubtractionFunction() {
        val calculator = Calculator()

        val result = calculator.subtraction(3.0, 2.0)

        assertEquals(1.0,result,0.0)
    }
}