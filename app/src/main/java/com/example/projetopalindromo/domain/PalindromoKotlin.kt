package com.example.projetopalindromo.domain

data class PalindromoKotlin constructor(private val _conteudo: String){
    val conteudo: String = _conteudo
        get() {
            return field.toLowerCase()
        }

    fun isPalindromo(): Boolean {
        return conteudo == conteudo.toString().reversed()
    }
}