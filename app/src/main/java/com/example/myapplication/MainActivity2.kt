package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils.replace
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.databinding.ActivityMain2Binding
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class MainActivity2 : AppCompatActivity() {
    private lateinit var binding: ActivityMain2Binding
    private lateinit var recyclerView: RecyclerView
    private lateinit var auth: FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        auth= FirebaseAuth.getInstance()
        auth= Firebase.auth
        super.onCreate(savedInstanceState)
        binding= ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)
        ReplaceFragment(home())
        binding.buttomNavigation.setOnItemReselectedListener{
            when(it.itemId){
                R.id.home->ReplaceFragment(home())
                R.id.flashcards->ReplaceFragment(flashcards())
                R.id.profile->ReplaceFragment(profile())
                R.id.signout->{
                    auth.signOut()
                    val intent = Intent(applicationContext,MainActivity::class.java)
                    startActivity(intent)
                    finish()

                }
            }
        }
    }
    private fun ReplaceFragment(fragment: Fragment){
        val fragmentManager=supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.fl_wrapper,fragment)

    }
}