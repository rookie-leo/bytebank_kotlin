package main.kotlin

open class Conta(
    var titular: String,
    var numero: Int
) {
    open var saldo = 0.0

   open fun saca(valor: Double) {
        if (this.saldo >= valor) {
            this.saldo -= valor
        } else {
            println("Saldo insuficiente!")
        }
    }

    open fun deposita(valor: Double) {
        if (valor > 0) this.saldo += valor
        else println("Não é possivel depositar valores negativos!")
    }

    open fun transfere(conta: Conta, valor: Double) {
        if (this.saldo >= valor) {
            this.saldo -= valor
            conta.deposita(valor)
            println("Valor transferido com sucesso!")
        } else {
            println("Saldo insuficiente!")
        }
    }
}
