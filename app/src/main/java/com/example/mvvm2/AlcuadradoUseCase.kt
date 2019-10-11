package com.example.mvvm2

class AlcuadradoUseCase {

    companion object {

        fun alCuadrado(data: String): String {
            return (data.toDouble() * data.toDouble()).toString()
        }
    }
}