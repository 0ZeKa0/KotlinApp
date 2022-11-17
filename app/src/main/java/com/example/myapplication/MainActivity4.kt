package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.os.CountDownTimer
import android.view.View
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.databinding.ActivityMain4Binding
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity4 : AppCompatActivity() {
    private lateinit var binding: ActivityMain4Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMain4Binding.inflate(layoutInflater)
        setContentView(binding.root)

    }

    fun Gonder(view: View){

        val intent= Intent(applicationContext,MainActivity::class.java)
        startActivity(intent)
        finish()

    }
    fun Sifre(sifre:String):String {

       return sifre
    }
}