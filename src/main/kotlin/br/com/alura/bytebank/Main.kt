import main.kotlin.*
import main.kotlin.br.com.alura.bytebank.models.Cliente
import main.kotlin.br.com.alura.bytebank.models.ContaCorrente
import main.kotlin.br.com.alura.bytebank.models.ContaPoupanca
import main.kotlin.br.com.alura.bytebank.models.totalContas

fun main() {

    println("Bem vindo ao Bytebank")

    val cliente = Cliente(nome = "Bubble", cpf = "12345678985", senha = 3)
    val contaPoupanca = ContaPoupanca(titular = cliente, numero = 1000)
    val contaCorrente = ContaCorrente(titular = cliente, numero = 1001)

    testaContasDiferentes()

    println("Total de contas $totalContas")
}
