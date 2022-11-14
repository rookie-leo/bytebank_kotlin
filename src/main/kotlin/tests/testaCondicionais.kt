package main.kotlin

fun testaCondicionais(saldo: Double, titular: String, numeroConta: Int)  {
    var saldo1 = saldo
    println("Adicionando valor na conta!")
    saldo1 += 250.0

    println("Titular da conta $titular")
    println("Número da conta $numeroConta")
    println("Saldo em conta $saldo1")

    saldoEmContaIf(saldo1)

    println("Sacando valor na conta!")
    saldo1 -= 250.0

    saldoEmContaWhen(saldo1)

    println("Sacando valor na conta!")
    saldo1 -= 250.0

    saldoEmContaIf(saldo1)
}