package com.example.myapplication

import com.example.myapplication.utility.OperandParser
import org.junit.Assert
import org.junit.Assert.assertEquals
import org.junit.Test

class OperandParserTest {
    @Test
    fun shouldReturnArrayOfOperandsWhenExpressionAsStringIsGivenToParserFunction() {
        val operandParser = OperandParser()

        val result = operandParser.parse("4/6-5+6*1")


        assertEquals(result, listOf(4.0,6.0,5.0,6.0,1.0))
    }
}