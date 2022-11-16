package main.kotlin.br.com.alura.bytebank.models


abstract class Conta(
    var titular: Cliente,
    var numero: Int
) {
    open var saldo = 0.0
        protected set

    companion object {
        var total = 0
            private set
    }

    init {
        println("Criando conta")
        total++
    }

    abstract fun saca(valor: Double)

    open
    fun deposita(valor: Double) {
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
