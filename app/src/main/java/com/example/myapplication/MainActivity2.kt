package com.example.myapplication

import android.os.Bundle
import android.os.CountDownTimer
import android.view.LayoutInflater
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.databinding.ActivityMain2Binding
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity2 : AppCompatActivity() {
    private lateinit var binding: ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        object: CountDownTimer(10000,1000){
            override fun onTick(p0: Long) {
                binding.textView3.setText("Kalan:${p0/1000}")

            }

            override fun onFinish() {
                binding.textView3.setText("Kalan:0")
            }

        }.start()
    }
}