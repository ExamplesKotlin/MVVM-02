package com.example.mvvm2

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainModelView : ViewModel() {

    private lateinit var resultado: MutableLiveData<String>

    constructor() {
        resultado = MutableLiveData<String>()
    }

    fun getResultado(): LiveData<String> {
        return resultado
    }

    fun alCuadrado(data: String) {
        resultado.value(AlcuadradoUseCase.alCuadrado(data))
    }

}