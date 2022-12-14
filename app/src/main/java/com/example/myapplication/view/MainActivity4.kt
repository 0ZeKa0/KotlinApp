package com.example.myapplication.view

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.databinding.ActivityMain4Binding
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class MainActivity4 : AppCompatActivity() {
    private lateinit var binding: ActivityMain4Binding
    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        auth=FirebaseAuth.getInstance()
        auth=Firebase.auth
        super.onCreate(savedInstanceState)
        binding=ActivityMain4Binding.inflate(layoutInflater)
        setContentView(binding.root)

    }

    fun Gonder(view: View){

        val e_mail=binding.mail2.text.toString()

        Firebase.auth.sendPasswordResetEmail(e_mail)
            .addOnSuccessListener { task ->

                    Toast.makeText(this,"E-mail sent.",Toast.LENGTH_LONG).show()
                    val intent= Intent(applicationContext, MainActivity::class.java)
                    startActivity(intent)
                    finish()

            }.addOnFailureListener { exception->
                Toast.makeText(this,exception.localizedMessage, Toast.LENGTH_LONG).show()}


    }

}