package com.example.projetopalindromo.domain;

public class Palindromo {
    private String conteudo;

    public Palindromo(String content) {
        this.conteudo = content;
    }

    public boolean isPalindromo() {
        String txtInvertido = new StringBuilder(getConteudo()).reverse().toString();
        return txtInvertido.equalsIgnoreCase(getConteudo());
    }

    public String getConteudo() {
        return conteudo.toLowerCase();
    }
}
