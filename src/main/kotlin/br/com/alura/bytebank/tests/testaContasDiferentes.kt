package main.kotlin.br.com.alura.bytebank.tests

import main.kotlin.br.com.alura.bytebank.exceptions.FalhaAutenticacaoException
import main.kotlin.br.com.alura.bytebank.exceptions.SaldoInsuficienteException
import main.kotlin.br.com.alura.bytebank.models.Cliente
import main.kotlin.br.com.alura.bytebank.models.ContaCorrente
import main.kotlin.br.com.alura.bytebank.models.ContaPoupanca
import main.kotlin.br.com.alura.bytebank.models.Endereco

fun testaContasDiferentes() {
    val contaCorrente = ContaCorrente(
        titular = Cliente("Naruto", "", 7, Endereco(logradouro = "Rua do Limoeiro")),
        numero = 1000
    )
    val contaPoupanca = ContaPoupanca(
        titular = Cliente(nome = "Hinata", "", 5),
        numero = 1001
    )

    contaCorrente.deposita(1000.0)
    contaPoupanca.deposita(1000.0)

    println("saldo corrente: ${contaCorrente.saldo}")
    println("saldo poupança: ${contaPoupanca.saldo}")

    try {
        contaCorrente.saca(100.0)
        contaPoupanca.saca(100.0)
    } catch (e: SaldoInsuficienteException) {
        println("Falha ao sacar valor solicitado")
        e.printStackTrace()
    }

    println("saldo após saque corrente: ${contaCorrente.saldo}")
    println("saldo após saque poupança: ${contaPoupanca.saldo}")

    val valor = 100.0
    try {
        contaCorrente.transfere(contaPoupanca, valor, 7)
    } catch (e: SaldoInsuficienteException) {
        println("Falha ao sacar valor solicitado! Saldo em conta: ${contaCorrente.saldo}. Valor solicitado: $valor")
        e.printStackTrace()
    } catch (e: FalhaAutenticacaoException) {
        e.printStackTrace()
    }

    println("saldo corrente após tranferir para poupança: ${contaCorrente.saldo}")
    println("saldo poupança após receber transferência: ${contaPoupanca.saldo}")

    try {
        contaPoupanca.transfere(contaCorrente, 200.0, 7)
    } catch (e: FalhaAutenticacaoException) {
        e.printStackTrace()
    }

    println("saldo poupança após tranferir para corrente: ${contaPoupanca.saldo}")
    println("saldo corrente após receber transferência: ${contaCorrente.saldo}")
}