package com.example.myhomeapplicationwithkotlin

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.myhomeapplicationwithkotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding //подключить buildFeatures

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root) //теперь можно обратиться к полям лайаута просто через бандинг

        binding.textView.setOnClickListener {
            Toast.makeText(applicationContext, "On Text view clicket", Toast.LENGTH_SHORT).show()
        }

        val textWatcher = object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
                //TODO("Not yet implemented")
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                //TODO("Not yet implemented")
            }

            override fun afterTextChanged(s: Editable?) {
                //TODO("Not yet implemented")
            } //анонимные классы начинаются с object
            //тип TextWatcher

        }

        binding.editTextTextEmailAddress.addTextChangedListener(textWatcher)

        SomeClass.a
        SomeSinglton.b

        //switch стал when
        val text = binding.textView.text
        when (text) {
            "hello" -> {
                Toast.makeText(applicationContext, "Hello", Toast.LENGTH_SHORT).show()
                //break больше нет! Они по умолчанию
            }
            "goodbye" -> {
                Toast.makeText(applicationContext, "Goodbye", Toast.LENGTH_SHORT).show()
            }
            "2", "3" -> {
                Toast.makeText(applicationContext, "Numbers", Toast.LENGTH_SHORT).show()
            }
            else -> {
            //дефолтное значение
                Toast.makeText(applicationContext, "?", Toast.LENGTH_SHORT).show()
            }
            //if в котлине принято заменять на when
        }

        val carType = SomeEnumClass.Audi //это сам енам
        val carTypeInt = SomeEnumClass.Audi.value //а это инт

        
    }
}