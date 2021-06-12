package com.example.myhomeapplicationwithkotlin

object Repository { //заменили класс на обджект - сделали синглтон

    private val weatherList: List<Weather>

    init { //этот блок выполняется при создании объекта
        weatherList = listOf(Weather("Москва", 15))
    }

    fun getWeather(): List<Weather> { //после двоеточия - возвращаемое значение
        return weatherList
    }

    fun getItemCount() = weatherList.size //когда выражение в одну строчку, можно прочто через равно без фигурных скобок
            //override пишется просто перед фун

}

