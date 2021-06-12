package com.example.myhomeapplicationwithkotlin

class Weather constructor(var town: String, var temperature : Int) //constructor можно опускать

//class Weather(val town: String = "Москва",  val temperature: Int = 15) можно задать сразу "по умолчанию"
//val w = Weather() тогда можно будет сразу так делать
//val w = Weather("Саратов") или так, а второй пойдет по умолчанию

var e = lily //видно объявленное вне класса

