package com.example.myapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class RecycleAdapter(val calisma_suresi: ArrayList<String>,val Ish: ArrayList<String>) : RecyclerView.Adapter<RecycleAdapter.GorunumOlusturucu>() {
    override fun getItemCount(): Int {

        return calisma_suresi.size

    }


    class GorunumOlusturucu(itemView: View) : RecyclerView.ViewHolder(itemView) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GorunumOlusturucu {
        val inflater=LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.fragment1,parent,false)
        return GorunumOlusturucu(view)
    }


    override fun onBindViewHolder(holder: GorunumOlusturucu, position: Int) {
        TODO("Not yet implemented")
    }
}
