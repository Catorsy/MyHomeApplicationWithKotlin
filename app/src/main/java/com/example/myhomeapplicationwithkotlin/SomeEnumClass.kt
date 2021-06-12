package com.example.myhomeapplicationwithkotlin

enum class SomeEnumClass (val value : Int) {
    BMW(0), Audi(1), Lada(2) //если хотим им присвоить, например, инты, надо, чтобы оони были в конструкторе
}