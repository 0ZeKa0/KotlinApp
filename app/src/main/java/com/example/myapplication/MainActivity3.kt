package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.databinding.ActivityMain3Binding
import com.example.myapplication.databinding.ActivityMainBinding
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.ktx.Firebase

class MainActivity3 : AppCompatActivity() {
    private lateinit var binding: ActivityMain3Binding
    private lateinit var auth: FirebaseAuth
    private lateinit var databaseReference: DatabaseReference

    override fun onCreate(savedInstanceState: Bundle?) {
        auth= FirebaseAuth.getInstance()
        auth=Firebase.auth
        super.onCreate(savedInstanceState)
        binding=ActivityMain3Binding.inflate(layoutInflater)
        setContentView(binding.root)

        databaseReference= FirebaseDatabase.getInstance().getReference("Users")
    }

    fun Kaydol(view: View){
        val uid= auth.currentUser?.uid

        val name=binding.isim.text.toString()
        val surname=binding.soyisim.text.toString()
        val e_mail=binding.mail2.text.toString()
        val password=binding.sifre2.text.toString()

        val user=kisi_kayitlari(name,surname,e_mail)

        auth.createUserWithEmailAndPassword(e_mail, password).addOnCompleteListener { task->
           if (task.isSuccessful){
               Toast.makeText(this,"Success.",Toast.LENGTH_LONG).show()

               val intent=Intent(applicationContext,MainActivity::class.java)
               startActivity(intent)
               finish()

           }

        }.addOnFailureListener { exception->
            Toast.makeText(this,exception.localizedMessage,Toast.LENGTH_LONG).show()
        }

    }
}