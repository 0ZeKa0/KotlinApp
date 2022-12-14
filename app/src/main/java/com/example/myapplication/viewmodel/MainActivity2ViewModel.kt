package com.example.myapplication.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.myapplication.model.calisma_kayitlari

class MainActivity2ViewModel: ViewModel() {
    val calisma_sureleri= MutableLiveData<List<calisma_kayitlari>>()

}