package main.kotlin

import main.kotlin.br.com.alura.bytebank.models.Conta

fun testaCopiaEReferencia(conta1: Conta) {
    var conta = conta1

    println("Titular conta: ${conta.titular}")//Titular conta: Baptista
    conta.titular.nome = "D.Va"
    println("Titular conta: ${conta.titular}")//Titular conta: D.Va
    println("Titular conta1: ${conta1.titular}")//Titular conta: D.Va
 }