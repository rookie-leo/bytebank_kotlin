package main.kotlin.br.com.alura.bytebank.models

import main.kotlin.br.com.alura.bytebank.exceptions.SaldoInsuficienteException

class ContaCorrente(
    titular: Cliente,
    numero: Int
): Conta(
    titular,
    numero
) {

    override fun saca(valor: Double) {
        val valorComTaxa = valor + 0.1
        if (this.saldo >= valorComTaxa) {
            this.saldo -= valorComTaxa
        } else {
            throw SaldoInsuficienteException()
        }
    }

    override fun deposita(valor: Double) {
        if (valor > 0) this.saldo += valor
        else println("Não é possivel depositar valores negativos!")
    }

}