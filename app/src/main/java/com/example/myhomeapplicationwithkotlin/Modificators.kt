package com.example.myhomeapplicationwithkotlin

class Modificators {
    private val first: String = "first"// видно только внутри класса Modificators
    protected val second: String = "second"// видно внутри Modificators и его наследников
    val third: String = "third"// public по умолчанию — видно везде

    protected class Inner {
        // класс виден только наследникам Modificators
        private val fourth: String = "fourth"// видно только внутри класса Inner
    }
}