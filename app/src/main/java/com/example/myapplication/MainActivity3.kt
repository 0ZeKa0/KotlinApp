package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.databinding.ActivityMain3Binding
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity3 : AppCompatActivity() {
    private lateinit var binding: ActivityMain3Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMain3Binding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    fun Kaydol(view: View){
        val intent=Intent(applicationContext,MainActivity::class.java)
        startActivity(intent)
        finish()
    }
}