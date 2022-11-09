package com.example.myapplication

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        try{

        }
        catch(e:Exception){
             e.printStackTrace()
        }
    }

    fun Giris(view: View){
        val intent = Intent(applicationContext, MainActivity2::class.java)
        startActivity(intent)
    }
    fun Kaydol(view: View){
        val intent = Intent(applicationContext,MainActivity3::class.java)
        startActivity(intent)

    }
    fun SifremiUnuttum(view: View){

    }

}