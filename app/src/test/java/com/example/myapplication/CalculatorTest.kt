package com.example.myapplication

import org.junit.Test

import org.junit.Assert.*
import java.util.function.Predicate.isEqual

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@Suppress("DEPRECATION")
class CalculatorTest {
    @Test
    fun shouldReturnSumOfTwoOperandsAsResultWhenTwoOperandsIsGivenToAdditionFunction() {
        val calculator = Calculator();

        val result = calculator.Addition(2.0, 2.0)

        assertEquals(4.0,result,0.0)
    }


}