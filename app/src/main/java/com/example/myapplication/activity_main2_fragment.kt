package com.example.myapplication

import android.R.attr.data
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil.setContentView
import androidx.fragment.app.Fragment
import com.example.myapplication.databinding.ActivityMain2Binding
import com.example.myapplication.databinding.FragmentActivityMain2FragmentBinding


class activity_main2_fragment : Fragment() {
    // TODO: Rename and change types of parameters

    private lateinit var binding: FragmentActivityMain2FragmentBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_activity_main2_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        fun ayarla(view: View){
            binding.ayarla.setOnClickListener{
                val intent = Intent(activity,MainActivity::class.java)
                startActivity(intent)
            }
        }
    }

}

