package com.example.myapplication.view

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.databinding.ActivityMainBinding
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var auth: FirebaseAuth
    @SuppressLint("SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        auth= FirebaseAuth.getInstance()
        auth= Firebase.auth
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        println("onCreate fonksiyonu çağırıldı")


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


    fun giris(view: View){

        val mail=binding.mail.text.toString()
        val password=binding.Sifre.text.toString()

        auth.signInWithEmailAndPassword(mail,password).addOnCompleteListener { task->
            if (task.isSuccessful){
                Toast.makeText(this,"Hoşgeldiniz",Toast.LENGTH_LONG)
                val intent = Intent(applicationContext, MainActivity2::class.java)
                startActivity(intent)
                finish()
            }
        }.addOnFailureListener { exception->
            Toast.makeText(this,exception.localizedMessage,Toast.LENGTH_LONG).show()
        }


    }
    fun Kaydol(view: View){
        val intent = Intent(applicationContext, MainActivity3::class.java)
        startActivity(intent)
        finish()

    }
    fun SifremiUnuttum(view: View){
        val intent = Intent(applicationContext, MainActivity4::class.java)
        startActivity(intent)
        finish()

    }


}
