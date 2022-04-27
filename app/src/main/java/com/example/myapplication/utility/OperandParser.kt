package com.example.myapplication.utility

class OperandParser {
    fun parse(expression:String):ArrayList<Double>{
        var operands = ArrayList<Double>()
        val regex = Regex("[+*/-]")
        var operandStringArry = expression.split(regex)
        for(operand in operandStringArry){
            operands.add(operand.toDouble())
        }
        return operands
    }
}