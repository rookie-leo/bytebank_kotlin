package main.kotlin.br.com.alura.bytebank.tests

import main.kotlin.br.com.alura.bytebank.models.Endereco

fun testaExceptions() {
    val endereco: Endereco? = Endereco(logradouro = "rua dos bobos", complemento = "casa")
    val logradouroNovo: String? = endereco?.logradouro

    endereco?.let {
        println(it.logradouro?.length)
        val tamanhoComplemento = it.complemento?.length ?: throw IllegalStateException("Complemento não pode ser nulo!")
        println(tamanhoComplemento)
    }

    safeCast(1)
    safeCast("")
}

fun safeCast(valor: Any) {
    val numero: Int? = valor as? Int
    println(numero)
}