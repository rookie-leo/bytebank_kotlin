package main.kotlin.br.com.alura.bytebank.models

import main.kotlin.br.com.alura.bytebank.exceptions.SaldoInsuficienteException

class ContaPoupanca(
    titular: Cliente,
    numero: Int
): Conta(
    titular,
    numero
) {

    override fun saca(valor: Double) {
        if (this.saldo >= valor) {
            this.saldo -= valor
        } else {
            throw SaldoInsuficienteException()
        }
    }
}