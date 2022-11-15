package main.kotlin

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

    contaCorrente.saca(100.0)
    contaPoupanca.saca(100.0)

    println("saldo após saque corrente: ${contaCorrente.saldo}")
    println("saldo após saque poupança: ${contaPoupanca.saldo}")

    contaCorrente.transfere(contaPoupanca, 100.0)

    println("saldo corrente após tranferir para poupança: ${contaCorrente.saldo}")
    println("saldo poupança após receber transferência: ${contaPoupanca.saldo}")

    contaPoupanca.transfere(contaCorrente, 200.0)

    println("saldo poupança após tranferir para corrente: ${contaPoupanca.saldo}")
    println("saldo corrente após receber transferência: ${contaCorrente.saldo}")
}