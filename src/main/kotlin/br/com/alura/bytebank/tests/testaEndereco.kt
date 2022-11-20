package main.kotlin.br.com.alura.bytebank.tests

import main.kotlin.br.com.alura.bytebank.models.Endereco

fun testaEndereco() {

    val endereco = Endereco(logradouro = "Rua dos Bobos", numero = 0, bairro = "Jardim Mary Jane")

    println(endereco)

}