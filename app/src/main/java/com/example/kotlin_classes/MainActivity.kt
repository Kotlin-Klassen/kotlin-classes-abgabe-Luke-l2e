package com.example.kotlin_classes

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlin_classes.abschluss_abgabe.Main

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Main().main()
    }
}