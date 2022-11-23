package com.example.myapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Recycler
import androidx.recyclerview.widget.RecyclerView.ViewHolder

class RecycleAdapter(val calisma_suresi: ArrayList<String>,val Ish: ArrayList<String>) : RecyclerView.Adapter<RecycleAdapter.GorunumOlusturucu>() {
    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }


    class GorunumOlusturucu(itemView: View) : RecyclerView.ViewHolder(itemView) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GorunumOlusturucu {
        val inflater=LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.fragment_2,parent,false)
        return GorunumOlusturucu(view)
    }


    override fun onBindViewHolder(holder: GorunumOlusturucu, position: Int) {
        TODO("Not yet implemented")
    }
}
