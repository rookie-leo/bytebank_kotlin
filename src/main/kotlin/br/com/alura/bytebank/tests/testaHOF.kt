package main.kotlin.br.com.alura.bytebank.tests

import main.kotlin.br.com.alura.bytebank.models.Autenticavel
import main.kotlin.br.com.alura.bytebank.models.SistemaInterno

fun testaHOF() {
    soma(1, 2, resultado = (::println))

    val autenticavel = object : Autenticavel {
        val senha = 1234
        override fun autentica(senha: Int) = this.senha == senha
    }

    SistemaInterno().entra(autenticavel, 1234, autenticado = {
        println("Realizar pagamento")
    })
}


fun soma(a: Int, b: Int, resultado: (Int) -> Unit) {
    resultado(a + b)
}