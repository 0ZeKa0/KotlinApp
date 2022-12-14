package com.example.myapplication.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.myapplication.model.kisi_kayitlari

class MainActivity3ViewModel: ViewModel() {

    val kisikayitlari = MutableLiveData<List<kisi_kayitlari>>()

}