package com.example.myhomeapplicationwithkotlin

import android.util.Log
import androidx.constraintlayout.solver.ArrayLinkedVariables
import java.util.*

// === проверка на ссылочность
//все переменные в котлине должны быть чем-то инициализированы, кроме случае private lateinit var som: String
//но потом надо обращаться к ней после инициализации, а то всё упадет

val lily = "Lily" //что объявили вне класса, видно вообще везде. То же касается и функций.

open class SomeClass (private var name : Double) { //по умолчанию классы не наследуемые. Опен - чтобы можно было наследовать

    init { //продолжение конструктора, тут работаем с переменными

    }

    var appVersion : String = ""
    get () {
        return doSomething(1, 2.0, "a", "b").toString()
    } set (value) {
        //value - то, что хотим "засеттить"
        field = value //field - автоматически генерируемое поле, которое непосредственно хранит значение свойства
    }

    fun doSomething (a : Int, b: Double, vararg strings: String) : Boolean { //vararg - переменное число аргументов
        //внутри функции варарг - как массив
        val byteArray = arrayOf<Byte>(1, 3 ,5) //более "новый" способ //это может быть ссылкой, Integer []
        val byteArray2 = Array <Byte?> ( 0) {0} //данные без ? нулл быть не могут. В {} по дефолту все нули
        val arrayList = ArrayList<String>()
        val arrayList2  = arrayListOf<Int>(3, 7, 9) //можно не объявлять тип явно

        val bytes = ByteArray(0) //массив исключительно примитивов. типа int [].
        //можно просто так написать.
        byteArray.forEach {
            Log.i("SomeClass", it.toString()) //это будет 1, 3, 5
        } //it можно заменить на любое явное название, особенно хорошо если сложные циклы

        // lily.toInt() //только будет крэш, потому что у нас там не число

        for (i in byteArray.indices) {  //пробегаем по индексу
            Log.i("SomeClass", byteArray[i].toString())
            if (i == 2) break
        }

        for (value in byteArray) {
            Log.i("SomeClass", value.toString())
        }

        for (i in 1..10) {
            Log.i("SomeClass", i.toString()) //апечатается от 1 до 10
        }

        for (i in 1 until 10) { //это доо 9ти, не включаем 10
            Log.i("SomeClass", i.toString()) //апечатается от 1 до 10
        }

        for(i in 10 downTo 1 step 2) { //это от 10 до 1 с шатом 5. Напечаетает 5 значений.
            print("Hello Kotlin!")
        }

        var length = arrayList2?.size //? значит, что если val arrayList2 null, код дальше не сработает
        var length2 = arrayList2!!.size // !! берем ответственность на себя и говорим, что здесь не нулл

        fun secondFun (a: Int, b: Int, isShouldConnect: Boolean? = false){

        }
        //можно вызвать так и так:
        secondFun(10, 20) //тут внутри будет фолс
        secondFun(10, 20, true)

        val someData1 = SomeeDataClass(1, 2.0)
        val someData2 = SomeeDataClass(2, 3.0)
        val equals = someData1 == someData2
        val someData3 = someData2 //это будут не ссылочные типы, а как примитивы, это отдельная ячейка памяти!

        return true
    }

    companion object { //своебразная замена статики
        var a = ""
        //к переменным внутри можно обращаться через имя класса
    }

    inner class InnerClass () { //чтобы обращаться к переменным внутри родителя, надо сделать его иннер
        fun innerFun() {
            name = 55.0

        }

        fun doSomething() {
            val name = getFullName("com.example.", applicationName)
                    //легко обратились к файлу
        }

    }


}