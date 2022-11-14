package main.kotlin.br.com.alura.bytebank.models

interface Autenticavel {

    fun autentica(senha: Int): Boolean

}