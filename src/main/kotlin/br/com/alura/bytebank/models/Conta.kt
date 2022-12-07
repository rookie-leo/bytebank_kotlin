package main.kotlin.br.com.alura.bytebank.models

import main.kotlin.br.com.alura.bytebank.exceptions.FalhaAutenticacaoException
import main.kotlin.br.com.alura.bytebank.exceptions.SaldoInsuficienteException


abstract class Conta(
    var titular: Cliente,
    var numero: Int
): Autenticavel {
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

    open fun transfere(conta: Conta, valor: Double, senha: Int) {
        if (!autentica(senha)) {
            throw FalhaAutenticacaoException()
        }

        if (this.saldo >= valor) {
            this.saldo -= valor
            conta.deposita(valor)
            println("Valor transferido com sucesso!")
        } else {
            throw SaldoInsuficienteException()
        }
    }

    override fun autentica(senha: Int): Boolean {
        return titular.autentica(senha)
    }
}
