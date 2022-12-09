package main.kotlin.br.com.alura.bytebank.tests.collections

import main.kotlin.br.com.alura.bytebank.models.BancoDeNomes
import main.kotlin.br.com.alura.bytebank.models.Cliente

fun testaCopia() {
    val banco = BancoDeNomes()
    val nomesSalvos = banco.nomes
    val cliente = Cliente("Tazuna", "75395146825", 7685)


    banco.salva(cliente.nome)
    println(banco.nomes)
    println(nomesSalvos)
    println(BancoDeNomes().nomes)
}