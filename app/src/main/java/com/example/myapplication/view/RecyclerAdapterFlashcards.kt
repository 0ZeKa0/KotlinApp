package com.example.myapplication.view

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.view.menu.ListMenuItemView
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R

class RecyclerAdapterFlashcards(val description: ArrayList<String>,val word: ArrayList<String>) : RecyclerView.Adapter<RecyclerAdapterFlashcards.GorunumOlusturucu2>() {

    class GorunumOlusturucu2(itemView: View) :RecyclerView.ViewHolder(itemView){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GorunumOlusturucu2 {
        val inflater=LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.fragment_flashcards,parent,false)
        return GorunumOlusturucu2(view)
    }

    override fun onBindViewHolder(holder: GorunumOlusturucu2, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        return word.size
    }

}

