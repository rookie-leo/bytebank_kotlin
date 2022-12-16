package main.kotlin.br.com.alura.bytebank.tests

import main.kotlin.br.com.alura.bytebank.models.Endereco

fun testaScopeFunctions() {
    Endereco(logradouro = "Av Voluntarios da Patria", numero = 5035, cidade = "São Paulo")
        .run {
            "$logradouro, $numero, $cidade".uppercase()
        }.let(::println)

    val endereco = Endereco()
        .also { println("Criando um endereço") }
        .apply {
            logradouro = "Largo do Paissandu"
            numero = 13
            cidade = "São Paulo"
        }

    with(endereco) {
        "$logradouro, $cidade".uppercase()
    }.let { println(it) }

    listOf(
        endereco,
        Endereco(complemento = "casa", logradouro = "Av Voluntarios da Patria"),
        Endereco(logradouro = "Av Voluntarios da Patria"),
        Endereco(complemento = "Apartamento", logradouro = "Av Voluntarios da Patria"),
        Endereco(logradouro = "Av Voluntarios da Patria"),
        Endereco(complemento = " ", logradouro = "Av Voluntarios da Patria")
    )
        .filter { it.complemento.isNotEmpty() }
        .let(::println)
}