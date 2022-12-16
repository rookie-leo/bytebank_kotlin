package main.kotlin.br.com.alura.bytebank.tests

import main.kotlin.br.com.alura.bytebank.models.Autenticavel
import main.kotlin.br.com.alura.bytebank.models.SistemaInterno

fun testaHOF() {
    soma(1, 2, resultado = { valor ->
        println(valor)
    })
    somaReceiver(5, 7, resultado = {
        println(this)
    })

    val autenticavel = object : Autenticavel {
        val senha = 1234
        override fun autentica(senha: Int) = this.senha == senha
    }

    val sistemaInterno = SistemaInterno()

    sistemaInterno.entra(autenticavel, 1234, autenticado = {
        println("Realizar pagamento")
    })

    sistemaInterno.entraReceiver(autenticavel, 1234, autenticado = { pagamento() })
}


fun soma(a: Int, b: Int, resultado: (Int) -> Unit) {
    resultado(a + b)
}

fun somaReceiver(a: Int, b: Int, resultado: Int.() -> Unit) {
    val total = a + b
    total.resultado()
}