package com.example.myapplication

import android.annotation.SuppressLint
import android.content.DialogInterface
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    @SuppressLint("SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        println("onCreate fonksiyonu çağırıldı")



        try{
        val veritabani = this.openOrCreateDatabase("Kullanici", MODE_PRIVATE,null)
            veritabani.execSQL("CREATE TABLE IF NOT EXISTS kullanici_bilgileri (id INTEGER PRIMARY KEY, Ad VARCHAR, Soyad VARCHAR, Mail VARCHAR, Sifre VARCHAR)")
            veritabani.execSQL("CREATE TABLE IF NOT EXISTS calisma_bilgileri(id INTEGER PRIMARY KEY, Mail VARCHAR, Sure DATETIME, Ish VARCHAR)")
            veritabani.execSQL("INSERT INTO kullanici_bilgileri(Ad,Soyad,Mail,Sifre) VALUES('Zehra','Karakaya','zehrakarakayazeze@gmail.com','1234')")
        }
        catch(e:Exception){
             e.printStackTrace()
        }
    }

    override fun onStart() {
        super.onStart()
        println("onStart fonksiyonu çağırıldı")

    }

    override fun onRestart() {
        super.onRestart()
        println("onRestart fonksiyonu çağırıldı")

    }
    override fun onResume() {
        super.onResume()
        println("onResume fonksiyonu çağırıldı")

    }

    override fun onStop() {
        super.onStop()
        println("onStop fonksiyonu çağırıldı")

    }

    override fun onPause() {
        super.onPause()
        println("onPause fonksiyonu çağırıldı")

    }

    override fun onDestroy() {
        super.onDestroy()
        println("onDestroy fonksiyonu çağırıldı")

    }


    fun Giris(view: View){

    }
    fun Kaydol(view: View){
        val intent = Intent(applicationContext,MainActivity3::class.java)
        startActivity(intent)
        finish()

    }
    fun SifremiUnuttum(view: View){
        val intent = Intent(applicationContext,MainActivity4::class.java)
        startActivity(intent)
        finish()

    }


}
