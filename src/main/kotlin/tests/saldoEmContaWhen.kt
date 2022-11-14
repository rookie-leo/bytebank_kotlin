package main.kotlin

fun saldoEmContaWhen(saldo: Double) {
    when {
        saldo > 0.0 -> println("Saldo em conta positivo")
        saldo == 0.0 -> println("Saldo em conta zerado")
        else -> println("Saldo em conta negativo")
    }
}