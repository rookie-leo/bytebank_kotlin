package main.kotlin

abstract class Conta(
    var titular: String,
    var numero: Int
) {
    open var saldo = 0.0
        protected set

   abstract fun saca(valor: Double)

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
