package com.example.customlistview

import android.os.Bundle
import android.widget.GridView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class CustomGridLayoutExample : AppCompatActivity() {
    lateinit var courseGV: GridView
    lateinit var courseList: List<GridViewModel>

    /*
            Images:-
            1. C++
            2. Kotlin
            3. Java
            4. Android Studio
     */

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_custom_grid_layout_example)

    }
}