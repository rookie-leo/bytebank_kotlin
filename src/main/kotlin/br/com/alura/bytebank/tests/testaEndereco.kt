package main.kotlin.br.com.alura.bytebank.tests

import main.kotlin.br.com.alura.bytebank.models.Endereco

fun testaEndereco() {

    val endereco = Endereco(logradouro = "Rua dos Bobos", numero = 0, bairro = "Jardim Mary Jane", cep = "00000-000")
    val endereco2 = Endereco(logradouro = "Rua das Raposas", numero = 4, bairro = "Jardim Mary Jane", cep = "00000-000")
    val endereco3 = Endereco(logradouro = "Rua das Raposas", numero = 4, bairro = "Jardim Mary Jane", cep = "00000-000")

    println(endereco)
    println()
    println(endereco2)
    println()
    println(endereco3)
    println()

    println(endereco.equals(endereco2))
    println(endereco3.equals(endereco2))

}