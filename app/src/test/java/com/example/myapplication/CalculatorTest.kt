package com.example.myapplication

import com.example.myapplication.Exception.InSufficientOperatorException
import com.example.myapplication.utility.Calculator
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

    @Test
    fun shouldReturnMultipleOfTwoOperandsAsResultWhenTwoOperandsIsGivenToMultiplyFunction() {
        val calculator = Calculator()

        val result = calculator.multiply(2.0, 1.0)

        assertEquals(2.0,result,0.0)
    }

    @Test
    fun shouldReturnDivisionOfTwoOperandsAsResultWhenTwoOperandsIsGivenToDivideFunction() {
        val calculator = Calculator()

        val result = calculator.divide(2.0, 1.0)

        assertEquals(2.0,result,0.0)
    }

    @Test
    fun shouldReturnInfinityWhenZeroASSecondOperandIsGivenToDivideFunction() {
        val calculator = Calculator()

        val result = calculator.divide(3.0, 0.0)

        assertEquals(Double.POSITIVE_INFINITY,result,0.0)

    }

    @Test
    fun shouldReturnSingleValueAsResultWhenArrayOfOperandsAndOperationsIsGivenToCalculateMultipleOperationFunction() {
        val calculator = Calculator()

        val result = calculator.calculateMultipleOperation(
            ArrayList(listOf(2.0, 3.0, 4.0, 5.0, 6.0)),
            ArrayList(listOf('+', '+', '-', '+'))
        )

        assertEquals(10.0,result,0.0)

    }

    @Test(expected = InSufficientOperatorException::class)
    fun shouldThrowInSufficientOperatorExceptionWhenNumberOfOperatorIsTwoOrMoreLessThenNumberOfOperands() {
        val calculator = Calculator()

        val result =
            calculator.calculateMultipleOperation(ArrayList(listOf(1.0, 2.0, 3.0, 4.0)),
                ArrayList(listOf('+', '-'))
            )
    }
}