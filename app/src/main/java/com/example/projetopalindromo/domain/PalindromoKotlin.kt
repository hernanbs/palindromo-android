package com.example.projetopalindromo.domain

import java.text.Normalizer

data class PalindromoKotlin constructor(private val _conteudo: String){
    val conteudo: String = _conteudo.trim()
        get() {
            return field.toLowerCase()
        }

    fun isPalindromo(): Boolean {
        var normalizePhrase = Normalizer.normalize(conteudo, Normalizer.Form.NFD)
                                        .replace("[^\\p{ASCII}]".toRegex(), "")

        val phrase = normalizePhrase.replace("\n", "")
                                    .replace(" ", "")

        return phrase == phrase.toString().reversed()
    }
}