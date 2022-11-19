package com.example.myapplication

import android.annotation.SuppressLint
import android.os.Bundle
import android.os.CountDownTimer
import android.view.LayoutInflater
import android.view.View
import android.widget.FrameLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import com.example.myapplication.databinding.ActivityMain2Binding
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity2 : AppCompatActivity() {
    private lateinit var binding: ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

    }


    fun Ekle(view: View){

            val FragmentManager=supportFragmentManager
            val FragmentTransaction=FragmentManager.beginTransaction()
            val FirstFragment=activity_main2_fragment()

            FragmentTransaction.replace(R.id.FrameLayout,FirstFragment).commit()

    }
    fun liste(view: View){

    }
    fun ben(view: View){

    }
}