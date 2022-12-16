package main.kotlin.br.com.alura.bytebank.tests

import main.kotlin.br.com.alura.bytebank.models.Cliente
import main.kotlin.br.com.alura.bytebank.models.ContaPoupanca

fun testaRun() {
    val taxaAnual = 0.05
    val taxaMensal = taxaAnual / 12

    val contaPoupanca = ContaPoupanca(
        Cliente(
            nome = "Kratos",
            cpf = "000.000.000-00",
            senha = 1234
        ),
        1000
    )

    contaPoupanca.run {
        deposita(1000.0)
        saldo * taxaMensal
    }.let { println("Rendimento mensal $it") }

    val simulacao = run {
        var saldo = contaPoupanca.saldo
        repeat(12) {
            saldo += saldo * taxaMensal
        }
        saldo
    }

    println("Simulação rendimento anual $simulacao")
}