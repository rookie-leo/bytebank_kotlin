package main.kotlin.br.com.alura.bytebank.tests

import main.kotlin.br.com.alura.bytebank.models.Endereco

fun testaWith() {
    with(Endereco()) {
        logradouro = "Av Voluntários da Patria"
        bairro = "Santana"
        cidade = "São Paulo"
        estado = "SP"
        complemento = "apartamento"
        completo()
    }.let { println(it) }
}