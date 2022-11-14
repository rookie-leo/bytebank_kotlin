package main.kotlin.models

import main.kotlin.models.Conta

class ContaPoupanca(
    titular: String,
    numero: Int
): Conta(
    titular,
    numero
) {
    override fun saca(valor: Double) {
        if (this.saldo >= valor) {
            this.saldo -= valor
        } else {
            println("Saldo insuficiente!")
        }
    }
}